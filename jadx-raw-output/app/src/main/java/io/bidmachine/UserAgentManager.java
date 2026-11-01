package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import com.ironsource.Z7;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.DeviceUtils;
import io.bidmachine.util.UiUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: UserAgentManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0007\u001d\u001e\u001f !\"#B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011¨\u0006$"}, d2 = {"Lio/bidmachine/UserAgentManager;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", MobileAdsBridgeBase.initializeMethodName, "", "getUserAgent", "updateWebViewUserAgent", "clear", "findWebUserAgent$bidmachine_android_sdk_bi_3_3_0", "(Landroid/content/Context;)Ljava/lang/String;", "findWebUserAgent", "", "DEFAULT_EXPIRATION_MS", "J", "SYSTEM_PROPERTY_HTTP_AGENT", "Ljava/lang/String;", "SYSTEM_HTTP_AGENT", "Ljava/util/concurrent/atomic/AtomicBoolean;", "WEB_USER_AGENT_PROCESSED", "Ljava/util/concurrent/atomic/AtomicBoolean;", "WEB_USER_AGENT_UPDATED", "applicationContext", "Landroid/content/Context;", "webUserAgent", "generatedUserAgent", "<init>", "()V", "ApplovinUserAgentSource", "BidMachineUserAgentSource", "FacebookUserAgentSource", "GeneratedUserAgentSource", "IronSourceUserAgentSource", "SharedPreferenceUserAgentSource", "UserAgentSource", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class UserAgentManager {
    private static final String SYSTEM_HTTP_AGENT;
    private static final String SYSTEM_PROPERTY_HTTP_AGENT = "http.agent";
    private static final AtomicBoolean WEB_USER_AGENT_PROCESSED;
    private static final AtomicBoolean WEB_USER_AGENT_UPDATED;
    private static Context applicationContext;
    private static String generatedUserAgent;
    public static String webUserAgent;
    public static final UserAgentManager INSTANCE = new UserAgentManager();
    private static final long DEFAULT_EXPIRATION_MS = TimeUnit.DAYS.toMillis(14);

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$ApplovinUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ApplovinUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplovinUserAgentSource(Context context) {
            super(context, "com.applovin.sdk.shared", "com.applovin.sdk.user_agent");
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lio/bidmachine/UserAgentManager$BidMachineUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", "Ljava/lang/Runnable;", "", "get", "Lmj/r;", "run", "checkAndUpdate", "", "calculateExpirationMs", "expirationMs", "J", "getExpirationMs", "()J", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;J)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class BidMachineUserAgentSource implements UserAgentSource, Runnable {
        private final Context applicationContext;
        private final long expirationMs;

        public BidMachineUserAgentSource(Context context, long j10) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            this.expirationMs = j10;
            Context applicationContext = context.getApplicationContext();
            ck.p.i(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            return o2.getValidUserAgent(this.applicationContext);
        }

        public final long getExpirationMs() {
            return this.expirationMs;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UserAgentManager userAgentManager = UserAgentManager.INSTANCE;
                String defaultUserAgent = WebSettings.getDefaultUserAgent(this.applicationContext);
                if (defaultUserAgent != null) {
                    ck.p.i(defaultUserAgent, "getDefaultUserAgent(applicationContext)");
                    o2.setValidUserAgent(this.applicationContext, defaultUserAgent, calculateExpirationMs());
                } else {
                    defaultUserAgent = null;
                }
                UserAgentManager.webUserAgent = defaultUserAgent;
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
        }

        public final long calculateExpirationMs() {
            return System.currentTimeMillis() + this.expirationMs;
        }

        public final void checkAndUpdate() {
            boolean z10;
            String str = get();
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                UiUtils.onUiThread(this);
            }
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$FacebookUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FacebookUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FacebookUserAgentSource(Context context) {
            super(context, "com.facebook.ads.internal.ua", "user_agent");
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002J$\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/bidmachine/UserAgentManager$GeneratedUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "create", "Landroid/content/pm/PackageManager;", "packageManager", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "userAgentBuilder", "Lmj/r;", "appendChromeToUserAgent", "appendMobileToUserAgent", "get", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
    public static final class GeneratedUserAgentSource implements UserAgentSource {
        private final Context applicationContext;

        public GeneratedUserAgentSource(Context context) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            Context applicationContext = context.getApplicationContext();
            ck.p.i(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }

        private final void appendChromeToUserAgent(PackageManager packageManager, StringBuilder sb2) {
            String[] strArr = {"com.android.chrome", "com.google.android.webview", "com.android.webview"};
            for (int i10 = 0; i10 < 3; i10++) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i10], 0);
                    sb2.append(" Chrome/");
                    sb2.append(packageInfo.versionName);
                    return;
                } catch (Throwable unused) {
                }
            }
        }

        private final String create(Context context) {
            try {
                StringBuilder sb2 = new StringBuilder("Mozilla/5.0");
                sb2.append(" (Linux; Android ");
                sb2.append(DeviceUtils.getOsVersion());
                sb2.append("; ");
                sb2.append(DeviceUtils.getModel());
                sb2.append(" Build/");
                sb2.append(DeviceUtils.getBuildId());
                sb2.append("; wv)");
                sb2.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
                sb2.append(" Version/4.0");
                PackageManager packageManager = context.getPackageManager();
                ck.p.i(packageManager, "packageManager");
                ck.p.i(sb2, "userAgentBuilder");
                appendChromeToUserAgent(packageManager, sb2);
                appendMobileToUserAgent(context, packageManager, sb2);
                String string = sb2.toString();
                ck.p.i(string, "userAgentBuilder.toString()");
                return string;
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            return create(this.applicationContext);
        }

        private final void appendMobileToUserAgent(Context context, PackageManager packageManager, StringBuilder sb2) {
            String string;
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb2.append(" Mobile");
                sb2.append(Z7.f27998r);
                int i10 = applicationInfo.labelRes;
                if (i10 == 0) {
                    string = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    string = context.getString(i10);
                    ck.p.i(string, "{\n                      …                        }");
                }
                sb2.append(string);
                sb2.append("/");
                sb2.append(packageInfo.versionName);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/UserAgentManager$IronSourceUserAgentSource;", "Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class IronSourceUserAgentSource extends SharedPreferenceUserAgentSource {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IronSourceUserAgentSource(Context context) {
            super(context, "Mediation_Shared_Preferences", "browser_user_agent");
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/bidmachine/UserAgentManager$SharedPreferenceUserAgentSource;", "Lio/bidmachine/UserAgentManager$UserAgentSource;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "name", "", "field", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "applicationContext", "sharedPreferences", "Landroid/content/SharedPreferences;", "get", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static class SharedPreferenceUserAgentSource implements UserAgentSource {
        private final Context applicationContext;
        private final String field;
        private final String name;
        private SharedPreferences sharedPreferences;

        @Override // io.bidmachine.UserAgentManager.UserAgentSource
        public String get() {
            try {
                if (this.sharedPreferences == null) {
                    this.sharedPreferences = this.applicationContext.getSharedPreferences(this.name, 0);
                }
                SharedPreferences sharedPreferences = this.sharedPreferences;
                if (sharedPreferences != null) {
                    return sharedPreferences.getString(this.field, null);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public SharedPreferenceUserAgentSource(Context context, String str, String str2) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(str, "name");
            ck.p.j(str2, "field");
            this.name = str;
            this.field = str2;
            Context applicationContext = context.getApplicationContext();
            ck.p.i(applicationContext, "context.applicationContext");
            this.applicationContext = applicationContext;
        }
    }

    /* JADX INFO: compiled from: UserAgentManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\b`\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0004"}, d2 = {"Lio/bidmachine/UserAgentManager$UserAgentSource;", "", "get", "", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface UserAgentSource {
        String get();
    }

    private UserAgentManager() {
    }

    public static final String getUserAgent() {
        return getUserAgent(applicationContext);
    }

    static {
        String property;
        try {
            property = System.getProperty(SYSTEM_PROPERTY_HTTP_AGENT);
        } catch (Throwable unused) {
            property = null;
        }
        SYSTEM_HTTP_AGENT = property;
        WEB_USER_AGENT_PROCESSED = new AtomicBoolean(false);
        WEB_USER_AGENT_UPDATED = new AtomicBoolean(false);
    }

    public static final void clear() {
        WEB_USER_AGENT_PROCESSED.set(false);
        webUserAgent = null;
        generatedUserAgent = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0025  */
    /* JADX WARN: Code duplicated, block: B:32:0x004c  */
    public static final String getUserAgent(Context context) {
        boolean z10;
        boolean z11;
        if (context == null) {
            context = applicationContext;
        }
        if (webUserAgent == null && context != null) {
            webUserAgent = INSTANCE.findWebUserAgent$bidmachine_android_sdk_bi_3_3_0(context);
        }
        String str = webUserAgent;
        if (str == null) {
            z10 = false;
        } else {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            return webUserAgent;
        }
        if (generatedUserAgent == null && context != null) {
            generatedUserAgent = new GeneratedUserAgentSource(context).get();
        }
        String str2 = generatedUserAgent;
        if (str2 != null) {
            z11 = str2.length() > 0;
        }
        return z11 ? generatedUserAgent : SYSTEM_HTTP_AGENT;
    }

    public static final void initialize(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        applicationContext = context.getApplicationContext();
        INSTANCE.findWebUserAgent$bidmachine_android_sdk_bi_3_3_0(context);
    }

    public static final void updateWebViewUserAgent() {
        Context context;
        if (WEB_USER_AGENT_UPDATED.compareAndSet(false, true) && (context = applicationContext) != null) {
            try {
                new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).checkAndUpdate();
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    public final String findWebUserAgent$bidmachine_android_sdk_bi_3_3_0(Context context) {
        boolean z10;
        boolean z11;
        boolean z12;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        boolean z13 = false;
        if (!WEB_USER_AGENT_PROCESSED.compareAndSet(false, true)) {
            return webUserAgent;
        }
        String str = new BidMachineUserAgentSource(context, DEFAULT_EXPIRATION_MS).get();
        if (str == null) {
            z10 = false;
        } else {
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            return str;
        }
        String str2 = new ApplovinUserAgentSource(context).get();
        if (str2 == null) {
            z11 = false;
        } else {
            if (str2.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11) {
            return str2;
        }
        String str3 = new IronSourceUserAgentSource(context).get();
        if (str3 == null) {
            z12 = false;
        } else {
            if (str3.length() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        if (z12) {
            return str3;
        }
        String str4 = new FacebookUserAgentSource(context).get();
        if (str4 != null) {
            if (str4.length() > 0) {
                z13 = true;
            }
        }
        if (z13) {
            return str4;
        }
        updateWebViewUserAgent();
        return webUserAgent;
    }
}
