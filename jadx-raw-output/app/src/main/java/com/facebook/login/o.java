package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.appevents.x;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: LoginLogger.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u001c\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\\\u0010\u0010\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J(\u0010\u0013\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J`\u0010\u0016\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J(\u0010\u0017\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J(\u0010\u0018\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0019\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0002R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001b¨\u0006'"}, d2 = {"Lcom/facebook/login/o;", "", "Lcom/facebook/login/LoginClient$Request;", "pendingLoginRequest", "", C3426d4.i.f28547j0, "Lmj/r;", "i", "loginRequestId", "", "loggingExtras", "Lcom/facebook/login/LoginClient$Result$Code;", "result", "resultExtras", "Ljava/lang/Exception;", "exception", InneractiveMediationDefs.GENDER_FEMALE, "authId", "method", "e", "errorMessage", IronSourceConstants.EVENTS_ERROR_CODE, "c", "d", "j", "g", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "applicationId", "Lcom/facebook/appevents/x;", "Lcom/facebook/appevents/x;", "logger", "facebookVersion", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f14699e = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String applicationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final x logger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public String facebookVersion;

    /* JADX INFO: renamed from: com.facebook.login.o$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LoginLogger.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0007R\u0014\u0010\u001c\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0007R\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0007R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0007R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0007R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0007R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0007R\u0014\u0010'\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0007R\u0014\u0010)\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0007R\u001c\u0010-\u001a\n ,*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/facebook/login/o$a;", "", "", "authLoggerId", "Landroid/os/Bundle;", "b", "EVENT_EXTRAS_DEFAULT_AUDIENCE", "Ljava/lang/String;", "EVENT_EXTRAS_FACEBOOK_VERSION", "EVENT_EXTRAS_FAILURE", "EVENT_EXTRAS_IS_REAUTHORIZE", "EVENT_EXTRAS_LOGIN_BEHAVIOR", "EVENT_EXTRAS_MISSING_INTERNET_PERMISSION", "EVENT_EXTRAS_NEW_PERMISSIONS", "EVENT_EXTRAS_NOT_TRIED", "EVENT_EXTRAS_PERMISSIONS", "EVENT_EXTRAS_REQUEST_CODE", "EVENT_EXTRAS_TARGET_APP", "EVENT_EXTRAS_TRY_LOGIN_ACTIVITY", "EVENT_NAME_FOA_LOGIN_COMPLETE", "EVENT_NAME_FOA_LOGIN_METHOD_COMPLETE", "EVENT_NAME_FOA_LOGIN_METHOD_NOT_TRIED", "EVENT_NAME_FOA_LOGIN_METHOD_START", "EVENT_NAME_FOA_LOGIN_START", "EVENT_NAME_LOGIN_COMPLETE", "EVENT_NAME_LOGIN_HEARTBEAT", "EVENT_NAME_LOGIN_METHOD_COMPLETE", "EVENT_NAME_LOGIN_METHOD_NOT_TRIED", "EVENT_NAME_LOGIN_METHOD_START", "EVENT_NAME_LOGIN_START", "EVENT_NAME_LOGIN_STATUS_COMPLETE", "EVENT_NAME_LOGIN_STATUS_START", "EVENT_PARAM_AUTH_LOGGER_ID", "EVENT_PARAM_CHALLENGE", "EVENT_PARAM_ERROR_CODE", "EVENT_PARAM_ERROR_MESSAGE", "EVENT_PARAM_EXTRAS", "EVENT_PARAM_FOA_METHOD_RESULT_SKIPPED", "EVENT_PARAM_LOGIN_RESULT", "EVENT_PARAM_METHOD", "EVENT_PARAM_METHOD_RESULT_SKIPPED", "EVENT_PARAM_TIMESTAMP", "FACEBOOK_PACKAGE_NAME", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "worker", "Ljava/util/concurrent/ScheduledExecutorService;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final Bundle b(String authLoggerId) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", authLoggerId);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    public o(Context context, String str) {
        PackageInfo packageInfo;
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "applicationId");
        this.applicationId = str;
        this.logger = new x(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(FbValidationUtils.FB_PACKAGE, 0)) == null) {
                return;
            }
            this.facebookVersion = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final void h(o oVar, Bundle bundle) {
        if (i2.a.d(o.class)) {
            return;
        }
        try {
            ck.p.j(oVar, "this$0");
            ck.p.j(bundle, "$bundle");
            oVar.logger.g("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th2) {
            i2.a.b(th2, o.class);
        }
    }

    public static /* synthetic */ void k(o oVar, String str, String str2, String str3, int i10, Object obj) {
        if (i2.a.d(o.class)) {
            return;
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        try {
            oVar.j(str, str2, str3);
        } catch (Throwable th2) {
            i2.a.b(th2, o.class);
        }
    }

    public final String b() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            return this.applicationId;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final void c(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        boolean z10;
        if (!i2.a.d(this)) {
            try {
                Bundle bundleB = INSTANCE.b(str);
                if (str3 != null) {
                    bundleB.putString("2_result", str3);
                }
                if (str4 != null) {
                    bundleB.putString("5_error_message", str4);
                }
                if (str5 != null) {
                    bundleB.putString("4_error_code", str5);
                }
                if (map != null && (!map.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    bundleB.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                bundleB.putString("3_method", str2);
                this.logger.g(str6, bundleB);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        }
    }

    public final void d(String str, String str2, String str3) {
        if (!i2.a.d(this)) {
            try {
                Bundle bundleB = INSTANCE.b(str);
                bundleB.putString("3_method", str2);
                this.logger.g(str3, bundleB);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        }
    }

    public final void e(String str, String str2, String str3) {
        if (!i2.a.d(this)) {
            try {
                Bundle bundleB = INSTANCE.b(str);
                bundleB.putString("3_method", str2);
                this.logger.g(str3, bundleB);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        }
    }

    public final void f(String str, Map<String, String> map, LoginClient.Result.Code code, Map<String, String> map2, Exception exc, String str2) {
        String message;
        if (i2.a.d(this)) {
            return;
        }
        try {
            ck.p.j(map, "loggingExtras");
            Bundle bundleB = INSTANCE.b(str);
            if (code != null) {
                bundleB.putString("2_result", code.getLoggingValue());
            }
            JSONObject jSONObject = null;
            if (exc == null) {
                message = null;
            } else {
                message = exc.getMessage();
            }
            if (message != null) {
                bundleB.putString("5_error_message", exc.getMessage());
            }
            if (!map.isEmpty()) {
                jSONObject = new JSONObject(map);
            }
            if (map2 != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (key != null) {
                            jSONObject.put(key, value);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleB.putString("6_extras", jSONObject.toString());
            }
            this.logger.g(str2, bundleB);
            if (code == LoginClient.Result.Code.SUCCESS) {
                g(str);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void g(String str) {
        if (!i2.a.d(this)) {
            try {
                final Bundle bundleB = INSTANCE.b(str);
                f14699e.schedule(new Runnable() { // from class: com.facebook.login.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.h(this.f14696b, bundleB);
                    }
                }, 5L, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        }
    }

    public final void i(LoginClient.Request request, String str) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            ck.p.j(request, "pendingLoginRequest");
            Bundle bundleB = INSTANCE.b(request.getAuthId());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", request.getLoginBehavior().toString());
                jSONObject.put("request_code", LoginClient.INSTANCE.b());
                jSONObject.put("permissions", TextUtils.join(StringUtils.COMMA, request.p()));
                jSONObject.put("default_audience", request.getDefaultAudience().toString());
                jSONObject.put("isReauthorize", request.getIsRerequest());
                String str2 = this.facebookVersion;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (request.getLoginTargetApp() != null) {
                    jSONObject.put("target_app", request.getLoginTargetApp().getTargetApp());
                }
                bundleB.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.logger.g(str, bundleB);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void j(String str, String str2, String str3) {
        if (!i2.a.d(this)) {
            try {
                Bundle bundleB = INSTANCE.b("");
                bundleB.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
                bundleB.putString("5_error_message", str2);
                bundleB.putString("3_method", str3);
                this.logger.g(str, bundleB);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        }
    }
}
