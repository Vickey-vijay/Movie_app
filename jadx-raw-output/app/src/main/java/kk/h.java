package kk;

import java.util.Iterator;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class h<T1, T2, V> implements i<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T1> f62854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<T2> f62855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.p<T1, T2, V> f62856c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<V>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T1> f62857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<T2> f62858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ h<T1, T2, V> f62859d;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(h<T1, T2, V> hVar) {
            this.f62859d = hVar;
            this.f62857b = hVar.f62854a.iterator();
            this.f62858c = hVar.f62855b.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f62857b.hasNext() && this.f62858c.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return (V) this.f62859d.f62856c.mo1invoke(this.f62857b.next(), this.f62858c.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(i<? extends T1> iVar, i<? extends T2> iVar2, bk.p<? super T1, ? super T2, ? extends V> pVar) {
        ck.p.j(iVar, "sequence1");
        ck.p.j(iVar2, "sequence2");
        ck.p.j(pVar, "transform");
        this.f62854a = iVar;
        this.f62855b = iVar2;
        this.f62856c = pVar;
    }

    @Override // kk.i
    public Iterator<V> iterator() {
        return new a(this);
    }
}
