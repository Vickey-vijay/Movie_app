package retrofit2.adapter.rxjava2;

import ej.a;
import ii.k;
import ii.r;
import io.reactivex.exceptions.CompositeException;
import mi.b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
final class CallEnqueueObservable<T> extends k<Response<T>> {
    private final Call<T> originalCall;

    public static final class CallCallback<T> implements b, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final r<? super Response<T>> observer;
        public boolean terminated = false;

        @Override // mi.b
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<T> call, Response<T> response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th2) {
                if (this.terminated) {
                    a.s(th2);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th2);
                } catch (Throwable th3) {
                    ni.a.b(th3);
                    a.s(new CompositeException(th2, th3));
                }
            }
        }

        public CallCallback(Call<?> call, r<? super Response<T>> rVar) {
            this.call = call;
            this.observer = rVar;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<T> call, Throwable th2) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th2);
            } catch (Throwable th3) {
                ni.a.b(th3);
                a.s(new CompositeException(th2, th3));
            }
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super Response<T>> rVar) {
        Call<T> callClone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(callClone, rVar);
        rVar.onSubscribe(callCallback);
        callClone.enqueue(callCallback);
    }

    public CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }
}
