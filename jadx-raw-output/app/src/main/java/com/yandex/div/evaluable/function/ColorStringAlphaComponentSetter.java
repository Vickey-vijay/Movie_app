package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ColorStringAlphaComponentSetter extends ColorStringComponentSetter {
    public static final ColorStringAlphaComponentSetter INSTANCE = new ColorStringAlphaComponentSetter();
    private static final String name = "setColorAlpha";

    private ColorStringAlphaComponentSetter() {
        super(ColorAlphaComponentSetter.INSTANCE);
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }
}
