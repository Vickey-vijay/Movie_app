package bl;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u<E, C extends Collection<? extends E>, B> extends t<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(xk.b<E> bVar) {
        super(bVar, null);
        ck.p.j(bVar, "element");
    }

    @Override // bl.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Iterator<E> d(C c10) {
        ck.p.j(c10, "<this>");
        return c10.iterator();
    }

    @Override // bl.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public int e(C c10) {
        ck.p.j(c10, "<this>");
        return c10.size();
    }
}
