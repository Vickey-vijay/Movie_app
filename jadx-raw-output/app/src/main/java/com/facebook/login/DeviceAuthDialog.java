package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import ck.w;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.common.R$id;
import com.facebook.common.R$layout;
import com.facebook.common.R$string;
import com.facebook.common.R$style;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.j0;
import com.facebook.internal.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.squareup.picasso.Utils;
import com.vungle.ads.internal.ui.AdActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;
import q1.x;
import q1.z;

/* JADX INFO: compiled from: DeviceAuthDialog.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0003]7^B\u0007¢\u0006\u0004\b[\u0010\\J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001aH\u0015J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0014J\b\u0010\"\u001a\u00020\u000eH\u0014J\b\u0010#\u001a\u00020\u001aH\u0014J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020\u000eH\u0002J\b\u0010(\u001a\u00020\u000eH\u0002J<\u00101\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.H\u0002J)\u00104\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00172\u0006\u00103\u001a\u0002022\b\u00100\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J4\u00106\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.H\u0002R\u0016\u00109\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010<R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010O\u001a\b\u0012\u0002\b\u0003\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010SR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010VR\u0014\u0010Z\u001a\u00020W8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006_"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Landroid/app/Dialog;", "onCreateDialog", "Landroid/content/DialogInterface;", "dialog", "Lmj/r;", "onDismiss", "outState", "onSaveInstanceState", "onDestroyView", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "D", "", "", CampaignEx.JSON_KEY_AD_K, InneractiveMediationDefs.GENDER_MALE, "", "isSmartLogin", "p", "", "n", "Lcom/facebook/FacebookException;", "ex", "t", "s", "r", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "currentRequestState", "C", "w", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "userId", "Lcom/facebook/login/DeviceAuthDialog$b;", "permissions", "accessToken", "name", "Ljava/util/Date;", "expirationTime", "dataAccessExpirationTime", VastAttributes.HORIZONTAL_POSITION, "", "expiresIn", "u", "(Ljava/lang/String;JLjava/lang/Long;)V", "l", "b", "Landroid/view/View;", "progressBar", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "confirmationCode", "d", "instructions", "Lcom/facebook/login/DeviceAuthMethodHandler;", "e", "Lcom/facebook/login/DeviceAuthMethodHandler;", "deviceAuthMethodHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/concurrent/atomic/AtomicBoolean;", Utils.VERB_COMPLETED, "Lq1/x;", "g", "Lq1/x;", "currentGraphRequestPoll", "Ljava/util/concurrent/ScheduledFuture;", "h", "Ljava/util/concurrent/ScheduledFuture;", "scheduledPoll", "i", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "j", "Z", "isBeingDestroyed", "isRetry", "Lcom/facebook/login/LoginClient$Request;", "Lcom/facebook/GraphRequest;", "o", "()Lcom/facebook/GraphRequest;", "pollRequest", "<init>", "()V", "a", "RequestState", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
public class DeviceAuthDialog extends DialogFragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f14543n = "device/login";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f14544o = "device/login_status";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f14545p = 1349174;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public View progressBar;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public TextView confirmationCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public TextView instructions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public DeviceAuthMethodHandler deviceAuthMethodHandler;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean completed = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public volatile x currentGraphRequestPoll;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public volatile ScheduledFuture<?> scheduledPoll;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public volatile RequestState currentRequestState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isBeingDestroyed;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean isRetry;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public LoginClient.Request request;

    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0013B\t\b\u0010¢\u0006\u0004\b\"\u0010#B\u0011\b\u0014\u0012\u0006\u0010$\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010%J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016R(\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001d¨\u0006&"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcelable;", "", InneractiveMediationDefs.GENDER_FEMALE, "userCode", "Lmj/r;", "j", "", "lastPoll", "h", "", CampaignEx.JSON_KEY_AD_K, "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "<set-?>", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "authorizationUri", "d", "e", "i", "(Ljava/lang/String;)V", "requestCode", "J", "()J", "g", "(J)V", "interval", "<init>", "()V", "parcel", "(Landroid/os/Parcel;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class RequestState implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public String authorizationUri;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public String userCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public String requestCode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long interval;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public long lastPoll;
        public static final Parcelable.Creator<RequestState> CREATOR = new a();

        /* JADX INFO: compiled from: DeviceAuthDialog.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/DeviceAuthDialog$RequestState$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/DeviceAuthDialog$RequestState;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class a implements Parcelable.Creator<RequestState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestState createFromParcel(Parcel parcel) {
                ck.p.j(parcel, "parcel");
                return new RequestState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestState[] newArray(int size) {
                return new RequestState[size];
            }
        }

        public RequestState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public RequestState(Parcel parcel) {
            ck.p.j(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAuthorizationUri() {
            return this.authorizationUri;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getInterval() {
            return this.interval;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRequestCode() {
            return this.requestCode;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getUserCode() {
            return this.userCode;
        }

        public final void g(long j10) {
            this.interval = j10;
        }

        public final void h(long j10) {
            this.lastPoll = j10;
        }

        public final void i(String str) {
            this.requestCode = str;
        }

        public final void j(String str) {
            this.userCode = str;
            w wVar = w.f6066a;
            String str2 = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            ck.p.i(str2, "java.lang.String.format(locale, format, *args)");
            this.authorizationUri = str2;
        }

        public final boolean k() {
            return this.lastPoll != 0 && (new Date().getTime() - this.lastPoll) - (this.interval * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            ck.p.j(parcel, "dest");
            parcel.writeString(this.authorizationUri);
            parcel.writeString(this.userCode);
            parcel.writeString(this.requestCode);
            parcel.writeLong(this.interval);
            parcel.writeLong(this.lastPoll);
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthDialog$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$a;", "", "Lorg/json/JSONObject;", "result", "Lcom/facebook/login/DeviceAuthDialog$b;", "b", "", "LOGIN_ERROR_SUBCODE_AUTHORIZATION_DECLINED", "I", "LOGIN_ERROR_SUBCODE_CODE_EXPIRED", "LOGIN_ERROR_SUBCODE_EXCESSIVE_POLLING", "", "REQUEST_STATE_KEY", "Ljava/lang/String;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final b b(JSONObject result) throws JSONException {
            String strOptString;
            JSONArray jSONArray = result.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    String strOptString2 = jSONObjectOptJSONObject.optString("permission");
                    ck.p.i(strOptString2, "permission");
                    if (!(strOptString2.length() == 0) && !ck.p.e(strOptString2, "installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                        int iHashCode = strOptString.hashCode();
                        if (iHashCode != -1309235419) {
                            if (iHashCode != 280295099) {
                                if (iHashCode == 568196142 && strOptString.equals("declined")) {
                                    arrayList2.add(strOptString2);
                                }
                            } else if (strOptString.equals("granted")) {
                                arrayList.add(strOptString2);
                            }
                        } else if (strOptString.equals("expired")) {
                            arrayList3.add(strOptString2);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B1\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\f\u0010\tR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\u000e\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/facebook/login/DeviceAuthDialog$b;", "", "", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "setGrantedPermissions", "(Ljava/util/List;)V", "grantedPermissions", "b", "setDeclinedPermissions", "declinedPermissions", "setExpiredPermissions", "expiredPermissions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public List<String> grantedPermissions;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public List<String> declinedPermissions;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public List<String> expiredPermissions;

        public b(List<String> list, List<String> list2, List<String> list3) {
            ck.p.j(list, "grantedPermissions");
            ck.p.j(list2, "declinedPermissions");
            ck.p.j(list3, "expiredPermissions");
            this.grantedPermissions = list;
            this.declinedPermissions = list2;
            this.expiredPermissions = list3;
        }

        public final List<String> a() {
            return this.declinedPermissions;
        }

        public final List<String> b() {
            return this.expiredPermissions;
        }

        public final List<String> c() {
            return this.grantedPermissions;
        }
    }

    /* JADX INFO: compiled from: DeviceAuthDialog.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/facebook/login/DeviceAuthDialog$c", "Landroid/app/Dialog;", "Lmj/r;", "onBackPressed", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class c extends Dialog {
        public c(FragmentActivity fragmentActivity, int i10) {
            super(fragmentActivity, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (DeviceAuthDialog.this.r()) {
                super.onBackPressed();
            }
        }
    }

    public Map<String, String> k() {
        return null;
    }

    public final void l(String str, b bVar, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.v(str2, t.m(), str, bVar.c(), bVar.a(), bVar.b(), AccessTokenSource.DEVICE_AUTH, date, null, date2);
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.isBeingDestroyed = true;
        this.completed.set(true);
        super.onDestroyView();
        x xVar = this.currentGraphRequestPoll;
        if (xVar != null) {
            xVar.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.scheduledPoll;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    public boolean r() {
        return true;
    }

    public static final void B(DeviceAuthDialog deviceAuthDialog) {
        ck.p.j(deviceAuthDialog, "this$0");
        deviceAuthDialog.w();
    }

    public static final void E(DeviceAuthDialog deviceAuthDialog, z zVar) {
        ck.p.j(deviceAuthDialog, "this$0");
        ck.p.j(zVar, "response");
        if (deviceAuthDialog.isBeingDestroyed) {
            return;
        }
        if (zVar.getError() != null) {
            FacebookRequestError error = zVar.getError();
            FacebookException exception = error == null ? null : error.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            deviceAuthDialog.t(exception);
            return;
        }
        JSONObject graphObject = zVar.getGraphObject();
        if (graphObject == null) {
            graphObject = new JSONObject();
        }
        RequestState requestState = new RequestState();
        try {
            requestState.j(graphObject.getString("user_code"));
            requestState.i(graphObject.getString("code"));
            requestState.g(graphObject.getLong("interval"));
            deviceAuthDialog.C(requestState);
        } catch (JSONException e10) {
            deviceAuthDialog.t(new FacebookException(e10));
        }
    }

    public static final void j(DeviceAuthDialog deviceAuthDialog, z zVar) {
        ck.p.j(deviceAuthDialog, "this$0");
        ck.p.j(zVar, "response");
        if (deviceAuthDialog.completed.get()) {
            return;
        }
        FacebookRequestError error = zVar.getError();
        if (error == null) {
            try {
                JSONObject graphObject = zVar.getGraphObject();
                if (graphObject == null) {
                    graphObject = new JSONObject();
                }
                String string = graphObject.getString("access_token");
                ck.p.i(string, "resultObject.getString(\"access_token\")");
                deviceAuthDialog.u(string, graphObject.getLong("expires_in"), Long.valueOf(graphObject.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e10) {
                deviceAuthDialog.t(new FacebookException(e10));
                return;
            }
        }
        int subErrorCode = error.getSubErrorCode();
        boolean z10 = true;
        if (subErrorCode != f14545p && subErrorCode != 1349172) {
            z10 = false;
        }
        if (z10) {
            deviceAuthDialog.A();
            return;
        }
        if (subErrorCode != 1349152) {
            if (subErrorCode == 1349173) {
                deviceAuthDialog.s();
                return;
            }
            FacebookRequestError error2 = zVar.getError();
            FacebookException exception = error2 == null ? null : error2.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            deviceAuthDialog.t(exception);
            return;
        }
        RequestState requestState = deviceAuthDialog.currentRequestState;
        if (requestState != null) {
            d2.a aVar = d2.a.f51792a;
            d2.a.a(requestState.getUserCode());
        }
        LoginClient.Request request = deviceAuthDialog.request;
        if (request != null) {
            deviceAuthDialog.D(request);
        } else {
            deviceAuthDialog.s();
        }
    }

    public static final void q(DeviceAuthDialog deviceAuthDialog, View view) {
        ck.p.j(deviceAuthDialog, "this$0");
        deviceAuthDialog.s();
    }

    public static final void v(DeviceAuthDialog deviceAuthDialog, String str, Date date, Date date2, z zVar) {
        EnumSet<SmartLoginOption> enumSetJ;
        ck.p.j(deviceAuthDialog, "this$0");
        ck.p.j(str, "$accessToken");
        ck.p.j(zVar, "response");
        if (deviceAuthDialog.completed.get()) {
            return;
        }
        FacebookRequestError error = zVar.getError();
        if (error != null) {
            FacebookException exception = error.getException();
            if (exception == null) {
                exception = new FacebookException();
            }
            deviceAuthDialog.t(exception);
            return;
        }
        try {
            JSONObject graphObject = zVar.getGraphObject();
            if (graphObject == null) {
                graphObject = new JSONObject();
            }
            String string = graphObject.getString("id");
            ck.p.i(string, "jsonObject.getString(\"id\")");
            b bVarB = INSTANCE.b(graphObject);
            String string2 = graphObject.getString("name");
            ck.p.i(string2, "jsonObject.getString(\"name\")");
            RequestState requestState = deviceAuthDialog.currentRequestState;
            if (requestState != null) {
                d2.a aVar = d2.a.f51792a;
                d2.a.a(requestState.getUserCode());
            }
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
            com.facebook.internal.q qVarF = FetchedAppSettingsManager.f(t.m());
            Boolean boolValueOf = null;
            if (qVarF != null && (enumSetJ = qVarF.j()) != null) {
                boolValueOf = Boolean.valueOf(enumSetJ.contains(SmartLoginOption.RequireConfirm));
            }
            if (!ck.p.e(boolValueOf, Boolean.TRUE) || deviceAuthDialog.isRetry) {
                deviceAuthDialog.l(string, bVarB, str, date, date2);
            } else {
                deviceAuthDialog.isRetry = true;
                deviceAuthDialog.x(string, bVarB, str, string2, date, date2);
            }
        } catch (JSONException e10) {
            deviceAuthDialog.t(new FacebookException(e10));
        }
    }

    public static final void y(DeviceAuthDialog deviceAuthDialog, String str, b bVar, String str2, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        ck.p.j(deviceAuthDialog, "this$0");
        ck.p.j(str, "$userId");
        ck.p.j(bVar, "$permissions");
        ck.p.j(str2, "$accessToken");
        deviceAuthDialog.l(str, bVar, str2, date, date2);
    }

    public static final void z(DeviceAuthDialog deviceAuthDialog, DialogInterface dialogInterface, int i10) {
        ck.p.j(deviceAuthDialog, "this$0");
        View viewP = deviceAuthDialog.p(false);
        Dialog dialog = deviceAuthDialog.getDialog();
        if (dialog != null) {
            dialog.setContentView(viewP);
        }
        LoginClient.Request request = deviceAuthDialog.request;
        if (request == null) {
            return;
        }
        deviceAuthDialog.D(request);
    }

    public final void A() {
        RequestState requestState = this.currentRequestState;
        Long lValueOf = requestState == null ? null : Long.valueOf(requestState.getInterval());
        if (lValueOf != null) {
            this.scheduledPoll = DeviceAuthMethodHandler.INSTANCE.a().schedule(new Runnable() { // from class: com.facebook.login.b
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceAuthDialog.B(this.f14673b);
                }
            }, lValueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    public final void C(RequestState requestState) {
        this.currentRequestState = requestState;
        TextView textView = this.confirmationCode;
        if (textView == null) {
            ck.p.B("confirmationCode");
            throw null;
        }
        textView.setText(requestState.getUserCode());
        d2.a aVar = d2.a.f51792a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), d2.a.c(requestState.getAuthorizationUri()));
        TextView textView2 = this.instructions;
        if (textView2 == null) {
            ck.p.B("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.confirmationCode;
        if (textView3 == null) {
            ck.p.B("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.progressBar;
        if (view == null) {
            ck.p.B("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.isRetry && d2.a.f(requestState.getUserCode())) {
            new com.facebook.appevents.x(getContext()).f("fb_smart_login_service");
        }
        if (requestState.k()) {
            A();
        } else {
            w();
        }
    }

    public void D(LoginClient.Request request) {
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        this.request = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(StringUtils.COMMA, request.p()));
        j0 j0Var = j0.f14425a;
        j0.l0(bundle, "redirect_uri", request.getDeviceRedirectUriString());
        j0.l0(bundle, "target_user_id", request.getDeviceAuthTargetUserId());
        bundle.putString("access_token", m());
        d2.a aVar = d2.a.f51792a;
        Map<String, String> mapK = k();
        bundle.putString("device_info", d2.a.d(mapK == null ? null : kotlin.collections.a.B(mapK)));
        GraphRequest.INSTANCE.B(null, f14543n, bundle, new GraphRequest.b() { // from class: com.facebook.login.d
            @Override // com.facebook.GraphRequest.b
            public final void b(z zVar) {
                DeviceAuthDialog.E(this.f14675a, zVar);
            }
        }).l();
    }

    public String m() {
        return k0.b() + '|' + k0.c();
    }

    @LayoutRes
    public int n(boolean isSmartLogin) {
        return isSmartLogin ? R$layout.com_facebook_smart_device_dialog_fragment : R$layout.com_facebook_device_auth_dialog_fragment;
    }

    public final GraphRequest o() {
        Bundle bundle = new Bundle();
        RequestState requestState = this.currentRequestState;
        bundle.putString("code", requestState == null ? null : requestState.getRequestCode());
        bundle.putString("access_token", m());
        return GraphRequest.INSTANCE.B(null, f14544o, bundle, new GraphRequest.b() { // from class: com.facebook.login.c
            @Override // com.facebook.GraphRequest.b
            public final void b(z zVar) {
                DeviceAuthDialog.j(this.f14674a, zVar);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RequestState requestState;
        LoginClient loginClientJ;
        ck.p.j(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) requireActivity()).getCurrentFragment();
        LoginMethodHandler loginMethodHandlerI = null;
        if (loginFragment != null && (loginClientJ = loginFragment.j()) != null) {
            loginMethodHandlerI = loginClientJ.i();
        }
        this.deviceAuthMethodHandler = (DeviceAuthMethodHandler) loginMethodHandlerI;
        if (savedInstanceState != null && (requestState = (RequestState) savedInstanceState.getParcelable("request_state")) != null) {
            C(requestState);
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        ck.p.j(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        if (this.isBeingDestroyed) {
            return;
        }
        s();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        ck.p.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        if (this.currentRequestState != null) {
            bundle.putParcelable("request_state", this.currentRequestState);
        }
    }

    public void s() {
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                d2.a aVar = d2.a.f51792a;
                d2.a.a(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.t();
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public void t(FacebookException facebookException) {
        ck.p.j(facebookException, "ex");
        if (this.completed.compareAndSet(false, true)) {
            RequestState requestState = this.currentRequestState;
            if (requestState != null) {
                d2.a aVar = d2.a.f51792a;
                d2.a.a(requestState.getUserCode());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.deviceAuthMethodHandler;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.u(facebookException);
            }
            Dialog dialog = getDialog();
            if (dialog == null) {
                return;
            }
            dialog.dismiss();
        }
    }

    public final void u(final String accessToken, long expiresIn, Long dataAccessExpirationTime) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = expiresIn != 0 ? new Date(new Date().getTime() + (expiresIn * 1000)) : null;
        if ((dataAccessExpirationTime == null || dataAccessExpirationTime.longValue() != 0) && dataAccessExpirationTime != null) {
            date = new Date(dataAccessExpirationTime.longValue() * 1000);
        }
        GraphRequest graphRequestX = GraphRequest.INSTANCE.x(new AccessToken(accessToken, t.m(), "0", null, null, null, null, date2, null, date, null, 1024, null), "me", new GraphRequest.b() { // from class: com.facebook.login.f
            @Override // com.facebook.GraphRequest.b
            public final void b(z zVar) {
                DeviceAuthDialog.v(this.f14677a, accessToken, date2, date, zVar);
            }
        });
        graphRequestX.F(HttpMethod.GET);
        graphRequestX.G(bundle);
        graphRequestX.l();
    }

    public final void w() {
        RequestState requestState = this.currentRequestState;
        if (requestState != null) {
            requestState.h(new Date().getTime());
        }
        this.currentGraphRequestPoll = o().l();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        boolean z10;
        c cVar = new c(requireActivity(), R$style.com_facebook_auth_dialog);
        if (d2.a.e() && !this.isRetry) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.setContentView(p(z10));
        return cVar;
    }

    public View p(boolean isSmartLogin) {
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        ck.p.i(layoutInflater, "requireActivity().layoutInflater");
        View viewInflate = layoutInflater.inflate(n(isSmartLogin), (ViewGroup) null);
        ck.p.i(viewInflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View viewFindViewById = viewInflate.findViewById(R$id.progress_bar);
        ck.p.i(viewFindViewById, "view.findViewById(R.id.progress_bar)");
        this.progressBar = viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R$id.confirmation_code);
        if (viewFindViewById2 != null) {
            this.confirmationCode = (TextView) viewFindViewById2;
            View viewFindViewById3 = viewInflate.findViewById(R$id.cancel_button);
            if (viewFindViewById3 != null) {
                ((Button) viewFindViewById3).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        DeviceAuthDialog.q(this.f14676b, view);
                    }
                });
                View viewFindViewById4 = viewInflate.findViewById(R$id.com_facebook_device_auth_instructions);
                if (viewFindViewById4 != null) {
                    TextView textView = (TextView) viewFindViewById4;
                    this.instructions = textView;
                    textView.setText(Html.fromHtml(getString(R$string.com_facebook_device_auth_instructions)));
                    return viewInflate;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void x(final String str, final b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = getResources().getString(R$string.com_facebook_smart_login_confirmation_title);
        ck.p.i(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = getResources().getString(R$string.com_facebook_smart_login_confirmation_continue_as);
        ck.p.i(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = getResources().getString(R$string.com_facebook_smart_login_confirmation_cancel);
        ck.p.i(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        w wVar = w.f6066a;
        String str4 = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        ck.p.i(str4, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: com.facebook.login.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DeviceAuthDialog.y(this.f14681b, str, bVar, str2, date, date2, dialogInterface, i10);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.facebook.login.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                DeviceAuthDialog.z(this.f14687b, dialogInterface, i10);
            }
        });
        builder.create().show();
    }
}
