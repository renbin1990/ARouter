package com.renbin.router;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;

import java.util.HashMap;
import java.util.Map;

/**
 * data:2021-08-17
 * Author:renbin
 */
public class RBArouter {
    private static RBArouter mInstance;
    //map集合收集activity信息
    private static Map<String,Class<? extends Activity>> routers = new HashMap<>();
    private static Context context;

    public RBArouter() {

    }

    //Application初始化
    public void init(Application application){
        context = application;
    }

    public void register(String path,Class<? extends Activity> clazz){
        routers.put(path,clazz);
    }

    public static RBArouter getInstance(){
        if (mInstance== null){
            synchronized (RBArouter.class){
                mInstance = new RBArouter();
            }
        }
        return mInstance;
    }

    //跳转
    public void startActivity(String path){
        Class<? extends Activity> clazz =  routers.get(path);
        if (clazz == null){
            return;
        }
        Intent intent = new Intent(context,clazz);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
        context.startActivity(intent);
    }
}
