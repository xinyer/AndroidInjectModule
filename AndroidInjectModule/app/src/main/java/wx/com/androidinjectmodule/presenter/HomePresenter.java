package wx.com.androidinjectmodule.presenter;

import android.os.Handler;

import javax.inject.Inject;

import wx.com.androidinjectmodule.util.Util;

public class HomePresenter {

    private Util util;

    private Handler handler;

    @Inject
    public HomePresenter(Util util,
                         Handler handler) {
        this.util = util;
        this.handler = handler;
    }

    public void test() {
        util.showToast("Test");
    }

    public void test2() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                util.showToast("Test2");
            }
        }, 2000);
    }
}
