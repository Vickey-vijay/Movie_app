package kotlin.sequences;

import bk.p;
import java.util.Iterator;
import kk.i;
import kk.k;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", f = "_Sequences.kt", l = {2423, 2427}, m = "invokeSuspend")
public final class SequencesKt___SequencesKt$runningFold$1<R> extends RestrictedSuspendLambda implements p<k<? super R>, c<? super r>, Object> {
    public final /* synthetic */ R $initial;
    public final /* synthetic */ p<R, T, R> $operation;
    public final /* synthetic */ i<T> $this_runningFold;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SequencesKt___SequencesKt$runningFold$1(R r10, i<? extends T> iVar, p<? super R, ? super T, ? extends R> pVar, c<? super SequencesKt___SequencesKt$runningFold$1> cVar) {
        super(2, cVar);
        this.$initial = r10;
        this.$this_runningFold = iVar;
        this.$operation = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        SequencesKt___SequencesKt$runningFold$1 sequencesKt___SequencesKt$runningFold$1 = new SequencesKt___SequencesKt$runningFold$1(this.$initial, this.$this_runningFold, this.$operation, cVar);
        sequencesKt___SequencesKt$runningFold$1.L$0 = obj;
        return sequencesKt___SequencesKt$runningFold$1;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Object mo1invoke(k<? super R> kVar, c<? super r> cVar) {
        return ((SequencesKt___SequencesKt$runningFold$1) create(kVar, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:15:0x004d->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        k kVar;
        Object objMo1invoke;
        k kVar2;
        Iterator it;
        Object objF = a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = (Iterator) this.L$2;
                    Object obj2 = this.L$1;
                    kVar2 = (k) this.L$0;
                    kotlin.c.b(obj);
                    objMo1invoke = obj2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kVar = (k) this.L$0;
                kotlin.c.b(obj);
            }
            while (it.hasNext()) {
                objMo1invoke = this.$operation.mo1invoke((R) objMo1invoke, (T) it.next());
                this.L$0 = kVar2;
                this.L$1 = objMo1invoke;
                this.L$2 = it;
                this.label = 2;
                if (kVar2.a(objMo1invoke, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
        kotlin.c.b(obj);
        kVar = (k) this.L$0;
        R r10 = this.$initial;
        this.L$0 = kVar;
        this.label = 1;
        if (kVar.a(r10, this) == objF) {
            return objF;
        }
        objMo1invoke = this.$initial;
        kVar2 = kVar;
        it = this.$this_runningFold.iterator();
        while (it.hasNext()) {
            objMo1invoke = this.$operation.mo1invoke((R) objMo1invoke, (T) it.next());
            this.L$0 = kVar2;
            this.L$1 = objMo1invoke;
            this.L$2 = it;
            this.label = 2;
            if (kVar2.a(objMo1invoke, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
