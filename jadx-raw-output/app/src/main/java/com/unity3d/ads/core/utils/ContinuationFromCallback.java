package com.unity3d.ads.core.utils;

import ck.p;
import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import kotlin.Result;
import rj.c;

/* JADX INFO: compiled from: ContinuationFromCallback.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ContinuationFromCallback extends WebViewCallback {
    private final c<Object> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(c<Object> cVar) {
        super("", 0);
        p.j(cVar, "continuation");
        this.continuation = cVar;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(Enum<?> r10, Object... objArr) {
        p.j(objArr, "params");
        c<Object> cVar = this.continuation;
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(new ExposureException("Invocation failed with: " + r10, objArr))));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(Object... objArr) {
        p.j(objArr, "params");
        this.continuation.resumeWith(Result.m3458constructorimpl(objArr));
    }
}
