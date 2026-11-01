package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ck.i;
import ck.p;
import com.facebook.internal.j0;
import com.facebook.internal.k0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import me.goldze.mvvmhabit.base.ContainerActivity;
import nj.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.a0;
import q1.f;
import q1.t;

/* JADX INFO: compiled from: AccessToken.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u001d\n\u0002\u0010\u001e\n\u0002\b\b\u0018\u0000 82\u00020\u0001:\u0002\b\"B\u008b\u0001\b\u0017\u0012\u0006\u0010>\u001a\u00020\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0006\u00109\u001a\u00020\u0002\u0012\u0010\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010?\u0012\u0010\u0010)\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010?\u0012\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010?\u0012\b\u0010@\u001a\u0004\u0018\u00010\t\u0012\b\u0010A\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010B\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010:\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bC\u0010DB\u0011\b\u0010\u0012\u0006\u0010E\u001a\u00020\u0018¢\u0006\u0004\bC\u0010FJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001f\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b*\u0010%R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b-\u0010.R\u0017\u00103\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u00100\u001a\u0004\b1\u00102R\u0017\u00106\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b4\u0010\u001d\u001a\u0004\b5\u0010\u001fR\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b\"\u0010.R\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010,\u001a\u0004\b8\u0010.R\u0017\u0010:\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b4\u0010.R\u0011\u0010=\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006G"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "", "p", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "Lmj/r;", "a", "Lcom/facebook/AccessTokenSource;", "tokenSource", "graphDomain", "b", "toString", "", "other", "", "equals", "", "hashCode", "Lorg/json/JSONObject;", "o", "()Lorg/json/JSONObject;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "Ljava/util/Date;", "Ljava/util/Date;", "g", "()Ljava/util/Date;", "expires", "", "c", "Ljava/util/Set;", "j", "()Ljava/util/Set;", "permissions", "d", "e", "declinedPermissions", InneractiveMediationDefs.GENDER_FEMALE, "expiredPermissions", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "token", "Lcom/facebook/AccessTokenSource;", CampaignEx.JSON_KEY_AD_K, "()Lcom/facebook/AccessTokenSource;", "source", "h", "i", "lastRefresh", "applicationId", InneractiveMediationDefs.GENDER_MALE, "userId", "dataAccessExpirationTime", "n", "()Z", "isExpired", "accessToken", "", "accessTokenSource", "expirationTime", "lastRefreshTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Date f14010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Date f14011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Date f14012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AccessTokenSource f14013q;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Date expires;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Set<String> permissions;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Set<String> declinedPermissions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Set<String> expiredPermissions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String token;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final AccessTokenSource source;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Date lastRefresh;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String applicationId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String userId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final Date dataAccessExpirationTime;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final String graphDomain;

    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$a;", "", "Lcom/facebook/AccessToken;", "accessToken", "Lmj/r;", "b", "Lcom/facebook/FacebookException;", "exception", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void a(FacebookException facebookException);

        void b(AccessToken accessToken);
    }

    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/AccessToken$b", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Parcelable.Creator<AccessToken> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(Parcel source) {
            p.j(source, "source");
            return new AccessToken(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int size) {
            return new AccessToken[size];
        }
    }

    /* JADX INFO: renamed from: com.facebook.AccessToken$c, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u001bR\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u001bR\u0014\u0010.\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\u001bR\u0014\u0010/\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\u001bR\u0014\u00100\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\u001bR\u0014\u00101\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\u001bR\u0014\u00102\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00103\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\u001bR\u0014\u00104\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010\u001bR\u0014\u00105\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010\u001bR\u0014\u00106\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\u001bR\u0014\u00107\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010\u001b¨\u0006:"}, d2 = {"Lcom/facebook/AccessToken$c;", "", "Lcom/facebook/AccessToken;", "e", "accessToken", "Lmj/r;", "h", "", "g", "d", VideoLookHistoryEntry.CURRNET, "a", "(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "c", "(Landroid/os/Bundle;)Lcom/facebook/AccessToken;", "", C3426d4.i.W, "", InneractiveMediationDefs.GENDER_FEMALE, "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "Lorg/json/JSONObject;", "jsonObject", "b", "(Lorg/json/JSONObject;)Lcom/facebook/AccessToken;", "ACCESS_TOKEN_KEY", "Ljava/lang/String;", "APPLICATION_ID_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "CURRENT_JSON_FORMAT", "I", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "Lcom/facebook/AccessTokenSource;", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "Ljava/util/Date;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final AccessToken a(AccessToken current) {
            p.j(current, VideoLookHistoryEntry.CURRNET);
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.j(), current.e(), current.f(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        public final AccessToken b(JSONObject jsonObject) throws JSONException {
            p.j(jsonObject, "jsonObject");
            if (jsonObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String string = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray jSONArray = jsonObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jsonObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jsonObject.getLong("last_refresh"));
            String string2 = jsonObject.getString("source");
            p.i(string2, "jsonObject.getString(SOURCE_KEY)");
            AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(string2);
            String string3 = jsonObject.getString("application_id");
            String string4 = jsonObject.getString("user_id");
            Date date3 = new Date(jsonObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jsonObject.optString("graph_domain", null);
            p.i(string, "token");
            p.i(string3, "applicationId");
            p.i(string4, "userId");
            j0 j0Var = j0.f14425a;
            p.i(jSONArray, "permissionsArray");
            List<String> listB0 = j0.b0(jSONArray);
            p.i(jSONArray2, "declinedPermissionsArray");
            return new AccessToken(string, string3, string4, listB0, j0.b0(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : j0.b0(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, date3, strOptString);
        }

        public final AccessToken c(Bundle bundle) {
            String string;
            p.j(bundle, ContainerActivity.BUNDLE);
            List<String> listF = f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> listF2 = f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> listF3 = f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            a0.Companion companion = a0.INSTANCE;
            String strA = companion.a(bundle);
            if (j0.X(strA)) {
                strA = t.m();
            }
            String str = strA;
            String strF = companion.f(bundle);
            if (strF == null) {
                return null;
            }
            JSONObject jSONObjectF = j0.f(strF);
            if (jSONObjectF == null) {
                string = null;
            } else {
                try {
                    string = jSONObjectF.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(strF, str, string, listF, listF2, listF3, companion.e(bundle), companion.c(bundle), companion.d(bundle), null, null, 1024, null);
        }

        public final void d() {
            AccessToken accessTokenI = f.INSTANCE.e().getCurrentAccessTokenField();
            if (accessTokenI != null) {
                h(a(accessTokenI));
            }
        }

        public final AccessToken e() {
            return f.INSTANCE.e().getCurrentAccessTokenField();
        }

        public final List<String> f(Bundle bundle, String key) {
            p.j(bundle, ContainerActivity.BUNDLE);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
            if (stringArrayList == null) {
                return s.k();
            }
            List<String> listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            p.i(listUnmodifiableList, "{\n            Collections.unmodifiableList(ArrayList(originalPermissions))\n          }");
            return listUnmodifiableList;
        }

        public final boolean g() {
            AccessToken accessTokenI = f.INSTANCE.e().getCurrentAccessTokenField();
            return (accessTokenI == null || accessTokenI.n()) ? false : true;
        }

        public final void h(AccessToken accessToken) {
            f.INSTANCE.e().r(accessToken);
        }
    }

    /* JADX INFO: compiled from: AccessToken.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessTokenSource.valuesCustom().length];
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i10, i iVar) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i10 & 1024) != 0 ? "facebook" : str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        boolean zE;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        if (p.e(this.expires, accessToken.expires) && p.e(this.permissions, accessToken.permissions) && p.e(this.declinedPermissions, accessToken.declinedPermissions) && p.e(this.expiredPermissions, accessToken.expiredPermissions) && p.e(this.token, accessToken.token) && this.source == accessToken.source && p.e(this.lastRefresh, accessToken.lastRefresh) && p.e(this.applicationId, accessToken.applicationId) && p.e(this.userId, accessToken.userId) && p.e(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null) {
                zE = str2 == null;
            } else {
                zE = p.e(str, str2);
            }
            if (zE) {
                return true;
            }
        }
        return false;
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f14010n = date;
        f14011o = date;
        f14012p = new Date();
        f14013q = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new b();
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        p.j(str, "accessToken");
        p.j(str2, "applicationId");
        p.j(str3, "userId");
        k0.h(str, "accessToken");
        k0.h(str2, "applicationId");
        k0.h(str3, "userId");
        this.expires = date == null ? f14011o : date;
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        p.i(setUnmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.permissions = setUnmodifiableSet;
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        p.i(setUnmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.declinedPermissions = setUnmodifiableSet2;
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        p.i(setUnmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = str;
        this.source = b(accessTokenSource == null ? f14013q : accessTokenSource, str4);
        this.lastRefresh = date2 == null ? f14012p : date2;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? f14011o : date3;
        this.graphDomain = str4 == null ? "facebook" : str4;
    }

    public final void a(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append(C3426d4.j.f28586d);
        sb2.append(TextUtils.join(", ", this.permissions));
        sb2.append(C3426d4.j.f28588e);
    }

    public final AccessTokenSource b(AccessTokenSource tokenSource, String graphDomain) {
        if (graphDomain == null || !graphDomain.equals("instagram")) {
            return tokenSource;
        }
        int i10 = d.$EnumSwitchMapping$0[tokenSource.ordinal()];
        if (i10 == 1) {
            return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
        }
        if (i10 != 2) {
            return i10 != 3 ? tokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW;
        }
        return AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    public final Set<String> e() {
        return this.declinedPermissions;
    }

    public final Set<String> f() {
        return this.expiredPermissions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Date getExpires() {
        return this.expires;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getGraphDomain() {
        return this.graphDomain;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    public final Set<String> j() {
        return this.permissions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final AccessTokenSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final boolean n() {
        return new Date().after(this.expires);
    }

    public final JSONObject o() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put("expires_at", this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put("last_refresh", this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put("application_id", this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put("data_access_expiration_time", this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public final String p() {
        t tVar = t.f66343a;
        return t.H(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(p());
        a(sb2);
        sb2.append(h.f44172e);
        String string = sb2.toString();
        p.i(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.j(parcel, "dest");
        parcel.writeLong(this.expires.getTime());
        parcel.writeStringList(new ArrayList(this.permissions));
        parcel.writeStringList(new ArrayList(this.declinedPermissions));
        parcel.writeStringList(new ArrayList(this.expiredPermissions));
        parcel.writeString(this.token);
        parcel.writeString(this.source.name());
        parcel.writeLong(this.lastRefresh.getTime());
        parcel.writeString(this.applicationId);
        parcel.writeString(this.userId);
        parcel.writeLong(this.dataAccessExpirationTime.getTime());
        parcel.writeString(this.graphDomain);
    }

    public AccessToken(Parcel parcel) {
        AccessTokenSource accessTokenSourceValueOf;
        p.j(parcel, "parcel");
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        p.i(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.permissions = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        p.i(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.declinedPermissions = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        p.i(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.expiredPermissions = setUnmodifiableSet3;
        this.token = k0.l(parcel.readString(), "token");
        String string = parcel.readString();
        if (string != null) {
            accessTokenSourceValueOf = AccessTokenSource.valueOf(string);
        } else {
            accessTokenSourceValueOf = f14013q;
        }
        this.source = accessTokenSourceValueOf;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = k0.l(parcel.readString(), "applicationId");
        this.userId = k0.l(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
