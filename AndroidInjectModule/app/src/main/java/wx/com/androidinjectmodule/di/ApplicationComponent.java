package wx.com.androidinjectmodule.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import wx.com.androidinjectmodule.view.BaseActivity;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    Context context();
//    ThreadExecutor threadExecutor();
//    PostExecutionThread postExecutionThread();
//    UserRepository userRepository();
}

