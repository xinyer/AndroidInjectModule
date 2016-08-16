package wx.com.androidinjectmodule.di.component;

import dagger.Component;
import wx.com.androidinjectmodule.di.Scopes;
import wx.com.androidinjectmodule.di.module.ActivityModule;
import wx.com.androidinjectmodule.view.HomeActivity;

@Scopes.Activity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(HomeActivity activity);
}