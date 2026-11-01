package kotlinx.coroutines.flow;

import bk.p;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import qk.e;
import qk.k;
import qk.q;
import qk.u;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "invokeSuspend")
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ T $initialValue;
    public final /* synthetic */ k<T> $shared;
    public final /* synthetic */ a $started;
    public final /* synthetic */ qk.c<T> $upstream;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharing$1(a aVar, qk.c<? extends T> cVar, k<T> kVar, T t10, c<? super FlowKt__ShareKt$launchSharing$1> cVar2) {
        super(2, cVar2);
        this.$started = aVar;
        this.$upstream = cVar;
        this.$shared = kVar;
        this.$initialValue = t10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((FlowKt__ShareKt$launchSharing$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, c<? super Boolean>, Object> {
        public /* synthetic */ int I$0;
        public int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i10, c<? super Boolean> cVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i10), cVar)).invokeSuspend(r.f64562a);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Integer num, c<? super Boolean> cVar) {
            return invoke(num.intValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10;
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                if (this.I$0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return tj.a.a(z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @d(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<SharingCommand, c<? super r>, Object> {
        public final /* synthetic */ T $initialValue;
        public final /* synthetic */ k<T> $shared;
        public final /* synthetic */ qk.c<T> $upstream;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        /* JADX INFO: compiled from: Share.kt */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(qk.c<? extends T> cVar, k<T> kVar, T t10, c<? super AnonymousClass2> cVar2) {
            super(2, cVar2);
            this.$upstream = cVar;
            this.$shared = kVar;
            this.$initialValue = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(SharingCommand sharingCommand, c<? super r> cVar) {
            return ((AnonymousClass2) create(sharingCommand, cVar)).invokeSuspend(r.f64562a);
        }

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
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                int i11 = a.$EnumSwitchMapping$0[((SharingCommand) this.L$0).ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            T t10 = this.$initialValue;
                            if (t10 == q.f66593a) {
                                this.$shared.g();
                            } else {
                                tj.a.a(this.$shared.h(t10));
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    qk.c<T> cVar = this.$upstream;
                    qk.d dVar = this.$shared;
                    this.label = 1;
                    if (cVar.collect(dVar, this) == objF) {
                        return objF;
                    }
                }
            }
            return r.f64562a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[RETURN] */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        qk.c<T> cVar;
        qk.d dVar;
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    cVar = this.$upstream;
                    dVar = this.$shared;
                    this.label = 3;
                    if (cVar.collect(dVar, this) == objF) {
                        return objF;
                    }
                }
            }
            kotlin.c.b(obj);
        } else {
            kotlin.c.b(obj);
            a aVar = this.$started;
            a.C0564a c0564a = a.f63151a;
            if (aVar == c0564a.a()) {
                qk.c<T> cVar2 = this.$upstream;
                qk.d dVar2 = this.$shared;
                this.label = 1;
                if (cVar2.collect(dVar2, this) == objF) {
                    return objF;
                }
            } else if (this.$started == c0564a.b()) {
                u<Integer> uVarI = this.$shared.i();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 2;
                if (e.q(uVarI, anonymousClass1, this) == objF) {
                    return objF;
                }
                cVar = this.$upstream;
                dVar = this.$shared;
                this.label = 3;
                if (cVar.collect(dVar, this) == objF) {
                    return objF;
                }
            } else {
                qk.c cVarK = e.k(this.$started.a(this.$shared.i()));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$upstream, this.$shared, this.$initialValue, null);
                this.label = 4;
                if (e.j(cVarK, anonymousClass2, this) == objF) {
                    return objF;
                }
            }
        }
        return r.f64562a;
    }
}
