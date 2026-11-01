package o8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: ActivityCompatHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static boolean c(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static boolean a(Context context) {
        if (context instanceof Activity) {
            return !c((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                return !c((Activity) contextWrapper.getBaseContext());
            }
        }
        return true;
    }

    public static boolean b(FragmentActivity fragmentActivity, String str) {
        if (c(fragmentActivity) || fragmentActivity.getSupportFragmentManager().findFragmentByTag(str) != null) {
            return false;
        }
        return true;
    }
}
