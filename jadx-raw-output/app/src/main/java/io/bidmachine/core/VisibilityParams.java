package io.bidmachine.core;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class VisibilityParams {
    public static final boolean DEF_IGNORE_OVERLAP = false;
    public static final boolean DEF_IGNORE_WINDOW_FOCUS = false;
    public static final float DEF_PIXEL_THRESHOLD = 1.0f;
    public static final long DEF_TIME_THRESHOLD_SEC = 1;
    private long timeThresholdMs = TimeUnit.SECONDS.toMillis(1);
    private float pixelThreshold = 1.0f;
    private boolean ignoreWindowFocus = false;
    private boolean ignoreOverlap = false;

    public float getPixelThreshold() {
        return this.pixelThreshold;
    }

    public long getTimeThresholdMs() {
        return this.timeThresholdMs;
    }

    public boolean isIgnoreOverlap() {
        return this.ignoreOverlap;
    }

    public boolean isIgnoreWindowFocus() {
        return this.ignoreWindowFocus;
    }

    public void setIgnoreOverlap(boolean z10) {
        this.ignoreOverlap = z10;
    }

    public void setIgnoreWindowFocus(boolean z10) {
        this.ignoreWindowFocus = z10;
    }

    public void setPixelThreshold(float f10) {
        this.pixelThreshold = f10;
    }

    public void setTimeThresholdMs(long j10) {
        this.timeThresholdMs = j10;
    }

    public void setTimeThresholdSec(long j10) {
        setTimeThresholdMs(TimeUnit.SECONDS.toMillis(j10));
    }
}
