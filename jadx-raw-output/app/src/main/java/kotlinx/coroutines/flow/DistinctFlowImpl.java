package kotlinx.coroutines.flow;

import bk.l;
import bk.p;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import qk.c;
import qk.d;
import rk.m;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DistinctFlowImpl<T> implements c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f63086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<T, Object> f63087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<Object, Object, Boolean> f63088d;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: Distinct.kt */
    public static final class AnonymousClass2<T> implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DistinctFlowImpl<T> f63089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<Object> f63090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d<T> f63091d;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(DistinctFlowImpl<T> distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, d<? super T> dVar) {
            this.f63089b = distinctFlowImpl;
            this.f63090c = ref$ObjectRef;
            this.f63091d = dVar;
        }

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
        public final Object emit(T t10, rj.c<? super r> cVar) throws Throwable {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (cVar instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) cVar;
                int i10 = distinctFlowImpl$collect$2$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, cVar);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, cVar);
            }
            Object obj = distinctFlowImpl$collect$2$emit$1.result;
            Object objF = sj.a.f();
            int i11 = distinctFlowImpl$collect$2$emit$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                T t11 = (T) this.f63089b.f63087c.invoke(t10);
                Object obj2 = this.f63090c.element;
                if (obj2 != m.f66793a && this.f63089b.f63088d.mo1invoke(obj2, t11).booleanValue()) {
                    return r.f64562a;
                }
                this.f63090c.element = t11;
                d<T> dVar = this.f63091d;
                distinctFlowImpl$collect$2$emit$1.label = 1;
                if (dVar.emit(t10, distinctFlowImpl$collect$2$emit$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    @Override // qk.c
    public Object collect(d<? super T> dVar, rj.c<? super r> cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = (T) m.f66793a;
        Object objCollect = this.f63086b.collect(new AnonymousClass2(this, ref$ObjectRef, dVar), cVar);
        return objCollect == sj.a.f() ? objCollect : r.f64562a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(c<? extends T> cVar, l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        this.f63086b = cVar;
        this.f63087c = lVar;
        this.f63088d = pVar;
    }
}
