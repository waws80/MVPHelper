package thanatos.mvphelper.MVPViewUtils;

/**
 * Created by Administrator on 2016/11/28.
 */

public interface MVPBaseView {
    void showProgress(boolean isShow);

    void showNetWorkError(boolean isShow);

    void showNoData(boolean isShow);

    void success(Object object);
}
