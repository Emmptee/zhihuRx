package com.emtee.zhihurx;

import android.app.Application;
import android.nfc.Tag;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.stetho.Stetho;
import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;


/**
 * Created by shidongfang on 2018/3/9.
 */

public class ZhihuApplication extends Application {
    private static final String TAG = "ZhihuApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init(TAG);
        Stetho.initialize(Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build());
        LeakCanary.install(this);
        Fresco.initialize(this);
    }
}
