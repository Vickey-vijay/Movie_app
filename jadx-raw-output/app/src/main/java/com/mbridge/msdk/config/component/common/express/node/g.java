package com.mbridge.msdk.config.component.common.express.node;

import java.util.HashMap;

/* JADX INFO: compiled from: MapKeyValueNode.java */
/* JADX INFO: loaded from: classes11.dex */
public class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f33023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f33024b;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f33023a.a(dVar, eVar, aVar);
        Object objA2 = this.f33024b.a(dVar, eVar, aVar);
        HashMap map = new HashMap();
        map.put(objA, objA2);
        return map;
    }

    public g(d dVar, d dVar2) {
        this.f33023a = dVar;
        this.f33024b = dVar2;
    }
}
