package jk;

import ck.p;

/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(c<T> cVar, Object obj) {
        p.j(cVar, "<this>");
        if (cVar.e(obj)) {
            p.h(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + cVar.d());
    }
}
