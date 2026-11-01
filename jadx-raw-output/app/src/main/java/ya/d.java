package ya;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: ManagerRetriever.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f75339b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile b f75340a;

    public static d d() {
        return f75339b;
    }

    public b b(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a save or read on a null Context");
        }
        if (!(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return c((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return a((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return b(((ContextWrapper) context).getBaseContext());
            }
        }
        return e(context);
    }

    public final b e(Context context) {
        if (this.f75340a == null) {
            synchronized (this) {
                if (this.f75340a == null) {
                    this.f75340a = new b(context.getApplicationContext());
                }
            }
        }
        return this.f75340a;
    }

    public b a(Activity activity) {
        return b(activity.getApplicationContext());
    }

    public b c(FragmentActivity fragmentActivity) {
        return b(fragmentActivity.getApplicationContext());
    }
}
