package nk;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e {
    public static final <T> Object b(p0<? extends T>[] p0VarArr, rj.c<? super List<? extends T>> cVar) {
        return p0VarArr.length == 0 ? nj.s.k() : new d(p0VarArr).c(cVar);
    }

    public static final <T> Object a(Collection<? extends p0<? extends T>> collection, rj.c<? super List<? extends T>> cVar) {
        if (collection.isEmpty()) {
            return nj.s.k();
        }
        return new d((p0[]) collection.toArray(new p0[0])).c(cVar);
    }
}
