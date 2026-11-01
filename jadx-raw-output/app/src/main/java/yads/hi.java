package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf f78238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk.l0 f78239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei f78240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fi f78241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kf f78242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y10 f78243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mf f78244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f78245h = new AtomicBoolean(false);

    public hi(wf wfVar, nk.l0 l0Var, ei eiVar, fi fiVar, kf kfVar, io2 io2Var) {
        this.f78238a = wfVar;
        this.f78239b = l0Var;
        this.f78240c = eiVar;
        this.f78241d = fiVar;
        this.f78242e = kfVar;
        this.f78243f = new y10(io2Var);
        this.f78244g = new mf(wfVar.a());
    }

    public static final void a(hi hiVar, ArrayList arrayList) {
        Long l10;
        hiVar.getClass();
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            l10 = null;
        } else {
            Long lValueOf = Long.valueOf(((nb2) it.next()).f80619a.f79765a);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((nb2) it.next()).f80619a.f79765a);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        }
        if (l10 != null) {
            long jLongValue = l10.longValue();
            long jB = ((tg1) hiVar.f78242e.f79404a).b("ExitInfoAnrLastReportedTimestamp");
            kf kfVar = hiVar.f78242e;
            ((tg1) kfVar.f79404a).a("ExitInfoAnrLastReportedTimestamp", Math.max(jB, jLongValue));
        }
    }
}
