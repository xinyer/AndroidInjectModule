package wx.com.androidinjectmodule.di.component;

import android.content.Context;
import android.os.Handler;

import javax.inject.Singleton;

import dagger.Component;
import wx.com.androidinjectmodule.AppApplication;
import wx.com.androidinjectmodule.di.module.ApplicationModule;
import wx.com.androidinjectmodule.util.Util;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(AppApplication appApplication);

    Context context();

    Handler handler();

    Util util();
    
}

