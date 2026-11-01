package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public abstract class y01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f84782a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile xy0 f84783b;

    public static final xy0 a(Context context) {
        if (f84783b == null) {
            synchronized (f84782a) {
                if (f84783b == null) {
                    f84783b = new xy0(context, "com.huawei.hms.location.LocationServices");
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        xy0 xy0Var = f84783b;
        if (xy0Var != null) {
            return xy0Var;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
