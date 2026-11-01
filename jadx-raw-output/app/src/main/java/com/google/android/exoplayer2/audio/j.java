package com.google.android.exoplayer2.audio;

import g5.k0;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TrimmingAudioProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19111i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19112j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19113k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f19114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f19115m = k0.f53113f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19116n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f19117o;

    @Override // com.google.android.exoplayer2.audio.c
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f18991c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        this.f19113k = true;
        return (this.f19111i == 0 && this.f19112j == 0) ? AudioProcessor.a.f18988e : aVar;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void d() {
        if (this.f19113k) {
            this.f19113k = false;
            int i10 = this.f19112j;
            int i11 = this.f19069b.f18992d;
            this.f19115m = new byte[i10 * i11];
            this.f19114l = this.f19111i * i11;
        }
        this.f19116n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void e() {
        if (this.f19113k) {
            int i10 = this.f19116n;
            if (i10 > 0) {
                this.f19117o += (long) (i10 / this.f19069b.f18992d);
            }
            this.f19116n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.c
    public void f() {
        this.f19115m = k0.f53113f;
    }

    public long h() {
        return this.f19117o;
    }

    public void i() {
        this.f19117o = 0L;
    }

    public void j(int i10, int i11) {
        this.f19111i = i10;
        this.f19112j = i11;
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f19116n) > 0) {
            g(i10).put(this.f19115m, 0, this.f19116n).flip();
            this.f19116n = 0;
        }
        return super.getOutput();
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        if (super.isEnded() && this.f19116n == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f19114l);
        this.f19117o += (long) (iMin / this.f19069b.f18992d);
        this.f19114l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f19114l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f19116n + i11) - this.f19115m.length;
        ByteBuffer byteBufferG = g(length);
        int iQ = k0.q(length, 0, this.f19116n);
        byteBufferG.put(this.f19115m, 0, iQ);
        int iQ2 = k0.q(length - iQ, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iQ2);
        byteBufferG.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iQ2;
        int i13 = this.f19116n - iQ;
        this.f19116n = i13;
        byte[] bArr = this.f19115m;
        System.arraycopy(bArr, iQ, bArr, 0, i13);
        byteBuffer.get(this.f19115m, this.f19116n, i12);
        this.f19116n += i12;
        byteBufferG.flip();
    }
}
