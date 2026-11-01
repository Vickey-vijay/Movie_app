package com.yandex.div.evaluable.function;

import bk.l;
import com.yandex.div.evaluable.types.Color;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ColorBlueComponentGetter extends ColorComponentGetter {
    public static final ColorBlueComponentGetter INSTANCE = new ColorBlueComponentGetter();
    private static final String name = "getColorBlue";

    private ColorBlueComponentGetter() {
        super(new l<Color, Integer>() { // from class: com.yandex.div.evaluable.function.ColorBlueComponentGetter.1
            @Override // bk.l
            public /* bridge */ /* synthetic */ Integer invoke(Color color) {
                return m3332invokecIhhviA(color.m3376unboximpl());
            }

            /* JADX INFO: renamed from: invoke-cIhhviA, reason: not valid java name */
            public final Integer m3332invokecIhhviA(int i10) {
                return Integer.valueOf(Color.m3367blueimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
