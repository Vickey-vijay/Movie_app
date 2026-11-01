package com.unity3d.ads.core.domain.billing;

import kotlin.Result;
import kotlin.c;

/* JADX INFO: compiled from: IsBillingClientAvailable.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Class.forName("com.android.billingclient.api.BillingClient"));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        return Result.m3464isSuccessimpl(objM3458constructorimpl);
    }
}
