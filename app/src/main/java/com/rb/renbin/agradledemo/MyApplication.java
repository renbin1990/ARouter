package com.rb.renbin.agradledemo;

import android.app.Application;

import com.renbin.food.FoodActivity;
import com.renbin.router.RBArouter;
import com.renbin.wm.WmActivity;

/**
 * data:2021-08-17
 * Author:renbin
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RBArouter.getInstance().init(this);
        RBArouter.getInstance().register("food", FoodActivity.class);
        RBArouter.getInstance().register("wm", WmActivity.class);
    }
}
