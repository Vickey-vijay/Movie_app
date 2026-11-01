package a;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile f f3407c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3408b = "native";

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3408b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3408b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3408b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3408b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3408b);
    }

    public static f i() {
        if (f3407c == null) {
            synchronized (f.class) {
                if (f3407c == null) {
                    f3407c = new f();
                }
            }
        }
        return f3407c;
    }
}
