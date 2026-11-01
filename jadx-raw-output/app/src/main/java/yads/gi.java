package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes11.dex */
public final class gi extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hi f77806b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(hi hiVar, rj.c cVar) {
        super(2, cVar);
        this.f77806b = hiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new gi(this.f77806b, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new gi(this.f77806b, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sj.a.f();
        kotlin.c.b(obj);
        try {
            long jB = ((tg1) this.f77806b.f78242e.f79404a).b("ExitInfoAnrLastReportedTimestamp");
            hi hiVar = this.f77806b;
            ei eiVar = hiVar.f78240c;
            wf wfVar = hiVar.f78238a;
            List listA = eiVar.a(wfVar.f84181b, wfVar.f84182c, jB);
            if (listA.isEmpty()) {
                return mj.r.f64562a;
            }
            this.f77806b.f78244g.getClass();
            ArrayList arrayListA = mf.a(listA);
            if (arrayListA.isEmpty()) {
                return mj.r.f64562a;
            }
            ArrayList arrayListA2 = this.f77806b.f78244g.a(arrayListA);
            if (arrayListA2.isEmpty()) {
                return mj.r.f64562a;
            }
            this.f77806b.f78241d.a(arrayListA2);
            hi.a(this.f77806b, arrayListA2);
            return mj.r.f64562a;
        } finally {
            this.f77806b.f78245h.set(false);
        }
    }
}
