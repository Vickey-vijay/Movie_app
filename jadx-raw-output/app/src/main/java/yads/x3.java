package yads;

import android.content.Context;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class x3 implements y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f84430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f84431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f84432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz1 f84433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p53 f84434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final za f84435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zy1 f84436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j83 f84437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s5 f84438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v3 f84439j;

    public /* synthetic */ x3(Context context, lu2 lu2Var, v9 v9Var, d4 d4Var, uz1 uz1Var, p53 p53Var) {
        za zaVar = new za(context, lu2Var, d4Var);
        this(lu2Var, v9Var, d4Var, uz1Var, p53Var, zaVar, new zy1(context, d4Var, lu2Var, v9Var), new j83(zaVar), new s5(uz1Var), new v3());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(View view, if1 if1Var, v0 v0Var, k42 k42Var, rj.c cVar) throws Throwable {
        w3 w3Var;
        x3 x3Var;
        oa2 oa2Var;
        yu uuVar;
        if (cVar instanceof w3) {
            w3Var = (w3) cVar;
            int i10 = w3Var.f84086g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w3Var.f84086g = i10 - Integer.MIN_VALUE;
            } else {
                w3Var = new w3(this, cVar);
            }
        } else {
            w3Var = new w3(this, cVar);
        }
        Object objA = w3Var.f84084e;
        Object objF = sj.a.f();
        int i11 = w3Var.f84086g;
        if (i11 == 0) {
            kotlin.c.b(objA);
            List list = if1Var.f78621a;
            w3Var.f84081b = this;
            w3Var.f84082c = if1Var;
            w3Var.f84083d = k42Var;
            w3Var.f84086g = 1;
            objA = v0Var.a(view, list, w3Var);
            if (objA == objF) {
                return objF;
            }
            x3Var = this;
            oa2Var = k42Var;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oa2 oa2Var2 = w3Var.f84083d;
            if1Var = w3Var.f84082c;
            x3Var = w3Var.f84081b;
            kotlin.c.b(objA);
            oa2Var = oa2Var2;
        }
        o01 o01Var = (o01) objA;
        String str = if1Var.f78624d;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        v3 v3Var = x3Var.f84439j;
        sg2 sg2Var = o01Var.f80880b;
        v3Var.getClass();
        if (str != null && sg2Var != null) {
            uuVar = xu.f84692a;
        } else if (str != null) {
            uuVar = vu.f84009a;
        } else {
            uuVar = sg2Var != null ? new uu(sg2Var) : wu.f84314a;
        }
        x3Var.f84437h.a(if1Var.f78623c, uuVar);
        if (str != null) {
            oa2Var.a(str);
        }
        return o01Var;
    }

    public x3(lu2 lu2Var, v9 v9Var, d4 d4Var, uz1 uz1Var, p53 p53Var, za zaVar, zy1 zy1Var, j83 j83Var, s5 s5Var, v3 v3Var) {
        this.f84430a = lu2Var;
        this.f84431b = v9Var;
        this.f84432c = d4Var;
        this.f84433d = uz1Var;
        this.f84434e = p53Var;
        this.f84435f = zaVar;
        this.f84436g = zy1Var;
        this.f84437h = j83Var;
        this.f84438i = s5Var;
        this.f84439j = v3Var;
    }
}
