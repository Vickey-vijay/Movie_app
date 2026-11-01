package ef;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMTypeConfig;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.InternalGAMBannerAd;
import io.bidmachine.ads.networks.gam.InternalGAMInterstitialAd;
import io.bidmachine.ads.networks.gam.InternalGAMRewardedAd;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import io.bidmachine.core.Logger;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.version.Version;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: GAMNetwork.java */
/* JADX INFO: loaded from: classes6.dex */
public class n {

    @NonNull
    private final GAMLoader gamLoader;

    @NonNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final boolean overrideCallbacks;

    @NonNull
    private final Tag tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    public n(@NonNull Context context, @NonNull VersionWrapper versionWrapper, @NonNull String str, @NonNull Map<AdsFormat, GAMTypeConfig> map, @Nullable String str2, long j10, boolean z10) {
        this.tag = new Tag(str + AndroidInitializeBoldSDK.MSG_NETWORK);
        this.versionWrapper = versionWrapper;
        this.gamLoader = new GAMLoader(context, versionWrapper, str, map, str2, j10);
        this.overrideCallbacks = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadBanner$0(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load banner (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadInterstitial$1(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load interstitial (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$loadRewarded$2(NetworkAdUnit networkAdUnit) {
        return String.format("Fail to load rewarded (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
    }

    public void cache() {
        this.gamLoader.load();
    }

    private void onAdLoadFailed(@NonNull x<?> xVar, @Nullable InternalGAMAd internalGAMAd, @Nullable BMError bMError) {
        if (internalGAMAd != null) {
            try {
                internalGAMAd.destroy();
            } catch (Throwable unused) {
            }
        }
        if (bMError == null) {
            bMError = BMError.NoFill;
        }
        xVar.onAdLoadFailed(bMError);
    }

    public void cache(@NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        if (this.gamLoader.load(adsFormat) || (parent = adsFormat.getParent()) == null) {
            return;
        }
        this.gamLoader.load(parent);
    }

    @NonNull
    public GAMLoader getGAMLoader() {
        return this.gamLoader;
    }

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

    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    public boolean isOverrideCallbacks() {
        return this.overrideCallbacks;
    }

    public void loadBanner(@NonNull final NetworkAdUnit networkAdUnit, @NonNull y yVar) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: ef.k
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return n.lambda$loadBanner$0(networkAdUnit);
                }
            });
            onAdLoadFailed(yVar, null, BMError.internal("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(reservedGAMAd instanceof InternalGAMBannerAd)) {
            onAdLoadFailed(yVar, reservedGAMAd, BMError.internal("InternalGAM object has an incompatible ad type"));
        } else {
            reservedGAMAd.setAdPresentListener(yVar);
            yVar.onAdLoaded((InternalGAMBannerAd) reservedGAMAd);
        }
    }

    public void loadInterstitial(@NonNull final NetworkAdUnit networkAdUnit, @NonNull a0 a0Var) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: ef.m
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return n.lambda$loadInterstitial$1(networkAdUnit);
                }
            });
            onAdLoadFailed(a0Var, null, BMError.internal("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(reservedGAMAd instanceof InternalGAMInterstitialAd)) {
            onAdLoadFailed(a0Var, reservedGAMAd, BMError.internal("InternalGAM object has an incompatible ad type"));
        } else {
            reservedGAMAd.setAdPresentListener(a0Var);
            a0Var.onAdLoaded((InternalGAMInterstitialAd) reservedGAMAd);
        }
    }

    public void loadRewarded(@NonNull final NetworkAdUnit networkAdUnit, @NonNull b0 b0Var) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            Logger.d(this.tag, (LazyValue<String>) new LazyValue() { // from class: ef.l
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return n.lambda$loadRewarded$2(networkAdUnit);
                }
            });
            onAdLoadFailed(b0Var, null, BMError.internal("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(reservedGAMAd instanceof InternalGAMRewardedAd)) {
            onAdLoadFailed(b0Var, reservedGAMAd, BMError.internal("InternalGAM object has an incompatible ad type"));
        } else {
            reservedGAMAd.setAdPresentListener(b0Var);
            b0Var.onAdLoaded((InternalGAMRewardedAd) reservedGAMAd);
        }
    }

    @Nullable
    public GAMUnitData reserveMostExpensiveGAMAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull String str) {
        return this.gamLoader.reserveMostExpensiveGAMAd(networkAdUnit, str);
    }

    public void unReserveGAMAd(@NonNull NetworkAdUnit networkAdUnit) {
        this.gamLoader.unReserveGAMAd(networkAdUnit);
    }
}
