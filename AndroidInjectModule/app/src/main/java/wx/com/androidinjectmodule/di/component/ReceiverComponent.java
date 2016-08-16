package wx.com.androidinjectmodule.di.component;

import dagger.Component;
import wx.com.androidinjectmodule.di.Scopes;
import wx.com.androidinjectmodule.di.module.ReceiverModule;

@Scopes.Receiver
@Component(dependencies = ApplicationComponent.class, modules = {ReceiverModule.class})
public interface ReceiverComponent {

//    void inject(PusherReceiver receiver);

//    void inject(MessageReceiver receiver);

//    void inject(AppStatusChangeReceiver appStatusChangeReceiver);

//    void inject(DIOReceiver receiver);
}
