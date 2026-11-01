package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: BranchInterceptor.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a<IN, OUT> extends l<IN, OUT> {
    public abstract String a(IN in2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in2) throws Exception {
        new m(bVar);
        String strA = a(in2);
        l.a aVar = a().get(strA);
        if (aVar == null) {
            throw new IllegalArgumentException("can not found branch, branch name is：".concat(String.valueOf(strA)));
        }
        List<h> list = aVar.f10524a;
        Object objA = c.a(list, ((i) bVar).f10517a, this).a(in2);
        return !l.a(list) ? objA : bVar.a(objA);
    }
}
