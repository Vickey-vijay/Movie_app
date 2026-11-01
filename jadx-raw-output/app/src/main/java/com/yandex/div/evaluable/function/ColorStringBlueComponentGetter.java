package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ColorStringBlueComponentGetter extends ColorStringComponentGetter {
    public static final ColorStringBlueComponentGetter INSTANCE = new ColorStringBlueComponentGetter();
    private static final String name = "getColorBlue";

    private ColorStringBlueComponentGetter() {
        super(ColorBlueComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
