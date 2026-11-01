package com.mbridge.msdk.config.component.common.express.node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: FunctionCallNode.java */
/* JADX INFO: loaded from: classes11.dex */
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f33018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<d> f33020c;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f33020c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Arrays.asList("map", "filter", "sorted").contains(this.f33019b)) {
            arrayList.add(new com.mbridge.msdk.config.component.common.express.operator.parts.b(dVar, eVar, this.f33020c.get(0), aVar));
            for (int i10 = 1; i10 < this.f33020c.size(); i10++) {
                arrayList.add(this.f33020c.get(i10).a(dVar, eVar, aVar));
            }
        } else {
            Iterator<d> it = this.f33020c.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(dVar, eVar, aVar));
            }
        }
        return dVar.a(this.f33018a.a(dVar, eVar, aVar), arrayList, this.f33019b, aVar);
    }

    public e(d dVar, String str, List<d> list) {
        this.f33018a = dVar;
        this.f33019b = str;
        this.f33020c = list;
    }
}
