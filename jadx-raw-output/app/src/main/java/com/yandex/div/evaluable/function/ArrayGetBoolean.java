package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ArrayGetBoolean extends ArrayBoolean {
    public static final ArrayGetBoolean INSTANCE = new ArrayGetBoolean();
    private static final String name = "getBoolean";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction
    public boolean isMethod() {
        return isMethod;
    }

    private ArrayGetBoolean() {
    }
}
