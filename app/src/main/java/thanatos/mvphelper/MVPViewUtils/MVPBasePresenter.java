package thanatos.mvphelper.MVPViewUtils;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2016/11/28.
 */

public class MVPBasePresenter<V> {

    private WeakReference<V> mReference=null;

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
            Runtime.getRuntime().gc();
        }else {
            Runtime.getRuntime().gc();
        }
    }
}
