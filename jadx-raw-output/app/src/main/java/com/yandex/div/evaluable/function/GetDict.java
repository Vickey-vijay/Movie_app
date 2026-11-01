package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GetDict extends DictFromDict {
    public static final GetDict INSTANCE = new GetDict();
    private static final String name = "getDict";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictFromDict
    public boolean isMethod() {
        return isMethod;
    }

    private GetDict() {
    }
}
