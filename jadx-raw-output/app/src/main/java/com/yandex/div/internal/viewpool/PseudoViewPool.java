package com.yandex.div.internal.viewpool;

import android.view.View;
import ck.p;
import com.yandex.div.internal.util.UtilsKt;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PseudoViewPool.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class PseudoViewPool implements ViewPool {
    private final ConcurrentHashMap<String, ViewFactory<? extends View>> factoryMap = new ConcurrentHashMap<>();

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> T obtain(String str) {
        T t10 = (T) ((ViewFactory) UtilsKt.getOrThrow$default(this.factoryMap, str, null, 2, null)).createView();
        p.h(t10, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.PseudoViewPool.obtain");
        return t10;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> void register(String str, ViewFactory<T> viewFactory, int i10) {
        this.factoryMap.put(str, viewFactory);
    }
}
