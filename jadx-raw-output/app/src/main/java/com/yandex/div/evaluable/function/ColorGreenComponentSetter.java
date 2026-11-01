package com.yandex.div.evaluable.function;

import bk.p;
import com.yandex.div.evaluable.types.Color;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ColorGreenComponentSetter extends ColorComponentSetter {
    public static final ColorGreenComponentSetter INSTANCE = new ColorGreenComponentSetter();
    private static final String name = "setColorGreen";

    private ColorGreenComponentSetter() {
        super(new p<Color, Double, Color>() { // from class: com.yandex.div.evaluable.function.ColorGreenComponentSetter.1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Color mo1invoke(Color color, Double d10) {
                return Color.m3368boximpl(m3335invokeGnj5c28(color.m3376unboximpl(), d10.doubleValue()));
            }

            /* JADX INFO: renamed from: invoke-Gnj5c28, reason: not valid java name */
            public final int m3335invokeGnj5c28(int i10, double d10) {
                return Color.Companion.m3377argbH0kstlE(Color.m3366alphaimpl(i10), Color.m3374redimpl(i10), ColorFunctionsKt.toColorIntComponentValue(d10), Color.m3367blueimpl(i10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
