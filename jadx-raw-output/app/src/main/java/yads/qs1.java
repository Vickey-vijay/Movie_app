package yads;

import android.os.Handler;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class qs1 extends ry {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final fm1 f81953v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f81954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f81955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mo[] f81956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s63[] f81957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f81958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hc0 f81959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashMap f81960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sx1 f81961r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f81962s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long[][] f81963t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ps1 f81964u;

    public qs1(hc0 hc0Var, mo... moVarArr) {
        this.f81954k = false;
        this.f81955l = false;
        this.f81956m = moVarArr;
        this.f81959p = hc0Var;
        this.f81958o = new ArrayList(Arrays.asList(moVarArr));
        this.f81962s = -1;
        this.f81957n = new s63[moVarArr.length];
        this.f81963t = new long[0][];
        this.f81960q = new HashMap();
        this.f81961r = px1.a().a().b();
    }

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        int length = this.f81956m.length;
        pm1[] pm1VarArr = new pm1[length];
        int iA = this.f81957n[0].a(ym1Var.f82311a);
        for (int i10 = 0; i10 < length; i10++) {
            pm1VarArr[i10] = this.f81956m[i10].a(ym1Var.a(this.f81957n[i10].a(iA)), qeVar, j10 - this.f81963t[iA][i10]);
        }
        ns1 ns1Var = new ns1(this.f81959p, this.f81963t[iA], pm1VarArr);
        if (!this.f81955l) {
            return ns1Var;
        }
        Long l10 = (Long) this.f81960q.get(ym1Var.f82311a);
        l10.getClass();
        tv tvVar = new tv(ns1Var, true, 0L, l10.longValue());
        this.f81961r.a(ym1Var.f82311a, tvVar);
        return tvVar;
    }

    static {
        sl1 sl1Var = new sl1();
        p51.g();
        Collections.emptyList();
        sm2 sm2Var = sm2.f82697f;
        f81953v = new fm1("MergingMediaSource", new ul1(sl1Var), null, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1.f76322d);
    }

    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    public final void a(Object obj, mo moVar, s63 s63Var) {
        s63[] s63VarArr;
        Integer num = (Integer) obj;
        if (this.f81964u != null) {
            return;
        }
        if (this.f81962s == -1) {
            this.f81962s = s63Var.a();
        } else if (s63Var.a() != this.f81962s) {
            this.f81964u = new ps1();
            return;
        }
        if (this.f81963t.length == 0) {
            this.f81963t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f81962s, this.f81957n.length);
        }
        this.f81958o.remove(moVar);
        this.f81957n[num.intValue()] = s63Var;
        if (this.f81958o.isEmpty()) {
            if (this.f81954k) {
                p63 p63Var = new p63();
                for (int i10 = 0; i10 < this.f81962s; i10++) {
                    long j10 = -this.f81957n[0].a(i10, p63Var, false).f81270f;
                    int i11 = 1;
                    while (true) {
                        s63[] s63VarArr2 = this.f81957n;
                        if (i11 < s63VarArr2.length) {
                            this.f81963t[i10][i11] = j10 - (-s63VarArr2[i11].a(i10, p63Var, false).f81270f);
                            i11++;
                        }
                    }
                }
            }
            s63 os1Var = this.f81957n[0];
            if (this.f81955l) {
                p63 p63Var2 = new p63();
                for (int i12 = 0; i12 < this.f81962s; i12++) {
                    long j11 = Long.MIN_VALUE;
                    int i13 = 0;
                    while (true) {
                        s63VarArr = this.f81957n;
                        if (i13 >= s63VarArr.length) {
                            break;
                        }
                        long j12 = s63VarArr[i13].a(i12, p63Var2, false).f81269e;
                        if (j12 != -9223372036854775807L) {
                            long j13 = j12 + this.f81963t[i12][i13];
                            if (j11 == Long.MIN_VALUE || j13 < j11) {
                                j11 = j13;
                            }
                        }
                        i13++;
                    }
                    Object objA = s63VarArr[0].a(i12);
                    this.f81960q.put(objA, Long.valueOf(j11));
                    sx1 sx1Var = this.f81961r;
                    Object obj2 = (Collection) sx1Var.f75344f.get(objA);
                    if (obj2 == null) {
                        obj2 = (List) sx1Var.f82825h.get();
                    }
                    List list = (List) obj2;
                    x tVar = list instanceof RandomAccess ? new t(sx1Var, objA, list, null) : new z(sx1Var, objA, list, null);
                    tVar.c();
                    Collection collection = tVar.f84390c;
                    Iterator itA = a0.a(collection);
                    while (true) {
                        tVar.c();
                        if (tVar.f84390c != collection) {
                            throw new ConcurrentModificationException();
                        }
                        if (itA.hasNext()) {
                            tVar.c();
                            if (tVar.f84390c != collection) {
                                throw new ConcurrentModificationException();
                            }
                            tv tvVar = (tv) itA.next();
                            tvVar.f83185f = 0L;
                            tvVar.f83186g = j11;
                        }
                    }
                }
                os1Var = new os1(os1Var, this.f81960q);
            }
            a(os1Var);
        }
    }

    @Override // yads.mo
    public final fm1 c() {
        mo[] moVarArr = this.f81956m;
        return moVarArr.length > 0 ? moVarArr[0].c() : f81953v;
    }

    @Override // yads.ry, yads.mo
    public final void d() throws ps1 {
        ps1 ps1Var = this.f81964u;
        if (ps1Var != null) {
            throw ps1Var;
        }
        super.d();
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        super.e();
        Arrays.fill(this.f81957n, (Object) null);
        this.f81962s = -1;
        this.f81964u = null;
        this.f81958o.clear();
        Collections.addAll(this.f81958o, this.f81956m);
    }

    public qs1(mo[] moVarArr, int i10) {
        this(new hc0(), moVarArr);
    }

    @Override // yads.ry
    public final ym1 a(Object obj, ym1 ym1Var) {
        if (((Integer) obj).intValue() == 0) {
            return ym1Var;
        }
        return null;
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.f82464j = r83Var;
        this.f82463i = ib3.a((Handler.Callback) null);
        for (int i10 = 0; i10 < this.f81956m.length; i10++) {
            a(Integer.valueOf(i10), this.f81956m[i10]);
        }
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        if (this.f81955l) {
            tv tvVar = (tv) pm1Var;
            sx1 sx1Var = this.f81961r;
            c0 c0Var = sx1Var.f76854b;
            if (c0Var == null) {
                c0Var = new c0(sx1Var);
                sx1Var.f76854b = c0Var;
            }
            Iterator it = c0Var.iterator();
            while (true) {
                o oVar = (o) it;
                if (!oVar.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) oVar.next();
                if (((tv) entry.getValue()).equals(tvVar)) {
                    sx1 sx1Var2 = this.f81961r;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    Collection collection = (Collection) sx1Var2.a().get(key);
                    if (collection == null) {
                        break;
                    }
                    collection.remove(value);
                    break;
                }
            }
            pm1Var = tvVar.f83181b;
        }
        ns1 ns1Var = (ns1) pm1Var;
        int i10 = 0;
        while (true) {
            mo[] moVarArr = this.f81956m;
            if (i10 >= moVarArr.length) {
                return;
            }
            mo moVar = moVarArr[i10];
            pm1 pm1Var2 = ns1Var.f80744b[i10];
            if (pm1Var2 instanceof ls1) {
                pm1Var2 = ((ls1) pm1Var2).f79900b;
            }
            moVar.a(pm1Var2);
            i10++;
        }
    }
}
