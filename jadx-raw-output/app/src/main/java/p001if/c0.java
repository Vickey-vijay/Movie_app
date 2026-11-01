package p001if;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: InternalAdLoadListener.java */
/* JADX INFO: loaded from: classes9.dex */
public interface c0<InternalAdType extends InternalAd> {
    void onAdLoadFailed(@NonNull BMError bMError);

    void onAdLoaded(@NonNull InternalAdType internaladtype);
}
