package a;

import android.app.Activity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile i f3413c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3414b = BrandSafetyUtils.f43552o;

    @Override // a.a
    public final synchronized i.b a(String str) {
        return super.a(this.f3414b);
    }

    @Override // a.a
    public final synchronized void c(Activity activity, String str, i.b bVar) {
        super.c(activity, this.f3414b, bVar);
    }

    @Override // a.a
    public final synchronized void d(i.b bVar, String str) {
        super.d(bVar, this.f3414b);
    }

    @Override // a.a
    public final synchronized int g(String str) {
        return super.g(this.f3414b);
    }

    @Override // a.a
    public final synchronized void h(String str) {
        super.h(this.f3414b);
    }

    public static i i() {
        if (f3413c == null) {
            synchronized (i.class) {
                if (f3413c == null) {
                    f3413c = new i();
                }
            }
        }
        return f3413c;
    }
}
