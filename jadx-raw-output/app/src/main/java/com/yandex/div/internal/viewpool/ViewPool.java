package com.yandex.div.internal.viewpool;

import android.view.View;

/* JADX INFO: compiled from: ViewPool.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface ViewPool {
    <T extends View> T obtain(String str);

    <T extends View> void register(String str, ViewFactory<T> viewFactory, int i10);
}
