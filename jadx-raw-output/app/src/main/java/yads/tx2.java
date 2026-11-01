package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class tx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ tx2 f83236a = new tx2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f83237b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile vx2 f83238c;

    public static ux2 a(Context context) {
        vx2 vx2Var;
        vx2 vx2Var2 = f83238c;
        if (vx2Var2 != null) {
            return vx2Var2;
        }
        synchronized (f83237b) {
            vx2Var = f83238c;
            if (vx2Var == null) {
                vx2Var = new vx2(ug1.a(context, "YadPreferenceFile"));
                f83238c = vx2Var;
            }
        }
        return vx2Var;
    }
}
