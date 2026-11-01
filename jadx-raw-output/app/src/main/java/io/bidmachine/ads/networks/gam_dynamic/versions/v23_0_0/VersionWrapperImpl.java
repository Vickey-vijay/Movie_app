package io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.ads.networks.gam_dynamic.versions.BaseVersionWrapper;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.version.Version;
import lf.f;
import lf.j;

/* JADX INFO: loaded from: classes7.dex */
public class VersionWrapperImpl extends BaseVersionWrapper {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58629a;

        static {
            int[] iArr = new int[AdsFormat.values().length];
            f58629a = iArr;
            try {
                iArr[AdsFormat.Banner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58629a[AdsFormat.Banner_320x50.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58629a[AdsFormat.Banner_728x90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58629a[AdsFormat.Banner_300x250.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f58629a[AdsFormat.Interstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f58629a[AdsFormat.InterstitialStatic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f58629a[AdsFormat.InterstitialVideo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f58629a[AdsFormat.Rewarded.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f58629a[AdsFormat.RewardedStatic.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f58629a[AdsFormat.RewardedVideo.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public VersionWrapperImpl() {
        super(21, new Version(23, 0, 0));
    }

    private boolean a() {
        try {
            Class.forName("com.google.android.gms.ads.admanager.AdManagerAdView");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.BaseVersionWrapper, io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    @Nullable
    public InternalAd createAd(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener) {
        switch (a.f58629a[adsFormat.ordinal()]) {
            case 1:
            case 2:
                return new lf.a(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener, AdSize.BANNER);
            case 3:
                return new lf.a(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener, AdSize.LEADERBOARD);
            case 4:
                return new lf.a(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener, AdSize.MEDIUM_RECTANGLE);
            case 5:
            case 6:
            case 7:
                return new f(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
            case 8:
            case 9:
            case 10:
                return new j(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
            default:
                return null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.BaseVersionWrapper, io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    @Nullable
    public Version getVersion() {
        VersionInfo version = MobileAds.getVersion();
        return new Version(version.getMajorVersion(), version.getMinorVersion(), version.getMicroVersion());
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.BaseVersionWrapper, io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    @SuppressLint({"MissingPermission"})
    public void initialize(@NonNull Context context) {
        MobileAds.initialize(context);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.versions.BaseVersionWrapper, io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper
    public boolean isGAMPresent(@NonNull Context context) {
        return a(context) && a();
    }

    private boolean a(@NonNull Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return false;
            }
            return !TextUtils.isEmpty(bundle.getString("com.google.android.gms.ads.APPLICATION_ID"));
        } catch (Exception unused) {
            return false;
        }
    }
}
