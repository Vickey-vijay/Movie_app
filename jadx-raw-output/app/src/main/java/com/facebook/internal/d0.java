package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.ads.internal.util.common.FbValidationUtils;
import com.facebook.login.DefaultAudience;
import com.facebook.login.LoginTargetApp;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.Ne;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: NativeProtocol.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0007_NQ\b\u0005\u0004)B\t\b\u0002¢\u0006\u0004\b]\u0010^J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001a\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0006H\u0002J¢\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J \u0010$\u001a\u00020#2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!H\u0002J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010)\u001a\u00020(2\u0006\u0010\t\u001a\u00020\u0003H\u0002J&\u0010-\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007J&\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u001e2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007J|\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007Jª\u0001\u00101\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00022\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\n\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u00102\u001a\u00020&H\u0007J\u0010\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u00020&H\u0007J&\u0010:\u001a\u0004\u0018\u00010\u001e2\u0006\u00105\u001a\u00020\u001e2\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u000108H\u0007J\u0012\u0010;\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020*H\u0007J\u0010\u0010<\u001a\u00020&2\u0006\u0010,\u001a\u00020\u001eH\u0007J\u0014\u0010>\u001a\u0004\u0018\u00010=2\b\u0010,\u001a\u0004\u0018\u00010\u001eH\u0007J\u0012\u0010?\u001a\u0004\u0018\u0001062\u0006\u0010,\u001a\u00020\u001eH\u0007J\u0012\u0010@\u001a\u0004\u0018\u0001062\u0006\u0010,\u001a\u00020\u001eH\u0007J\u0010\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u001eH\u0007J\u0014\u0010D\u001a\u0004\u0018\u0001082\b\u0010C\u001a\u0004\u0018\u000106H\u0007J\u0014\u0010E\u001a\u0004\u0018\u0001062\b\u0010\u0005\u001a\u0004\u0018\u000108H\u0007J\u0010\u0010G\u001a\u00020&2\u0006\u0010F\u001a\u00020&H\u0007J\b\u0010I\u001a\u00020HH\u0007J(\u0010L\u001a\u00020&2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u0006\u0010K\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0007R\u001c\u0010P\u001a\n M*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010RR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010XR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020&0Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010[¨\u0006`"}, d2 = {"Lcom/facebook/internal/d0;", "", "", "Lcom/facebook/internal/d0$e;", InneractiveMediationDefs.GENDER_FEMALE, "e", "", "", "d", "appInfo", "applicationId", "", "permissions", "e2e", "", "isForPublish", "Lcom/facebook/login/DefaultAudience;", "defaultAudience", "clientState", "authType", "ignoreAppSwitchToLoggedOut", "messengerPageId", "resetMessengerState", "Lcom/facebook/login/LoginTargetApp;", "targetApp", "isFamilyLogin", "shouldSkipAccountDedupe", "nonce", "codeChallenge", "codeChallengeMethod", "Landroid/content/Intent;", CampaignEx.JSON_KEY_AD_K, "appInfoList", "", "versionSpec", "Lcom/facebook/internal/d0$f;", "s", "Ljava/util/TreeSet;", "", "o", "Landroid/net/Uri;", "g", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "intent", "B", "C", "isRerequest", "j", "n", "u", "version", VastAttributes.VERTICAL_POSITION, "requestIntent", "Landroid/os/Bundle;", "results", "Lcom/facebook/FacebookException;", "error", InneractiveMediationDefs.GENDER_MALE, "l", "w", "Ljava/util/UUID;", "q", "p", "v", "resultIntent", VastAttributes.HORIZONTAL_POSITION, "errorData", "r", "i", "minimumVersion", "t", "Lmj/r;", "z", "allAvailableFacebookAppVersions", "latestSdkVersion", "h", "kotlin.jvm.PlatformType", "b", "Ljava/lang/String;", "TAG", "c", "Ljava/util/List;", "facebookAppInfoList", "effectCameraAppInfoList", "Ljava/util/Map;", "actionToAppInfoMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "protocolVersionsAsyncUpdating", "", "[Ljava/lang/Integer;", "KNOWN_PROTOCOL_VERSIONS", "<init>", "()V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f14364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final List<e> facebookAppInfoList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final List<e> effectCameraAppInfoList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, List<e>> actionToAppInfoMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean protocolVersionsAsyncUpdating;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Integer[] KNOWN_PROTOCOL_VERSIONS;

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/facebook/internal/d0$b;", "Lcom/facebook/internal/d0$e;", "", "c", "d", "e", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends e {
        @Override // com.facebook.internal.d0.e
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // com.facebook.internal.d0.e
        public String d() {
            return "com.instagram.android";
        }

        @Override // com.facebook.internal.d0.e
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/d0$e;", "", "", "d", "c", "e", "Lmj/r;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/TreeSet;", "", "b", "", "force", "a", "Ljava/util/TreeSet;", "availableVersions", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public TreeSet<Integer> availableVersions;

        /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0038, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0013, B:12:0x0023, B:14:0x0027, B:20:0x0033, B:8:0x000b, B:11:0x001b), top: B:26:0x0003 }] */
        /* JADX WARN: Code duplicated, block: B:18:0x0030  */
        /* JADX WARN: Code duplicated, block: B:20:0x0033 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:9:0x0013, B:12:0x0023, B:14:0x0027, B:20:0x0033, B:8:0x000b, B:11:0x001b), top: B:26:0x0003 }] */
        public final synchronized void a(boolean z10) {
            TreeSet<Integer> treeSet;
            boolean z11;
            if (z10) {
                this.availableVersions = d0.b(d0.f14364a, this);
                treeSet = this.availableVersions;
                if (treeSet != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (z11) {
                    f();
                }
            } else {
                TreeSet<Integer> treeSet2 = this.availableVersions;
                if (treeSet2 == null) {
                    this.availableVersions = d0.b(d0.f14364a, this);
                } else {
                    if (!ck.p.e(treeSet2 == null ? null : Boolean.valueOf(treeSet2.isEmpty()), Boolean.FALSE)) {
                        this.availableVersions = d0.b(d0.f14364a, this);
                    }
                }
                treeSet = this.availableVersions;
                if (treeSet != null || treeSet.isEmpty()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f();
                }
            }
            throw th;
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0018  */
        public final TreeSet<Integer> b() {
            TreeSet<Integer> treeSet = this.availableVersions;
            if (treeSet == null) {
                a(false);
            } else {
                if (!ck.p.e(treeSet == null ? null : Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    a(false);
                }
            }
            return this.availableVersions;
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/facebook/internal/d0$f;", "", "Lcom/facebook/internal/d0$e;", "<set-?>", "a", "Lcom/facebook/internal/d0$e;", "getAppInfo", "()Lcom/facebook/internal/d0$e;", "appInfo", "", "b", "I", "c", "()I", Ne.f27144j2, "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class f {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public e appInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public int protocolVersion;

        /* JADX INFO: renamed from: com.facebook.internal.d0$f$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: NativeProtocol.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/d0$f$a;", "", "Lcom/facebook/internal/d0$e;", "nativeAppInfo", "", Ne.f27144j2, "Lcom/facebook/internal/d0$f;", "a", "b", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final f a(e nativeAppInfo, int protocolVersion) {
                f fVar = new f(null);
                fVar.appInfo = nativeAppInfo;
                fVar.protocolVersion = protocolVersion;
                return fVar;
            }

            public final f b() {
                f fVar = new f(null);
                fVar.protocolVersion = -1;
                return fVar;
            }
        }

        public f() {
        }

        public /* synthetic */ f(ck.i iVar) {
            this();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getProtocolVersion() {
            return this.protocolVersion;
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/facebook/internal/d0$g;", "Lcom/facebook/internal/d0$e;", "", "c", "d", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class g extends e {
        @Override // com.facebook.internal.d0.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.d0.e
        public String d() {
            return FbValidationUtils.DEBUG_FB_PACKAGE;
        }
    }

    public static final List<Intent> n(Context context, String applicationId, Collection<String> permissions, String e2e, boolean isRerequest, boolean isForPublish, DefaultAudience defaultAudience, String clientState, String authType, boolean ignoreAppSwitchToLoggedOut, String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, String nonce, String codeChallenge, String codeChallengeMethod) {
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            ck.p.j(applicationId, "applicationId");
            ck.p.j(permissions, "permissions");
            ck.p.j(e2e, "e2e");
            ck.p.j(defaultAudience, "defaultAudience");
            ck.p.j(clientState, "clientState");
            ck.p.j(authType, "authType");
            List<e> list = facebookAppInfoList;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                Intent intentK = f14364a.k((e) it.next(), applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, ignoreAppSwitchToLoggedOut, messengerPageId, resetMessengerState, LoginTargetApp.FACEBOOK, isFamilyLogin, shouldSkipAccountDedupe, nonce, codeChallenge, codeChallengeMethod);
                if (intentK != null) {
                    arrayList2.add(intentK);
                }
                arrayList = arrayList2;
            }
            return arrayList;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public final Intent k(e appInfo, String applicationId, Collection<String> permissions, String e2e, boolean isForPublish, DefaultAudience defaultAudience, String clientState, String authType, boolean ignoreAppSwitchToLoggedOut, String messengerPageId, boolean resetMessengerState, LoginTargetApp targetApp, boolean isFamilyLogin, boolean shouldSkipAccountDedupe, String nonce, String codeChallenge, String codeChallengeMethod) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            String strC = appInfo.c();
            if (strC == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(appInfo.d(), strC).putExtra("client_id", applicationId);
            ck.p.i(intentPutExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            intentPutExtra.putExtra("facebook_sdk_version", q1.t.B());
            if (!j0.Y(permissions)) {
                intentPutExtra.putExtra("scope", TextUtils.join(StringUtils.COMMA, permissions));
            }
            if (!j0.X(e2e)) {
                intentPutExtra.putExtra("e2e", e2e);
            }
            intentPutExtra.putExtra("state", clientState);
            intentPutExtra.putExtra("response_type", appInfo.e());
            intentPutExtra.putExtra("nonce", nonce);
            intentPutExtra.putExtra("return_scopes", "true");
            if (isForPublish) {
                intentPutExtra.putExtra("default_audience", defaultAudience.getNativeProtocolAudience());
            }
            intentPutExtra.putExtra("legacy_override", q1.t.w());
            intentPutExtra.putExtra("auth_type", authType);
            if (ignoreAppSwitchToLoggedOut) {
                intentPutExtra.putExtra("fail_on_logged_out", true);
            }
            intentPutExtra.putExtra("messenger_page_id", messengerPageId);
            intentPutExtra.putExtra("reset_messenger_state", resetMessengerState);
            if (isFamilyLogin) {
                intentPutExtra.putExtra("fx_app", targetApp.getTargetApp());
            }
            if (shouldSkipAccountDedupe) {
                intentPutExtra.putExtra("skip_dedupe", true);
            }
            return intentPutExtra;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/facebook/internal/d0$a;", "Lcom/facebook/internal/d0$e;", "", "g", "", "d", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends e {
        @Override // com.facebook.internal.d0.e
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }

        @Override // com.facebook.internal.d0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/d0$c;", "Lcom/facebook/internal/d0$e;", "", "c", "d", "Lmj/r;", InneractiveMediationDefs.GENDER_FEMALE, "", "g", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c extends e {
        @Override // com.facebook.internal.d0.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.d0.e
        public String d() {
            return FbValidationUtils.FB_PACKAGE;
        }

        @Override // com.facebook.internal.d0.e
        public void f() {
            if (g()) {
                Log.w(d0.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }

        public final boolean g() {
            if (q1.t.l().getApplicationInfo().targetSdkVersion >= 30) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: NativeProtocol.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/facebook/internal/d0$d;", "Lcom/facebook/internal/d0$e;", "", "g", "", "d", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class d extends e {
        @Override // com.facebook.internal.d0.e
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }

        @Override // com.facebook.internal.d0.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }
    }

    static {
        d0 d0Var = new d0();
        f14364a = d0Var;
        TAG = d0.class.getName();
        facebookAppInfoList = d0Var.f();
        effectCameraAppInfoList = d0Var.e();
        actionToAppInfoMap = d0Var.d();
        protocolVersionsAsyncUpdating = new AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final void A() {
        if (i2.a.d(d0.class)) {
            return;
        }
        try {
            try {
                Iterator<e> it = facebookAppInfoList.iterator();
                while (it.hasNext()) {
                    it.next().a(true);
                }
                protocolVersionsAsyncUpdating.set(false);
            } catch (Throwable th2) {
                protocolVersionsAsyncUpdating.set(false);
                throw th2;
            }
        } catch (Throwable th3) {
            i2.a.b(th3, d0.class);
        }
    }

    public static final Intent B(Context context, Intent intent, e appInfo) {
        ResolveInfo resolveInfoResolveActivity;
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            if (intent == null || (resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            k kVar = k.f14433a;
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ck.p.i(str, "resolveInfo.activityInfo.packageName");
            if (k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final Intent C(Context context, Intent intent, e appInfo) {
        ResolveInfo resolveInfoResolveService;
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            if (intent == null || (resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            k kVar = k.f14433a;
            String str = resolveInfoResolveService.serviceInfo.packageName;
            ck.p.i(str, "resolveInfo.serviceInfo.packageName");
            if (k.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(d0 d0Var, e eVar) {
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            return d0Var.o(eVar);
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final int h(TreeSet<Integer> allAvailableFacebookAppVersions, int latestSdkVersion, int[] versionSpec) {
        if (i2.a.d(d0.class)) {
            return 0;
        }
        try {
            ck.p.j(versionSpec, "versionSpec");
            if (allAvailableFacebookAppVersions == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator<Integer> itDescendingIterator = allAvailableFacebookAppVersions.descendingIterator();
            int iMax = -1;
            while (itDescendingIterator.hasNext()) {
                Integer next = itDescendingIterator.next();
                ck.p.i(next, "fbAppVersion");
                iMax = Math.max(iMax, next.intValue());
                while (length >= 0 && versionSpec[length] > next.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == next.intValue()) {
                    if (length % 2 == 0) {
                        return Math.min(iMax, latestSdkVersion);
                    }
                    return -1;
                }
            }
            return -1;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return 0;
        }
    }

    public static final Bundle i(FacebookException e10) {
        if (i2.a.d(d0.class) || e10 == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", e10.toString());
            if (e10 instanceof FacebookOperationCanceledException) {
                bundle.putString("error_type", "UserCanceled");
            }
            return bundle;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final Intent j(Context context, String applicationId, Collection<String> permissions, String e2e, boolean isRerequest, boolean isForPublish, DefaultAudience defaultAudience, String clientState, String authType, String messengerPageId, boolean resetMessengerState, boolean isFamilyLogin, boolean shouldSkipAccountDedupe) {
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            ck.p.j(applicationId, "applicationId");
            ck.p.j(permissions, "permissions");
            ck.p.j(e2e, "e2e");
            ck.p.j(defaultAudience, "defaultAudience");
            ck.p.j(clientState, "clientState");
            ck.p.j(authType, "authType");
            b bVar = new b();
            return B(context, f14364a.k(bVar, applicationId, permissions, e2e, isForPublish, defaultAudience, clientState, authType, false, messengerPageId, resetMessengerState, LoginTargetApp.INSTAGRAM, isFamilyLogin, shouldSkipAccountDedupe, "", null, null), bVar);
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final Intent l(Context context) {
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            ck.p.j(context, GAMConfig.KEY_CONTEXT);
            for (e eVar : facebookAppInfoList) {
                Intent intentC = C(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (intentC != null) {
                    return intentC;
                }
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final Intent m(Intent requestIntent, Bundle results, FacebookException error) {
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            ck.p.j(requestIntent, "requestIntent");
            UUID uuidQ = q(requestIntent);
            if (uuidQ == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", w(requestIntent));
            Bundle bundle = new Bundle();
            bundle.putString("action_id", uuidQ.toString());
            if (error != null) {
                bundle.putBundle("error", i(error));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle);
            if (results != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", results);
            }
            return intent;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final Bundle p(Intent intent) {
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            ck.p.j(intent, "intent");
            if (y(w(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final UUID q(Intent intent) {
        String stringExtra;
        if (i2.a.d(d0.class) || intent == null) {
            return null;
        }
        try {
            if (y(w(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra == null) {
                return null;
            }
            try {
                return UUID.fromString(stringExtra);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final FacebookException r(Bundle errorData) {
        if (i2.a.d(d0.class) || errorData == null) {
            return null;
        }
        try {
            String string = errorData.getString("error_type");
            if (string == null) {
                string = errorData.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = errorData.getString("error_description");
            if (string2 == null) {
                string2 = errorData.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !lk.x.E(string, "UserCanceled", true)) ? new FacebookException(string2) : new FacebookOperationCanceledException(string2);
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final int t(int minimumVersion) {
        if (i2.a.d(d0.class)) {
            return 0;
        }
        try {
            return f14364a.s(facebookAppInfoList, new int[]{minimumVersion}).getProtocolVersion();
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return 0;
        }
    }

    public static final int u() {
        if (i2.a.d(d0.class)) {
            return 0;
        }
        try {
            return KNOWN_PROTOCOL_VERSIONS[0].intValue();
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return 0;
        }
    }

    public static final Bundle v(Intent intent) {
        if (i2.a.d(d0.class)) {
            return null;
        }
        try {
            ck.p.j(intent, "intent");
            return !y(w(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return null;
        }
    }

    public static final int w(Intent intent) {
        if (i2.a.d(d0.class)) {
            return 0;
        }
        try {
            ck.p.j(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return 0;
        }
    }

    public static final boolean x(Intent resultIntent) {
        if (i2.a.d(d0.class)) {
            return false;
        }
        try {
            ck.p.j(resultIntent, "resultIntent");
            Bundle bundleP = p(resultIntent);
            Boolean boolValueOf = bundleP == null ? null : Boolean.valueOf(bundleP.containsKey("error"));
            return boolValueOf == null ? resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE") : boolValueOf.booleanValue();
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return false;
        }
    }

    public static final boolean y(int version) {
        if (i2.a.d(d0.class)) {
            return false;
        }
        try {
            return nj.n.D(KNOWN_PROTOCOL_VERSIONS, Integer.valueOf(version)) && version >= 20140701;
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
            return false;
        }
    }

    public static final void z() {
        if (i2.a.d(d0.class)) {
            return;
        }
        try {
            if (protocolVersionsAsyncUpdating.compareAndSet(false, true)) {
                q1.t.t().execute(new Runnable() { // from class: com.facebook.internal.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        d0.A();
                    }
                });
            }
        } catch (Throwable th2) {
            i2.a.b(th2, d0.class);
        }
    }

    public final TreeSet<Integer> o(e appInfo) {
        Cursor cursor;
        ProviderInfo providerInfoResolveContentProvider;
        Cursor cursorQuery;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = q1.t.l().getContentResolver();
            String[] strArr = {"version"};
            Uri uriG = g(appInfo);
            try {
                try {
                    providerInfoResolveContentProvider = q1.t.l().getPackageManager().resolveContentProvider(ck.p.s(appInfo.d(), ".provider.PlatformProvider"), 0);
                } catch (RuntimeException e10) {
                    Log.e(TAG, "Failed to query content resolver.", e10);
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        try {
                            try {
                                cursorQuery = contentResolver.query(uriG, strArr, null, null, null);
                            } catch (NullPointerException unused) {
                                Log.e(TAG, "Failed to query content resolver.");
                                cursorQuery = null;
                            }
                        } catch (IllegalArgumentException unused2) {
                            Log.e(TAG, "Failed to query content resolver.");
                            cursorQuery = null;
                        }
                    } catch (SecurityException unused3) {
                        Log.e(TAG, "Failed to query content resolver.");
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th2) {
                                cursor = cursorQuery;
                                th = th2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (Throwable th4) {
            i2.a.b(th4, this);
            return null;
        }
    }

    public final Map<String, List<e>> d() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List<e> list = facebookAppInfoList;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", effectCameraAppInfoList);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final List<e> e() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayListG = nj.s.g(new a());
            arrayListG.addAll(f());
            return arrayListG;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final List<e> f() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            return nj.s.g(new c(), new g());
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final Uri g(e appInfo) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            Uri uri = Uri.parse("content://" + appInfo.d() + ".provider.PlatformProvider/versions");
            ck.p.i(uri, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return uri;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final f s(List<? extends e> appInfoList, int[] versionSpec) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            z();
            if (appInfoList == null) {
                return f.INSTANCE.b();
            }
            for (e eVar : appInfoList) {
                int iH = h(eVar.b(), u(), versionSpec);
                if (iH != -1) {
                    return f.INSTANCE.a(eVar, iH);
                }
            }
            return f.INSTANCE.b();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }
}
