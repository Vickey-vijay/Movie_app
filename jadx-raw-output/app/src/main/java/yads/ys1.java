package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ys1 extends ro implements Handler.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vs1 f85098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final xs1 f85099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f85100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ws1 f85101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public dz2 f85102r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f85103s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f85104t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f85105u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f85106v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ts1 f85107w;

    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    public final void a(ts1 ts1Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ss1[] ss1VarArr = ts1Var.f83163b;
            if (i10 >= ss1VarArr.length) {
                return;
            }
            mx0 mx0VarA = ss1VarArr[i10].a();
            if (mx0VarA != null) {
                ((us1) this.f85098n).getClass();
                String str = mx0VarA.f80429m;
                if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
                    dz2 dz2VarA = ((us1) this.f85098n).a(mx0VarA);
                    byte[] bArrB = ts1Var.f83163b[i10].b();
                    bArrB.getClass();
                    this.f85101q.b();
                    this.f85101q.c(bArrB.length);
                    this.f85101q.f82568d.put(bArrB);
                    this.f85101q.c();
                    ts1 ts1VarA = dz2VarA.a(this.f85101q);
                    if (ts1VarA != null) {
                        a(ts1VarA, arrayList);
                    }
                } else {
                    arrayList.add(ts1Var.f83163b[i10]);
                }
            } else {
                arrayList.add(ts1Var.f83163b[i10]);
            }
            i10++;
        }
    }

    @Override // yads.ro
    public final String d() {
        return "MetadataRenderer";
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        this.f85107w = null;
        this.f85106v = -9223372036854775807L;
        this.f85102r = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys1(wn0 wn0Var, Looper looper) {
        super(5);
        us1 us1Var = vs1.f84001a;
        this.f85099o = (xs1) ni.a(wn0Var);
        this.f85100p = looper == null ? null : ib3.a(looper, (Handler.Callback) this);
        this.f85098n = (vs1) ni.a(us1Var);
        this.f85101q = new ws1();
        this.f85106v = -9223372036854775807L;
    }

    @Override // yads.ro
    public final boolean f() {
        return this.f85104t;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        ((wn0) this.f85099o).a((ts1) message.obj);
        return true;
    }

    @Override // yads.ro
    public final void a(long j10, boolean z10) {
        this.f85107w = null;
        this.f85106v = -9223372036854775807L;
        this.f85103s = false;
        this.f85104t = false;
    }

    @Override // yads.ro
    public final void a(mx0[] mx0VarArr, long j10, long j11) {
        this.f85102r = ((us1) this.f85098n).a(mx0VarArr[0]);
    }

    @Override // yads.ro
    public final void a(long j10, long j11) {
        boolean z10;
        do {
            z10 = false;
            if (!this.f85103s && this.f85107w == null) {
                this.f85101q.b();
                nx0 nx0Var = this.f82355c;
                nx0Var.f80853a = null;
                nx0Var.f80854b = null;
                int iA = a(nx0Var, this.f85101q, 0);
                if (iA == -4) {
                    if (this.f85101q.b(4)) {
                        this.f85103s = true;
                    } else {
                        ws1 ws1Var = this.f85101q;
                        ws1Var.f84303j = this.f85105u;
                        ws1Var.c();
                        dz2 dz2Var = this.f85102r;
                        int i10 = ib3.f78556a;
                        ts1 ts1VarA = dz2Var.a(this.f85101q);
                        if (ts1VarA != null) {
                            ArrayList arrayList = new ArrayList(ts1VarA.f83163b.length);
                            a(ts1VarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f85107w = new ts1(arrayList);
                                this.f85106v = this.f85101q.f82570f;
                            }
                        }
                    }
                } else if (iA == -5) {
                    mx0 mx0Var = nx0Var.f80854b;
                    mx0Var.getClass();
                    this.f85105u = mx0Var.f80433q;
                }
            }
            ts1 ts1Var = this.f85107w;
            if (ts1Var != null && this.f85106v <= j10) {
                Handler handler = this.f85100p;
                if (handler != null) {
                    handler.obtainMessage(0, ts1Var).sendToTarget();
                } else {
                    ((wn0) this.f85099o).a(ts1Var);
                }
                this.f85107w = null;
                this.f85106v = -9223372036854775807L;
                z10 = true;
            }
            if (this.f85103s && this.f85107w == null) {
                this.f85104t = true;
            }
        } while (z10);
    }

    @Override // yads.ro
    public final int a(mx0 mx0Var) {
        ((us1) this.f85098n).getClass();
        String str = mx0Var.f80429m;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return ro.a(0, 0, 0);
        }
        return ro.a(mx0Var.F == 0 ? 4 : 2, 0, 0);
    }
}
