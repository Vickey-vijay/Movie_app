package com.facebook.internal;

import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: FetchedAppSettings.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 H2\u00020\u0001:\u0002\u0004\bBÅ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u001e\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u001e0\u001e\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020'\u0012\u0006\u0010-\u001a\u00020\u0007\u0012\u0006\u0010/\u001a\u00020\u0007\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\b\u00107\u001a\u0004\u0018\u000103\u0012\u0006\u00109\u001a\u00020\u0007\u0012\u0006\u0010<\u001a\u00020\u0002\u0012\u0006\u0010?\u001a\u00020\u0002\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bF\u0010GJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR/\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0\u001e0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0005\u001a\u0004\b\u0004\u0010\u000fR\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\r\u0010*R\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b,\u0010\u000bR\u0017\u0010/\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b.\u0010\u000bR\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0005\u001a\u0004\b\u0019\u0010\u000fR\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\b\u0010\u000fR\u0019\u00107\u001a\u0004\u0018\u0001038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u0012\u00106R\u0017\u00109\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b(\u0010\u000bR\u0017\u0010<\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010\u0005\u001a\u0004\b;\u0010\u000fR\u0017\u0010?\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010\u0005\u001a\u0004\b>\u0010\u000fR\u0019\u0010A\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b@\u0010\t\u001a\u0004\b \u0010\u000bR\u0019\u0010C\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bB\u0010\t\u001a\u0004\b0\u0010\u000bR\u0019\u0010E\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bD\u0010\t\u001a\u0004\b%\u0010\u000b¨\u0006I"}, d2 = {"Lcom/facebook/internal/q;", "", "", "l", "a", "Z", "supportsImplicitLogging", "", "b", "Ljava/lang/String;", "getNuxContent", "()Ljava/lang/String;", "nuxContent", "c", "getNuxEnabled", "()Z", "nuxEnabled", "", "d", "I", "i", "()I", "sessionTimeoutInSeconds", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "e", "Ljava/util/EnumSet;", "j", "()Ljava/util/EnumSet;", "smartLoginOptions", "", "Lcom/facebook/internal/q$b;", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/util/Map;", "getDialogConfigurations", "()Ljava/util/Map;", "dialogConfigurations", "g", "automaticLoggingEnabled", "Lcom/facebook/internal/j;", "h", "Lcom/facebook/internal/j;", "()Lcom/facebook/internal/j;", "errorClassification", "getSmartLoginBookmarkIconURL", "smartLoginBookmarkIconURL", "getSmartLoginMenuIconURL", "smartLoginMenuIconURL", CampaignEx.JSON_KEY_AD_K, "iAPAutomaticLoggingEnabled", "codelessEventsEnabled", "Lorg/json/JSONArray;", InneractiveMediationDefs.GENDER_MALE, "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "eventBindings", "n", "sdkUpdateMessage", "o", "getTrackUninstallEnabled", "trackUninstallEnabled", "p", "getMonitorViaDialogEnabled", "monitorViaDialogEnabled", "q", "rawAamRules", "r", "suggestedEventsSetting", "s", "restrictiveDataSetting", "<init>", "(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLcom/facebook/internal/j;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "t", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean supportsImplicitLogging;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String nuxContent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean nuxEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int sessionTimeoutInSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final EnumSet<SmartLoginOption> smartLoginOptions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Map<String, b>> dialogConfigurations;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final boolean automaticLoggingEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final j errorClassification;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String smartLoginBookmarkIconURL;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String smartLoginMenuIconURL;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final boolean iAPAutomaticLoggingEnabled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final boolean codelessEventsEnabled;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final JSONArray eventBindings;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String sdkUpdateMessage;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final boolean trackUninstallEnabled;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final boolean monitorViaDialogEnabled;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final String rawAamRules;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final String suggestedEventsSetting;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final String restrictiveDataSetting;

    /* JADX INFO: compiled from: FetchedAppSettings.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0003B-\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/facebook/internal/q$b;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "dialogName", "b", "featureName", "Landroid/net/Uri;", "c", "Landroid/net/Uri;", "getFallbackUrl", "()Landroid/net/Uri;", "fallbackUrl", "", "d", "[I", "getVersionSpec", "()[I", "versionSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V", "e", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final String dialogName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final String featureName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final Uri fallbackUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int[] versionSpec;

        /* JADX INFO: renamed from: com.facebook.internal.q$b$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: FetchedAppSettings.kt */
        @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/q$b$a;", "", "Lorg/json/JSONObject;", "dialogConfigJSON", "Lcom/facebook/internal/q$b;", "a", "Lorg/json/JSONArray;", "versionsJSON", "", "b", "", "DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR", "Ljava/lang/String;", "DIALOG_CONFIG_NAME_KEY", "DIALOG_CONFIG_URL_KEY", "DIALOG_CONFIG_VERSIONS_KEY", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(ck.i iVar) {
                this();
            }

            public final b a(JSONObject dialogConfigJSON) {
                ck.p.j(dialogConfigJSON, "dialogConfigJSON");
                String strOptString = dialogConfigJSON.optString("name");
                if (j0.X(strOptString)) {
                    return null;
                }
                ck.p.i(strOptString, "dialogNameWithFeature");
                List listN0 = lk.a0.N0(strOptString, new String[]{ImpressionLog.Q}, false, 0, 6, null);
                if (listN0.size() != 2) {
                    return null;
                }
                String str = (String) nj.b0.f0(listN0);
                String str2 = (String) nj.b0.r0(listN0);
                if (j0.X(str) || j0.X(str2)) {
                    return null;
                }
                String strOptString2 = dialogConfigJSON.optString("url");
                return new b(str, str2, j0.X(strOptString2) ? null : Uri.parse(strOptString2), b(dialogConfigJSON.optJSONArray("versions")), null);
            }

            public final int[] b(JSONArray versionsJSON) {
                if (versionsJSON == null) {
                    return null;
                }
                int length = versionsJSON.length();
                int[] iArr = new int[length];
                int i10 = 0;
                if (length <= 0) {
                    return iArr;
                }
                while (true) {
                    int i11 = i10 + 1;
                    int i12 = -1;
                    int iOptInt = versionsJSON.optInt(i10, -1);
                    if (iOptInt == -1) {
                        String strOptString = versionsJSON.optString(i10);
                        if (!j0.X(strOptString)) {
                            try {
                                ck.p.i(strOptString, "versionString");
                                i12 = Integer.parseInt(strOptString);
                            } catch (NumberFormatException e10) {
                                j0.d0("FacebookSDK", e10);
                            }
                            iOptInt = i12;
                        }
                    }
                    iArr[i10] = iOptInt;
                    if (i11 >= length) {
                        return iArr;
                    }
                    i10 = i11;
                }
            }
        }

        public b(String str, String str2, Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, ck.i iVar) {
            this(str, str2, uri, iArr);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDialogName() {
            return this.dialogName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFeatureName() {
            return this.featureName;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(boolean z10, String str, boolean z11, int i10, EnumSet<SmartLoginOption> enumSet, Map<String, ? extends Map<String, b>> map, boolean z12, j jVar, String str2, String str3, boolean z13, boolean z14, JSONArray jSONArray, String str4, boolean z15, boolean z16, String str5, String str6, String str7) {
        ck.p.j(str, "nuxContent");
        ck.p.j(enumSet, "smartLoginOptions");
        ck.p.j(map, "dialogConfigurations");
        ck.p.j(jVar, "errorClassification");
        ck.p.j(str2, "smartLoginBookmarkIconURL");
        ck.p.j(str3, "smartLoginMenuIconURL");
        ck.p.j(str4, "sdkUpdateMessage");
        this.supportsImplicitLogging = z10;
        this.nuxContent = str;
        this.nuxEnabled = z11;
        this.sessionTimeoutInSeconds = i10;
        this.smartLoginOptions = enumSet;
        this.dialogConfigurations = map;
        this.automaticLoggingEnabled = z12;
        this.errorClassification = jVar;
        this.smartLoginBookmarkIconURL = str2;
        this.smartLoginMenuIconURL = str3;
        this.iAPAutomaticLoggingEnabled = z13;
        this.codelessEventsEnabled = z14;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = str4;
        this.trackUninstallEnabled = z15;
        this.monitorViaDialogEnabled = z16;
        this.rawAamRules = str5;
        this.suggestedEventsSetting = str6;
        this.restrictiveDataSetting = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getErrorClassification() {
        return this.errorClassification;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final JSONArray getEventBindings() {
        return this.eventBindings;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRawAamRules() {
        return this.rawAamRules;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    public final EnumSet<SmartLoginOption> j() {
        return this.smartLoginOptions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getSupportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }
}
