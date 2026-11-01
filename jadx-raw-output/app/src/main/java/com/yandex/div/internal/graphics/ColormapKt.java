package com.yandex.div.internal.graphics;

import ck.p;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: compiled from: Colormap.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ColormapKt {
    public static final Colormap checkIsNotEmpty(Colormap colormap, Div2View div2View) {
        if (p.e(colormap, Colormap.EMPTY)) {
            DivActionTypedUtilsKt.logError(div2View, new IllegalStateException("Colors for linear gradient are not provided. Please check if 'colors' or 'color_map' properties are defined"));
        }
        return colormap;
    }
}
