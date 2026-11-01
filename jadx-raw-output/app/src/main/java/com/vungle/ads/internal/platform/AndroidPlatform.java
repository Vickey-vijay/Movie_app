package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.core.util.Consumer;
import bk.a;
import ck.i;
import ck.p;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.util.Logger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.c;
import lk.a0;
import lk.x;
import mj.g;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 C2\u00020\u0001:\u0001CB+\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010*R\u001a\u00100\u001a\u00020\u00188\u0016X\u0096D¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R$\u00103\u001a\u0004\u0018\u00010\u000b8V@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010*\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00102R\u0014\u0010;\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00102R\u0014\u0010>\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00105R\u0014\u0010?\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00102R\u0014\u0010@\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u00102¨\u0006F²\u0006\f\u0010E\u001a\u00020D8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/platform/AndroidPlatform;", "Lcom/vungle/ads/internal/platform/Platform;", "", "value", "sanitizeVolume", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "getAmazonAdvertisingInfo", "getGoogleAdvertisingInfo", "Lmj/r;", "updateAppSetID", "Landroidx/core/util/Consumer;", "", "consumer", "getUserAgentLazy", "getAdvertisingInfo", "getAppSetId", "", "getAppSetIdScope", "()Ljava/lang/Integer;", "", "getOSInstallationTime", "getSDKInstallationTime", "getLastBootTime", "getBuildTime", "", "isProblematicMaliDevice", "getGPVersion", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "uaExecutor", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "Landroid/os/PowerManager;", "powerManager", "Landroid/os/PowerManager;", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "sdkInstallationTime", "Ljava/lang/Long;", "appSetId", "Ljava/lang/String;", "appSetIdScope", "Ljava/lang/Integer;", "advertisingInfo", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "gpVersion", "isSideLoaded", "Z", "()Z", "userAgent", "getUserAgent", "()Ljava/lang/String;", "setUserAgent", "(Ljava/lang/String;)V", "isBatterySaverEnabled", "getVolumeLevel", "()F", "volumeLevel", "isSoundEnabled", "getCarrierName", "carrierName", "isSdCardPresent", "isSilentModeEnabled", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;Landroid/os/PowerManager;Landroid/media/AudioManager;)V", VastTagName.COMPANION, "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AndroidPlatform implements Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PREF_KEY_SDK_INSTALL_TIME = "sit";
    private static final String TAG = "AndroidPlatform";
    private AdvertisingInfo advertisingInfo;
    private String appSetId;
    private Integer appSetIdScope;
    private final AudioManager audioManager;
    private final Context context;
    private String gpVersion;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private Long sdkInstallationTime;
    private final VungleThreadPoolExecutor uaExecutor;
    private String userAgent;

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/platform/AndroidPlatform$Companion;", "", "()V", "PREF_KEY_SDK_INSTALL_TIME", "", "TAG", "getCarrierName", "kotlin.jvm.PlatformType", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getCarrierName$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String getCarrierName$vungle_ads_release(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            Object systemService = context.getSystemService("phone");
            p.h(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager) systemService).getNetworkOperatorName();
        }
    }

    public AndroidPlatform(Context context, VungleThreadPoolExecutor vungleThreadPoolExecutor, PowerManager powerManager, AudioManager audioManager) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(vungleThreadPoolExecutor, "uaExecutor");
        p.j(powerManager, "powerManager");
        p.j(audioManager, "audioManager");
        this.context = context;
        this.uaExecutor = vungleThreadPoolExecutor;
        this.powerManager = powerManager;
        this.audioManager = audioManager;
        updateAppSetID();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSilentModeEnabled() {
        try {
            return this.audioManager.getRingerMode() == 0 || this.audioManager.getRingerMode() == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSoundEnabled() {
        try {
            return this.audioManager.getStreamVolume(3) > 0;
        } catch (Exception unused) {
            return true;
        }
    }

    private final AdvertisingInfo getAmazonAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = new AdvertisingInfo();
        try {
            ContentResolver contentResolver = this.context.getContentResolver();
            boolean z10 = true;
            if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) != 1) {
                z10 = false;
            }
            advertisingInfo.setLimitAdTracking(z10);
            advertisingInfo.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
        } catch (Settings.SettingNotFoundException e10) {
            Logger.INSTANCE.e(TAG, "Error getting Amazon advertising info: Setting not found.", e10);
        } catch (Exception e11) {
            Logger.INSTANCE.e(TAG, "Error getting Amazon advertising info", e11);
        }
        return advertisingInfo;
    }

    private final AdvertisingInfo getGoogleAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = new AdvertisingInfo();
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            p.i(advertisingIdInfo, "getAdvertisingIdInfo(context)");
            advertisingInfo.setAdvertisingId(advertisingIdInfo.getId());
            advertisingInfo.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
        } catch (GooglePlayServicesNotAvailableException e10) {
            Logger.INSTANCE.e(TAG, "Play services Not available: " + e10.getLocalizedMessage());
        } catch (Exception e11) {
            Logger.INSTANCE.e(TAG, "Error getting Google advertising info: " + e11.getLocalizedMessage());
        } catch (NoClassDefFoundError e12) {
            Logger.INSTANCE.e(TAG, "Play services Not available: " + e12.getLocalizedMessage());
            advertisingInfo.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
        }
        return advertisingInfo;
    }

    private final void updateAppSetID() {
        String str = this.appSetId;
        if (str == null || str.length() == 0) {
            try {
                AppSetIdClient client = AppSet.getClient(this.context);
                p.i(client, "getClient(context)");
                Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
                p.i(appSetIdInfo, "client.appSetIdInfo");
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: dd.a
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AndroidPlatform.m3255updateAppSetID$lambda8(this.f51938a, (AppSetIdInfo) obj);
                    }
                });
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Error getting AppSetID: " + e10.getLocalizedMessage());
            } catch (NoClassDefFoundError e11) {
                Logger.INSTANCE.e(TAG, "Required libs to get AppSetID Not available: " + e11.getLocalizedMessage());
            }
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public AdvertisingInfo getAdvertisingInfo() {
        AdvertisingInfo advertisingInfo = this.advertisingInfo;
        if (advertisingInfo != null) {
            String advertisingId = advertisingInfo.getAdvertisingId();
            if (!(advertisingId == null || advertisingId.length() == 0)) {
                return advertisingInfo;
            }
        }
        AdvertisingInfo amazonAdvertisingInfo = x.E(Build.MANUFACTURER, "Amazon", true) ? getAmazonAdvertisingInfo() : getGoogleAdvertisingInfo();
        this.advertisingInfo = amazonAdvertisingInfo;
        return amazonAdvertisingInfo;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getBuildTime() {
        return Build.TIME;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getCarrierName() {
        String carrierName$vungle_ads_release = INSTANCE.getCarrierName$vungle_ads_release(this.context);
        p.i(carrierName$vungle_ads_release, "getCarrierName(context)");
        return carrierName$vungle_ads_release;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getGPVersion() {
        String str = this.gpVersion;
        if (str != null) {
            return str;
        }
        try {
            String str2 = (Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("com.android.vending", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("com.android.vending", 0)).versionName;
            this.gpVersion = str2;
            return str2;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getOSInstallationTime() {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Long.valueOf((Build.VERSION.SDK_INT >= 33 ? this.context.getPackageManager().getPackageInfo("android", PackageManager.PackageInfoFlags.of(0L)) : this.context.getPackageManager().getPackageInfo("android", 0)).firstInstallTime));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
        if (thM3461exceptionOrNullimpl != null) {
            if (thM3461exceptionOrNullimpl instanceof PackageManager.NameNotFoundException) {
                Logger.INSTANCE.e(TAG, "Error getting OS installation time: " + ((PackageManager.NameNotFoundException) thM3461exceptionOrNullimpl).getLocalizedMessage());
            }
            objM3458constructorimpl = -1L;
        }
        return ((Number) objM3458constructorimpl).longValue();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getSDKInstallationTime() {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        g gVarB = b.b(LazyThreadSafetyMode.SYNCHRONIZED, new a<FilePreferences>() { // from class: com.vungle.ads.internal.platform.AndroidPlatform$getSDKInstallationTime$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // bk.a
            public final FilePreferences invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
            }
        });
        Long l10 = this.sdkInstallationTime;
        if (l10 != null) {
            return l10.longValue();
        }
        long jCurrentTimeMillis = m3253getSDKInstallationTime$lambda4(gVarB).getLong(PREF_KEY_SDK_INSTALL_TIME, 0L);
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            m3253getSDKInstallationTime$lambda4(gVarB).put(PREF_KEY_SDK_INSTALL_TIME, jCurrentTimeMillis).apply();
        }
        this.sdkInstallationTime = Long.valueOf(jCurrentTimeMillis);
        return jCurrentTimeMillis;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getUserAgent() {
        String str = this.userAgent;
        return str == null ? System.getProperty("http.agent") : str;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public void getUserAgentLazy(final Consumer<String> consumer) {
        p.j(consumer, "consumer");
        this.uaExecutor.execute(new Runnable() { // from class: dd.b
            @Override // java.lang.Runnable
            public final void run() {
                AndroidPlatform.m3254getUserAgentLazy$lambda0(this.f51939b, consumer);
            }
        });
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public float getVolumeLevel() {
        try {
            return sanitizeVolume(this.audioManager.getStreamVolume(3) / this.audioManager.getStreamMaxVolume(3));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isProblematicMaliDevice() {
        String str = Build.HARDWARE;
        boolean z10 = str != null && a0.V(str, "mali", true);
        int i10 = Build.VERSION.SDK_INT;
        return z10 && (29 <= i10 && i10 < 34);
    }

    @Override // com.vungle.ads.internal.platform.Platform
    /* JADX INFO: renamed from: isSideLoaded, reason: from getter */
    public boolean getIsSideLoaded() {
        return this.isSideLoaded;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    /* JADX INFO: renamed from: getSDKInstallationTime$lambda-4, reason: not valid java name */
    private static final FilePreferences m3253getSDKInstallationTime$lambda4(g<FilePreferences> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getUserAgentLazy$lambda-0, reason: not valid java name */
    public static final void m3254getUserAgentLazy$lambda0(AndroidPlatform androidPlatform, Consumer consumer) {
        p.j(androidPlatform, "this$0");
        p.j(consumer, "$consumer");
        WebViewUtil.INSTANCE.getUserAgent(androidPlatform.context, consumer);
    }

    private final float sanitizeVolume(float value) {
        if (Float.isNaN(value) || Float.isInfinite(value) || value < 0.0f) {
            return 0.0f;
        }
        if (value > 1.0f) {
            return 1.0f;
        }
        return value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateAppSetID$lambda-8, reason: not valid java name */
    public static final void m3255updateAppSetID$lambda8(AndroidPlatform androidPlatform, AppSetIdInfo appSetIdInfo) {
        p.j(androidPlatform, "this$0");
        if (appSetIdInfo != null) {
            androidPlatform.appSetId = appSetIdInfo.getId();
            androidPlatform.appSetIdScope = Integer.valueOf(appSetIdInfo.getScope());
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public long getLastBootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSdCardPresent() {
        try {
            return p.e(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Acquiring external storage state failed", e10);
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AndroidPlatform(Context context, VungleThreadPoolExecutor vungleThreadPoolExecutor, PowerManager powerManager, AudioManager audioManager, int i10, i iVar) {
        if ((i10 & 4) != 0) {
            Object systemService = context.getSystemService("power");
            p.h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            powerManager = (PowerManager) systemService;
        }
        if ((i10 & 8) != 0) {
            Object systemService2 = context.getSystemService("audio");
            p.h(systemService2, "null cannot be cast to non-null type android.media.AudioManager");
            audioManager = (AudioManager) systemService2;
        }
        this(context, vungleThreadPoolExecutor, powerManager, audioManager);
    }
}
