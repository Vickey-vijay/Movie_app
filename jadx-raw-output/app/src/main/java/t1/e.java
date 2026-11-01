package t1;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import ck.w;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: CodelessManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'¨\u0006+"}, d2 = {"Lt1/e;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lmj/r;", "l", CampaignEx.JSON_KEY_AD_K, "j", InneractiveMediationDefs.GENDER_FEMALE, "e", "", "g", "()Ljava/lang/String;", "", "h", "()Z", "appIndexingEnabled", "n", "(Z)V", "applicationId", "c", "i", "Lt1/m;", "b", "Lt1/m;", "viewIndexingTrigger", "Landroid/hardware/SensorManager;", "Landroid/hardware/SensorManager;", "sensorManager", "Lt1/l;", "d", "Lt1/l;", "viewIndexer", "Ljava/lang/String;", "deviceSessionID", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCodelessEnabled", "isAppIndexingEnabled", "Z", "isCheckingSession", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static SensorManager sensorManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static l viewIndexer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static String deviceSessionID;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean isCheckingSession;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f72123a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final m viewIndexingTrigger = new m();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean isCodelessEnabled = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean isAppIndexingEnabled = new AtomicBoolean(false);

    public final boolean i() {
        i2.a.d(this);
        return false;
    }

    public static final void d(String str) {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            com.facebook.internal.b bVarE = com.facebook.internal.b.INSTANCE.e(t.l());
            JSONArray jSONArray = new JSONArray();
            String str2 = Build.MODEL;
            if (str2 == null) {
                str2 = "";
            }
            jSONArray.put(str2);
            if ((bVarE == null ? null : bVarE.h()) != null) {
                jSONArray.put(bVarE.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            jSONArray.put(y1.g.f() ? "1" : "0");
            Locale localeY = j0.y();
            jSONArray.put(localeY.getLanguage() + '_' + ((Object) localeY.getCountry()));
            String string = jSONArray.toString();
            p.i(string, "extInfoArray.toString()");
            bundle.putString("device_session_id", g());
            bundle.putString("extinfo", string);
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            w wVar = w.f6066a;
            boolean z10 = true;
            String str3 = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            p.i(str3, "java.lang.String.format(locale, format, *args)");
            JSONObject graphObject = companion.B(null, str3, bundle, null).k().getGraphObject();
            AtomicBoolean atomicBoolean = isAppIndexingEnabled;
            if (graphObject == null || !graphObject.optBoolean("is_app_indexing_enabled", false)) {
                z10 = false;
            }
            atomicBoolean.set(z10);
            if (atomicBoolean.get()) {
                l lVar = viewIndexer;
                if (lVar != null) {
                    lVar.h();
                }
            } else {
                deviceSessionID = null;
            }
            isCheckingSession = false;
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final void e() {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(false);
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final void f() {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            isCodelessEnabled.set(true);
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final String g() {
        if (i2.a.d(e.class)) {
            return null;
        }
        try {
            if (deviceSessionID == null) {
                deviceSessionID = UUID.randomUUID().toString();
            }
            String str = deviceSessionID;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return null;
        }
    }

    public static final boolean h() {
        if (i2.a.d(e.class)) {
            return false;
        }
        try {
            return isAppIndexingEnabled.get();
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return false;
        }
    }

    public static final void j(Activity activity) {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            g.INSTANCE.a().f(activity);
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final void k(Activity activity) {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (isCodelessEnabled.get()) {
                g.INSTANCE.a().h(activity);
                l lVar = viewIndexer;
                if (lVar != null) {
                    lVar.l();
                }
                SensorManager sensorManager2 = sensorManager;
                if (sensorManager2 == null) {
                    return;
                }
                sensorManager2.unregisterListener(viewIndexingTrigger);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final void l(Activity activity) {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (isCodelessEnabled.get()) {
                g.INSTANCE.a().e(activity);
                Context applicationContext = activity.getApplicationContext();
                final String strM = t.m();
                final q qVarF = FetchedAppSettingsManager.f(strM);
                if (p.e(qVarF == null ? null : Boolean.valueOf(qVarF.getCodelessEventsEnabled()), Boolean.TRUE) || f72123a.i()) {
                    SensorManager sensorManager2 = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager2 == null) {
                        return;
                    }
                    sensorManager = sensorManager2;
                    Sensor defaultSensor = sensorManager2.getDefaultSensor(1);
                    l lVar = new l(activity);
                    viewIndexer = lVar;
                    m mVar = viewIndexingTrigger;
                    mVar.a(new m.b() { // from class: t1.c
                        @Override // t1.m.b
                        public final void a() {
                            e.m(qVarF, strM);
                        }
                    });
                    sensorManager2.registerListener(mVar, defaultSensor, 2);
                    if (qVarF != null && qVarF.getCodelessEventsEnabled()) {
                        lVar.h();
                    }
                }
                e eVar = f72123a;
                if (!eVar.i() || isAppIndexingEnabled.get()) {
                    return;
                }
                eVar.c(strM);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final void m(q qVar, String str) {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            p.j(str, "$appId");
            boolean z10 = qVar != null && qVar.getCodelessEventsEnabled();
            boolean z11 = t.s();
            if (z10 && z11) {
                f72123a.c(str);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final void n(boolean appIndexingEnabled) {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            isAppIndexingEnabled.set(appIndexingEnabled);
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public final void c(final String str) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (isCheckingSession) {
                return;
            }
            isCheckingSession = true;
            t.t().execute(new Runnable() { // from class: t1.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.d(str);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
