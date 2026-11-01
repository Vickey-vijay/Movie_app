package xi;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: BlockingObservableNext.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii.p<T> f74535b;

    /* JADX INFO: compiled from: BlockingObservableNext.java */
    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b<T> f74536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ii.p<T> f74537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f74538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74539e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74540f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Throwable f74541g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74542h;

        public final boolean a() {
            if (!this.f74542h) {
                this.f74542h = true;
                this.f74536b.c();
                new y0(this.f74537c).subscribe(this.f74536b);
            }
            try {
                ii.j<T> jVarD = this.f74536b.d();
                if (jVarD.h()) {
                    this.f74540f = false;
                    this.f74538d = jVarD.e();
                    return true;
                }
                this.f74539e = false;
                if (jVarD.f()) {
                    return false;
                }
                Throwable thD = jVarD.d();
                this.f74541g = thD;
                throw ExceptionHelper.d(thD);
            } catch (InterruptedException e10) {
                this.f74536b.dispose();
                this.f74541g = e10;
                throw ExceptionHelper.d(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th2 = this.f74541g;
            if (th2 != null) {
                throw ExceptionHelper.d(th2);
            }
            if (this.f74539e) {
                return !this.f74540f || a();
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th2 = this.f74541g;
            if (th2 != null) {
                throw ExceptionHelper.d(th2);
            }
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            this.f74540f = true;
            return this.f74538d;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }

        public a(ii.p<T> pVar, b<T> bVar) {
            this.f74537c = pVar;
            this.f74536b = bVar;
        }
    }

    /* JADX INFO: compiled from: BlockingObservableNext.java */
    public static final class b<T> extends dj.c<ii.j<T>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BlockingQueue<ii.j<T>> f74543c = new ArrayBlockingQueue(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f74544d = new AtomicInteger();

        @Override // ii.r
        public void onComplete() {
        }

        @Override // ii.r
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(ii.j<T> jVar) {
            if (this.f74544d.getAndSet(0) == 1 || !jVar.h()) {
                while (!this.f74543c.offer(jVar)) {
                    ii.j<T> jVarPoll = this.f74543c.poll();
                    if (jVarPoll != null && !jVarPoll.h()) {
                        jVar = jVarPoll;
                    }
                }
            }
        }

        public void c() {
            this.f74544d.set(1);
        }

        public ii.j<T> d() throws InterruptedException {
            c();
            bj.c.b();
            return this.f74543c.take();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            ej.a.s(th2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f74535b, new b());
    }

    public d(ii.p<T> pVar) {
        this.f74535b = pVar;
    }
}
