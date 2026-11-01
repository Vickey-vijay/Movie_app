package androidx.activity;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1, reason: invalid class name */
    /* JADX INFO: compiled from: FullyDrawnReporter.kt */
    @tj.d(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {185}, m = "reportWhenComplete")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(rj.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, mj.r] */
    public static final Object reportWhenComplete(FullyDrawnReporter fullyDrawnReporter, bk.l<? super rj.c<? super r>, ? extends Object> lVar, rj.c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FullyDrawnReporter fullyDrawnReporter2;
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
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                fullyDrawnReporter.addReporter();
                if (fullyDrawnReporter.isFullyDrawnReported()) {
                    return r.f64562a;
                }
                anonymousClass1.L$0 = fullyDrawnReporter;
                anonymousClass1.label = 1;
                if (lVar.invoke(anonymousClass1) == objF) {
                    fullyDrawnReporter2 = fullyDrawnReporter;
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FullyDrawnReporter fullyDrawnReporter3 = (FullyDrawnReporter) anonymousClass1.L$0;
                kotlin.c.b(obj);
                fullyDrawnReporter2 = fullyDrawnReporter3;
            }
            fullyDrawnReporter2 = fullyDrawnReporter;
            ck.n.b(1);
            fullyDrawnReporter2.removeReporter();
            ck.n.a(1);
            fullyDrawnReporter = r.f64562a;
            return fullyDrawnReporter;
        } catch (Throwable th2) {
            ck.n.b(1);
            fullyDrawnReporter.removeReporter();
            ck.n.a(1);
            throw th2;
        }
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, bk.l<? super rj.c<? super r>, ? extends Object> lVar, rj.c<? super r> cVar) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return r.f64562a;
        }
        try {
            lVar.invoke(cVar);
            return r.f64562a;
        } finally {
            ck.n.b(1);
            fullyDrawnReporter.removeReporter();
            ck.n.a(1);
        }
    }
}
