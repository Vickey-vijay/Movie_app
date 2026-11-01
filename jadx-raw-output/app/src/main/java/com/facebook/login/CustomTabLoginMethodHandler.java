package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.internal.j0;
import com.facebook.internal.v;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;
import lk.x;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: CustomTabLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 52\u00020\u0001:\u00016B\u0011\b\u0016\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102B\u0011\b\u0010\u0012\u0006\u00103\u001a\u00020\u0014¢\u0006\u0004\b1\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0016J\u001a\u0010\u0019\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u001a\u0010%\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010$R\u001a\u0010*\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0016\u0010.\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010$¨\u00067"}, d2 = {"Lcom/facebook/login/CustomTabLoginMethodHandler;", "Lcom/facebook/login/WebLoginMethodHandler;", "", "h", "s", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "p", "requestCode", C3426d4.f.f28487f, "Landroid/content/Intent;", "data", "", CampaignEx.JSON_KEY_AD_K, "Lorg/json/JSONObject;", "param", "Lmj/r;", InneractiveMediationDefs.GENDER_MALE, "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "url", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/os/Bundle;", "values", "C", "g", "Ljava/lang/String;", "currentPackage", "expectedChallenge", "i", "validRedirectURI", "j", "()Ljava/lang/String;", "nameForLogging", "Lcom/facebook/AccessTokenSource;", "Lcom/facebook/AccessTokenSource;", "t", "()Lcom/facebook/AccessTokenSource;", "tokenSource", "z", "developerDefinedRedirectURI", VastAttributes.VERTICAL_POSITION, "chromePackage", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "source", "(Landroid/os/Parcel;)V", "l", "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f14531m;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public String currentPackage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String expectedChallenge;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public String validRedirectURI;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final AccessTokenSource tokenSource;
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new a();

    /* JADX INFO: compiled from: CustomTabLoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/CustomTabLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/CustomTabLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/CustomTabLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<CustomTabLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler createFromParcel(Parcel source) {
            ck.p.j(source, "source");
            return new CustomTabLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CustomTabLoginMethodHandler[] newArray(int size) {
            return new CustomTabLoginMethodHandler[size];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        ck.p.j(loginClient, "loginClient");
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = j0.s(20);
        f14531m = false;
        com.facebook.internal.e eVar = com.facebook.internal.e.f14375a;
        this.validRedirectURI = com.facebook.internal.e.c(z());
    }

    public static void safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(Fragment p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/fragment/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "com.facebook");
        p10.startActivityForResult(p11, p12);
    }

    public final boolean C(Bundle values) {
        try {
            String string = values.getString("state");
            if (string == null) {
                return false;
            }
            return ck.p.e(new JSONObject(string).getString("7_challenge"), this.expectedChallenge);
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean k(int requestCode, int resultCode, Intent data) {
        if (data != null && data.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
            return super.k(requestCode, resultCode, data);
        }
        if (requestCode != 1) {
            return super.k(requestCode, resultCode, data);
        }
        LoginClient.Request requestN = e().getPendingRequest();
        if (requestN == null) {
            return false;
        }
        if (resultCode == -1) {
            A(data != null ? data.getStringExtra(CustomTabMainActivity.EXTRA_URL) : null, requestN);
            return true;
        }
        super.v(requestN, null, new FacebookOperationCanceledException());
        return false;
    }

    @Override // com.facebook.login.WebLoginMethodHandler
    public String s() {
        return "chrome_custom_tab";
    }

    public static final void B(CustomTabLoginMethodHandler customTabLoginMethodHandler, LoginClient.Request request, Bundle bundle) {
        ck.p.j(customTabLoginMethodHandler, "this$0");
        ck.p.j(request, "$request");
        ck.p.j(bundle, "$values");
        try {
            customTabLoginMethodHandler.v(request, customTabLoginMethodHandler.l(request, bundle), null);
        } catch (FacebookException e10) {
            customTabLoginMethodHandler.v(request, null, e10);
        }
    }

    public final void A(String str, final LoginClient.Request request) {
        int i10;
        if (str != null) {
            if (x.R(str, "fbconnect://cct.", false, 2, null) || x.R(str, super.getValidRedirectURI(), false, 2, null)) {
                Uri uri = Uri.parse(str);
                j0 j0Var = j0.f14425a;
                final Bundle bundleJ0 = j0.j0(uri.getQuery());
                bundleJ0.putAll(j0.j0(uri.getFragment()));
                if (!C(bundleJ0)) {
                    super.v(request, null, new FacebookException("Invalid state parameter"));
                    return;
                }
                String string = bundleJ0.getString("error");
                if (string == null) {
                    string = bundleJ0.getString("error_type");
                }
                String string2 = bundleJ0.getString("error_msg");
                if (string2 == null) {
                    string2 = bundleJ0.getString("error_message");
                }
                if (string2 == null) {
                    string2 = bundleJ0.getString("error_description");
                }
                String string3 = bundleJ0.getString("error_code");
                if (string3 == null) {
                    i10 = -1;
                } else {
                    try {
                        i10 = Integer.parseInt(string3);
                    } catch (NumberFormatException unused) {
                        i10 = -1;
                    }
                }
                if (j0.X(string) && j0.X(string2) && i10 == -1) {
                    if (bundleJ0.containsKey("access_token")) {
                        super.v(request, bundleJ0, null);
                        return;
                    } else {
                        t.t().execute(new Runnable() { // from class: com.facebook.login.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                CustomTabLoginMethodHandler.B(this.f14670b, request, bundleJ0);
                            }
                        });
                        return;
                    }
                }
                if (string != null && (ck.p.e(string, "access_denied") || ck.p.e(string, "OAuthAccessDeniedException"))) {
                    super.v(request, null, new FacebookOperationCanceledException());
                } else if (i10 == 4201) {
                    super.v(request, null, new FacebookOperationCanceledException());
                } else {
                    super.v(request, null, new FacebookServiceException(new FacebookRequestError(i10, string, string2), string2));
                }
            }
        }
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getValidRedirectURI() {
        return this.validRedirectURI;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public void m(JSONObject jSONObject) throws JSONException {
        ck.p.j(jSONObject, "param");
        jSONObject.put("7_challenge", this.expectedChallenge);
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(LoginClient.Request request) {
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        LoginClient loginClientE = e();
        if (getValidRedirectURI().length() == 0) {
            return 0;
        }
        Bundle bundleQ = q(r(request), request);
        if (f14531m) {
            bundleQ.putString("cct_over_app_switch", "1");
        }
        if (t.hasCustomTabsPrefetching) {
            if (request.t()) {
                CustomTabPrefetchHelper.INSTANCE.c(v.INSTANCE.a("oauth", bundleQ));
            } else {
                CustomTabPrefetchHelper.INSTANCE.c(com.facebook.internal.d.INSTANCE.a("oauth", bundleQ));
            }
        }
        FragmentActivity activity = loginClientE.getActivity();
        if (activity == null) {
            return 0;
        }
        Intent intent = new Intent(activity, (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.EXTRA_ACTION, "oauth");
        intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, bundleQ);
        intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, y());
        intent.putExtra(CustomTabMainActivity.EXTRA_TARGET_APP, request.getLoginTargetApp().getTargetApp());
        Fragment fragmentJ = loginClientE.getMe.goldze.mvvmhabit.base.ContainerActivity.FRAGMENT java.lang.String();
        if (fragmentJ != null) {
            safedk_Fragment_startActivityForResult_6fd6bf7695baae8f1a141a4d4340bbe1(fragmentJ, intent, 1);
        }
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
        parcel.writeString(this.expectedChallenge);
    }

    public final String y() {
        String str = this.currentPackage;
        if (str != null) {
            return str;
        }
        String strA = com.facebook.internal.e.a();
        this.currentPackage = strA;
        return strA;
    }

    public final String z() {
        return super.getValidRedirectURI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        ck.p.j(parcel, "source");
        this.nameForLogging = "custom_tab";
        this.tokenSource = AccessTokenSource.CHROME_CUSTOM_TAB;
        this.expectedChallenge = parcel.readString();
        com.facebook.internal.e eVar = com.facebook.internal.e.f14375a;
        this.validRedirectURI = com.facebook.internal.e.c(z());
    }
}
