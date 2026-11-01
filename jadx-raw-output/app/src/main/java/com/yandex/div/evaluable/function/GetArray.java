package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetArray extends ArrayFromDict {
    public static final GetArray INSTANCE = new GetArray();
    private static final String name = "getArray";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.ArrayFromDict
    public boolean isMethod() {
        return isMethod;
    }

    private GetArray() {
    }
}
