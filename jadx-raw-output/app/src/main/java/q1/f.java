package q1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.signals.SignalManager;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: AccessTokenManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 -2\u00020\u0001:\u0005\u0014\u0018\u001b\u001f#B\u0019\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b+\u0010,J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010&\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lq1/f;", "", "", "j", "Lmj/r;", "g", "h", "Lcom/facebook/AccessToken$a;", "callback", CampaignEx.JSON_KEY_AD_K, "Lcom/facebook/AccessToken;", "currentAccessToken", "saveToCache", "s", "oldAccessToken", "q", "t", "u", InneractiveMediationDefs.GENDER_MALE, "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "a", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "localBroadcastManager", "Lq1/a;", "b", "Lq1/a;", "accessTokenCache", "c", "Lcom/facebook/AccessToken;", "currentAccessTokenField", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tokenRefreshInProgress", "Ljava/util/Date;", "e", "Ljava/util/Date;", "lastAttemptedTokenExtendDate", "value", "i", "()Lcom/facebook/AccessToken;", "r", "(Lcom/facebook/AccessToken;)V", "<init>", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lq1/a;)V", InneractiveMediationDefs.GENDER_FEMALE, "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f66288g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final LocalBroadcastManager localBroadcastManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final a accessTokenCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public AccessToken currentAccessTokenField;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean tokenRefreshInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Date lastAttemptedTokenExtendDate;

    /* JADX INFO: renamed from: q1.f$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lq1/f$a;", "", "Lq1/f;", "e", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest;", "d", "Lq1/f$e;", InneractiveMediationDefs.GENDER_FEMALE, "c", "", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "", "TOKEN_EXTEND_RETRY_SECONDS", "I", "TOKEN_EXTEND_THRESHOLD_SECONDS", "instanceField", "Lq1/f;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final GraphRequest d(AccessToken accessToken, GraphRequest.b callback) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest graphRequestX = GraphRequest.INSTANCE.x(accessToken, "me/permissions", callback);
            graphRequestX.G(bundle);
            graphRequestX.F(HttpMethod.GET);
            return graphRequestX;
        }

        public final GraphRequest c(AccessToken accessToken, GraphRequest.b callback) {
            e eVarF = f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVarF.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestX = GraphRequest.INSTANCE.x(accessToken, eVarF.getGraphPath(), callback);
            graphRequestX.G(bundle);
            graphRequestX.F(HttpMethod.GET);
            return graphRequestX;
        }

        public final f e() {
            f fVar;
            f fVar2 = f.f66288g;
            if (fVar2 == null) {
                synchronized (this) {
                    fVar = f.f66288g;
                    if (fVar == null) {
                        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(t.l());
                        ck.p.i(localBroadcastManager, "getInstance(applicationContext)");
                        f fVar3 = new f(localBroadcastManager, new a());
                        f.f66288g = fVar3;
                        fVar = fVar3;
                    }
                }
                return fVar;
            }
            return fVar2;
        }

        public final e f(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = "facebook";
            }
            if (ck.p.e(graphDomain, "instagram")) {
                return new c();
            }
            return new b();
        }
    }

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Lq1/f$b;", "Lq1/f$e;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "graphPath", "grantType", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String graphPath = "oauth/access_token";

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String grantType = "fb_extend_sso_token";

        @Override // q1.f.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getGrantType() {
            return this.grantType;
        }

        @Override // q1.f.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Lq1/f$c;", "Lq1/f$e;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "graphPath", "grantType", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String graphPath = "refresh_access_token";

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String grantType = "ig_refresh_token";

        @Override // q1.f.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getGrantType() {
            return this.grantType;
        }

        @Override // q1.f.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001a\u0010\u0005\"\u0004\b\u001b\u0010\u0007¨\u0006\u001f"}, d2 = {"Lq1/f$d;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", InneractiveMediationDefs.GENDER_FEMALE, "(Ljava/lang/String;)V", "accessToken", "", "b", "I", "c", "()I", "h", "(I)V", "expiresAt", "d", "i", "expiresIn", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "g", "(Ljava/lang/Long;)V", "dataAccessExpirationTime", "e", "j", "graphDomain", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String accessToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public int expiresAt;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int expiresIn;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public Long dataAccessExpirationTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public String graphDomain;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getExpiresAt() {
            return this.expiresAt;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getExpiresIn() {
            return this.expiresIn;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getGraphDomain() {
            return this.graphDomain;
        }

        public final void f(String str) {
            this.accessToken = str;
        }

        public final void g(Long l10) {
            this.dataAccessExpirationTime = l10;
        }

        public final void h(int i10) {
            this.expiresAt = i10;
        }

        public final void i(int i10) {
            this.expiresIn = i10;
        }

        public final void j(String str) {
            this.graphDomain = str;
        }
    }

    /* JADX INFO: compiled from: AccessTokenManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Lq1/f$e;", "", "", "b", "()Ljava/lang/String;", "graphPath", "a", "grantType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface e {
        /* JADX INFO: renamed from: a */
        String getGrantType();

        /* JADX INFO: renamed from: b */
        String getGraphPath();
    }

    public final void r(AccessToken accessToken) {
        s(accessToken, true);
    }

    public f(LocalBroadcastManager localBroadcastManager, a aVar) {
        ck.p.j(localBroadcastManager, "localBroadcastManager");
        ck.p.j(aVar, "accessTokenCache");
        this.localBroadcastManager = localBroadcastManager;
        this.accessTokenCache = aVar;
        this.tokenRefreshInProgress = new AtomicBoolean(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
    }

    public static final void l(f fVar, AccessToken.a aVar) {
        ck.p.j(fVar, "this$0");
        fVar.m(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    public static final void n(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, z zVar) {
        JSONArray jSONArrayOptJSONArray;
        ck.p.j(atomicBoolean, "$permissionsCallSucceeded");
        ck.p.j(set, "$permissions");
        ck.p.j(set2, "$declinedPermissions");
        ck.p.j(set3, "$expiredPermissions");
        ck.p.j(zVar, "response");
        JSONObject jSONObjectD = zVar.getJsonObject();
        if (jSONObjectD == null || (jSONArrayOptJSONArray = jSONObjectD.optJSONArray("data")) == null) {
            return;
        }
        atomicBoolean.set(true);
        int i10 = 0;
        int length = jSONArrayOptJSONArray.length();
        if (length <= 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 1;
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("permission");
                String strOptString2 = jSONObjectOptJSONObject.optString("status");
                if (!com.facebook.internal.j0.X(strOptString) && !com.facebook.internal.j0.X(strOptString2)) {
                    ck.p.i(strOptString2, "status");
                    Locale locale = Locale.US;
                    ck.p.i(locale, "US");
                    String lowerCase = strOptString2.toLowerCase(locale);
                    ck.p.i(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    ck.p.i(lowerCase, "status");
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                set2.add(strOptString);
                            } else {
                                Log.w("AccessTokenManager", ck.p.s("Unexpected status: ", lowerCase));
                            }
                        } else if (lowerCase.equals("granted")) {
                            set.add(strOptString);
                        } else {
                            Log.w("AccessTokenManager", ck.p.s("Unexpected status: ", lowerCase));
                        }
                    } else if (lowerCase.equals("expired")) {
                        set3.add(strOptString);
                    } else {
                        Log.w("AccessTokenManager", ck.p.s("Unexpected status: ", lowerCase));
                    }
                }
            }
            if (i11 >= length) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    public static final void o(d dVar, z zVar) {
        ck.p.j(dVar, "$refreshResult");
        ck.p.j(zVar, "response");
        JSONObject jSONObjectD = zVar.getJsonObject();
        if (jSONObjectD == null) {
            return;
        }
        dVar.f(jSONObjectD.optString("access_token"));
        dVar.h(jSONObjectD.optInt("expires_at"));
        dVar.i(jSONObjectD.optInt("expires_in"));
        dVar.g(Long.valueOf(jSONObjectD.optLong("data_access_expiration_time")));
        dVar.j(jSONObjectD.optString("graph_domain", null));
    }

    public static final void p(d dVar, AccessToken accessToken, AccessToken.a aVar, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, f fVar, y yVar) throws Throwable {
        AccessToken accessToken2;
        ck.p.j(dVar, "$refreshResult");
        ck.p.j(atomicBoolean, "$permissionsCallSucceeded");
        ck.p.j(set, "$permissions");
        ck.p.j(set2, "$declinedPermissions");
        ck.p.j(set3, "$expiredPermissions");
        ck.p.j(fVar, "this$0");
        ck.p.j(yVar, "it");
        String accessToken3 = dVar.getAccessToken();
        int expiresAt = dVar.getExpiresAt();
        Long dataAccessExpirationTime = dVar.getDataAccessExpirationTime();
        String graphDomain = dVar.getGraphDomain();
        try {
            Companion companion = INSTANCE;
            if (companion.e().getCurrentAccessTokenField() != null) {
                AccessToken currentAccessTokenField = companion.e().getCurrentAccessTokenField();
                if ((currentAccessTokenField == null ? null : currentAccessTokenField.getUserId()) == accessToken.getUserId()) {
                    if (!atomicBoolean.get() && accessToken3 == null && expiresAt == 0) {
                        if (aVar != null) {
                            aVar.a(new FacebookException("Failed to refresh access token"));
                        }
                        fVar.tokenRefreshInProgress.set(false);
                        return;
                    }
                    Date expires = accessToken.getExpires();
                    if (dVar.getExpiresAt() != 0) {
                        expires = new Date(((long) dVar.getExpiresAt()) * 1000);
                    } else if (dVar.getExpiresIn() != 0) {
                        expires = new Date((((long) dVar.getExpiresIn()) * 1000) + new Date().getTime());
                    }
                    Date date = expires;
                    if (accessToken3 == null) {
                        accessToken3 = accessToken.getToken();
                    }
                    String str = accessToken3;
                    String applicationId = accessToken.getApplicationId();
                    String userId = accessToken.getUserId();
                    Set setJ = atomicBoolean.get() ? set : accessToken.j();
                    Set setE = atomicBoolean.get() ? set2 : accessToken.e();
                    Set setF = atomicBoolean.get() ? set3 : accessToken.f();
                    AccessTokenSource source = accessToken.getSource();
                    Date date2 = new Date();
                    Date date3 = dataAccessExpirationTime != null ? new Date(dataAccessExpirationTime.longValue() * 1000) : accessToken.getDataAccessExpirationTime();
                    if (graphDomain == null) {
                        graphDomain = accessToken.getGraphDomain();
                    }
                    AccessToken accessToken4 = new AccessToken(str, applicationId, userId, setJ, setE, setF, source, date, date2, date3, graphDomain);
                    try {
                        companion.e().r(accessToken4);
                        fVar.tokenRefreshInProgress.set(false);
                        if (aVar != null) {
                            aVar.b(accessToken4);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        accessToken2 = accessToken4;
                        fVar.tokenRefreshInProgress.set(false);
                        if (aVar != null && accessToken2 != null) {
                            aVar.b(accessToken2);
                        }
                        throw th;
                    }
                }
            }
            if (aVar != null) {
                aVar.a(new FacebookException("No current access token to refresh"));
            }
            fVar.tokenRefreshInProgress.set(false);
        } catch (Throwable th3) {
            th = th3;
            accessToken2 = null;
        }
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AccessToken getCurrentAccessTokenField() {
        return this.currentAccessTokenField;
    }

    public final boolean j() {
        AccessToken accessTokenF = this.accessTokenCache.f();
        if (accessTokenF == null) {
            return false;
        }
        s(accessTokenF, false);
        return true;
    }

    public final void q(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(t.l(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    public final void s(AccessToken accessToken, boolean z10) {
        AccessToken accessToken2 = this.currentAccessTokenField;
        this.currentAccessTokenField = accessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
        if (z10) {
            if (accessToken != null) {
                this.accessTokenCache.g(accessToken);
            } else {
                this.accessTokenCache.a();
                com.facebook.internal.j0 j0Var = com.facebook.internal.j0.f14425a;
                com.facebook.internal.j0.i(t.l());
            }
        }
        if (com.facebook.internal.j0.e(accessToken2, accessToken)) {
            return;
        }
        q(accessToken2, accessToken);
        t();
    }

    public final void g() {
        q(getCurrentAccessTokenField(), getCurrentAccessTokenField());
    }

    public final void h() {
        if (!u()) {
            return;
        }
        k(null);
    }

    public final void k(final AccessToken.a aVar) {
        if (ck.p.e(Looper.getMainLooper(), Looper.myLooper())) {
            m(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: q1.b
                @Override // java.lang.Runnable
                public final void run() {
                    f.l(this.f66258b, aVar);
                }
            });
        }
    }

    public final void m(final AccessToken.a aVar) {
        final AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            if (aVar != null) {
                aVar.a(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.tokenRefreshInProgress.compareAndSet(false, true)) {
            if (aVar != null) {
                aVar.a(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.lastAttemptedTokenExtendDate = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        Companion companion = INSTANCE;
        y yVar = new y(companion.d(currentAccessTokenField, new GraphRequest.b() { // from class: q1.c
            @Override // com.facebook.GraphRequest.b
            public final void b(z zVar) {
                f.n(atomicBoolean, hashSet, hashSet2, hashSet3, zVar);
            }
        }), companion.c(currentAccessTokenField, new GraphRequest.b() { // from class: q1.d
            @Override // com.facebook.GraphRequest.b
            public final void b(z zVar) {
                f.o(dVar, zVar);
            }
        }));
        yVar.f(new y.a() { // from class: q1.e
            @Override // q1.y.a
            public final void b(y yVar2) throws Throwable {
                f.p(dVar, currentAccessTokenField, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this, yVar2);
            }
        });
        yVar.j();
    }

    public final void t() {
        Date expires;
        Context contextL = t.l();
        AccessToken.Companion companion = AccessToken.INSTANCE;
        AccessToken accessTokenE = companion.e();
        AlarmManager alarmManager = (AlarmManager) contextL.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (companion.g()) {
            if (accessTokenE == null) {
                expires = null;
            } else {
                expires = accessTokenE.getExpires();
            }
            if (expires != null && alarmManager != null) {
                Intent intent = new Intent(contextL, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, accessTokenE.getExpires().getTime(), PendingIntent.getBroadcast(contextL, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean u() {
        AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            return false;
        }
        long time = new Date().getTime();
        if (!currentAccessTokenField.getSource().getCanExtendToken() || time - this.lastAttemptedTokenExtendDate.getTime() <= 3600000 || time - currentAccessTokenField.getLastRefresh().getTime() <= SignalManager.TWENTY_FOUR_HOURS_MILLIS) {
            return false;
        }
        return true;
    }
}
