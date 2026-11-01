package kotlinx.coroutines.flow.internal;

import bk.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.r;
import qk.d;
import rj.c;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q<d<? super Object>, Object, c<? super r>, Object> {
    public static final SafeCollectorKt$emitFun$1 INSTANCE = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // bk.q
    public /* bridge */ /* synthetic */ Object invoke(d<? super Object> dVar, Object obj, c<? super r> cVar) {
        return invoke2((d<Object>) dVar, obj, cVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(d<Object> dVar, Object obj, c<? super r> cVar) {
        return dVar.emit(obj, cVar);
    }
}
