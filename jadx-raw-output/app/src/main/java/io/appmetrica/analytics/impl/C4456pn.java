package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4456pn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4505rn f57527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4505rn f57528b;

    public C4456pn(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f57527a = new M2(new C4429ol(context));
            this.f57528b = new M2(new Mc(context));
        } else {
            this.f57527a = new Z7();
            this.f57528b = new Z7();
        }
    }
}
