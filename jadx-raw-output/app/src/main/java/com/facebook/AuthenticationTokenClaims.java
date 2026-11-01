package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.o;
import ck.p;
import ck.w;
import com.facebook.internal.j0;
import com.facebook.internal.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import lk.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u0000 c2\u00020\u0001:\u0001\u0016B\u0019\b\u0017\u0012\u0006\u0010\\\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b]\u0010^B\u0087\u0002\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010(\u001a\u00020#\u0012\u0006\u0010+\u001a\u00020#\u0012\u0006\u0010.\u001a\u00020\u0004\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010_\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010J\u0012\u0016\b\u0002\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010J\u0012\u0016\b\u0002\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010J\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b]\u0010`B\u0011\b\u0010\u0012\u0006\u0010a\u001a\u00020\b¢\u0006\u0004\b]\u0010bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u000f\u0010\u0014\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019R\u0019\u00101\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0017\u001a\u0004\b0\u0010\u0019R\u0019\u00104\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b3\u0010\u0019R\u0019\u00107\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0017\u001a\u0004\b6\u0010\u0019R\u0019\u0010:\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0017\u001a\u0004\b9\u0010\u0019R\u0019\u0010=\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0017\u001a\u0004\b<\u0010\u0019R\u0019\u0010@\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\u0017\u001a\u0004\b?\u0010\u0019R\u001f\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010I\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0017\u001a\u0004\bH\u0010\u0019R%\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n\u0018\u00010J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR%\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010J8\u0006¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010NR%\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010J8\u0006¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010NR\u0019\u0010X\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bV\u0010\u0017\u001a\u0004\bW\u0010\u0019R\u0019\u0010[\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\u0017\u001a\u0004\bZ\u0010\u0019¨\u0006d"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "claimsJson", "", "expectedNonce", "", "a", "Landroid/os/Parcel;", "dest", "", "flags", "Lmj/r;", "writeToParcel", "", "other", "equals", "hashCode", "toString", "describeContents", "c", "()Lorg/json/JSONObject;", "b", "Ljava/lang/String;", "getJti", "()Ljava/lang/String;", "jti", "getIss", "iss", "d", "getAud", "aud", "e", "getNonce", "nonce", "", InneractiveMediationDefs.GENDER_FEMALE, "J", "getExp", "()J", ImpressionLog.f43649y, "g", "getIat", "iat", "h", "getSub", "sub", "i", "getName", "name", "j", "getGivenName", "givenName", CampaignEx.JSON_KEY_AD_K, "getMiddleName", "middleName", "l", "getFamilyName", "familyName", InneractiveMediationDefs.GENDER_MALE, "getEmail", "email", "n", "getPicture", "picture", "", "o", "Ljava/util/Set;", "getUserFriends", "()Ljava/util/Set;", "userFriends", "p", "getUserBirthday", "userBirthday", "", "q", "Ljava/util/Map;", "getUserAgeRange", "()Ljava/util/Map;", "userAgeRange", "r", "getUserHometown", "userHometown", "s", "getUserLocation", "userLocation", "t", "getUserGender", "userGender", "u", "getUserLink", "userLink", "encodedClaims", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "v", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AuthenticationTokenClaims implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String jti;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String iss;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String aud;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String nonce;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long exp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long iat;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String sub;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String givenName;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final String middleName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final String familyName;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final String email;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String picture;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final Set<String> userFriends;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final String userBirthday;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Integer> userAgeRange;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final Map<String, String> userHometown;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final Map<String, String> userLocation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final String userGender;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final String userLink;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new a();

    /* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/AuthenticationTokenClaims$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/AuthenticationTokenClaims;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements Parcelable.Creator<AuthenticationTokenClaims> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(Parcel source) {
            p.j(source, "source");
            return new AuthenticationTokenClaims(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int size) {
            return new AuthenticationTokenClaims[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AuthenticationTokenClaims$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AuthenticationTokenClaims.kt */
    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000fR\u0014\u0010\u001a\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0014\u0010 \u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u000fR\u0014\u0010!\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u000fR\u0014\u0010\"\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u000fR\u0014\u0010$\u001a\u00020#8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/facebook/AuthenticationTokenClaims$b;", "", "Lorg/json/JSONObject;", "", "name", "b", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "jsonObject", "Lcom/facebook/AuthenticationTokenClaims;", "a", "(Lorg/json/JSONObject;)Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "JSON_KEY_AUD", "Ljava/lang/String;", "JSON_KEY_EMAIL", "JSON_KEY_EXP", "JSON_KEY_FAMILY_NAME", "JSON_KEY_GIVEN_NAME", "JSON_KEY_IAT", "JSON_KEY_ISS", "JSON_KEY_JIT", "JSON_KEY_MIDDLE_NAME", "JSON_KEY_NAME", "JSON_KEY_NONCE", "JSON_KEY_PICTURE", "JSON_KEY_SUB", "JSON_KEY_USER_AGE_RANGE", "JSON_KEY_USER_BIRTHDAY", "JSON_KEY_USER_FRIENDS", "JSON_KEY_USER_GENDER", "JSON_KEY_USER_HOMETOWN", "JSON_KEY_USER_LINK", "JSON_KEY_USER_LOCATION", "", "MAX_TIME_SINCE_TOKEN_ISSUED", "J", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final AuthenticationTokenClaims a(JSONObject jsonObject) throws JSONException {
            p.j(jsonObject, "jsonObject");
            String string = jsonObject.getString("jti");
            String string2 = jsonObject.getString("iss");
            String string3 = jsonObject.getString("aud");
            String string4 = jsonObject.getString("nonce");
            long j10 = jsonObject.getLong(ImpressionLog.f43649y);
            long j11 = jsonObject.getLong("iat");
            String string5 = jsonObject.getString("sub");
            String strB = b(jsonObject, "name");
            String strB2 = b(jsonObject, "given_name");
            String strB3 = b(jsonObject, "middle_name");
            String strB4 = b(jsonObject, "family_name");
            String strB5 = b(jsonObject, "email");
            String strB6 = b(jsonObject, "picture");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("user_friends");
            String strB7 = b(jsonObject, "user_birthday");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("user_age_range");
            JSONObject jSONObjectOptJSONObject2 = jsonObject.optJSONObject("user_hometown");
            JSONObject jSONObjectOptJSONObject3 = jsonObject.optJSONObject("user_location");
            String strB8 = b(jsonObject, "user_gender");
            String strB9 = b(jsonObject, "user_link");
            p.i(string, "jti");
            p.i(string2, "iss");
            p.i(string3, "aud");
            p.i(string4, "nonce");
            p.i(string5, "sub");
            return new AuthenticationTokenClaims(string, string2, string3, string4, j10, j11, string5, strB, strB2, strB3, strB4, strB5, strB6, jSONArrayOptJSONArray == null ? null : j0.b0(jSONArrayOptJSONArray), strB7, jSONObjectOptJSONObject == null ? null : j0.n(jSONObjectOptJSONObject), jSONObjectOptJSONObject2 == null ? null : j0.o(jSONObjectOptJSONObject2), jSONObjectOptJSONObject3 != null ? j0.o(jSONObjectOptJSONObject3) : null, strB8, strB9);
        }

        public final String b(JSONObject jSONObject, String str) {
            p.j(jSONObject, "<this>");
            p.j(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public AuthenticationTokenClaims(String str, String str2) throws JSONException {
        p.j(str, "encodedClaims");
        p.j(str2, "expectedNonce");
        k0.h(str, "encodedClaims");
        byte[] bArrDecode = Base64.decode(str, 8);
        p.i(bArrDecode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, c.f63591b));
        if (!a(jSONObject, str2)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        p.i(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.jti = string;
        String string2 = jSONObject.getString("iss");
        p.i(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.iss = string2;
        String string3 = jSONObject.getString("aud");
        p.i(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.aud = string3;
        String string4 = jSONObject.getString("nonce");
        p.i(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.nonce = string4;
        this.exp = jSONObject.getLong(ImpressionLog.f43649y);
        this.iat = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        p.i(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.sub = string5;
        Companion companion = INSTANCE;
        this.name = companion.b(jSONObject, "name");
        this.givenName = companion.b(jSONObject, "given_name");
        this.middleName = companion.b(jSONObject, "middle_name");
        this.familyName = companion.b(jSONObject, "family_name");
        this.email = companion.b(jSONObject, "email");
        this.picture = companion.b(jSONObject, "picture");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
        this.userFriends = jSONArrayOptJSONArray == null ? null : Collections.unmodifiableSet(j0.a0(jSONArrayOptJSONArray));
        this.userBirthday = companion.b(jSONObject, "user_birthday");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
        this.userAgeRange = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(j0.n(jSONObjectOptJSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.userHometown = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(j0.o(jSONObjectOptJSONObject2));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
        this.userLocation = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(j0.o(jSONObjectOptJSONObject3)) : null;
        this.userGender = companion.b(jSONObject, "user_gender");
        this.userLink = companion.b(jSONObject, "user_link");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) other;
        return p.e(this.jti, authenticationTokenClaims.jti) && p.e(this.iss, authenticationTokenClaims.iss) && p.e(this.aud, authenticationTokenClaims.aud) && p.e(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && p.e(this.sub, authenticationTokenClaims.sub) && p.e(this.name, authenticationTokenClaims.name) && p.e(this.givenName, authenticationTokenClaims.givenName) && p.e(this.middleName, authenticationTokenClaims.middleName) && p.e(this.familyName, authenticationTokenClaims.familyName) && p.e(this.email, authenticationTokenClaims.email) && p.e(this.picture, authenticationTokenClaims.picture) && p.e(this.userFriends, authenticationTokenClaims.userFriends) && p.e(this.userBirthday, authenticationTokenClaims.userBirthday) && p.e(this.userAgeRange, authenticationTokenClaims.userAgeRange) && p.e(this.userHometown, authenticationTokenClaims.userHometown) && p.e(this.userLocation, authenticationTokenClaims.userLocation) && p.e(this.userGender, authenticationTokenClaims.userGender) && p.e(this.userLink, authenticationTokenClaims.userLink);
    }

    public final boolean a(JSONObject claimsJson, String expectedNonce) {
        if (claimsJson == null) {
            return false;
        }
        String strOptString = claimsJson.optString("jti");
        p.i(strOptString, "jti");
        if (strOptString.length() == 0) {
            return false;
        }
        try {
            String strOptString2 = claimsJson.optString("iss");
            p.i(strOptString2, "iss");
            if (!(strOptString2.length() == 0) && (p.e(new URL(strOptString2).getHost(), "facebook.com") || p.e(new URL(strOptString2).getHost(), "www.facebook.com"))) {
                String strOptString3 = claimsJson.optString("aud");
                p.i(strOptString3, "aud");
                if (!(strOptString3.length() == 0) && p.e(strOptString3, t.m())) {
                    long j10 = 1000;
                    if (new Date().after(new Date(claimsJson.optLong(ImpressionLog.f43649y) * j10))) {
                        return false;
                    }
                    if (new Date().after(new Date((claimsJson.optLong("iat") * j10) + 600000))) {
                        return false;
                    }
                    String strOptString4 = claimsJson.optString("sub");
                    p.i(strOptString4, "sub");
                    if (strOptString4.length() == 0) {
                        return false;
                    }
                    String strOptString5 = claimsJson.optString("nonce");
                    p.i(strOptString5, "nonce");
                    if (!(strOptString5.length() == 0) && p.e(strOptString5, expectedNonce)) {
                        return true;
                    }
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    public final JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.jti);
        jSONObject.put("iss", this.iss);
        jSONObject.put("aud", this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put(ImpressionLog.f43649y, this.exp);
        jSONObject.put("iat", this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put("user_age_range", new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put("user_hometown", new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put("user_location", new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.exp)) * 31) + Long.hashCode(this.iat)) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.familyName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picture;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set<String> set = this.userFriends;
        int iHashCode8 = (iHashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.userBirthday;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Integer> map = this.userAgeRange;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.userHometown;
        int iHashCode11 = (iHashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.userLocation;
        int iHashCode12 = (iHashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.userGender;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userLink;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeString(this.jti);
        parcel.writeString(this.iss);
        parcel.writeString(this.aud);
        parcel.writeString(this.nonce);
        parcel.writeLong(this.exp);
        parcel.writeLong(this.iat);
        parcel.writeString(this.sub);
        parcel.writeString(this.name);
        parcel.writeString(this.givenName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.familyName);
        parcel.writeString(this.email);
        parcel.writeString(this.picture);
        if (this.userFriends == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(this.userFriends));
        }
        parcel.writeString(this.userBirthday);
        parcel.writeMap(this.userAgeRange);
        parcel.writeMap(this.userHometown);
        parcel.writeMap(this.userLocation);
        parcel.writeString(this.userGender);
        parcel.writeString(this.userLink);
    }

    public String toString() {
        String string = c().toString();
        p.i(string, "claimsJsonObject.toString()");
        return string;
    }

    @VisibleForTesting(otherwise = 2)
    public AuthenticationTokenClaims(String str, String str2, String str3, String str4, long j10, long j11, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Collection<String> collection, String str12, Map<String, Integer> map, Map<String, String> map2, Map<String, String> map3, String str13, String str14) {
        p.j(str, "jti");
        p.j(str2, "iss");
        p.j(str3, "aud");
        p.j(str4, "nonce");
        p.j(str5, "sub");
        k0.h(str, "jti");
        k0.h(str2, "iss");
        k0.h(str3, "aud");
        k0.h(str4, "nonce");
        k0.h(str5, "sub");
        this.jti = str;
        this.iss = str2;
        this.aud = str3;
        this.nonce = str4;
        this.exp = j10;
        this.iat = j11;
        this.sub = str5;
        this.name = str6;
        this.givenName = str7;
        this.middleName = str8;
        this.familyName = str9;
        this.email = str10;
        this.picture = str11;
        this.userFriends = collection != null ? Collections.unmodifiableSet(new HashSet(collection)) : null;
        this.userBirthday = str12;
        this.userAgeRange = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
        this.userHometown = map2 != null ? Collections.unmodifiableMap(new HashMap(map2)) : null;
        this.userLocation = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
        this.userGender = str13;
        this.userLink = str14;
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        p.j(parcel, "parcel");
        this.jti = k0.l(parcel.readString(), "jti");
        this.iss = k0.l(parcel.readString(), "iss");
        this.aud = k0.l(parcel.readString(), "aud");
        this.nonce = k0.l(parcel.readString(), "nonce");
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        this.sub = k0.l(parcel.readString(), "sub");
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.userFriends = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap hashMap = parcel.readHashMap(o.f6058a.getClass().getClassLoader());
        hashMap = hashMap instanceof HashMap ? hashMap : null;
        this.userAgeRange = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        w wVar = w.f6066a;
        HashMap hashMap2 = parcel.readHashMap(wVar.getClass().getClassLoader());
        hashMap2 = hashMap2 instanceof HashMap ? hashMap2 : null;
        this.userHometown = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(wVar.getClass().getClassLoader());
        hashMap3 = hashMap3 instanceof HashMap ? hashMap3 : null;
        this.userLocation = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}
