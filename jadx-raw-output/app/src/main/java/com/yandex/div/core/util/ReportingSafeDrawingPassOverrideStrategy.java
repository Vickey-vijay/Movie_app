package com.yandex.div.core.util;

import android.view.ViewTreeObserver;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view.SafeDrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: compiled from: ReportingSafeDrawingPassOverrideStrategy.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ReportingSafeDrawingPassOverrideStrategy extends SafeDrawingPassOverrideStrategy {
    private final Div2View divView;
    private final Div2Logger logger;

    @Override // com.yandex.div.core.view.SafeDrawingPassOverrideStrategy
    public void onFrameCancelLimitExceeded(ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.logger.logFrameCancelLimitExceeded(this.divView, "Frame cancellation limit exceeded by " + onPreDrawListener + ". Forcing frame drawing.");
    }

    @Override // com.yandex.div.core.view.SafeDrawingPassOverrideStrategy
    public void onFrameCancelled(ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.logger.logFrameCancelled(this.divView, "Frame cancelled by " + onPreDrawListener);
    }

    public ReportingSafeDrawingPassOverrideStrategy(Div2View div2View, Div2Logger div2Logger) {
        this.divView = div2View;
        this.logger = div2Logger;
    }
}
