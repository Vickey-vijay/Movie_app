package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ColorStringRedComponentSetter extends ColorStringComponentSetter {
    public static final ColorStringRedComponentSetter INSTANCE = new ColorStringRedComponentSetter();
    private static final String name = "setColorRed";

    private ColorStringRedComponentSetter() {
        super(ColorRedComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
