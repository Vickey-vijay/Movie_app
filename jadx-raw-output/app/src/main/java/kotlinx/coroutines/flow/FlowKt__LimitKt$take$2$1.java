package kotlinx.coroutines.flow;

import kotlin.jvm.internal.Ref$IntRef;
import mj.r;
import qk.d;
import rj.c;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$IntRef f63107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f63108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d<T> f63109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f63110e;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(Ref$IntRef ref$IntRef, int i10, d<? super T> dVar, Object obj) {
        this.f63107b = ref$IntRef;
        this.f63108c = i10;
        this.f63109d = dVar;
        this.f63110e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.d
    public final Object emit(T t10, c<? super r> cVar) throws Throwable {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (cVar instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) cVar;
            int i10 = flowKt__LimitKt$take$2$1$emit$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, cVar);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, cVar);
        }
        Object obj = flowKt__LimitKt$take$2$1$emit$1.result;
        Object objF = sj.a.f();
        int i11 = flowKt__LimitKt$take$2$1$emit$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.c.b(obj);
                return r.f64562a;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return r.f64562a;
        }
        kotlin.c.b(obj);
        Ref$IntRef ref$IntRef = this.f63107b;
        int i12 = ref$IntRef.element + 1;
        ref$IntRef.element = i12;
        if (i12 < this.f63108c) {
            d<T> dVar = this.f63109d;
            flowKt__LimitKt$take$2$1$emit$1.label = 1;
            if (dVar.emit(t10, flowKt__LimitKt$take$2$1$emit$1) == objF) {
                return objF;
            }
            return r.f64562a;
        }
        d<T> dVar2 = this.f63109d;
        Object obj2 = this.f63110e;
        flowKt__LimitKt$take$2$1$emit$1.label = 2;
        if (FlowKt__LimitKt.c(dVar2, t10, obj2, flowKt__LimitKt$take$2$1$emit$1) == objF) {
            return objF;
        }
        return r.f64562a;
    }
}
