package a;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile g f3409c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3410b = "ThirdBanner";

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3410b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3410b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3410b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3410b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3410b);
    }

    public static g i() {
        if (f3409c == null) {
            synchronized (g.class) {
                if (f3409c == null) {
                    f3409c = new g();
                }
            }
        }
        return f3409c;
    }
}
