package com.yandex.div.core.view2;

/* JADX INFO: compiled from: CompositeLogId.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CompositeLogIdKt {
    public static final CompositeLogId compositeLogIdOf(Div2View div2View, String str) {
        return new CompositeLogId(div2View.getDataTag().getId(), div2View.getLogId(), str);
    }
}
