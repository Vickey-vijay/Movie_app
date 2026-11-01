package sg.bigo.ads.common.utils;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes9.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f70012a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f70014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f70015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f70016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f70017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f70018h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f70019i = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"HandlerLeak"})
    private final Handler f70013b = new Handler() { // from class: sg.bigo.ads.common.utils.n.1
        /* JADX WARN: Code duplicated, block: B:17:0x0039 A[Catch: all -> 0x005d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x000e, B:11:0x001c, B:22:0x0059, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:20:0x003f, B:21:0x0045, B:17:0x0039, B:24:0x005b), top: B:29:0x0003 }] */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            long j10;
            synchronized (n.this) {
                n nVar = n.this;
                if (!nVar.f70018h && !nVar.f70019i) {
                    long jElapsedRealtime = nVar.f70015e - SystemClock.elapsedRealtime();
                    if (jElapsedRealtime <= 0) {
                        n nVar2 = n.this;
                        nVar2.f70019i = true;
                        nVar2.a();
                    } else {
                        n nVar3 = n.this;
                        long j11 = nVar3.f70016f;
                        if (j11 > 0) {
                            long j12 = nVar3.f70017g;
                            if (j12 > 0) {
                                j10 = nVar3.f70014d - (j12 - j11);
                                nVar3.f70017g = 0L;
                            } else {
                                j10 = nVar3.f70014d;
                            }
                        } else {
                            j10 = nVar3.f70014d;
                        }
                        while (j10 < 0) {
                            j10 += n.this.f70014d;
                        }
                        n.this.a(jElapsedRealtime);
                        n.this.f70016f = SystemClock.elapsedRealtime();
                        sendMessageDelayed(obtainMessage(1), j10);
                    }
                }
            }
        }
    };

    public n(long j10, long j11) {
        this.f70014d = j11;
        this.f70012a = j10;
    }

    public abstract void a();

    public abstract void a(long j10);

    public final synchronized void b() {
        this.f70018h = true;
        this.f70013b.removeMessages(1);
    }

    public final synchronized n c() {
        this.f70018h = false;
        if (this.f70012a <= 0) {
            if (!this.f70019i) {
                this.f70019i = true;
                a();
            }
            return this;
        }
        this.f70015e = SystemClock.elapsedRealtime() + this.f70012a;
        Handler handler = this.f70013b;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    public final void d() {
        if (this.f70019i || this.f70018h) {
            return;
        }
        b();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f70017g = jElapsedRealtime;
        this.f70012a = this.f70015e - jElapsedRealtime;
    }

    public final boolean e() {
        return !this.f70019i && this.f70018h;
    }
}
