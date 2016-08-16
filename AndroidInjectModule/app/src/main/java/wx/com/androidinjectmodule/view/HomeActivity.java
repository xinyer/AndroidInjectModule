package wx.com.androidinjectmodule.view;

import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;

import wx.com.androidinjectmodule.R;
import wx.com.androidinjectmodule.presenter.HomePresenter;

public class HomeActivity extends BaseActivity {

    @Inject
    HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivityComponent().inject(this);
        setContentView(R.layout.activity_home);

        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.test();
            }
        });

        findViewById(R.id.btn_test2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.test2();
            }
        });
    }
}
