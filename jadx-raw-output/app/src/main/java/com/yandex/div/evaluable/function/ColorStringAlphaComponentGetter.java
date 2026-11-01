package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ColorStringAlphaComponentGetter extends ColorStringComponentGetter {
    public static final ColorStringAlphaComponentGetter INSTANCE = new ColorStringAlphaComponentGetter();
    private static final String name = "getColorAlpha";

    private ColorStringAlphaComponentGetter() {
        super(ColorAlphaComponentGetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
