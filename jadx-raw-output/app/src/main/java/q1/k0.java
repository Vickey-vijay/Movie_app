package q1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppSettingsManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: UserSettingsManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0002H\u0002J#\u0010\r\u001a\u00020\u00022\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002R\u001c\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010'¨\u0006,"}, d2 = {"Lq1/k0;", "", "Lmj/r;", CampaignEx.JSON_KEY_AD_K, "", "c", "d", "b", "e", "h", "", "Lq1/k0$a;", "userSettings", "i", "([Lq1/k0$a;)V", InneractiveMediationDefs.GENDER_FEMALE, "userSetting", "p", "n", "j", InneractiveMediationDefs.GENDER_MALE, "l", "o", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "isFetchingCodelessStatus", "Lq1/k0$a;", "autoInitEnabled", "autoLogAppEventsEnabled", "g", "advertiserIDCollectionEnabled", "codelessSetupEnabled", "monitorEnabled", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "userSettingPref", "<init>", "()V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f66326a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = k0.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean isFetchingCodelessStatus = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final a autoInitEnabled = new a(true, "com.facebook.sdk.AutoInitEnabled");

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final a autoLogAppEventsEnabled = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final a advertiserIDCollectionEnabled = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final a codelessSetupEnabled = new a(false, "auto_event_setup_enabled");

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final a monitorEnabled = new a(true, "com.facebook.sdk.MonitorEnabled");

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static SharedPreferences userSettingPref;

    /* JADX INFO: compiled from: UserSettingsManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lq1/k0$a;", "", "", "e", "a", "Z", "()Z", "setDefaultVal", "(Z)V", "defaultVal", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", C3426d4.i.W, "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "g", "(Ljava/lang/Boolean;)V", "value", "", "J", "()J", InneractiveMediationDefs.GENDER_FEMALE, "(J)V", "lastTS", "<init>", "(ZLjava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean defaultVal;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public String key;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Boolean value;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long lastTS;

        public a(boolean z10, String str) {
            ck.p.j(str, C3426d4.i.W);
            this.defaultVal = z10;
            this.key = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDefaultVal() {
            return this.defaultVal;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getLastTS() {
            return this.lastTS;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getValue() {
            return this.value;
        }

        public final boolean e() {
            Boolean bool = this.value;
            return bool == null ? this.defaultVal : bool.booleanValue();
        }

        public final void f(long j10) {
            this.lastTS = j10;
        }

        public final void g(Boolean bool) {
            this.value = bool;
        }
    }

    public static final boolean b() {
        if (i2.a.d(k0.class)) {
            return false;
        }
        try {
            f66326a.h();
            return advertiserIDCollectionEnabled.e();
        } catch (Throwable th2) {
            i2.a.b(th2, k0.class);
            return false;
        }
    }

    public static final boolean c() {
        if (i2.a.d(k0.class)) {
            return false;
        }
        try {
            f66326a.h();
            return autoInitEnabled.e();
        } catch (Throwable th2) {
            i2.a.b(th2, k0.class);
            return false;
        }
    }

    public static final boolean d() {
        if (i2.a.d(k0.class)) {
            return false;
        }
        try {
            f66326a.h();
            return autoLogAppEventsEnabled.e();
        } catch (Throwable th2) {
            i2.a.b(th2, k0.class);
            return false;
        }
    }

    public static final boolean e() {
        if (i2.a.d(k0.class)) {
            return false;
        }
        try {
            f66326a.h();
            return codelessSetupEnabled.e();
        } catch (Throwable th2) {
            i2.a.b(th2, k0.class);
            return false;
        }
    }

    public static final void g(long j10) {
        if (i2.a.d(k0.class)) {
            return;
        }
        try {
            if (advertiserIDCollectionEnabled.e()) {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
                com.facebook.internal.q qVarN = FetchedAppSettingsManager.n(t.m(), false);
                if (qVarN != null && qVarN.getCodelessEventsEnabled()) {
                    com.facebook.internal.b bVarE = com.facebook.internal.b.INSTANCE.e(t.l());
                    String strH = (bVarE == null || bVarE.h() == null) ? null : bVarE.h();
                    if (strH != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", strH);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        GraphRequest graphRequestX = GraphRequest.INSTANCE.x(null, MBridgeConstans.DYNAMIC_VIEW_WX_APP, null);
                        graphRequestX.G(bundle);
                        JSONObject graphObject = graphRequestX.k().getGraphObject();
                        if (graphObject != null) {
                            a aVar = codelessSetupEnabled;
                            aVar.g(Boolean.valueOf(graphObject.optBoolean("auto_event_setup_enabled", false)));
                            aVar.f(j10);
                            f66326a.p(aVar);
                        }
                    }
                }
            }
            isFetchingCodelessStatus.set(false);
        } catch (Throwable th2) {
            i2.a.b(th2, k0.class);
        }
    }

    public static final void k() {
        if (i2.a.d(k0.class)) {
            return;
        }
        try {
            Context contextL = t.l();
            ApplicationInfo applicationInfo = contextL.getPackageManager().getApplicationInfo(contextL.getPackageName(), 128);
            ck.p.i(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            com.facebook.appevents.x xVar = new com.facebook.appevents.x(contextL);
            Bundle bundle2 = new Bundle();
            if (!com.facebook.internal.j0.P()) {
                bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                Log.w(TAG, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            xVar.d("fb_auto_applink", bundle2);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            i2.a.b(th2, k0.class);
        }
    }

    public final void l() {
        int i10;
        int i11;
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (isInitialized.get() && t.F()) {
                Context contextL = t.l();
                int i12 = 0;
                int i13 = ((autoInitEnabled.e() ? 1 : 0) << 0) | 0 | ((autoLogAppEventsEnabled.e() ? 1 : 0) << 1) | ((advertiserIDCollectionEnabled.e() ? 1 : 0) << 2) | ((monitorEnabled.e() ? 1 : 0) << 3);
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    ck.p.B("userSettingPref");
                    throw null;
                }
                int i14 = sharedPreferences.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i14 != i13) {
                    SharedPreferences sharedPreferences2 = userSettingPref;
                    if (sharedPreferences2 == null) {
                        ck.p.B("userSettingPref");
                        throw null;
                    }
                    sharedPreferences2.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i13).apply();
                    try {
                        ApplicationInfo applicationInfo = contextL.getPackageManager().getApplicationInfo(contextL.getPackageName(), 128);
                        ck.p.i(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                        if (applicationInfo.metaData != null) {
                            String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                            boolean[] zArr = {true, true, true, true};
                            int i15 = 0;
                            i10 = 0;
                            i11 = 0;
                            while (true) {
                                int i16 = i15 + 1;
                                try {
                                    i10 |= (applicationInfo.metaData.containsKey(strArr[i15]) ? 1 : 0) << i15;
                                    i11 |= (applicationInfo.metaData.getBoolean(strArr[i15], zArr[i15]) ? 1 : 0) << i15;
                                    if (i16 > 3) {
                                        break;
                                    } else {
                                        i15 = i16;
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                    i12 = i11;
                                    i11 = i12;
                                }
                            }
                            i12 = i10;
                        } else {
                            i11 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                        i10 = 0;
                    }
                    com.facebook.appevents.x xVar = new com.facebook.appevents.x(contextL);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i12);
                    bundle.putInt("initial", i11);
                    bundle.putInt("previous", i14);
                    bundle.putInt(VideoLookHistoryEntry.CURRNET, i13);
                    xVar.b(bundle);
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void n(a aVar) {
        String str = "";
        if (i2.a.d(this)) {
            return;
        }
        try {
            o();
            try {
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences == null) {
                    ck.p.B("userSettingPref");
                    throw null;
                }
                String string = sharedPreferences.getString(aVar.getKey(), "");
                if (string != null) {
                    str = string;
                }
                if (str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    aVar.g(Boolean.valueOf(jSONObject.getBoolean("value")));
                    aVar.f(jSONObject.getLong("last_timestamp"));
                }
            } catch (JSONException e10) {
                com.facebook.internal.j0 j0Var = com.facebook.internal.j0.f14425a;
                com.facebook.internal.j0.d0(TAG, e10);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void f() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            a aVar = codelessSetupEnabled;
            n(aVar);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (aVar.getValue() != null && jCurrentTimeMillis - aVar.getLastTS() < 604800000) {
                return;
            }
            aVar.g(null);
            aVar.f(0L);
            if (!isFetchingCodelessStatus.compareAndSet(false, true)) {
                return;
            }
            t.t().execute(new Runnable() { // from class: q1.j0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.g(jCurrentTimeMillis);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void h() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (!t.F() || !isInitialized.compareAndSet(false, true)) {
                return;
            }
            SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            ck.p.i(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
            userSettingPref = sharedPreferences;
            i(autoLogAppEventsEnabled, advertiserIDCollectionEnabled, autoInitEnabled);
            f();
            m();
            l();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void i(a... userSettings) {
        if (i2.a.d(this)) {
            return;
        }
        int i10 = 0;
        try {
            int length = userSettings.length;
            while (i10 < length) {
                a aVar = userSettings[i10];
                i10++;
                if (aVar == codelessSetupEnabled) {
                    f();
                } else if (aVar.getValue() == null) {
                    n(aVar);
                    if (aVar.getValue() == null) {
                        j(aVar);
                    }
                } else {
                    p(aVar);
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void j(a aVar) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            o();
            try {
                Context contextL = t.l();
                ApplicationInfo applicationInfo = contextL.getPackageManager().getApplicationInfo(contextL.getPackageName(), 128);
                ck.p.i(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null && bundle.containsKey(aVar.getKey())) {
                    aVar.g(Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.getKey(), aVar.getDefaultVal())));
                    return;
                }
                return;
            } catch (PackageManager.NameNotFoundException e10) {
                com.facebook.internal.j0 j0Var = com.facebook.internal.j0.f14425a;
                com.facebook.internal.j0.d0(TAG, e10);
                return;
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
        i2.a.b(th2, this);
    }

    public final void m() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            Context contextL = t.l();
            ApplicationInfo applicationInfo = contextL.getPackageManager().getApplicationInfo(contextL.getPackageName(), 128);
            ck.p.i(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                if (!bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(TAG, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(TAG, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!b()) {
                    Log.w(TAG, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void o() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (isInitialized.get()) {
            } else {
                throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void p(a aVar) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            o();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", aVar.getValue());
                jSONObject.put("last_timestamp", aVar.getLastTS());
                SharedPreferences sharedPreferences = userSettingPref;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(aVar.getKey(), jSONObject.toString()).apply();
                    l();
                } else {
                    ck.p.B("userSettingPref");
                    throw null;
                }
            } catch (Exception e10) {
                com.facebook.internal.j0 j0Var = com.facebook.internal.j0.f14425a;
                com.facebook.internal.j0.d0(TAG, e10);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
