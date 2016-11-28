package thanatos.mvphelper.MVPUtils;

import org.json.JSONObject;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2016/11/28.
 */

public  abstract class MVPBasePresenter<V> {

    private WeakReference<V> mReference=null;
    public MVPIBaseModel model=null;


    public  MVPBasePresenter(V mIView){
    }

    public abstract MVPIBaseModel creatPresenter();

    public  void pull(Object ... args){
        model=creatPresenter();

    }

    public  void push(JSONObject jsonObject,String... args){
        model=creatPresenter();
    }

    public void attchView(V view){
        mReference=new WeakReference<V>(view);
    }

    public V get(){
        return mReference.get();
    }

    public boolean isAttch(){
        return mReference!=null&&mReference.get()!=null;
    }

    public void onDistory(){
        if (mReference!=null){
            mReference.clear();
            mReference=null;
            model.onDistory();
            Runtime.getRuntime().gc();
        }else {
            Runtime.getRuntime().gc();
        }
    }
}
