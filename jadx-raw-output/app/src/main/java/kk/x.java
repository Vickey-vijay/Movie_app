package kk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class x<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f62878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.l<T, Boolean> f62879b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f62880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62881c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f62882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x<T> f62883e;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(x<T> xVar) {
            this.f62883e = xVar;
            this.f62880b = xVar.f62878a.iterator();
        }

        public final void a() {
            if (this.f62880b.hasNext()) {
                T next = this.f62880b.next();
                if (((Boolean) this.f62883e.f62879b.invoke(next)).booleanValue()) {
                    this.f62881c = 1;
                    this.f62882d = next;
                    return;
                }
            }
            this.f62881c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f62881c == -1) {
                a();
            }
            return this.f62881c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f62881c == -1) {
                a();
            }
            if (this.f62881c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f62882d;
            this.f62882d = null;
            this.f62881c = -1;
            return t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(i<? extends T> iVar, bk.l<? super T, Boolean> lVar) {
        ck.p.j(iVar, "sequence");
        ck.p.j(lVar, "predicate");
        this.f62878a = iVar;
        this.f62879b = lVar;
    }

    @Override // kk.i
    public Iterator<T> iterator() {
        return new a(this);
    }
}
