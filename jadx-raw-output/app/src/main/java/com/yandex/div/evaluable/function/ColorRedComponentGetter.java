package com.yandex.div.evaluable.function;

import bk.l;
import com.yandex.div.evaluable.types.Color;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ColorRedComponentGetter extends ColorComponentGetter {
    public static final ColorRedComponentGetter INSTANCE = new ColorRedComponentGetter();
    private static final String name = "getColorRed";

    private ColorRedComponentGetter() {
        super(new l<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorRedComponentGetter.1
            @Override // bk.l
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m3336invokecIhhviA(color.m3376unboximpl());
            }

            /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m3336invokecIhhviA(int i10) {
                return Integer.valueOf(Color.m3374redimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
