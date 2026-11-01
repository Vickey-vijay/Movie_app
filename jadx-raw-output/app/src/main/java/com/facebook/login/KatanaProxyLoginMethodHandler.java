package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.d0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import q1.t;

/* JADX INFO: compiled from: KatanaProxyLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "p", "", "o", "describeContents", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "nameForLogging", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@VisibleForTesting(otherwise = 3)
public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new a();

    /* JADX INFO: compiled from: KatanaProxyLoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/KatanaProxyLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/KatanaProxyLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<KatanaProxyLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler createFromParcel(Parcel source) {
            ck.p.j(source, "source");
            return new KatanaProxyLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public KatanaProxyLoginMethodHandler[] newArray(int size) {
            return new KatanaProxyLoginMethodHandler[size];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        ck.p.j(loginClient, "loginClient");
        this.nameForLogging = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public boolean o() {
        return true;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(LoginClient.Request request) {
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        boolean z10 = t.ignoreAppSwitchToLoggedOut && com.facebook.internal.e.a() != null && request.getLoginBehavior().getAllowsCustomTabAuth();
        String strA = LoginClient.INSTANCE.a();
        d0 d0Var = d0.f14364a;
        FragmentActivity activity = e().getActivity();
        String strC = request.getApplicationId();
        Set<String> setP = request.p();
        boolean zU = request.getIsRerequest();
        boolean zR = request.r();
        DefaultAudience defaultAudienceI = request.getDefaultAudience();
        if (defaultAudienceI == null) {
            defaultAudienceI = DefaultAudience.NONE;
        }
        DefaultAudience defaultAudience = defaultAudienceI;
        String strD = d(request.getAuthId());
        String strE = request.getAuthType();
        String strN = request.getMessengerPageId();
        boolean zQ = request.getResetMessengerState();
        boolean zS = request.getIsFamilyLogin();
        boolean zC = request.getShouldSkipAccountDeduplication();
        String strO = request.getNonce();
        String strF = request.getCodeChallenge();
        CodeChallengeMethod codeChallengeMethodG = request.getCodeChallengeMethod();
        List<Intent> listN = d0.n(activity, strC, setP, strA, zU, zR, defaultAudience, strD, strE, z10, strN, zQ, zS, zC, strO, strF, codeChallengeMethodG == null ? null : codeChallengeMethodG.name());
        a("e2e", strA);
        Iterator<Intent> it = listN.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            if (B(it.next(), LoginClient.INSTANCE.b())) {
                return i10;
            }
        }
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
        ck.p.j(parcel, "source");
        this.nameForLogging = "katana_proxy_auth";
    }
}
