package wx.com.androidinjectmodule.util;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

public class Util {

    private Context context;

    @Inject
    public Util(Context context) {
        this.context = context;
    }

    public void showToast(String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
