package com.lanou3g.mostbeauty.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.lanou3g.mostbeauty.R;
import com.lanou3g.mostbeauty.base.BaseFragment;

/**
 * Created by dllo on 16/8/30.
 */
public class HaveThingsFragment extends BaseFragment{
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected int initLayout() {
        return R.layout.fragment_havethings;
    }

    @Override
    protected void initView() {
        tabLayout= (TabLayout) getActivity().findViewById(R.id.haveThings_tl);
        viewPager= (ViewPager) getActivity().findViewById(R.id.haveThings_vp);
    }

    @Override
    protected void initData() {

    }
}
