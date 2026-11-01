package com.yandex.div.evaluable.function;

import bk.p;
import com.yandex.div.evaluable.types.Color;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ColorAlphaComponentSetter extends ColorComponentSetter {
    public static final ColorAlphaComponentSetter INSTANCE = new ColorAlphaComponentSetter();
    private static final String name = "setColorAlpha";

    private ColorAlphaComponentSetter() {
        super(new p<Color, Double, Color>() { // from class: com.yandex.div.evaluable.function.ColorAlphaComponentSetter.1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Color mo1invoke(Color color, Double d10) {
                return Color.m3368boximpl(m3331invokeGnj5c28(color.m3376unboximpl(), d10.doubleValue()));
            }

            /* JADX INFO: renamed from: invoke-Gnj5c28, reason: not valid java name */
            public final int m3331invokeGnj5c28(int i10, double d10) {
                return Color.Companion.m3377argbH0kstlE(ColorFunctionsKt.toColorIntComponentValue(d10), Color.m3374redimpl(i10), Color.m3372greenimpl(i10), Color.m3367blueimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
