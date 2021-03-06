package com.lanou3g.mostbeauty.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lanou3g.mostbeauty.Bean.PictorialBean;
import com.lanou3g.mostbeauty.R;
import com.wirelesspienetwork.overview.model.OverviewAdapter;
import com.wirelesspienetwork.overview.model.ViewHolder;

import java.util.List;

/**
 * Created by dllo on 16/8/30.
 */
public class PictrialFragmentAdapter extends OverviewAdapter<PictrialFragmentAdapter.NetViewHolder,Integer> {
    private Context context;
    private PictorialBean bean;

    public void setBean(PictorialBean bean) {
        this.bean = bean;

    }

    public PictrialFragmentAdapter(Context context) {
        this.context = context;
    }

    public PictrialFragmentAdapter(List<Integer> integers, Context context) {
        super(integers);
        this.context = context;
    }

    @Override
    public NetViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        View v = View.inflate(context, R.layout.recents_dummy, null);


        return new NetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NetViewHolder netViewHolder) {
        netViewHolder.itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(context,NewActivity.class);
//                Log.d("OverviewActivity", "ccccccccc"+intent);
//                context.startActivity(intent);
            }
        });
        netViewHolder.tvName.setText(bean.getData().getArticles().get(bean.getData().getArticles().size()-netViewHolder.getPosition()-1).getSub_title());
        netViewHolder.tvTitle.setText(bean.getData().getArticles().get(bean.getData().getArticles().size()-netViewHolder.getPosition()-1).getTitle());
        Glide.with(context).load(bean.getData().getArticles()
                .get(bean.getData().getArticles().size()-netViewHolder.getPosition()-1).getImage_url())
                .into(netViewHolder.imageView);

    }

    @Override
    public int getNumberOfItems() {
        return bean.getData().getArticles().size();
    }

    class NetViewHolder extends ViewHolder {
        private TextView tvTitle,tvName;
        private ImageView imageView;
        public NetViewHolder(View view) {
            super(view);
            tvName = (TextView) view.findViewById(R.id.tv_view);
            tvTitle = (TextView) view.findViewById(R.id.tv_title);
            imageView = (ImageView) view.findViewById(R.id.image);
        }
    }

}

