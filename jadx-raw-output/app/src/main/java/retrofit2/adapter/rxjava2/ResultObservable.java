package retrofit2.adapter.rxjava2;

import ii.k;
import ii.r;
import io.reactivex.exceptions.CompositeException;
import mi.b;
import ni.a;
import retrofit2.Response;

/* JADX INFO: loaded from: classes8.dex */
final class ResultObservable<T> extends k<Result<T>> {
    private final k<Response<T>> upstream;

    public static class ResultObserver<R> implements r<Response<R>> {
        private final r<? super Result<R>> observer;

        @Override // ii.r
        public void onComplete() {
            this.observer.onComplete();
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            try {
                this.observer.onNext(Result.error(th2));
                this.observer.onComplete();
            } catch (Throwable th3) {
                try {
                    this.observer.onError(th3);
                } catch (Throwable th4) {
                    a.b(th4);
                    ej.a.s(new CompositeException(th3, th4));
                }
            }
        }

        @Override // ii.r
        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }

        @Override // ii.r
        public void onSubscribe(b bVar) {
            this.observer.onSubscribe(bVar);
        }

        public ResultObserver(r<? super Result<R>> rVar) {
            this.observer = rVar;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super Result<T>> rVar) {
        this.upstream.subscribe(new ResultObserver(rVar));
    }

    public ResultObservable(k<Response<T>> kVar) {
        this.upstream = kVar;
    }
}
