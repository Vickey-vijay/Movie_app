package com.yandex.div.core.view;

import android.annotation.SuppressLint;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: OnPreDrawListeners.kt */
/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"OnPreDrawListenerIssue"})
public final class OverridableOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    private final ViewTreeObserver.OnPreDrawListener delegate;
    private final DrawingPassOverrideStrategy overrideStrategy;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return this.overrideStrategy.overrideDrawingPass(this.delegate, this.delegate.onPreDraw());
    }

    public OverridableOnPreDrawListener(ViewTreeObserver.OnPreDrawListener onPreDrawListener, DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.delegate = onPreDrawListener;
        this.overrideStrategy = drawingPassOverrideStrategy;
    }
}
