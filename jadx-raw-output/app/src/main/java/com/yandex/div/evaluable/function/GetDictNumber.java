package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class GetDictNumber extends DictNumber {
    public static final GetDictNumber INSTANCE = new GetDictNumber();
    private static final String name = "getDictNumber";

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    private GetDictNumber() {
    }
}
