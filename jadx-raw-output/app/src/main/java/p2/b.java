package p2;

import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
public final class b extends AdListener implements AppEventListener, zza {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final AbstractAdViewAdapter f65867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    public final MediationBannerListener f65868d;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f65867c = abstractAdViewAdapter;
        this.f65868d = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f65868d.onAdClicked(this.f65867c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f65868d.onAdClosed(this.f65867c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f65868d.onAdFailedToLoad(this.f65867c, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f65868d.onAdLoaded(this.f65867c);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f65868d.onAdOpened(this.f65867c);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f65868d.zza(this.f65867c, str, str2);
    }
}
