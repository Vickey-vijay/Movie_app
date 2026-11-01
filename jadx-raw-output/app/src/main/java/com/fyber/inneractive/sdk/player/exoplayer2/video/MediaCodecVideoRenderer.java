package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.w;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.C3426d4;
import com.unity3d.services.core.di.ServiceProvider;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(16)
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f17886q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final h P;
    public final VideoRendererEventListener.EventDispatcher Q;
    public final long R;
    public final int S;
    public final boolean T;
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] U;
    public e V;
    public Surface W;
    public int X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f17887a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f17888b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f17889c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f17890d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f17891e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f17892f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f17893g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f17894h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f17895i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f17896j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f17897k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f17898l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f17899m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f17900n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f17901o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public f f17902p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(Handler handler, VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z10 = false;
        this.R = 5000L;
        this.S = -1;
        this.P = new h();
        this.Q = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (z.f17873a <= 22 && "foster".equals(z.f17874b) && "NVIDIA".equals(z.f17875c)) {
            z10 = true;
        }
        this.T = z10;
        this.Z = -9223372036854775807L;
        this.f17892f0 = -1;
        this.f17893g0 = -1;
        this.f17895i0 = -1.0f;
        this.f17891e0 = -1.0f;
        this.X = 1;
        this.f17896j0 = -1;
        this.f17897k0 = -1;
        this.f17899m0 = -1.0f;
        this.f17898l0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr) {
        this.U = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z10;
        int i10;
        int i11;
        String str = oVar.f17504f;
        if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar2 = oVar.f17507i;
        if (dVar2 != null) {
            z10 = false;
            for (int i12 = 0; i12 < dVar2.f16442c; i12++) {
                z10 |= dVar2.f16440a[i12].f16439e;
            }
        } else {
            z10 = false;
        }
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(z10, str);
        if (aVarA == null) {
            return 1;
        }
        boolean zA = aVarA.a(oVar.f17501c);
        if (zA && (i10 = oVar.f17508j) > 0 && (i11 = oVar.f17509k) > 0) {
            if (z.f17873a >= 21) {
                zA = aVarA.a(i10, i11, oVar.f17510l);
            } else {
                boolean z11 = i10 * i11 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a();
                if (!z11) {
                    Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + oVar.f17508j + VastAttributes.HORIZONTAL_POSITION + oVar.f17509k + "] [" + z.f17877e + C3426d4.j.f28588e);
                }
                zA = z11;
            }
        }
        return (zA ? 3 : 2) | (aVarA.f17429b ? 8 : 4) | (aVarA.f17430c ? 16 : 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        this.f17892f0 = -1;
        this.f17893g0 = -1;
        this.f17895i0 = -1.0f;
        this.f17891e0 = -1.0f;
        this.f17896j0 = -1;
        this.f17897k0 = -1;
        this.f17899m0 = -1.0f;
        this.f17898l0 = -1;
        r();
        h hVar = this.P;
        if (hVar.f17925b) {
            hVar.f17924a.f17921b.sendEmptyMessage(2);
        }
        this.f17902p0 = null;
        try {
            this.f17439n = null;
            o();
        } finally {
            this.N.ensureUpdated();
            this.Q.disabled(this.N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.f17888b0 = 0;
        this.f17887a0 = SystemClock.elapsedRealtime();
    }

    public final void r() {
        MediaCodec mediaCodec;
        this.Y = false;
        if (z.f17873a < 23 || !this.f17900n0 || (mediaCodec = this.f17440o) == null) {
            return;
        }
        this.f17902p0 = new f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z10, long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(z10, j10);
        r();
        this.f17889c0 = 0;
        if (z10) {
            this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
        } else {
            this.Z = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        if ((this.Y || super.q()) && super.f()) {
            this.Z = -9223372036854775807L;
            return true;
        }
        if (this.Z == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Z) {
            return true;
        }
        this.Z = -9223372036854775807L;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.N = decoderCounters;
        int i10 = this.f16285b.f17632a;
        this.f17901o0 = i10;
        this.f17900n0 = i10 != 0;
        this.Q.enabled(decoderCounters);
        h hVar = this.P;
        hVar.f17931h = false;
        if (hVar.f17925b) {
            hVar.f17924a.f17921b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void m() {
        if (z.f17873a >= 23 || !this.f17900n0 || this.Y) {
            return;
        }
        this.Y = true;
        this.Q.renderedFirstFrame(this.W);
    }

    public final void s() {
        int i10 = this.f17892f0;
        if (i10 == -1 && this.f17893g0 == -1) {
            return;
        }
        if (this.f17896j0 == i10 && this.f17897k0 == this.f17893g0 && this.f17898l0 == this.f17894h0 && this.f17899m0 == this.f17895i0) {
            return;
        }
        this.Q.videoSizeChanged(i10, this.f17893g0, this.f17894h0, this.f17895i0);
        this.f17896j0 = this.f17892f0;
        this.f17897k0 = this.f17893g0;
        this.f17898l0 = this.f17894h0;
        this.f17899m0 = this.f17895i0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean q() {
        Surface surface;
        if (super.q() && (surface = this.W) != null && surface.isValid()) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        this.Z = -9223372036854775807L;
        if (this.f17888b0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.Q.droppedFrames(this.f17888b0, jElapsedRealtime - this.f17887a0);
            this.f17888b0 = 0;
            this.f17887a0 = jElapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i10, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i10 != 1) {
            if (i10 == 4) {
                int iIntValue = ((Integer) obj).intValue();
                this.X = iIntValue;
                MediaCodec mediaCodec = this.f17440o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.W == surface) {
            if (surface != null) {
                int i11 = this.f17896j0;
                if (i11 != -1 || this.f17897k0 != -1) {
                    this.Q.videoSizeChanged(i11, this.f17897k0, this.f17898l0, this.f17899m0);
                }
                if (this.Y) {
                    this.Q.renderedFirstFrame(this.W);
                    return;
                }
                return;
            }
            return;
        }
        this.W = surface;
        int i12 = this.f16286c;
        if (i12 == 1 || i12 == 2) {
            MediaCodec mediaCodec2 = this.f17440o;
            if (z.f17873a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                o();
                l();
            }
        }
        if (surface != null) {
            int i13 = this.f17896j0;
            if (i13 != -1 || this.f17897k0 != -1) {
                this.Q.videoSizeChanged(i13, this.f17897k0, this.f17898l0, this.f17899m0);
            }
            r();
            if (i12 == 2) {
                this.Z = this.R > 0 ? SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
                return;
            }
            return;
        }
        this.f17896j0 = -1;
        this.f17897k0 = -1;
        this.f17899m0 = -1.0f;
        this.f17898l0 = -1;
        r();
    }

    public static boolean b(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (!oVar.f17504f.equals(oVar2.f17504f)) {
            return false;
        }
        int i10 = oVar.f17511m;
        if (i10 == -1) {
            i10 = 0;
        }
        int i11 = oVar2.f17511m;
        if (i11 == -1) {
            i11 = 0;
        }
        if (i10 == i11) {
            return z10 || (oVar.f17508j == oVar2.f17508j && oVar.f17509k == oVar2.f17509k);
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        e eVar;
        String str;
        Point point;
        int i10;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.U;
        int iMax = oVar.f17508j;
        int iMax2 = oVar.f17509k;
        int iMax3 = oVar.f17505g;
        if (iMax3 == -1) {
            iMax3 = a(oVar.f17504f, iMax, iMax2);
        }
        if (oVarArr.length == 1) {
            eVar = new e(iMax, iMax2, iMax3);
        } else {
            boolean z10 = false;
            for (com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 : oVarArr) {
                if (b(aVar.f17429b, oVar, oVar2)) {
                    int i11 = oVar2.f17508j;
                    z10 |= i11 == -1 || oVar2.f17509k == -1;
                    iMax = Math.max(iMax, i11);
                    iMax2 = Math.max(iMax2, oVar2.f17509k);
                    int iA = oVar2.f17505g;
                    if (iA == -1) {
                        iA = a(oVar2.f17504f, oVar2.f17508j, oVar2.f17509k);
                    }
                    iMax3 = Math.max(iMax3, iA);
                }
            }
            if (z10) {
                String str2 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
                int i12 = oVar.f17509k;
                int i13 = oVar.f17508j;
                boolean z11 = i12 > i13;
                int i14 = z11 ? i12 : i13;
                if (z11) {
                    i12 = i13;
                }
                float f10 = i12 / i14;
                int[] iArr = f17886q0;
                int i15 = 9;
                int i16 = 0;
                while (true) {
                    if (i16 < i15) {
                        int i17 = iArr[i16];
                        int[] iArr2 = iArr;
                        int i18 = (int) (i17 * f10);
                        if (i17 > i14 && i18 > i12) {
                            int i19 = i12;
                            float f11 = f10;
                            if (z.f17873a >= 21) {
                                int i20 = z11 ? i18 : i17;
                                if (!z11) {
                                    i17 = i18;
                                }
                                point = aVar.a(i20, i17);
                                str = str2;
                                if (aVar.a(point.x, point.y, oVar.f17510l)) {
                                    break;
                                }
                                i16++;
                                iArr = iArr2;
                                i12 = i19;
                                f10 = f11;
                                str2 = str;
                                i15 = 9;
                            } else {
                                str = str2;
                                int i21 = ((i17 + 15) / 16) * 16;
                                int i22 = ((i18 + 15) / 16) * 16;
                                if (i21 * i22 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a()) {
                                    int i23 = z11 ? i22 : i21;
                                    if (!z11) {
                                        i21 = i22;
                                    }
                                    point = new Point(i23, i21);
                                    break;
                                }
                                i16++;
                                iArr = iArr2;
                                i12 = i19;
                                f10 = f11;
                                str2 = str;
                                i15 = 9;
                            }
                        }
                    }
                    str = str2;
                    point = null;
                    break;
                }
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iMax3 = Math.max(iMax3, a(oVar.f17504f, iMax, iMax2));
                    Log.w(str, "Codec max resolution adjusted to: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
                }
            }
            eVar = new e(iMax, iMax2, iMax3);
        }
        this.V = eVar;
        boolean z12 = this.T;
        int i24 = this.f17901o0;
        MediaFormat mediaFormatA = oVar.a();
        mediaFormatA.setInteger("max-width", eVar.f17915a);
        mediaFormatA.setInteger("max-height", eVar.f17916b);
        int i25 = eVar.f17917c;
        if (i25 != -1) {
            mediaFormatA.setInteger("max-input-size", i25);
        }
        if (z12) {
            i10 = 0;
            mediaFormatA.setInteger("auto-frc", 0);
        } else {
            i10 = 0;
        }
        if (i24 != 0) {
            mediaFormatA.setFeatureEnabled("tunneled-playback", true);
            mediaFormatA.setInteger("audio-session-id", i24);
        }
        mediaCodec.configure(mediaFormatA, this.W, (MediaCrypto) null, i10);
        if (z.f17873a < 23 || !this.f17900n0) {
            return;
        }
        this.f17902p0 = new f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(String str, long j10, long j11) {
        this.Q.decoderInitialized(str, j10, j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(oVar);
        this.Q.inputFormatChanged(oVar);
        float f10 = oVar.f17512n;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f17891e0 = f10;
        int i10 = oVar.f17511m;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f17890d0 = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f17892f0 = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f17893g0 = integer2;
        float f10 = this.f17891e0;
        this.f17895i0 = f10;
        if (z.f17873a >= 21) {
            int i10 = this.f17890d0;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f17892f0;
                this.f17892f0 = integer2;
                this.f17893g0 = i11;
                this.f17895i0 = 1.0f / f10;
            }
        } else {
            this.f17894h0 = this.f17890d0;
        }
        mediaCodec.setVideoScalingMode(this.X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(boolean z10, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (b(z10, oVar, oVar2)) {
            int i10 = oVar2.f17508j;
            e eVar = this.V;
            if (i10 <= eVar.f17915a && oVar2.f17509k <= eVar.f17916b && oVar2.f17505g <= eVar.f17917c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, long j12, boolean z10) {
        long j13;
        long j14;
        long j15;
        if (z10) {
            w.a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i10, false);
            w.a();
            this.N.skippedOutputBufferCount++;
            return true;
        }
        if (!this.Y) {
            if (z.f17873a >= 21) {
                long jNanoTime = System.nanoTime();
                s();
                w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i10, jNanoTime);
                w.a();
                this.N.renderedOutputBufferCount++;
                this.f17889c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
            } else {
                s();
                w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i10, true);
                w.a();
                this.N.renderedOutputBufferCount++;
                this.f17889c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
            }
            return true;
        }
        if (this.f16286c != 2) {
            return false;
        }
        long jElapsedRealtime = (j12 - j10) - ((SystemClock.elapsedRealtime() * 1000) - j11);
        long jNanoTime2 = System.nanoTime();
        long j16 = (jElapsedRealtime * 1000) + jNanoTime2;
        h hVar = this.P;
        long j17 = j12 * 1000;
        if (hVar.f17931h) {
            if (j12 != hVar.f17928e) {
                hVar.f17934k++;
                hVar.f17929f = hVar.f17930g;
            }
            long j18 = hVar.f17934k;
            if (j18 >= 6) {
                long j19 = hVar.f17933j;
                j13 = hVar.f17929f + ((j17 - j19) / j18);
                if (Math.abs((j16 - hVar.f17932i) - (j13 - j19)) > 20000000) {
                    hVar.f17931h = false;
                } else {
                    j14 = (hVar.f17932i + j13) - hVar.f17933j;
                }
            } else {
                if (Math.abs((j16 - hVar.f17932i) - (j17 - hVar.f17933j)) > 20000000) {
                    hVar.f17931h = false;
                }
            }
            j13 = j17;
            j14 = j16;
        } else {
            j13 = j17;
            j14 = j16;
        }
        if (!hVar.f17931h) {
            hVar.f17933j = j17;
            hVar.f17932i = j16;
            hVar.f17934k = 0L;
            hVar.f17931h = true;
        }
        hVar.f17928e = j12;
        hVar.f17930g = j13;
        g gVar = hVar.f17924a;
        if (gVar != null && gVar.f17920a != 0) {
            long j20 = hVar.f17924a.f17920a;
            long j21 = hVar.f17926c;
            long j22 = (((j14 - j20) / j21) * j21) + j20;
            if (j14 <= j22) {
                j15 = j22 - j21;
            } else {
                j15 = j22;
                j22 = j21 + j22;
            }
            if (j22 - j14 >= j14 - j15) {
                j22 = j15;
            }
            j14 = j22 - hVar.f17927d;
        }
        long j23 = (j14 - jNanoTime2) / 1000;
        if (j23 < -30000) {
            w.a("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i10, false);
            w.a();
            DecoderCounters decoderCounters = this.N;
            decoderCounters.droppedOutputBufferCount++;
            this.f17888b0++;
            int i11 = this.f17889c0 + 1;
            this.f17889c0 = i11;
            decoderCounters.maxConsecutiveDroppedOutputBufferCount = Math.max(i11, decoderCounters.maxConsecutiveDroppedOutputBufferCount);
            int i12 = this.f17888b0;
            if (i12 != this.S || i12 <= 0) {
                return true;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.Q.droppedFrames(this.f17888b0, jElapsedRealtime2 - this.f17887a0);
            this.f17888b0 = 0;
            this.f17887a0 = jElapsedRealtime2;
            return true;
        }
        if (z.f17873a >= 21) {
            if (j23 >= ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                return false;
            }
            s();
            w.a("releaseOutputBuffer");
            mediaCodec.releaseOutputBuffer(i10, j14);
            w.a();
            this.N.renderedOutputBufferCount++;
            this.f17889c0 = 0;
            if (!this.Y) {
                this.Y = true;
                this.Q.renderedFirstFrame(this.W);
            }
            return true;
        }
        if (j23 >= 30000) {
            return false;
        }
        if (j23 > 11000) {
            try {
                Thread.sleep((j23 - 10000) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        s();
        w.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        w.a();
        this.N.renderedOutputBufferCount++;
        this.f17889c0 = 0;
        if (!this.Y) {
            this.Y = true;
            this.Q.renderedFirstFrame(this.W);
        }
        return true;
    }

    public static int a(String str, int i10, int i11) {
        int i12;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.getClass();
        int i13 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i12 = i11 * i10;
                i13 = 2;
                return (i12 * 3) / (i13 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i12 = i11 * i10;
                return (i12 * 3) / (i13 * 2);
            case "video/avc":
                if ("BRAVIA 4K 2015".equals(z.f17876d)) {
                    return -1;
                }
                i12 = ((i11 + 15) / 16) * ((i10 + 15) / 16) * 256;
                i13 = 2;
                return (i12 * 3) / (i13 * 2);
            default:
                return -1;
        }
    }
}
