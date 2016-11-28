package thanatos.mvphelper.MVPUtils;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.lang.ref.WeakReference;
import java.util.Map;

import thanatos.mvphelper.VollyUtils.CustomJsonObjectRequest;

/**
 * Created by lxf52 on 2016/11/28.
 */

public abstract class MVPIBaseModel<T> {
    private RequestQueue queue=null;


    private WeakReference<T> mReference=null;

    private Context context;

    private CallBack callBack;

    public MVPIBaseModel (Context context,T mPresenter){
        this.context=context;
        mReference=new WeakReference<T>(mPresenter);
    }

    public T get(){
        return  mReference.get();
    }



    public  void request(int method,String url,JSONObject jsonRequest,Map<String,String> map){
        attch(method,url,jsonRequest,map);

    }

    private void attch(int method, String url, @Nullable JSONObject jsonRequest,
                       @Nullable final Map<String,String> map){
        Log.w("thanatos", "attch: "+url );
        queue= Volley.newRequestQueue(context);
        CustomJsonObjectRequest request=new CustomJsonObjectRequest(method, url, jsonRequest, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject jsonObject) {
                    callBack.parseData(jsonObject);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                 if (volleyError.toString().contains("ServerError")){
                     callBack.serviceError();

                 }else if (volleyError.toString().contains("NetworkError")){
                     callBack.netWorkError();
                 }
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                if (map!=null){
                    return map;
                }else {
                    return super.getHeaders();
                }

            }
        };

        queue.add(request);

    }

    public void getBack(CallBack callBack){
            this.callBack=callBack;
    }

    public interface CallBack{
        void serviceError();
        void netWorkError();
        void parseData(Object object);
    }


    public  void onDistory(){

            if (mReference!=null){
                mReference.clear();
                mReference=null;
                Runtime.getRuntime().gc();
            }


    }

}
