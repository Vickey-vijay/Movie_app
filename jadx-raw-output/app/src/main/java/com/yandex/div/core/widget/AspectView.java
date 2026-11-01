package com.yandex.div.core.widget;

import android.view.View;
import bk.l;
import fk.d;
import ik.k;

/* JADX INFO: compiled from: AspectView.kt */
/* JADX INFO: loaded from: classes7.dex */
public interface AspectView {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: AspectView.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final d<View, Float> aspectRatioProperty$div_release() {
            return ViewsKt.dimensionAffecting(Float.valueOf(0.0f), new l<Float, Float>() { // from class: com.yandex.div.core.widget.AspectView$Companion$aspectRatioProperty$1
                public final Float invoke(float f10) {
                    return Float.valueOf(k.c(f10, 0.0f));
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ Float invoke(Float f10) {
                    return invoke(f10.floatValue());
                }
            });
        }
    }

    void setAspectRatio(float f10);
}
