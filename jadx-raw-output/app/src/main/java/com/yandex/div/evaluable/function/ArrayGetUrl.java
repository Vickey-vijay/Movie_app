package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ArrayGetUrl extends ArrayUrl {
    public static final ArrayGetUrl INSTANCE = new ArrayGetUrl();
    private static final String name = "getUrl";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFunction
    public boolean isMethod() {
        return isMethod;
    }

    private ArrayGetUrl() {
    }
}
