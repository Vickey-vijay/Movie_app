package com.yandex.div.evaluable.function;

import bk.p;
import com.yandex.div.evaluable.types.Color;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ColorBlueComponentSetter extends ColorComponentSetter {
    public static final ColorBlueComponentSetter INSTANCE = new ColorBlueComponentSetter();
    private static final String name = "setColorBlue";

    private ColorBlueComponentSetter() {
        super(new p<Color, Double, Color>() { // from class: com.yandex.div.evaluable.function.ColorBlueComponentSetter.1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Color mo1invoke(Color color, Double d10) {
                return Color.m3368boximpl(m3333invokeGnj5c28(color.m3376unboximpl(), d10.doubleValue()));
            }

            /* JADX INFO: renamed from: invoke-Gnj5c28, reason: not valid java name */
            public final int m3333invokeGnj5c28(int i10, double d10) {
                return Color.Companion.m3377argbH0kstlE(Color.m3366alphaimpl(i10), Color.m3374redimpl(i10), Color.m3372greenimpl(i10), ColorFunctionsKt.toColorIntComponentValue(d10));
            }
        });
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
