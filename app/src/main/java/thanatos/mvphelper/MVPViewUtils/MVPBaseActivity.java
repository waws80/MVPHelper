package thanatos.mvphelper.MVPViewUtils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import thanatos.mvphelper.R;

/**
 * MVPBaseActivity
 */

public abstract class MVPBaseActivity<V,T extends MVPBasePresenter<V>> extends AppCompatActivity implements
        SwipeRefreshLayout.OnRefreshListener {

    @InjectView(R.id.floatingActionButton)
    FloatingActionButton floatingActionButton;
    @InjectView(R.id.mvp_network_error_layout)
    LinearLayout mNetWorkErrorLayout;
    @InjectView(R.id.mvp_network_error_icon)
    ImageView mvpNetworkErrorIcon;
    @InjectView(R.id.mvp_network_error_text)
    TextView mvpNetworkErrorText;
    @InjectView(R.id.mvp_content_layout)
    FrameLayout mvpContentLayout;
    @InjectView(R.id.mvp_swipeRefreshLayout)
    SwipeRefreshLayout mRefresh;
    private MVPProgressBar mProgressBar;

    private T mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.object_mvp);
        ButterKnife.inject(this);
        mProgressBar=new MVPProgressBar(this);
        mPresenter=createPresenter();
        if (!mPresenter.isAttch()){
            mPresenter.attchView((V) this);
        }

        init(mvpContentLayout,savedInstanceState);

    }

    public abstract void init(@Nullable FrameLayout parent,@Nullable Bundle savedInstanceState);


    protected  abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null){
            if (mPresenter.isAttch()){
                mPresenter.onDistory();
            }
        }

        mProgressBar=null;
        mRefresh=null;
    }

    @Override
    public void onRefresh() {

    }


    public void showProgressBar(boolean isShow){

        if (isShow){
            mProgressBar.show();
        }else {
            if (mProgressBar.isShowing()){
                mProgressBar.dismiss();
            }
        }
    }

    public void showNetWorkError(boolean isShow){
        if (isShow){

        }else {

        }

    }
}
