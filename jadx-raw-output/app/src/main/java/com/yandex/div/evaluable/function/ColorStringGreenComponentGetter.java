package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ColorStringGreenComponentGetter extends ColorStringComponentGetter {
    public static final ColorStringGreenComponentGetter INSTANCE = new ColorStringGreenComponentGetter();
    private static final String name = "getColorGreen";

    private ColorStringGreenComponentGetter() {
        super(ColorGreenComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
