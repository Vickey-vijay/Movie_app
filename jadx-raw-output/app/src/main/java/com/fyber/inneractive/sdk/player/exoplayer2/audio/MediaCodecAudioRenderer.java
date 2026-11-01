package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
@TargetApi(16)
public class MediaCodecAudioRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c implements com.fyber.inneractive.sdk.player.exoplayer2.util.h {
    public final AudioRendererEventListener.EventDispatcher P;
    public final r Q;
    public boolean R;
    public int S;
    public int T;
    public long U;
    public boolean V;

    public MediaCodecAudioRenderer() {
        super(1, true);
        this.Q = new r(new c[0], new u(this));
        this.P = new AudioRendererEventListener.EventDispatcher(null, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        String str = oVar.f17504f;
        this.Q.getClass();
        String str2 = oVar.f17504f;
        dVar.getClass();
        return com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(false, str2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i10;
        int i11;
        String str = oVar.f17504f;
        if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        int i12 = z.f17873a;
        int i13 = i12 >= 21 ? 16 : 0;
        this.Q.getClass();
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(false, str);
        if (aVarA == null) {
            return 1;
        }
        return ((i12 < 21 || (((i10 = oVar.f17517s) == -1 || aVarA.b(i10)) && ((i11 = oVar.f17516r) == -1 || aVarA.a(i11)))) ? 3 : 2) | i13 | 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        try {
            r rVar = this.Q;
            rVar.g();
            for (c cVar : rVar.f16336c) {
                cVar.f();
            }
            rVar.Z = 0;
            rVar.Y = false;
            try {
                this.f17439n = null;
                o();
            } finally {
                this.N.ensureUpdated();
                this.P.disabled(this.N);
            }
        } catch (Throwable th2) {
            try {
                this.f17439n = null;
                o();
                throw th2;
            } finally {
                this.N.ensureUpdated();
                this.P.disabled(this.N);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean e() {
        if (this.L) {
            r rVar = this.Q;
            if (!rVar.d() || (rVar.X && !rVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        return this.Q.c() || super.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.N = decoderCounters;
        this.P.enabled(decoderCounters);
        int i10 = this.f16285b.f17632a;
        if (i10 == 0) {
            r rVar = this.Q;
            if (rVar.f16333a0) {
                rVar.f16333a0 = false;
                rVar.Z = 0;
                rVar.g();
                return;
            }
            return;
        }
        r rVar2 = this.Q;
        rVar2.getClass();
        if (z.f17873a < 21) {
            throw new IllegalStateException();
        }
        if (rVar2.f16333a0 && rVar2.Z == i10) {
            return;
        }
        rVar2.f16333a0 = true;
        rVar2.Z = i10;
        rVar2.g();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.Q.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        r rVar = this.Q;
        rVar.Y = false;
        if (rVar.d()) {
            rVar.f16360z = 0L;
            rVar.f16359y = 0;
            rVar.f16358x = 0;
            rVar.A = 0L;
            rVar.B = false;
            rVar.C = 0L;
            rVar.f16341g.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void p() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        try {
            r rVar = this.Q;
            if (!rVar.X && rVar.d() && rVar.a()) {
                rVar.f16341g.a(rVar.b());
                rVar.f16357w = 0;
                rVar.X = true;
            }
        } catch (q e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        String str = aVar.f17428a;
        if (z.f17873a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(z.f17875c)) {
            String str2 = z.f17874b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.R = z10;
        mediaCodec.configure(oVar.a(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long jA = this.Q.a(e());
        if (jA != Long.MIN_VALUE) {
            if (!this.V) {
                jA = Math.max(this.U, jA);
            }
            this.U = jA;
            this.V = false;
        }
        return this.U;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j10, long j11) {
        this.P.decoderInitialized(str, j10, j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.P.inputFormatChanged(oVar);
        this.S = "audio/raw".equals(oVar.f17504f) ? oVar.f17518t : 2;
        this.T = oVar.f17516r;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        int[] iArr;
        int i10;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.R && integer == 6 && (i10 = this.T) < 6) {
            iArr = new int[i10];
            for (int i11 = 0; i11 < this.T; i11++) {
                iArr[i11] = i11;
            }
        } else {
            iArr = null;
        }
        try {
            this.Q.a(integer, integer2, this.S, iArr);
        } catch (m e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z10, j10);
        this.Q.g();
        this.U = j10;
        this.V = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        return this.Q.a(sVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.Q.f16353s;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.N.skippedOutputBufferCount++;
            r rVar = this.Q;
            if (rVar.L == 1) {
                rVar.L = 2;
            }
            return true;
        }
        try {
            if (!this.Q.a(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.N.renderedOutputBufferCount++;
            return true;
        } catch (n | q e10) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i10, Object obj) {
        if (i10 == 2) {
            r rVar = this.Q;
            float fFloatValue = ((Float) obj).floatValue();
            if (rVar.P != fFloatValue) {
                rVar.P = fFloatValue;
                rVar.i();
                return;
            }
            return;
        }
        if (i10 != 3) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        r rVar2 = this.Q;
        if (rVar2.f16348n == iIntValue) {
            return;
        }
        rVar2.f16348n = iIntValue;
        if (rVar2.f16333a0) {
            return;
        }
        rVar2.g();
        rVar2.Z = 0;
    }
}
