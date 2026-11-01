package yads;

import android.content.Context;
import com.ironsource.C3426d4;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: loaded from: classes10.dex */
public final class cn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo2 f76331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final da0 f76332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d71 f76333d;

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(rj.c cVar) throws Throwable {
        zm2 zm2Var;
        if (cVar instanceof zm2) {
            zm2Var = (zm2) cVar;
            int i10 = zm2Var.f85489d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zm2Var.f85489d = i10 - Integer.MIN_VALUE;
            } else {
                zm2Var = new zm2(this, cVar);
            }
        } else {
            zm2Var = new zm2(this, cVar);
        }
        Object objB = zm2Var.f85487b;
        Object objF = sj.a.f();
        int i11 = zm2Var.f85489d;
        if (i11 == 0) {
            kotlin.c.b(objB);
            zm2Var.f85489d = 1;
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(zm2Var), 1);
            cVar2.J();
            d71 d71Var = this.f76333d;
            an2 an2Var = new an2(cVar2);
            bn2 bn2Var = new bn2(cVar2);
            d71Var.getClass();
            c71 c71Var = new c71(an2Var, bn2Var);
            Context context = this.f76330a;
            da0 da0Var = this.f76332c;
            StringBuilder sb2 = new StringBuilder();
            String str = da0Var.f76603a.f79100e;
            if (str == null) {
                str = da0.f76602b;
            }
            sb2.append(str);
            Character chU1 = lk.c0.u1(sb2);
            if (chU1 == null || chU1.charValue() != '/') {
                sb2.append('/');
            }
            sb2.append("v1/debugpanel");
            if (true ^ da0Var.f76603a.f79097b.isEmpty()) {
                sb2.append(nj.b0.p0(da0Var.f76603a.f79097b, C3426d4.j.f28584c, "?", null, 0, null, ca0.f76220b, 28, null));
            }
            String string = sb2.toString();
            ck.p.i(string, "toString(...)");
            dc1 dc1Var = new dc1(context, string, this.f76331b, this.f76332c.f76603a.f79098c, c71Var);
            Object obj = xo2.f84662a;
            xo2 xo2VarA = wo2.a();
            Context context2 = this.f76330a;
            synchronized (xo2VarA) {
                r82.a(context2).a(dc1Var);
            }
            objB = cVar2.B();
            if (objB == sj.a.f()) {
                tj.f.c(zm2Var);
            }
            if (objB == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objB);
        }
        return ((Result) objB).m3466unboximpl();
    }

    public cn2(Context context, yo2 yo2Var, da0 da0Var, d71 d71Var) {
        this.f76330a = context;
        this.f76331b = yo2Var;
        this.f76332c = da0Var;
        this.f76333d = d71Var;
    }
}
