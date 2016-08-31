package com.lanou3g.mostbeauty.activity;

import android.app.DatePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import com.lanou3g.mostbeauty.R;
import com.lanou3g.mostbeauty.base.BaseActivity;

import java.util.Calendar;

/**
 * Created by dllo on 16/8/30.
 */
/*
编辑资料
 */
public class MaterialActivity extends BaseActivity implements View.OnClickListener {
    private ImageView imageViewBackMaterial;
    private TextView textViewBrithday;
    private int mYear, mMoth, mDay;

    @Override
    protected int getLayout() {
        return R.layout.material_activity;
    }

    @Override
    protected void initView() {
        imageViewBackMaterial = (ImageView) findViewById(R.id.image_back_material);
        textViewBrithday = (TextView) findViewById(R.id.text_view_birthday);
        imageViewBackMaterial.setOnClickListener(this);
        textViewBrithday.setOnClickListener(this);
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
            case R.id.text_view_birthday:
                showDatePickerDialog();
                break;
        }
    }

    public void showDatePickerDialog() {
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMoth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        textViewBrithday.setText(year + "-" + (monthOfYear + 1) + "-" + dayOfMonth);
                    }
                }, mYear, mMoth, mDay);
        datePickerDialog.show();
    }
}
