package yads;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class sz1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tz1 f82839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f82840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz1(tz1 tz1Var, View view, rj.c cVar) {
        super(2, cVar);
        this.f82839c = tz1Var;
        this.f82840d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new sz1(this.f82839c, this.f82840d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new sz1(this.f82839c, this.f82840d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        Object objF = sj.a.f();
        int i10 = this.f82838b;
        if (i10 == 0) {
            kotlin.c.b(obj);
            tz1 tz1Var = this.f82839c;
            y3 y3Var = tz1Var.f83256b;
            View view = this.f82840d;
            oi oiVar = tz1Var.f83255a;
            if1 if1Var = tz1Var.f83259e;
            l12 l12Var = tz1Var.f83257c;
            this.f82838b = 1;
            x3 x3Var = (x3) y3Var;
            f1 f1Var = x3Var.f84433d.f83702b;
            e1 e1Var = new e1(f1Var.f77262e, f1Var.f77258a, f1Var.f77259b, f1Var.f77260c, f1Var.f77261d, if1Var.f78622b);
            f1Var.f77263f = e1Var;
            i22 i22Var = f1Var.f77264g;
            if (i22Var != null) {
                f1Var.f77264g = i22Var;
                e1Var.f76876b.f78445k = i22Var;
            }
            Context context = view.getContext();
            z9 z9Var = x3Var.f84438i.f82524a;
            zy1 zy1Var = x3Var.f84436g;
            lv lvVar = new lv(zy1Var.f85657c, zy1Var.f85655a, new az1(oiVar.f81048a, zy1Var.f85659e, l12Var.f79681b), ((iu3) zy1Var.f85656b).a(), new sx(), new we(zy1Var.f85658d));
            p53 p53Var = x3Var.f84434e;
            lu2 lu2Var = x3Var.f84430a;
            d4 d4Var = x3Var.f84432c;
            v9 v9Var = x3Var.f84431b;
            p53Var.getClass();
            Object obj2 = dw2.f76819j;
            nt2 nt2VarA = cw2.a().a(context);
            if (nt2VarA != null) {
                boolean z10 = nt2VarA.f80765f;
            }
            p2 p2Var = new p2(lu2Var);
            lm0 lm0Var = lm0.f79847c;
            eb0 eb0Var = new eb0(context, d4Var, v9Var, z9Var, p2Var, km0.a(context));
            za zaVar = x3Var.f84435f;
            l42 l42Var = new l42(zaVar, eb0Var);
            objA = x3Var.a(view, if1Var, new v0(new p0(x3Var.f84432c, x3Var.f84430a, x3Var.f84431b, lvVar, l42Var, l12Var, x3Var.f84433d, x3Var.f84437h)), new k42(zaVar, eb0Var, lvVar), this);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            objA = obj;
        }
        if (((o01) objA).f80879a) {
            this.f82839c.f83260f.a();
        }
        return mj.r.f64562a;
    }
}
