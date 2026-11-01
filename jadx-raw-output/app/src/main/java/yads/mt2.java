package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f80388a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f80389b;

    public static boolean a(Context context) {
        boolean zBooleanValue;
        Boolean bool = f80389b;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (f80388a) {
            Boolean bool2 = f80389b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                Object obj = dw2.f76819j;
                nt2 nt2VarA = cw2.a().a(context);
                boolean z10 = true;
                if (nt2VarA == null || !nt2VarA.I0) {
                    z10 = false;
                }
                f80389b = Boolean.valueOf(z10);
                zBooleanValue = z10;
            }
        }
        return zBooleanValue;
    }
}
