package kotlinx.coroutines.channels;

import bk.p;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import pk.q;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes11.dex */
@d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
public final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements p<l0, c<? super a<? extends r>>, Object> {
    public final /* synthetic */ E $element;
    public final /* synthetic */ q<E> $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(q<? super E> qVar, E e10, c<? super ChannelsKt__ChannelsKt$trySendBlocking$2> cVar) {
        super(2, cVar);
        this.$this_trySendBlocking = qVar;
        this.$element = e10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, cVar);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(l0 l0Var, c<? super a<? extends r>> cVar) {
        return invoke2(l0Var, (c<? super a<r>>) cVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(l0 l0Var, c<? super a<r>> cVar) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
        Object objM3458constructorimpl;
        Object objA;
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
                q<E> qVar = this.$this_trySendBlocking;
                E e10 = this.$element;
                Result.a aVar = Result.Companion;
                this.label = 1;
                if (qVar.u(e10, this) == objF) {
                    return objF;
                }
            }
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            objA = a.f63077b.c(r.f64562a);
        } else {
            objA = a.f63077b.a(Result.m3461exceptionOrNullimpl(objM3458constructorimpl));
        }
        return a.b(objA);
    }
}
