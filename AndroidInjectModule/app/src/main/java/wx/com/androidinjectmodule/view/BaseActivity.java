package wx.com.androidinjectmodule.view;

import android.app.Activity;
import android.os.Bundle;

import wx.com.androidinjectmodule.AppApplication;
import wx.com.androidinjectmodule.di.ActivityModule;
import wx.com.androidinjectmodule.di.ApplicationComponent;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((AppApplication) getApplication()).getApplicationComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

}
