package xi;

import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BlockingObservableMostRecent.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c<T> implements Iterable<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii.p<T> f74516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f74517c;

    /* JADX INFO: compiled from: BlockingObservableMostRecent.java */
    public static final class a<T> extends dj.b<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile Object f74518c;

        /* JADX INFO: renamed from: xi.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BlockingObservableMostRecent.java */
        public final class C0790a implements Iterator<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f74519b;

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.f74519b == null) {
                        this.f74519b = a.this.f74518c;
                    }
                    if (NotificationLite.isComplete(this.f74519b)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.f74519b)) {
                        throw ExceptionHelper.d(NotificationLite.getError(this.f74519b));
                    }
                    T t10 = (T) NotificationLite.getValue(this.f74519b);
                    this.f74519b = null;
                    return t10;
                } catch (Throwable th2) {
                    this.f74519b = null;
                    throw th2;
                }
            }

            public C0790a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = a.this.f74518c;
                this.f74519b = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public a<T>.C0790a b() {
            return new C0790a();
        }

        public a(T t10) {
            this.f74518c = NotificationLite.next(t10);
        }

        @Override // ii.r
        public void onComplete() {
            this.f74518c = NotificationLite.complete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74518c = NotificationLite.error(th2);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74518c = NotificationLite.next(t10);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        a aVar = new a(this.f74517c);
        this.f74516b.subscribe(aVar);
        return aVar.b();
    }

    public c(ii.p<T> pVar, T t10) {
        this.f74516b = pVar;
        this.f74517c = t10;
    }
}
