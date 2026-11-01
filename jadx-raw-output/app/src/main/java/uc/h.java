package uc;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: compiled from: ScarRewardedAdListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class h extends uc.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f72821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oc.h f72822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RewardedAdLoadCallback f72823d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final OnUserEarnedRewardListener f72824e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FullScreenContentCallback f72825f = new c();

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class a extends RewardedAdLoadCallback {
        public a() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
            super.onAdLoaded(rewardedAd);
            h.this.f72822c.onAdLoaded();
            rewardedAd.setFullScreenContentCallback(h.this.f72825f);
            h.this.f72821b.c(rewardedAd);
            qc.b bVar = h.this.f72806a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            h.this.f72822c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
        }
    }

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class b implements OnUserEarnedRewardListener {
        public b() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
            h.this.f72822c.onUserEarnedReward();
        }
    }

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class c extends FullScreenContentCallback {
        public c() {
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.f72822c.onAdClicked();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.f72822c.onAdClosed();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
            super.onAdFailedToShowFullScreenContent(adError);
            h.this.f72822c.onAdFailedToShow(adError.getCode(), adError.toString());
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.f72822c.onAdImpression();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.f72822c.onAdOpened();
        }
    }

    public RewardedAdLoadCallback e() {
        return this.f72823d;
    }

    public OnUserEarnedRewardListener f() {
        return this.f72824e;
    }

    public h(oc.h hVar, g gVar) {
        this.f72822c = hVar;
        this.f72821b = gVar;
    }
}
