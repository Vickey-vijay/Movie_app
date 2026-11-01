package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class GetDictValues extends GetValuesFromDict {
    public static final GetDictValues INSTANCE = new GetDictValues();
    private static final String name = "getDictValues";

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    private GetDictValues() {
    }
}
