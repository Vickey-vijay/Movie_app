package ef;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: InternalGAMAdLoadListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface x<GAMAdType extends InternalGAMAd> {
    void onAdLoadFailed(@NonNull BMError bMError);

    void onAdLoaded(@NonNull GAMAdType gamadtype);
}
