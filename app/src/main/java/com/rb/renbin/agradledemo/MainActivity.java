package com.rb.renbin.agradledemo;

import android.os.Bundle;
import android.view.View;

import com.renbin.router.RBArouter;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

        String baseurl =  BuildConfig.url;
    }

    public void gotoWm(View view) {
        RBArouter.getInstance().startActivity("wm");
    }

    public void gotoFood(View view) {
        RBArouter.getInstance().startActivity("food");
    }
}