package kotlinx.coroutines.flow;

import bk.p;
import kotlin.jvm.internal.Ref$BooleanRef;
import mj.r;
import qk.d;
import rj.c;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f63102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d<T> f63103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p<T, c<? super Boolean>, Object> f63104d;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, d<? super T> dVar, p<? super T, ? super c<? super Boolean>, ? extends Object> pVar) {
        this.f63102b = ref$BooleanRef;
        this.f63103c = dVar;
        this.f63104d = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    @Override // qk.d
    public final Object emit(T t10, c<? super r> cVar) throws Throwable {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        d<T> dVar;
        if (cVar instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) cVar;
            int i10 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, cVar);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, cVar);
        }
        Object objMo1invoke = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        Object objF = sj.a.f();
        int i11 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        if (i11 == 0) {
            kotlin.c.b(objMo1invoke);
            if (this.f63102b.element) {
                d<T> dVar2 = this.f63103c;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                if (dVar2.emit(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == objF) {
                    return objF;
                }
                return r.f64562a;
            }
            p<T, c<? super Boolean>, Object> pVar = this.f63104d;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = t10;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
            objMo1invoke = pVar.mo1invoke(t10, flowKt__LimitKt$dropWhile$1$1$emit$1);
            if (objMo1invoke == objF) {
                return objF;
            }
            flowKt__LimitKt$dropWhile$1$1 = this;
            if (!((Boolean) objMo1invoke).booleanValue()) {
                return r.f64562a;
            }
            flowKt__LimitKt$dropWhile$1$1.f63102b.element = true;
            dVar = flowKt__LimitKt$dropWhile$1$1.f63103c;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
            if (dVar.emit(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == objF) {
                return objF;
            }
        } else {
            if (i11 == 1) {
                kotlin.c.b(objMo1invoke);
                return r.f64562a;
            }
            if (i11 == 2) {
                t10 = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
                flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                kotlin.c.b(objMo1invoke);
                if (!((Boolean) objMo1invoke).booleanValue()) {
                    return r.f64562a;
                }
                flowKt__LimitKt$dropWhile$1$1.f63102b.element = true;
                dVar = flowKt__LimitKt$dropWhile$1$1.f63103c;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                if (dVar.emit(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objMo1invoke);
            }
        }
        return r.f64562a;
    }
}
