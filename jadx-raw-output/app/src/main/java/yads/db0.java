package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class db0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa2 f76605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uz1 f76606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j83 f76607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yg2 f76608d;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, wa0 wa0Var, rj.c cVar) throws Throwable {
        cb0 cb0Var;
        db0 db0Var;
        if (cVar instanceof cb0) {
            cb0Var = (cb0) cVar;
            int i10 = cb0Var.f76225f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cb0Var.f76225f = i10 - Integer.MIN_VALUE;
            } else {
                cb0Var = new cb0(this, cVar);
            }
        } else {
            cb0Var = new cb0(this, cVar);
        }
        Object objA = cb0Var.f76223d;
        Object objF = sj.a.f();
        int i11 = cb0Var.f76225f;
        if (i11 == 0) {
            kotlin.c.b(objA);
            List list = wa0Var.f84140d;
            yg2 yg2Var = this.f76608d;
            cb0Var.f76221b = this;
            cb0Var.f76222c = wa0Var;
            cb0Var.f76225f = 1;
            objA = yg2Var.a(context, list, cb0Var);
            if (objA == objF) {
                return objF;
            }
            db0Var = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wa0Var = cb0Var.f76222c;
            db0Var = cb0Var.f76221b;
            kotlin.c.b(objA);
        }
        sg2 sg2Var = (sg2) objA;
        if (sg2Var != null) {
            uz1 uz1Var = db0Var.f76606b;
            uz1Var.f83701a.b();
            uz1Var.f83702b.f77263f.c();
        } else {
            db0Var.f76605a.a(wa0Var.f84138b);
            db0Var.f76607c.a(wa0Var.f84139c, vu.f84009a);
        }
        return sg2Var;
    }

    public db0(k42 k42Var, uz1 uz1Var, j83 j83Var, yg2 yg2Var) {
        this.f76605a = k42Var;
        this.f76606b = uz1Var;
        this.f76607c = j83Var;
        this.f76608d = yg2Var;
    }
}
