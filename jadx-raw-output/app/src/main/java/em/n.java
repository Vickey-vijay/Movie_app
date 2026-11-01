package em;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.Window;

/* JADX INFO: compiled from: StatusBarUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class n {
    @TargetApi(19)
    public static void a(Activity activity) {
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }
}
