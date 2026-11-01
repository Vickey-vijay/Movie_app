package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class p42 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk.p0 f81242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f81244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f81245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hz1 f81246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jz1 f81247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q42 f81248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d4 f81249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ry1 f81250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ z30 f81251k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p42(Context context, hz1 hz1Var, jz1 jz1Var, q42 q42Var, d4 d4Var, ry1 ry1Var, z30 z30Var, rj.c cVar) {
        super(2, cVar);
        this.f81245e = context;
        this.f81246f = hz1Var;
        this.f81247g = jz1Var;
        this.f81248h = q42Var;
        this.f81249i = d4Var;
        this.f81250j = ry1Var;
        this.f81251k = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        p42 p42Var = new p42(this.f81245e, this.f81246f, this.f81247g, this.f81248h, this.f81249i, this.f81250j, this.f81251k, cVar);
        p42Var.f81244d = obj;
        return p42Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((p42) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        mi2 mi2Var;
        nk.p0 p0VarB;
        mi2 mi2Var2;
        ry1 ry1Var;
        Object objF = sj.a.f();
        int i10 = this.f81243c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    mi2 mi2Var3 = (mi2) this.f81244d;
                    kotlin.c.b(obj);
                    mi2Var2 = mi2Var3;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nk.p0 p0Var = this.f81242b;
                mi2 mi2Var4 = (mi2) this.f81244d;
                kotlin.c.b(obj);
                p0VarB = p0Var;
                mi2Var = mi2Var4;
            }
            ry1Var = (ry1) obj;
            if (ry1Var == null) {
                this.f81246f.a(h9.f78123w);
            } else {
                jz1 jz1Var = this.f81247g;
                jz1Var.f79250b.a(v5.f83754n);
                kz1 kz1Var = jz1Var.f79251c;
                mz1 mz1Var = kz1Var.f79630g;
                nk.j.d(mz1Var.f80481d, null, null, new iz1(mz1Var, ry1Var, mi2Var2, kz1Var, jz1Var, null), 3, null);
            }
            return mj.r.f64562a;
        }
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f81244d;
        mi2Var = new mi2(this.f81245e);
        p0VarB = nk.j.b(l0Var, null, null, new o42(this.f81248h, this.f81249i, this.f81245e, this.f81250j, mi2Var, this.f81251k, null), 3, null);
        kotlinx.coroutines.g gVarD = nk.j.d(l0Var, null, null, new n42(this.f81248h, this.f81250j, null), 3, null);
        this.f81244d = mi2Var;
        this.f81242b = p0VarB;
        this.f81243c = 1;
        if (gVarD.o(this) == objF) {
            return objF;
        }
        this.f81244d = mi2Var;
        this.f81242b = null;
        this.f81243c = 2;
        obj = p0VarB.y(this);
        if (obj == objF) {
            return objF;
        }
        mi2Var2 = mi2Var;
        ry1Var = (ry1) obj;
        if (ry1Var == null) {
            this.f81246f.a(h9.f78123w);
        } else {
            jz1 jz1Var2 = this.f81247g;
            jz1Var2.f79250b.a(v5.f83754n);
            kz1 kz1Var2 = jz1Var2.f79251c;
            mz1 mz1Var2 = kz1Var2.f79630g;
            nk.j.d(mz1Var2.f80481d, null, null, new iz1(mz1Var2, ry1Var, mi2Var2, kz1Var2, jz1Var2, null), 3, null);
        }
        return mj.r.f64562a;
    }
}
