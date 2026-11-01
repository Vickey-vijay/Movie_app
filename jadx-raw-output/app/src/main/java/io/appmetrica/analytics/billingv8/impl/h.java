package io.appmetrica.analytics.billingv8.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import mj.r;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f54608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f54609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f54610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f54608a = linkedHashMap;
        this.f54609b = map;
        this.f54610c = iVar;
    }

    @Override // bk.a
    public final Object invoke() {
        Map map = this.f54608a;
        Map map2 = this.f54609b;
        i iVar = this.f54610c;
        m.a(map, map2, iVar.f54614d, iVar.f54613c.getBillingInfoManager());
        return r.f64562a;
    }
}
