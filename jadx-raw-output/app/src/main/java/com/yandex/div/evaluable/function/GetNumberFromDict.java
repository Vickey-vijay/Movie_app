package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GetNumberFromDict extends DictNumber {
    public static final GetNumberFromDict INSTANCE = new GetNumberFromDict();
    private static final String name = "getNumberFromDict";

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    private GetNumberFromDict() {
    }
}
