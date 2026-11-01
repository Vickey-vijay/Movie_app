package yads;

import android.os.Handler;
import android.os.Message;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ue2 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qe f83444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final se2 f83445c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c30 f83449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f83450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f83451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f83452j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap f83448f = new TreeMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f83447e = ib3.a((Handler.Callback) this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xm0 f83446d = new xm0();

    public final boolean a(long j10) {
        boolean z10;
        c30 c30Var = this.f83449g;
        if (!c30Var.f76128d) {
            return false;
        }
        if (this.f83451i) {
            return true;
        }
        Map.Entry entryCeilingEntry = this.f83448f.ceilingEntry(Long.valueOf(c30Var.f76132h));
        if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= j10) {
            z10 = false;
        } else {
            long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
            com.monetization.ads.exo.source.dash.i iVar = ((com.monetization.ads.exo.source.dash.c) this.f83445c).f42926a;
            long j11 = iVar.N;
            if (j11 == -9223372036854775807L || j11 < jLongValue) {
                iVar.N = jLongValue;
            }
            z10 = true;
        }
        if (z10 && this.f83450h) {
            this.f83451i = true;
            this.f83450h = false;
            com.monetization.ads.exo.source.dash.i iVar2 = ((com.monetization.ads.exo.source.dash.c) this.f83445c).f42926a;
            iVar2.D.removeCallbacks(iVar2.f42946w);
            iVar2.h();
        }
        return z10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.f83452j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        re2 re2Var = (re2) message.obj;
        long j10 = re2Var.f82246a;
        long j11 = re2Var.f82247b;
        Long l10 = (Long) this.f83448f.get(Long.valueOf(j11));
        if (l10 == null || l10.longValue() > j10) {
            this.f83448f.put(Long.valueOf(j11), Long.valueOf(j10));
        }
        return true;
    }

    public ue2(c30 c30Var, com.monetization.ads.exo.source.dash.c cVar, qe qeVar) {
        this.f83449g = c30Var;
        this.f83445c = cVar;
        this.f83444b = qeVar;
    }
}
