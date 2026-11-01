package p001if;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdData;
import io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalInterstitialAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalRewardedAd;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.a;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.version.Version;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: GAMNetworkImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class s implements o {

    @NonNull
    private static final Map<String, g> GAM_AD_MANAGER_MAP = new HashMap();

    @NonNull
    private static final Object GAM_AD_MANAGER_MAP_LOCK = new Object();

    @NonNull
    @VisibleForTesting
    public final g gamAdManager;

    @NonNull
    private final AtomicBoolean isInitialized;

    @NonNull
    private final Tag tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    @NonNull
    @VisibleForTesting
    public final Map<AdsFormat, a> waterfallControllerMap;

    public s(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull Waterfall.Context context2, @NonNull VersionWrapper versionWrapper) {
        this(context, networkParams, context2, versionWrapper, obtainGamAdManager(networkParams.getNetworkKey()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadBanner$0(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load banner (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadInterstitial$1(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load interstitial (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadRewarded$2(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load rewarded (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
    }

    @Override // p001if.o
    public void cache() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            cacheWaterfall(adsFormat, false);
        }
    }

    @VisibleForTesting
    public static void clear() {
        GAM_AD_MANAGER_MAP.clear();
    }

    @NonNull
    private static g obtainGamAdManager(@NonNull String str) {
        Map<String, g> map = GAM_AD_MANAGER_MAP;
        g gVar = map.get(str);
        if (gVar != null) {
            return gVar;
        }
        synchronized (GAM_AD_MANAGER_MAP_LOCK) {
            g gVar2 = map.get(str);
            if (gVar2 != null) {
                return gVar2;
            }
            g gVar3 = new g(str);
            map.put(str, gVar3);
            return gVar3;
        }
    }

    @Override // p001if.o
    public boolean cacheWaterfall(@NonNull AdsFormat adsFormat, boolean z10) {
        a aVar = this.waterfallControllerMap.get(adsFormat);
        if (aVar == null) {
            return false;
        }
        aVar.load(z10);
        return true;
    }

    @Override // p001if.o
    @Nullable
    public String getVersion() {
        try {
            Version version = this.versionWrapper.getVersion();
            if (version != null) {
                return version.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // p001if.o
    @SuppressLint({"MissingPermission"})
    public void init(@NonNull Context context) {
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            this.versionWrapper.initialize(context);
        } catch (Throwable unused) {
        }
    }

    @Override // p001if.o
    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    @Override // p001if.o
    public void loadBanner(@NonNull final NetworkAdUnit networkAdUnit, @NonNull d0 d0Var) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.p
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return s.lambda$loadBanner$0(networkAdUnit);
                }
            });
            onAdLoadFailed(d0Var, null, BMError.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(reservedAd instanceof InternalBannerAd)) {
            onAdLoadFailed(d0Var, reservedAd, BMError.internal("InternalAd object has an incompatible ad type"));
        } else {
            reservedAd.setAdPresentListener(d0Var);
            d0Var.onAdLoaded((InternalBannerAd) reservedAd);
        }
    }

    @Override // p001if.o
    public void loadInterstitial(@NonNull final NetworkAdUnit networkAdUnit, @NonNull f0 f0Var) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.q
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return s.lambda$loadInterstitial$1(networkAdUnit);
                }
            });
            onAdLoadFailed(f0Var, null, BMError.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(reservedAd instanceof InternalInterstitialAd)) {
            onAdLoadFailed(f0Var, reservedAd, BMError.internal("InternalAd object has an incompatible ad type"));
        } else {
            reservedAd.setAdPresentListener(f0Var);
            f0Var.onAdLoaded((InternalInterstitialAd) reservedAd);
        }
    }

    @Override // p001if.o
    public void loadRewarded(@NonNull final NetworkAdUnit networkAdUnit, @NonNull g0 g0Var) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: if.r
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return s.lambda$loadRewarded$2(networkAdUnit);
                }
            });
            onAdLoadFailed(g0Var, null, BMError.internal("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(reservedAd instanceof InternalRewardedAd)) {
            onAdLoadFailed(g0Var, reservedAd, BMError.internal("InternalAd object has an incompatible ad type"));
        } else {
            reservedAd.setAdPresentListener(g0Var);
            g0Var.onAdLoaded((InternalRewardedAd) reservedAd);
        }
    }

    @VisibleForTesting
    public void onAdLoadFailed(@NonNull c0<?> c0Var, @Nullable InternalAd internalAd, @Nullable BMError bMError) {
        if (internalAd != null) {
            internalAd.destroy();
        }
        if (bMError == null) {
            bMError = BMError.NoFill;
        }
        c0Var.onAdLoadFailed(bMError);
    }

    @Override // p001if.o
    @Nullable
    public InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        InternalAdData internalAdDataReserveMostExpensiveAd = this.gamAdManager.reserveMostExpensiveAd(networkAdUnit, adsFormat);
        return (internalAdDataReserveMostExpensiveAd != null || (parent = adsFormat.getParent()) == null) ? internalAdDataReserveMostExpensiveAd : this.gamAdManager.reserveMostExpensiveAd(networkAdUnit, parent);
    }

    @Override // p001if.o
    public void unReserveAd(@NonNull NetworkAdUnit networkAdUnit) {
        this.gamAdManager.unReserveAd(networkAdUnit);
    }

    public s(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull Waterfall.Context context2, @NonNull VersionWrapper versionWrapper, @NonNull g gVar) {
        s sVar = this;
        sVar.tag = new Tag(networkParams.getNetworkName() + AndroidInitializeBoldSDK.MSG_NETWORK);
        sVar.isInitialized = new AtomicBoolean(false);
        sVar.versionWrapper = versionWrapper;
        sVar.gamAdManager = gVar;
        sVar.waterfallControllerMap = new EnumMap(AdsFormat.class);
        k kVar = new k(context2.getEventConfig());
        h0 h0Var = new h0();
        for (Waterfall.Configuration configuration : context2.getConfigurationsList()) {
            AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(configuration.getFormat());
            if (adsFormatByRemoteName != null) {
                sVar.waterfallControllerMap.put(adsFormatByRemoteName, new a(context, networkParams, adsFormatByRemoteName, configuration, versionWrapper, this, gVar, kVar, h0Var));
                sVar = this;
            }
        }
    }

    @Override // p001if.o
    public void cache(@NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        if (cacheWaterfall(adsFormat, false) || (parent = adsFormat.getParent()) == null) {
            return;
        }
        cacheWaterfall(parent, false);
    }
}
