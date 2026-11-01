package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetDictString extends DictString {
    public static final GetDictString INSTANCE = new GetDictString();
    private static final String name = "getDictString";

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    private GetDictString() {
    }
}
