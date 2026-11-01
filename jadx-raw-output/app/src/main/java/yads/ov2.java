package yads;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.yandex.div.core.DivConfiguration;
import com.yandex.mobile.ads.R$layout;
import java.util.Iterator;
import java.util.List;
import yads.ov2;

/* JADX INFO: loaded from: classes11.dex */
public final class ov2 implements s42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qv2 f81163a;

    @Override // yads.s42
    public final void a(l4 l4Var) {
        qv2 qv2Var = this.f81163a;
        if (qv2Var.f81998o) {
            return;
        }
        qv2Var.f81996m = null;
        qv2Var.f81997n = null;
        qv2Var.f81984a.b(l4Var);
    }

    public ov2(qv2 qv2Var) {
        this.f81163a = qv2Var;
    }

    @Override // yads.s42
    public final void a(w02 w02Var) {
        final qv2 qv2Var = this.f81163a;
        if (qv2Var.f81998o) {
            return;
        }
        qv2Var.f81997n = w02Var;
        qv2Var.f81990g.post(new Runnable() { // from class: cp.y7
            @Override // java.lang.Runnable
            public final void run() {
                ov2.a(qv2Var);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    public static final void a(qv2 qv2Var) {
        w02 w02Var;
        xm xmVar;
        DivConfiguration divConfigurationA;
        gi0 gi0Var;
        Object next;
        String str;
        if (!qv2Var.f81998o) {
            v9 v9Var = qv2Var.f81996m;
            tc1 tc1Var = qv2Var.f81984a.C;
            if (v9Var == null || (w02Var = qv2Var.f81997n) == null) {
                return;
            }
            ck.p.h(w02Var, "null cannot be cast to non-null type com.monetization.ads.nativeads.NativeAdPrivate");
            dn dnVar = qv2Var.f81986c;
            km kmVar = qv2Var.f81984a;
            Context context = kmVar.f85495a;
            m22 m22Var = qv2Var.f81989f;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = qv2Var.f81995l;
            lh3 lh3Var = kmVar.E;
            kz kzVar = qv2Var.f81994k;
            ym ymVar = dnVar.f76737a;
            ymVar.f85047c.getClass();
            se1 se1Var = null;
            if (oi0.a(context)) {
                List listD = w02Var.d();
                if (listD != null) {
                    Iterator it = listD.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            str = ((gi0) next).f77807a;
                            fg0[] fg0VarArr = fg0.f77387b;
                        }
                    } while (!ck.p.e(str, "ad"));
                    gi0Var = (gi0) next;
                } else {
                    gi0Var = null;
                }
                if (gi0Var != null) {
                    d4 d4Var = ymVar.f85045a;
                    lu2 lu2Var = ymVar.f85046b;
                    xmVar = new xm(gi0Var, d4Var, lu2Var, new qh0(), new yg0(((iu3) lu2Var).a()), new ve1());
                } else {
                    xmVar = null;
                }
            } else {
                xmVar = null;
            }
            if (xmVar != null) {
                pu puVar = new pu(xmVar.f84630a.f77814h);
                wm wmVar = new wm();
                at1 at1VarA = ((iu3) xmVar.f84632c).a();
                xmVar.f84633d.getClass();
                zf0 zf0VarA = qh0.a(w02Var, kzVar, m22Var, puVar, at1VarA);
                zh0 zh0Var = new zh0(puVar);
                yg0 yg0Var = xmVar.f84634e;
                gi0 gi0Var2 = xmVar.f84630a;
                yg0Var.getClass();
                if (w02Var instanceof v22) {
                    io2 io2Var = yg0Var.f84948a;
                    x03 x03Var = new x03(io2Var);
                    v22 v22Var = (v22) w02Var;
                    x03Var.f84403e.put(gi0Var2.f77811e, new z03(v22Var, io2Var, gi0Var2.f77814h, new kh0(), new jq0(), new mj(x02.a(v22Var, xh0.f84595c))));
                    yg0Var.f84949b.getClass();
                    divConfigurationA = y03.a(context, x03Var, zh0Var);
                } else {
                    divConfigurationA = (DivConfiguration) kotlin.b.a(new fi0(context, zh0Var)).getValue();
                }
                jy jyVar = new jy(new yh0(xmVar.f84630a.f77811e, new oh0(context, xmVar.f84631b, xmVar.f84632c, v9Var, kzVar, wmVar, zh0Var), divConfigurationA, at1VarA, "rootDivkitView", new pv0(), 192), zf0VarA, new n22(w02Var.c(), lh3Var));
                ji0 ji0Var = new ji0(v9Var);
                ve1 ve1Var = xmVar.f84635f;
                int i10 = R$layout.monetization_ads_internal_divkit;
                ve1Var.getClass();
                se1Var = new se1(i10, jyVar, ji0Var);
            } else {
                tc1Var = tc1Var;
                onPreDrawListener = onPreDrawListener;
            }
            cn cnVar = new cn(new bn(context, tc1Var, nj.s.o(se1Var), onPreDrawListener));
            qv2Var.f81999p = cnVar;
            cnVar.a(v9Var.c(), new pv2(qv2Var));
            return;
        }
        qv2Var.f81984a.b(h9.f78106f);
    }
}
