package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4545td {
    public static ArrayList a() {
        C4114cd c4114cd;
        List<String> listA = C4105c4.l().f56448m.a();
        ArrayList arrayList = new ArrayList(nj.t.v(listA, 10));
        for (String str : listA) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleClientEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c4114cd = new C4114cd(str, false);
            } else {
                C4105c4.l().m().f56265b.add((ModuleClientEntryPoint) objLoadAndInstantiateClassWithDefaultConstructor);
                c4114cd = new C4114cd(str, true);
            }
            arrayList.add(c4114cd);
        }
        return arrayList;
    }
}
