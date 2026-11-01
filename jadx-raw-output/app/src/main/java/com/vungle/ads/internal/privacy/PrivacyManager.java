package com.vungle.ads.internal.privacy;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.Y1;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.c;

/* JADX INFO: compiled from: PrivacyManager.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001KB\t\b\u0002¢\u0006\u0004\bI\u0010JJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fJ \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\fJ\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0006\u0010\u0019\u001a\u00020\u0002J\u0006\u0010\u001a\u001a\u00020\u0002J\u0006\u0010\u001b\u001a\u00020\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0011\u0010!\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\"\u001a\u00020\fJ\u000f\u0010#\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b#\u0010 J\u0006\u0010$\u001a\u00020\u0002J\u0006\u0010&\u001a\u00020%J\u000f\u0010)\u001a\u00020\fH\u0000¢\u0006\u0004\b'\u0010(J\u0006\u0010*\u001a\u00020\fR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010H\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006L"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager;", "", "", "consent", "source", "consentMessageVersion", "", "consentTimestamp", "Lmj/r;", "saveGdprConsent", "Lcom/vungle/ads/internal/privacy/PrivacyConsent;", "saveCcpaConsent", "", "value", "saveCoppaConsent", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, C3426d4.a.f28413f, "updateGdprConsent", "updateCcpaConsent", "getCcpaStatus", "newValue", "updateCoppaConsent", "updateDisableAdId", "saveDisableAdId", "getConsentStatus", "getConsentSource", "getConsentMessageVersion", "getConsentTimestamp", "Lcom/vungle/ads/internal/privacy/COPPA;", "getCoppaStatus", "getDisableAdId$vungle_ads_release", "()Ljava/lang/Boolean;", "getDisableAdId", "shouldSendAdIds", "getGdprAppliesFromPreferences", "getIABTCFString", "Lcom/vungle/ads/internal/privacy/PrivacyManager$DeviceIdAllowed;", "allowDeviceIDFromTCF", "shouldReturnTrueForLegacy$vungle_ads_release", "()Z", "shouldReturnTrueForLegacy", "shouldSendTCFString", "Ljava/util/concurrent/atomic/AtomicReference;", "disableAdId", "Ljava/util/concurrent/atomic/AtomicReference;", "coppaStatus", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "gdprConsent", "Ljava/lang/String;", "gdprConsentSource", "gdprConsentMessageVersion", "gdprConsentTimestamp", "Ljava/lang/Long;", "ccpaConsent", "Lcom/vungle/ads/internal/privacy/PrivacyConsent;", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "getPreviousTcfToken", "()Ljava/lang/String;", "setPreviousTcfToken", "(Ljava/lang/String;)V", "previousTcfToken", "<init>", "()V", "DeviceIdAllowed", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class PrivacyManager {
    private static PrivacyConsent ccpaConsent;
    private static FilePreferences filePreferences;
    private static String gdprConsent;
    private static String gdprConsentMessageVersion;
    private static String gdprConsentSource;
    private static Long gdprConsentTimestamp;
    private static SharedPreferences sharedPreferences;
    public static final PrivacyManager INSTANCE = new PrivacyManager();
    private static final AtomicReference<Boolean> disableAdId = new AtomicReference<>();
    private static final AtomicReference<Boolean> coppaStatus = new AtomicReference<>();
    private static final AtomicBoolean initialized = new AtomicBoolean(false);

    /* JADX INFO: compiled from: PrivacyManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/privacy/PrivacyManager$DeviceIdAllowed;", "", "(Ljava/lang/String;I)V", "ALLOW_ID", "DISABLE_ID", "FALLBACK", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeviceIdAllowed {
        ALLOW_ID,
        DISABLE_ID,
        FALLBACK
    }

    /* JADX INFO: compiled from: PrivacyManager.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DeviceIdAllowed.values().length];
            iArr[DeviceIdAllowed.DISABLE_ID.ordinal()] = 1;
            iArr[DeviceIdAllowed.FALLBACK.ordinal()] = 2;
            iArr[DeviceIdAllowed.ALLOW_ID.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfigPayload.IABSettings.TcfStatus.values().length];
            iArr2[ConfigPayload.IABSettings.TcfStatus.DISABLE_ID.ordinal()] = 1;
            iArr2[ConfigPayload.IABSettings.TcfStatus.ALLOW_ID.ordinal()] = 2;
            iArr2[ConfigPayload.IABSettings.TcfStatus.LEGACY.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private PrivacyManager() {
    }

    public final synchronized void init(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            Logger.INSTANCE.w("PrivacyManager", "PrivacyManager already initialized");
            return;
        }
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        FilePreferences filePreferences2 = (FilePreferences) ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
        filePreferences = filePreferences2;
        AtomicReference<Boolean> atomicReference = disableAdId;
        Boolean bool = atomicReference.get();
        if (bool != null) {
            saveDisableAdId(bool.booleanValue());
        } else {
            Boolean bool2 = filePreferences2.getBoolean(Cookie.COPPA_DISABLE_AD_ID);
            if (bool2 != null) {
                atomicReference.set(Boolean.valueOf(bool2.booleanValue()));
            }
        }
        String str = gdprConsent;
        if (str != null) {
            String str2 = gdprConsentSource;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = gdprConsentMessageVersion;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            Long l10 = gdprConsentTimestamp;
            saveGdprConsent(str, str3, str5, l10 != null ? l10.longValue() : 0L);
        } else {
            String string = filePreferences2.getString(Cookie.GDPR_CONSENT_STATUS);
            PrivacyConsent privacyConsent = PrivacyConsent.OPT_IN;
            if (p.e(string, privacyConsent.getValue())) {
                string = privacyConsent.getValue();
            } else {
                PrivacyConsent privacyConsent2 = PrivacyConsent.OPT_OUT;
                if (p.e(string, privacyConsent2.getValue())) {
                    string = privacyConsent2.getValue();
                }
            }
            gdprConsent = string;
            gdprConsentSource = filePreferences2.getString(Cookie.GDPR_CONSENT_SOURCE);
            gdprConsentMessageVersion = filePreferences2.getString(Cookie.GDPR_CONSENT_MESSAGE_VERSION);
            gdprConsentTimestamp = Long.valueOf(filePreferences2.getLong(Cookie.GDPR_CONSENT_TIMESTAMP, 0L));
        }
        PrivacyConsent privacyConsent3 = ccpaConsent;
        if (privacyConsent3 != null) {
            saveCcpaConsent(privacyConsent3);
        } else {
            String string2 = filePreferences2.getString(Cookie.CCPA_CONSENT_STATUS);
            PrivacyConsent privacyConsent4 = PrivacyConsent.OPT_OUT;
            if (!p.e(privacyConsent4.getValue(), string2)) {
                privacyConsent4 = PrivacyConsent.OPT_IN;
            }
            ccpaConsent = privacyConsent4;
        }
        AtomicReference<Boolean> atomicReference2 = coppaStatus;
        Boolean bool3 = atomicReference2.get();
        if (bool3 != null) {
            saveCoppaConsent(bool3.booleanValue());
        } else {
            Boolean bool4 = filePreferences2.getBoolean("is_coppa");
            if (bool4 != null) {
                atomicReference2.set(Boolean.valueOf(bool4.booleanValue()));
            }
        }
        atomicBoolean.set(true);
    }

    private final void saveCcpaConsent(PrivacyConsent privacyConsent) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.CCPA_CONSENT_STATUS, privacyConsent.getValue())) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    private final void saveCoppaConsent(boolean z10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put("is_coppa", z10)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    private final void saveGdprConsent(String str, String str2, String str3, long j10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferencesPut2;
        FilePreferences filePreferencesPut3;
        FilePreferences filePreferencesPut4;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.GDPR_CONSENT_STATUS, str)) == null || (filePreferencesPut2 = filePreferencesPut.put(Cookie.GDPR_CONSENT_SOURCE, str2)) == null || (filePreferencesPut3 = filePreferencesPut2.put(Cookie.GDPR_CONSENT_MESSAGE_VERSION, str3)) == null || (filePreferencesPut4 = filePreferencesPut3.put(Cookie.GDPR_CONSENT_TIMESTAMP, j10)) == null) {
            return;
        }
        filePreferencesPut4.apply();
    }

    public final String getCcpaStatus() {
        String value;
        PrivacyConsent privacyConsent = ccpaConsent;
        return (privacyConsent == null || (value = privacyConsent.getValue()) == null) ? PrivacyConsent.UNKNOWN.getValue() : value;
    }

    public final String getConsentMessageVersion() {
        String str = gdprConsentMessageVersion;
        return str == null ? "" : str;
    }

    public final String getConsentSource() {
        String str = gdprConsentSource;
        return str == null ? "no_interaction" : str;
    }

    public final String getConsentStatus() {
        String str = gdprConsent;
        return str == null ? "unknown" : str;
    }

    public final long getConsentTimestamp() {
        Long l10 = gdprConsentTimestamp;
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final COPPA getCoppaStatus() {
        AtomicReference<Boolean> atomicReference = coppaStatus;
        if (atomicReference.get() == null) {
            return COPPA.COPPA_NOTSET;
        }
        if (p.e(atomicReference.get(), Boolean.TRUE)) {
            return COPPA.COPPA_ENABLED;
        }
        return p.e(atomicReference.get(), Boolean.FALSE) ? COPPA.COPPA_DISABLED : COPPA.COPPA_NOTSET;
    }

    @VisibleForTesting
    public final Boolean getDisableAdId$vungle_ads_release() {
        return disableAdId.get();
    }

    public final Boolean getGdprAppliesFromPreferences() {
        Object objM3458constructorimpl;
        Object objM3458constructorimpl2;
        Integer numValueOf;
        String string;
        try {
            Result.a aVar = Result.Companion;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            objM3458constructorimpl = Result.m3458constructorimpl(sharedPreferences2 != null ? Integer.valueOf(sharedPreferences2.getInt("IABTCF_gdprApplies", -1)) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            try {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 == null || (string = sharedPreferences3.getString("IABTCF_gdprApplies", Y1.f27894f)) == null) {
                    numValueOf = null;
                } else {
                    p.i(string, "getString(IABTCF_GDPR_APPLIES, \"-1\")");
                    numValueOf = Integer.valueOf(Integer.parseInt(string));
                }
                objM3458constructorimpl2 = Result.m3458constructorimpl(numValueOf);
            } catch (Throwable th3) {
                Result.a aVar3 = Result.Companion;
                objM3458constructorimpl2 = Result.m3458constructorimpl(c.a(th3));
            }
            objM3458constructorimpl = objM3458constructorimpl2;
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        Integer num = (Integer) objM3458constructorimpl;
        if (num != null && num.intValue() == 1) {
            return Boolean.TRUE;
        }
        if (num != null && num.intValue() == 0) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String getIABTCFString() {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String string = sharedPreferences2 != null ? sharedPreferences2.getString("IABTCF_TCString", "") : null;
        return string == null ? "" : string;
    }

    public final String getPreviousTcfToken() {
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 != null) {
            return filePreferences2.getString("previous_tcf_token", "");
        }
        return null;
    }

    public final SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }

    @VisibleForTesting
    public final void saveDisableAdId(boolean z10) {
        FilePreferences filePreferencesPut;
        FilePreferences filePreferences2 = filePreferences;
        if (filePreferences2 == null || (filePreferencesPut = filePreferences2.put(Cookie.COPPA_DISABLE_AD_ID, z10)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void setPreviousTcfToken(String str) {
        FilePreferences filePreferences2;
        FilePreferences filePreferencesPut;
        if ((str == null || str.length() == 0) || (filePreferences2 = filePreferences) == null || (filePreferencesPut = filePreferences2.put("previous_tcf_token", str)) == null) {
            return;
        }
        filePreferencesPut.apply();
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences2) {
        sharedPreferences = sharedPreferences2;
    }

    public final void updateCcpaConsent(PrivacyConsent privacyConsent) {
        p.j(privacyConsent, "consent");
        ccpaConsent = privacyConsent;
        saveCcpaConsent(privacyConsent);
    }

    public final void updateCoppaConsent(boolean z10) {
        coppaStatus.set(Boolean.valueOf(z10));
        saveCoppaConsent(z10);
    }

    public final void updateDisableAdId(boolean z10) {
        disableAdId.set(Boolean.valueOf(z10));
        saveDisableAdId(z10);
    }

    public final void updateGdprConsent(String str, String str2, String str3) {
        p.j(str, "consent");
        p.j(str2, "source");
        gdprConsent = str;
        gdprConsentSource = str2;
        gdprConsentMessageVersion = str3;
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
        gdprConsentTimestamp = Long.valueOf(jCurrentTimeMillis);
        String str4 = gdprConsentMessageVersion;
        if (str4 == null) {
            str4 = "";
        }
        saveGdprConsent(str, str2, str4, jCurrentTimeMillis);
    }

    public final DeviceIdAllowed allowDeviceIDFromTCF() {
        int i10;
        Boolean gdprAppliesFromPreferences = getGdprAppliesFromPreferences();
        if (p.e(gdprAppliesFromPreferences, Boolean.TRUE)) {
            ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
            if (tcfStatus == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$1[tcfStatus.ordinal()];
            }
            if (i10 != -1) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        return DeviceIdAllowed.ALLOW_ID;
                    }
                } else {
                    return DeviceIdAllowed.DISABLE_ID;
                }
            }
            return DeviceIdAllowed.FALLBACK;
        }
        if (gdprAppliesFromPreferences == null) {
            return DeviceIdAllowed.FALLBACK;
        }
        return DeviceIdAllowed.ALLOW_ID;
    }

    public final boolean shouldReturnTrueForLegacy$vungle_ads_release() {
        String iABTCFString = getIABTCFString();
        if (!p.e(getPreviousTcfToken(), iABTCFString)) {
            setPreviousTcfToken(iABTCFString);
            return true;
        }
        return false;
    }

    public final boolean shouldSendAdIds() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[allowDeviceIDFromTCF().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Boolean disableAdId$vungle_ads_release = getDisableAdId$vungle_ads_release();
        if (disableAdId$vungle_ads_release == null || disableAdId$vungle_ads_release.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean shouldSendTCFString() {
        int i10;
        if (p.e(getGdprAppliesFromPreferences(), Boolean.TRUE)) {
            ConfigPayload.IABSettings.TcfStatus tcfStatus = ConfigManager.INSTANCE.getTcfStatus();
            if (tcfStatus == null) {
                i10 = -1;
            } else {
                i10 = WhenMappings.$EnumSwitchMapping$1[tcfStatus.ordinal()];
            }
            if (i10 != -1) {
                if (i10 == 1 || i10 == 2) {
                    return true;
                }
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return shouldReturnTrueForLegacy$vungle_ads_release();
        }
        return false;
    }
}
