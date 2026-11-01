package yads;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ub {
    public static final boolean a(Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static final boolean a(int i10) {
        return Build.VERSION.SDK_INT >= i10;
    }
}
