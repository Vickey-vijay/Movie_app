package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetValues extends GetValuesFromDict {
    public static final GetValues INSTANCE = new GetValues();
    private static final String name = "getValues";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    private GetValues() {
    }
}
