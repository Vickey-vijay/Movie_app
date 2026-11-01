package com.yandex.varioqub.analyticadapter;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/yandex/varioqub/analyticadapter/AdapterIdentifiersCallback;", "", "", "identifier", "Lmj/r;", "onSuccess", "error", "onError", "analytic-adapter_release"}, k = 1, mv = {1, 6, 0})
public interface AdapterIdentifiersCallback {
    void onError(String str);

    void onSuccess(String str);
}
