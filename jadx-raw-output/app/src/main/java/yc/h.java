package yc;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: compiled from: ScarRewardedAdListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class h extends yc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f85696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oc.h f85697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RewardedAdLoadCallback f85698d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnUserEarnedRewardListener f85699e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FullScreenContentCallback f85700f = new c();

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            h.this.f85697c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(h.this.f85700f);
            h.this.f85696b.c(rewardedAd);
            qc.b bVar = h.this.f85681a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            h.this.f85697c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class b implements OnUserEarnedRewardListener {
        public b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
            h.this.f85697c.onUserEarnedReward();
        }
    }

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class c extends FullScreenContentCallback {
        public c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.f85697c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.f85697c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            h.this.f85697c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.f85697c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.f85697c.onAdOpened();
        }
    }

    public RewardedAdLoadCallback e() {
        return this.f85698d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f85699e;
    }

    public h(oc.h hVar, g gVar) {
        this.f85697c = hVar;
        this.f85696b = gVar;
    }
}
