package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface AdProcessCallback {
    void onBrokenCreativeEvent(@Nullable Map<String, Object> map);

    void processClicked();

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(@NonNull BMError bMError);

    void processLoadSuccess();

    void processShowFail(@NonNull BMError bMError);

    void processShown();

    void processStartVisibilityTracker();

    void processVisibilityTrackerImpression();

    boolean processVisibilityTrackerShown();

    void setVisibilitySource(@NonNull VisibilitySource visibilitySource);
}
