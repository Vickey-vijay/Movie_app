package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ColorStringBlueComponentSetter extends ColorStringComponentSetter {
    public static final ColorStringBlueComponentSetter INSTANCE = new ColorStringBlueComponentSetter();
    private static final String name = "setColorBlue";

    private ColorStringBlueComponentSetter() {
        super(ColorBlueComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
