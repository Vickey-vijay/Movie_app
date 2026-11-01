package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetDictKeys extends GetKeysFromDict {
    public static final GetDictKeys INSTANCE = new GetDictKeys();
    private static final String name = "getDictKeys";

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    private GetDictKeys() {
    }
}
