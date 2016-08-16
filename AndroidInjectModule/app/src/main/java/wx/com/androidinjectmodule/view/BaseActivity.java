package wx.com.androidinjectmodule.view;

import android.app.Activity;
import android.os.Bundle;

import wx.com.androidinjectmodule.AppApplication;
import wx.com.androidinjectmodule.di.component.ActivityComponent;
import wx.com.androidinjectmodule.di.component.ApplicationComponent;
import wx.com.androidinjectmodule.di.component.DaggerActivityComponent;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((AppApplication) getApplication()).getApplicationComponent();
    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .applicationComponent(getApplicationComponent())
                .build();
    }

}
