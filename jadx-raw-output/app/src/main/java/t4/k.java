package t4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g5.k0;
import g5.m;
import g5.p;
import java.util.Collections;
import java.util.List;
import k3.f0;
import k3.q0;

/* JADX INFO: compiled from: TextRenderer.java */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends k3.e implements Handler.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final Handler f72240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f72241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f72242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0 f72243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f72244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f72245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f72246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Format f72247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public f f72248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public h f72249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public i f72250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public i f72251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f72252y;

    public k(j jVar, @Nullable Looper looper) {
        this(jVar, looper, g.f72236a);
    }

    public final void B() {
        this.f72249v = null;
        this.f72252y = -1;
        i iVar = this.f72250w;
        if (iVar != null) {
            iVar.release();
            this.f72250w = null;
        }
        i iVar2 = this.f72251x;
        if (iVar2 != null) {
            iVar2.release();
            this.f72251x = null;
        }
    }

    @Override // k3.p0
    public boolean isReady() {
        return true;
    }

    @Override // k3.e
    public void n() {
        this.f72247t = null;
        x();
        C();
    }

    @Override // k3.e
    public void p(long j10, boolean z10) {
        this.f72244q = false;
        this.f72245r = false;
        E();
    }

    @Override // k3.e
    public void t(Format[] formatArr, long j10) {
        Format format = formatArr[0];
        this.f72247t = format;
        if (this.f72248u != null) {
            this.f72246s = 1;
        } else {
            this.f72248u = this.f72242o.b(format);
        }
    }

    public k(j jVar, @Nullable Looper looper, g gVar) {
        super(3);
        this.f72241n = (j) g5.a.e(jVar);
        this.f72240m = looper == null ? null : k0.w(looper, this);
        this.f72242o = gVar;
        this.f72243p = new f0();
    }

    public final void A(List<b> list) {
        this.f72241n.onCues(list);
    }

    public final void F(List<b> list) {
        Handler handler = this.f72240m;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A(list);
        }
    }

    @Override // k3.q0
    public int a(Format format) {
        if (this.f72242o.a(format)) {
            return q0.create(k3.e.w(null, format.f18973m) ? 4 : 2);
        }
        return p.m(format.f18970j) ? q0.create(1) : q0.create(0);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        A((List) message.obj);
        return true;
    }

    @Override // k3.p0
    public boolean isEnded() {
        return this.f72245r;
    }

    @Override // k3.p0
    public void render(long j10, long j11) throws Exception {
        boolean z10;
        if (this.f72245r) {
            return;
        }
        if (this.f72251x == null) {
            this.f72248u.setPositionUs(j10);
            try {
                this.f72251x = this.f72248u.dequeueOutputBuffer();
            } catch (SubtitleDecoderException e10) {
                z(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f72250w != null) {
            long jY = y();
            z10 = false;
            while (jY <= j10) {
                this.f72252y++;
                jY = y();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        i iVar = this.f72251x;
        if (iVar != null) {
            if (iVar.isEndOfStream()) {
                if (!z10 && y() == Long.MAX_VALUE) {
                    if (this.f72246s == 2) {
                        D();
                    } else {
                        B();
                        this.f72245r = true;
                    }
                }
            } else if (this.f72251x.timeUs <= j10) {
                i iVar2 = this.f72250w;
                if (iVar2 != null) {
                    iVar2.release();
                }
                i iVar3 = this.f72251x;
                this.f72250w = iVar3;
                this.f72251x = null;
                this.f72252y = iVar3.getNextEventTimeIndex(j10);
                z10 = true;
            }
        }
        if (z10) {
            F(this.f72250w.getCues(j10));
        }
        if (this.f72246s == 2) {
            return;
        }
        while (!this.f72244q) {
            try {
                if (this.f72249v == null) {
                    h hVarDequeueInputBuffer = this.f72248u.dequeueInputBuffer();
                    this.f72249v = hVarDequeueInputBuffer;
                    if (hVarDequeueInputBuffer == null) {
                        return;
                    }
                }
                if (this.f72246s == 1) {
                    this.f72249v.setFlags(4);
                    this.f72248u.queueInputBuffer(this.f72249v);
                    this.f72249v = null;
                    this.f72246s = 2;
                    return;
                }
                int iU = u(this.f72243p, this.f72249v, false);
                if (iU == -4) {
                    if (this.f72249v.isEndOfStream()) {
                        this.f72244q = true;
                    } else {
                        h hVar = this.f72249v;
                        hVar.f72237h = this.f72243p.f62129c.f18974n;
                        hVar.c();
                    }
                    this.f72248u.queueInputBuffer(this.f72249v);
                    this.f72249v = null;
                } else if (iU == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                z(e11);
                return;
            }
        }
    }

    public final long y() {
        int i10 = this.f72252y;
        if (i10 == -1 || i10 >= this.f72250w.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.f72250w.getEventTime(this.f72252y);
    }

    public final void z(SubtitleDecoderException subtitleDecoderException) {
        m.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f72247t, subtitleDecoderException);
        E();
    }

    public final void C() {
        B();
        this.f72248u.release();
        this.f72248u = null;
        this.f72246s = 0;
    }

    public final void D() {
        C();
        this.f72248u = this.f72242o.b(this.f72247t);
    }

    public final void E() {
        x();
        if (this.f72246s != 0) {
            D();
        } else {
            B();
            this.f72248u.flush();
        }
    }

    public final void x() {
        F(Collections.emptyList());
    }
}
