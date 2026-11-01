package com.yandex.div.evaluable.function;

import bk.l;
import com.yandex.div.evaluable.types.Color;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ColorGreenComponentGetter extends ColorComponentGetter {
    public static final ColorGreenComponentGetter INSTANCE = new ColorGreenComponentGetter();
    private static final String name = "getColorGreen";

    private ColorGreenComponentGetter() {
        super(new l<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorGreenComponentGetter.1
            @Override // bk.l
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m3334invokecIhhviA(color.m3376unboximpl());
            }

            /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m3334invokecIhhviA(int i10) {
                return Integer.valueOf(Color.m3372greenimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
