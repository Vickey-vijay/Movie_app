package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: AssignmentNode.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f33011d = q8.b.a(new Object[]{"=", "+=", "-=", "*=", "/=", "%="});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f33013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f33014c;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objA = this.f33013b.a(dVar, com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT, aVar);
        Object objA2 = this.f33014c.a(dVar, eVar, aVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(objA2);
        return dVar.a(objA, arrayList, this.f33012a, aVar);
    }

    public b(String str, d dVar, d dVar2) {
        this.f33012a = str;
        this.f33013b = dVar;
        this.f33014c = dVar2;
    }
}
