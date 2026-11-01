package com.yandex.div.util;

import com.yandex.div2.DivData;

/* JADX INFO: compiled from: DivDataUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivDataUtilsKt {
    public static final long getINVALID_STATE_ID(DivData.a aVar) {
        return -1L;
    }

    public static final long getInitialStateId(DivData divData) {
        return divData.f46937c.isEmpty() ? getINVALID_STATE_ID(DivData.f46932j) : divData.f46937c.get(0).f46947b;
    }
}
