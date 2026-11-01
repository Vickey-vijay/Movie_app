package com.yandex.div.internal.widget;

import android.view.ViewTreeObserver;
import ck.i;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;

/* JADX INFO: compiled from: AutoEllipsizeHelper.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AutoEllipsizeHelper {
    private static final Companion Companion = new Companion(null);
    private DrawingPassOverrideStrategy drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
    private boolean isEnabled;
    private ViewTreeObserver.OnPreDrawListener preDrawListener;
    private final EllipsizedTextView textView;

    /* JADX INFO: compiled from: AutoEllipsizeHelper.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final void addListener() {
        if (this.preDrawListener != null) {
            return;
        }
        this.preDrawListener = OnPreDrawListeners.onPreDrawListener(this.drawingPassOverrideStrategy, new bk.a<Boolean>() { // from class: com.yandex.div.internal.widget.AutoEllipsizeHelper.addListener.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Boolean invoke() {
                boolean z10;
                if (!AutoEllipsizeHelper.this.isEnabled()) {
                    return Boolean.TRUE;
                }
                EllipsizedTextView ellipsizedTextView = AutoEllipsizeHelper.this.textView;
                int height = (ellipsizedTextView.getHeight() - ellipsizedTextView.getCompoundPaddingTop()) - ellipsizedTextView.getCompoundPaddingBottom();
                int iLineAt = TextViewsKt.lineAt(ellipsizedTextView, height);
                int i10 = iLineAt + 1;
                if (height >= TextViewsKt.textHeight(ellipsizedTextView, i10)) {
                    iLineAt = i10;
                }
                if (iLineAt <= 0 || iLineAt >= AutoEllipsizeHelper.this.textView.getLineCount()) {
                    AutoEllipsizeHelper.this.removeListener();
                    z10 = true;
                } else {
                    KLog kLog = KLog.INSTANCE;
                    if (kLog.isAtLeast(Severity.DEBUG)) {
                        kLog.print(3, "AutoEllipsizeHelper", "Trying to set new max lines " + iLineAt + ". Current drawing pass is canceled. ");
                    }
                    AutoEllipsizeHelper.this.textView.setMaxLines(iLineAt);
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        });
        this.textView.getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeListener() {
        if (this.preDrawListener != null) {
            this.textView.getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
            this.preDrawListener = null;
        }
    }

    public final DrawingPassOverrideStrategy getDrawingPassOverrideStrategy() {
        return this.drawingPassOverrideStrategy;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void onViewAttachedToWindow() {
        if (this.isEnabled) {
            addListener();
        }
    }

    public final void setDrawingPassOverrideStrategy(DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.drawingPassOverrideStrategy = drawingPassOverrideStrategy;
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
    }

    public AutoEllipsizeHelper(EllipsizedTextView ellipsizedTextView) {
        this.textView = ellipsizedTextView;
    }

    public final void onViewDetachedFromWindow() {
        removeListener();
    }
}
