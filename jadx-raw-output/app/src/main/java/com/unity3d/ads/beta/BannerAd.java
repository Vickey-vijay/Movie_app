package com.unity3d.ads.beta;

import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: BannerAd.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class BannerAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final BannerLoadOptions loadOptions;

    /* JADX INFO: compiled from: BannerAd.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void load(BannerLoadOptions bannerLoadOptions, LoadListener<BannerAd> loadListener) {
            p.j(bannerLoadOptions, "options");
            p.j(loadListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
    }

    public static final void load(BannerLoadOptions bannerLoadOptions, LoadListener<BannerAd> loadListener) {
        Companion.load(bannerLoadOptions, loadListener);
    }

    public BannerAd(AdObject adObject, BannerLoadOptions bannerLoadOptions) {
        p.j(adObject, "adObject");
        p.j(bannerLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        this.adObject = adObject;
        this.loadOptions = bannerLoadOptions;
    }
}
