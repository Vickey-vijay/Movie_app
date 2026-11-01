package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw2 f85147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x72 f85148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s72 f85149c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy1(Context context, d4 d4Var, lu2 lu2Var) {
        this(cw2.a(), new x72(context, d4Var, lu2Var), new s72());
        Object obj = dw2.f76819j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(yy1 yy1Var, oi oiVar, rj.c cVar) throws Throwable {
        uy1 uy1Var;
        oi oiVar2;
        oi oiVar3;
        yy1Var.getClass();
        if (cVar instanceof uy1) {
            uy1Var = (uy1) cVar;
            int i10 = uy1Var.f83696e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uy1Var.f83696e = i10 - Integer.MIN_VALUE;
            } else {
                uy1Var = new uy1(yy1Var, cVar);
            }
        } else {
            uy1Var = new uy1(yy1Var, cVar);
        }
        Object obj = uy1Var.f83694c;
        Object objF = sj.a.f();
        int i11 = uy1Var.f83696e;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (oiVar.f81050c instanceof on1) {
                ck.p.h(oiVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<R of com.monetization.ads.network.model.AssetKt.castGeneric>");
                oiVar2 = oiVar;
            } else {
                oiVar2 = null;
            }
            if (oiVar2 == null) {
                return oiVar;
            }
            x72 x72Var = yy1Var.f85148b;
            sd3 sd3Var = ((on1) oiVar2.f81050c).f81111b;
            uy1Var.f83693b = oiVar2;
            uy1Var.f83696e = 1;
            x72Var.getClass();
            Object objG = nk.h.g(nk.w0.b(), new t72(sd3Var, x72Var, null), uy1Var);
            if (objG == objF) {
                return objF;
            }
            oi oiVar4 = oiVar2;
            obj = objG;
            oiVar3 = oiVar4;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oiVar3 = uy1Var.f83693b;
            kotlin.c.b(obj);
        }
        sd3 sd3Var2 = (sd3) obj;
        if (sd3Var2 == null) {
            on1 on1Var = (on1) oiVar3.f81050c;
            if (on1Var.f81112c == null && on1Var.f81110a == null) {
                return null;
            }
        }
        on1 on1Var2 = (on1) oiVar3.f81050c;
        return new oi(oiVar3.f81048a, oiVar3.f81049b, new on1(on1Var2.f81110a, sd3Var2, on1Var2.f81112c), oiVar3.f81051d, oiVar3.f81052e, oiVar3.f81053f);
    }

    public yy1(dw2 dw2Var, x72 x72Var, s72 s72Var) {
        this.f85147a = dw2Var;
        this.f85148b = x72Var;
        this.f85149c = s72Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(Context context, ry1 ry1Var, rj.c cVar) {
        vy1 vy1Var;
        ry1 ry1Var2 = ry1Var;
        if (cVar instanceof vy1) {
            vy1Var = (vy1) cVar;
            int i10 = vy1Var.f84045e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vy1Var.f84045e = i10 - Integer.MIN_VALUE;
            } else {
                vy1Var = new vy1(this, cVar);
            }
        } else {
            vy1Var = new vy1(this, cVar);
        }
        Object objG = vy1Var.f84043c;
        Object objF = sj.a.f();
        int i11 = vy1Var.f84045e;
        if (i11 == 0) {
            kotlin.c.b(objG);
            nt2 nt2VarA = this.f85147a.a(context);
            if (nt2VarA == null || !nt2VarA.A0) {
                return ry1Var2;
            }
            List list = ry1Var2.f82466a.f76509a;
            vy1Var.f84042b = ry1Var2;
            vy1Var.f84045e = 1;
            objG = nk.h.g(nk.w0.b(), new xy1(list, this, null), vy1Var);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ry1Var2 = vy1Var.f84042b;
            kotlin.c.b(objG);
        }
        List list2 = (List) objG;
        if (list2 == null) {
            return null;
        }
        d12 d12Var = ry1Var2.f82466a;
        return new ry1(ry1Var2.f82467b, ry1Var2.f82468c, new d12(list2, d12Var.f76510b, d12Var.f76511c, d12Var.f76512d, d12Var.f76513e, d12Var.f76514f, d12Var.f76515g, d12Var.f76516h, d12Var.f76517i, d12Var.f76518j));
    }
}
