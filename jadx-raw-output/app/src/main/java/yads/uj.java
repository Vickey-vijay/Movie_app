package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class uj extends MediaCodec.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f83492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f83493c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f83498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaFormat f83499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f83500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f83501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f83502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f83503m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f83491a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sb1 f83494d = new sb1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sb1 f83495e = new sb1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f83496f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f83497g = new ArrayDeque();

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f83491a) {
            if (this.f83501k <= 0 && !this.f83502l) {
                IllegalStateException illegalStateException = this.f83503m;
                if (illegalStateException != null) {
                    this.f83503m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = this.f83500j;
                if (codecException != null) {
                    this.f83500j = null;
                    throw codecException;
                }
                sb1 sb1Var = this.f83495e;
                int i10 = sb1Var.f82580c;
                if (i10 == 0) {
                    return -1;
                }
                if (i10 == 0) {
                    throw new NoSuchElementException();
                }
                int[] iArr = sb1Var.f82581d;
                int i11 = sb1Var.f82578a;
                int i12 = iArr[i11];
                sb1Var.f82578a = (i11 + 1) & sb1Var.f82582e;
                sb1Var.f82580c = i10 - 1;
                if (i12 >= 0) {
                    if (this.f83498h == null) {
                        throw new IllegalStateException();
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f83496f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i12 == -2) {
                    this.f83498h = (MediaFormat) this.f83497g.remove();
                }
                return i12;
            }
            return -1;
        }
    }

    public final void b() {
        synchronized (this.f83491a) {
            if (this.f83502l) {
                return;
            }
            long j10 = this.f83501k - 1;
            this.f83501k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                a(new IllegalStateException());
                return;
            }
            if (!this.f83497g.isEmpty()) {
                this.f83499i = (MediaFormat) this.f83497g.getLast();
            }
            sb1 sb1Var = this.f83494d;
            sb1Var.f82578a = 0;
            sb1Var.f82579b = -1;
            sb1Var.f82580c = 0;
            sb1 sb1Var2 = this.f83495e;
            sb1Var2.f82578a = 0;
            sb1Var2.f82579b = -1;
            sb1Var2.f82580c = 0;
            this.f83496f.clear();
            this.f83497g.clear();
            this.f83500j = null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f83491a) {
            this.f83500j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f83491a) {
            this.f83494d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f83491a) {
            MediaFormat mediaFormat = this.f83499i;
            if (mediaFormat != null) {
                this.f83495e.a(-2);
                this.f83497g.add(mediaFormat);
                this.f83499i = null;
            }
            this.f83495e.a(i10);
            this.f83496f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f83491a) {
            this.f83495e.a(-2);
            this.f83497g.add(mediaFormat);
            this.f83499i = null;
        }
    }

    public uj(HandlerThread handlerThread) {
        this.f83492b = handlerThread;
    }

    public final void a() {
        synchronized (this.f83491a) {
            this.f83501k++;
            Handler handler = this.f83493c;
            int i10 = ib3.f78556a;
            handler.post(new Runnable() { // from class: cp.wa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51668b.b();
                }
            });
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.f83493c == null) {
            this.f83492b.start();
            Handler handler = new Handler(this.f83492b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.f83493c = handler;
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(IllegalStateException illegalStateException) {
        synchronized (this.f83491a) {
            this.f83503m = illegalStateException;
        }
    }
}
