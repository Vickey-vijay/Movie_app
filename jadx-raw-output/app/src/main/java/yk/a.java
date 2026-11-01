package yk;

import bl.a0;
import bl.a1;
import bl.b2;
import bl.c2;
import bl.d2;
import bl.e0;
import bl.f;
import bl.f0;
import bl.h;
import bl.h2;
import bl.i1;
import bl.i2;
import bl.j1;
import bl.k2;
import bl.l2;
import bl.n2;
import bl.o0;
import bl.o2;
import bl.p0;
import bl.q2;
import bl.r2;
import bl.s2;
import bl.u0;
import bl.w1;
import bl.y;
import bl.z;
import bl.z0;
import ck.d;
import ck.e;
import ck.o;
import ck.p;
import ck.q;
import ck.u;
import ck.w;
import java.util.List;
import java.util.Map;
import jk.c;
import kotlin.Pair;
import kotlin.Triple;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import mj.i;
import mj.j;
import mj.k;
import mj.l;
import mj.m;
import mj.n;
import mj.r;
import xk.b;

/* JADX INFO: compiled from: BuiltinSerializers.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static final b<Long> A(q qVar) {
        p.j(qVar, "<this>");
        return a1.f5375a;
    }

    public static final b<Short> B(u uVar) {
        p.j(uVar, "<this>");
        return c2.f5392a;
    }

    public static final b<String> C(w wVar) {
        p.j(wVar, "<this>");
        return d2.f5397a;
    }

    public static final b<i> D(i.a aVar) {
        p.j(aVar, "<this>");
        return i2.f5421a;
    }

    public static final b<k> E(k.a aVar) {
        p.j(aVar, "<this>");
        return l2.f5436a;
    }

    public static final b<m> F(m.a aVar) {
        p.j(aVar, "<this>");
        return o2.f5448a;
    }

    public static final b<mj.p> G(mj.p.a aVar) {
        p.j(aVar, "<this>");
        return r2.f5462a;
    }

    public static final b<r> H(r rVar) {
        p.j(rVar, "<this>");
        return s2.f5467b;
    }

    public static final b<mk.b> I(mk.b.a aVar) {
        p.j(aVar, "<this>");
        return a0.f5373a;
    }

    public static final <T, E extends T> b<E[]> a(c<T> cVar, b<E> bVar) {
        p.j(cVar, "kClass");
        p.j(bVar, "elementSerializer");
        return new w1(cVar, bVar);
    }

    public static final b<boolean[]> b() {
        return h.f5411c;
    }

    public static final b<byte[]> c() {
        return bl.k.f5429c;
    }

    public static final b<char[]> d() {
        return bl.q.f5456c;
    }

    public static final b<double[]> e() {
        return y.f5489c;
    }

    public static final b<float[]> f() {
        return e0.f5399c;
    }

    public static final b<int[]> g() {
        return o0.f5447c;
    }

    public static final <T> b<List<T>> h(b<T> bVar) {
        p.j(bVar, "elementSerializer");
        return new f(bVar);
    }

    public static final b<long[]> i() {
        return z0.f5494c;
    }

    public static final <K, V> b<Map.Entry<K, V>> j(b<K> bVar, b<V> bVar2) {
        p.j(bVar, "keySerializer");
        p.j(bVar2, "valueSerializer");
        return new MapEntrySerializer(bVar, bVar2);
    }

    public static final <K, V> b<Map<K, V>> k(b<K> bVar, b<V> bVar2) {
        p.j(bVar, "keySerializer");
        p.j(bVar2, "valueSerializer");
        return new u0(bVar, bVar2);
    }

    public static final b l() {
        return i1.f5419a;
    }

    public static final <K, V> b<Pair<K, V>> m(b<K> bVar, b<V> bVar2) {
        p.j(bVar, "keySerializer");
        p.j(bVar2, "valueSerializer");
        return new PairSerializer(bVar, bVar2);
    }

    public static final b<short[]> n() {
        return b2.f5389c;
    }

    public static final <A, B, C> b<Triple<A, B, C>> o(b<A> bVar, b<B> bVar2, b<C> bVar3) {
        p.j(bVar, "aSerializer");
        p.j(bVar2, "bSerializer");
        p.j(bVar3, "cSerializer");
        return new TripleSerializer(bVar, bVar2, bVar3);
    }

    public static final b<j> p() {
        return h2.f5415c;
    }

    public static final b<l> q() {
        return k2.f5432c;
    }

    public static final b<n> r() {
        return n2.f5445c;
    }

    public static final b<mj.q> s() {
        return q2.f5458c;
    }

    public static final <T> b<T> t(b<T> bVar) {
        p.j(bVar, "<this>");
        return bVar.getDescriptor().b() ? bVar : new j1(bVar);
    }

    public static final b<Boolean> u(ck.c cVar) {
        p.j(cVar, "<this>");
        return bl.i.f5416a;
    }

    public static final b<Byte> v(d dVar) {
        p.j(dVar, "<this>");
        return bl.l.f5433a;
    }

    public static final b<Character> w(e eVar) {
        p.j(eVar, "<this>");
        return bl.r.f5459a;
    }

    public static final b<Double> x(ck.j jVar) {
        p.j(jVar, "<this>");
        return z.f5492a;
    }

    public static final b<Float> y(ck.k kVar) {
        p.j(kVar, "<this>");
        return f0.f5402a;
    }

    public static final b<Integer> z(o oVar) {
        p.j(oVar, "<this>");
        return p0.f5452a;
    }
}
