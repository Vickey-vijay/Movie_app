package kotlinx.coroutines.flow;

import bk.p;
import ck.n;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.SafeCollector;
import mj.r;
import qk.c;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> implements c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f63094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f63095c;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @d(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {112, 116}, m = "collect")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(rj.c cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(p pVar, c cVar) {
        this.f63094b = pVar;
        this.f63095c = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qk.c
    public Object collect(qk.d<? super T> dVar, rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Throwable th2;
        SafeCollector safeCollector;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1<T> flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        qk.d<? super T> dVar2;
        c cVar2;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            SafeCollector safeCollector2 = new SafeCollector(dVar, anonymousClass1.getContext());
            try {
                p pVar = this.f63094b;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dVar;
                anonymousClass1.L$2 = safeCollector2;
                anonymousClass1.label = 1;
                n.c(6);
                Object objMo1invoke = pVar.mo1invoke(safeCollector2, anonymousClass1);
                n.c(7);
                if (objMo1invoke == objF) {
                    return objF;
                }
                flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                dVar2 = dVar;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                cVar2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f63095c;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
                if (cVar2.collect(dVar2, anonymousClass1) == objF) {
                    return objF;
                }
            } catch (Throwable th3) {
                th2 = th3;
                safeCollector = safeCollector2;
                safeCollector.releaseIntercepted();
                throw th2;
            }
        } else if (i11 == 1) {
            safeCollector = (SafeCollector) anonymousClass1.L$2;
            dVar2 = (qk.d) anonymousClass1.L$1;
            flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) anonymousClass1.L$0;
            try {
                kotlin.c.b(obj);
                safeCollector.releaseIntercepted();
                cVar2 = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f63095c;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
                if (cVar2.collect(dVar2, anonymousClass1) == objF) {
                    return objF;
                }
            } catch (Throwable th4) {
                th2 = th4;
                safeCollector.releaseIntercepted();
                throw th2;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return r.f64562a;
    }
}
