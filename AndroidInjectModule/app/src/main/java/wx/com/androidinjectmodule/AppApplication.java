package wx.com.androidinjectmodule;

import android.app.Application;

import wx.com.androidinjectmodule.di.component.ApplicationComponent;
import wx.com.androidinjectmodule.di.component.DaggerApplicationComponent;
import wx.com.androidinjectmodule.di.module.ApplicationModule;

public class AppApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }

}
