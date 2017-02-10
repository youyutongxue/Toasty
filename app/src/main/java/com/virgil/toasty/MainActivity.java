package com.virgil.toasty;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_error_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastCustomUtils.showErrorToast(MainActivity.this, "This is an error toast.");
            }
        });
        findViewById(R.id.button_success_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastCustomUtils.showSuccessToast(MainActivity.this, "Success！");
            }
        });
        findViewById(R.id.button_info_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastCustomUtils.showInfoToast(MainActivity.this, "Here is some info for you.");
            }
        });
        findViewById(R.id.button_warning_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastCustomUtils.showWarningToast(MainActivity.this, "Beware of the dog.");
            }
        });
        findViewById(R.id.button_normal_toast_wo_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastCustomUtils.showNormalToast(MainActivity.this, "Normal toast w/o icon");
            }
        });
        findViewById(R.id.button_normal_toast_w_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable icon = getResources().getDrawable(R.drawable.ic_pets_white_48dp);
                ToastCustomUtils.showNormalIconToast(MainActivity.this, "Normal toast w/ icon", icon);
            }
        });
    }
}
