package wx.com.androidinjectmodule.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import wx.com.androidinjectmodule.AppApplication;

@Module
public class ApplicationModule {
    private final AppApplication application;

    public ApplicationModule(AppApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

//    @Provides
//    @Singleton
//    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
//        return jobExecutor;
//    }
//
//    @Provides
//    @Singleton
//    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
//        return uiThread;
//    }
//
//    @Provides
//    @Singleton
//    UserCache provideUserCache(UserCacheImpl userCache) {
//        return userCache;
//    }
//
//    @Provides
//    @Singleton
//    UserRepository provideUserRepository(UserDataRepository userDataRepository) {
//        return userDataRepository;
//    }
}

