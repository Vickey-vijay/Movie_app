package xi;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: BlockingObservableLatest.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii.p<T> f74498b;

    /* JADX INFO: compiled from: BlockingObservableLatest.java */
    public static final class a<T> extends dj.c<ii.j<T>> implements Iterator<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ii.j<T> f74499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Semaphore f74500d = new Semaphore(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<ii.j<T>> f74501e = new AtomicReference<>();

        @Override // ii.r
        public void onComplete() {
        }

        @Override // ii.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(ii.j<T> jVar) {
            if (this.f74501e.getAndSet(jVar) == null) {
                this.f74500d.release();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            ii.j<T> jVar = this.f74499c;
            if (jVar != null && jVar.g()) {
                throw ExceptionHelper.d(this.f74499c.d());
            }
            if (this.f74499c == null) {
                try {
                    bj.c.b();
                    this.f74500d.acquire();
                    ii.j<T> andSet = this.f74501e.getAndSet(null);
                    this.f74499c = andSet;
                    if (andSet.g()) {
                        throw ExceptionHelper.d(andSet.d());
                    }
                } catch (InterruptedException e10) {
                    dispose();
                    this.f74499c = ii.j.b(e10);
                    throw ExceptionHelper.d(e10);
                }
            }
            return this.f74499c.h();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T tE = this.f74499c.e();
                this.f74499c = null;
                return tE;
            }
            throw new NoSuchElementException();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            ej.a.s(th2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a();
        ii.k.wrap(this.f74498b).materialize().subscribe(aVar);
        return aVar;
    }

    public b(ii.p<T> pVar) {
        this.f74498b = pVar;
    }
}
