package thanatos.mvphelper.test;

import android.content.Context;

import org.json.JSONObject;

import java.util.Map;

import thanatos.mvphelper.MVPUtils.MVPIBaseModel;

/**
 * Created by lxf52 on 2016/11/28.
 */

public class DataModelImpl extends MVPIBaseModel<DataPresenter> {
    public DataModelImpl(Context context, DataPresenter mPresenter) {
        super(context, mPresenter);
    }

    @Override
    public void request(int method, String url, JSONObject jsonRequest, Map<String, String> map) {
        super.request(method, url, jsonRequest, map);

    }


}
