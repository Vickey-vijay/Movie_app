package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import ck.i;

/* JADX INFO: compiled from: SafeDrawingPassOverrideStrategy.kt */
/* JADX INFO: loaded from: classes7.dex */
public class SafeDrawingPassOverrideStrategy implements DrawingPassOverrideStrategy {
    private static final Companion Companion = new Companion(null);
    private int frameCancelCount;
    private int frameCancelLimit = 3;

    /* JADX INFO: compiled from: SafeDrawingPassOverrideStrategy.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public void onFrameCancelLimitExceeded(ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
    }

    public void onFrameCancelled(ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
    }

    @Override // com.yandex.div.core.view.DrawingPassOverrideStrategy
    public boolean overrideDrawingPass(ViewTreeObserver.OnPreDrawListener onPreDrawListener, boolean z10) {
        if (z10) {
            this.frameCancelCount = 0;
            return true;
        }
        int i10 = this.frameCancelCount;
        int i11 = this.frameCancelLimit;
        if (i10 < i11) {
            int i12 = i10 + 1;
            this.frameCancelCount = i12;
            onFrameCancelled(onPreDrawListener, i12);
            return false;
        }
        if (i10 == i11) {
            int i13 = i10 + 1;
            this.frameCancelCount = i13;
            onFrameCancelLimitExceeded(onPreDrawListener, i13);
        }
        return true;
    }
}
