package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class dp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f76765c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile dp0 f76766d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo0 f76767a = new zo0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vy2 f76768b;

    public final nr a(Context context) {
        vy2 vy2VarA;
        synchronized (f76765c) {
            vy2VarA = this.f76768b;
            if (vy2VarA == null) {
                vy2VarA = this.f76767a.a(context);
                this.f76768b = vy2VarA;
            }
        }
        return vy2VarA;
    }
}
