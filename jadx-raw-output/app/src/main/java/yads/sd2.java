package yads;

import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes10.dex */
public final class sd2 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ud2 f82618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd2(ud2 ud2Var, rj.c cVar) {
        super(2, cVar);
        this.f82618c = ud2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new sd2(this.f82618c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new sd2(this.f82618c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f82617b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            ud2 ud2Var = this.f82618c;
            this.f82617b = 1;
            kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
            cVar.J();
            try {
                Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(ud2Var.f83420a.getApplicationContext()).getAppSetIdInfo();
                final qd2 qd2Var = new qd2(cVar);
                appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: yads.td2
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(Object obj2) {
                        qd2Var.invoke(obj2);
                    }
                }).addOnFailureListener(new rd2(cVar));
            } catch (Throwable unused) {
                cVar.K(null, null);
            }
            obj = cVar.B();
            if (obj == sj.a.f()) {
                tj.f.c(this);
            }
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
