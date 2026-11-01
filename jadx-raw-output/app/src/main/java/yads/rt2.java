package yads;

import android.content.Context;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import kotlin.Result;

/* JADX INFO: loaded from: classes6.dex */
public final class rt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd f82424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm0 f82425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f82426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cu2 f82427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xt2 f82428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xo2 f82429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zt2 f82430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q33 f82431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f82432i;

    public rt2(Context context, rd rdVar, lm0 lm0Var, w5 w5Var, cu2 cu2Var, xt2 xt2Var, xo2 xo2Var, zt2 zt2Var, q33 q33Var) {
        this.f82424a = rdVar;
        this.f82425b = lm0Var;
        this.f82426c = w5Var;
        this.f82427d = cu2Var;
        this.f82428e = xt2Var;
        this.f82429f = xo2Var;
        this.f82430g = zt2Var;
        this.f82431h = q33Var;
        this.f82432i = context.getApplicationContext();
    }

    public final void a(ox2 ox2Var, q61 q61Var, tt2 tt2Var) {
        String str;
        String libraryVersion;
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(this.f82432i);
        if (nt2VarA != null && !this.f82427d.a()) {
            xy xyVar = xy.f84742d;
            if (tt2Var.f83173a.isActive()) {
                nk.l lVar = tt2Var.f83173a;
                Result.a aVar = Result.Companion;
                lVar.resumeWith(Result.m3458constructorimpl(new hu2(nt2VarA, xyVar)));
                return;
            }
            return;
        }
        du2 du2Var = new du2(this.f82432i, this.f82428e, tt2Var, this.f82426c);
        io2 io2Var = this.f82431h.f81697a;
        co2 co2Var = co2.f76352c;
        io2Var.a(new eo2("sdk_configuration_request", kotlin.collections.a.B(nj.l0.g(mj.h.a("call_source", q61Var.f81726b))), null));
        jm0 jm0Var = this.f82425b.f79849a;
        Context context = this.f82432i;
        String str2 = jm0Var.f79100e;
        if (str2 == null || str2.length() == 0) {
            str = null;
        } else {
            zt2 zt2Var = this.f82430g;
            rd rdVar = this.f82424a;
            zt2Var.getClass();
            boolean zB = ox2Var.b(context);
            uu0 uu0Var = new uu0(zB);
            uu0Var.f83655u = jm0Var.b();
            uu0Var.f83639m = jm0Var.f79099d;
            td tdVar = rdVar.f82195a;
            boolean z10 = rdVar.f82197c;
            if (tdVar != null) {
                uu0Var.N = Boolean.valueOf(tdVar.f82967b);
                uu0Var.O = Boolean.valueOf(z10);
                String str3 = tdVar.f82966a;
                uu0Var.f83623e.getClass();
                boolean z11 = (str3 == null || str3.length() == 0 || ck.p.e("00000000-0000-0000-0000-000000000000", str3)) ? false : true;
                if (!zB && ck.p.e(uu0Var.N, Boolean.FALSE) && z11) {
                    uu0Var.P = str3;
                }
            }
            td tdVar2 = rdVar.f82196b;
            if (tdVar2 != null) {
                uu0Var.Q = Boolean.valueOf(tdVar2.f82967b);
                String str4 = tdVar2.f82966a;
                uu0Var.f83623e.getClass();
                boolean z12 = (str4 == null || str4.length() == 0 || ck.p.e("00000000-0000-0000-0000-000000000000", str4)) ? false : true;
                if (!zB && ck.p.e(uu0Var.Q, Boolean.FALSE) && z12) {
                    uu0Var.R = str4;
                }
            }
            uu0Var.f83619c.getClass();
            pg.a(context);
            try {
                libraryVersion = AppMetrica.getLibraryVersion();
            } catch (Throwable unused) {
                boolean z13 = ad1.f75480a;
                libraryVersion = null;
            }
            uu0Var.C0 = libraryVersion;
            uu0Var.C = Integer.valueOf(kl3.d(context));
            uu0Var.D = Integer.valueOf(kl3.b(context));
            uu0Var.E = Float.valueOf(context.getResources().getDisplayMetrics().density);
            uu0Var.f83650r0 = kl3.a(context);
            vg0 vg0VarB = vo3.b(context);
            uu0Var.f83652s0 = vg0VarB.f83904a;
            uu0Var.f83654t0 = vg0VarB.f83905b;
            uu0Var.f83656u0 = vg0VarB.f83906c;
            uu0Var.f83658v0 = vg0VarB.f83907d;
            uu0Var.f83660w0 = vg0VarB.f83908e;
            uu0Var.f83662x0 = vg0VarB.f83909f;
            uu0Var.f83635k = cw2.a().b();
            uu0Var.f83627g = ox2.a(context);
            uu0 uu0VarA = uu0Var.a(context, jm0Var.f79096a);
            uu0VarA.f83642n0 = context.getPackageName();
            uu0VarA.f83644o0 = og.a(context);
            uu0VarA.f83646p0 = og.b(context);
            uu0VarA.A0 = uu0VarA.f83621d.a("%d.%d%d");
            uu0VarA.B0 = uu0VarA.f83621d.a("%d.%d.%d");
            uu0VarA.f83633j = cw2.a().d();
            uu0VarA.f83625f = true;
            String[] strArr = {new yu0(uu0VarA).toString(), nj.b0.p0(jm0Var.f79097b, C3426d4.j.f28584c, null, null, 0, null, yt2.f85111b, 30, null)};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                String str5 = strArr[i10];
                if (!lk.a0.n0(str5)) {
                    arrayList.add(str5);
                }
            }
            String strA = zt2Var.f85584a.a(context, nj.b0.p0(arrayList, C3426d4.j.f28584c, null, null, 0, null, null, 62, null));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            if (!ck.p.e(String.valueOf(lk.c0.t1(sb2)), "/")) {
                sb2.append("/");
            }
            sb2.append("v1/startup");
            sb2.append("?");
            sb2.append(strA);
            String string = sb2.toString();
            ck.p.i(string, "toString(...)");
            str = string;
        }
        if (str == null || str.length() == 0) {
            du2Var.a((im3) new h4(m4.f80067j, null));
            return;
        }
        bu2 bu2Var = new bu2(this.f82432i, str, this.f82427d, jm0Var.f79098c, du2Var, du2Var);
        bu2Var.f81503q = this;
        this.f82426c.a(v5.f83752l, null);
        xo2 xo2Var = this.f82429f;
        Context context2 = this.f82432i;
        synchronized (xo2Var) {
            r82.a(context2).a(bu2Var);
        }
    }

    public /* synthetic */ rt2(Context context, at1 at1Var, rd rdVar, lm0 lm0Var, w5 w5Var) {
        cu2 cu2Var = new cu2(context, at1Var);
        Object obj = xt2.f84686b;
        xt2 xt2VarA = wt2.a();
        Object obj2 = xo2.f84662a;
        this(context, rdVar, lm0Var, w5Var, cu2Var, xt2VarA, wo2.a(), new zt2(), new q33(at1Var));
    }
}
