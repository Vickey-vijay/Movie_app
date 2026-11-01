package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetBooleanFromDict extends BooleanFromDict {
    public static final GetBooleanFromDict INSTANCE = new GetBooleanFromDict();
    private static final String name = "getBooleanFromDict";

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    private GetBooleanFromDict() {
    }
}
