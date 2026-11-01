package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile uz0 f84057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f84058b = new Object();

    public static final uz0 a(Context context) {
        if (f84057a == null) {
            synchronized (f84058b) {
                if (f84057a == null) {
                    f84057a = new uz0(ug1.a(context, "YadPreferenceFile"));
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        uz0 uz0Var = f84057a;
        if (uz0Var != null) {
            return uz0Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
