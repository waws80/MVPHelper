package thanatos.mvphelper.test;

import android.content.Context;
import android.widget.Toast;

import com.google.gson.Gson;

import thanatos.mvphelper.MVPUtils.MVPBasePresenter;
import thanatos.mvphelper.MVPUtils.MVPBaseView;
import thanatos.mvphelper.MVPUtils.MVPIBaseModel;
import thanatos.mvphelper.Thing;

/**
 * Created by lxf52 on 2016/11/28.
 */

public class DataPresenter extends MVPBasePresenter<MVPBaseView> {


    private MVPBaseView mIView;
    public DataPresenter(MVPBaseView mIView) {
        super(mIView);
        this.mIView=mIView;
        model=creatPresenter();

    }

    @Override
    public DataModelImpl creatPresenter() {
        return new DataModelImpl((Context) mIView,this);
    }

    @Override
    public void pull(Object... args) {
        super.pull(args);
        mIView.showProgress(true);
        model.request((int)args[0],(String)args[1], null, null);
        model.getBack(new MVPIBaseModel.CallBack() {
            @Override
            public void serviceError() {
                mIView.showProgress(false);
                Toast.makeText((Context) mIView, "服务器错误！", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void netWorkError() {
                mIView.showProgress(false);
                mIView.showNetWorkError(true);
            }

            @Override
            public void parseData(Object object) {
                Gson gson=new Gson();
                Thing thing = gson.fromJson(object.toString(), Thing.class);
                mIView.showProgress(false);
                mIView.success(thing);
            }
        });

    }
}
