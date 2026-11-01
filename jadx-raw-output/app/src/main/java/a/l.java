package a;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile l f3419c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3420b = "reward";

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3420b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3420b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3420b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3420b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3420b);
    }

    public static l i() {
        if (f3419c == null) {
            synchronized (l.class) {
                if (f3419c == null) {
                    f3419c = new l();
                }
            }
        }
        return f3419c;
    }
}
