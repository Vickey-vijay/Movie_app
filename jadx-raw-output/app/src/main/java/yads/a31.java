package yads;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm0 f75373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5 f75374b;

    public final void a(Context context, z21 z21Var) {
        String strA;
        tg tgVar = z21Var.f85181a;
        String str = z21Var.f85182b;
        e31 e31Var = z21Var.f85183c;
        a5 a5Var = this.f75374b;
        a5Var.getClass();
        int iOrdinal = e31Var.ordinal();
        if (iOrdinal == 0) {
            strA = a5Var.a(context);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            strA = tgVar.f83019a;
            if (strA == null) {
                strA = a5Var.a(context);
            }
        }
        jm0 jm0Var = this.f75373a;
        jm0Var.f79100e = strA;
        jm0Var.f79096a = tgVar.f83020b;
        String str2 = tgVar.f83021c;
        synchronized (jm0.f79095h) {
            if (str2 != null) {
                if (str2.length() != 0) {
                    jm0Var.f79102g = str2;
                }
            }
            mj.r rVar = mj.r.f64562a;
        }
        this.f75373a.f79099d = str;
    }

    public a31(jm0 jm0Var, a5 a5Var) {
        this.f75373a = jm0Var;
        this.f75374b = a5Var;
    }
}
