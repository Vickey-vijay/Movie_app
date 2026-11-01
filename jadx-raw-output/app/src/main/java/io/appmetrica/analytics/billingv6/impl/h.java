package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import mj.r;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f54555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f54556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f54557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(LinkedHashMap linkedHashMap, Map map, i iVar) {
        super(0);
        this.f54555a = linkedHashMap;
        this.f54556b = map;
        this.f54557c = iVar;
    }

    @Override // bk.a
    public final Object invoke() {
        Map map = this.f54555a;
        Map map2 = this.f54556b;
        i iVar = this.f54557c;
        m.a(map, map2, iVar.f54561d, iVar.f54560c.getBillingInfoManager());
        return r.f64562a;
    }
}
