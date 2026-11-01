package yads;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes10.dex */
public final class ud2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83420a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j10, rj.c cVar) throws Throwable {
        pd2 pd2Var;
        String id2;
        if (cVar instanceof pd2) {
            pd2Var = (pd2) cVar;
            int i10 = pd2Var.f81378d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pd2Var.f81378d = i10 - Integer.MIN_VALUE;
            } else {
                pd2Var = new pd2(this, cVar);
            }
        } else {
            pd2Var = new pd2(this, cVar);
        }
        Object objD = pd2Var.f81376b;
        Object objF = sj.a.f();
        int i11 = pd2Var.f81378d;
        try {
            if (i11 == 0) {
                kotlin.c.b(objD);
                sd2 sd2Var = new sd2(this, null);
                pd2Var.f81378d = 1;
                objD = TimeoutKt.d(j10, sd2Var, pd2Var);
                if (objD == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objD);
            }
            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) objD;
            if (appSetIdInfo == null || (id2 = appSetIdInfo.getId()) == null || !(!lk.a0.n0(id2))) {
                return null;
            }
            return id2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public ud2(Context context) {
        this.f83420a = context;
    }
}
