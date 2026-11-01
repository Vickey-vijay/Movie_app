package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class ww {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zw f84362b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ww f84361a = new ww();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f84363c = new Object();

    public static xw a(Context context) {
        if (f84362b == null) {
            synchronized (f84363c) {
                if (f84362b == null) {
                    f84362b = yw.a(context);
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        zw zwVar = f84362b;
        if (zwVar != null) {
            return zwVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
