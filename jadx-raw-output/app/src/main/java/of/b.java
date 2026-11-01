package of;

import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastRequestListener;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.IabUtils;

/* JADX INFO: compiled from: VastFullScreenAdLoadListener.java */
/* JADX INFO: loaded from: classes11.dex */
public class b implements VastRequestListener {

    @NonNull
    private final UnifiedFullscreenAdCallback callback;

    @Override // io.bidmachine.iab.vast.VastRequestListener
    public void onVastLoaded(@NonNull VastRequest vastRequest) {
        this.callback.onAdLoaded();
    }

    public b(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.callback = unifiedFullscreenAdCallback;
    }

    @Override // io.bidmachine.iab.vast.VastRequestListener
    public void onVastLoadFailed(@NonNull VastRequest vastRequest, @NonNull IabError iabError) {
        if (iabError.getCode() == 6) {
            this.callback.onAdExpired();
        } else {
            this.callback.onAdLoadFailed(IabUtils.mapError(iabError));
        }
    }
}
