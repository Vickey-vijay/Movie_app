package com.yandex.div.core.view;

import android.view.ViewTreeObserver;
import bk.a;
import com.yandex.div.core.view.OnPreDrawListeners;

/* JADX INFO: compiled from: OnPreDrawListeners.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class OnPreDrawListeners {
    public static final ViewTreeObserver.OnPreDrawListener onPreDrawListener(DrawingPassOverrideStrategy drawingPassOverrideStrategy, final a<Boolean> aVar) {
        return new OverridableOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: vd.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return OnPreDrawListeners.onPreDrawListener$lambda$0(aVar);
            }
        }, drawingPassOverrideStrategy);
    }

    public static /* synthetic */ ViewTreeObserver.OnPreDrawListener onPreDrawListener$default(DrawingPassOverrideStrategy drawingPassOverrideStrategy, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawingPassOverrideStrategy = DrawingPassOverrideStrategy.Safe.INSTANCE;
        }
        return onPreDrawListener(drawingPassOverrideStrategy, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onPreDrawListener$lambda$0(a aVar) {
        return ((Boolean) aVar.invoke()).booleanValue();
    }
}
