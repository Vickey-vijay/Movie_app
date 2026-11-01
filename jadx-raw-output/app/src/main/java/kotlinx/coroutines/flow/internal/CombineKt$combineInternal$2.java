package kotlinx.coroutines.flow.internal;

import bk.a;
import bk.p;
import bk.q;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nj.d0;
import nk.l0;
import nk.s2;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
public final class CombineKt$combineInternal$2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ a<T[]> $arrayFactory;
    public final /* synthetic */ qk.c<T>[] $flows;
    public final /* synthetic */ qk.d<R> $this_combineInternal;
    public final /* synthetic */ q<qk.d<? super R>, T[], c<? super r>, Object> $transform;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(qk.c<? extends T>[] cVarArr, a<T[]> aVar, q<? super qk.d<? super R>, ? super T[], ? super c<? super r>, ? extends Object> qVar, qk.d<? super R> dVar, c<? super CombineKt$combineInternal$2> cVar) {
        super(2, cVar);
        this.$flows = cVarArr;
        this.$arrayFactory = aVar;
        this.$transform = qVar;
        this.$this_combineInternal = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, cVar);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((CombineKt$combineInternal$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @d(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ qk.c<T>[] $flows;
        public final /* synthetic */ int $i;
        public final /* synthetic */ AtomicInteger $nonClosed;
        public final /* synthetic */ pk.d<d0<Object>> $resultChannel;
        public int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: Combine.kt */
        public static final class C05651<T> implements qk.d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ pk.d<d0<Object>> f63164b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f63165c;

            public C05651(pk.d<d0<Object>> dVar, int i10) {
                this.f63164b = dVar;
                this.f63165c = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // qk.d
            public final Object emit(T t10, c<? super r> cVar) throws Throwable {
                CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                if (cVar instanceof CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (CombineKt$combineInternal$2$1$1$emit$1) cVar;
                    int i10 = combineKt$combineInternal$2$1$1$emit$1.label;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
                    } else {
                        combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, cVar);
                    }
                } else {
                    combineKt$combineInternal$2$1$1$emit$1 = new CombineKt$combineInternal$2$1$1$emit$1(this, cVar);
                }
                Object obj = combineKt$combineInternal$2$1$1$emit$1.result;
                Object objF = sj.a.f();
                int i11 = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                    return r.f64562a;
                }
                kotlin.c.b(obj);
                pk.d<d0<Object>> dVar = this.f63164b;
                d0<Object> d0Var = new d0<>(this.f63165c, t10);
                combineKt$combineInternal$2$1$1$emit$1.label = 1;
                if (dVar.u(d0Var, combineKt$combineInternal$2$1$1$emit$1) == objF) {
                    return objF;
                }
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
                if (s2.a(combineKt$combineInternal$2$1$1$emit$1) == objF) {
                    return objF;
                }
                return r.f64562a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(qk.c<? extends T>[] cVarArr, int i10, AtomicInteger atomicInteger, pk.d<d0<Object>> dVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$flows = cVarArr;
            this.$i = i10;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    qk.c[] cVarArr = this.$flows;
                    int i11 = this.$i;
                    qk.c cVar = cVarArr[i11];
                    C05651 c05651 = new C05651(this.$resultChannel, i11);
                    this.label = 1;
                    if (cVar.collect(c05651, this) == objF) {
                        return objF;
                    }
                }
                if (this.$nonClosed.decrementAndGet() == 0) {
                    pk.q.a.a(this.$resultChannel, null, 1, null);
                }
                return r.f64562a;
            } catch (Throwable th2) {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    pk.q.a.a(this.$resultChannel, null, 1, null);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec A[LOOP:0: B:28:0x00ec->B:51:?, LOOP_START, PHI: r3 r10
  0x00ec: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e7, B:51:?] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r10v5 nj.d0) = (r10v4 nj.d0), (r10v18 nj.d0) binds: [B:25:0x00e7, B:51:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102  */
    /* JADX WARN: Code duplicated, block: B:36:0x0113  */
    /* JADX WARN: Code duplicated, block: B:38:0x011d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0133 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0134  */
    /* JADX WARN: Code duplicated, block: B:46:0x0168  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111 A[EDGE_INSN: B:49:0x0111->B:35:0x0111 BREAK  A[LOOP:0: B:28:0x00ec->B:51:?], SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0134 -> B:20:0x00c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
