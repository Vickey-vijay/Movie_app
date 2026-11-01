package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import g5.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import m3.o;

/* JADX INFO: compiled from: SonicAudioProcessor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f19097c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f19098d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f19099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioProcessor.a f19100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AudioProcessor.a f19101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AudioProcessor.a f19102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19103i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public o f19104j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f19105k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f19106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f19107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f19108n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f19109o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19110p;

    public long b(long j10) {
        long j11 = this.f19109o;
        if (j11 < 1024) {
            return (long) (((double) this.f19097c) * j10);
        }
        int i10 = this.f19102h.f18989a;
        int i11 = this.f19101g.f18989a;
        return i10 == i11 ? k0.y0(j10, this.f19108n, j11) : k0.y0(j10, this.f19108n * ((long) i10), j11 * ((long) i11));
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.f18991c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        int i10 = this.f19096b;
        if (i10 == -1) {
            i10 = aVar.f18989a;
        }
        this.f19099e = aVar;
        AudioProcessor.a aVar2 = new AudioProcessor.a(i10, aVar.f18990b, 2);
        this.f19100f = aVar2;
        this.f19103i = true;
        return aVar2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f19107m;
        this.f19107m = AudioProcessor.f18987a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f19100f.f18989a != -1 && (Math.abs(this.f19097c - 1.0f) >= 0.01f || Math.abs(this.f19098d - 1.0f) >= 0.01f || this.f19100f.f18989a != this.f19099e.f18989a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        o oVar;
        return this.f19110p && ((oVar = this.f19104j) == null || oVar.k() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        o oVar = this.f19104j;
        if (oVar != null) {
            oVar.r();
        }
        this.f19110p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        o oVar = (o) g5.a.e(this.f19104j);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f19108n += (long) iRemaining;
            oVar.s(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iK = oVar.k();
        if (iK > 0) {
            if (this.f19105k.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f19105k = byteBufferOrder;
                this.f19106l = byteBufferOrder.asShortBuffer();
            } else {
                this.f19105k.clear();
                this.f19106l.clear();
            }
            oVar.j(this.f19106l);
            this.f19109o += (long) iK;
            this.f19105k.limit(iK);
            this.f19107m = this.f19105k;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.f19097c = 1.0f;
        this.f19098d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f18988e;
        this.f19099e = aVar;
        this.f19100f = aVar;
        this.f19101g = aVar;
        this.f19102h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f18987a;
        this.f19105k = byteBuffer;
        this.f19106l = byteBuffer.asShortBuffer();
        this.f19107m = byteBuffer;
        this.f19096b = -1;
        this.f19103i = false;
        this.f19104j = null;
        this.f19108n = 0L;
        this.f19109o = 0L;
        this.f19110p = false;
    }

    public i() {
        AudioProcessor.a aVar = AudioProcessor.a.f18988e;
        this.f19099e = aVar;
        this.f19100f = aVar;
        this.f19101g = aVar;
        this.f19102h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f18987a;
        this.f19105k = byteBuffer;
        this.f19106l = byteBuffer.asShortBuffer();
        this.f19107m = byteBuffer;
        this.f19096b = -1;
    }

    public float c(float f10) {
        float fP = k0.p(f10, 0.1f, 8.0f);
        if (this.f19098d != fP) {
            this.f19098d = fP;
            this.f19103i = true;
        }
        return fP;
    }

    public float d(float f10) {
        float fP = k0.p(f10, 0.1f, 8.0f);
        if (this.f19097c != fP) {
            this.f19097c = fP;
            this.f19103i = true;
        }
        return fP;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.a aVar = this.f19099e;
            this.f19101g = aVar;
            AudioProcessor.a aVar2 = this.f19100f;
            this.f19102h = aVar2;
            if (this.f19103i) {
                this.f19104j = new o(aVar.f18989a, aVar.f18990b, this.f19097c, this.f19098d, aVar2.f18989a);
            } else {
                o oVar = this.f19104j;
                if (oVar != null) {
                    oVar.i();
                }
            }
        }
        this.f19107m = AudioProcessor.f18987a;
        this.f19108n = 0L;
        this.f19109o = 0L;
        this.f19110p = false;
    }
}
