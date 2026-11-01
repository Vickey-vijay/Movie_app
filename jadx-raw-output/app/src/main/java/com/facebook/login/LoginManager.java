package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.Profile;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import lk.x;
import nj.b0;
import nj.q0;
import q1.t;

/* JADX INFO: compiled from: LoginManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 &2\u00020\u0001:\u0003-O3B\u0007¢\u0006\u0004\bM\u0010NJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002JL\u0010\u0012\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002JH\u0010 \u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u000fH\u0002J,\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001dH\u0017J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0014J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0004H\u0014R$\u00101\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00107\u001a\u0002022\u0006\u0010,\u001a\u0002028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010@\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010=R\u0016\u0010C\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010BR$\u0010H\u001a\u00020D2\u0006\u0010,\u001a\u00020D8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010E\u001a\u0004\bF\u0010GR$\u0010I\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bI\u0010JR$\u0010L\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bK\u0010J¨\u0006P"}, d2 = {"Lcom/facebook/login/LoginManager;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/facebook/login/LoginClient$Request;", "loginRequest", "Lmj/r;", "i", "Lcom/facebook/login/LoginClient$Result$Code;", "result", "", "", "resultExtras", "Ljava/lang/Exception;", "exception", "", "wasLoginActivityTried", AdActivity.REQUEST_KEY_EXTRA, "h", "Landroid/content/Intent;", "intent", "l", "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "origRequest", "Lcom/facebook/FacebookException;", "isCanceled", "Lq1/i;", "Lcom/facebook/login/p;", "callback", InneractiveMediationDefs.GENDER_FEMALE, "isExpressLoginAllowed", InneractiveMediationDefs.GENDER_MALE, "", C3426d4.f.f28487f, "data", "j", "Lcom/facebook/login/k;", "loginConfig", "e", "g", "Lcom/facebook/login/LoginBehavior;", "<set-?>", "a", "Lcom/facebook/login/LoginBehavior;", "getLoginBehavior", "()Lcom/facebook/login/LoginBehavior;", "loginBehavior", "Lcom/facebook/login/DefaultAudience;", "b", "Lcom/facebook/login/DefaultAudience;", "getDefaultAudience", "()Lcom/facebook/login/DefaultAudience;", "defaultAudience", "Landroid/content/SharedPreferences;", "c", "Landroid/content/SharedPreferences;", "sharedPreferences", "d", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "authType", "messengerPageId", "Z", "resetMessengerState", "Lcom/facebook/login/LoginTargetApp;", "Lcom/facebook/login/LoginTargetApp;", "getLoginTargetApp", "()Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "isFamilyLogin", "()Z", "getShouldSkipAccountDeduplication", "shouldSkipAccountDeduplication", "<init>", "()V", "FacebookLoginActivityResultContract", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class LoginManager {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set<String> f14632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14633l;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String messengerPageId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean resetMessengerState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isFamilyLogin;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean shouldSkipAccountDeduplication;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public LoginBehavior loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public DefaultAudience defaultAudience = DefaultAudience.FRIENDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String authType = "rerequest";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public LoginTargetApp loginTargetApp = LoginTargetApp.FACEBOOK;

    /* JADX INFO: compiled from: LoginManager.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/facebook/login/LoginManager$FacebookLoginActivityResultContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Lq1/h$a;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "permissions", "Landroid/content/Intent;", "a", "", C3426d4.f.f28487f, "intent", "b", "Lq1/h;", "Lq1/h;", "getCallbackManager", "()Lq1/h;", "setCallbackManager", "(Lq1/h;)V", "callbackManager", "Ljava/lang/String;", "getLoggerID", "()Ljava/lang/String;", "setLoggerID", "(Ljava/lang/String;)V", "loggerID", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public final class FacebookLoginActivityResultContract extends ActivityResultContract<Collection<? extends String>, q1.h.ActivityResultParameters> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public q1.h callbackManager;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public String loggerID;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LoginManager f14645c;

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, Collection<String> permissions) {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(permissions, "permissions");
            LoginClient.Request requestE = this.f14645c.e(new k(permissions, null, 2, null));
            String str = this.loggerID;
            if (str != null) {
                requestE.v(str);
            }
            this.f14645c.i(context, requestE);
            Intent intentG = this.f14645c.g(requestE);
            if (this.f14645c.l(intentG)) {
                return intentG;
            }
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            this.f14645c.h(context, LoginClient.Result.Code.ERROR, null, facebookException, false, requestE);
            throw facebookException;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q1.h.ActivityResultParameters parseResult(int resultCode, Intent intent) {
            LoginManager.k(this.f14645c, resultCode, intent, null, 4, null);
            int requestCode = CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
            q1.h hVar = this.callbackManager;
            if (hVar != null) {
                hVar.onActivityResult(requestCode, resultCode, intent);
            }
            return new q1.h.ActivityResultParameters(requestCode, resultCode, intent);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginManager$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LoginManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/facebook/login/LoginManager$a;", "", "", "permission", "", "d", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/facebook/AccessToken;", "newToken", "Lcom/facebook/AuthenticationToken;", "newIdToken", "Lcom/facebook/login/p;", "b", "", "c", "()Ljava/util/Set;", "otherPublishPermissions", "EXPRESS_LOGIN_ALLOWED", "Ljava/lang/String;", "MANAGE_PERMISSION_PREFIX", "OTHER_PUBLISH_PERMISSIONS", "Ljava/util/Set;", "PREFERENCE_LOGIN_MANAGER", "PUBLISH_PERMISSION_PREFIX", "TAG", "Lcom/facebook/login/LoginManager;", C3605n2.f30210p, "Lcom/facebook/login/LoginManager;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final boolean d(String permission) {
            if (permission != null) {
                return x.R(permission, "publish", false, 2, null) || x.R(permission, "manage", false, 2, null) || LoginManager.f14632k.contains(permission);
            }
            return false;
        }

        @VisibleForTesting(otherwise = 2)
        public final LoginResult b(LoginClient.Request request, AccessToken newToken, AuthenticationToken newIdToken) {
            ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
            ck.p.j(newToken, "newToken");
            Set<String> setP = request.p();
            Set setS0 = b0.S0(b0.c0(newToken.j()));
            if (request.getIsRerequest()) {
                setS0.retainAll(setP);
            }
            Set setS1 = b0.S0(b0.c0(setP));
            setS1.removeAll(setS0);
            return new LoginResult(newToken, newIdToken, setS0, setS1);
        }

        public final Set<String> c() {
            return q0.j("ads_management", "create_event", "rsvp_event");
        }
    }

    /* JADX INFO: compiled from: LoginManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/login/LoginManager$b;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/facebook/login/o;", "a", "b", "Lcom/facebook/login/o;", "logger", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f14646a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static o logger;

        /* JADX WARN: Code duplicated, block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:14:0x0013 A[Catch: all -> 0x0008, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x000c  */
        public final synchronized o a(Context context) {
            if (context != null) {
                if (context == null) {
                    return null;
                }
                if (logger == null) {
                    logger = new o(context, t.m());
                }
                return logger;
            }
            context = t.l();
            if (context == null) {
                return null;
            }
            if (logger == null) {
                logger = new o(context, t.m());
            }
            return logger;
            throw th;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f14632k = companion.c();
        String string = LoginManager.class.toString();
        ck.p.i(string, "LoginManager::class.java.toString()");
        f14633l = string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean k(LoginManager loginManager, int i10, Intent intent, q1.i iVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i11 & 4) != 0) {
            iVar = null;
        }
        return loginManager.j(i10, intent, iVar);
    }

    public LoginClient.Request e(k loginConfig) {
        String codeVerifier;
        ck.p.j(loginConfig, "loginConfig");
        CodeChallengeMethod codeChallengeMethod = CodeChallengeMethod.S256;
        try {
            s sVar = s.f14711a;
            codeVerifier = s.b(loginConfig.getCodeVerifier(), codeChallengeMethod);
        } catch (FacebookException unused) {
            codeChallengeMethod = CodeChallengeMethod.PLAIN;
            codeVerifier = loginConfig.getCodeVerifier();
        }
        LoginBehavior loginBehavior = this.loginBehavior;
        Set setT0 = b0.T0(loginConfig.c());
        DefaultAudience defaultAudience = this.defaultAudience;
        String str = this.authType;
        String strM = t.m();
        String string = UUID.randomUUID().toString();
        ck.p.i(string, "randomUUID().toString()");
        LoginTargetApp loginTargetApp = this.loginTargetApp;
        String nonce = loginConfig.getNonce();
        String codeVerifier2 = loginConfig.getCodeVerifier();
        LoginClient.Request request = new LoginClient.Request(loginBehavior, setT0, defaultAudience, str, strM, string, loginTargetApp, nonce, codeVerifier2, codeVerifier, codeChallengeMethod);
        request.z(AccessToken.INSTANCE.g());
        request.x(this.messengerPageId);
        request.A(this.resetMessengerState);
        request.w(this.isFamilyLogin);
        request.B(this.shouldSkipAccountDeduplication);
        return request;
    }

    public final void f(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, FacebookException facebookException, boolean z10, q1.i<LoginResult> iVar) {
        if (accessToken != null) {
            AccessToken.INSTANCE.h(accessToken);
            Profile.INSTANCE.a();
        }
        if (authenticationToken != null) {
            AuthenticationToken.INSTANCE.a(authenticationToken);
        }
        if (iVar != null) {
            LoginResult loginResultB = (accessToken == null || request == null) ? null : INSTANCE.b(request, accessToken, authenticationToken);
            if (z10 || (loginResultB != null && loginResultB.a().isEmpty())) {
                iVar.onCancel();
                return;
            }
            if (facebookException != null) {
                iVar.a(facebookException);
            } else {
                if (accessToken == null || loginResultB == null) {
                    return;
                }
                m(true);
                iVar.onSuccess(loginResultB);
            }
        }
    }

    public Intent g(LoginClient.Request request) {
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        Intent intent = new Intent();
        intent.setClass(t.l(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable(AdActivity.REQUEST_KEY_EXTRA, request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final void h(Context context, LoginClient.Result.Code code, Map<String, String> map, Exception exc, boolean z10, LoginClient.Request request) {
        o oVarA = b.f14646a.a(context);
        if (oVarA == null) {
            return;
        }
        if (request == null) {
            o.k(oVarA, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z10 ? "1" : "0");
        oVarA.f(request.getAuthId(), map2, code, map, exc, request.getIsFamilyLogin() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    public final void i(Context context, LoginClient.Request request) {
        o oVarA = b.f14646a.a(context);
        if (oVarA == null || request == null) {
            return;
        }
        oVarA.i(request, request.getIsFamilyLogin() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    @VisibleForTesting(otherwise = 3)
    public boolean j(int resultCode, Intent data, q1.i<LoginResult> callback) {
        LoginClient.Result.Code code;
        boolean z10;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        LoginClient.Request request;
        Map<String, String> map;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.Code code2 = LoginClient.Result.Code.ERROR;
        FacebookException facebookException = null;
        boolean z11 = false;
        if (data != null) {
            data.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) data.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                request = result.com.vungle.ads.internal.ui.AdActivity.REQUEST_KEY_EXTRA java.lang.String;
                LoginClient.Result.Code code3 = result.code;
                if (resultCode != -1) {
                    z11 = resultCode == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (code3 == LoginClient.Result.Code.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    facebookException = new FacebookAuthorizationException(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                z10 = z11;
                authenticationToken = authenticationToken2;
                code = code3;
            } else {
                code = code2;
                accessToken = null;
                authenticationToken = null;
                request = null;
                map = null;
                z10 = false;
            }
        } else if (resultCode == 0) {
            code = LoginClient.Result.Code.CANCEL;
            z10 = true;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
        } else {
            code = code2;
            accessToken = null;
            authenticationToken = null;
            request = null;
            map = null;
            z10 = false;
        }
        if (facebookException == null && accessToken == null && !z10) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        LoginClient.Request request2 = request;
        h(null, code, map, facebookException2, true, request2);
        f(accessToken, authenticationToken, request2, facebookException2, z10, callback);
        return true;
    }

    public final void m(boolean z10) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putBoolean("express_login_allowed", z10);
        editorEdit.apply();
    }

    public LoginManager() {
        k0.m();
        SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.loginManager", 0);
        ck.p.i(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.sharedPreferences = sharedPreferences;
        if (t.hasCustomTabsPrefetching && com.facebook.internal.e.a() != null) {
            CustomTabsClient.bindCustomTabsService(t.l(), "com.android.chrome", new CustomTabPrefetchHelper());
            CustomTabsClient.connectAndInitialize(t.l(), t.l().getPackageName());
        }
    }

    public final boolean l(Intent intent) {
        if (t.l().getPackageManager().resolveActivity(intent, 0) == null) {
            return false;
        }
        return true;
    }
}
