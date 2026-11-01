package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GetUrl extends UrlFromDict {
    public static final GetUrl INSTANCE = new GetUrl();
    private static final String name = "getUrl";
    private static final boolean isMethod = true;

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.UrlFromDict
    public boolean isMethod() {
        return isMethod;
    }

    private GetUrl() {
    }
}
