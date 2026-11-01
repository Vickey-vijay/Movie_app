package com.yandex.div.evaluable.function;

import bk.l;
import com.yandex.div.evaluable.types.Color;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ColorAlphaComponentGetter extends ColorComponentGetter {
    public static final ColorAlphaComponentGetter INSTANCE = new ColorAlphaComponentGetter();
    private static final String name = "getColorAlpha";

    private ColorAlphaComponentGetter() {
        super(new l<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorAlphaComponentGetter.1
            @Override // bk.l
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m3330invokecIhhviA(color.m3376unboximpl());
            }

            /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m3330invokecIhhviA(int i10) {
                return Integer.valueOf(Color.m3366alphaimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
