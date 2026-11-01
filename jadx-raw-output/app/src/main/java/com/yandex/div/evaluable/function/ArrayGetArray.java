package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ArrayGetArray extends ArrayFromArray {
    public static final ArrayGetArray INSTANCE = new ArrayGetArray();
    private static final String name = "getArray";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction
    public boolean isMethod() {
        return isMethod;
    }

    private ArrayGetArray() {
    }
}
