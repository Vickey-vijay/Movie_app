package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class F7 implements ServiceComponentsInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55227a = nj.s.n("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Tc tc2 = C4418oa.I.f57421s;
        List list = this.f55227a;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4487r5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C4487r5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C4487r5[] c4487r5Arr = (C4487r5[]) array;
        Sc[] scArr = (Sc[]) Arrays.copyOf(c4487r5Arr, c4487r5Arr.length);
        synchronized (tc2) {
            nj.x.D(tc2.f55920a, scArr);
        }
        C4418oa.I.f57421s.a(new Ve(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
