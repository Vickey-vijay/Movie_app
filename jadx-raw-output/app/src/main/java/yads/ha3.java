package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class ha3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f78156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f78157b = new Object();

    public static void a(Context context, at1 at1Var) {
        if (f78156a) {
            return;
        }
        synchronized (f78157b) {
            if (!f78156a) {
                Object obj = dw2.f76819j;
                nt2 nt2VarA = cw2.a().a(context);
                if (nt2VarA != null && nt2VarA.f80762d0) {
                    Thread.setDefaultUncaughtExceptionHandler(new ga3(at1Var, Thread.getDefaultUncaughtExceptionHandler(), nt2VarA));
                    f78156a = true;
                }
            }
            mj.r rVar = mj.r.f64562a;
        }
    }
}
