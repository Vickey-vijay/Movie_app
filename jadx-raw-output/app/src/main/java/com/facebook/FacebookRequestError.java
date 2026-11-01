package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.net.HttpURLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: FacebookRequestError.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 O2\u00020\u0001:\u0003P\u000b\u0010B\u0083\u0001\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010%\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010+\u001a\u0004\u0018\u00010&\u0012\b\u00101\u001a\u0004\u0018\u00010,\u0012\b\u0010D\u001a\u0004\u0018\u000104\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HB#\b\u0017\u0012\b\u00101\u001a\u0004\u0018\u00010,\u0012\u000e\u00109\u001a\n\u0018\u00010Ij\u0004\u0018\u0001`J¢\u0006\u0004\bG\u0010KB%\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bG\u0010LB\u0011\b\u0012\u0012\u0006\u0010M\u001a\u00020\u0004¢\u0006\u0004\bG\u0010NJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u0019\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010%\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b$\u0010\"R\u0019\u0010+\u001a\u0004\u0018\u00010&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u00101\u001a\u0004\u0018\u00010,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u00103\u001a\u0004\u0018\u00010\u00028F¢\u0006\f\n\u0004\b2\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R(\u00109\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b\u001c\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010B\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0016\u001a\u0004\bA\u0010\u0018¨\u0006Q"}, d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "", "toString", "Landroid/os/Parcel;", "out", "", "flags", "Lmj/r;", "writeToParcel", "describeContents", "b", "I", "h", "()I", "requestStatusCode", "c", "d", IronSourceConstants.EVENTS_ERROR_CODE, "i", "subErrorCode", "e", "Ljava/lang/String;", InneractiveMediationDefs.GENDER_FEMALE, "()Ljava/lang/String;", "errorType", "getErrorUserTitle", "errorUserTitle", "g", "getErrorUserMessage", "errorUserMessage", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "getRequestResultBody", "()Lorg/json/JSONObject;", "requestResultBody", "getRequestResult", "requestResult", "", "j", "Ljava/lang/Object;", "getBatchRequestResult", "()Ljava/lang/Object;", "batchRequestResult", "Ljava/net/HttpURLConnection;", CampaignEx.JSON_KEY_AD_K, "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "connection", "l", "errorMessage", "Lcom/facebook/FacebookException;", "<set-?>", InneractiveMediationDefs.GENDER_MALE, "Lcom/facebook/FacebookException;", "()Lcom/facebook/FacebookException;", "exception", "Lcom/facebook/FacebookRequestError$Category;", "n", "Lcom/facebook/FacebookRequestError$Category;", "getCategory", "()Lcom/facebook/FacebookRequestError$Category;", "category", "o", "getErrorRecoveryMessage", "errorRecoveryMessage", "errorMessageField", "exceptionField", "", "errorIsTransient", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V", "(ILjava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "p", "Category", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookRequestError implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int requestStatusCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int errorCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int subErrorCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String errorType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String errorUserTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String errorUserMessage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final JSONObject requestResultBody;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final JSONObject requestResult;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final Object batchRequestResult;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final String errorMessage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public FacebookException exception;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Category category;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final String errorRecoveryMessage;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f14072q = new c(200, 299);
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new a();

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/FacebookRequestError$Category;", "", "(Ljava/lang/String;I)V", "LOGIN_RECOVERABLE", NativeAdContent.ViewTag.OTHER, "TRANSIENT", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Category[] valuesCustom() {
            Category[] categoryArrValuesCustom = values();
            return (Category[]) Arrays.copyOf(categoryArrValuesCustom, categoryArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/FacebookRequestError$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/facebook/FacebookRequestError;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<FacebookRequestError> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            p.j(parcel, "parcel");
            return new FacebookRequestError(parcel, (i) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int size) {
            return new FacebookRequestError[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FacebookRequestError.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J&\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007R\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010 \u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0014\u0010!\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0014\u0010\"\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0014\u0010%\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006*"}, d2 = {"Lcom/facebook/FacebookRequestError$b;", "", "Lorg/json/JSONObject;", "singleResult", "batchResult", "Ljava/net/HttpURLConnection;", "connection", "Lcom/facebook/FacebookRequestError;", "a", "Lcom/facebook/FacebookRequestError$c;", "HTTP_RANGE_SUCCESS", "Lcom/facebook/FacebookRequestError$c;", "c", "()Lcom/facebook/FacebookRequestError$c;", "Lcom/facebook/internal/j;", "b", "()Lcom/facebook/internal/j;", "errorClassification", "", "BODY_KEY", "Ljava/lang/String;", "CODE_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "ERROR_CODE_FIELD_KEY", "ERROR_CODE_KEY", "ERROR_IS_TRANSIENT_KEY", "ERROR_KEY", "ERROR_MESSAGE_FIELD_KEY", "ERROR_MSG_KEY", "ERROR_REASON_KEY", "ERROR_SUB_CODE_KEY", "ERROR_TYPE_FIELD_KEY", "ERROR_USER_MSG_KEY", "ERROR_USER_TITLE_KEY", "", "INVALID_ERROR_CODE", "I", "INVALID_HTTP_STATUS_CODE", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final synchronized j b() {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
            q qVarF = FetchedAppSettingsManager.f(t.m());
            if (qVarF == null) {
                return j.INSTANCE.b();
            }
            return qVarF.getErrorClassification();
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00cf A[Catch: JSONException -> 0x012d, TryCatch #0 {JSONException -> 0x012d, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:47:0x00cf, B:33:0x0077, B:30:0x006e, B:27:0x0064, B:24:0x005c, B:21:0x0055, B:18:0x004b, B:15:0x0041, B:35:0x0083, B:38:0x0090, B:40:0x0099, B:44:0x00aa, B:49:0x00f0, B:51:0x00fa, B:53:0x0108, B:55:0x0111), top: B:59:0x0012 }] */
        public final FacebookRequestError a(JSONObject singleResult, Object batchResult, HttpURLConnection connection) {
            String strOptString;
            int iOptInt;
            boolean z10;
            String strOptString2;
            String strOptString3;
            String str;
            String str2;
            p.j(singleResult, "singleResult");
            try {
                if (singleResult.has("code")) {
                    int i10 = singleResult.getInt("code");
                    Object objK = j0.K(singleResult, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objK != null && (objK instanceof JSONObject)) {
                        boolean zOptBoolean = true;
                        zOptBoolean = false;
                        int iOptInt2 = -1;
                        if (((JSONObject) objK).has("error")) {
                            JSONObject jSONObject = (JSONObject) j0.K((JSONObject) objK, "error", null);
                            strOptString = jSONObject == null ? null : jSONObject.optString("type", null);
                            String strOptString4 = jSONObject == null ? null : jSONObject.optString("message", null);
                            int iOptInt3 = jSONObject == null ? -1 : jSONObject.optInt("code", -1);
                            if (jSONObject != null) {
                                iOptInt2 = jSONObject.optInt("error_subcode", -1);
                            }
                            strOptString2 = jSONObject == null ? null : jSONObject.optString("error_user_msg", null);
                            strOptString3 = jSONObject == null ? null : jSONObject.optString("error_user_title", null);
                            if (jSONObject != null) {
                                zOptBoolean = jSONObject.optBoolean("is_transient", false);
                            }
                            z10 = zOptBoolean;
                            str = strOptString4;
                            iOptInt = iOptInt2;
                            iOptInt2 = iOptInt3;
                        } else {
                            if (((JSONObject) objK).has("error_code") || ((JSONObject) objK).has("error_msg") || ((JSONObject) objK).has("error_reason")) {
                                strOptString = ((JSONObject) objK).optString("error_reason", null);
                                String strOptString5 = ((JSONObject) objK).optString("error_msg", null);
                                int iOptInt4 = ((JSONObject) objK).optInt("error_code", -1);
                                iOptInt = ((JSONObject) objK).optInt("error_subcode", -1);
                                iOptInt2 = iOptInt4;
                                z10 = false;
                                strOptString2 = null;
                                strOptString3 = null;
                                str = strOptString5;
                            } else {
                                z10 = false;
                                iOptInt = -1;
                                str2 = null;
                                str = null;
                                strOptString2 = null;
                                strOptString3 = null;
                            }
                            if (zOptBoolean) {
                                return new FacebookRequestError(i10, iOptInt2, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) objK, singleResult, batchResult, connection, null, z10, null);
                            }
                        }
                        str2 = strOptString;
                        if (zOptBoolean) {
                            return new FacebookRequestError(i10, iOptInt2, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) objK, singleResult, batchResult, connection, null, z10, null);
                        }
                    }
                    if (!c().a(i10)) {
                        return new FacebookRequestError(i10, -1, -1, null, null, null, null, singleResult.has("body") ? (JSONObject) j0.K(singleResult, "body", "FACEBOOK_NON_JSON_RESULT") : null, singleResult, batchResult, connection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        public final c c() {
            return FacebookRequestError.f14072q;
        }
    }

    /* JADX INFO: compiled from: FacebookRequestError.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/facebook/FacebookRequestError$c;", "", "", "value", "", "a", "I", "start", "b", "end", "<init>", "(II)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int end;

        public final boolean a(int value) {
            return value <= this.end && this.start <= value;
        }

        public c(int i10, int i11) {
            this.start = i10;
            this.end = i11;
        }
    }

    public FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z10) {
        boolean z11;
        this.requestStatusCode = i10;
        this.errorCode = i11;
        this.subErrorCode = i12;
        this.errorType = str;
        this.errorUserTitle = str3;
        this.errorUserMessage = str4;
        this.requestResultBody = jSONObject;
        this.requestResult = jSONObject2;
        this.batchRequestResult = obj;
        this.connection = httpURLConnection;
        this.errorMessage = str2;
        if (facebookException != null) {
            this.exception = facebookException;
            z11 = true;
        } else {
            this.exception = new FacebookServiceException(this, e());
            z11 = false;
        }
        Category categoryC = z11 ? Category.OTHER : INSTANCE.b().c(i11, i12, z10);
        this.category = categoryC;
        this.errorRecoveryMessage = INSTANCE.b().d(categoryC);
    }

    public /* synthetic */ FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z10, i iVar) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z10);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, i iVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String e() {
        String str = this.errorMessage;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.exception;
        if (facebookException == null) {
            return null;
        }
        return facebookException.getLocalizedMessage();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FacebookException getException() {
        return this.exception;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getRequestStatusCode() {
        return this.requestStatusCode;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSubErrorCode() {
        return this.subErrorCode;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.requestStatusCode + ", errorCode: " + this.errorCode + ", subErrorCode: " + this.subErrorCode + ", errorType: " + this.errorType + ", errorMessage: " + e() + h.f44172e;
        p.i(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "out");
        parcel.writeInt(this.requestStatusCode);
        parcel.writeInt(this.errorCode);
        parcel.writeInt(this.subErrorCode);
        parcel.writeString(this.errorType);
        parcel.writeString(e());
        parcel.writeString(this.errorUserTitle);
        parcel.writeString(this.errorUserMessage);
    }

    @VisibleForTesting(otherwise = 4)
    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
