package io.bidmachine.internal.utils.visibility;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.VisibilityParams;

/* JADX INFO: loaded from: classes7.dex */
public class VisibilityTrackerHolder {

    @NonNull
    private final Object lock = new Object();

    @Nullable
    @VisibleForTesting
    public VisibilityTracker visibilityTracker;

    @NonNull
    @VisibleForTesting
    public VisibilityTracker createVisibilityTracker(@NonNull View view, @NonNull VisibilityParams visibilityParams, @NonNull VisibilityTrackerListener visibilityTrackerListener) {
        return new VisibilityTrackerImpl(view, visibilityParams, visibilityTrackerListener);
    }

    public void startTracking(@NonNull View view, @NonNull VisibilityParams visibilityParams, @NonNull VisibilityTrackerListener visibilityTrackerListener) {
        synchronized (this.lock) {
            stopTracking();
            VisibilityTracker visibilityTrackerCreateVisibilityTracker = createVisibilityTracker(view, visibilityParams, visibilityTrackerListener);
            this.visibilityTracker = visibilityTrackerCreateVisibilityTracker;
            visibilityTrackerCreateVisibilityTracker.start();
        }
    }

    public void stopTracking() {
        synchronized (this.lock) {
            VisibilityTracker visibilityTracker = this.visibilityTracker;
            if (visibilityTracker != null) {
                visibilityTracker.stop();
                this.visibilityTracker = null;
            }
        }
    }
}
