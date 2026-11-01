package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface InternalAdData {
    @NonNull
    String getAdUnitId();

    @NonNull
    Map<String, Object> getCustomParamsMap();

    double getPrice();
}
