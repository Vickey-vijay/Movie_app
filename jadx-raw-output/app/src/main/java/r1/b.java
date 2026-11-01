package r1;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import kotlin.Metadata;
import q1.t;

/* JADX INFO: compiled from: MetadataIndexer.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0002R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lr1/b;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lmj/r;", "d", "b", "e", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "c", "Z", "enabled", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f66639a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean enabled;

    public static final void b() {
        try {
            if (i2.a.d(b.class)) {
                return;
            }
            try {
                t.t().execute(new Runnable() { // from class: r1.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c();
                    }
                });
            } catch (Exception e10) {
                j0 j0Var = j0.f14425a;
                j0.d0(TAG, e10);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }

    public static final void c() {
        if (i2.a.d(b.class)) {
            return;
        }
        try {
            if (com.facebook.internal.b.INSTANCE.h(t.l())) {
                return;
            }
            f66639a.e();
            enabled = true;
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }

    @UiThread
    public static final void d(Activity activity) {
        if (i2.a.d(b.class)) {
            return;
        }
        try {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            try {
                if (enabled && !d.INSTANCE.c().isEmpty()) {
                    f.INSTANCE.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }

    public final void e() {
        String rawAamRules;
        if (i2.a.d(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
            q qVarN = FetchedAppSettingsManager.n(t.m(), false);
            if (qVarN == null || (rawAamRules = qVarN.getRawAamRules()) == null) {
                return;
            }
            d.INSTANCE.d(rawAamRules);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
