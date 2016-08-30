package com.lanou3g.mostbeauty.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lanou3g.mostbeauty.Bean.PictorialBean;
import com.lanou3g.mostbeauty.R;
import com.wirelesspienetwork.overview.model.OverviewAdapter;
import com.wirelesspienetwork.overview.model.ViewHolder;

import java.util.List;

/**
 * Created by dllo on 16/8/30.
 */
public class PictrialFragmentAdapter extends OverviewAdapter<PictrialFragmentAdapter.NetViewHolder,Integer> {
    @Override
    public NetViewHolder onCreateViewHolder(Context context, ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindViewHolder(NetViewHolder netViewHolder) {

    }

    @Override
    public int getNumberOfItems() {
        return 0;
    }

    class NetViewHolder extends ViewHolder {
       public NetViewHolder(View view) {
           super(view);
       }
   }

}

