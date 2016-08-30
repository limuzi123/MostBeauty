package com.lanou3g.mostbeauty.fragment;

<<<<<<< HEAD
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
=======
import android.view.View;
>>>>>>> 1ed1e3d91e4e34445431c046c57fdbd5e9b9329d

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
<<<<<<< HEAD
    protected void initView() {
        tabLayout= (TabLayout) getActivity().findViewById(R.id.haveThings_tl);
        viewPager= (ViewPager) getActivity().findViewById(R.id.haveThings_vp);
=======
    protected void initView(View view) {

>>>>>>> 1ed1e3d91e4e34445431c046c57fdbd5e9b9329d
    }

    @Override
    protected void initData() {

    }
}
