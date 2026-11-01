package kotlinx.coroutines.flow.internal;

import bk.p;
import bk.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g;
import mj.r;
import nk.j;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ qk.d<R> $collector;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    public static final class AnonymousClass1<T> implements qk.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<g> f63160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l0 f63161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ChannelFlowTransformLatest<T, R> f63162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ qk.d<R> f63163e;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref$ObjectRef<g> ref$ObjectRef, l0 l0Var, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, qk.d<? super R> dVar) {
            this.f63160b = ref$ObjectRef;
            this.f63161c = l0Var;
            this.f63162d = channelFlowTransformLatest;
            this.f63163e = dVar;
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ qk.d<R> $collector;
            public final /* synthetic */ T $value;
            public int label;
            public final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, qk.d<? super R> dVar, T t10, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.this$0 = channelFlowTransformLatest;
                this.$collector = dVar;
                this.$value = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(Object obj, c<?> cVar) {
                return new AnonymousClass2(this.this$0, this.$collector, this.$value, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
                return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = a.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    q qVar = this.this$0.f63159f;
                    Object obj2 = this.$collector;
                    T t10 = this.$value;
                    this.label = 1;
                    if (qVar.invoke(obj2, t10, this) == objF) {
                        return objF;
                    }
                }
                return r.f64562a;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // qk.d
        public final Object emit(T t10, c<? super r> cVar) throws Throwable {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            if (cVar instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) cVar;
                int i10 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, cVar);
                }
            } else {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, cVar);
            }
            Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
            Object objF = a.f();
            int i11 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                g gVar = this.f63160b.element;
                if (gVar != null) {
                    gVar.a(new ChildCancelledException());
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = t10;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = gVar;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                    if (gVar.o(channelFlowTransformLatest$flowCollect$3$1$emit$1) == objF) {
                        return objF;
                    }
                }
                anonymousClass1 = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t10 = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                anonymousClass1 = (AnonymousClass1) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                kotlin.c.b(obj);
            }
            anonymousClass1.f63160b.element = (T) j.d(anonymousClass1.f63161c, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.f63162d, anonymousClass1.f63163e, t10, null), 1, null);
            return r.f64562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, qk.d<? super R> dVar, c<? super ChannelFlowTransformLatest$flowCollect$3> cVar) {
        super(2, cVar);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, cVar);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type rj.c to kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 for r7v1 'this'  rj.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = sj.a.f()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.c.b(r8)
            goto L37
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.c.b(r8)
            java.lang.Object r8 = r7.L$0
            nk.l0 r8 = (nk.l0) r8
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3 = r7.this$0
            qk.c<S> r4 = r3.f63158e
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r5 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
            qk.d<R> r6 = r7.$collector
            r5.<init>(r1, r8, r3, r6)
            r7.label = r2
            java.lang.Object r8 = r4.collect(r5, r7)
            if (r8 != r0) goto L37
            return r0
        L37:
            mj.r r8 = mj.r.f64562a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
