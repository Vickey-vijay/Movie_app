package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uz {
    public static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    public static final ta2 b(Context context) {
        int i10 = context.getResources().getConfiguration().orientation;
        if (i10 != 1) {
            if (i10 != 2) {
                return ta2.f82946e;
            }
            return ta2.f82944c;
        }
        return ta2.f82945d;
    }
}
