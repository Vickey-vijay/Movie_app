package com.unity3d.services.store.core;

import ck.p;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import oc.l;

/* JADX INFO: compiled from: StoreWebViewError.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StoreWebViewError extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(Enum<?> r10, String str, Object... objArr) {
        super(r10, str, Arrays.copyOf(objArr, objArr.length));
        p.j(objArr, "errorArguments");
    }

    @Override // oc.l
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
