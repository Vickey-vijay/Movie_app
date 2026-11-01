package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: compiled from: SimpleAdProcessCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public class q5 implements AdProcessCallback {
    @Override // io.bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(@Nullable Map<String, Object> map) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClicked() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processClosed() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processDestroy() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processExpired() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFillAd() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processFinished() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadFail(@NonNull BMError bMError) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processLoadSuccess() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShowFail(@NonNull BMError bMError) {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processShown() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processStartVisibilityTracker() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public void processVisibilityTrackerImpression() {
    }

    @Override // io.bidmachine.AdProcessCallback
    public boolean processVisibilityTrackerShown() {
        return false;
    }

    @Override // io.bidmachine.AdProcessCallback
    public void setVisibilitySource(@NonNull VisibilitySource visibilitySource) {
    }
}
