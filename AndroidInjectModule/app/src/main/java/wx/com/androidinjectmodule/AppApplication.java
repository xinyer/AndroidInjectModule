package wx.com.androidinjectmodule;

import android.app.Application;

import wx.com.androidinjectmodule.di.ApplicationComponent;
import wx.com.androidinjectmodule.di.ApplicationModule;
import wx.com.androidinjectmodule.di.DaggerApplicationComponent;

public class AppApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override public void onCreate() {
        super.onCreate();
        this.initializeInjector();
    }

    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

}
