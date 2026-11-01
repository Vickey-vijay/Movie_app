package com.yandex.div.core.view;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: DrawingPassOverrideStrategy.kt */
/* JADX INFO: loaded from: classes.dex */
public interface DrawingPassOverrideStrategy {
    boolean overrideDrawingPass(ViewTreeObserver.OnPreDrawListener onPreDrawListener, boolean z10);

    /* JADX INFO: compiled from: DrawingPassOverrideStrategy.kt */
    public static final class Safe extends SafeDrawingPassOverrideStrategy {
        public static final Safe INSTANCE = new Safe();

        private Safe() {
        }
    }
}
