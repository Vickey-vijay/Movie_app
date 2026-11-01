package yads;

import android.content.Context;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class i42 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk.p0 f78486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f78488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d4 f78489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j42 f78490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f78491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ry1 f78492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z30 f78493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ mi2 f78494j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i42(d4 d4Var, j42 j42Var, Context context, ry1 ry1Var, z30 z30Var, mi2 mi2Var, rj.c cVar) {
        super(2, cVar);
        this.f78489e = d4Var;
        this.f78490f = j42Var;
        this.f78491g = context;
        this.f78492h = ry1Var;
        this.f78493i = z30Var;
        this.f78494j = mi2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        i42 i42Var = new i42(this.f78489e, this.f78490f, this.f78491g, this.f78492h, this.f78493i, this.f78494j, cVar);
        i42Var.f78488d = obj;
        return i42Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((i42) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlinx.coroutines.g gVarD;
        nk.p0 p0Var;
        Object objF = sj.a.f();
        int i10 = this.f78487c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            kotlin.c.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                } else {
                    p0Var = (nk.p0) this.f78488d;
                    kotlin.c.b(obj);
                }
            } else {
                p0Var = this.f78486b;
                gVarD = (kotlinx.coroutines.g) this.f78488d;
                kotlin.c.b(obj);
                this.f78488d = p0Var;
                this.f78486b = null;
                this.f78487c = 2;
                if (gVarD.o(this) == objF) {
                    return objF;
                }
            }
            return obj;
        }
        kotlin.c.b(obj);
        nk.l0 l0Var = (nk.l0) this.f78488d;
        if (this.f78489e.f76571m) {
            kotlinx.coroutines.g gVarD2 = nk.j.d(l0Var, null, null, new f42(this.f78490f, this.f78492h, this.f78494j, null), 3, null);
            gVarD = nk.j.d(l0Var, null, null, new h42(this.f78490f, this.f78491g, this.f78492h, null), 3, null);
            nk.p0 p0VarB = nk.j.b(l0Var, null, null, new g42(this.f78490f, this.f78491g, this.f78492h, this.f78493i, null), 3, null);
            this.f78488d = gVarD;
            this.f78486b = p0VarB;
            this.f78487c = 1;
            if (gVarD2.o(this) == objF) {
                return objF;
            }
            p0Var = p0VarB;
            this.f78488d = p0Var;
            this.f78486b = null;
            this.f78487c = 2;
            if (gVarD.o(this) == objF) {
                return objF;
            }
        } else {
            h62 h62Var = this.f78490f.f78914c;
            Context context = this.f78491g;
            ry1 ry1Var = this.f78492h;
            z30 z30Var = this.f78493i;
            this.f78487c = 4;
            obj = h62Var.a(false, context, ry1Var, z30Var, (rj.c) this);
            if (obj == objF) {
                return objF;
            }
            return obj;
        }
        this.f78488d = null;
        this.f78487c = 3;
        obj = p0Var.y(this);
        if (obj == objF) {
            return objF;
        }
        return obj;
    }
}
