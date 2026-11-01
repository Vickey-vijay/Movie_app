package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.internal.d0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Set;
import kotlin.Metadata;
import q1.t;

/* JADX INFO: compiled from: InstagramAppLoginMethodHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Lcom/facebook/login/NativeAppLoginMethodHandler;", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "p", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lmj/r;", "writeToParcel", "", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/String;", "g", "()Ljava/lang/String;", "nameForLogging", "Lcom/facebook/AccessTokenSource;", "Lcom/facebook/AccessTokenSource;", "u", "()Lcom/facebook/AccessTokenSource;", "tokenSource", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "source", "(Landroid/os/Parcel;)V", "h", "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public final class InstagramAppLoginMethodHandler extends NativeAppLoginMethodHandler {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final AccessTokenSource tokenSource;
    public static final Parcelable.Creator<InstagramAppLoginMethodHandler> CREATOR = new a();

    /* JADX INFO: compiled from: InstagramAppLoginMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/InstagramAppLoginMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/InstagramAppLoginMethodHandler;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/InstagramAppLoginMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<InstagramAppLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler createFromParcel(Parcel source) {
            ck.p.j(source, "source");
            return new InstagramAppLoginMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InstagramAppLoginMethodHandler[] newArray(int size) {
            return new InstagramAppLoginMethodHandler[size];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        ck.p.j(loginClient, "loginClient");
        this.nameForLogging = "instagram_login";
        this.tokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: g, reason: from getter */
    public String getNameForLogging() {
        return this.nameForLogging;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public int p(LoginClient.Request request) {
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        LoginClient.Companion cVar = LoginClient.INSTANCE;
        String strA = cVar.a();
        d0 d0Var = d0.f14364a;
        Context activity = e().getActivity();
        if (activity == null) {
            activity = t.l();
        }
        String strC = request.getApplicationId();
        Set<String> setP = request.p();
        boolean zU = request.getIsRerequest();
        boolean zR = request.r();
        DefaultAudience defaultAudienceI = request.getDefaultAudience();
        if (defaultAudienceI == null) {
            defaultAudienceI = DefaultAudience.NONE;
        }
        Intent intentJ = d0.j(activity, strC, setP, strA, zU, zR, defaultAudienceI, d(request.getAuthId()), request.getAuthType(), request.getMessengerPageId(), request.getResetMessengerState(), request.getIsFamilyLogin(), request.getShouldSkipAccountDeduplication());
        a("e2e", strA);
        return B(intentJ, cVar.b()) ? 1 : 0;
    }

    @Override // com.facebook.login.NativeAppLoginMethodHandler
    /* JADX INFO: renamed from: u, reason: from getter */
    public AccessTokenSource getTokenSource() {
        return this.tokenSource;
    }

    @Override // com.facebook.login.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ck.p.j(parcel, "dest");
        super.writeToParcel(parcel, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        ck.p.j(parcel, "source");
        this.nameForLogging = "instagram_login";
        this.tokenSource = AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
    }
}
