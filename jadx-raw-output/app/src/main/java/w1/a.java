package w1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import ck.p;
import com.applovin.sdk.AppLovinEventParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J0\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\fH\u0002R\u001c\u0010\u0012\u001a\n \u000f*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lw1/a;", "", "Lmj/r;", "g", "e", "h", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "purchases", "", "isSubscription", InneractiveMediationDefs.GENDER_FEMALE, "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "d", "Ljava/lang/Boolean;", "hasBillingService", "hasBillingActivity", "Landroid/content/ServiceConnection;", "Landroid/content/ServiceConnection;", "serviceConnection", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callbacks", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "i", "Ljava/lang/Object;", "inAppBillingObj", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73267a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = a.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean isTracking = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static Boolean hasBillingService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static Boolean hasBillingActivity;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static ServiceConnection serviceConnection;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static Application.ActivityLifecycleCallbacks callbacks;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static Intent intent;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static Object inAppBillingObj;

    /* JADX INFO: renamed from: w1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"w1/a$a", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "Lmj/r;", "onServiceConnected", "onServiceDisconnected", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class ServiceConnectionC0771a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p.j(componentName, "name");
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p.j(componentName, "name");
            p.j(iBinder, NotificationCompat.CATEGORY_SERVICE);
            a aVar = a.f73267a;
            i iVar = i.f73307a;
            a.inAppBillingObj = i.a(t.l(), iBinder);
        }
    }

    /* JADX INFO: compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"w1/a$b", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lmj/r;", "onActivityResumed", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "onActivityStarted", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            p.j(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            try {
                t.t().execute(new Runnable() { // from class: w1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            try {
                if (p.e(a.hasBillingActivity, Boolean.TRUE) && p.e(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    t.t().execute(new Runnable() { // from class: w1.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }

        public static final void c() {
            Context contextL = t.l();
            i iVar = i.f73307a;
            ArrayList<String> arrayListI = i.i(contextL, a.inAppBillingObj);
            a aVar = a.f73267a;
            aVar.f(contextL, arrayListI, false);
            aVar.f(contextL, i.j(contextL, a.inAppBillingObj), true);
        }

        public static final void d() {
            Context contextL = t.l();
            i iVar = i.f73307a;
            ArrayList<String> arrayListI = i.i(contextL, a.inAppBillingObj);
            if (arrayListI.isEmpty()) {
                arrayListI = i.g(contextL, a.inAppBillingObj);
            }
            a.f73267a.f(contextL, arrayListI, false);
        }
    }

    public static final void g() {
        a aVar = f73267a;
        aVar.e();
        if (!p.e(hasBillingService, Boolean.FALSE) && y1.h.c()) {
            aVar.h();
        }
    }

    public final void e() {
        if (hasBillingService != null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(m.a("com.android.vending.billing.IInAppBillingService$Stub") != null);
        hasBillingService = boolValueOf;
        if (p.e(boolValueOf, Boolean.FALSE)) {
            return;
        }
        hasBillingActivity = Boolean.valueOf(m.a("com.android.billingclient.api.ProxyBillingActivity") != null);
        i.b();
        Intent intent2 = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
        p.i(intent2, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
        intent = intent2;
        serviceConnection = new ServiceConnectionC0771a();
        callbacks = new b();
    }

    public final void h() {
        if (isTracking.compareAndSet(false, true)) {
            Context contextL = t.l();
            if (contextL instanceof Application) {
                Application application = (Application) contextL;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = callbacks;
                if (activityLifecycleCallbacks == null) {
                    p.B("callbacks");
                    throw null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent2 = intent;
                if (intent2 == null) {
                    p.B("intent");
                    throw null;
                }
                ServiceConnection serviceConnection2 = serviceConnection;
                if (serviceConnection2 != null) {
                    contextL.bindService(intent2, serviceConnection2, 1);
                } else {
                    p.B("serviceConnection");
                    throw null;
                }
            }
        }
    }

    public final void f(Context context, ArrayList<String> arrayList, boolean z10) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            try {
                String string = new JSONObject(str).getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                p.i(string, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                p.i(str, "purchase");
                map.put(string, str);
                arrayList2.add(string);
            } catch (JSONException e10) {
                Log.e(TAG, "Error parsing in-app purchase data.", e10);
            }
        }
        i iVar = i.f73307a;
        for (Map.Entry<String, String> entry : i.k(context, arrayList2, inAppBillingObj, z10).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str2 = (String) map.get(key);
            if (str2 != null) {
                y1.h.f(str2, value, z10);
            }
        }
    }
}
