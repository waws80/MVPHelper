package thanatos.mvphelper.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;

import com.android.volley.Request;

import butterknife.ButterKnife;
import butterknife.InjectView;
import thanatos.mvphelper.MVPUtils.MVPBaseActivity;
import thanatos.mvphelper.MVPUtils.MVPBaseView;
import thanatos.mvphelper.MyRecycleViewAdapter;
import thanatos.mvphelper.R;
import thanatos.mvphelper.Thing;

public class MainActivity extends MVPBaseActivity<MVPBaseView, DataPresenter> implements MVPBaseView {

    private String url="https://www.qigeairen.com/server_api/json/share_worker.json";
    private ViewHolder holder;
    private MyRecycleViewAdapter adapter;


    @Override
    public void init(@Nullable FrameLayout parent, @Nullable Bundle savedInstanceState) {
        toolbar.setVisibility(View.GONE);
        parent.addView(View.inflate(this, R.layout.layout_main, null));
        mPresenter.pull(Request.Method.GET,url);
        holder = new ViewHolder(parent);
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        holder.recycleView.setLayoutManager(manager);
        holder.recycleView.setItemAnimator(new DefaultItemAnimator());

    }

    @Override
    protected DataPresenter createPresenter() {
        return new DataPresenter(this);
    }

    @Override
    public void showProgress(boolean isShow) {
              showProgressBar(isShow);
    }

    @Override
    public void showNetWorkError(boolean isShow) {
        if (mRefresh.isRefreshing())mRefresh.setRefreshing(false);
        netWorkError(isShow);
    }

    @Override
    public void showNoData(boolean isShow) {
        if (mRefresh.isRefreshing())mRefresh.setRefreshing(false);

    }

    @Override
    public void success(Object object) {
        if (mRefresh.isRefreshing())mRefresh.setRefreshing(false);
        Thing t= (Thing) object;
        adapter=new MyRecycleViewAdapter(this,t.getData());
        holder.recycleView.setAdapter(adapter);
        mRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mRefresh.setRefreshing(true);
                mPresenter.pull(Request.Method.GET,url);
            }
        });
    }

    static class ViewHolder {
        @InjectView(R.id.recycleView)
        RecyclerView recycleView;

        ViewHolder(View view) {
            ButterKnife.inject(this, view);
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
