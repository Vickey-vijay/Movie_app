package kotlin.sequences;

import bk.l;
import ck.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kk.c;
import kk.e;
import kk.f;
import kk.h;
import kk.i;
import kk.r;
import kk.s;
import kk.x;
import kk.y;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import lk.n;
import nj.p0;
import nj.q0;
import nj.w;

/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
public class SequencesKt___SequencesKt extends s {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.kt */
    public static final class a<T> implements Iterable<T>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f63005b;

        public a(i iVar) {
            this.f63005b = iVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f63005b.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Sequences.kt */
    public static final class b<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f63006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super T> f63007b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(i<? extends T> iVar, Comparator<? super T> comparator) {
            this.f63006a = iVar;
            this.f63007b = comparator;
        }

        @Override // kk.i
        public Iterator<T> iterator() {
            List listU = SequencesKt___SequencesKt.U(this.f63006a);
            w.B(listU, this.f63007b);
            return listU.iterator();
        }
    }

    public static final boolean C(Object obj) {
        return obj == null;
    }

    public static final <T> i<T> A(i<? extends T> iVar, l<? super T, Boolean> lVar) {
        p.j(iVar, "<this>");
        p.j(lVar, "predicate");
        return new e(iVar, false, lVar);
    }

    public static final <T> i<T> B(i<? extends T> iVar) {
        p.j(iVar, "<this>");
        i<T> iVarA = A(iVar, new l() { // from class: kk.u
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SequencesKt___SequencesKt.C(obj));
            }
        });
        p.h(iVarA, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return iVarA;
    }

    public static final <T> T D(i<? extends T> iVar) {
        p.j(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T, R> i<R> E(i<? extends T> iVar, l<? super T, ? extends Iterable<? extends R>> lVar) {
        p.j(iVar, "<this>");
        p.j(lVar, "transform");
        return new f(iVar, lVar, SequencesKt___SequencesKt$flatMap$1.INSTANCE);
    }

    public static final <T> int F(i<? extends T> iVar, T t10) {
        p.j(iVar, "<this>");
        int i10 = 0;
        for (T t11 : iVar) {
            if (i10 < 0) {
                nj.s.u();
            }
            if (p.e(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A G(i<? extends T> iVar, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) throws IOException {
        p.j(iVar, "<this>");
        p.j(a10, "buffer");
        p.j(charSequence, "separator");
        p.j(charSequence2, "prefix");
        p.j(charSequence3, "postfix");
        p.j(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iVar) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            n.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String H(i<? extends T> iVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        p.j(iVar, "<this>");
        p.j(charSequence, "separator");
        p.j(charSequence2, "prefix");
        p.j(charSequence3, "postfix");
        p.j(charSequence4, "truncated");
        return ((StringBuilder) G(iVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String I(i iVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return H(iVar, charSequence, charSequence5, charSequence6, i12, charSequence7, lVar);
    }

    public static final <T> T J(i<? extends T> iVar) {
        p.j(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T, R> i<R> K(i<? extends T> iVar, l<? super T, ? extends R> lVar) {
        p.j(iVar, "<this>");
        p.j(lVar, "transform");
        return new y(iVar, lVar);
    }

    public static final <T, R> i<R> L(i<? extends T> iVar, l<? super T, ? extends R> lVar) {
        p.j(iVar, "<this>");
        p.j(lVar, "transform");
        return B(new y(iVar, lVar));
    }

    public static final <T> T M(i<? extends T> iVar, Comparator<? super T> comparator) {
        p.j(iVar, "<this>");
        p.j(comparator, "comparator");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> i<T> N(i<? extends T> iVar, i<? extends T> iVar2) {
        p.j(iVar, "<this>");
        p.j(iVar2, "elements");
        return r.j(r.s(iVar, iVar2));
    }

    public static final <T, R> i<R> O(i<? extends T> iVar, R r10, bk.p<? super R, ? super T, ? extends R> pVar) {
        p.j(iVar, "<this>");
        p.j(pVar, "operation");
        return kk.l.b(new SequencesKt___SequencesKt$runningFold$1(r10, iVar, pVar, null));
    }

    public static final <T> i<T> P(i<? extends T> iVar, Comparator<? super T> comparator) {
        p.j(iVar, "<this>");
        p.j(comparator, "comparator");
        return new b(iVar, comparator);
    }

    public static final <T> i<T> Q(i<? extends T> iVar, int i10) {
        p.j(iVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return r.i();
            }
            return iVar instanceof c ? ((c) iVar).b(i10) : new kk.w(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> i<T> R(i<? extends T> iVar, l<? super T, Boolean> lVar) {
        p.j(iVar, "<this>");
        p.j(lVar, "predicate");
        return new x(iVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C S(i<? extends T> iVar, C c10) {
        p.j(iVar, "<this>");
        p.j(c10, "destination");
        Iterator<? extends T> it = iVar.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    public static final <T> List<T> T(i<? extends T> iVar) {
        p.j(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return nj.s.k();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return nj.r.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final <T> List<T> U(i<? extends T> iVar) {
        p.j(iVar, "<this>");
        return (List) S(iVar, new ArrayList());
    }

    public static final <T> Set<T> V(i<? extends T> iVar) {
        p.j(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        if (!it.hasNext()) {
            return q0.f();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return p0.d(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T, R> i<Pair<T, R>> W(i<? extends T> iVar, i<? extends R> iVar2) {
        p.j(iVar, "<this>");
        p.j(iVar2, "other");
        return new h(iVar, iVar2, new bk.p() { // from class: kk.t
            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public final Object mo1invoke(Object obj, Object obj2) {
                return SequencesKt___SequencesKt.X(obj, obj2);
            }
        });
    }

    public static final <T> Iterable<T> v(i<? extends T> iVar) {
        p.j(iVar, "<this>");
        return new a(iVar);
    }

    public static final <T> boolean w(i<? extends T> iVar, T t10) {
        p.j(iVar, "<this>");
        return F(iVar, t10) >= 0;
    }

    public static final <T> int x(i<? extends T> iVar) {
        p.j(iVar, "<this>");
        Iterator<? extends T> it = iVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                nj.s.t();
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> i<T> y(i<? extends T> iVar, int i10) {
        p.j(iVar, "<this>");
        if (i10 >= 0) {
            if (i10 == 0) {
                return iVar;
            }
            return iVar instanceof c ? ((c) iVar).a(i10) : new kk.b(iVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> i<T> z(i<? extends T> iVar, l<? super T, Boolean> lVar) {
        p.j(iVar, "<this>");
        p.j(lVar, "predicate");
        return new e(iVar, true, lVar);
    }

    public static final Pair X(Object obj, Object obj2) {
        return mj.h.a(obj, obj2);
    }
}
