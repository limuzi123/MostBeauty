package com.lanou3g.mostbeauty.fragment.haveThingsFragments;

import android.os.Bundle;

import com.lanou3g.mostbeauty.R;
import com.lanou3g.mostbeauty.base.BaseFragment;

/**
 * Created by dllo on 16/8/30.
 */
public class HaveFragment extends BaseFragment{
    @Override
    protected int initLayout() {
        return R.layout.fragment_have_have;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
    public static HaveFragment newInstance(int position){
        Bundle args = new Bundle();
        args.putInt("position",position);
        HaveFragment fragment = new HaveFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
