package retrofit2.adapter.rxjava2;

import ej.a;
import ii.k;
import ii.r;
import io.reactivex.exceptions.CompositeException;
import mi.b;
import retrofit2.Response;

/* JADX INFO: loaded from: classes.dex */
final class BodyObservable<T> extends k<T> {
    private final k<Response<T>> upstream;

    public static class BodyObserver<R> implements r<Response<R>> {
        private final r<? super R> observer;
        private boolean terminated;

        @Override // ii.r
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (!this.terminated) {
                this.observer.onError(th2);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th2);
            a.s(assertionError);
        }

        @Override // ii.r
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th2) {
                ni.a.b(th2);
                a.s(new CompositeException(httpException, th2));
            }
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            this.observer.onSubscribe(bVar);
        }

        public BodyObserver(r<? super R> rVar) {
            this.observer = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super T> rVar) {
        this.upstream.subscribe(new BodyObserver(rVar));
    }

    public BodyObservable(k<Response<T>> kVar) {
        this.upstream = kVar;
    }
}
