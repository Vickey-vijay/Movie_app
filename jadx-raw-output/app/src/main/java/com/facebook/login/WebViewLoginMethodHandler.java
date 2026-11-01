package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.internal.j0;
import com.facebook.internal.o0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;

/* JADX INFO: compiled from: WebViewLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 12\u00020\u0001:\u00022\u0005B\u0011\b\u0016\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.B\u0011\b\u0016\u0012\u0006\u0010/\u001a\u00020\u0010¢\u0006\u0004\b-\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\b\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0016R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b\u0015\u0010 R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)¨\u00063"}, d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "", "j", "Lmj/r;", "c", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "p", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", VastAttributes.HORIZONTAL_POSITION, "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "Lcom/facebook/internal/o0;", "g", "Lcom/facebook/internal/o0;", "getLoginDialog", "()Lcom/facebook/internal/o0;", "setLoginDialog", "(Lcom/facebook/internal/o0;)V", "loginDialog", "", "h", "Ljava/lang/String;", "getE2e", "()Ljava/lang/String;", "setE2e", "(Ljava/lang/String;)V", "e2e", "i", "nameForLogging", "Lcom/facebook/AccessTokenSource;", "Lcom/facebook/AccessTokenSource;", "t", "()Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "source", "(Landroid/os/Parcel;)V", CampaignEx.JSON_KEY_AD_K, "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WebViewLoginMethodHandler extends WebLoginMethodHandler {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public o0 loginDialog;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String e2e;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final AccessTokenSource tokenSource;
    public static final Parcelable.Creator<WebViewLoginMethodHandler> CREATOR = new b();

    /* JADX INFO: compiled from: WebViewLoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0012\u0010\u0005\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\n\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0012\u0010\r\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0012\u0010\u0010\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u0012\u0010\u0012\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0006J\u0012\u0010\u0014\u001a\u00060\u0000R\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0006J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b\u001a\u0010!\"\u0004\b \u0010\"R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0017\u0010!\"\u0004\b\u001d\u0010\"¨\u0006*"}, d2 = {"Lcom/facebook/login/WebViewLoginMethodHandler$a;", "Lcom/facebook/internal/o0$a;", "", "e2e", "Lcom/facebook/login/WebViewLoginMethodHandler;", "l", "", "isChromeOS", "o", "authType", "j", "Lcom/facebook/login/LoginBehavior;", "loginBehavior", "p", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "q", "isFamilyLogin", "n", "shouldSkip", "r", "Lcom/facebook/internal/o0;", "a", "h", "Ljava/lang/String;", "redirect_uri", "i", "Lcom/facebook/login/LoginBehavior;", "Lcom/facebook/login/LoginTargetApp;", CampaignEx.JSON_KEY_AD_K, "Z", "shouldSkipDedupe", InneractiveMediationDefs.GENDER_MALE, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "applicationId", "Landroid/os/Bundle;", "parameters", "<init>", "(Lcom/facebook/login/WebViewLoginMethodHandler;Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends o0.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public String redirect_uri;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public LoginBehavior loginBehavior;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public LoginTargetApp targetApp;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public boolean isFamilyLogin;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public boolean shouldSkipDedupe;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public String e2e;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public String authType;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ WebViewLoginMethodHandler f14667o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WebViewLoginMethodHandler webViewLoginMethodHandler, Context context, String str, Bundle bundle) {
            super(context, str, "oauth", bundle);
            ck.p.j(webViewLoginMethodHandler, "this$0");
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(str, "applicationId");
            ck.p.j(bundle, "parameters");
            this.f14667o = webViewLoginMethodHandler;
            this.redirect_uri = "fbconnect://success";
            this.loginBehavior = LoginBehavior.NATIVE_WITH_FALLBACK;
            this.targetApp = LoginTargetApp.FACEBOOK;
        }

        public final String h() {
            String str = this.authType;
            if (str != null) {
                return str;
            }
            ck.p.B("authType");
            throw null;
        }

        public final String i() {
            String str = this.e2e;
            if (str != null) {
                return str;
            }
            ck.p.B("e2e");
            throw null;
        }

        public final a j(String authType) {
            ck.p.j(authType, "authType");
            k(authType);
            return this;
        }

        public final void k(String str) {
            ck.p.j(str, "<set-?>");
            this.authType = str;
        }

        public final a l(String e2e) {
            ck.p.j(e2e, "e2e");
            m(e2e);
            return this;
        }

        public final void m(String str) {
            ck.p.j(str, "<set-?>");
            this.e2e = str;
        }

        public final a n(boolean isFamilyLogin) {
            this.isFamilyLogin = isFamilyLogin;
            return this;
        }

        public final a o(boolean isChromeOS) {
            this.redirect_uri = isChromeOS ? "fbconnect://chrome_os_success" : "fbconnect://success";
            return this;
        }

        public final a p(LoginBehavior loginBehavior) {
            ck.p.j(loginBehavior, "loginBehavior");
            this.loginBehavior = loginBehavior;
            return this;
        }

        public final a q(LoginTargetApp targetApp) {
            ck.p.j(targetApp, "targetApp");
            this.targetApp = targetApp;
            return this;
        }

        public final a r(boolean shouldSkip) {
            this.shouldSkipDedupe = shouldSkip;
            return this;
        }

        @Override // com.facebook.internal.o0.a
        public o0 a() {
            String str;
            Bundle bundleE = getParameters();
            if (bundleE != null) {
                bundleE.putString("redirect_uri", this.redirect_uri);
                bundleE.putString("client_id", getApplicationId());
                bundleE.putString("e2e", i());
                if (this.targetApp == LoginTargetApp.INSTAGRAM) {
                    str = "token,signed_request,graph_domain,granted_scopes";
                } else {
                    str = "token,signed_request,graph_domain";
                }
                bundleE.putString("response_type", str);
                bundleE.putString("return_scopes", "true");
                bundleE.putString("auth_type", h());
                bundleE.putString("login_behavior", this.loginBehavior.name());
                if (this.isFamilyLogin) {
                    bundleE.putString("fx_app", this.targetApp.getTargetApp());
                }
                if (this.shouldSkipDedupe) {
                    bundleE.putString("skip_dedupe", "true");
                }
                o0.Companion bVar = o0.INSTANCE;
                Context context = getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String();
                if (context != null) {
                    return bVar.d(context, "oauth", bundleE, getTheme(), this.targetApp, getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String());
                }
                throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
    }

    /* JADX INFO: compiled from: WebViewLoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/WebViewLoginMethodHandler$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/WebViewLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/WebViewLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Parcelable.Creator<WebViewLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler createFromParcel(Parcel source) {
            ck.p.j(source, "source");
            return new WebViewLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WebViewLoginMethodHandler[] newArray(int size) {
            return new WebViewLoginMethodHandler[size];
        }
    }

    /* JADX INFO: compiled from: WebViewLoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/facebook/login/WebViewLoginMethodHandler$d", "Lcom/facebook/internal/o0$e;", "Landroid/os/Bundle;", "values", "Lcom/facebook/FacebookException;", "error", "Lmj/r;", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class d implements o0.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LoginClient.Request f14669b;

        public d(LoginClient.Request request) {
            this.f14669b = request;
        }

        @Override // com.facebook.internal.o0.e
        public void a(Bundle bundle, FacebookException facebookException) {
            WebViewLoginMethodHandler.this.x(this.f14669b, bundle, facebookException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        ck.p.j(loginClient, "loginClient");
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean j() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void c() {
        o0 o0Var = this.loginDialog;
        if (o0Var != null) {
            if (o0Var != null) {
                o0Var.cancel();
            }
            this.loginDialog = null;
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(LoginClient.Request request) {
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        Bundle bundleR = r(request);
        d dVar = new d(request);
        String strA = LoginClient.INSTANCE.a();
        this.e2e = strA;
        a("e2e", strA);
        FragmentActivity activity = e().getActivity();
        if (activity == null) {
            return 0;
        }
        boolean zR = j0.R(activity);
        a aVar = new a(this, activity, request.getApplicationId(), bundleR);
        String str = this.e2e;
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.loginDialog = aVar.l(str).o(zR).j(request.getAuthType()).p(request.getLoginBehavior()).q(request.getLoginTargetApp()).n(request.getIsFamilyLogin()).r(request.getShouldSkipAccountDeduplication()).g(dVar).a();
        FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
        facebookDialogFragment.setRetainInstance(true);
        facebookDialogFragment.j(this.loginDialog);
        facebookDialogFragment.show(activity.getSupportFragmentManager(), "FacebookDialogFragment");
        return 1;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    /* JADX INFO: renamed from: t, reason: from getter */
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ck.p.j(parcel, "dest");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.e2e);
    }

    public final void x(LoginClient.Request request, Bundle bundle, FacebookException facebookException) {
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        super.v(request, bundle, facebookException);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewLoginMethodHandler(Parcel parcel) {
        super(parcel);
        ck.p.j(parcel, "source");
        this.nameForLogging = "web_view";
        this.tokenSource = AccessTokenSource.WEB_VIEW;
        this.e2e = parcel.readString();
    }
}
