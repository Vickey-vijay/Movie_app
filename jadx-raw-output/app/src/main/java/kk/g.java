package kk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class g<T> implements i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk.a<T> f62849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.l<T, T> f62850b;

    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a implements Iterator<T>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f62851b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62852c = -2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g<T> f62853d;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(g<T> gVar) {
            this.f62853d = gVar;
        }

        public final void a() {
            T t10;
            if (this.f62852c == -2) {
                t10 = (T) this.f62853d.f62849a.invoke();
            } else {
                bk.l lVar = this.f62853d.f62850b;
                T t11 = this.f62851b;
                ck.p.g(t11);
                t10 = (T) lVar.invoke(t11);
            }
            this.f62851b = t10;
            this.f62852c = t10 == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f62852c < 0) {
                a();
            }
            return this.f62852c == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f62852c < 0) {
                a();
            }
            if (this.f62852c == 0) {
                throw new NoSuchElementException();
            }
            T t10 = this.f62851b;
            ck.p.h(t10, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f62852c = -1;
            return t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(bk.a<? extends T> aVar, bk.l<? super T, ? extends T> lVar) {
        ck.p.j(aVar, "getInitialValue");
        ck.p.j(lVar, "getNextValue");
        this.f62849a = aVar;
        this.f62850b = lVar;
    }

    @Override // kk.i
    public Iterator<T> iterator() {
        return new a(this);
    }
}
