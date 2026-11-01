package qk;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import kotlinx.coroutines.flow.FlowKt__CollectKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt;
import nk.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final <T> c<T> A(c<? extends T> cVar, bk.p<? super T, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        return FlowKt__TransformKt.b(cVar, pVar);
    }

    public static final <T> c<T> B(c<? extends T> cVar, bk.p<? super d<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        return FlowKt__EmittersKt.e(cVar, pVar);
    }

    public static final <T> p<T> C(p<? extends T> pVar, bk.p<? super d<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar2) {
        return FlowKt__ShareKt.e(pVar, pVar2);
    }

    public static final <T> c<T> D(pk.p<? extends T> pVar) {
        return FlowKt__ChannelsKt.d(pVar);
    }

    public static final <T> p<T> E(c<? extends T> cVar, l0 l0Var, kotlinx.coroutines.flow.a aVar, int i10) {
        return FlowKt__ShareKt.f(cVar, l0Var, aVar, i10);
    }

    public static final <T> Object F(c<? extends T> cVar, rj.c<? super T> cVar2) {
        return FlowKt__ReduceKt.d(cVar, cVar2);
    }

    public static final <T> u<T> G(c<? extends T> cVar, l0 l0Var, kotlinx.coroutines.flow.a aVar, T t10) {
        return FlowKt__ShareKt.g(cVar, l0Var, aVar, t10);
    }

    public static final <T> c<T> H(c<? extends T> cVar, int i10) {
        return FlowKt__LimitKt.d(cVar, i10);
    }

    public static final <T, R> c<R> I(c<? extends T> cVar, bk.q<? super d<? super R>, ? super T, ? super rj.c<? super mj.r>, ? extends Object> qVar) {
        return FlowKt__MergeKt.b(cVar, qVar);
    }

    public static final <T, R> c<R> J(c<? extends T> cVar, bk.q<? super d<? super R>, ? super T, ? super rj.c<? super Boolean>, ? extends Object> qVar) {
        return FlowKt__LimitKt.e(cVar, qVar);
    }

    public static final <T> p<T> a(k<T> kVar) {
        return FlowKt__ShareKt.a(kVar);
    }

    public static final <T> u<T> b(l<T> lVar) {
        return FlowKt__ShareKt.b(lVar);
    }

    public static final <T> c<T> c(c<? extends T> cVar, int i10, BufferOverflow bufferOverflow) {
        return g.a(cVar, i10, bufferOverflow);
    }

    public static final <T> c<T> e(bk.p<? super pk.n<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        return f.a(pVar);
    }

    public static final <T> c<T> f(c<? extends T> cVar, bk.q<? super d<? super T>, ? super Throwable, ? super rj.c<? super mj.r>, ? extends Object> qVar) {
        return FlowKt__ErrorsKt.a(cVar, qVar);
    }

    public static final <T> Object g(c<? extends T> cVar, d<? super T> dVar, rj.c<? super Throwable> cVar2) {
        return FlowKt__ErrorsKt.b(cVar, dVar, cVar2);
    }

    public static final <T> c<T> h(bk.p<? super pk.n<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        return f.b(pVar);
    }

    public static final Object i(c<?> cVar, rj.c<? super mj.r> cVar2) {
        return FlowKt__CollectKt.a(cVar, cVar2);
    }

    public static final <T> Object j(c<? extends T> cVar, bk.p<? super T, ? super rj.c<? super mj.r>, ? extends Object> pVar, rj.c<? super mj.r> cVar2) {
        return FlowKt__CollectKt.b(cVar, pVar, cVar2);
    }

    public static final <T> c<T> k(c<? extends T> cVar) {
        return j.e(cVar);
    }

    public static final <T> c<T> l(c<? extends T> cVar, bk.p<? super T, ? super rj.c<? super Boolean>, ? extends Object> pVar) {
        return FlowKt__LimitKt.b(cVar, pVar);
    }

    public static final <T> Object m(d<? super T> dVar, pk.p<? extends T> pVar, rj.c<? super mj.r> cVar) {
        return FlowKt__ChannelsKt.b(dVar, pVar, cVar);
    }

    public static final <T> Object n(d<? super T> dVar, c<? extends T> cVar, rj.c<? super mj.r> cVar2) {
        return FlowKt__CollectKt.c(dVar, cVar, cVar2);
    }

    public static final void o(d<?> dVar) {
        FlowKt__EmittersKt.b(dVar);
    }

    public static final <T> c<T> p(c<? extends T> cVar) {
        return FlowKt__TransformKt.a(cVar);
    }

    public static final <T> Object q(c<? extends T> cVar, bk.p<? super T, ? super rj.c<? super Boolean>, ? extends Object> pVar, rj.c<? super T> cVar2) {
        return FlowKt__ReduceKt.a(cVar, pVar, cVar2);
    }

    public static final <T> Object r(c<? extends T> cVar, rj.c<? super T> cVar2) {
        return FlowKt__ReduceKt.b(cVar, cVar2);
    }

    public static final <T> Object s(c<? extends T> cVar, rj.c<? super T> cVar2) {
        return FlowKt__ReduceKt.c(cVar, cVar2);
    }

    public static final <T> c<T> t(bk.p<? super d<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        return f.c(pVar);
    }

    public static final <T1, T2, R> c<R> u(c<? extends T1> cVar, c<? extends T2> cVar2, bk.q<? super T1, ? super T2, ? super rj.c<? super R>, ? extends Object> qVar) {
        return FlowKt__ZipKt.b(cVar, cVar2, qVar);
    }

    public static final <T> c<T> v(T t10) {
        return f.d(t10);
    }

    public static final <T> c<T> w(c<? extends T> cVar, kotlin.coroutines.d dVar) {
        return g.d(cVar, dVar);
    }

    public static final <T> kotlinx.coroutines.g x(c<? extends T> cVar, l0 l0Var) {
        return FlowKt__CollectKt.d(cVar, l0Var);
    }

    public static final <T, R> c<R> y(c<? extends T> cVar, bk.p<? super T, ? super rj.c<? super R>, ? extends Object> pVar) {
        return FlowKt__MergeKt.a(cVar, pVar);
    }

    public static final <T> c<T> z(c<? extends T> cVar, bk.q<? super d<? super T>, ? super Throwable, ? super rj.c<? super mj.r>, ? extends Object> qVar) {
        return FlowKt__EmittersKt.d(cVar, qVar);
    }
}
