package y1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.a0;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import mj.r;
import q1.t;

/* JADX INFO: compiled from: ActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b=\u0010>J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0015R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00105R\u001e\u00109\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00108R\u0014\u0010<\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006?"}, d2 = {"Ly1/f;", "", "Landroid/app/Application;", "application", "", "appId", "Lmj/r;", VastAttributes.HORIZONTAL_POSITION, "", "o", "Ljava/util/UUID;", InneractiveMediationDefs.GENDER_MALE, "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "p", "v", "l", "s", "r", CampaignEx.JSON_KEY_AD_K, "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "c", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledFuture;", "d", "Ljava/util/concurrent/ScheduledFuture;", "currentFuture", "e", "Ljava/lang/Object;", "currentFutureLock", "Ljava/util/concurrent/atomic/AtomicInteger;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/concurrent/atomic/AtomicInteger;", "foregroundActivityCount", "Ly1/l;", "g", "Ly1/l;", "currentSession", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tracking", "i", "", "j", "J", "currentActivityAppearTime", "", "I", "activityReferences", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "currActivity", "n", "()I", "sessionTimeoutInSeconds", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f75202a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final ScheduledExecutorService singleThreadExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static volatile ScheduledFuture<?> currentFuture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Object currentFutureLock;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final AtomicInteger foregroundActivityCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static volatile l currentSession;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean tracking;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static String appId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static long currentActivityAppearTime;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static int activityReferences;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static WeakReference<Activity> currActivity;

    /* JADX INFO: compiled from: ActivityLifecycleTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"y1/f$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/os/Bundle;", "savedInstanceState", "Lmj/r;", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, f.TAG, "onActivityCreated");
            g.a();
            f.p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, f.TAG, "onActivityDestroyed");
            f.f75202a.r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, f.TAG, "onActivityPaused");
            g.a();
            f.f75202a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, f.TAG, "onActivityResumed");
            g.a();
            f.v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            p.j(bundle, "outState");
            a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, f.TAG, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            f.activityReferences++;
            a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, f.TAG, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, f.TAG, "onActivityStopped");
            AppEventsLogger.INSTANCE.h();
            f.activityReferences--;
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        TAG = canonicalName;
        singleThreadExecutor = Executors.newSingleThreadScheduledExecutor();
        currentFutureLock = new Object();
        foregroundActivityCount = new AtomicInteger(0);
        tracking = new AtomicBoolean(false);
    }

    public static final Activity l() {
        WeakReference<Activity> weakReference = currActivity;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final UUID m() {
        l lVar;
        if (currentSession == null || (lVar = currentSession) == null) {
            return null;
        }
        return lVar.getCom.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY java.lang.String();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean o() {
        return activityReferences == 0;
    }

    public static final void p(Activity activity) {
        singleThreadExecutor.execute(new Runnable() { // from class: y1.d
            @Override // java.lang.Runnable
            public final void run() {
                f.q();
            }
        });
    }

    public static final void q() {
        if (currentSession == null) {
            currentSession = l.INSTANCE.b();
        }
    }

    public static final void t(final long j10, final String str) {
        p.j(str, "$activityName");
        if (currentSession == null) {
            currentSession = new l(Long.valueOf(j10), null, null, 4, null);
        }
        l lVar = currentSession;
        if (lVar != null) {
            lVar.k(Long.valueOf(j10));
        }
        if (foregroundActivityCount.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: y1.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.u(j10, str);
                }
            };
            synchronized (currentFutureLock) {
                currentFuture = singleThreadExecutor.schedule(runnable, f75202a.n(), TimeUnit.SECONDS);
                r rVar = r.f64562a;
            }
        }
        long j11 = currentActivityAppearTime;
        h.e(str, j11 > 0 ? (j10 - j11) / ((long) 1000) : 0L);
        l lVar2 = currentSession;
        if (lVar2 == null) {
            return;
        }
        lVar2.m();
    }

    public static final void u(long j10, String str) {
        p.j(str, "$activityName");
        if (currentSession == null) {
            currentSession = new l(Long.valueOf(j10), null, null, 4, null);
        }
        if (foregroundActivityCount.get() <= 0) {
            m mVar = m.f75239a;
            m.e(str, currentSession, appId);
            l.INSTANCE.a();
            currentSession = null;
        }
        synchronized (currentFutureLock) {
            currentFuture = null;
            r rVar = r.f64562a;
        }
    }

    public static final void v(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        currActivity = new WeakReference<>(activity);
        foregroundActivityCount.incrementAndGet();
        f75202a.k();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        currentActivityAppearTime = jCurrentTimeMillis;
        final String strT = j0.t(activity);
        t1.e.l(activity);
        r1.b.d(activity);
        c2.e.h(activity);
        w1.k.b();
        final Context applicationContext = activity.getApplicationContext();
        singleThreadExecutor.execute(new Runnable() { // from class: y1.c
            @Override // java.lang.Runnable
            public final void run() {
                f.w(jCurrentTimeMillis, strT, applicationContext);
            }
        });
    }

    public static final void w(long j10, String str, Context context) {
        l lVar;
        p.j(str, "$activityName");
        l lVar2 = currentSession;
        Long lE = lVar2 == null ? null : lVar2.getSessionLastEventTime();
        if (currentSession == null) {
            currentSession = new l(Long.valueOf(j10), null, null, 4, null);
            m mVar = m.f75239a;
            String str2 = appId;
            p.i(context, "appContext");
            m.c(str, null, str2, context);
        } else if (lE != null) {
            long jLongValue = j10 - lE.longValue();
            if (jLongValue > f75202a.n() * 1000) {
                m mVar2 = m.f75239a;
                m.e(str, currentSession, appId);
                String str3 = appId;
                p.i(context, "appContext");
                m.c(str, null, str3, context);
                currentSession = new l(Long.valueOf(j10), null, null, 4, null);
            } else if (jLongValue > 1000 && (lVar = currentSession) != null) {
                lVar.h();
            }
        }
        l lVar3 = currentSession;
        if (lVar3 != null) {
            lVar3.k(Long.valueOf(j10));
        }
        l lVar4 = currentSession;
        if (lVar4 == null) {
            return;
        }
        lVar4.m();
    }

    public static final void x(Application application, String str) {
        p.j(application, "application");
        if (tracking.compareAndSet(false, true)) {
            FeatureManager featureManager = FeatureManager.f14322a;
            FeatureManager.a(FeatureManager.Feature.CodelessEvents, new FeatureManager.a() { // from class: y1.a
                @Override // com.facebook.internal.FeatureManager.a
                public final void a(boolean z10) {
                    f.y(z10);
                }
            });
            appId = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    public static final void y(boolean z10) {
        if (z10) {
            t1.e.f();
        } else {
            t1.e.e();
        }
    }

    public final void k() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (currentFutureLock) {
            if (currentFuture != null && (scheduledFuture = currentFuture) != null) {
                scheduledFuture.cancel(false);
            }
            currentFuture = null;
            r rVar = r.f64562a;
        }
    }

    public final int n() {
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
        q qVarF = FetchedAppSettingsManager.f(t.m());
        return qVarF == null ? i.a() : qVarF.getSessionTimeoutInSeconds();
    }

    public final void s(Activity activity) {
        AtomicInteger atomicInteger = foregroundActivityCount;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(TAG, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        k();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String strT = j0.t(activity);
        t1.e.k(activity);
        singleThreadExecutor.execute(new Runnable() { // from class: y1.b
            @Override // java.lang.Runnable
            public final void run() {
                f.t(jCurrentTimeMillis, strT);
            }
        });
    }

    public final void r(Activity activity) {
        t1.e.j(activity);
    }
}
