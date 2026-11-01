package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ArrayGetColor extends ArrayColor {
    public static final ArrayGetColor INSTANCE = new ArrayGetColor();
    private static final String name = "getColor";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction
    public boolean isMethod() {
        return isMethod;
    }

    private ArrayGetColor() {
    }
}
