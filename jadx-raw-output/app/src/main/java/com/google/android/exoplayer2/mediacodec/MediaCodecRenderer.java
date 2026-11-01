package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSession;
import g5.f0;
import g5.h0;
import g5.k0;
import g5.m;
import g5.q;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import k3.e;
import k3.k;
import o3.d;
import p3.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MediaCodecRenderer extends e {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final byte[] f19194v0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    @Nullable
    public DrmSession<j> A;

    @Nullable
    public MediaCrypto B;
    public boolean C;
    public long D;
    public float E;

    @Nullable
    public MediaCodec F;

    @Nullable
    public Format G;
    public float H;

    @Nullable
    public ArrayDeque<a> I;

    @Nullable
    public DecoderInitializationException J;

    @Nullable
    public a K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public ByteBuffer[] W;
    public ByteBuffer[] X;
    public long Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f19195a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ByteBuffer f19196b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f19197c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f19198d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f19199e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f19200f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f19201g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f19202h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f19203i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f19204j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f19205k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f19206l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f19207m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f19208m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.drm.a<j> f19209n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f19210n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19211o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f19212o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f19213p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f19214p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f19215q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f19216q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o3.e f19217r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f19218r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o3.e f19219s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f19220s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0<Format> f19221t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f19222t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList<Long> f19223u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public d f19224u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MediaCodec.BufferInfo f19225v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f19226w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Format f19227x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Format f19228y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public DrmSession<j> f19229z;

    public static class DecoderInitializationException extends Exception {

        @Nullable
        public final a codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + format, th2, format.f18970j, z10, null, a(i10), null);
        }

        public static String a(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        @TargetApi(21)
        public static String c(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        @CheckResult
        public final DecoderInitializationException b(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        public DecoderInitializationException(Format format, Throwable th2, boolean z10, a aVar) {
            this("Decoder init failed: " + aVar.f19247a + ", " + format, th2, format.f18970j, z10, aVar, k0.f53108a >= 21 ? c(th2) : null, null);
        }

        public DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, @Nullable a aVar, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.mimeType = str2;
            this.secureDecoderRequired = z10;
            this.codecInfo = aVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }

    public final void A0() {
        this.f19222t0 = true;
    }

    public boolean D0(a aVar) {
        return true;
    }

    public abstract int F0(b bVar, @Nullable com.google.android.exoplayer2.drm.a<j> aVar, Format format) throws MediaCodecUtil.DecoderQueryException;

    public abstract void H(a aVar, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f10);

    public boolean T() {
        return false;
    }

    public abstract float U(float f10, Format format, Format[] formatArr);

    public abstract List<a> V(b bVar, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    public long W() {
        return 0L;
    }

    public void a0(o3.e eVar) throws ExoPlaybackException {
    }

    public abstract void j0(String str, long j10, long j11);

    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    public void k0(k3.f0 f0Var) throws ExoPlaybackException {
        boolean z10 = true;
        this.f19218r0 = true;
        Format format = (Format) g5.a.e(f0Var.f62129c);
        if (f0Var.f62127a) {
            B0(f0Var.f62128b);
        } else {
            this.A = l(this.f19227x, format, this.f19209n, this.A);
        }
        this.f19227x = format;
        if (this.F == null) {
            g0();
            return;
        }
        DrmSession<j> drmSession = this.A;
        if ((drmSession == null && this.f19229z != null) || ((drmSession != null && this.f19229z == null) || ((drmSession != this.f19229z && !this.K.f19253g && i0(drmSession, format)) || (k0.f53108a < 23 && this.A != this.f19229z)))) {
            J();
            return;
        }
        int iX = x(this.F, this.K, this.G, format);
        if (iX == 0) {
            J();
            return;
        }
        if (iX == 1) {
            this.G = format;
            G0();
            if (this.A != this.f19229z) {
                K();
                return;
            } else {
                I();
                return;
            }
        }
        if (iX != 2) {
            if (iX != 3) {
                throw new IllegalStateException();
            }
            this.G = format;
            G0();
            if (this.A != this.f19229z) {
                K();
                return;
            }
            return;
        }
        if (this.M) {
            J();
            return;
        }
        this.f19199e0 = true;
        this.f19200f0 = 1;
        int i10 = this.L;
        if (i10 != 2) {
            if (i10 == 1) {
                int i11 = format.f18975o;
                Format format2 = this.G;
                if (i11 != format2.f18975o || format.f18976p != format2.f18976p) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        this.T = z10;
        this.G = format;
        G0();
        if (this.A != this.f19229z) {
            K();
        }
    }

    public abstract void l0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException;

    public abstract void m0(long j10);

    @Override // k3.e
    public void n() {
        this.f19227x = null;
        if (this.A == null && this.f19229z == null) {
            O();
        } else {
            q();
        }
    }

    public abstract void n0(o3.e eVar);

    @Override // k3.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        this.f19210n0 = false;
        this.f19212o0 = false;
        this.f19222t0 = false;
        N();
        this.f19221t.c();
    }

    public abstract boolean p0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws ExoPlaybackException;

    @Override // k3.e
    public void q() {
        try {
            u0();
            B0(null);
            com.google.android.exoplayer2.drm.a<j> aVar = this.f19209n;
            if (aVar == null || !this.f19226w) {
                return;
            }
            this.f19226w = false;
            aVar.release();
        } catch (Throwable th2) {
            B0(null);
            throw th2;
        }
    }

    @Override // k3.e
    public void r() {
    }

    public final void r0() throws ExoPlaybackException {
        this.f19205k0 = true;
        MediaFormat outputFormat = this.F.getOutputFormat();
        if (this.L != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.U = true;
            return;
        }
        if (this.S) {
            outputFormat.setInteger("channel-count", 1);
        }
        l0(this.F, outputFormat);
    }

    @Override // k3.e
    public void s() {
    }

    @Override // k3.e, k3.q0
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void u0() {
        this.I = null;
        this.K = null;
        this.G = null;
        this.f19205k0 = false;
        x0();
        y0();
        w0();
        this.f19214p0 = false;
        this.Y = -9223372036854775807L;
        this.f19223u.clear();
        this.f19206l0 = -9223372036854775807L;
        this.f19208m0 = -9223372036854775807L;
        try {
            MediaCodec mediaCodec = this.F;
            if (mediaCodec != null) {
                this.f19224u0.f64960b++;
                try {
                    if (!this.f19220s0) {
                        mediaCodec.stop();
                    }
                    this.F.release();
                } catch (Throwable th2) {
                    this.F.release();
                    throw th2;
                }
            }
            this.F = null;
            try {
                MediaCrypto mediaCrypto = this.B;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.B = null;
                this.C = false;
                z0(null);
            }
        } catch (Throwable th3) {
            this.F = null;
            try {
                MediaCrypto mediaCrypto2 = this.B;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th3;
            } finally {
                this.B = null;
                this.C = false;
                z0(null);
            }
        }
    }

    public void v0() throws ExoPlaybackException {
    }

    public abstract int x(MediaCodec mediaCodec, a aVar, Format format, Format format2);

    public final void x0() {
        this.Z = -1;
        this.f19217r.f64969c = null;
    }

    public final void y0() {
        this.f19195a0 = -1;
        this.f19196b0 = null;
    }

    public static boolean A(String str) {
        int i10 = k0.f53108a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = k0.f53109b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean B(String str) {
        return k0.f53108a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean C(a aVar) {
        String str = aVar.f19247a;
        int i10 = k0.f53108a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ("Amazon".equals(k0.f53110c) && "AFTS".equals(k0.f53111d) && aVar.f19253g);
    }

    public static boolean D(String str) {
        int i10 = k0.f53108a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && k0.f53111d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean E(String str, Format format) {
        return k0.f53108a <= 18 && format.f18983w == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean F(String str) {
        return k0.f53111d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public static boolean G(String str) {
        return k0.f53108a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public static MediaCodec.CryptoInfo X(o3.e eVar, int i10) {
        MediaCodec.CryptoInfo cryptoInfoA = eVar.f64968b.a();
        if (i10 == 0) {
            return cryptoInfoA;
        }
        if (cryptoInfoA.numBytesOfClearData == null) {
            cryptoInfoA.numBytesOfClearData = new int[1];
        }
        int[] iArr = cryptoInfoA.numBytesOfClearData;
        iArr[0] = iArr[0] + i10;
        return cryptoInfoA;
    }

    public static boolean e0(IllegalStateException illegalStateException) {
        if (k0.f53108a >= 21 && f0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @TargetApi(21)
    public static boolean f0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean z(String str, Format format) {
        return k0.f53108a < 21 && format.f18972l.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public final void B0(@Nullable DrmSession<j> drmSession) {
        DrmSession.a(this.A, drmSession);
        this.A = drmSession;
    }

    public final boolean C0(long j10) {
        return this.D == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.D;
    }

    public final boolean E0(boolean z10) throws ExoPlaybackException {
        DrmSession<j> drmSession = this.f19229z;
        if (drmSession == null || (!z10 && (this.f19211o || drmSession.playClearSamplesWithoutKeys()))) {
            return false;
        }
        int state = this.f19229z.getState();
        if (state != 1) {
            return state != 4;
        }
        throw g(this.f19229z.getError(), this.f19227x);
    }

    public final void G0() throws ExoPlaybackException {
        if (k0.f53108a < 23) {
            return;
        }
        float fU = U(this.E, this.G, k());
        float f10 = this.H;
        if (f10 == fU) {
            return;
        }
        if (fU == -1.0f) {
            J();
            return;
        }
        if (f10 != -1.0f || fU > this.f19215q) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fU);
            this.F.setParameters(bundle);
            this.H = fU;
        }
    }

    @TargetApi(23)
    public final void H0() throws ExoPlaybackException {
        j jVar = (j) this.A.getMediaCrypto();
        if (jVar == null) {
            t0();
            return;
        }
        if (k.f62193e.equals(jVar.f65879a)) {
            t0();
            return;
        }
        if (N()) {
            return;
        }
        try {
            this.B.setMediaDrmSession(jVar.f65880b);
            z0(this.A);
            this.f19201g0 = 0;
            this.f19202h0 = 0;
        } catch (MediaCryptoException e10) {
            throw g(e10, this.f19227x);
        }
    }

    public final void I() {
        if (this.f19203i0) {
            this.f19201g0 = 1;
            this.f19202h0 = 1;
        }
    }

    @Nullable
    public final Format I0(long j10) {
        Format formatH = this.f19221t.h(j10);
        if (formatH != null) {
            this.f19228y = formatH;
        }
        return formatH;
    }

    public final void J() throws ExoPlaybackException {
        if (!this.f19203i0) {
            t0();
        } else {
            this.f19201g0 = 1;
            this.f19202h0 = 3;
        }
    }

    public final void K() throws ExoPlaybackException {
        if (k0.f53108a < 23) {
            J();
        } else if (!this.f19203i0) {
            H0();
        } else {
            this.f19201g0 = 1;
            this.f19202h0 = 2;
        }
    }

    public final boolean L(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        boolean zP0;
        int iDequeueOutputBuffer;
        if (!b0()) {
            if (this.R && this.f19204j0) {
                try {
                    iDequeueOutputBuffer = this.F.dequeueOutputBuffer(this.f19225v, W());
                } catch (IllegalStateException unused) {
                    o0();
                    if (this.f19212o0) {
                        u0();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.F.dequeueOutputBuffer(this.f19225v, W());
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    r0();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    q0();
                    return true;
                }
                if (this.V && (this.f19210n0 || this.f19201g0 == 2)) {
                    o0();
                }
                return false;
            }
            if (this.U) {
                this.U = false;
                this.F.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f19225v;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                o0();
                return false;
            }
            this.f19195a0 = iDequeueOutputBuffer;
            ByteBuffer byteBufferZ = Z(iDequeueOutputBuffer);
            this.f19196b0 = byteBufferZ;
            if (byteBufferZ != null) {
                byteBufferZ.position(this.f19225v.offset);
                ByteBuffer byteBuffer = this.f19196b0;
                MediaCodec.BufferInfo bufferInfo2 = this.f19225v;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.f19197c0 = d0(this.f19225v.presentationTimeUs);
            long j12 = this.f19208m0;
            long j13 = this.f19225v.presentationTimeUs;
            this.f19198d0 = j12 == j13;
            I0(j13);
        }
        if (this.R && this.f19204j0) {
            try {
                MediaCodec mediaCodec = this.F;
                ByteBuffer byteBuffer2 = this.f19196b0;
                int i10 = this.f19195a0;
                MediaCodec.BufferInfo bufferInfo3 = this.f19225v;
                z10 = false;
                try {
                    zP0 = p0(j10, j11, mediaCodec, byteBuffer2, i10, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f19197c0, this.f19198d0, this.f19228y);
                } catch (IllegalStateException unused2) {
                    o0();
                    if (this.f19212o0) {
                        u0();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            MediaCodec mediaCodec2 = this.F;
            ByteBuffer byteBuffer3 = this.f19196b0;
            int i11 = this.f19195a0;
            MediaCodec.BufferInfo bufferInfo4 = this.f19225v;
            zP0 = p0(j10, j11, mediaCodec2, byteBuffer3, i11, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f19197c0, this.f19198d0, this.f19228y);
        }
        if (zP0) {
            m0(this.f19225v.presentationTimeUs);
            boolean z11 = (this.f19225v.flags & 4) != 0 ? true : z10;
            y0();
            if (!z11) {
                return true;
            }
            o0();
        }
        return z10;
    }

    public final boolean M() throws ExoPlaybackException {
        int iPosition;
        int iU;
        MediaCodec mediaCodec = this.F;
        if (mediaCodec == null || this.f19201g0 == 2 || this.f19210n0) {
            return false;
        }
        if (this.Z < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.Z = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            this.f19217r.f64969c = Y(iDequeueInputBuffer);
            this.f19217r.clear();
        }
        if (this.f19201g0 == 1) {
            if (!this.V) {
                this.f19204j0 = true;
                this.F.queueInputBuffer(this.Z, 0, 0, 0L, 4);
                x0();
            }
            this.f19201g0 = 2;
            return false;
        }
        if (this.T) {
            this.T = false;
            ByteBuffer byteBuffer = this.f19217r.f64969c;
            byte[] bArr = f19194v0;
            byteBuffer.put(bArr);
            this.F.queueInputBuffer(this.Z, 0, bArr.length, 0L, 0);
            x0();
            this.f19203i0 = true;
            return true;
        }
        k3.f0 f0VarI = i();
        if (this.f19214p0) {
            iU = -4;
            iPosition = 0;
        } else {
            if (this.f19200f0 == 1) {
                for (int i10 = 0; i10 < this.G.f18972l.size(); i10++) {
                    this.f19217r.f64969c.put(this.G.f18972l.get(i10));
                }
                this.f19200f0 = 2;
            }
            iPosition = this.f19217r.f64969c.position();
            iU = u(f0VarI, this.f19217r, false);
        }
        if (hasReadStreamToEnd()) {
            this.f19208m0 = this.f19206l0;
        }
        if (iU == -3) {
            return false;
        }
        if (iU == -5) {
            if (this.f19200f0 == 2) {
                this.f19217r.clear();
                this.f19200f0 = 1;
            }
            k0(f0VarI);
            return true;
        }
        if (this.f19217r.isEndOfStream()) {
            if (this.f19200f0 == 2) {
                this.f19217r.clear();
                this.f19200f0 = 1;
            }
            this.f19210n0 = true;
            if (!this.f19203i0) {
                o0();
                return false;
            }
            try {
                if (!this.V) {
                    this.f19204j0 = true;
                    this.F.queueInputBuffer(this.Z, 0, 0, 0L, 4);
                    x0();
                }
                return false;
            } catch (MediaCodec.CryptoException e10) {
                throw g(e10, this.f19227x);
            }
        }
        if (this.f19216q0 && !this.f19217r.isKeyFrame()) {
            this.f19217r.clear();
            if (this.f19200f0 == 2) {
                this.f19200f0 = 1;
            }
            return true;
        }
        this.f19216q0 = false;
        boolean zD = this.f19217r.d();
        boolean zE0 = E0(zD);
        this.f19214p0 = zE0;
        if (zE0) {
            return false;
        }
        if (this.N && !zD) {
            q.b(this.f19217r.f64969c);
            if (this.f19217r.f64969c.position() == 0) {
                return true;
            }
            this.N = false;
        }
        try {
            o3.e eVar = this.f19217r;
            long j10 = eVar.f64971e;
            if (eVar.isDecodeOnly()) {
                this.f19223u.add(Long.valueOf(j10));
            }
            if (this.f19218r0) {
                this.f19221t.a(j10, this.f19227x);
                this.f19218r0 = false;
            }
            this.f19206l0 = Math.max(this.f19206l0, j10);
            this.f19217r.c();
            if (this.f19217r.hasSupplementalData()) {
                a0(this.f19217r);
            }
            n0(this.f19217r);
            if (zD) {
                this.F.queueSecureInputBuffer(this.Z, 0, X(this.f19217r, iPosition), j10, 0);
            } else {
                this.F.queueInputBuffer(this.Z, 0, this.f19217r.f64969c.limit(), j10, 0);
            }
            x0();
            this.f19203i0 = true;
            this.f19200f0 = 0;
            this.f19224u0.f64961c++;
            return true;
        } catch (MediaCodec.CryptoException e11) {
            throw g(e11, this.f19227x);
        }
    }

    public boolean O() {
        MediaCodec mediaCodec = this.F;
        if (mediaCodec == null) {
            return false;
        }
        if (this.f19202h0 == 3 || this.O || ((this.P && !this.f19205k0) || (this.Q && this.f19204j0))) {
            u0();
            return true;
        }
        mediaCodec.flush();
        x0();
        y0();
        this.Y = -9223372036854775807L;
        this.f19204j0 = false;
        this.f19203i0 = false;
        this.f19216q0 = true;
        this.T = false;
        this.U = false;
        this.f19197c0 = false;
        this.f19198d0 = false;
        this.f19214p0 = false;
        this.f19223u.clear();
        this.f19206l0 = -9223372036854775807L;
        this.f19208m0 = -9223372036854775807L;
        this.f19201g0 = 0;
        this.f19202h0 = 0;
        this.f19200f0 = this.f19199e0 ? 1 : 0;
        return false;
    }

    public final List<a> P(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        List<a> listV = V(this.f19207m, this.f19227x, z10);
        if (listV.isEmpty() && z10) {
            listV = V(this.f19207m, this.f19227x, false);
            if (!listV.isEmpty()) {
                m.h("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f19227x.f18970j + ", but no secure decoder available. Trying to proceed with " + listV + ".");
            }
        }
        return listV;
    }

    public final MediaCodec Q() {
        return this.F;
    }

    public final void R(MediaCodec mediaCodec) {
        if (k0.f53108a < 21) {
            this.W = mediaCodec.getInputBuffers();
            this.X = mediaCodec.getOutputBuffers();
        }
    }

    @Nullable
    public final a S() {
        return this.K;
    }

    public final ByteBuffer Y(int i10) {
        return k0.f53108a >= 21 ? this.F.getInputBuffer(i10) : this.W[i10];
    }

    public final ByteBuffer Z(int i10) {
        return k0.f53108a >= 21 ? this.F.getOutputBuffer(i10) : this.X[i10];
    }

    @Override // k3.q0
    public final int a(Format format) throws ExoPlaybackException {
        try {
            return F0(this.f19207m, this.f19209n, format);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw g(e10, format);
        }
    }

    public final boolean b0() {
        return this.f19195a0 >= 0;
    }

    @Override // k3.p0
    public final void c(float f10) throws ExoPlaybackException {
        this.E = f10;
        if (this.F == null || this.f19202h0 == 3 || getState() == 0) {
            return;
        }
        G0();
    }

    public final void c0(a aVar, MediaCrypto mediaCrypto) throws Exception {
        String str = aVar.f19247a;
        float fU = k0.f53108a < 23 ? -1.0f : U(this.E, this.f19227x, k());
        float f10 = fU <= this.f19215q ? -1.0f : fU;
        MediaCodec mediaCodec = null;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            h0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                h0.c();
                h0.a("configureCodec");
                H(aVar, mediaCodecCreateByCodecName, this.f19227x, mediaCrypto, f10);
                h0.c();
                h0.a("startCodec");
                mediaCodecCreateByCodecName.start();
                h0.c();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                R(mediaCodecCreateByCodecName);
                this.F = mediaCodecCreateByCodecName;
                this.K = aVar;
                this.H = f10;
                this.G = this.f19227x;
                this.L = y(str);
                this.M = F(str);
                this.N = z(str, this.G);
                this.O = D(str);
                this.P = G(str);
                this.Q = A(str);
                this.R = B(str);
                this.S = E(str, this.G);
                this.V = C(aVar) || T();
                x0();
                y0();
                this.Y = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.f19199e0 = false;
                this.f19200f0 = 0;
                this.f19204j0 = false;
                this.f19203i0 = false;
                this.f19206l0 = -9223372036854775807L;
                this.f19208m0 = -9223372036854775807L;
                this.f19201g0 = 0;
                this.f19202h0 = 0;
                this.T = false;
                this.U = false;
                this.f19197c0 = false;
                this.f19198d0 = false;
                this.f19216q0 = true;
                this.f19224u0.f64959a++;
                j0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            } catch (Exception e10) {
                e = e10;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    w0();
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final boolean d0(long j10) {
        int size = this.f19223u.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f19223u.get(i10).longValue() == j10) {
                this.f19223u.remove(i10);
                return true;
            }
        }
        return false;
    }

    public final void g0() throws ExoPlaybackException {
        if (this.F != null || this.f19227x == null) {
            return;
        }
        z0(this.A);
        String str = this.f19227x.f18970j;
        DrmSession<j> drmSession = this.f19229z;
        if (drmSession != null) {
            if (this.B == null) {
                j jVar = (j) drmSession.getMediaCrypto();
                if (jVar != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(jVar.f65879a, jVar.f65880b);
                        this.B = mediaCrypto;
                        this.C = !jVar.f65881c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw g(e10, this.f19227x);
                    }
                } else if (this.f19229z.getError() == null) {
                    return;
                }
            }
            if (j.f65878d) {
                int state = this.f19229z.getState();
                if (state == 1) {
                    throw g(this.f19229z.getError(), this.f19227x);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            h0(this.B, this.C);
        } catch (DecoderInitializationException e11) {
            throw g(e11, this.f19227x);
        }
    }

    public final void h0(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException {
        if (this.I == null) {
            try {
                List<a> listP = P(z10);
                ArrayDeque<a> arrayDeque = new ArrayDeque<>();
                this.I = arrayDeque;
                if (this.f19213p) {
                    arrayDeque.addAll(listP);
                } else if (!listP.isEmpty()) {
                    this.I.add(listP.get(0));
                }
                this.J = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(this.f19227x, e10, z10, -49998);
            }
        }
        if (this.I.isEmpty()) {
            throw new DecoderInitializationException(this.f19227x, (Throwable) null, z10, -49999);
        }
        while (this.F == null) {
            a aVarPeekFirst = this.I.peekFirst();
            if (!D0(aVarPeekFirst)) {
                return;
            }
            try {
                c0(aVarPeekFirst, mediaCrypto);
            } catch (Exception e11) {
                m.i("MediaCodecRenderer", "Failed to initialize decoder: " + aVarPeekFirst, e11);
                this.I.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.f19227x, e11, z10, aVarPeekFirst);
                if (this.J == null) {
                    this.J = decoderInitializationException;
                } else {
                    this.J = this.J.b(decoderInitializationException);
                }
                if (this.I.isEmpty()) {
                    throw this.J;
                }
            }
        }
        this.I = null;
    }

    @Override // k3.p0
    public boolean isEnded() {
        return this.f19212o0;
    }

    @Override // k3.p0
    public boolean isReady() {
        return (this.f19227x == null || this.f19214p0 || (!m() && !b0() && (this.Y == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.Y))) ? false : true;
    }

    @Override // k3.e
    public void o(boolean z10) throws ExoPlaybackException {
        com.google.android.exoplayer2.drm.a<j> aVar = this.f19209n;
        if (aVar != null && !this.f19226w) {
            this.f19226w = true;
            aVar.prepare();
        }
        this.f19224u0 = new d();
    }

    public final void o0() throws ExoPlaybackException {
        int i10 = this.f19202h0;
        if (i10 == 1) {
            N();
            return;
        }
        if (i10 == 2) {
            H0();
        } else if (i10 == 3) {
            t0();
        } else {
            this.f19212o0 = true;
            v0();
        }
    }

    public final void q0() {
        if (k0.f53108a < 21) {
            this.X = this.F.getOutputBuffers();
        }
    }

    @Override // k3.p0
    public void render(long j10, long j11) throws ExoPlaybackException {
        if (this.f19222t0) {
            this.f19222t0 = false;
            o0();
        }
        try {
            if (this.f19212o0) {
                v0();
                return;
            }
            if (this.f19227x != null || s0(true)) {
                g0();
                if (this.F != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    h0.a("drainAndFeed");
                    while (L(j10, j11)) {
                    }
                    while (M() && C0(jElapsedRealtime)) {
                    }
                    h0.c();
                } else {
                    this.f19224u0.f64962d += v(j10);
                    s0(false);
                }
                this.f19224u0.a();
            }
        } catch (IllegalStateException e10) {
            if (!e0(e10)) {
                throw e10;
            }
            throw g(e10, this.f19227x);
        }
    }

    public final void w0() {
        if (k0.f53108a < 21) {
            this.W = null;
            this.X = null;
        }
    }

    public final int y(String str) {
        int i10 = k0.f53108a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = k0.f53111d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = k0.f53109b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public final void z0(@Nullable DrmSession<j> drmSession) {
        DrmSession.a(this.f19229z, drmSession);
        this.f19229z = drmSession;
    }

    public MediaCodecRenderer(int i10, b bVar, @Nullable com.google.android.exoplayer2.drm.a<j> aVar, boolean z10, boolean z11, float f10) {
        super(i10);
        this.f19207m = (b) g5.a.e(bVar);
        this.f19209n = aVar;
        this.f19211o = z10;
        this.f19213p = z11;
        this.f19215q = f10;
        this.f19217r = new o3.e(0);
        this.f19219s = o3.e.f();
        this.f19221t = new f0<>();
        this.f19223u = new ArrayList<>();
        this.f19225v = new MediaCodec.BufferInfo();
        this.f19200f0 = 0;
        this.f19201g0 = 0;
        this.f19202h0 = 0;
        this.H = -1.0f;
        this.E = 1.0f;
        this.D = -9223372036854775807L;
    }

    public static boolean i0(DrmSession<j> drmSession, Format format) {
        j jVar = (j) drmSession.getMediaCrypto();
        if (jVar == null) {
            return true;
        }
        if (jVar.f65881c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(jVar.f65879a, jVar.f65880b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(format.f18970j);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public final boolean N() throws ExoPlaybackException {
        boolean zO = O();
        if (zO) {
            g0();
        }
        return zO;
    }

    public final boolean s0(boolean z10) throws ExoPlaybackException {
        k3.f0 f0VarI = i();
        this.f19219s.clear();
        int iU = u(f0VarI, this.f19219s, z10);
        if (iU == -5) {
            k0(f0VarI);
            return true;
        }
        if (iU == -4 && this.f19219s.isEndOfStream()) {
            this.f19210n0 = true;
            o0();
            return false;
        }
        return false;
    }

    public final void t0() throws ExoPlaybackException {
        u0();
        g0();
    }
}
