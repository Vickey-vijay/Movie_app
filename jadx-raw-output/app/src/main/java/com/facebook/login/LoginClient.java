package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.common.R$string;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.j0;
import com.facebook.internal.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.ironsource.K5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.ui.AdActivity;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: LoginClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 Y2\u00020\u0001:\u0005\t\u0019%xyB\u0011\b\u0016\u0012\u0006\u0010C\u001a\u00020=¢\u0006\u0004\bu\u0010BB\u0011\b\u0016\u0012\u0006\u0010v\u001a\u000201¢\u0006\u0004\bu\u0010wJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J2\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000fH\u0002JF\u0010\u0014\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0019\u001a\u00020\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aJ \u0010!\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\u001f\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u0006\u0010%\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0002J\u0006\u0010'\u001a\u00020\u0007J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010)\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010+\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\nJ\u0006\u0010.\u001a\u00020\u0002J\u0006\u0010/\u001a\u00020\u0002J\b\u00100\u001a\u00020\u001cH\u0016J\u0018\u00104\u001a\u00020\u00022\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u001cH\u0016R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010;R.\u0010C\u001a\u0004\u0018\u00010=2\b\u0010\u0006\u001a\u0004\u0018\u00010=8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010J\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010Q\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010W\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010]\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010_\u001a\u0004\bd\u0010a\"\u0004\be\u0010cR\u0018\u0010i\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010hR\u0016\u0010k\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010;R\u0016\u0010m\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010;R\u0014\u0010o\u001a\u00020g8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010nR\u0013\u0010s\u001a\u0004\u0018\u00010p8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bj\u0010T¨\u0006z"}, d2 = {"Lcom/facebook/login/LoginClient;", "Landroid/os/Parcelable;", "Lmj/r;", "h", "", C3426d4.i.W, "value", "", "accumulate", "a", "Lcom/facebook/login/LoginClient$Result;", K5.f26927b, "s", "method", "result", "", "loggingExtras", "o", "errorMessage", IronSourceConstants.EVENTS_ERROR_CODE, "p", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, VastAttributes.HORIZONTAL_POSITION, "b", "c", "Lcom/facebook/login/LoginMethodHandler;", "i", "", "requestCode", C3426d4.f.f28487f, "Landroid/content/Intent;", "data", "t", "", CampaignEx.JSON_KEY_AD_K, "(Lcom/facebook/login/LoginClient$Request;)[Lcom/facebook/login/LoginMethodHandler;", "d", "z", VastAttributes.VERTICAL_POSITION, "g", InneractiveMediationDefs.GENDER_FEMALE, "permission", "e", "pendingResult", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "q", "r", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "[Lcom/facebook/login/LoginMethodHandler;", "getHandlersToTry", "()[Lcom/facebook/login/LoginMethodHandler;", "setHandlersToTry", "([Lcom/facebook/login/LoginMethodHandler;)V", "handlersToTry", "I", "currentHandler", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/Fragment;", "j", "()Landroidx/fragment/app/Fragment;", "v", "(Landroidx/fragment/app/Fragment;)V", ContainerActivity.FRAGMENT, "Lcom/facebook/login/LoginClient$d;", "Lcom/facebook/login/LoginClient$d;", "getOnCompletedListener", "()Lcom/facebook/login/LoginClient$d;", "w", "(Lcom/facebook/login/LoginClient$d;)V", "onCompletedListener", "Lcom/facebook/login/LoginClient$a;", "Lcom/facebook/login/LoginClient$a;", "getBackgroundProcessingListener", "()Lcom/facebook/login/LoginClient$a;", "u", "(Lcom/facebook/login/LoginClient$a;)V", "backgroundProcessingListener", "Z", "getCheckedInternetPermission", "()Z", "setCheckedInternetPermission", "(Z)V", "checkedInternetPermission", "Lcom/facebook/login/LoginClient$Request;", "n", "()Lcom/facebook/login/LoginClient$Request;", "setPendingRequest", "(Lcom/facebook/login/LoginClient$Request;)V", "pendingRequest", "", "Ljava/util/Map;", "getLoggingExtras", "()Ljava/util/Map;", "setLoggingExtras", "(Ljava/util/Map;)V", "getExtraData", "setExtraData", "extraData", "Lcom/facebook/login/o;", "Lcom/facebook/login/o;", "loginLogger", "l", "numActivitiesReturned", InneractiveMediationDefs.GENDER_MALE, "numTotalIntentsFired", "()Lcom/facebook/login/o;", "logger", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "inProgress", "<init>", "source", "(Landroid/os/Parcel;)V", "Request", "Result", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class LoginClient implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public LoginMethodHandler[] handlersToTry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int currentHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Fragment fragment;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public d onCompletedListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public a backgroundProcessingListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean checkedInternetPermission;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public Request pendingRequest;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Map<String, String> loggingExtras;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Map<String, String> extraData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public o loginLogger;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int numActivitiesReturned;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int numTotalIntentsFired;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LoginClient> CREATOR = new b();

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Q2\u00020\u0001:\u0001\u000fB}\b\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u0006\u00107\u001a\u00020\u0015\u0012\u0006\u0010&\u001a\u00020\u0015\u0012\u0006\u0010*\u001a\u00020\u0015\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010A\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010M¢\u0006\u0004\bT\u0010UB\u0011\b\u0012\u0012\u0006\u0010V\u001a\u00020\n¢\u0006\u0004\bT\u0010WJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0016\u0010%R\"\u0010*\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010$\u001a\u0004\b\u001e\u0010%\"\u0004\b(\u0010)R\"\u00101\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00105\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010%\"\u0004\b4\u0010)R\"\u00107\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010$\u001a\u0004\b#\u0010%\"\u0004\b6\u0010)R$\u0010:\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010$\u001a\u0004\b8\u0010%\"\u0004\b9\u0010)R$\u0010=\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010$\u001a\u0004\b;\u0010%\"\u0004\b<\u0010)R\"\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\u0017\u0010E\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bB\u0010DR\"\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\bF\u0010.\"\u0004\bG\u00100R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010,R\u0017\u0010J\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\bI\u0010%R\u0019\u0010K\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b>\u0010$\u001a\u0004\b2\u0010%R\u0019\u0010L\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010%R\u0019\u0010P\u001a\u0004\u0018\u00010M8\u0006¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\b+\u0010OR\u0011\u0010R\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bQ\u0010.¨\u0006X"}, d2 = {"Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcelable;", "", "C", "shouldSkipAccountDeduplication", "Lmj/r;", "B", "r", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "Lcom/facebook/login/LoginBehavior;", "b", "Lcom/facebook/login/LoginBehavior;", "l", "()Lcom/facebook/login/LoginBehavior;", "loginBehavior", "", "", "c", "Ljava/util/Set;", "p", "()Ljava/util/Set;", VastAttributes.VERTICAL_POSITION, "(Ljava/util/Set;)V", "permissions", "Lcom/facebook/login/DefaultAudience;", "d", "Lcom/facebook/login/DefaultAudience;", "i", "()Lcom/facebook/login/DefaultAudience;", "defaultAudience", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "applicationId", InneractiveMediationDefs.GENDER_FEMALE, "v", "(Ljava/lang/String;)V", "authId", "g", "Z", "u", "()Z", "z", "(Z)V", "isRerequest", "h", CampaignEx.JSON_KEY_AD_K, "setDeviceRedirectUriString", "deviceRedirectUriString", "setAuthType", "authType", "j", "setDeviceAuthTargetUserId", "deviceAuthTargetUserId", "n", VastAttributes.HORIZONTAL_POSITION, "messengerPageId", "q", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "resetMessengerState", "Lcom/facebook/login/LoginTargetApp;", InneractiveMediationDefs.GENDER_MALE, "Lcom/facebook/login/LoginTargetApp;", "()Lcom/facebook/login/LoginTargetApp;", "loginTargetApp", "s", "w", "isFamilyLogin", "o", "nonce", "codeVerifier", "codeChallenge", "Lcom/facebook/login/CodeChallengeMethod;", "Lcom/facebook/login/CodeChallengeMethod;", "()Lcom/facebook/login/CodeChallengeMethod;", "codeChallengeMethod", "t", "isInstagramLogin", "targetApp", "<init>", "(Lcom/facebook/login/LoginBehavior;Ljava/util/Set;Lcom/facebook/login/DefaultAudience;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/LoginTargetApp;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/CodeChallengeMethod;)V", "parcel", "(Landroid/os/Parcel;)V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Request implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final LoginBehavior loginBehavior;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public Set<String> permissions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final DefaultAudience defaultAudience;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final String applicationId;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public String authId;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public boolean isRerequest;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public String deviceRedirectUriString;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public String authType;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public String deviceAuthTargetUserId;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        public String messengerPageId;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public boolean resetMessengerState;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        public final LoginTargetApp loginTargetApp;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public boolean isFamilyLogin;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        public boolean shouldSkipAccountDeduplication;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        public final String nonce;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        public final String codeVerifier;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        public final String codeChallenge;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        public final CodeChallengeMethod codeChallengeMethod;
        public static final Parcelable.Creator<Request> CREATOR = new a();

        /* JADX INFO: compiled from: LoginClient.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/LoginClient$Request$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient$Request;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient$Request;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class a implements Parcelable.Creator<Request> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel source) {
                ck.p.j(source, "source");
                return new Request(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int size) {
                return new Request[size];
            }
        }

        public /* synthetic */ Request(Parcel parcel, ck.i iVar) {
            this(parcel);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0046  */
        public Request(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3, LoginTargetApp loginTargetApp, String str4, String str5, String str6, CodeChallengeMethod codeChallengeMethod) {
            ck.p.j(loginBehavior, "loginBehavior");
            ck.p.j(defaultAudience, "defaultAudience");
            ck.p.j(str, "authType");
            ck.p.j(str2, "applicationId");
            ck.p.j(str3, "authId");
            this.loginBehavior = loginBehavior;
            this.permissions = set == null ? new HashSet<>() : set;
            this.defaultAudience = defaultAudience;
            this.authType = str;
            this.applicationId = str2;
            this.authId = str3;
            this.loginTargetApp = loginTargetApp == null ? LoginTargetApp.FACEBOOK : loginTargetApp;
            if (str4 == null) {
                String string = UUID.randomUUID().toString();
                ck.p.i(string, "randomUUID().toString()");
                this.nonce = string;
            } else {
                if (str4.length() == 0) {
                    String string2 = UUID.randomUUID().toString();
                    ck.p.i(string2, "randomUUID().toString()");
                    this.nonce = string2;
                } else {
                    this.nonce = str4;
                }
            }
            this.codeVerifier = str5;
            this.codeChallenge = str6;
            this.codeChallengeMethod = codeChallengeMethod;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final void A(boolean z10) {
            this.resetMessengerState = z10;
        }

        public final void B(boolean z10) {
            this.shouldSkipAccountDeduplication = z10;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getShouldSkipAccountDeduplication() {
            return this.shouldSkipAccountDeduplication;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getApplicationId() {
            return this.applicationId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getAuthId() {
            return this.authId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getAuthType() {
            return this.authType;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCodeChallenge() {
            return this.codeChallenge;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final CodeChallengeMethod getCodeChallengeMethod() {
            return this.codeChallengeMethod;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getCodeVerifier() {
            return this.codeVerifier;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final DefaultAudience getDefaultAudience() {
            return this.defaultAudience;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getDeviceAuthTargetUserId() {
            return this.deviceAuthTargetUserId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getDeviceRedirectUriString() {
            return this.deviceRedirectUriString;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final LoginBehavior getLoginBehavior() {
            return this.loginBehavior;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final LoginTargetApp getLoginTargetApp() {
            return this.loginTargetApp;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getMessengerPageId() {
            return this.messengerPageId;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        public final Set<String> p() {
            return this.permissions;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getResetMessengerState() {
            return this.resetMessengerState;
        }

        public final boolean r() {
            Iterator<String> it = this.permissions.iterator();
            while (it.hasNext()) {
                if (LoginManager.INSTANCE.d(it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsFamilyLogin() {
            return this.isFamilyLogin;
        }

        public final boolean t() {
            return this.loginTargetApp == LoginTargetApp.INSTAGRAM;
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final boolean getIsRerequest() {
            return this.isRerequest;
        }

        public final void v(String str) {
            ck.p.j(str, "<set-?>");
            this.authId = str;
        }

        public final void w(boolean z10) {
            this.isFamilyLogin = z10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            ck.p.j(parcel, "dest");
            parcel.writeString(this.loginBehavior.name());
            parcel.writeStringList(new ArrayList(this.permissions));
            parcel.writeString(this.defaultAudience.name());
            parcel.writeString(this.applicationId);
            parcel.writeString(this.authId);
            parcel.writeByte(this.isRerequest ? (byte) 1 : (byte) 0);
            parcel.writeString(this.deviceRedirectUriString);
            parcel.writeString(this.authType);
            parcel.writeString(this.deviceAuthTargetUserId);
            parcel.writeString(this.messengerPageId);
            parcel.writeByte(this.resetMessengerState ? (byte) 1 : (byte) 0);
            parcel.writeString(this.loginTargetApp.name());
            parcel.writeByte(this.isFamilyLogin ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldSkipAccountDeduplication ? (byte) 1 : (byte) 0);
            parcel.writeString(this.nonce);
            parcel.writeString(this.codeVerifier);
            parcel.writeString(this.codeChallenge);
            CodeChallengeMethod codeChallengeMethod = this.codeChallengeMethod;
            parcel.writeString(codeChallengeMethod == null ? null : codeChallengeMethod.name());
        }

        public final void x(String str) {
            this.messengerPageId = str;
        }

        public final void y(Set<String> set) {
            ck.p.j(set, "<set-?>");
            this.permissions = set;
        }

        public final void z(boolean z10) {
            this.isRerequest = z10;
        }

        public Request(Parcel parcel) {
            DefaultAudience defaultAudienceValueOf;
            LoginTargetApp loginTargetAppValueOf;
            k0 k0Var = k0.f14435a;
            this.loginBehavior = LoginBehavior.valueOf(k0.l(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.permissions = new HashSet(arrayList);
            String string = parcel.readString();
            if (string != null) {
                defaultAudienceValueOf = DefaultAudience.valueOf(string);
            } else {
                defaultAudienceValueOf = DefaultAudience.NONE;
            }
            this.defaultAudience = defaultAudienceValueOf;
            this.applicationId = k0.l(parcel.readString(), "applicationId");
            this.authId = k0.l(parcel.readString(), "authId");
            this.isRerequest = parcel.readByte() != 0;
            this.deviceRedirectUriString = parcel.readString();
            this.authType = k0.l(parcel.readString(), "authType");
            this.deviceAuthTargetUserId = parcel.readString();
            this.messengerPageId = parcel.readString();
            this.resetMessengerState = parcel.readByte() != 0;
            String string2 = parcel.readString();
            if (string2 != null) {
                loginTargetAppValueOf = LoginTargetApp.valueOf(string2);
            } else {
                loginTargetAppValueOf = LoginTargetApp.FACEBOOK;
            }
            this.loginTargetApp = loginTargetAppValueOf;
            this.isFamilyLogin = parcel.readByte() != 0;
            this.shouldSkipAccountDeduplication = parcel.readByte() != 0;
            this.nonce = k0.l(parcel.readString(), "nonce");
            this.codeVerifier = parcel.readString();
            this.codeChallenge = parcel.readString();
            String string3 = parcel.readString();
            this.codeChallengeMethod = string3 == null ? null : CodeChallengeMethod.valueOf(string3);
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000e\u0018\u0000 +2\u00020\u0001:\u0002,\nB9\b\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b%\u0010&BC\b\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010'\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b%\u0010(B\u0011\b\u0012\u0012\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b%\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010!R$\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006-"}, d2 = {"Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lmj/r;", "writeToParcel", "Lcom/facebook/login/LoginClient$Result$Code;", "b", "Lcom/facebook/login/LoginClient$Result$Code;", "code", "Lcom/facebook/AccessToken;", "c", "Lcom/facebook/AccessToken;", "token", "Lcom/facebook/AuthenticationToken;", "d", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "", "e", "Ljava/lang/String;", "errorMessage", InneractiveMediationDefs.GENDER_FEMALE, IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/facebook/login/LoginClient$Request;", "g", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "", "h", "Ljava/util/Map;", "loggingExtras", "i", "extraData", "<init>", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$Code;Lcom/facebook/AccessToken;Ljava/lang/String;Ljava/lang/String;)V", "accessToken", "(Lcom/facebook/login/LoginClient$Request;Lcom/facebook/login/LoginClient$Result$Code;Lcom/facebook/AccessToken;Lcom/facebook/AuthenticationToken;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "j", "Code", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Result implements Parcelable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final Code code;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final AccessToken token;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final AuthenticationToken authenticationToken;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final String errorMessage;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public final String errorCode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        public final Request request;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        public Map<String, String> loggingExtras;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public Map<String, String> extraData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Result> CREATOR = new a();

        /* JADX INFO: compiled from: LoginClient.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/login/LoginClient$Result$Code;", "", "loggingValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingValue", "()Ljava/lang/String;", "SUCCESS", "CANCEL", "ERROR", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");

            private final String loggingValue;

            /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
            public static Code[] valuesCustom() {
                Code[] codeArrValuesCustom = values();
                return (Code[]) Arrays.copyOf(codeArrValuesCustom, codeArrValuesCustom.length);
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }

            Code(String str) {
                this.loggingValue = str;
            }
        }

        /* JADX INFO: compiled from: LoginClient.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/LoginClient$Result$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient$Result;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient$Result;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class a implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel source) {
                ck.p.j(source, "source");
                return new Result(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int size) {
                return new Result[size];
            }
        }

        /* JADX INFO: renamed from: com.facebook.login.LoginClient$Result$b, reason: from kotlin metadata */
        /* JADX INFO: compiled from: LoginClient.kt */
        @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J&\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J2\u0010\u0012\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/facebook/login/LoginClient$Result$b;", "", "Lcom/facebook/login/LoginClient$Request;", AdActivity.REQUEST_KEY_EXTRA, "Lcom/facebook/AccessToken;", "token", "Lcom/facebook/login/LoginClient$Result;", "e", "accessToken", "Lcom/facebook/AuthenticationToken;", "authenticationToken", "b", "", "message", "a", "errorType", "errorDescription", IronSourceConstants.EVENTS_ERROR_CODE, "c", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public static /* synthetic */ Result d(Companion companion, Request request, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 8) != 0) {
                    str3 = null;
                }
                return companion.c(request, str, str2, str3);
            }

            public final Result a(Request request, String message) {
                return new Result(request, Code.CANCEL, null, message, null);
            }

            public final Result b(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, Code.SUCCESS, accessToken, authenticationToken, null, null);
            }

            public final Result c(Request request, String errorType, String errorDescription, String errorCode) {
                ArrayList arrayList = new ArrayList();
                if (errorType != null) {
                    arrayList.add(errorType);
                }
                if (errorDescription != null) {
                    arrayList.add(errorDescription);
                }
                return new Result(request, Code.ERROR, null, TextUtils.join(": ", arrayList), errorCode);
            }

            public final Result e(Request request, AccessToken token) {
                ck.p.j(token, "token");
                return new Result(request, Code.SUCCESS, token, null, null);
            }
        }

        public /* synthetic */ Result(Parcel parcel, ck.i iVar) {
            this(parcel);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, Code code, AccessToken accessToken, String str, String str2) {
            this(request, code, accessToken, null, str, str2);
            ck.p.j(code, "code");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Result(Request request, Code code, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            ck.p.j(code, "code");
            this.request = request;
            this.token = accessToken;
            this.authenticationToken = authenticationToken;
            this.errorMessage = str;
            this.code = code;
            this.errorCode = str2;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            ck.p.j(parcel, "dest");
            parcel.writeString(this.code.name());
            parcel.writeParcelable(this.token, i10);
            parcel.writeParcelable(this.authenticationToken, i10);
            parcel.writeString(this.errorMessage);
            parcel.writeString(this.errorCode);
            parcel.writeParcelable(this.request, i10);
            j0 j0Var = j0.f14425a;
            j0.B0(parcel, this.loggingExtras);
            j0.B0(parcel, this.extraData);
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            this.code = Code.valueOf(string == null ? "error" : string);
            this.token = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.authenticationToken = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.errorMessage = parcel.readString();
            this.errorCode = parcel.readString();
            this.request = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.loggingExtras = j0.m0(parcel);
            this.extraData = j0.m0(parcel);
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/facebook/login/LoginClient$a;", "", "Lmj/r;", "a", "b", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/login/LoginClient$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/login/LoginClient;", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel source) {
            ck.p.j(source, "source");
            return new LoginClient(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int size) {
            return new LoginClient[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.LoginClient$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/facebook/login/LoginClient$c;", "", "", "b", "", "a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/LoginClient;", "CREATOR", "Landroid/os/Parcelable$Creator;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final String a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C3426d4.a.f28413f, System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            ck.p.i(string, "e2e.toString()");
            return string;
        }

        public final int b() {
            return CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode();
        }
    }

    /* JADX INFO: compiled from: LoginClient.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/login/LoginClient$d;", "", "Lcom/facebook/login/LoginClient$Result;", "result", "Lmj/r;", "a", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    public interface d {
        void a(Result result);
    }

    public LoginClient(Fragment fragment) {
        ck.p.j(fragment, ContainerActivity.FRAGMENT);
        this.currentHandler = -1;
        v(fragment);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:6:0x0013, B:8:0x0021, B:10:0x003d, B:9:0x002e), top: B:17:0x0013 }] */
    public final void A(Result result) {
        Result resultB;
        ck.p.j(result, "pendingResult");
        if (result.token == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken accessTokenE = AccessToken.INSTANCE.e();
        AccessToken accessToken = result.token;
        if (accessTokenE != null) {
            try {
                if (ck.p.e(accessTokenE.getUserId(), accessToken.getUserId())) {
                    resultB = Result.INSTANCE.b(this.pendingRequest, result.token, result.authenticationToken);
                } else {
                    resultB = Result.Companion.d(Result.INSTANCE, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
                }
            } catch (Exception e10) {
                f(Result.Companion.d(Result.INSTANCE, this.pendingRequest, "Caught exception", e10.getMessage(), null, 8, null));
                return;
            }
        } else {
            resultB = Result.Companion.d(Result.INSTANCE, this.pendingRequest, "User logged in as different Facebook user.", null, null, 8, null);
        }
        f(resultB);
    }

    public final void a(String str, String str2, boolean z10) {
        Map<String, String> map = this.loggingExtras;
        if (map == null) {
            map = new HashMap<>();
        }
        if (this.loggingExtras == null) {
            this.loggingExtras = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = ((Object) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final void b(Request request) {
        if (request == null) {
            return;
        }
        if (this.pendingRequest != null) {
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.INSTANCE.g() || d()) {
            this.pendingRequest = request;
            this.handlersToTry = k(request);
            z();
        }
    }

    public final boolean d() {
        if (this.checkedInternetPermission) {
            return true;
        }
        if (e("android.permission.INTERNET") == 0) {
            this.checkedInternetPermission = true;
            return true;
        }
        FragmentActivity activity = getActivity();
        f(Result.Companion.d(Result.INSTANCE, this.pendingRequest, activity == null ? null : activity.getString(R$string.com_facebook_internet_permission_error_title), activity != null ? activity.getString(R$string.com_facebook_internet_permission_error_message) : null, null, 8, null));
        return false;
    }

    public final int e(String permission) {
        ck.p.j(permission, "permission");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return -1;
        }
        return activity.checkCallingOrSelfPermission(permission);
    }

    public final void f(Result result) {
        ck.p.j(result, K5.f26927b);
        LoginMethodHandler loginMethodHandlerI = i();
        if (loginMethodHandlerI != null) {
            o(loginMethodHandlerI.getNameForLogging(), result, loginMethodHandlerI.f());
        }
        Map<String, String> map = this.loggingExtras;
        if (map != null) {
            result.loggingExtras = map;
        }
        Map<String, String> map2 = this.extraData;
        if (map2 != null) {
            result.extraData = map2;
        }
        this.handlersToTry = null;
        this.currentHandler = -1;
        this.pendingRequest = null;
        this.loggingExtras = null;
        this.numActivitiesReturned = 0;
        this.numTotalIntentsFired = 0;
        s(result);
    }

    public final void g(Result result) {
        ck.p.j(result, K5.f26927b);
        if (result.token == null || !AccessToken.INSTANCE.g()) {
            f(result);
        } else {
            A(result);
        }
    }

    public final FragmentActivity getActivity() {
        Fragment fragment = this.fragment;
        if (fragment == null) {
            return null;
        }
        return fragment.getActivity();
    }

    public final void h() {
        f(Result.Companion.d(Result.INSTANCE, this.pendingRequest, "Login attempt failed.", null, null, 8, null));
    }

    public final LoginMethodHandler i() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i10 = this.currentHandler;
        if (i10 < 0 || (loginMethodHandlerArr = this.handlersToTry) == null) {
            return null;
        }
        return loginMethodHandlerArr[i10];
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    public LoginMethodHandler[] k(Request request) {
        ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
        ArrayList arrayList = new ArrayList();
        LoginBehavior loginBehavior = request.getLoginBehavior();
        if (!request.t()) {
            if (loginBehavior.getAllowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!t.bypassAppSwitch && loginBehavior.getAllowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!t.bypassAppSwitch && loginBehavior.getAllowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (loginBehavior.getAllowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (loginBehavior.getAllowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.t() && loginBehavior.getAllowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            return (LoginMethodHandler[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean l() {
        return this.pendingRequest != null && this.currentHandler >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    public final o m() {
        Context activity;
        Request request;
        String applicationId;
        o oVar = this.loginLogger;
        if (oVar != null) {
            String strB = oVar.b();
            Request request2 = this.pendingRequest;
            if (!ck.p.e(strB, request2 == null ? null : request2.getApplicationId())) {
                activity = getActivity();
                if (activity == null) {
                    activity = t.l();
                }
                request = this.pendingRequest;
                if (request == null) {
                    applicationId = t.m();
                } else {
                    applicationId = request.getApplicationId();
                }
                oVar = new o(activity, applicationId);
                this.loginLogger = oVar;
            }
        } else {
            activity = getActivity();
            if (activity == null) {
                activity = t.l();
            }
            request = this.pendingRequest;
            if (request == null) {
                applicationId = t.m();
            } else {
                applicationId = request.getApplicationId();
            }
            oVar = new o(activity, applicationId);
            this.loginLogger = oVar;
        }
        return oVar;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Request getPendingRequest() {
        return this.pendingRequest;
    }

    public final void o(String str, Result result, Map<String, String> map) {
        p(str, result.code.getLoggingValue(), result.errorMessage, result.errorCode, map);
    }

    public final void p(String str, String str2, String str3, String str4, Map<String, String> map) {
        Request request = this.pendingRequest;
        if (request == null) {
            m().j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m().c(request.getAuthId(), str, str2, str3, str4, map, request.getIsFamilyLogin() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    public final void q() {
        a aVar = this.backgroundProcessingListener;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public final void r() {
        a aVar = this.backgroundProcessingListener;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    public final void s(Result result) {
        d dVar = this.onCompletedListener;
        if (dVar == null) {
            return;
        }
        dVar.a(result);
    }

    public final boolean t(int requestCode, int resultCode, Intent data) {
        this.numActivitiesReturned++;
        if (this.pendingRequest != null) {
            if (data != null && data.getBooleanExtra(CustomTabMainActivity.NO_ACTIVITY_EXCEPTION, false)) {
                z();
                return false;
            }
            LoginMethodHandler loginMethodHandlerI = i();
            if (loginMethodHandlerI != null && (!loginMethodHandlerI.o() || data != null || this.numActivitiesReturned >= this.numTotalIntentsFired)) {
                return loginMethodHandlerI.k(requestCode, resultCode, data);
            }
        }
        return false;
    }

    public final void u(a aVar) {
        this.backgroundProcessingListener = aVar;
    }

    public final void v(Fragment fragment) {
        if (this.fragment != null) {
            throw new FacebookException("Can't set fragment once it is already set.");
        }
        this.fragment = fragment;
    }

    public final void w(d dVar) {
        this.onCompletedListener = dVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ck.p.j(parcel, "dest");
        parcel.writeParcelableArray(this.handlersToTry, i10);
        parcel.writeInt(this.currentHandler);
        parcel.writeParcelable(this.pendingRequest, i10);
        j0 j0Var = j0.f14425a;
        j0.B0(parcel, this.loggingExtras);
        j0.B0(parcel, this.extraData);
    }

    public final void c() {
        LoginMethodHandler loginMethodHandlerI = i();
        if (loginMethodHandlerI != null) {
            loginMethodHandlerI.c();
        }
    }

    public final void x(Request request) {
        if (!l()) {
            b(request);
        }
    }

    public final boolean y() {
        String str;
        String str2;
        LoginMethodHandler loginMethodHandlerI = i();
        if (loginMethodHandlerI == null) {
            return false;
        }
        if (loginMethodHandlerI.j() && !d()) {
            a("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.pendingRequest;
        if (request == null) {
            return false;
        }
        int iP = loginMethodHandlerI.p(request);
        this.numActivitiesReturned = 0;
        if (iP > 0) {
            o oVarM = m();
            String authId = request.getAuthId();
            String nameForLogging = loginMethodHandlerI.getNameForLogging();
            if (request.getIsFamilyLogin()) {
                str2 = "foa_mobile_login_method_start";
            } else {
                str2 = "fb_mobile_login_method_start";
            }
            oVarM.e(authId, nameForLogging, str2);
            this.numTotalIntentsFired = iP;
        } else {
            o oVarM2 = m();
            String authId2 = request.getAuthId();
            String nameForLogging2 = loginMethodHandlerI.getNameForLogging();
            if (request.getIsFamilyLogin()) {
                str = "foa_mobile_login_method_not_tried";
            } else {
                str = "fb_mobile_login_method_not_tried";
            }
            oVarM2.d(authId2, nameForLogging2, str);
            a("not_tried", loginMethodHandlerI.getNameForLogging(), true);
        }
        if (iP <= 0) {
            return false;
        }
        return true;
    }

    public final void z() {
        LoginMethodHandler loginMethodHandlerI = i();
        if (loginMethodHandlerI != null) {
            p(loginMethodHandlerI.getNameForLogging(), "skipped", null, null, loginMethodHandlerI.f());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.handlersToTry;
        while (loginMethodHandlerArr != null) {
            int i10 = this.currentHandler;
            if (i10 >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.currentHandler = i10 + 1;
            if (y()) {
                return;
            }
        }
        if (this.pendingRequest != null) {
            h();
        }
    }

    public LoginClient(Parcel parcel) {
        ck.p.j(parcel, "source");
        this.currentHandler = -1;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i10];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.n(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i10++;
        }
        Object[] array = arrayList.toArray(new LoginMethodHandler[0]);
        if (array != null) {
            this.handlersToTry = (LoginMethodHandler[]) array;
            this.currentHandler = parcel.readInt();
            this.pendingRequest = (Request) parcel.readParcelable(Request.class.getClassLoader());
            Map<String, String> mapM0 = j0.m0(parcel);
            this.loggingExtras = mapM0 == null ? null : kotlin.collections.a.B(mapM0);
            Map<String, String> mapM1 = j0.m0(parcel);
            this.extraData = mapM1 != null ? kotlin.collections.a.B(mapM1) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
