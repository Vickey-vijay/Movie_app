package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nj.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModulePreferences f54853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f54854b = new A();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54855c = "request_state";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f54856d = kotlin.collections.a.B(a());

    public final LinkedHashMap a() {
        List<z> model = this.f54854b.toModel(this.f54853a.getString(this.f54855c, null));
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(l0.f(nj.t.v(model, 10)), 16));
        for (Object obj : model) {
            linkedHashMap.put(((z) obj).f54925a, obj);
        }
        return linkedHashMap;
    }

    public B(ModulePreferences modulePreferences) {
        this.f54853a = modulePreferences;
    }
}
