package retrofit2.adapter.rxjava2;

import ii.k;
import ii.r;
import io.reactivex.exceptions.CompositeException;
import mi.b;
import ni.a;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: classes7.dex */
final class CallExecuteObservable<T> extends k<Response<T>> {
    private final Call<T> originalCall;

    public static final class CallDisposable implements b {
        private final Call<?> call;
        private volatile boolean disposed;

        @Override // mi.b
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.disposed;
        }

        public CallDisposable(Call<?> call) {
            this.call = call;
        }
    }

    @Override // ii.k
    public void subscribeActual(r<? super Response<T>> rVar) {
        boolean z10;
        Call<T> callClone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        rVar.onSubscribe(callDisposable);
        try {
            Response<T> responseExecute = callClone.execute();
            if (!callDisposable.isDisposed()) {
                rVar.onNext(responseExecute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                rVar.onComplete();
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                a.b(th);
                if (z10) {
                    ej.a.s(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    rVar.onError(th);
                } catch (Throwable th3) {
                    a.b(th3);
                    ej.a.s(new CompositeException(th, th3));
                }
            }
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
    }

    public CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }
}
