package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public abstract class P4 {
    public static final nk.l0 a(nk.l0 l0Var) {
        ck.p.j(l0Var, "<this>");
        return kotlinx.coroutines.d.a(l0Var.getCoroutineContext().plus(nk.t1.a((kotlinx.coroutines.g) l0Var.getCoroutineContext().get(kotlinx.coroutines.g.E8))));
    }

    public static final nk.l0 a(nk.l0 l0Var, nk.i0 i0Var) {
        ck.p.j(l0Var, "<this>");
        kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) l0Var.getCoroutineContext().get(kotlinx.coroutines.g.E8);
        nk.x xVarA = gVar != null ? nk.j2.a(gVar) : nk.j2.b(null, 1, null);
        nk.l0 l0VarA = kotlinx.coroutines.d.a(xVarA.plus(nk.w0.c().n()).plus(i0Var));
        return l0VarA == null ? kotlinx.coroutines.d.a(xVarA.plus(nk.w0.c().n())) : l0VarA;
    }

    public static final kotlinx.coroutines.g a(nk.l0 l0Var, bk.p pVar) {
        ck.p.j(l0Var, "<this>");
        ck.p.j(pVar, "block");
        return nk.j.d(l0Var, nk.w0.c(), null, pVar, 2, null);
    }

    public static final void a(qk.k kVar, nk.l0 l0Var, AbstractC2753bc abstractC2753bc) {
        ck.p.j(kVar, "<this>");
        ck.p.j(l0Var, "scope");
        nk.j.d(l0Var, null, null, new O4(kVar, abstractC2753bc, null), 3, null);
    }

    public static final void a(kotlinx.coroutines.c cVar, Object obj) {
        ck.p.j(cVar, "<this>");
        if (cVar.isActive()) {
            try {
                cVar.resumeWith(Result.m3458constructorimpl(obj));
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final void a(List list) {
        ck.p.j(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.g.a.a((kotlinx.coroutines.g) it.next(), null, 1, null);
        }
        list.clear();
    }
}
