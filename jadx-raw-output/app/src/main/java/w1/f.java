package w1;

import android.content.Context;
import androidx.annotation.RestrictTo;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;

/* JADX INFO: compiled from: InAppPurchaseAutoLogger.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"Lw1/f;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", "d", "c", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f73276a = new f();

    public static final void d(Context context) {
        h.Companion companion;
        h hVarC;
        if (i2.a.d(f.class)) {
            return;
        }
        try {
            p.j(context, GAMConfig.KEY_CONTEXT);
            if (m.a("com.android.billingclient.api.Purchase") == null || (hVarC = (companion = h.INSTANCE).c(context)) == null || !companion.f().get()) {
                return;
            }
            if (j.d()) {
                hVarC.p("inapp", new Runnable() { // from class: w1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.e();
                    }
                });
            } else {
                hVarC.o("inapp", new Runnable() { // from class: w1.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        f.f();
                    }
                });
            }
        } catch (Throwable th2) {
            i2.a.b(th2, f.class);
        }
    }

    public static final void e() {
        if (i2.a.d(f.class)) {
            return;
        }
        try {
            f73276a.c();
        } catch (Throwable th2) {
            i2.a.b(th2, f.class);
        }
    }

    public static final void f() {
        if (i2.a.d(f.class)) {
            return;
        }
        try {
            f73276a.c();
        } catch (Throwable th2) {
            i2.a.b(th2, f.class);
        }
    }

    public final void c() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            j jVar = j.f73313a;
            h.Companion companion = h.INSTANCE;
            j.e(companion.d(), companion.e());
            companion.d().clear();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
