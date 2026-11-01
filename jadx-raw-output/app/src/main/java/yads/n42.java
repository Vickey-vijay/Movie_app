package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class n42 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q42 f80554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry1 f80555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n42(q42 q42Var, ry1 ry1Var, rj.c cVar) {
        super(2, cVar);
        this.f80554c = q42Var;
        this.f80555d = ry1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new n42(this.f80554c, this.f80555d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new n42(this.f80554c, this.f80555d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[EDGE_INSN: B:33:0x00b5->B:34:0x00c0 BREAK  A[LOOP:2: B:28:0x0093->B:51:?]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listK;
        Object objF = sj.a.f();
        int i10 = this.f80553b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            m52 m52Var = this.f80554c.f81706c;
            ry1 ry1Var = this.f80555d;
            this.f80553b = 1;
            m52Var.getClass();
            kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
            cVar.J();
            if (m52Var.f80089a != null) {
                k52 k52Var = m52Var.f80090b;
                k52Var.getClass();
                List<fy1> list = ry1Var.f82466a.f76509a;
                ArrayList arrayList = new ArrayList();
                for (fy1 fy1Var : list) {
                    k52Var.f79311a.getClass();
                    nj.x.C(arrayList, qn1.a(fy1Var));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sd3 sd3Var = ((on1) it.next()).f81111b;
                    if (sd3Var != null) {
                        listK = sd3Var.f82619a;
                    } else {
                        listK = null;
                    }
                    if (listK == null) {
                        listK = nj.s.k();
                    }
                    nj.x.C(arrayList2, listK);
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((je3) it2.next()).f79014b.f83434n.isEmpty()) {
                                m52Var.f80089a.a(new l52(cVar));
                                break;
                            }
                        } else {
                            Result.a aVar = Result.Companion;
                            cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
                            break;
                        }
                    }
                } else {
                    Result.a aVar2 = Result.Companion;
                    cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
                    break;
                }
            } else {
                Result.a aVar3 = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
                break;
            }
            Object objB = cVar.B();
            if (objB == sj.a.f()) {
                tj.f.c(this);
            }
            if (objB != sj.a.f()) {
                objB = mj.r.f64562a;
            }
            if (objB == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
