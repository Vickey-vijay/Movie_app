package q1;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import nj.q0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacebookSdk.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002a/B\t\b\u0002¢\u0006\u0004\b_\u0010`J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\tH\u0007J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\b\u0010\u0016\u001a\u00020\u0006H\u0007J\b\u0010\u0017\u001a\u00020\u0011H\u0007J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\u001b\u001a\u00020\tH\u0007J\b\u0010\u001c\u001a\u00020\u000fH\u0007J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\tH\u0007J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\tH\u0003J\b\u0010!\u001a\u00020\tH\u0007J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000fH\u0007J\u0019\u0010#\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\tH\u0007J\n\u0010&\u001a\u0004\u0018\u00010\tH\u0007J\b\u0010'\u001a\u00020\tH\u0007J\b\u0010(\u001a\u00020\u0006H\u0007J\b\u0010)\u001a\u00020\u0006H\u0007J\b\u0010*\u001a\u00020\u0006H\u0007J\b\u0010+\u001a\u00020\u0006H\u0007J\b\u0010-\u001a\u00020,H\u0007R\u001c\u00101\u001a\n .*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u001802j\b\u0012\u0004\u0012\u00020\u0018`38\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00100R\u0018\u0010<\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00100R\u0018\u0010>\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00100R\u0018\u0010A\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u0016\u0010H\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010FR\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010KR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010MR\u0016\u0010N\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010PR\u0016\u0010R\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00100R\u0016\u0010S\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010FR\u0016\u0010T\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010FR\u0016\u0010U\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010FR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010WR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00100R\u0016\u0010Z\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u0010]\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\\R\u0016\u0010^\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010F¨\u0006b"}, d2 = {"Lq1/t;", "", "Ljava/util/concurrent/Executor;", "t", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "D", RequestConfiguration.MAX_AD_CONTENT_RATING_G, "", "w", ExifInterface.LONGITUDE_EAST, "u", "v", VastAttributes.VERTICAL_POSITION, "Landroid/content/Context;", "applicationContext", "Lmj/r;", "M", "Lq1/t$b;", "callback", "N", "F", "j", "Lcom/facebook/LoggingBehavior;", "behavior", "H", VastAttributes.HORIZONTAL_POSITION, "l", GAMConfig.KEY_CONTEXT, "applicationId", "K", "J", "B", "z", "I", "(Landroid/content/Context;)V", InneractiveMediationDefs.GENDER_MALE, "n", "r", "o", "p", "s", CampaignEx.JSON_KEY_AD_K, "", "q", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "c", "Ljava/util/HashSet;", "loggingBehaviors", "d", "Ljava/util/concurrent/Executor;", "executor", "e", InneractiveMediationDefs.GENDER_FEMALE, "applicationName", "g", "appClientToken", "h", "Ljava/lang/Boolean;", "codelessDebugLogEnabled", "Ljava/util/concurrent/atomic/AtomicLong;", "i", "Ljava/util/concurrent/atomic/AtomicLong;", "onProgressThreshold", "Z", "isDebugEnabledField", "isLegacyTokenUpgradeSupported", "Lcom/facebook/internal/z;", "Ljava/io/File;", "Lcom/facebook/internal/z;", "cacheDir", "Landroid/content/Context;", "callbackRequestCodeOffset", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "LOCK", "graphApiVersion", "hasCustomTabsPrefetching", "ignoreAppSwitchToLoggedOut", "bypassAppSwitch", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sdkInitialized", "instagramDomain", "facebookDomain", "Lq1/t$a;", "Lq1/t$a;", "graphRequestCreator", "isFullyInitialized", "<init>", "()V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static Executor executor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static volatile String applicationId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static volatile String applicationName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static volatile String appClientToken;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static volatile Boolean codelessDebugLogEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean isDebugEnabledField;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static boolean isLegacyTokenUpgradeSupported;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static com.facebook.internal.z<File> cacheDir;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static Context applicationContext;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static boolean hasCustomTabsPrefetching;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static boolean ignoreAppSwitchToLoggedOut;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static boolean bypassAppSwitch;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static boolean isFullyInitialized;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f66343a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = t.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final HashSet<LoggingBehavior> loggingBehaviors = q0.g(LoggingBehavior.DEVELOPER_ERRORS);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static AtomicLong onProgressThreshold = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static int callbackRequestCodeOffset = 64206;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final ReentrantLock LOCK = new ReentrantLock();

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static String graphApiVersion = com.facebook.internal.g0.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean sdkInitialized = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static volatile String instagramDomain = "instagram.com";

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static volatile String facebookDomain = "facebook.com";

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static a graphRequestCreator = new a() { // from class: q1.r
        @Override // q1.t.a
        public final GraphRequest a(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
            return t.C(accessToken, str, jSONObject, bVar);
        }
    };

    /* JADX INFO: compiled from: FacebookSdk.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bá\u0080\u0001\u0018\u00002\u00020\u0001J0\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¨\u0006\f"}, d2 = {"Lq1/t$a;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "publishUrl", "Lorg/json/JSONObject;", "publishParams", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    @VisibleForTesting
    public interface a {
        GraphRequest a(AccessToken accessToken, String publishUrl, JSONObject publishParams, GraphRequest.b callback);
    }

    /* JADX INFO: compiled from: FacebookSdk.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lq1/t$b;", "", "Lmj/r;", "onInitialized", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface b {
        void onInitialized();
    }

    public static final String B() {
        return "15.2.0";
    }

    public static final void j() {
        isFullyInitialized = true;
    }

    public static final String v() {
        return "fb.gg";
    }

    public static final GraphRequest C(AccessToken accessToken, String str, JSONObject jSONObject, GraphRequest.b bVar) {
        return GraphRequest.INSTANCE.A(accessToken, str, jSONObject, bVar);
    }

    public static final boolean D() {
        return isDebugEnabledField;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final synchronized boolean E() {
        return isFullyInitialized;
    }

    public static final boolean F() {
        return sdkInitialized.get();
    }

    public static final boolean G() {
        return isLegacyTokenUpgradeSupported;
    }

    public static final boolean H(LoggingBehavior behavior) {
        boolean z10;
        ck.p.j(behavior, "behavior");
        HashSet<LoggingBehavior> hashSet = loggingBehaviors;
        synchronized (hashSet) {
            z10 = D() && hashSet.contains(behavior);
        }
        return z10;
    }

    public static final void I(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            ck.p.i(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (applicationId == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    ck.p.i(locale, NativeAdContent.ViewTag.ROOT);
                    String lowerCase = str.toLowerCase(locale);
                    ck.p.i(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lk.x.R(lowerCase, "fb", false, 2, null)) {
                        String strSubstring = str.substring(2);
                        ck.p.i(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        applicationId = strSubstring;
                    } else {
                        applicationId = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (applicationName == null) {
                applicationName = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (appClientToken == null) {
                appClientToken = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (callbackRequestCodeOffset == 64206) {
                callbackRequestCodeOffset = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (codelessDebugLogEnabled == null) {
                codelessDebugLogEnabled = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @VisibleForTesting(otherwise = 3)
    public static final void K(Context context, final String str) {
        if (i2.a.d(t.class)) {
            return;
        }
        try {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(str, "applicationId");
            final Context applicationContext2 = context.getApplicationContext();
            t().execute(new Runnable() { // from class: q1.s
                @Override // java.lang.Runnable
                public final void run() {
                    t.L(applicationContext2, str);
                }
            });
            FeatureManager featureManager = FeatureManager.f14322a;
            if (FeatureManager.g(FeatureManager.Feature.OnDeviceEventProcessing) && a2.c.d()) {
                a2.c.g(str, "com.facebook.sdk.attributionTracking");
            }
        } catch (Throwable th2) {
            i2.a.b(th2, t.class);
        }
    }

    public static final void L(Context context, String str) {
        ck.p.j(str, "$applicationId");
        t tVar = f66343a;
        ck.p.i(context, "applicationContext");
        tVar.J(context, str);
    }

    public static final synchronized void M(Context context) {
        ck.p.j(context, "applicationContext");
        N(context, null);
    }

    public static final synchronized void N(Context context, final b bVar) {
        ck.p.j(context, "applicationContext");
        AtomicBoolean atomicBoolean = sdkInitialized;
        if (atomicBoolean.get()) {
            if (bVar != null) {
                bVar.onInitialized();
            }
            return;
        }
        com.facebook.internal.k0.f(context, false);
        com.facebook.internal.k0.g(context, false);
        Context applicationContext2 = context.getApplicationContext();
        ck.p.i(applicationContext2, "applicationContext.applicationContext");
        applicationContext = applicationContext2;
        AppEventsLogger.INSTANCE.c(context);
        Context context2 = applicationContext;
        if (context2 == null) {
            ck.p.B("applicationContext");
            throw null;
        }
        I(context2);
        String str = applicationId;
        if (str == null || str.length() == 0) {
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
        String str2 = appClientToken;
        if (str2 == null || str2.length() == 0) {
            throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
        }
        atomicBoolean.set(true);
        if (o()) {
            j();
        }
        Context context3 = applicationContext;
        if (context3 == null) {
            ck.p.B("applicationContext");
            throw null;
        }
        if ((context3 instanceof Application) && k0.d()) {
            y1.f fVar = y1.f.f75202a;
            Context context4 = applicationContext;
            if (context4 == null) {
                ck.p.B("applicationContext");
                throw null;
            }
            y1.f.x((Application) context4, applicationId);
        }
        FetchedAppSettingsManager.g();
        com.facebook.internal.d0.z();
        BoltsMeasurementEventListener.Companion aVar = BoltsMeasurementEventListener.INSTANCE;
        Context context5 = applicationContext;
        if (context5 == null) {
            ck.p.B("applicationContext");
            throw null;
        }
        aVar.a(context5);
        cacheDir = new com.facebook.internal.z<>(new Callable() { // from class: q1.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.O();
            }
        });
        FeatureManager featureManager = FeatureManager.f14322a;
        FeatureManager.a(FeatureManager.Feature.Instrument, new FeatureManager.a() { // from class: q1.l
            @Override // com.facebook.internal.FeatureManager.a
            public final void a(boolean z10) {
                t.P(z10);
            }
        });
        FeatureManager.a(FeatureManager.Feature.AppEvents, new FeatureManager.a() { // from class: q1.m
            @Override // com.facebook.internal.FeatureManager.a
            public final void a(boolean z10) {
                t.Q(z10);
            }
        });
        FeatureManager.a(FeatureManager.Feature.ChromeCustomTabsPrefetching, new FeatureManager.a() { // from class: q1.n
            @Override // com.facebook.internal.FeatureManager.a
            public final void a(boolean z10) {
                t.R(z10);
            }
        });
        FeatureManager.a(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new FeatureManager.a() { // from class: q1.o
            @Override // com.facebook.internal.FeatureManager.a
            public final void a(boolean z10) {
                t.S(z10);
            }
        });
        FeatureManager.a(FeatureManager.Feature.BypassAppSwitch, new FeatureManager.a() { // from class: q1.p
            @Override // com.facebook.internal.FeatureManager.a
            public final void a(boolean z10) {
                t.T(z10);
            }
        });
        t().execute(new FutureTask(new Callable() { // from class: q1.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.U(bVar);
            }
        }));
    }

    public static final File O() {
        Context context = applicationContext;
        if (context != null) {
            return context.getCacheDir();
        }
        ck.p.B("applicationContext");
        throw null;
    }

    public static final void P(boolean z10) {
        if (z10) {
            f2.f.d();
        }
    }

    public static final void Q(boolean z10) {
        if (z10) {
            com.facebook.appevents.v.a();
        }
    }

    public static final void R(boolean z10) {
        if (z10) {
            hasCustomTabsPrefetching = true;
        }
    }

    public static final void S(boolean z10) {
        if (z10) {
            ignoreAppSwitchToLoggedOut = true;
        }
    }

    public static final void T(boolean z10) {
        if (z10) {
            bypassAppSwitch = true;
        }
    }

    public static final Void U(b bVar) {
        f.INSTANCE.e().j();
        c0.INSTANCE.a().d();
        if (AccessToken.INSTANCE.g()) {
            Profile.Companion bVar2 = Profile.INSTANCE;
            if (bVar2.b() == null) {
                bVar2.a();
            }
        }
        if (bVar != null) {
            bVar.onInitialized();
        }
        AppEventsLogger.Companion aVar = AppEventsLogger.INSTANCE;
        aVar.f(l(), applicationId);
        k0.k();
        Context applicationContext2 = l().getApplicationContext();
        ck.p.i(applicationContext2, "getApplicationContext().applicationContext");
        aVar.g(applicationContext2).b();
        return null;
    }

    public static final Executor t() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (executor == null) {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            mj.r rVar = mj.r.f64562a;
            reentrantLock.unlock();
            Executor executor2 = executor;
            if (executor2 != null) {
                return executor2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String u() {
        return facebookDomain;
    }

    public static final String w() {
        com.facebook.internal.j0 j0Var = com.facebook.internal.j0.f14425a;
        String str = TAG;
        ck.w wVar = ck.w.f6066a;
        String str2 = String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{graphApiVersion}, 1));
        ck.p.i(str2, "java.lang.String.format(format, *args)");
        com.facebook.internal.j0.e0(str, str2);
        return graphApiVersion;
    }

    public static final String x() {
        AccessToken accessTokenE = AccessToken.INSTANCE.e();
        return com.facebook.internal.j0.B(accessTokenE != null ? accessTokenE.getGraphDomain() : null);
    }

    public static final String y() {
        return instagramDomain;
    }

    public static final boolean z(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        com.facebook.internal.k0.m();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final long A() {
        com.facebook.internal.k0.m();
        return onProgressThreshold.get();
    }

    public static final boolean k() {
        return k0.b();
    }

    public static final Context l() {
        com.facebook.internal.k0.m();
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        ck.p.B("applicationContext");
        throw null;
    }

    public static final String m() {
        com.facebook.internal.k0.m();
        String str = applicationId;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String n() {
        com.facebook.internal.k0.m();
        return applicationName;
    }

    public static final boolean o() {
        return k0.c();
    }

    public static final boolean p() {
        return k0.d();
    }

    public static final int q() {
        com.facebook.internal.k0.m();
        return callbackRequestCodeOffset;
    }

    public static final String r() {
        com.facebook.internal.k0.m();
        String str = appClientToken;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final boolean s() {
        return k0.e();
    }

    public final void J(Context context, String str) {
        try {
            if (i2.a.d(this)) {
                return;
            }
            try {
                com.facebook.internal.b bVarE = com.facebook.internal.b.INSTANCE.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String strS = ck.p.s(str, "ping");
                long j10 = sharedPreferences.getLong(strS, 0L);
                try {
                    AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.f14244a;
                    JSONObject jSONObjectA = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, bVarE, AppEventsLogger.INSTANCE.c(context), z(context), context);
                    ck.w wVar = ck.w.f6066a;
                    String str2 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                    ck.p.i(str2, "java.lang.String.format(format, *args)");
                    GraphRequest graphRequestA = graphRequestCreator.a(null, str2, jSONObjectA, null);
                    if (j10 == 0 && graphRequestA.k().getError() == null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putLong(strS, System.currentTimeMillis());
                        editorEdit.apply();
                    }
                } catch (JSONException e10) {
                    throw new FacebookException("An error occurred while publishing install.", e10);
                }
            } catch (Exception e11) {
                com.facebook.internal.j0.d0("Facebook-publish", e11);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
