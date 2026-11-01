package uc;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: ScarBannerAdListener.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oc.f f72811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f72812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdListener f72813d = new a();

    /* JADX INFO: compiled from: ScarBannerAdListener.java */
    public class a extends AdListener {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            d.this.f72811b.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.f72811b.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            d.this.f72812c.d();
            d.this.f72811b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.f72811b.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.f72811b.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.f72811b.onAdOpened();
        }
    }

    public AdListener d() {
        return this.f72813d;
    }

    public d(oc.f fVar, c cVar) {
        this.f72811b = fVar;
        this.f72812c = cVar;
    }
}
