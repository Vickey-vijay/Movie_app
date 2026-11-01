package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.FinalConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cm f55042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile NetworkTask f55043b;

    public final Context b() {
        return this.f55042a.f55114a;
    }

    public final synchronized NetworkTask c() {
        NetworkTask networkTask;
        if (g()) {
            networkTask = this.f55043b;
            if (networkTask == null || networkTask.isRemoved()) {
                C4123cm c4123cmD = d();
                Wd wd2 = Wd.f56086a;
                Yl yl2 = new Yl(new C4244he(), C4418oa.I.p());
                FinalConfigProvider finalConfigProvider = new FinalConfigProvider(c4123cmD);
                networkTask = new NetworkTask(new SynchronizedBlockingExecutor(), new C4463q5(this.f55042a.f55114a), new AllHostsExponentialBackoffPolicy(Wd.f56086a.a(Ud.STARTUP)), new C4704zm(this, new Sl(), new FullUrlFormer(yl2, finalConfigProvider), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), finalConfigProvider), nj.s.k(), Wd.f56088c);
                this.f55043b = networkTask;
            }
        } else {
            networkTask = null;
        }
        return networkTask;
    }

    public final synchronized boolean g() {
        boolean z10;
        boolean z11 = false;
        if (C4418oa.I.h().isRestrictedForSdk()) {
            return false;
        }
        C4226gm c4226gmE = e();
        Set set = AbstractC4149dm.f56613a;
        boolean z12 = true;
        if (!c4226gmE.f56853w) {
            z10 = AbstractC4149dm.f56614b.currentTimeSeconds() > c4226gmE.f56845o + ((long) c4226gmE.f56856z.f55151a);
        }
        if (z10) {
            z12 = z10;
        } else {
            if (AbstractC4149dm.a(c4226gmE.f56834d) && AbstractC4149dm.a(c4226gmE.f56831a) && AbstractC4149dm.a(c4226gmE.f56832b)) {
                z11 = true;
            }
            boolean z13 = !z11;
            D3 d10 = this.f55042a.f55124k;
            Map map = d().f56536h;
            A3 a10 = this.f55042a.f55123j;
            d10.getClass();
            boolean zA = D3.a(map, c4226gmE, a10);
            if (z13 || zA) {
                z12 = z13;
            }
        }
        return z12;
    }

    public final synchronized void h() {
        this.f55043b = null;
    }

    public final R4 a() {
        return this.f55042a.f55119f;
    }

    public final C4123cm d() {
        return (C4123cm) this.f55042a.f55125l.a();
    }

    public final C4226gm e() {
        C4226gm c4226gm;
        Jl jl2 = this.f55042a.f55125l;
        synchronized (jl2) {
            c4226gm = jl2.f57492c.f55547a;
        }
        return c4226gm;
    }

    public final void f() {
        C4226gm c4226gm;
        Jl jl2 = this.f55042a.f55125l;
        synchronized (jl2) {
            c4226gm = jl2.f57492c.f55547a;
        }
        C4329km c4329km = c4226gm.f56833c;
        C4303jm c4303jmA = c4329km.a(c4329km.f57143m);
        String strA = c4226gm.f56831a;
        String str = c4226gm.f56832b;
        qo qoVar = this.f55042a.f55127n;
        String str2 = c4226gm.f56834d;
        qoVar.getClass();
        if (!qo.a(str2)) {
            c4303jmA.f57030a = this.f55042a.f55126m.a().f58084id;
        }
        String str3 = c4226gm.f56831a;
        if (str3 == null || str3.length() == 0) {
            strA = this.f55042a.f55121h.a();
            str = "";
        }
        List<String> list = this.f55042a.f55116c.f56385e;
        if (list == null || !(!list.isEmpty())) {
            list = null;
        }
        c4303jmA.f57036g = list;
        C4226gm c4226gm2 = new C4226gm(strA, str, new C4329km(c4303jmA));
        b(c4226gm2);
        a(c4226gm2);
    }

    public Bm(Cm cm2) {
        this.f55042a = cm2;
    }

    public final synchronized void b(C4226gm c4226gm) {
        this.f55042a.f55125l.a(c4226gm);
        C4200fm c4200fm = this.f55042a.f55120g;
        c4200fm.f56783b.a(c4226gm.f56831a);
        c4200fm.f56783b.b(c4226gm.f56832b);
        c4200fm.f56782a.save(c4226gm.f56833c);
        this.f55042a.f55118e.a(c4226gm);
    }

    public final synchronized boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC4149dm.a(e(), list, map, new Am(this));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @VisibleForTesting
    public final C4226gm a(C4174em c4174em, C4123cm c4123cm, long j10) {
        String str;
        boolean zEquals;
        String strA = Gm.a(c4123cm.f56536h);
        Map map = c4123cm.f56537i.f57645a;
        String str2 = c4174em.f56684j;
        String str3 = e().f56841k;
        if (!Gm.a(Gm.a(str2))) {
            str2 = Gm.a(Gm.a(str3)) ? str3 : null;
        }
        String str4 = e().f56831a;
        if (str4 != null) {
            str = lk.a0.n0(str4) ^ true ? str4 : null;
            if (str == null) {
                str = c4174em.f56682h;
            }
        } else {
            str = c4174em.f56682h;
        }
        C4303jm c4303jm = new C4303jm(c4174em.f56676b);
        String str5 = c4174em.f56683i;
        c4303jm.f57044o = this.f55042a.f55122i.currentTimeSeconds();
        c4303jm.f57030a = e().f56834d;
        c4303jm.f57032c = c4174em.f56678d;
        c4303jm.f57035f = c4174em.f56677c;
        c4303jm.f57036g = c4123cm.f56533e;
        c4303jm.f57031b = c4174em.f56679e;
        c4303jm.f57033d = c4174em.f56680f;
        c4303jm.f57034e = c4174em.f56681g;
        c4303jm.f57037h = c4174em.f56688n;
        c4303jm.f57038i = c4174em.f56689o;
        c4303jm.f57039j = str2;
        c4303jm.f57040k = strA;
        this.f55042a.f55124k.getClass();
        HashMap mapA = Gm.a(str2);
        if (mo.a(map)) {
            zEquals = mo.a((Map) mapA);
        } else {
            zEquals = mapA.equals(map);
        }
        c4303jm.f57046q = zEquals;
        c4303jm.f57041l = Gm.a(map);
        c4303jm.f57047r = c4174em.f56687m;
        c4303jm.f57043n = c4174em.f56685k;
        c4303jm.f57048s = c4174em.f56690p;
        c4303jm.f57045p = true;
        c4303jm.f57049t = j10;
        C4123cm c4123cmD = d();
        if (c4123cmD.f56542n == 0) {
            c4123cmD.f56542n = j10;
        }
        c4303jm.f57050u = c4123cmD.f56542n;
        c4303jm.f57051v = false;
        c4303jm.f57052w = c4174em.f56691q;
        c4303jm.f57053x = c4174em.f56692r;
        c4303jm.f57054y = c4174em.f56693s;
        c4303jm.f57055z = c4174em.f56694t;
        c4303jm.A = c4174em.f56695u;
        c4303jm.B = c4174em.f56696v;
        return new C4226gm(str, str5, new C4329km(c4303jm));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    public final void a(C4174em c4174em, C4123cm c4123cm, Map<String, ? extends List<String>> map) {
        Long lValueOf;
        C4226gm c4226gmA;
        synchronized (this) {
            if (mo.a((Map) map)) {
                lValueOf = null;
            } else {
                List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (mo.a((Collection) list)) {
                    lValueOf = null;
                } else {
                    try {
                        lValueOf = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                    } catch (Throwable unused) {
                        lValueOf = null;
                    }
                }
            }
            long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
            Xj.f56166a.a(jLongValue, c4174em.f56686l);
            c4226gmA = a(c4174em, c4123cm, jLongValue);
            h();
            b(c4226gmA);
            mj.r rVar = mj.r.f64562a;
        }
        a(c4226gmA);
    }

    public final void a(C4226gm c4226gm) {
        ArrayList arrayList;
        Cm cm2 = this.f55042a;
        Gl gl2 = cm2.f55117d;
        String str = cm2.f55115b;
        synchronized (gl2.f55281a.f55362b) {
            Il il2 = gl2.f55281a;
            il2.f55363c = c4226gm;
            Collection collection = (Collection) il2.f55361a.f57557a.get(str);
            if (collection == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(collection);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Rl) it.next()).a(c4226gm);
        }
    }

    public final void a(Kl kl2) {
        synchronized (this) {
            this.f55043b = null;
        }
        Cm cm2 = this.f55042a;
        cm2.f55117d.a(cm2.f55119f.f55816a, kl2, e());
    }

    public final synchronized void a(C4071am c4071am) {
        this.f55042a.f55125l.a(c4071am);
        C4123cm c4123cmD = d();
        if (c4123cmD.f56539k) {
            List list = c4123cmD.f56538j;
            if (list != null && !list.isEmpty()) {
                if (!mo.a(list, c4123cmD.f56533e)) {
                    C4226gm c4226gmE = e();
                    C4329km c4329km = c4226gmE.f56833c;
                    C4303jm c4303jmA = c4329km.a(c4329km.f57143m);
                    String str = c4226gmE.f56831a;
                    String str2 = c4226gmE.f56832b;
                    c4303jmA.f57036g = list;
                    C4226gm c4226gm = new C4226gm(str, str2, new C4329km(c4303jmA));
                    b(c4226gm);
                    a(c4226gm);
                }
            } else {
                List list2 = c4123cmD.f56533e;
                if (list2 != null && (!list2.isEmpty())) {
                    C4226gm c4226gmE2 = e();
                    C4329km c4329km2 = c4226gmE2.f56833c;
                    C4303jm c4303jmA2 = c4329km2.a(c4329km2.f57143m);
                    String str3 = c4226gmE2.f56831a;
                    String str4 = c4226gmE2.f56832b;
                    c4303jmA2.f57036g = null;
                    C4226gm c4226gm2 = new C4226gm(str3, str4, new C4329km(c4303jmA2));
                    b(c4226gm2);
                    a(c4226gm2);
                }
            }
        }
    }
}
