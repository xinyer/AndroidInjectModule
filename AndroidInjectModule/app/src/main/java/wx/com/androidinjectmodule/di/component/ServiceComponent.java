package wx.com.androidinjectmodule.di.component;

import dagger.Component;
import wx.com.androidinjectmodule.di.Scopes;
import wx.com.androidinjectmodule.di.module.ServiceModule;

@Scopes.Service
@Component(dependencies = {ApplicationComponent.class}, modules = {ServiceModule.class})
public interface ServiceComponent {
//    void inject(PusherService pusherService);

//    void inject(SwipeCardService swipeCardService);

//    void inject(NetworkCheckService networkCheckService);

//    void inject(LauncherService launcherService);
}
