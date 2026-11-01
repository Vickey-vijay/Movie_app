package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GetDictInteger extends DictInteger {
    public static final GetDictInteger INSTANCE = new GetDictInteger();
    private static final String name = "getDictInteger";

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    private GetDictInteger() {
    }
}
