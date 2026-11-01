package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ArrayGetNumber extends ArrayNumber {
    public static final ArrayGetNumber INSTANCE = new ArrayGetNumber();
    private static final String name = "getNumber";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction
    public boolean isMethod() {
        return isMethod;
    }

    private ArrayGetNumber() {
    }
}
