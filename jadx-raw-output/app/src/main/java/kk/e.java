package kk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class e<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<T> f62835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bk.l<T, Boolean> f62837c;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<T> f62838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62839c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f62840d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e<T> f62841e;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(e<T> eVar) {
            this.f62841e = eVar;
            this.f62838b = eVar.f62835a.iterator();
        }

        public final void a() {
            while (this.f62838b.hasNext()) {
                T next = this.f62838b.next();
                if (((Boolean) this.f62841e.f62837c.invoke(next)).booleanValue() == this.f62841e.f62836b) {
                    this.f62840d = next;
                    this.f62839c = 1;
                    return;
                }
            }
            this.f62839c = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f62839c == -1) {
                a();
            }
            return this.f62839c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f62839c == -1) {
                a();
            }
            if (this.f62839c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f62840d;
            this.f62840d = null;
            this.f62839c = -1;
            return t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(i<? extends T> iVar, boolean z10, bk.l<? super T, Boolean> lVar) {
        ck.p.j(iVar, "sequence");
        ck.p.j(lVar, "predicate");
        this.f62835a = iVar;
        this.f62836b = z10;
        this.f62837c = lVar;
    }

    @Override // kk.i
    public Iterator<T> iterator() {
        return new a(this);
    }
}
