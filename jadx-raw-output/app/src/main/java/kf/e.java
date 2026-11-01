package kf;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes2.dex */
public class e extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final InternalFullscreenAdPresentListener f62790a;

    public e(@NonNull InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        this.f62790a = internalFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.f62790a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.f62790a.onAdComplete();
        this.f62790a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(@NonNull AdError adError) {
        this.f62790a.onAdShowFailed(n.a(BMError.InternalUnknownError, adError));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.f62790a.onAdShown();
    }
}
