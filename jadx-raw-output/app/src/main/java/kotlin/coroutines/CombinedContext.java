package kotlin.coroutines;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import java.io.Serializable;
import kotlin.coroutines.CombinedContext;
import kotlin.jvm.internal.Ref$IntRef;
import mj.r;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CombinedContext implements d, Serializable {
    private final d.b element;
    private final d left;

    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    public static final class Serialized implements Serializable {
        public static final a Companion = new a(null);
        private static final long serialVersionUID = 0;
        private final d[] elements;

        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(i iVar) {
                this();
            }
        }

        public Serialized(d[] dVarArr) {
            p.j(dVarArr, "elements");
            this.elements = dVarArr;
        }

        private final Object readResolve() {
            d[] dVarArr = this.elements;
            d dVarPlus = EmptyCoroutineContext.INSTANCE;
            for (d dVar : dVarArr) {
                dVarPlus = dVarPlus.plus(dVar);
            }
            return dVarPlus;
        }

        public final d[] getElements() {
            return this.elements;
        }
    }

    public final int n() {
        int i10 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            d dVar = combinedContext.left;
            combinedContext = dVar instanceof CombinedContext ? (CombinedContext) dVar : null;
            if (combinedContext == null) {
                return i10;
            }
            i10++;
        }
    }

    public CombinedContext(d dVar, d.b bVar) {
        p.j(dVar, "left");
        p.j(bVar, "element");
        this.left = dVar;
        this.element = bVar;
    }

    public static final String p(String str, d.b bVar) {
        p.j(str, "acc");
        p.j(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    public static final r q(d[] dVarArr, Ref$IntRef ref$IntRef, r rVar, d.b bVar) {
        p.j(rVar, "<unused var>");
        p.j(bVar, "element");
        int i10 = ref$IntRef.element;
        ref$IntRef.element = i10 + 1;
        dVarArr[i10] = bVar;
        return r.f64562a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.n() != n() || !combinedContext.j(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r10, bk.p<? super R, ? super d.b, ? extends R> pVar) {
        p.j(pVar, "operation");
        return pVar.mo1invoke((Object) this.left.fold(r10, pVar), this.element);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        p.j(cVar, C3426d4.i.W);
        CombinedContext combinedContext = this;
        while (true) {
            E e10 = (E) combinedContext.element.get(cVar);
            if (e10 != null) {
                return e10;
            }
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                return (E) dVar.get(cVar);
            }
            combinedContext = (CombinedContext) dVar;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    public final boolean j(CombinedContext combinedContext) {
        while (h(combinedContext.element)) {
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                p.h(dVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return h((d.b) dVar);
            }
            combinedContext = (CombinedContext) dVar;
        }
        return false;
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        p.j(cVar, C3426d4.i.W);
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        d dVarMinusKey = this.left.minusKey(cVar);
        if (dVarMinusKey == this.left) {
            return this;
        }
        return dVarMinusKey == EmptyCoroutineContext.INSTANCE ? this.element : new CombinedContext(dVarMinusKey, this.element);
    }

    public String toString() {
        return '[' + ((String) fold("", new bk.p() { // from class: rj.b
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return CombinedContext.p((String) obj, (kotlin.coroutines.d.b) obj2);
            }
        })) + ']';
    }

    private final Object writeReplace() {
        boolean z10;
        int iN = n();
        final d[] dVarArr = new d[iN];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(r.f64562a, new bk.p() { // from class: rj.a
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return CombinedContext.q(dVarArr, ref$IntRef, (r) obj, (kotlin.coroutines.d.b) obj2);
            }
        });
        if (ref$IntRef.element == iN) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new Serialized(dVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean h(d.b bVar) {
        return p.e(get(bVar.getKey()), bVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.a.b(this, dVar);
    }
}
