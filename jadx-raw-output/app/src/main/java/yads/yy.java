package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class yy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ yy f85143a = new yy();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f85144b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile cz f85145c;

    public static zy a(Context context) {
        if (f85145c == null) {
            synchronized (f85144b) {
                if (f85145c == null) {
                    f85145c = new cz(ug1.a(context, "YadPreferenceFile"), new dn0(), new u7(), new p33());
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        cz czVar = f85145c;
        if (czVar != null) {
            return czVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
