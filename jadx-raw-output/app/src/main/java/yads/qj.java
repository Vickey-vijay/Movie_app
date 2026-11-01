package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class qj implements dk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f81864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj f81865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tj f81866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f81867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f81869f = 0;

    @Override // yads.dk1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f81865b.a(bufferInfo);
    }

    @Override // yads.dk1
    public final int b() {
        int i10;
        uj ujVar = this.f81865b;
        synchronized (ujVar.f83491a) {
            i10 = -1;
            if (ujVar.f83501k <= 0 && !ujVar.f83502l) {
                IllegalStateException illegalStateException = ujVar.f83503m;
                if (illegalStateException != null) {
                    ujVar.f83503m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = ujVar.f83500j;
                if (codecException != null) {
                    ujVar.f83500j = null;
                    throw codecException;
                }
                sb1 sb1Var = ujVar.f83494d;
                int i11 = sb1Var.f82580c;
                if (i11 != 0) {
                    if (i11 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = sb1Var.f82581d;
                    int i12 = sb1Var.f82578a;
                    i10 = iArr[i12];
                    sb1Var.f82578a = (i12 + 1) & sb1Var.f82582e;
                    sb1Var.f82580c = i11 - 1;
                }
            }
        }
        return i10;
    }

    @Override // yads.dk1
    public final void release() {
        try {
            if (this.f81869f == 1) {
                tj tjVar = this.f81866c;
                if (tjVar.f83070f) {
                    tjVar.a();
                    tjVar.f83066b.quit();
                }
                tjVar.f83070f = false;
                uj ujVar = this.f81865b;
                synchronized (ujVar.f83491a) {
                    ujVar.f83502l = true;
                    ujVar.f83492b.quit();
                    if (!ujVar.f83497g.isEmpty()) {
                        ujVar.f83499i = (MediaFormat) ujVar.f83497g.getLast();
                    }
                    sb1 sb1Var = ujVar.f83494d;
                    sb1Var.f82578a = 0;
                    sb1Var.f82579b = -1;
                    sb1Var.f82580c = 0;
                    sb1 sb1Var2 = ujVar.f83495e;
                    sb1Var2.f82578a = 0;
                    sb1Var2.f82579b = -1;
                    sb1Var2.f82580c = 0;
                    ujVar.f83496f.clear();
                    ujVar.f83497g.clear();
                    ujVar.f83500j = null;
                }
            }
            this.f81869f = 2;
            if (this.f81868e) {
                return;
            }
            this.f81864a.release();
            this.f81868e = true;
        } catch (Throwable th2) {
            if (!this.f81868e) {
                this.f81864a.release();
                this.f81868e = true;
            }
            throw th2;
        }
    }

    @Override // yads.dk1
    public final ByteBuffer a(int i10) {
        return this.f81864a.getInputBuffer(i10);
    }

    public final void c() {
        if (this.f81867d) {
            try {
                tj tjVar = this.f81866c;
                vy vyVar = tjVar.f83069e;
                synchronized (vyVar) {
                    vyVar.f84041a = false;
                }
                rj rjVar = tjVar.f83067c;
                rjVar.getClass();
                rjVar.obtainMessage(2).sendToTarget();
                tjVar.f83069e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // yads.dk1
    public final void flush() {
        this.f81866c.a();
        this.f81864a.flush();
        this.f81865b.a();
        this.f81864a.start();
    }

    public qj(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f81864a = mediaCodec;
        this.f81865b = new uj(handlerThread);
        this.f81866c = new tj(mediaCodec, handlerThread2);
        this.f81867d = z10;
    }

    @Override // yads.dk1
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        uj ujVar = this.f81865b;
        synchronized (ujVar.f83491a) {
            mediaFormat = ujVar.f83498h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // yads.dk1
    public final void setVideoScalingMode(int i10) {
        c();
        this.f81864a.setVideoScalingMode(i10);
    }

    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f81865b.a(this.f81864a);
        d73.a("configureCodec");
        this.f81864a.configure(mediaFormat, surface, mediaCrypto, 0);
        d73.a();
        tj tjVar = this.f81866c;
        if (!tjVar.f83070f) {
            tjVar.f83066b.start();
            tjVar.f83067c = new rj(tjVar, tjVar.f83066b.getLooper());
            tjVar.f83070f = true;
        }
        d73.a("startCodec");
        this.f81864a.start();
        d73.a();
        this.f81869f = 1;
    }

    @Override // yads.dk1
    public final ByteBuffer b(int i10) {
        return this.f81864a.getOutputBuffer(i10);
    }

    public final void a(ck1 ck1Var, MediaCodec mediaCodec, long j10, long j11) {
        al1 al1Var = (al1) ck1Var;
        al1Var.getClass();
        if (ib3.f78556a < 30) {
            al1Var.f75550b.sendMessageAtFrontOfQueue(Message.obtain(al1Var.f75550b, 0, (int) (j10 >> 32), (int) j10));
            return;
        }
        bl1 bl1Var = al1Var.f75551c;
        if (al1Var != bl1Var.f75876n1) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            bl1Var.f80237z0 = true;
            return;
        }
        try {
            bl1Var.b(j10);
            bl1Var.D();
            bl1Var.B0.f81323e++;
            bl1Var.V0 = true;
            if (!bl1Var.T0) {
                bl1Var.T0 = true;
                bl1Var.I0.a(bl1Var.P0);
                bl1Var.R0 = true;
            }
            bl1Var.a(j10);
        } catch (pn0 e10) {
            al1Var.f75551c.A0 = e10;
        }
    }

    @Override // yads.dk1
    public final void a(int i10, int i11, long j10, int i12) {
        tj tjVar = this.f81866c;
        RuntimeException runtimeException = (RuntimeException) tjVar.f83068d.getAndSet(null);
        if (runtimeException == null) {
            sj sjVarB = tj.b();
            sjVarB.f82662a = i10;
            sjVarB.f82663b = 0;
            sjVarB.f82664c = i11;
            sjVarB.f82666e = j10;
            sjVarB.f82667f = i12;
            rj rjVar = tjVar.f83067c;
            int i13 = ib3.f78556a;
            rjVar.obtainMessage(0, sjVarB).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // yads.dk1
    public final void a(int i10, m20 m20Var, long j10) {
        this.f81866c.a(i10, m20Var, j10);
    }

    @Override // yads.dk1
    public final void a(int i10, long j10) {
        this.f81864a.releaseOutputBuffer(i10, j10);
    }

    @Override // yads.dk1
    public final void a(boolean z10, int i10) {
        this.f81864a.releaseOutputBuffer(i10, z10);
    }

    @Override // yads.dk1
    public final void a(final ck1 ck1Var, Handler handler) {
        c();
        this.f81864a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: cp.v8
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f51641b.a(ck1Var, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // yads.dk1
    public final void a(Surface surface) {
        c();
        this.f81864a.setOutputSurface(surface);
    }

    @Override // yads.dk1
    public final void a(Bundle bundle) {
        c();
        this.f81864a.setParameters(bundle);
    }
}
