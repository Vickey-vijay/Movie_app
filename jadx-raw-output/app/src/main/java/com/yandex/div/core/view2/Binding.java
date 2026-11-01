package com.yandex.div.core.view2;

import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;

/* JADX INFO: compiled from: ViewBindingProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class Binding {
    private final DivData data;
    private final DivDataTag tag;

    public final DivData getData() {
        return this.data;
    }

    public final DivDataTag getTag() {
        return this.tag;
    }

    public Binding(DivDataTag divDataTag, DivData divData) {
        this.tag = divDataTag;
        this.data = divData;
    }
}
