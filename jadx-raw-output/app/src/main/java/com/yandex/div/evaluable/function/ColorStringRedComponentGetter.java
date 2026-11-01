package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ColorStringRedComponentGetter extends ColorStringComponentGetter {
    public static final ColorStringRedComponentGetter INSTANCE = new ColorStringRedComponentGetter();
    private static final String name = "getColorRed";

    private ColorStringRedComponentGetter() {
        super(ColorRedComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
