package com.google.android.exoplayer2.audio;

import g5.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: SilenceSkippingAudioProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f19084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f19085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f19086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f19088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f19089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f19090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f19091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f19092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f19095t;

    public h() {
        this(150000L, 20000L, (short) 1024);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void f() {
        this.f19088m = false;
        this.f19093r = 0;
        byte[] bArr = k0.f53113f;
        this.f19089n = bArr;
        this.f19090o = bArr;
    }

    public h(long j10, long j11, short s10) {
        g5.a.a(j11 <= j10);
        this.f19084i = j10;
        this.f19085j = j11;
        this.f19086k = s10;
        byte[] bArr = k0.f53113f;
        this.f19089n = bArr;
        this.f19090o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f18991c == 2) {
            return this.f19088m ? aVar : AudioProcessor.a.f18988e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void d() {
        if (this.f19088m) {
            this.f19087l = this.f19069b.f18992d;
            int iH = h(this.f19084i) * this.f19087l;
            if (this.f19089n.length != iH) {
                this.f19089n = new byte[iH];
            }
            int iH2 = h(this.f19085j) * this.f19087l;
            this.f19093r = iH2;
            if (this.f19090o.length != iH2) {
                this.f19090o = new byte[iH2];
            }
        }
        this.f19091p = 0;
        this.f19095t = 0L;
        this.f19092q = 0;
        this.f19094s = false;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void e() {
        int i10 = this.f19092q;
        if (i10 > 0) {
            m(this.f19089n, i10);
        }
        if (this.f19094s) {
            return;
        }
        this.f19095t += (long) (this.f19093r / this.f19087l);
    }

    public final int h(long j10) {
        return (int) ((j10 * ((long) this.f19069b.f18989a)) / 1000000);
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f19088m;
    }

    public long k() {
        return this.f19095t;
    }

    public void q(boolean z10) {
        this.f19088m = z10;
    }

    public final int i(ByteBuffer byteBuffer) {
        boolean z10;
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.a(z10);
        int iLimit = byteBuffer.limit();
        do {
            iLimit -= 2;
            if (iLimit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(iLimit)) <= this.f19086k);
        int i10 = this.f19087l;
        return ((iLimit / i10) * i10) + i10;
    }

    public final int j(ByteBuffer byteBuffer) {
        boolean z10;
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.a(z10);
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f19086k) {
                int i10 = this.f19087l;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    public final void l(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        g(iRemaining).put(byteBuffer).flip();
        if (iRemaining > 0) {
            this.f19094s = true;
        }
    }

    public final void m(byte[] bArr, int i10) {
        g(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f19094s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iJ = j(byteBuffer);
        int iPosition = iJ - byteBuffer.position();
        byte[] bArr = this.f19089n;
        int length = bArr.length;
        int i10 = this.f19092q;
        int i11 = length - i10;
        if (iJ < iLimit && iPosition < i11) {
            m(bArr, i10);
            this.f19092q = 0;
            this.f19091p = 0;
            return;
        }
        int iMin = Math.min(iPosition, i11);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f19089n, this.f19092q, iMin);
        int i12 = this.f19092q + iMin;
        this.f19092q = i12;
        byte[] bArr2 = this.f19089n;
        if (i12 == bArr2.length) {
            if (this.f19094s) {
                m(bArr2, this.f19093r);
                this.f19095t += (long) ((this.f19092q - (this.f19093r * 2)) / this.f19087l);
            } else {
                this.f19095t += (long) ((i12 - this.f19093r) / this.f19087l);
            }
            r(byteBuffer, this.f19089n, this.f19092q);
            this.f19092q = 0;
            this.f19091p = 2;
        }
        byteBuffer.limit(iLimit);
    }

    public final void o(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f19089n.length));
        int i10 = i(byteBuffer);
        if (i10 == byteBuffer.position()) {
            this.f19091p = 1;
        } else {
            byteBuffer.limit(i10);
            l(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    public final void p(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iJ = j(byteBuffer);
        byteBuffer.limit(iJ);
        this.f19095t += (long) (byteBuffer.remaining() / this.f19087l);
        r(byteBuffer, this.f19090o, this.f19093r);
        if (iJ < iLimit) {
            m(this.f19090o, this.f19093r);
            this.f19091p = 0;
            byteBuffer.limit(iLimit);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !b()) {
            int i10 = this.f19091p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        p(byteBuffer);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    n(byteBuffer);
                }
            } else {
                o(byteBuffer);
            }
        }
    }

    public final void r(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f19093r);
        int i11 = this.f19093r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f19090o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f19090o, i11, iMin);
    }
}
