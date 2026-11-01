package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class dy2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile fy2 f76848b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ dy2 f76847a = new dy2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f76849c = new Object();

    public static ey2 a(Context context) {
        if (f76848b == null) {
            synchronized (f76849c) {
                if (f76848b == null) {
                    f76848b = new fy2(ug1.a(context, "YadPreferenceFile"));
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        fy2 fy2Var = f76848b;
        if (fy2Var != null) {
            return fy2Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
