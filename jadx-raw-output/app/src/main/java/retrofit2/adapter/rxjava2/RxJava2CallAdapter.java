package retrofit2.adapter.rxjava2;

import ii.k;
import ii.s;
import io.reactivex.BackpressureStrategy;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;

/* JADX INFO: loaded from: classes.dex */
final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    private final s scheduler;

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052 A[RETURN] */
    @Override // retrofit2.CallAdapter
    public Object adapt(Call<R> call) {
        k bodyObservable;
        s sVar;
        k callEnqueueObservable = this.isAsync ? new CallEnqueueObservable(call) : new CallExecuteObservable(call);
        if (!this.isResult) {
            if (this.isBody) {
                bodyObservable = new BodyObservable(callEnqueueObservable);
            }
            sVar = this.scheduler;
            if (sVar != null) {
                callEnqueueObservable = callEnqueueObservable.subscribeOn(sVar);
            }
            if (this.isFlowable) {
                return callEnqueueObservable.toFlowable(BackpressureStrategy.LATEST);
            }
            if (this.isSingle) {
                return callEnqueueObservable.singleOrError();
            }
            if (this.isMaybe) {
                return callEnqueueObservable.singleElement();
            }
            if (this.isCompletable) {
                return callEnqueueObservable.ignoreElements();
            }
            return callEnqueueObservable;
        }
        bodyObservable = new ResultObservable(callEnqueueObservable);
        callEnqueueObservable = bodyObservable;
        sVar = this.scheduler;
        if (sVar != null) {
            callEnqueueObservable = callEnqueueObservable.subscribeOn(sVar);
        }
        if (this.isFlowable) {
            return callEnqueueObservable.toFlowable(BackpressureStrategy.LATEST);
        }
        if (this.isSingle) {
            return callEnqueueObservable.singleOrError();
        }
        if (this.isMaybe) {
            return callEnqueueObservable.singleElement();
        }
        if (this.isCompletable) {
            return callEnqueueObservable.ignoreElements();
        }
        return callEnqueueObservable;
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.responseType;
    }

    public RxJava2CallAdapter(Type type, s sVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.responseType = type;
        this.scheduler = sVar;
        this.isAsync = z10;
        this.isResult = z11;
        this.isBody = z12;
        this.isFlowable = z13;
        this.isSingle = z14;
        this.isMaybe = z15;
        this.isCompletable = z16;
    }
}
