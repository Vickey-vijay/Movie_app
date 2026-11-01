package com.vungle.ads.internal.platform;

import androidx.core.util.Consumer;
import com.vungle.ads.internal.model.AdvertisingInfo;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\bf\u0018\u0000 $2\u00020\u0001:\u0001$J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\rH&J\b\u0010\u0011\u001a\u00020\rH&J\b\u0010\u0013\u001a\u00020\u0012H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0003H&R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0016R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0014\u0010#\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0016¨\u0006%"}, d2 = {"Lcom/vungle/ads/internal/platform/Platform;", "", "Landroidx/core/util/Consumer;", "", "consumer", "Lmj/r;", "getUserAgentLazy", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "getAdvertisingInfo", "getAppSetId", "", "getAppSetIdScope", "()Ljava/lang/Integer;", "", "getOSInstallationTime", "getSDKInstallationTime", "getLastBootTime", "getBuildTime", "", "isProblematicMaliDevice", "getGPVersion", "isBatterySaverEnabled", "()Z", "isSideLoaded", "", "getVolumeLevel", "()F", "volumeLevel", "isSoundEnabled", "getCarrierName", "()Ljava/lang/String;", "carrierName", "isSdCardPresent", "getUserAgent", "userAgent", "isSilentModeEnabled", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public interface Platform {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* JADX INFO: compiled from: Platform.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/internal/platform/Platform$Companion;", "", "()V", "MANUFACTURER_AMAZON", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private Companion() {
        }
    }

    AdvertisingInfo getAdvertisingInfo();

    String getAppSetId();

    Integer getAppSetIdScope();

    long getBuildTime();

    String getCarrierName();

    String getGPVersion();

    long getLastBootTime();

    long getOSInstallationTime();

    long getSDKInstallationTime();

    String getUserAgent();

    void getUserAgentLazy(Consumer<String> consumer);

    float getVolumeLevel();

    boolean isBatterySaverEnabled();

    boolean isProblematicMaliDevice();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSilentModeEnabled();

    boolean isSoundEnabled();
}
