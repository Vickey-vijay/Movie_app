package p2;

import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
@VisibleForTesting
public final class d extends FullScreenContentCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final AbstractAdViewAdapter f65871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @VisibleForTesting
    public final MediationInterstitialListener f65872c;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f65871b = abstractAdViewAdapter;
        this.f65872c = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f65872c.onAdClosed(this.f65871b);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f65872c.onAdOpened(this.f65871b);
    }
}
