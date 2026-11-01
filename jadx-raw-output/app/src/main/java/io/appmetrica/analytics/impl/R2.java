package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* JADX INFO: loaded from: classes.dex */
public final class R2 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S2 f55815a;

    public R2(S2 s10) {
        this.f55815a = s10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f55815a.f55844b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f55815a.getClass();
        BatteryInfo batteryInfoA = S2.a(intent);
        this.f55815a.f55844b = batteryInfoA;
        if (chargeType != batteryInfoA.chargeType) {
            this.f55815a.f55843a.execute(new Q2(this, batteryInfoA));
        }
    }
}
