package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import io.bidmachine.iab.IabError;

/* JADX INFO: loaded from: classes8.dex */
public interface VastRequestListener {
    void onVastLoadFailed(@NonNull VastRequest vastRequest, @NonNull IabError iabError);

    void onVastLoaded(@NonNull VastRequest vastRequest);
}
