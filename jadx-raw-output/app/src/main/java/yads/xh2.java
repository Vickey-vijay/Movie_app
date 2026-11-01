package yads;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv f84597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv f84598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ro1 f84599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mh2 f84600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nh2 f84601e;

    public xh2(nv nvVar, mv mvVar, ro1 ro1Var, mh2 mh2Var, nh2 nh2Var) {
        this.f84597a = nvVar;
        this.f84598b = mvVar;
        this.f84599c = ro1Var;
        this.f84600d = mh2Var;
        this.f84601e = nh2Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final Object a(long j10, Context context, e00 e00Var, a03 a03Var, xh2 xh2Var, List list, rj.c cVar) throws Throwable {
        uh2 uh2Var;
        List list2;
        xh2Var.getClass();
        if (cVar instanceof uh2) {
            uh2Var = (uh2) cVar;
            int i10 = uh2Var.f83468d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uh2Var.f83468d = i10 - Integer.MIN_VALUE;
            } else {
                uh2Var = new uh2(xh2Var, cVar);
            }
        } else {
            uh2Var = new uh2(xh2Var, cVar);
        }
        Object objE = uh2Var.f83466b;
        Object objF = sj.a.f();
        int i11 = uh2Var.f83468d;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.c.b(objE);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objE);
            }
            list2 = (List) objE;
            if (list2.isEmpty()) {
                return new dh2(list2);
            }
            zg2 zg2Var = zg2.f85387d;
            return new dh2(nj.r.e(jq1.a()));
        }
        kotlin.c.b(objE);
        if (list.isEmpty()) {
            zg2 zg2Var2 = zg2.f85387d;
            return new dh2(nj.r.e(jq1.a()));
        }
        vh2 vh2Var = new vh2(j10, context, e00Var, a03Var, xh2Var, list, null);
        uh2Var.f83468d = 1;
        objE = kotlinx.coroutines.d.e(vh2Var, uh2Var);
        if (objE == objF) {
            return objF;
        }
        nk.h0 h0VarB = nk.w0.b();
        wh2 wh2Var = new wh2((List) objE, null);
        uh2Var.f83468d = 2;
        objE = nk.h.g(h0VarB, wh2Var, uh2Var);
        if (objE == objF) {
            return objF;
        }
        list2 = (List) objE;
        if (list2.isEmpty()) {
            return new dh2(list2);
        }
        zg2 zg2Var3 = zg2.f85387d;
        return new dh2(nj.r.e(jq1.a()));
    }

    public /* synthetic */ xh2(xo1 xo1Var, nv nvVar) {
        this(nvVar, new mv(), new ro1(xo1Var), new mh2(), new nh2());
    }

    public static final void a(xh2 xh2Var, qq1 qq1Var) {
        xh2Var.getClass();
        if (lk.a0.V(qq1Var.f81930b, "LevelPlay", true)) {
            List listN = nj.s.n(MBridgeConstans.APP_KEY, "placement_name");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listN) {
                if (!qq1Var.f81931c.containsKey((String) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                throw new IllegalArgumentException("Required configuration parameters are missing");
            }
        }
    }
}
