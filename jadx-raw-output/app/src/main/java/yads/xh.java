package yads;

import android.content.Context;
import com.ironsource.Z7;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class xh extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f84592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lu2 f84593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(Context context, lu2 lu2Var, rj.c cVar) {
        super(2, cVar);
        this.f84592b = context;
        this.f84593c = lu2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new xh(this.f84592b, this.f84593c, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new xh(this.f84592b, this.f84593c, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        boolean z10 = ha3.f78156a;
        ha3.a(this.f84592b, ((iu3) this.f84593c).a());
        xf.a(this.f84592b, ((iu3) this.f84593c).a());
        AtomicBoolean atomicBoolean = ji.f79048a;
        ji.a(this.f84592b, ((iu3) this.f84593c).a());
        sh1 sh1Var = new sh1();
        Boolean boolA = sh1.a(this.f84592b);
        if (boolA != null) {
            tu1.b(boolA.booleanValue());
        }
        Boolean boolB = sh1.b(this.f84592b);
        if (boolB != null) {
            tu1.a(boolB.booleanValue());
        }
        if (ub.a(this.f84592b)) {
            zt1 zt1VarA = au1.a(this.f84592b);
            if (zt1VarA instanceof yt1) {
                lc1.a(new nc1().a((yt1) zt1VarA), new Object[0]);
            } else if (zt1VarA instanceof xt1) {
                lc1.b("Yandex Mobile Ads" + Z7.f27998r + "7.18.1 integrated successfully", new Object[0]);
            }
            cr1 cr1Var = new cr1();
            String str = pq1.f81538d;
            qr1.a(new tr1(cr1Var).a(new or1().a(mq1.a())));
        }
        ew2 ew2Var = new ew2(sh1Var, this.f84593c);
        j1.a(this.f84592b);
        ew2Var.a(this.f84592b);
        return mj.r.f64562a;
    }
}
