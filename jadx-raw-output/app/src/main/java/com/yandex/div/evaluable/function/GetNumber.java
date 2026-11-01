package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetNumber extends DictNumber {
    public static final GetNumber INSTANCE = new GetNumber();
    private static final String name = "getNumber";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.DictNumber
    public boolean isMethod() {
        return isMethod;
    }

    private GetNumber() {
    }
}
