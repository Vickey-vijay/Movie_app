package yads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class ii extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f78664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io2 f78665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nk.l0 f78666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(Context context, io2 io2Var, nk.l0 l0Var, rj.c cVar) {
        super(2, cVar);
        this.f78664b = context;
        this.f78665c = io2Var;
        this.f78666d = l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new ii(this.f78664b, this.f78665c, this.f78666d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((ii) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        int iIntValue2;
        boolean zBooleanValue;
        sj.a.f();
        kotlin.c.b(obj);
        try {
            if (ji.f79049b != null) {
                return mj.r.f64562a;
            }
            Object obj2 = dw2.f76819j;
            nt2 nt2VarA = cw2.a().a(this.f78664b);
            if (nt2VarA != null && nt2VarA.f80772i0) {
                Set setF = nt2VarA.f80782n0;
                if (setF == null) {
                    setF = nj.q0.f();
                }
                Integer num = nt2VarA.f80774j0;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 10;
                }
                Integer num2 = nt2VarA.f80776k0;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 91;
                }
                Boolean bool = nt2VarA.f80778l0;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                wf wfVar = new wf(setF, iIntValue, iIntValue2, zBooleanValue);
                ei eiVar = new ei(this.f78664b);
                fi fiVar = new fi(this.f78665c, zBooleanValue);
                kf kfVar = new kf(ug1.a(this.f78664b, "YadPreferenceFile"));
                AtomicBoolean atomicBoolean = ji.f79048a;
                ji.f79049b = new hi(wfVar, this.f78666d, eiVar, fiVar, kfVar, this.f78665c);
                hi hiVar = ji.f79049b;
                if (hiVar != null && !hiVar.f78245h.getAndSet(true)) {
                    nk.j.d(hiVar.f78239b, hiVar.f78243f, null, new gi(hiVar, null), 2, null);
                }
            }
            return mj.r.f64562a;
        } finally {
            ji.f79048a.set(false);
        }
    }
}
