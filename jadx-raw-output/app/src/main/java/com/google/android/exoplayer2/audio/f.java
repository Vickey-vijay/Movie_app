package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import g5.k0;
import g5.o;
import g5.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k3.f0;
import k3.l0;
import k3.q0;
import m3.m;

/* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
/* JADX INFO: loaded from: classes4.dex */
public class f extends MediaCodecRenderer implements o {
    public int A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public MediaFormat E0;

    @Nullable
    public Format F0;
    public long G0;
    public boolean H0;
    public boolean I0;
    public long J0;
    public int K0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Context f19079w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.a.C0175a f19080x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final AudioSink f19081y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final long[] f19082z0;

    /* JADX INFO: compiled from: MediaCodecAudioRenderer.java */
    public final class b implements AudioSink.a {
        public b() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onAudioSessionId(int i10) {
            f.this.f19080x0.g(i10);
            f.this.V0(i10);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onPositionDiscontinuity() {
            f.this.W0();
            f.this.I0 = true;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onUnderrun(int i10, long j10, long j11) {
            f.this.f19080x0.h(i10, j10, j11);
            f.this.X0(i10, j10, j11);
        }
    }

    @Deprecated
    public f(Context context, com.google.android.exoplayer2.mediacodec.b bVar, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, boolean z10, boolean z11, @Nullable Handler handler, @Nullable com.google.android.exoplayer2.audio.a aVar2, AudioSink audioSink) {
        super(1, bVar, aVar, z10, z11, 44100.0f);
        this.f19079w0 = context.getApplicationContext();
        this.f19081y0 = audioSink;
        this.J0 = -9223372036854775807L;
        this.f19082z0 = new long[10];
        this.f19080x0 = new com.google.android.exoplayer2.audio.a.C0175a(handler, aVar2);
        audioSink.f(new b());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float U(float f10, Format format, Format[] formatArr) {
        int iMax = -1;
        for (Format format2 : formatArr) {
            int i10 = format2.f18984x;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f10 * iMax;
    }

    public void V0(int i10) {
    }

    public void W0() {
    }

    public void X0(int i10, long j10, long j11) {
    }

    @Override // k3.e, k3.p0
    @Nullable
    public o getMediaClock() {
        return this;
    }

    @Override // k3.e, k3.o0.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 2) {
            this.f19081y0.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f19081y0.c((m3.c) obj);
        } else if (i10 != 5) {
            super.handleMessage(i10, obj);
        } else {
            this.f19081y0.e((m) obj);
        }
    }

    public static boolean N0(String str) {
        if (k0.f53108a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(k0.f53110c)) {
            String str2 = k0.f53109b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean O0(String str) {
        if (k0.f53108a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(k0.f53110c)) {
            String str2 = k0.f53109b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean P0() {
        if (k0.f53108a == 23) {
            String str = k0.f53111d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int U0(Format format) {
        if ("audio/raw".equals(format.f18970j)) {
            return format.f18985y;
        }
        return 2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int F0(com.google.android.exoplayer2.mediacodec.b bVar, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, Format format) throws MediaCodecUtil.DecoderQueryException {
        String str = format.f18970j;
        if (!p.l(str)) {
            return q0.create(0);
        }
        int i10 = k0.f53108a >= 21 ? 32 : 0;
        boolean z10 = format.f18973m == null || p3.j.class.equals(format.D) || (format.D == null && k3.e.w(aVar, format.f18973m));
        int i11 = 8;
        if (z10 && L0(format.f18983w, str) && bVar.getPassthroughDecoderInfo() != null) {
            return q0.create(4, 8, i10);
        }
        if (("audio/raw".equals(str) && !this.f19081y0.d(format.f18983w, format.f18985y)) || !this.f19081y0.d(format.f18983w, 2)) {
            return q0.create(1);
        }
        List<com.google.android.exoplayer2.mediacodec.a> listV = V(bVar, format, false);
        if (listV.isEmpty()) {
            return q0.create(1);
        }
        if (!z10) {
            return q0.create(2);
        }
        com.google.android.exoplayer2.mediacodec.a aVar2 = listV.get(0);
        boolean zL = aVar2.l(format);
        if (zL && aVar2.n(format)) {
            i11 = 16;
        }
        return q0.create(zL ? 4 : 3, i11, i10);
    }

    public boolean M0(Format format, Format format2) {
        return k0.c(format.f18970j, format2.f18970j) && format.f18983w == format2.f18983w && format.f18984x == format2.f18984x && format.f18985y == format2.f18985y && format.E(format2) && !"audio/opus".equals(format.f18970j);
    }

    public final int Q0(com.google.android.exoplayer2.mediacodec.a aVar, Format format) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(aVar.f19247a) || (i10 = k0.f53108a) >= 24 || (i10 == 23 && k0.i0(this.f19079w0))) {
            return format.f18971k;
        }
        return -1;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat S0(Format format, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.f18983w);
        mediaFormat.setInteger("sample-rate", format.f18984x);
        b4.e.e(mediaFormat, format.f18972l);
        b4.e.d(mediaFormat, "max-input-size", i10);
        int i11 = k0.f53108a;
        if (i11 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f && !P0()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(format.f18970j)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        return mediaFormat;
    }

    public int T0(int i10, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (this.f19081y0.d(-1, 18)) {
                return p.d("audio/eac3-joc");
            }
            str = "audio/eac3";
        }
        int iD = p.d(str);
        if (this.f19081y0.d(i10, iD)) {
            return iD;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer2.mediacodec.a> V(com.google.android.exoplayer2.mediacodec.b bVar, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        com.google.android.exoplayer2.mediacodec.a passthroughDecoderInfo;
        String str = format.f18970j;
        if (str == null) {
            return Collections.emptyList();
        }
        if (L0(format.f18983w, str) && (passthroughDecoderInfo = bVar.getPassthroughDecoderInfo()) != null) {
            return Collections.singletonList(passthroughDecoderInfo);
        }
        List<com.google.android.exoplayer2.mediacodec.a> listP = MediaCodecUtil.p(bVar.getDecoderInfos(str, z10, false), format);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listP);
            arrayList.addAll(bVar.getDecoderInfos("audio/eac3", z10, false));
            listP = arrayList;
        }
        return Collections.unmodifiableList(listP);
    }

    public final void Y0() {
        long currentPositionUs = this.f19081y0.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.I0) {
                currentPositionUs = Math.max(this.G0, currentPositionUs);
            }
            this.G0 = currentPositionUs;
            this.I0 = false;
        }
    }

    @Override // g5.o
    public void b(l0 l0Var) {
        this.f19081y0.b(l0Var);
    }

    @Override // g5.o
    public l0 getPlaybackParameters() {
        return this.f19081y0.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.p0
    public boolean isReady() {
        return this.f19081y0.hasPendingData() || super.isReady();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void j0(String str, long j10, long j11) {
        this.f19080x0.i(str, j10, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void l0(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iR;
        int[] iArr;
        int i10;
        MediaFormat mediaFormat2 = this.E0;
        if (mediaFormat2 != null) {
            iR = T0(mediaFormat2.getInteger("channel-count"), mediaFormat2.getString("mime"));
            mediaFormat = mediaFormat2;
        } else {
            iR = mediaFormat.containsKey("v-bits-per-sample") ? k0.R(mediaFormat.getInteger("v-bits-per-sample")) : U0(this.F0);
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.C0 && integer == 6 && (i10 = this.F0.f18983w) < 6) {
            iArr = new int[i10];
            for (int i11 = 0; i11 < this.F0.f18983w; i11++) {
                iArr[i11] = i11;
            }
        } else {
            iArr = null;
        }
        int[] iArr2 = iArr;
        try {
            AudioSink audioSink = this.f19081y0;
            Format format = this.F0;
            audioSink.configure(iR, integer, integer2, 0, iArr2, format.f18986z, format.A);
        } catch (AudioSink.ConfigurationException e10) {
            throw g(e10, this.F0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void m0(long j10) {
        while (this.K0 != 0 && j10 >= this.f19082z0[0]) {
            this.f19081y0.handleDiscontinuity();
            int i10 = this.K0 - 1;
            this.K0 = i10;
            long[] jArr = this.f19082z0;
            System.arraycopy(jArr, 1, jArr, 0, i10);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void n0(o3.e eVar) {
        if (this.H0 && !eVar.isDecodeOnly()) {
            if (Math.abs(eVar.f64971e - this.G0) > 500000) {
                this.G0 = eVar.f64971e;
            }
            this.H0 = false;
        }
        this.J0 = Math.max(eVar.f64971e, this.J0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean p0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws ExoPlaybackException {
        if (this.D0 && j12 == 0 && (i11 & 4) != 0) {
            long j13 = this.J0;
            if (j13 != -9223372036854775807L) {
                j12 = j13;
            }
        }
        if (this.B0 && (i11 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        }
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            this.f19224u0.f64964f++;
            this.f19081y0.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.f19081y0.handleBuffer(byteBuffer, j12)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i10, false);
            this.f19224u0.f64963e++;
            return true;
        } catch (AudioSink.InitializationException | AudioSink.WriteException e10) {
            throw g(e10, this.F0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void v0() throws ExoPlaybackException {
        try {
            this.f19081y0.playToEndOfStream();
        } catch (AudioSink.WriteException e10) {
            throw g(e10, this.F0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void H(com.google.android.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f10) {
        String str;
        this.A0 = R0(aVar, format, k());
        this.C0 = N0(aVar.f19247a);
        this.D0 = O0(aVar.f19247a);
        boolean z10 = aVar.f19254h;
        this.B0 = z10;
        if (z10) {
            str = "audio/raw";
        } else {
            str = aVar.f19249c;
        }
        MediaFormat mediaFormatS0 = S0(format, str, this.A0, f10);
        mediaCodec.configure(mediaFormatS0, (Surface) null, mediaCrypto, 0);
        if (this.B0) {
            this.E0 = mediaFormatS0;
            mediaFormatS0.setString("mime", format.f18970j);
        } else {
            this.E0 = null;
        }
    }

    public boolean L0(int i10, String str) {
        if (T0(i10, str) != 0) {
            return true;
        }
        return false;
    }

    public int R0(com.google.android.exoplayer2.mediacodec.a aVar, Format format, Format[] formatArr) {
        int iQ0 = Q0(aVar, format);
        if (formatArr.length == 1) {
            return iQ0;
        }
        for (Format format2 : formatArr) {
            if (aVar.o(format, format2, false)) {
                iQ0 = Math.max(iQ0, Q0(aVar, format2));
            }
        }
        return iQ0;
    }

    @Override // g5.o
    public long getPositionUs() {
        if (getState() == 2) {
            Y0();
        }
        return this.G0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.p0
    public boolean isEnded() {
        if (super.isEnded() && this.f19081y0.isEnded()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void k0(f0 f0Var) throws ExoPlaybackException {
        super.k0(f0Var);
        Format format = f0Var.f62129c;
        this.F0 = format;
        this.f19080x0.l(format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void o(boolean z10) throws ExoPlaybackException {
        super.o(z10);
        this.f19080x0.k(this.f19224u0);
        int i10 = h().f62238a;
        if (i10 != 0) {
            this.f19081y0.enableTunnelingV21(i10);
        } else {
            this.f19081y0.disableTunneling();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        super.p(j10, z10);
        this.f19081y0.flush();
        this.G0 = j10;
        this.H0 = true;
        this.I0 = true;
        this.J0 = -9223372036854775807L;
        this.K0 = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void q() {
        try {
            super.q();
        } finally {
            this.f19081y0.reset();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void r() {
        super.r();
        this.f19081y0.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void s() {
        Y0();
        this.f19081y0.pause();
        super.s();
    }

    @Override // k3.e
    public void t(Format[] formatArr, long j10) throws ExoPlaybackException {
        super.t(formatArr, j10);
        if (this.J0 != -9223372036854775807L) {
            int i10 = this.K0;
            if (i10 == this.f19082z0.length) {
                g5.m.h("MediaCodecAudioRenderer", "Too many stream changes, so dropping change at " + this.f19082z0[this.K0 - 1]);
            } else {
                this.K0 = i10 + 1;
            }
            this.f19082z0[this.K0 - 1] = this.J0;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int x(MediaCodec mediaCodec, com.google.android.exoplayer2.mediacodec.a aVar, Format format, Format format2) {
        if (Q0(aVar, format2) <= this.A0 && format.f18986z == 0 && format.A == 0 && format2.f18986z == 0 && format2.A == 0) {
            if (aVar.o(format, format2, true)) {
                return 3;
            }
            if (M0(format, format2)) {
                return 1;
            }
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void n() {
        try {
            this.J0 = -9223372036854775807L;
            this.K0 = 0;
            this.f19081y0.flush();
            try {
                super.n();
            } finally {
                this.f19080x0.j(this.f19224u0);
            }
        } catch (Throwable th2) {
            try {
                super.n();
                throw th2;
            } finally {
                this.f19080x0.j(this.f19224u0);
            }
        }
    }
}
