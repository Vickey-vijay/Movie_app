package e3;

import androidx.annotation.NonNull;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.BannerView;

/* JADX INFO: compiled from: UnityBannerViewWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerView f52323a;

    public BannerView a() {
        return this.f52323a;
    }

    public void b(UnityAdsLoadOptions unityAdsLoadOptions) {
        this.f52323a.load(unityAdsLoadOptions);
    }

    public void c(BannerView.IListener iListener) {
        this.f52323a.setListener(iListener);
    }

    public d(@NonNull BannerView bannerView) {
        this.f52323a = bannerView;
    }
}
