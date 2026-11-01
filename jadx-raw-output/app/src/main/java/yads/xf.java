package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class xf {
    public static void a(Context context, at1 at1Var) {
        long jLongValue;
        long jLongValue2;
        vf vfVar;
        nk.h0 h0VarB = nk.w0.b();
        nk.l0 l0VarA = kotlinx.coroutines.d.a(nk.j2.b(null, 1, null).plus(nk.w0.b()).plus(new y10(at1Var)));
        jf jfVar = new jf(h0VarB, new Handler(Looper.getMainLooper()));
        pf pfVar = new pf(at1Var);
        d63 d63Var = new d63();
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && nt2VarA.f80766f0) {
            Long l10 = nt2VarA.f80768g0;
            if (l10 != null) {
                jLongValue = l10.longValue();
            } else {
                jLongValue = 1000;
            }
            long j10 = jLongValue;
            Long l11 = nt2VarA.f80770h0;
            if (l11 != null) {
                jLongValue2 = l11.longValue();
            } else {
                jLongValue2 = 6000;
            }
            long j11 = jLongValue2;
            Set setF = nt2VarA.f80782n0;
            if (setF == null) {
                setF = nj.q0.f();
            }
            Set set = setF;
            Object obj2 = vf.f83886j;
            vf vfVar2 = vf.f83887k;
            if (vfVar2 == null) {
                synchronized (vf.f83886j) {
                    vfVar = vf.f83887k;
                    if (vfVar == null) {
                        vfVar = new vf(j10, j11, set, l0VarA, jfVar, pfVar, d63Var);
                        vf.f83887k = vfVar;
                    }
                }
                vfVar2 = vfVar;
            }
            if (!vfVar2.f83896i.getAndSet(true)) {
                nk.j.d(vfVar2.f83891d, vfVar2.f83895h, null, new tf(vfVar2, null), 2, null).F(new uf(vfVar2));
            }
        }
    }
}
