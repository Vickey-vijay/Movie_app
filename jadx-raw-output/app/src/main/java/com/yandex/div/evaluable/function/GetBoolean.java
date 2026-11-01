package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetBoolean extends BooleanFromDict {
    public static final GetBoolean INSTANCE = new GetBoolean();
    private static final String name = "getBoolean";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.BooleanFromDict
    public boolean isMethod() {
        return isMethod;
    }

    private GetBoolean() {
    }
}
