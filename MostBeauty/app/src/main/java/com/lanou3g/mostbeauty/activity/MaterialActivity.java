package com.lanou3g.mostbeauty.activity;

import android.view.View;
import android.widget.ImageView;

import com.lanou3g.mostbeauty.R;
import com.lanou3g.mostbeauty.base.BaseActivity;

/**
 * Created by dllo on 16/8/30.
 */
/*
编辑资料
 */
public class MaterialActivity extends BaseActivity implements View.OnClickListener{
    private ImageView imageViewBackMaterial;
    @Override
    protected int getLayout() {
        return R.layout.material_activity;
    }

    @Override
    protected void initView() {
     imageViewBackMaterial = (ImageView) findViewById(R.id.image_back_material);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image_back_material:
                finish();
                break;
        }
    }
}
