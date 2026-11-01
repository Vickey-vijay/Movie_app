package a;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile k f3417c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3418b = "interstitial";

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3418b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3418b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3418b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3418b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3418b);
    }

    public static k i() {
        if (f3417c == null) {
            synchronized (k.class) {
                if (f3417c == null) {
                    f3417c = new k();
                }
            }
        }
        return f3417c;
    }
}
