package thanatos.mvphelper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by lxf52 on 2016/11/29.
 */

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.MyViewHolder> {


    private Context context;
    private List<Thing.DataBean> list;

    public MyRecycleViewAdapter(Context context,List<Thing.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(View.inflate(context, R.layout.main_rv_item, null));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Thing.DataBean thing = list.get(position);
        Picasso .with(context).load("https://www.qigeairen.com/server_api/"+thing.getPicture()).into(holder.findworkersItemPic);
        holder.findworkersItemTitle.setText(thing.getDescribe());
        holder.findworkersItemContext.setText(thing.getContent());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        @InjectView(R.id.findworkers_item_pic)
        ImageView findworkersItemPic;
        @InjectView(R.id.findworkers_item_title)
        TextView findworkersItemTitle;
        @InjectView(R.id.findworkers_item_context)
        TextView findworkersItemContext;
        @InjectView(R.id.findworkers_item_time)
        TextView findworkersItemTime;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this,itemView);
        }
    }
}
