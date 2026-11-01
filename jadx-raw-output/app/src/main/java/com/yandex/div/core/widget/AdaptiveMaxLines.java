package com.yandex.div.core.widget;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import bk.a;
import ck.p;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;

/* JADX INFO: compiled from: AdaptiveMaxLines.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AdaptiveMaxLines {
    private final DrawingPassOverrideStrategy drawingPassOverrideStrategy;
    private boolean isAdaptLinesRequested;
    private Params params;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    private final TextView textView;
    private View.OnAttachStateChangeListener viewAttachListener;

    /* JADX INFO: compiled from: AdaptiveMaxLines.kt */
    public static final class Params {
        private final int maxLines;
        private final int minHiddenLines;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.maxLines == params.maxLines && this.minHiddenLines == params.minHiddenLines;
        }

        public int hashCode() {
            return (Integer.hashCode(this.maxLines) * 31) + Integer.hashCode(this.minHiddenLines);
        }

        public String toString() {
            return "Params(maxLines=" + this.maxLines + ", minHiddenLines=" + this.minHiddenLines + ')';
        }

        public final int getMaxLines() {
            return this.maxLines;
        }

        public final int getTotalVisibleLines() {
            return this.maxLines + this.minHiddenLines;
        }

        public Params(int i10, int i11) {
            this.maxLines = i10;
            this.minHiddenLines = i11;
        }
    }

    private final void addAttachListener() {
        if (this.viewAttachListener != null) {
            return;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines.addAttachListener.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                AdaptiveMaxLines.this.addPreDrawListener();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AdaptiveMaxLines.this.removePreDrawListener();
            }
        };
        this.textView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.viewAttachListener = onAttachStateChangeListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addPreDrawListener() {
        if (this.preDrawListener != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = OnPreDrawListeners.onPreDrawListener(this.drawingPassOverrideStrategy, new a<Boolean>() { // from class: com.yandex.div.core.widget.AdaptiveMaxLines.addPreDrawListener.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Boolean invoke() {
                Params params = AdaptiveMaxLines.this.params;
                if (params == null) {
                    return Boolean.TRUE;
                }
                if (TextUtils.isEmpty(AdaptiveMaxLines.this.textView.getText())) {
                    return Boolean.TRUE;
                }
                boolean z10 = false;
                if (AdaptiveMaxLines.this.isAdaptLinesRequested) {
                    AdaptiveMaxLines.this.removePreDrawListener();
                    AdaptiveMaxLines.this.isAdaptLinesRequested = false;
                    return Boolean.TRUE;
                }
                Integer num = Integer.MAX_VALUE;
                AdaptiveMaxLines adaptiveMaxLines = AdaptiveMaxLines.this;
                num.intValue();
                num = adaptiveMaxLines.textView.getLineCount() <= params.getTotalVisibleLines() ? Integer.MAX_VALUE : null;
                int iIntValue = num != null ? num.intValue() : params.getMaxLines();
                if (iIntValue != AdaptiveMaxLines.this.textView.getMaxLines()) {
                    AdaptiveMaxLines.this.textView.setMaxLines(iIntValue);
                    AdaptiveMaxLines.this.isAdaptLinesRequested = true;
                } else {
                    AdaptiveMaxLines.this.removePreDrawListener();
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        });
        this.textView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        this.preDrawListener = onPreDrawListener;
    }

    private final void removeAttachListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.viewAttachListener;
        if (onAttachStateChangeListener != null) {
            this.textView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.viewAttachListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removePreDrawListener() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.preDrawListener;
        if (onPreDrawListener != null) {
            this.textView.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        this.preDrawListener = null;
    }

    public final void apply(Params params) {
        if (p.e(this.params, params)) {
            return;
        }
        this.params = params;
        if (ViewCompat.isAttachedToWindow(this.textView)) {
            addPreDrawListener();
        }
        addAttachListener();
    }

    public AdaptiveMaxLines(TextView textView, DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.textView = textView;
        this.drawingPassOverrideStrategy = drawingPassOverrideStrategy;
    }

    public final void reset() {
        removeAttachListener();
        removePreDrawListener();
    }
}
