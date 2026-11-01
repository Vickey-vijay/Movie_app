package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class ge extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f77775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f77777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ie f77778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ie ieVar, rj.c cVar) {
        super(2, cVar);
        this.f77778e = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        ge geVar = new ge(this.f77778e, cVar);
        geVar.f77777d = obj;
        return geVar;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        ge geVar = new ge(this.f77778e, (rj.c) obj2);
        geVar.f77777d = (nk.l0) obj;
        return geVar.invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        nk.p0 p0Var;
        nk.p0 p0Var2;
        td tdVar;
        nk.p0 p0Var3;
        td tdVar2;
        Object objY;
        td tdVar3;
        uz0 uz0Var;
        String strC;
        uz0 uz0Var2;
        boolean z10;
        String str;
        String strC2;
        Object objF = sj.a.f();
        int i10 = this.f77776c;
        boolean z11 = true;
        String str2 = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        tdVar3 = (td) this.f77775b;
                        tdVar = (td) this.f77777d;
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    tdVar = (td) this.f77775b;
                    p0Var3 = (nk.p0) this.f77777d;
                    kotlin.c.b(obj);
                    tdVar2 = (td) obj;
                    this.f77777d = tdVar;
                    this.f77775b = tdVar2;
                    this.f77776c = 3;
                    objY = p0Var3.y(this);
                    if (objY == objF) {
                        return objF;
                    }
                    tdVar3 = tdVar2;
                    obj = objY;
                }
            } else {
                p0Var2 = (nk.p0) this.f77775b;
                p0Var = (nk.p0) this.f77777d;
                kotlin.c.b(obj);
            }
            String str3 = (String) obj;
            uz0Var = this.f77778e.f78600d;
            strC = ((tg1) uz0Var.f83700a).c("google_advertising_id_key");
            if (tdVar != null) {
                str2 = tdVar.f82966a;
            }
            if (strC == null && str2 != null) {
                ((tg1) uz0Var.f83700a).a("google_advertising_id_key", str2);
            }
            uz0Var2 = this.f77778e.f78600d;
            uz0Var2.getClass();
            z10 = false;
            if (tdVar != null && (str = tdVar.f82966a) != null) {
                synchronized (uz0.f83699b) {
                    strC2 = ((tg1) uz0Var2.f83700a).c("google_advertising_id_key");
                    if (strC2 != null || ck.p.e(str, strC2)) {
                        z11 = false;
                    }
                }
                z10 = z11;
            }
            return new vd(tdVar, tdVar3, z10, str3);
        }
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f77777d;
        nk.p0 p0VarB = nk.j.b(l0Var, null, null, new ee(this.f77778e, null), 3, null);
        nk.p0 p0VarB2 = nk.j.b(l0Var, null, null, new fe(this.f77778e, null), 3, null);
        nk.p0 p0VarB3 = nk.j.b(l0Var, null, null, new de(this.f77778e, null), 3, null);
        this.f77777d = p0VarB2;
        this.f77775b = p0VarB3;
        this.f77776c = 1;
        Object objY2 = p0VarB.y(this);
        if (objY2 == objF) {
            return objF;
        }
        p0Var = p0VarB2;
        p0Var2 = p0VarB3;
        obj = objY2;
        td tdVar4 = (td) obj;
        this.f77777d = p0Var2;
        this.f77775b = tdVar4;
        this.f77776c = 2;
        Object objY3 = p0Var.y(this);
        if (objY3 == objF) {
            return objF;
        }
        nk.p0 p0Var4 = p0Var2;
        tdVar = tdVar4;
        obj = objY3;
        p0Var3 = p0Var4;
        tdVar2 = (td) obj;
        this.f77777d = tdVar;
        this.f77775b = tdVar2;
        this.f77776c = 3;
        objY = p0Var3.y(this);
        if (objY == objF) {
            return objF;
        }
        tdVar3 = tdVar2;
        obj = objY;
        String str4 = (String) obj;
        uz0Var = this.f77778e.f78600d;
        strC = ((tg1) uz0Var.f83700a).c("google_advertising_id_key");
        if (tdVar != null) {
            str2 = tdVar.f82966a;
        }
        if (strC == null) {
            ((tg1) uz0Var.f83700a).a("google_advertising_id_key", str2);
        }
        uz0Var2 = this.f77778e.f78600d;
        uz0Var2.getClass();
        z10 = false;
        if (tdVar != null) {
            synchronized (uz0.f83699b) {
                strC2 = ((tg1) uz0Var2.f83700a).c("google_advertising_id_key");
                if (strC2 != null) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                z10 = z11;
            }
        }
        return new vd(tdVar, tdVar3, z10, str4);
    }
}
