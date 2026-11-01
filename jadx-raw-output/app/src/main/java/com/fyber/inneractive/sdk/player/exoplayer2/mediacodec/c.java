package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.util.w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends com.fyber.inneractive.sdk.player.exoplayer2.a {
    public static final byte[] O;
    public ByteBuffer[] A;
    public long B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public DecoderCounters N;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f17433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f17434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.c f17435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f17436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f17437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaCodec.BufferInfo f17438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f17439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MediaCodec f17440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f17447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f17448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer[] f17451z;

    public a a(d dVar, o oVar) {
        String str = oVar.f17504f;
        dVar.getClass();
        return j.a(false, str);
    }

    public abstract void a(MediaCodec mediaCodec, MediaFormat mediaFormat);

    public abstract void a(a aVar, MediaCodec mediaCodec, o oVar);

    public abstract void a(String str, long j10, long j11);

    public abstract boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10);

    public boolean a(boolean z10, o oVar, o oVar2) {
        return false;
    }

    public abstract int b(d dVar, o oVar);

    public void m() {
    }

    public void p() {
    }

    static {
        int i10 = z.f17873a;
        byte[] bArr = new byte[38];
        for (int i11 = 0; i11 < 38; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i12), 16) << 4));
        }
        O = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i10, boolean z10) {
        super(i10);
        d dVar = d.f17452a;
        if (z.f17873a < 16) {
            throw new IllegalStateException();
        }
        this.f17433h = dVar;
        this.f17434i = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f17435j = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.c();
        this.f17436k = new p();
        this.f17437l = new ArrayList();
        this.f17438m = new MediaCodec.BufferInfo();
        this.G = 0;
        this.H = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean e() {
        return this.L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public boolean f() {
        if (this.f17439n != null) {
            if ((this.f16289f ? this.f16290g : this.f16287d.isReady()) || this.D >= 0 || (this.B != -9223372036854775807L && SystemClock.elapsedRealtime() < this.B)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        MediaCodec mediaCodec = this.f17440o;
        if (mediaCodec == null || this.H == 2 || this.K) {
            return false;
        }
        if (this.C < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.C = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar = this.f17434i;
            cVar.f16432c = this.f17451z[iDequeueInputBuffer];
            cVar.a();
        }
        if (this.H == 1) {
            if (!this.f17445t) {
                this.J = true;
                this.f17440o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                this.C = -1;
            }
            this.H = 2;
            return false;
        }
        if (this.f17449x) {
            this.f17449x = false;
            ByteBuffer byteBuffer = this.f17434i.f16432c;
            byte[] bArr = O;
            byteBuffer.put(bArr);
            this.f17440o.queueInputBuffer(this.C, 0, bArr.length, 0L, 0);
            this.C = -1;
            this.I = true;
            return true;
        }
        if (this.G == 1) {
            for (int i10 = 0; i10 < this.f17439n.f17506h.size(); i10++) {
                this.f17434i.f16432c.put((byte[]) this.f17439n.f17506h.get(i10));
            }
            this.G = 2;
        }
        int iPosition = this.f17434i.f16432c.position();
        int iA = a(this.f17436k, this.f17434i, false);
        if (iA == -3) {
            return false;
        }
        if (iA == -5) {
            if (this.G == 2) {
                this.f17434i.a();
                this.G = 1;
            }
            a(this.f17436k.f17525a);
            return true;
        }
        if (this.f17434i.b(4)) {
            if (this.G == 2) {
                this.f17434i.a();
                this.G = 1;
            }
            this.K = true;
            if (!this.I) {
                n();
                return false;
            }
            try {
                if (!this.f17445t) {
                    this.J = true;
                    this.f17440o.queueInputBuffer(this.C, 0, 0, 0L, 4);
                    this.C = -1;
                }
                return false;
            } catch (MediaCodec.CryptoException e10) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e10);
            }
        }
        if (this.M && !this.f17434i.b(1)) {
            this.f17434i.a();
            if (this.G == 2) {
                this.G = 1;
            }
            return true;
        }
        this.M = false;
        boolean zB = this.f17434i.b(1073741824);
        if (this.f17442q && !zB) {
            ByteBuffer byteBuffer2 = this.f17434i.f16432c;
            int iPosition2 = byteBuffer2.position();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                if (i13 >= iPosition2) {
                    byteBuffer2.clear();
                    break;
                }
                int i14 = byteBuffer2.get(i11) & 255;
                if (i12 == 3) {
                    if (i14 == 1 && (byteBuffer2.get(i13) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                        byteBufferDuplicate.position(i11 - 3);
                        byteBufferDuplicate.limit(iPosition2);
                        byteBuffer2.position(0);
                        byteBuffer2.put(byteBufferDuplicate);
                        break;
                    }
                } else if (i14 == 0) {
                    i12++;
                }
                if (i14 != 0) {
                    i12 = 0;
                }
                i11 = i13;
            }
            if (this.f17434i.f16432c.position() == 0) {
                return true;
            }
            this.f17442q = false;
        }
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.c cVar2 = this.f17434i;
            long j10 = cVar2.f16433d;
            if (cVar2.b(Integer.MIN_VALUE)) {
                this.f17437l.add(Long.valueOf(j10));
            }
            this.f17434i.f16432c.flip();
            m();
            if (zB) {
                MediaCodec.CryptoInfo cryptoInfo = this.f17434i.f16431b.f16428d;
                if (iPosition != 0) {
                    if (cryptoInfo.numBytesOfClearData == null) {
                        cryptoInfo.numBytesOfClearData = new int[1];
                    }
                    int[] iArr = cryptoInfo.numBytesOfClearData;
                    iArr[0] = iArr[0] + iPosition;
                }
                this.f17440o.queueSecureInputBuffer(this.C, 0, cryptoInfo, j10, 0);
            } else {
                this.f17440o.queueInputBuffer(this.C, 0, this.f17434i.f16432c.limit(), j10, 0);
            }
            this.C = -1;
            this.I = true;
            this.G = 0;
            this.N.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e11) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    public final void l() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        boolean z10;
        if (q()) {
            o oVar = this.f17439n;
            String str = oVar.f17504f;
            try {
                a aVarA = a(this.f17433h, oVar);
                if (aVarA == null) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(this.f17439n, (f) null, -49999));
                }
                String str2 = aVarA.f17428a;
                this.f17441p = aVarA.f17429b;
                o oVar2 = this.f17439n;
                int i10 = z.f17873a;
                boolean z11 = false;
                this.f17442q = i10 < 21 && oVar2.f17506h.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                this.f17443r = i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (i10 == 19 && z.f17876d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                if (i10 >= 24 || !("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                    z10 = false;
                } else {
                    String str3 = z.f17874b;
                    if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                this.f17444s = z10;
                this.f17445t = i10 <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                this.f17446u = (i10 <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (i10 <= 19 && "hb2000".equals(z.f17874b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                this.f17447v = i10 == 21 && "OMX.google.aac.decoder".equals(str2);
                o oVar3 = this.f17439n;
                if (i10 <= 18 && oVar3.f17516r == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2)) {
                    z11 = true;
                }
                this.f17448w = z11;
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    w.a("createCodec:" + str2);
                    this.f17440o = MediaCodec.createByCodecName(str2);
                    w.a();
                    w.a("configureCodec");
                    a(aVarA, this.f17440o, this.f17439n);
                    w.a();
                    w.a("startCodec");
                    this.f17440o.start();
                    w.a();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    a(str2, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                    this.f17451z = this.f17440o.getInputBuffers();
                    this.A = this.f17440o.getOutputBuffers();
                    this.B = this.f16286c == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.C = -1;
                    this.D = -1;
                    this.M = true;
                    this.N.decoderInitCount++;
                } catch (Exception e10) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(this.f17439n, e10, str2));
                }
            } catch (f e11) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new b(this.f17439n, e11, -49998));
            }
        }
    }

    public final void n() throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (this.H == 2) {
            o();
            l();
        } else {
            this.L = true;
            p();
        }
    }

    public final void o() {
        if (this.f17440o != null) {
            this.B = -9223372036854775807L;
            this.C = -1;
            this.D = -1;
            this.E = false;
            this.f17437l.clear();
            this.f17451z = null;
            this.A = null;
            this.F = false;
            this.I = false;
            this.f17441p = false;
            this.f17442q = false;
            this.f17443r = false;
            this.f17444s = false;
            this.f17445t = false;
            this.f17446u = false;
            this.f17448w = false;
            this.f17449x = false;
            this.f17450y = false;
            this.J = false;
            this.G = 0;
            this.H = 0;
            this.N.decoderReleaseCount++;
            this.f17434i.f16432c = null;
            try {
                this.f17440o.stop();
                try {
                    this.f17440o.release();
                } finally {
                    this.f17440o = null;
                }
            } catch (Throwable th2) {
                try {
                    this.f17440o.release();
                    throw th2;
                } finally {
                    this.f17440o = null;
                }
            }
        }
    }

    public boolean q() {
        return this.f17440o == null && this.f17439n != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.K = false;
        this.L = false;
        if (this.f17440o != null) {
            this.B = -9223372036854775807L;
            this.C = -1;
            this.D = -1;
            this.M = true;
            this.E = false;
            this.f17437l.clear();
            this.f17449x = false;
            this.f17450y = false;
            if (this.f17443r || ((this.f17446u && this.J) || this.H != 0)) {
                o();
                l();
            } else {
                this.f17440o.flush();
                this.I = false;
            }
            if (!this.F || this.f17439n == null) {
                return;
            }
            this.G = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x015c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0178  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(long j10, long j11) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        boolean zA;
        boolean z10;
        boolean z11;
        if (this.L) {
            p();
            return;
        }
        if (this.f17439n == null) {
            this.f17435j.a();
            int iA = a(this.f17436k, this.f17435j, true);
            if (iA != -5) {
                if (iA == -4) {
                    if (this.f17435j.b(4)) {
                        this.K = true;
                        n();
                        return;
                    }
                    throw new IllegalStateException();
                }
                return;
            }
            a(this.f17436k.f17525a);
        }
        l();
        if (this.f17440o != null) {
            w.a("drainAndFeed");
            do {
                if (this.D < 0) {
                    if (this.f17447v && this.J) {
                        try {
                            this.D = this.f17440o.dequeueOutputBuffer(this.f17438m, 0L);
                        } catch (IllegalStateException unused) {
                            n();
                            if (this.L) {
                                o();
                            }
                        }
                    } else {
                        this.D = this.f17440o.dequeueOutputBuffer(this.f17438m, 0L);
                    }
                    int i10 = this.D;
                    if (i10 >= 0) {
                        if (this.f17450y) {
                            this.f17450y = false;
                            this.f17440o.releaseOutputBuffer(i10, false);
                            this.D = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f17438m;
                            if ((bufferInfo.flags & 4) != 0) {
                                n();
                                this.D = -1;
                            } else {
                                ByteBuffer byteBuffer = this.A[i10];
                                if (byteBuffer != null) {
                                    byteBuffer.position(bufferInfo.offset);
                                    MediaCodec.BufferInfo bufferInfo2 = this.f17438m;
                                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                                }
                                long j12 = this.f17438m.presentationTimeUs;
                                int size = this.f17437l.size();
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= size) {
                                        z11 = false;
                                        break;
                                    } else {
                                        if (((Long) this.f17437l.get(i11)).longValue() == j12) {
                                            this.f17437l.remove(i11);
                                            z11 = true;
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                                this.E = z11;
                                if (!this.f17447v) {
                                    MediaCodec mediaCodec = this.f17440o;
                                    ByteBuffer[] byteBufferArr = this.A;
                                    int i12 = this.D;
                                    ByteBuffer byteBuffer2 = byteBufferArr[i12];
                                    MediaCodec.BufferInfo bufferInfo3 = this.f17438m;
                                    int i13 = bufferInfo3.flags;
                                    zA = a(j10, j11, mediaCodec, byteBuffer2, i12, bufferInfo3.presentationTimeUs, this.E);
                                    if (zA) {
                                        long j13 = this.f17438m.presentationTimeUs;
                                        this.D = -1;
                                    }
                                } else {
                                    MediaCodec mediaCodec2 = this.f17440o;
                                    ByteBuffer[] byteBufferArr2 = this.A;
                                    int i14 = this.D;
                                    ByteBuffer byteBuffer3 = byteBufferArr2[i14];
                                    MediaCodec.BufferInfo bufferInfo4 = this.f17438m;
                                    int i15 = bufferInfo4.flags;
                                    zA = a(j10, j11, mediaCodec2, byteBuffer3, i14, bufferInfo4.presentationTimeUs, this.E);
                                    if (zA) {
                                        long j14 = this.f17438m.presentationTimeUs;
                                        this.D = -1;
                                    }
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        if (i10 == -2) {
                            MediaFormat outputFormat = this.f17440o.getOutputFormat();
                            if (this.f17444s && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                                this.f17450y = true;
                            } else {
                                if (this.f17448w) {
                                    outputFormat.setInteger("channel-count", 1);
                                }
                                a(this.f17440o, outputFormat);
                            }
                        } else if (i10 == -3) {
                            this.A = this.f17440o.getOutputBuffers();
                        } else {
                            if (this.f17445t && (this.K || this.H == 2)) {
                                n();
                            }
                            z10 = false;
                        }
                        z10 = true;
                    }
                } else {
                    if (!this.f17447v && this.J) {
                        try {
                            MediaCodec mediaCodec3 = this.f17440o;
                            ByteBuffer[] byteBufferArr3 = this.A;
                            int i16 = this.D;
                            ByteBuffer byteBuffer4 = byteBufferArr3[i16];
                            MediaCodec.BufferInfo bufferInfo5 = this.f17438m;
                            int i17 = bufferInfo5.flags;
                            zA = a(j10, j11, mediaCodec3, byteBuffer4, i16, bufferInfo5.presentationTimeUs, this.E);
                        } catch (IllegalStateException unused2) {
                            n();
                            if (this.L) {
                                o();
                            }
                        }
                    } else {
                        MediaCodec mediaCodec4 = this.f17440o;
                        ByteBuffer[] byteBufferArr4 = this.A;
                        int i18 = this.D;
                        ByteBuffer byteBuffer5 = byteBufferArr4[i18];
                        MediaCodec.BufferInfo bufferInfo6 = this.f17438m;
                        int i19 = bufferInfo6.flags;
                        zA = a(j10, j11, mediaCodec4, byteBuffer5, i18, bufferInfo6.presentationTimeUs, this.E);
                    }
                    if (zA) {
                        long j15 = this.f17438m.presentationTimeUs;
                        this.D = -1;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            } while (z10);
            while (k()) {
            }
            w.a();
        } else {
            this.f16287d.a(j10 - this.f16288e);
            this.f17435j.a();
            int iA2 = a(this.f17436k, this.f17435j, false);
            if (iA2 == -5) {
                a(this.f17436k.f17525a);
            } else if (iA2 == -4) {
                if (this.f17435j.b(4)) {
                    this.K = true;
                    n();
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        this.N.ensureUpdated();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    public void a(o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        boolean z10;
        o oVar2 = this.f17439n;
        this.f17439n = oVar;
        if ((!z.a(oVar.f17507i, oVar2 == null ? null : oVar2.f17507i)) && this.f17439n.f17507i != null) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(new IllegalStateException("Media requires a DrmSessionManager"));
        }
        if (this.f17440o != null && a(this.f17441p, oVar2, this.f17439n)) {
            this.F = true;
            this.G = 1;
            if (this.f17444s) {
                o oVar3 = this.f17439n;
                z10 = oVar3.f17508j == oVar2.f17508j && oVar3.f17509k == oVar2.f17509k;
            }
            this.f17449x = z10;
            return;
        }
        if (this.I) {
            this.H = 1;
        } else {
            o();
            l();
        }
    }
}
