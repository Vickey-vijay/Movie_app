package yads;

import android.content.Context;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: loaded from: classes5.dex */
public final class it2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v5 f78795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public jt2 f78796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dp f78797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f78799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jt2 f78800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dp f78801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j00 f78802i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it2(jt2 jt2Var, dp dpVar, j00 j00Var, rj.c cVar) {
        super(2, cVar);
        this.f78800g = jt2Var;
        this.f78801h = dpVar;
        this.f78802i = j00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        it2 it2Var = new it2(this.f78800g, this.f78801h, this.f78802i, cVar);
        it2Var.f78799f = obj;
        return it2Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((it2) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        dp dpVar;
        Object objM;
        jt2 jt2Var;
        w5 w5Var;
        v5 v5Var;
        kt2 kt2Var;
        bt2 bt2Var;
        Context context;
        w5 w5Var2;
        v5 v5Var2;
        qx qxVar;
        String strC;
        String strA;
        String strC2;
        Object obj2;
        String hostAddress;
        byte[] address;
        it2 it2Var = this;
        Object objF = sj.a.f();
        int i10 = it2Var.f78798e;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    dp dpVar2 = it2Var.f78797d;
                    jt2Var = it2Var.f78796c;
                    v5Var = it2Var.f78795b;
                    w5Var = (w5) it2Var.f78799f;
                    kotlin.c.b(obj);
                    dpVar = dpVar2;
                    objM = obj;
                } else {
                    if (i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                jt2 jt2Var2 = it2Var.f78800g;
                jt2Var2.f79177f.a(ie1.f78606b, jt2Var2);
                return mj.r.f64562a;
            }
            kotlin.c.b(obj);
            nk.l0 l0Var = (nk.l0) it2Var.f78799f;
            jt2 jt2Var3 = it2Var.f78800g;
            jt2Var3.f79177f.b(ie1.f78606b, jt2Var3);
            jt2 jt2Var4 = it2Var.f78800g;
            w5 w5Var3 = jt2Var4.f79173b;
            v5 v5Var3 = v5.f83764x;
            dp dpVar3 = it2Var.f78801h;
            w5Var3.a(v5Var3, null);
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            dpVar = dpVar3;
            selectImplementation.r(nk.j.d(l0Var, null, null, new et2(null), 3, null).v(), new ft2(null));
            selectImplementation.s(nk.j.b(l0Var, null, null, new gt2(jt2Var4, null), 3, null).H(), new ht2(null));
            it2Var.f78799f = w5Var3;
            it2Var.f78795b = v5Var3;
            it2Var.f78796c = jt2Var4;
            it2Var.f78797d = dpVar;
            it2Var.f78798e = 1;
            objM = selectImplementation.m(it2Var);
            if (objM == objF) {
                return objF;
            }
            jt2Var = jt2Var4;
            w5Var = w5Var3;
            v5Var = v5Var3;
            Iterator itY = nj.u.y(NetworkInterface.getNetworkInterfaces());
            while (true) {
                if (itY.hasNext()) {
                    Iterator itY2 = nj.u.y(((NetworkInterface) itY.next()).getInetAddresses());
                    while (true) {
                        if (itY2.hasNext()) {
                            InetAddress inetAddress = (InetAddress) itY2.next();
                            itY = itY;
                            if ((inetAddress instanceof Inet6Address) && (address = ((Inet6Address) inetAddress).getAddress()) != null) {
                                int i11 = address[0] & 240;
                                obj2 = objF;
                                if (i11 == 32 || i11 == 48) {
                                    try {
                                        hostAddress = ((Inet6Address) inetAddress).getHostAddress();
                                    } catch (Throwable unused) {
                                        hostAddress = null;
                                    }
                                } else {
                                    objF = obj2;
                                }
                            }
                        }
                        obj2 = objF;
                        hostAddress = null;
                    }
                } else {
                    obj2 = objF;
                    hostAddress = null;
                }
                v5 v5Var4 = v5Var;
                uu0 uu0VarA = vu0.a(context, bt2Var.f75958b, qxVar, new sp2(), new pa2(ug1.a(context)));
                e00 e00Var = dpVar != null ? dpVar.f76762a : null;
                if (e00Var != null) {
                    uu0VarA.f83659w = e00Var.f76868b;
                }
                a03 a03Var = dpVar != null ? dpVar.f76763b : null;
                if (a03Var != null) {
                    uu0VarA.f83665z = a03Var.b().f85668b;
                    uu0VarA.f83661x = Integer.valueOf(a03Var.c(context));
                    uu0VarA.f83663y = Integer.valueOf(a03Var.a(context));
                }
                uu0VarA.K0 = strC;
                uu0VarA.J0 = strA;
                uu0VarA.L0 = strC2;
                uu0VarA.M0 = hostAddress;
                uu0VarA.N0 = kt2Var != null ? kt2Var.f79568b : null;
                Map map = dpVar != null ? dpVar.f76764c : null;
                if (map != null) {
                    uu0VarA.f83629h.putAll(map);
                }
                String strA2 = bt2Var.f75959c.a(context, new yu0(uu0VarA).toString());
                w5Var2.a(v5Var2);
                a73 a73Var = new a73(strA2, kt2Var);
                w5Var.a(v5Var4);
                if (strA2 != null) {
                    it2Var = this;
                    na2 na2Var = it2Var.f78800g.f79179h;
                    dp dpVar4 = it2Var.f78801h;
                    na2Var.f80615b.getClass();
                    fo2 fo2VarA = cp.a(dpVar4);
                    do2 do2Var = do2.f76756c;
                    fo2VarA.b("success", "status");
                    fo2VarA.b(na2Var.f80616c.a(), "durations");
                    fo2VarA.a(kt2Var != null ? kt2Var.f79568b : null, "stub_reason");
                    co2 co2Var = co2.f76352c;
                    na2Var.f80614a.a(new eo2("open_bidding_token_generation_result", kotlin.collections.a.B(fo2VarA.f77471a), fo2VarA.f77472b));
                    nk.y1 y1VarN = nk.w0.c().n();
                    ct2 ct2Var = new ct2(it2Var.f78802i, a73Var, null);
                    it2Var.f78799f = null;
                    it2Var.f78795b = null;
                    it2Var.f78796c = null;
                    it2Var.f78797d = null;
                    it2Var.f78798e = 2;
                    Object objG = nk.h.g(y1VarN, ct2Var, it2Var);
                    Object obj3 = obj2;
                    if (objG == obj3) {
                        return obj3;
                    }
                } else {
                    it2Var = this;
                    Object obj4 = obj2;
                    na2 na2Var2 = it2Var.f78800g.f79179h;
                    dp dpVar5 = it2Var.f78801h;
                    na2Var2.f80615b.getClass();
                    fo2 fo2VarA2 = cp.a(dpVar5);
                    do2 do2Var2 = do2.f76756c;
                    fo2VarA2.b("error", "status");
                    fo2VarA2.b("Cannot load bidder token. Token generation failed", "failure_reason");
                    fo2VarA2.b(na2Var2.f80616c.a(), "durations");
                    co2 co2Var2 = co2.f76352c;
                    na2Var2.f80614a.a(new eo2("open_bidding_token_generation_result", kotlin.collections.a.B(fo2VarA2.f77471a), fo2VarA2.f77472b));
                    nk.y1 y1VarN2 = nk.w0.c().n();
                    dt2 dt2Var = new dt2(it2Var.f78802i, null);
                    it2Var.f78799f = null;
                    it2Var.f78795b = null;
                    it2Var.f78796c = null;
                    it2Var.f78797d = null;
                    it2Var.f78798e = 3;
                    if (nk.h.g(y1VarN2, dt2Var, it2Var) == obj4) {
                        return obj4;
                    }
                }
                jt2 jt2Var5 = it2Var.f78800g;
                jt2Var5.f79177f.a(ie1.f78606b, jt2Var5);
                return mj.r.f64562a;
            }
        } catch (Throwable unused2) {
        }
        kt2Var = (kt2) objM;
        bt2Var = jt2Var.f79178g;
        context = jt2Var.f79172a;
        rd rdVar = jt2Var.f79175d;
        jm0 jm0Var = jt2Var.f79174c.f79849a;
        w5Var2 = bt2Var.f75957a;
        v5Var2 = v5.f83765y;
        w5Var2.a(v5Var2, null);
        qxVar = new qx(rdVar, jm0Var);
        ey2.f77227a.getClass();
        strC = ((tg1) ((fy2) dy2.a(context)).f77557b).c("SessionData");
        strA = ((l53) ne.a().f77342a).a();
        ux2.f83685a.getClass();
        strC2 = ((tg1) ((vx2) tx2.a(context)).f84040b).c("ServerSideClientIP");
    }
}
