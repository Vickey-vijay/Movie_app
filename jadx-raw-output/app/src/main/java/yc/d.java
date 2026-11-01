package yc;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: ScarBannerAdListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.f f85686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f85687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdListener f85688d = new a();

    /* JADX INFO: compiled from: ScarBannerAdListener.java */
    public class a extends AdListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f85686b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.f85686b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f85687c.d();
            d.this.f85686b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f85686b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f85686b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.f85686b.onAdOpened();
        }
    }

    public AdListener d() {
        return this.f85688d;
    }

    public d(oc.f fVar, c cVar) {
        this.f85686b = fVar;
        this.f85687c = cVar;
    }
}
