package yads;

import io.bidmachine.unified.UnifiedMediationParams;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f77405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77406b;

    public final void a(ArrayList arrayList) {
        Map mapR;
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            nb2 nb2Var = (nb2) it.next();
            if (this.f77406b) {
                mj.g gVar = of.f81025a;
                lf lfVar = nb2Var.f80619a;
                Pair pairA = mj.h.a(new Thread("ApplicationExitInfoDetails"), new StackTraceElement[]{new StackTraceElement("ExitInfo", "timestamp", ((SimpleDateFormat) of.f81025a.getValue()).format(new Date(lfVar.f79765a)), 0), new StackTraceElement("ExitInfo", UnifiedMediationParams.KEY_DESCRIPTION, lfVar.f79766b, 0), new StackTraceElement("Memory", "pss", of.a(lfVar.f79770f), 0), new StackTraceElement("Memory", "rss", of.a(lfVar.f79771g), 0), new StackTraceElement("Process", "name", lfVar.f79772h, 0), new StackTraceElement("Process", "pid", String.valueOf(lfVar.f79769e), 0), new StackTraceElement("Process", "importance", String.valueOf(lfVar.f79768d), 0), new StackTraceElement("Process", "uid", String.valueOf(lfVar.f79774j), 0), new StackTraceElement("Process", "status", String.valueOf(lfVar.f79773i), 0)});
                mapR = kotlin.collections.a.r(nb2Var.f80620b, mj.h.a((Thread) pairA.component1(), (StackTraceElement[]) pairA.component2()));
            } else {
                mapR = nb2Var.f80620b;
            }
            this.f77405a.reportAnr(mapR);
        }
    }

    public fi(io2 io2Var, boolean z10) {
        this.f77405a = io2Var;
        this.f77406b = z10;
    }
}
