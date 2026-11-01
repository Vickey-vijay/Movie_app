package w1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.RestrictTo;
import ck.p;
import com.facebook.internal.FeatureManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import lk.a0;
import q1.t;

/* JADX INFO: compiled from: InAppPurchaseManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\b¨\u0006\f"}, d2 = {"Lw1/k;", "", "Lmj/r;", "a", "b", "", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f73317a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    public static final void a() {
        if (i2.a.d(k.class)) {
            return;
        }
        try {
            enabled.set(true);
            b();
        } catch (Throwable th2) {
            i2.a.b(th2, k.class);
        }
    }

    public static final void b() {
        if (i2.a.d(k.class)) {
            return;
        }
        try {
            if (enabled.get()) {
                if (f73317a.c()) {
                    FeatureManager featureManager = FeatureManager.f14322a;
                    if (FeatureManager.g(FeatureManager.Feature.IapLoggingLib2)) {
                        f fVar = f.f73276a;
                        f.d(t.l());
                        return;
                    }
                }
                a.g();
            }
        } catch (Throwable th2) {
            i2.a.b(th2, k.class);
        }
    }

    public final boolean c() {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            Context contextL = t.l();
            ApplicationInfo applicationInfo = contextL.getPackageManager().getApplicationInfo(contextL.getPackageName(), 128);
            p.i(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null || Integer.parseInt((String) a0.N0(string, new String[]{"."}, false, 3, 2, null).get(0)) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }
}
