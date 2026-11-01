package io.appmetrica.analytics.impl;

import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4404nl implements FunctionWithThrowable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4429ol f57365a;

    public C4404nl(C4429ol c4429ol) {
        this.f57365a = c4429ol;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final Object apply(Object obj) {
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        C4429ol c4429ol = this.f57365a;
        if (c4429ol.f57454b.hasPermission(c4429ol.f57453a, "android.permission.READ_PHONE_STATE")) {
            return Boolean.valueOf(telephonyManager.isNetworkRoaming());
        }
        return null;
    }
}
