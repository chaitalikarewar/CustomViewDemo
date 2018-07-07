package com.example.felix_its.customeviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class ImageSliderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider_and_alert_dialog_box);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this);
        mViewPager.setAdapter(adapterView);
    }
}
