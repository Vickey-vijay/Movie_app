package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q2 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f55766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R2 f55767b;

    public Q2(R2 r10, BatteryInfo batteryInfo) {
        this.f55767b = r10;
        this.f55766a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        S2 s10 = this.f55767b.f55815a;
        ChargeType chargeType = this.f55766a.chargeType;
        ChargeType chargeType2 = S2.f55842d;
        synchronized (s10) {
            Iterator it = s10.f55845c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
