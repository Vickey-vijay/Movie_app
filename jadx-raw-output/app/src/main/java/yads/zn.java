package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: loaded from: classes11.dex */
public abstract class zn implements vc2, mu, oo, uo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f85495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f85496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f85497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lu2 f85498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nk.l0 f85499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t8 f85500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f85501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ra3 f85502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ox2 f85503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wf1 f85504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zu2 f85505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s01 f85506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fh2 f85507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n43 f85508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sp2 f85509o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wc2 f85510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o4 f85511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z5 f85512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f85513s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f85514t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public jm f85515u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v9 f85516v;

    public /* synthetic */ zn(Context context, w5 w5Var, d4 d4Var, lu2 lu2Var, nk.l0 l0Var) {
        t8 t8Var = new t8(d4Var, lu2Var, context);
        Handler handler = new Handler(Looper.getMainLooper());
        sb sbVar = new sb();
        ox2 ox2Var = new ox2();
        wf1 wf1Var = new wf1(context, d4Var);
        zu2 zu2Var = new zu2(context, lu2Var, l0Var, w5Var, null, null, 2097136);
        s01 s01Var = new s01(lu2Var, d4Var);
        fh2 fh2Var = new fh2(lu2Var, d4Var);
        n43 n43Var = n43.f80556b;
        this(context, w5Var, d4Var, lu2Var, l0Var, t8Var, handler, sbVar, ox2Var, wf1Var, zu2Var, s01Var, fh2Var, m43.a(), new sp2(), wc2.f84159h.a(context), new o4(context));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(zn znVar, ra3 ra3Var, rj.c cVar) throws Throwable {
        rn rnVar;
        zn znVar2;
        ra3 ra3Var2;
        znVar.getClass();
        if (cVar instanceof rn) {
            rnVar = (rn) cVar;
            int i10 = rnVar.f82322f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rnVar.f82322f = i10 - Integer.MIN_VALUE;
            } else {
                rnVar = new rn(znVar, cVar);
            }
        } else {
            rnVar = new rn(znVar, cVar);
        }
        Object objA = rnVar.f82320d;
        Object objF = sj.a.f();
        int i11 = rnVar.f82322f;
        if (i11 == 0) {
            kotlin.c.b(objA);
            zu2 zu2Var = znVar.f85505k;
            q61 q61Var = q61.f81722d;
            rnVar.f82318b = znVar;
            rnVar.f82319c = ra3Var;
            rnVar.f82322f = 1;
            objA = zu2Var.a(q61Var, rnVar);
            if (objA == objF) {
                return objF;
            }
            znVar2 = znVar;
            ra3Var2 = ra3Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ra3Var2 = rnVar.f82319c;
            znVar2 = rnVar.f82318b;
            kotlin.c.b(objA);
        }
        ru2 ru2Var = (ru2) objA;
        if (ru2Var instanceof qu2) {
            d4 d4Var = znVar2.f85497c;
            qu2 qu2Var = (qu2) ru2Var;
            rd rdVar = qu2Var.f81976a;
            qx qxVar = d4Var.f76560b;
            qxVar.f82017b = rdVar;
            qxVar.f82016a = qu2Var.f81977b;
            Object obj = dw2.f76819j;
            nt2 nt2VarA = cw2.a().a(znVar2.f85495a);
            hp hpVar = nt2VarA != null ? nt2VarA.f80756a0 : null;
            if (hpVar != null) {
                znVar2.f85496b.a(v5.f83747g, null);
                nk.j.d(znVar2.f85499e, null, null, new un(znVar2, ra3Var2, hpVar, null), 3, null);
            } else {
                synchronized (znVar2) {
                    nk.j.d(znVar2.f85499e, null, null, new qn(znVar2, ra3Var2, null), 3, null);
                }
            }
        } else if (ru2Var instanceof pu2) {
            znVar2.b(((pu2) ru2Var).f81605a);
        }
        return mj.r.f64562a;
    }

    public abstract pn a(String str, String str2);

    public synchronized void b(g9 g9Var) {
        Objects.toString(this.f85512r);
        boolean z10 = ad1.f75480a;
        if (this.f85512r != z5.f85213d) {
            if (a(g9Var)) {
                this.f85496b.a();
                this.f85496b.b(v5.f83745e);
                this.f85508n.b(ie1.f78606b, this);
                c(g9Var);
            } else {
                i();
            }
        }
    }

    public synchronized void c() {
        if (!a()) {
            this.f85513s = true;
            n();
            JobKt__JobKt.f(this.f85505k.f85596c.getCoroutineContext(), null, 1, null);
            o4 o4Var = this.f85511q;
            xo2 xo2Var = o4Var.f80928a;
            Context context = o4Var.f80930c;
            String str = o4Var.f80929b;
            xo2Var.getClass();
            xo2.a(context, str);
            this.f85501g.removeCallbacksAndMessages(null);
            this.f85508n.a(ie1.f78606b, this);
            this.f85516v = null;
            this.f85500f.a();
            kotlinx.coroutines.d.d(this.f85499e, null, 1, null);
            getClass().toString();
            boolean z10 = ad1.f75480a;
        }
    }

    public synchronized void j() {
        boolean z10 = ad1.f75480a;
        jm jmVar = this.f85515u;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    public final d4 e() {
        return this.f85497c;
    }

    public final w5 f() {
        return this.f85496b;
    }

    public final Context g() {
        return this.f85495a;
    }

    public final lu2 h() {
        return this.f85498d;
    }

    public final void k() {
        String str;
        do2 do2Var = do2.f76756c;
        qq1 qq1Var = this.f85497c.f76569k;
        if (qq1Var == null || (str = qq1Var.f81930b) == null) {
            str = bo2.f75924a;
        }
        this.f85496b.a(v5.f83743c, new ac(do2Var, str), null);
        this.f85496b.a(v5.f83745e);
        this.f85508n.a(ie1.f78606b, this);
        a(z5.f85214e);
        this.f85514t = SystemClock.elapsedRealtime();
    }

    public void l() {
        p4.a(this.f85497c.f76559a.f76868b);
        k();
        j();
    }

    public l4 o() {
        wf1 wf1Var = this.f85504j;
        List listY0 = nj.b0.y0(wf1Var.a(), nj.s.o(wf1Var.f84187b.f76562d.f75685a == null ? h9.f78113m : null));
        String str = wf1Var.f84187b.f76559a.f76868b;
        ArrayList arrayList = new ArrayList(nj.t.v(listY0, 10));
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            arrayList.add(((l4) it.next()).f79699c);
        }
        p4.a(str, arrayList);
        return (l4) nj.b0.h0(listY0);
    }

    public void d() {
        c();
        getClass().toString();
        boolean z10 = ad1.f75480a;
    }

    public void i() {
        j();
    }

    public final void m() {
        getClass().toString();
        boolean z10 = ad1.f75480a;
        this.f85510p.a(this);
    }

    public final void n() {
        getClass().toString();
        boolean z10 = ad1.f75480a;
        this.f85510p.b(this);
    }

    public void b(l4 l4Var) {
        String str;
        lc1.c(l4Var.f79699c, new Object[0]);
        a(z5.f85215f);
        do2 do2Var = do2.f76757d;
        qq1 qq1Var = this.f85497c.f76569k;
        if (qq1Var == null || (str = qq1Var.f81930b) == null) {
            str = bo2.f75924a;
        }
        this.f85496b.a(v5.f83743c, new ac(do2Var, str), null);
        this.f85496b.a(v5.f83745e);
        this.f85508n.a(ie1.f78606b, this);
        a(l4Var);
    }

    public zn(Context context, w5 w5Var, d4 d4Var, lu2 lu2Var, nk.l0 l0Var, t8 t8Var, Handler handler, ra3 ra3Var, ox2 ox2Var, wf1 wf1Var, zu2 zu2Var, s01 s01Var, fh2 fh2Var, n43 n43Var, sp2 sp2Var, wc2 wc2Var, o4 o4Var) {
        this.f85495a = context;
        this.f85496b = w5Var;
        this.f85497c = d4Var;
        this.f85498d = lu2Var;
        this.f85499e = l0Var;
        this.f85500f = t8Var;
        this.f85501g = handler;
        this.f85502h = ra3Var;
        this.f85503i = ox2Var;
        this.f85504j = wf1Var;
        this.f85505k = zu2Var;
        this.f85506l = s01Var;
        this.f85507m = fh2Var;
        this.f85508n = n43Var;
        this.f85509o = sp2Var;
        this.f85510p = wc2Var;
        this.f85511q = o4Var;
        this.f85512r = z5.f85212c;
    }

    public final synchronized void c(g9 g9Var) {
        a(g9Var, this.f85502h);
    }

    @Override // yads.uo2
    public final void b() {
        this.f85496b.a(v5.f83758r);
        this.f85496b.a(v5.f83759s, null);
    }

    public final synchronized void a(z5 z5Var) {
        Objects.toString(z5Var);
        boolean z10 = ad1.f75480a;
        this.f85512r = z5Var;
    }

    @Override // yads.mu
    public final synchronized boolean a() {
        return this.f85513s;
    }

    public synchronized boolean a(g9 g9Var) {
        v9 v9Var;
        v9Var = this.f85516v;
        return this.f85512r == z5.f85215f || v9Var == null || this.f85514t <= 0 || SystemClock.elapsedRealtime() - this.f85514t > ((long) v9Var.J) || !((g9Var == null || ck.p.e(g9Var, this.f85497c.f76563e)) && uz.b(this.f85495a).f82948b == this.f85497c.f76572n);
    }

    public synchronized void a(l4 l4Var) {
        jm jmVar = this.f85515u;
        if (jmVar != null) {
            jmVar.a(l4Var);
        }
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        if (im3Var instanceof h4) {
            b(n4.a(this.f85497c, ((h4) im3Var).f78054c));
        }
    }

    @Override // yads.vc2
    public void a(rc2 rc2Var) {
        Objects.toString(rc2Var);
        boolean z10 = ad1.f75480a;
    }

    public final void a(a03 a03Var) {
        b03 b03Var = this.f85497c.f76562d;
        if (a03Var == null) {
            b03Var.getClass();
            lc1.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        a03 a03Var2 = b03Var.f75685a;
        if (a03Var2 != null && !ck.p.e(a03Var2, a03Var)) {
            lc1.c("Ad size can't be set twice.", new Object[0]);
        } else {
            b03Var.f75685a = a03Var;
        }
    }

    public final synchronized void a(g9 g9Var, ra3 ra3Var) {
        a(z5.f85213d);
        this.f85497c.f76563e = g9Var;
        l4 l4VarO = o();
        if (l4VarO == null) {
            nk.j.d(this.f85499e, null, null, new yn(this, ra3Var, null), 3, null);
        } else {
            b(l4VarO);
        }
    }
}
