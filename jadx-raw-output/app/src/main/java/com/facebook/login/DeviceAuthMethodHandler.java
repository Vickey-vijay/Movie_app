package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;

/* JADX INFO: compiled from: DeviceAuthMethodHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 *2\u00020\u0001:\u0001+B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&B\u0011\b\u0014\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b%\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0014J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J~\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00112\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00112\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\"\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006,"}, d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "p", "Lcom/facebook/login/DeviceAuthDialog;", "s", "Lmj/r;", "t", "Ljava/lang/Exception;", "ex", "u", "", "accessToken", "applicationId", "userId", "", "permissions", "declinedPermissions", "expiredPermissions", "Lcom/facebook/AccessTokenSource;", "accessTokenSource", "Ljava/util/Date;", "expirationTime", "lastRefreshTime", "dataAccessExpirationTime", "v", "describeContents", "w", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "nameForLogging", "Lcom/facebook/login/LoginClient;", "loginClient", "<init>", "(Lcom/facebook/login/LoginClient;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", InneractiveMediationDefs.GENDER_FEMALE, "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DeviceAuthMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f14568g;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String nameForLogging;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new a();

    /* JADX INFO: compiled from: DeviceAuthMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/DeviceAuthMethodHandler$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthMethodHandler;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/DeviceAuthMethodHandler;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<DeviceAuthMethodHandler> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler createFromParcel(Parcel source) {
            ck.p.j(source, "source");
            return new DeviceAuthMethodHandler(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceAuthMethodHandler[] newArray(int size) {
            return new DeviceAuthMethodHandler[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthMethodHandler$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: DeviceAuthMethodHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler$b;", "", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthMethodHandler;", "CREATOR", "Landroid/os/Parcelable$Creator;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            if (DeviceAuthMethodHandler.f14568g == null) {
                DeviceAuthMethodHandler.f14568g = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = DeviceAuthMethodHandler.f14568g;
            if (scheduledThreadPoolExecutor == null) {
                ck.p.B("backgroundExecutor");
                throw null;
            }
            return scheduledThreadPoolExecutor;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        ck.p.j(loginClient, "loginClient");
        this.nameForLogging = "device_auth";
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
        w(request);
        return 1;
    }

    public DeviceAuthDialog s() {
        return new DeviceAuthDialog();
    }

    public void t() {
        e().g(LoginClient.Result.INSTANCE.a(e().getPendingRequest(), "User canceled log in."));
    }

    public void u(Exception exc) {
        ck.p.j(exc, "ex");
        e().g(LoginClient.Result.Companion.d(LoginClient.Result.INSTANCE, e().getPendingRequest(), null, exc.getMessage(), null, 8, null));
    }

    public void v(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        ck.p.j(str, "accessToken");
        ck.p.j(str2, "applicationId");
        ck.p.j(str3, "userId");
        e().g(LoginClient.Result.INSTANCE.e(e().getPendingRequest(), new AccessToken(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        ck.p.j(parcel, "parcel");
        this.nameForLogging = "device_auth";
    }

    public final void w(LoginClient.Request request) {
        FragmentActivity activity = e().getActivity();
        if (activity != null && !activity.isFinishing()) {
            DeviceAuthDialog deviceAuthDialogS = s();
            deviceAuthDialogS.show(activity.getSupportFragmentManager(), "login_with_facebook");
            deviceAuthDialogS.D(request);
        }
    }
}
