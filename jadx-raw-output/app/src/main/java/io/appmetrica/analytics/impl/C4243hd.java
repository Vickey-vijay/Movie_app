package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4243hd extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f56901b;

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(Q5 q10) {
        if (!this.f55865a.f56218t.c()) {
            return false;
        }
        ArrayList<Pair> arrayList = this.f56901b;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            return false;
        }
        for (Pair pair : arrayList) {
            ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.component1();
            Uc uc2 = (Uc) pair.component2();
            if (moduleServiceEventHandler.handle(new Xc(uc2.f55977b, uc2.f55976a, new Wc(uc2.f55979d, uc2.f55978c, q10)), q10)) {
                return true;
            }
        }
        return false;
    }

    public C4243hd(Y4 y10) {
        super(y10);
        String strB = y10.b().b();
        strB = strB == null ? "empty" : strB;
        ck.w wVar = ck.w.f6066a;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strB}, 1));
        LinkedHashMap linkedHashMapA = C4418oa.k().o().a(strB);
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            arrayList.add(mj.h.a(entry.getValue(), new Uc(y10, (String) entry.getKey())));
        }
        this.f56901b = arrayList;
    }
}
