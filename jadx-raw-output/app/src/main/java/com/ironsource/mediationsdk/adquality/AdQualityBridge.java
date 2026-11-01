package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3450ea;
import com.ironsource.C3512i0;
import com.ironsource.C3676r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.Lb;
import com.ironsource.N6;
import com.ironsource.O6;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.text.Regex;
import lk.a0;
import lk.x;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AdQualityBridge {
    public static final Companion Companion = new Companion(null);
    private static Boolean isGetVersionMethodExist;

    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isGetVersionMethodExist() throws JSONException {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return p.e(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z10 = IronSourceAdQuality.class.getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z10);
                return z10;
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                logEvent$default(this, D5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logEvent(D5 d10, Integer num, String str) throws JSONException {
            JSONObject jSONObjectB = IronSourceUtils.b(false);
            if (num != null) {
                jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            }
            if (str != null) {
                jSONObjectB.put("reason", str);
            }
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, a.f29537a.a().b());
            Lb.f26968s.d().q().a(new C5(d10, jSONObjectB));
        }

        private Companion() {
        }

        public static /* synthetic */ void logEvent$default(Companion companion, D5 d10, Integer num, String str, int i10, Object obj) throws JSONException {
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                str = null;
            }
            companion.logEvent(d10, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int versionCompare(String str, String str2) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                int i10 = 0;
                String[] strArr = (String[]) a0.N0(new Regex("[^0-9.]").replace(str, ""), new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                String[] strArr2 = (String[]) a0.N0(new Regex("[^0-9.]").replace(str2, ""), new String[]{"."}, false, 0, 6, null).toArray(new String[0]);
                while (i10 < strArr.length && i10 < strArr2.length && p.e(strArr[i10], strArr2[i10])) {
                    i10++;
                }
                if (i10 < strArr.length && i10 < strArr2.length) {
                    int iIntValue = Integer.valueOf(strArr[i10]).intValue();
                    Integer numValueOf = Integer.valueOf(strArr2[i10]);
                    p.i(numValueOf, "valueOf(vals2[i])");
                    return Integer.signum(p.l(iIntValue, numValueOf.intValue()));
                }
                return Integer.signum(strArr.length - strArr2.length);
            }
            return -1;
        }

        public final boolean adQualityAvailable() {
            if (versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0) {
                return true;
            }
            return false;
        }

        public final String getAdQualitySdkVersion() {
            if (isGetVersionMethodExist()) {
                String sDKVersion = IronSourceAdQuality.getSDKVersion();
                p.i(sDKVersion, "getSDKVersion()");
                return sDKVersion;
            }
            return new String();
        }
    }

    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public AdQualityBridge(Context context, String str, String str2, C3512i0 c3512i0, int i10) throws JSONException {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "appKey");
        p.j(c3512i0, "adQualityDataProvider");
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i10)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str3) throws JSONException {
                p.j(iSAdQualityInitError, "isAdQualityInitError");
                p.j(str3, "message");
                D5 d10 = D5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    d10 = D5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(d10, Integer.valueOf(iSAdQualityInitError.getValue()), str3);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + str3, 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() throws JSONException {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, D5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str2)) {
            deviceIdType.setUserId(str2);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject jSONObjectA = c3512i0.a();
            if (jSONObjectA.length() > 0) {
                deviceIdType.setMetaData(jSONObjectA);
            }
        }
        Companion.logEvent$default(companion, D5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, str, deviceIdType.build());
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i10) {
        if (i10 == 0) {
            return ISAdQualityLogLevel.VERBOSE;
        }
        if (i10 == 1) {
            return ISAdQualityLogLevel.INFO;
        }
        if (i10 != 2) {
            return i10 != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR;
        }
        return ISAdQualityLogLevel.WARNING;
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(N6.a().a(O6.N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    private static final void logEvent(D5 d10, Integer num, String str) throws JSONException {
        Companion.logEvent(d10, num, str);
    }

    public final void changeUserId(String str) {
        p.j(str, "userId");
        IronSourceAdQuality.getInstance().changeUserId(str);
    }

    public final void setSegment(C3450ea c3450ea) {
        p.j(c3450ea, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (c3450ea.g() != null) {
            builder.setSegmentName(c3450ea.g());
        }
        if (c3450ea.a() > -1) {
            builder.setAge(c3450ea.a());
        }
        if (c3450ea.b() != null) {
            builder.setGender(c3450ea.b());
        }
        if (c3450ea.e() > -1) {
            builder.setLevel(c3450ea.e());
        }
        if (c3450ea.d() != null) {
            builder.setIsPaying(c3450ea.d().get());
        }
        if (c3450ea.c() > -1.0d) {
            builder.setInAppPurchasesTotal(c3450ea.c());
        }
        if (c3450ea.h() > 0) {
            builder.setUserCreationDate(c3450ea.h());
        }
        for (Pair<String, String> pair : c3450ea.f()) {
            String str = (String) pair.first;
            String str2 = (String) pair.second;
            p.i(str, C3426d4.i.W);
            if (x.R(str, "custom_", false, 2, null)) {
                builder.setCustomData(a0.E0(str, "custom_"), str2);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }

    private final boolean getCoppaValue() {
        String strA = N6.a().a("is_coppa");
        if (strA != null && Boolean.parseBoolean(strA)) {
            return true;
        }
        return false;
    }
}
