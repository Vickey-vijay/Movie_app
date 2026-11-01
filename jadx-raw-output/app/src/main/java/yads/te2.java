package yads;

import android.os.Handler;
import androidx.exifinterface.media.ExifInterface;

/* JADX INFO: loaded from: classes11.dex */
public final class te2 implements m73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ms2 f83002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx0 f83003b = new nx0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ws1 f83004c = new ws1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f83005d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ue2 f83006e;

    @Override // yads.m73
    public final void a(mx0 mx0Var) {
        this.f83002a.a(mx0Var);
    }

    public te2(ue2 ue2Var, qe qeVar) {
        this.f83006e = ue2Var;
        this.f83002a = ms2.a(qeVar);
    }

    @Override // yads.m73
    public final int a(l30 l30Var, int i10, boolean z10) {
        return this.f83002a.b(l30Var, i10, z10);
    }

    @Override // yads.m73
    public final void a(int i10, jb2 jb2Var) {
        this.f83002a.b(i10, jb2Var);
    }

    @Override // yads.m73
    public final void a(long j10, int i10, int i11, int i12, l73 l73Var) {
        long jA;
        ws1 ws1Var;
        long jF;
        this.f83002a.a(j10, i10, i11, i12, l73Var);
        while (this.f83002a.a(false)) {
            this.f83004c.b();
            if (this.f83002a.a(this.f83003b, (sa0) this.f83004c, 0, false) == -4) {
                this.f83004c.c();
                ws1Var = this.f83004c;
            } else {
                ws1Var = null;
            }
            if (ws1Var != null) {
                long j11 = ws1Var.f82570f;
                ts1 ts1VarA = this.f83006e.f83446d.a(ws1Var);
                if (ts1VarA != null) {
                    wm0 wm0Var = (wm0) ts1VarA.f83163b[0];
                    String str = wm0Var.f84265b;
                    String str2 = wm0Var.f84266c;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || ExifInterface.GPS_MEASUREMENT_3D.equals(str2))) {
                        try {
                            jF = ib3.f(ib3.a(wm0Var.f84269f));
                        } catch (ob2 unused) {
                            jF = -9223372036854775807L;
                        }
                        if (jF != -9223372036854775807L) {
                            re2 re2Var = new re2(j11, jF);
                            Handler handler = this.f83006e.f83447e;
                            handler.sendMessage(handler.obtainMessage(1, re2Var));
                        }
                    }
                }
            }
        }
        ms2 ms2Var = this.f83002a;
        is2 is2Var = ms2Var.f80350a;
        synchronized (ms2Var) {
            int i13 = ms2Var.f80368s;
            jA = i13 == 0 ? -1L : ms2Var.a(i13);
        }
        is2Var.a(jA);
    }
}
