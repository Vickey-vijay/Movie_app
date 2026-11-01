package io.bidmachine;

import androidx.annotation.NonNull;
import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface HeaderBiddingCollectParamsCallback {
    void onCollectFail(@NonNull BMError bMError);

    void onCollectFinished(@NonNull Map<String, String> map);
}
