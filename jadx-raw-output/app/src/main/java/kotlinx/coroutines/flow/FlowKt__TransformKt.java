package kotlinx.coroutines.flow;

import bk.p;
import ck.n;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import qk.c;
import qk.d;

/* JADX INFO: compiled from: Transform.kt */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class FlowKt__TransformKt {
    public static final <T> c<T> a(final c<? extends T> cVar) {
        return new c<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f63120b;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @tj.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(rj.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(d dVar) {
                    this.f63120b = dVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // qk.d
                public final Object emit(T t10, rj.c<? super r> cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
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
                        d dVar = this.f63120b;
                        if (t10 != null) {
                            anonymousClass1.label = 1;
                            if (dVar.emit(t10, anonymousClass1) == objF) {
                                return objF;
                            }
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
            public Object collect(d dVar, rj.c cVar2) {
                Object objCollect = cVar.collect(new AnonymousClass2(dVar), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
    }

    public static final <T> c<T> b(final c<? extends T> cVar, final p<? super T, ? super rj.c<? super r>, ? extends Object> pVar) {
        return new c<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements d {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f63123b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ p f63124c;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @tj.d(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(rj.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(d dVar, p pVar) {
                    this.f63123b = dVar;
                    this.f63124c = pVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // qk.d
                public final Object emit(T t10, rj.c<? super r> cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    Object obj;
                    d dVar;
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
                    Object obj2 = anonymousClass1.result;
                    Object objF = sj.a.f();
                    int i11 = anonymousClass1.label;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            d dVar2 = (d) anonymousClass1.L$1;
                            obj = anonymousClass1.L$0;
                            kotlin.c.b(obj2);
                            dVar = dVar2;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.c.b(obj2);
                        }
                        return r.f64562a;
                    }
                    kotlin.c.b(obj2);
                    d dVar3 = this.f63123b;
                    p pVar = this.f63124c;
                    anonymousClass1.L$0 = t10;
                    anonymousClass1.L$1 = dVar3;
                    anonymousClass1.label = 1;
                    n.c(6);
                    Object objMo1invoke = pVar.mo1invoke(t10, anonymousClass1);
                    n.c(7);
                    if (objMo1invoke == objF) {
                        return objF;
                    }
                    obj = t10;
                    dVar = dVar3;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (dVar.emit(obj, anonymousClass1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
            }

            @Override // qk.c
            public Object collect(d dVar, rj.c cVar2) {
                Object objCollect = cVar.collect(new AnonymousClass2(dVar, pVar), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
    }
}
