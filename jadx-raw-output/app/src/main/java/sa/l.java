package sa;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: ImageLoaderUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f67172a = new l();

    public final boolean b(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static final boolean a(Context context) {
        if (context instanceof Activity) {
            return !f67172a.b((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                Context baseContext = contextWrapper.getBaseContext();
                ck.p.h(baseContext, "null cannot be cast to non-null type android.app.Activity");
                return !f67172a.b((Activity) baseContext);
            }
        }
        return true;
    }
}
