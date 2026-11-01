package kk;

import java.util.Iterator;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class k<T> {
    public abstract Object a(T t10, rj.c<? super mj.r> cVar);

    public abstract Object b(Iterator<? extends T> it, rj.c<? super mj.r> cVar);

    public final Object e(i<? extends T> iVar, rj.c<? super mj.r> cVar) {
        Object objB = b(iVar.iterator(), cVar);
        if (objB == sj.a.f()) {
            return objB;
        }
        return mj.r.f64562a;
    }
}
