package com.google.ads.mediation.vungle;

import android.content.Context;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.AdConfig;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.RewardedAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: VungleFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public final AdConfig a() {
        return new AdConfig();
    }

    public final VungleBannerView b(Context context, String str, VungleAdSize vungleAdSize) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        p.j(vungleAdSize, C3426d4.i.O);
        return new VungleBannerView(context, str, vungleAdSize);
    }

    public final InterstitialAd c(Context context, String str, AdConfig adConfig) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        p.j(adConfig, "adConfig");
        return new InterstitialAd(context, str, adConfig);
    }

    public final NativeAd d(Context context, String str) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        return new NativeAd(context, str);
    }

    public final RewardedAd e(Context context, String str, AdConfig adConfig) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        p.j(adConfig, "adConfig");
        return new RewardedAd(context, str, adConfig);
    }
}
