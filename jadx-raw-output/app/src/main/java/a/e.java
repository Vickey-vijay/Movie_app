package a;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile e f3405c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3406b = "banner";

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3406b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3406b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3406b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3406b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3406b);
    }

    public static e i() {
        if (f3405c == null) {
            synchronized (e.class) {
                if (f3405c == null) {
                    f3405c = new e();
                }
            }
        }
        return f3405c;
    }
}
