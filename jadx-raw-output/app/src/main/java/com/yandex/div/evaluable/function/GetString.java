package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class GetString extends DictString {
    public static final GetString INSTANCE = new GetString();
    private static final String name = "getString";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictString
    public boolean isMethod() {
        return isMethod;
    }

    private GetString() {
    }
}
