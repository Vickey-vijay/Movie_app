package h5;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.DummySurface;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import g5.h0;
import g5.k0;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import k3.f0;
import k3.q0;

/* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends MediaCodecRenderer {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final int[] f53713k1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static boolean f53714l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static boolean f53715m1;
    public final int A0;
    public final boolean B0;
    public final long[] C0;
    public final long[] D0;
    public a E0;
    public boolean F0;
    public boolean G0;
    public Surface H0;
    public Surface I0;
    public int J0;
    public boolean K0;
    public long L0;
    public long M0;
    public long N0;
    public int O0;
    public int P0;
    public int Q0;
    public long R0;
    public int S0;
    public float T0;

    @Nullable
    public MediaFormat U0;
    public int V0;
    public int W0;
    public int X0;
    public float Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f53716a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f53717b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public float f53718c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f53719d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f53720e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    @Nullable
    public b f53721f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f53722g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public long f53723h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f53724i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    @Nullable
    public g f53725j1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Context f53726w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final h f53727x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final q.a f53728y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final long f53729z0;

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    @TargetApi(23)
    public final class b implements MediaCodec.OnFrameRenderedListener, Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f53733b;

        public b(MediaCodec mediaCodec) {
            Handler handler = new Handler(this);
            this.f53733b = handler;
            mediaCodec.setOnFrameRenderedListener(this, handler);
        }

        public final void a(long j10) {
            d dVar = d.this;
            if (this != dVar.f53721f1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                dVar.g1();
            } else {
                dVar.f1(j10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(k0.J0(message.arg1, message.arg2));
            return true;
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
            if (k0.f53108a >= 30) {
                a(j10);
            } else {
                this.f53733b.sendMessageAtFrontOfQueue(Message.obtain(this.f53733b, 0, (int) (j10 >> 32), (int) j10));
            }
        }
    }

    @Deprecated
    public d(Context context, com.google.android.exoplayer2.mediacodec.b bVar, long j10, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, boolean z10, boolean z11, @Nullable Handler handler, @Nullable q qVar, int i10) {
        super(2, bVar, aVar, z10, z11, 30.0f);
        this.f53729z0 = j10;
        this.A0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f53726w0 = applicationContext;
        this.f53727x0 = new h(applicationContext);
        this.f53728y0 = new q.a(handler, qVar);
        this.B0 = O0();
        this.C0 = new long[10];
        this.D0 = new long[10];
        this.f53723h1 = -9223372036854775807L;
        this.f53722g1 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.V0 = -1;
        this.W0 = -1;
        this.Y0 = -1.0f;
        this.T0 = -1.0f;
        this.J0 = 1;
        L0();
    }

    public static int Q0(com.google.android.exoplayer2.mediacodec.a aVar, String str, int i10, int i11) {
        int iK;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.hashCode();
        int i12 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iK = i10 * i11;
                i12 = 2;
                return (iK * 3) / (i12 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iK = i10 * i11;
                return (iK * 3) / (i12 * 2);
            case "video/avc":
                String str2 = k0.f53111d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(k0.f53110c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && aVar.f19253g)))) {
                    return -1;
                }
                iK = k0.k(i10, 16) * k0.k(i11, 16) * 16 * 16;
                i12 = 2;
                return (iK * 3) / (i12 * 2);
            default:
                return -1;
        }
    }

    public static boolean W0(long j10) {
        return j10 < -30000;
    }

    public static boolean X0(long j10) {
        return j10 < -500000;
    }

    public final void K0() {
        MediaCodec mediaCodecQ;
        this.K0 = false;
        if (k0.f53108a < 23 || !this.f53719d1 || (mediaCodecQ = Q()) == null) {
            return;
        }
        this.f53721f1 = new b(mediaCodecQ);
    }

    public final void L0() {
        this.Z0 = -1;
        this.f53716a1 = -1;
        this.f53718c1 = -1.0f;
        this.f53717b1 = -1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public boolean O() {
        try {
            return super.O();
        } finally {
            this.Q0 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float U(float f10, Format format, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format2 : formatArr) {
            float f11 = format2.f18977q;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // k3.e, k3.o0.b
    public void handleMessage(int i10, @Nullable Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            n1((Surface) obj);
            return;
        }
        if (i10 != 4) {
            if (i10 == 6) {
                this.f53725j1 = (g) obj;
                return;
            } else {
                super.handleMessage(i10, obj);
                return;
            }
        }
        this.J0 = ((Integer) obj).intValue();
        MediaCodec mediaCodecQ = Q();
        if (mediaCodecQ != null) {
            mediaCodecQ.setVideoScalingMode(this.J0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void q() {
        Surface surface;
        try {
            super.q();
            surface = this.I0;
            if (surface != null) {
                if (this.H0 == surface) {
                    this.H0 = null;
                }
            }
        } finally {
            if (this.I0 != null) {
                Surface surface2 = this.H0;
                surface = this.I0;
                if (surface2 == surface) {
                    this.H0 = null;
                }
                surface.release();
                this.I0 = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void u0() {
        try {
            super.u0();
        } finally {
            this.Q0 = 0;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int x(MediaCodec mediaCodec, com.google.android.exoplayer2.mediacodec.a aVar, Format format, Format format2) {
        if (!aVar.o(format, format2, true)) {
            return 0;
        }
        int i10 = format2.f18975o;
        a aVar2 = this.E0;
        if (i10 > aVar2.f53730a || format2.f18976p > aVar2.f53731b || U0(aVar, format2) > this.E0.f53732c) {
            return 0;
        }
        return format.E(format2) ? 3 : 2;
    }

    /* JADX INFO: compiled from: MediaCodecVideoRenderer.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f53730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f53732c;

        public a(int i10, int i11, int i12) {
            this.f53730a = i10;
            this.f53731b = i11;
            this.f53732c = i12;
        }
    }

    @TargetApi(21)
    public static void N0(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    public static boolean O0() {
        return "NVIDIA".equals(k0.f53110c);
    }

    public static Point R0(com.google.android.exoplayer2.mediacodec.a aVar, Format format) {
        int i10 = format.f18976p;
        int i11 = format.f18975o;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f53713k1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (k0.f53108a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointB = aVar.b(i15, i13);
                if (aVar.t(pointB.x, pointB.y, format.f18977q)) {
                    return pointB;
                }
            } else {
                try {
                    int iK = k0.k(i13, 16) * 16;
                    int iK2 = k0.k(i14, 16) * 16;
                    if (iK * iK2 <= MediaCodecUtil.H()) {
                        int i16 = z10 ? iK2 : iK;
                        if (!z10) {
                            iK = iK2;
                        }
                        return new Point(i16, iK);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    public static List<com.google.android.exoplayer2.mediacodec.a> T0(com.google.android.exoplayer2.mediacodec.b bVar, Format format, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> pairL;
        String str = format.f18970j;
        if (str == null) {
            return Collections.emptyList();
        }
        List<com.google.android.exoplayer2.mediacodec.a> listP = MediaCodecUtil.p(bVar.getDecoderInfos(str, z10, z11), format);
        if ("video/dolby-vision".equals(str) && (pairL = MediaCodecUtil.l(format)) != null) {
            int iIntValue = ((Integer) pairL.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listP.addAll(bVar.getDecoderInfos("video/hevc", z10, z11));
            } else if (iIntValue == 512) {
                listP.addAll(bVar.getDecoderInfos("video/avc", z10, z11));
            }
        }
        return Collections.unmodifiableList(listP);
    }

    public static int U0(com.google.android.exoplayer2.mediacodec.a aVar, Format format) {
        if (format.f18971k == -1) {
            return Q0(aVar, format.f18970j, format.f18975o, format.f18976p);
        }
        int size = format.f18972l.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += format.f18972l.get(i10).length;
        }
        return format.f18971k + length;
    }

    @TargetApi(29)
    public static void k1(MediaCodec mediaCodec, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodec.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean D0(com.google.android.exoplayer2.mediacodec.a aVar) {
        return this.H0 != null || r1(aVar);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int F0(com.google.android.exoplayer2.mediacodec.b bVar, @Nullable com.google.android.exoplayer2.drm.a<p3.j> aVar, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i10 = 0;
        if (!g5.p.n(format.f18970j)) {
            return q0.create(0);
        }
        DrmInitData drmInitData = format.f18973m;
        boolean z10 = drmInitData != null;
        List<com.google.android.exoplayer2.mediacodec.a> listT0 = T0(bVar, format, z10, false);
        if (z10 && listT0.isEmpty()) {
            listT0 = T0(bVar, format, false, false);
        }
        if (listT0.isEmpty()) {
            return q0.create(1);
        }
        if (!(drmInitData == null || p3.j.class.equals(format.D) || (format.D == null && k3.e.w(aVar, drmInitData)))) {
            return q0.create(2);
        }
        com.google.android.exoplayer2.mediacodec.a aVar2 = listT0.get(0);
        boolean zL = aVar2.l(format);
        int i11 = aVar2.n(format) ? 16 : 8;
        if (zL) {
            List<com.google.android.exoplayer2.mediacodec.a> listT1 = T0(bVar, format, z10, true);
            if (!listT1.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.a aVar3 = listT1.get(0);
                if (aVar3.l(format) && aVar3.n(format)) {
                    i10 = 32;
                }
            }
        }
        return q0.create(zL ? 4 : 3, i11, i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void H(com.google.android.exoplayer2.mediacodec.a aVar, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f10) {
        String str = aVar.f19249c;
        a aVarS0 = S0(aVar, format, k());
        this.E0 = aVarS0;
        MediaFormat mediaFormatV0 = V0(format, str, aVarS0, f10, this.B0, this.f53720e1);
        if (this.H0 == null) {
            g5.a.f(r1(aVar));
            if (this.I0 == null) {
                this.I0 = DummySurface.f(this.f53726w0, aVar.f19253g);
            }
            this.H0 = this.I0;
        }
        mediaCodec.configure(mediaFormatV0, this.H0, mediaCrypto, 0);
        if (k0.f53108a < 23 || !this.f53719d1) {
            return;
        }
        this.f53721f1 = new b(mediaCodec);
    }

    /* JADX WARN: Code duplicated, block: B:400:0x0616  */
    /* JADX WARN: Code duplicated, block: B:420:0x0650  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean M0(String str) {
        byte b10 = 0;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (d.class) {
            if (!f53714l1) {
                String str2 = k0.f53109b;
                if ("dangal".equals(str2)) {
                    f53715m1 = true;
                } else {
                    int i10 = k0.f53108a;
                    byte b11 = 27;
                    if (i10 <= 27 && "HWEML".equals(str2)) {
                        f53715m1 = true;
                    } else if (i10 < 27) {
                        switch (str2.hashCode()) {
                            case -2144781245:
                                if (!str2.equals("GIONEE_SWW1609")) {
                                    b11 = -1;
                                } else {
                                    b11 = 43;
                                }
                                break;
                            case -2144781185:
                                if (!str2.equals("GIONEE_SWW1627")) {
                                    b11 = -1;
                                } else {
                                    b11 = 44;
                                }
                                break;
                            case -2144781160:
                                if (!str2.equals("GIONEE_SWW1631")) {
                                    b11 = -1;
                                } else {
                                    b11 = 45;
                                }
                                break;
                            case -2097309513:
                                if (!str2.equals("K50a40")) {
                                    b11 = -1;
                                } else {
                                    b11 = 63;
                                }
                                break;
                            case -2022874474:
                                if (!str2.equals("CP8676_I02")) {
                                    b11 = -1;
                                } else {
                                    b11 = 19;
                                }
                                break;
                            case -1978993182:
                                if (!str2.equals("NX541J")) {
                                    b11 = -1;
                                } else {
                                    b11 = 77;
                                }
                                break;
                            case -1978990237:
                                if (!str2.equals("NX573J")) {
                                    b11 = -1;
                                } else {
                                    b11 = 78;
                                }
                                break;
                            case -1936688988:
                                if (!str2.equals("PGN528")) {
                                    b11 = -1;
                                } else {
                                    b11 = 88;
                                }
                                break;
                            case -1936688066:
                                if (!str2.equals("PGN610")) {
                                    b11 = -1;
                                } else {
                                    b11 = 89;
                                }
                                break;
                            case -1936688065:
                                if (!str2.equals("PGN611")) {
                                    b11 = -1;
                                } else {
                                    b11 = 90;
                                }
                                break;
                            case -1931988508:
                                if (!str2.equals("AquaPowerM")) {
                                    b11 = -1;
                                } else {
                                    b11 = 11;
                                }
                                break;
                            case -1696512866:
                                if (!str2.equals("XT1663")) {
                                    b11 = -1;
                                } else {
                                    b11 = 123;
                                }
                                break;
                            case -1680025915:
                                if (!str2.equals("ComioS1")) {
                                    b11 = -1;
                                } else {
                                    b11 = 18;
                                }
                                break;
                            case -1615810839:
                                if (!str2.equals("Phantom6")) {
                                    b11 = -1;
                                } else {
                                    b11 = 91;
                                }
                                break;
                            case -1554255044:
                                if (!str2.equals("vernee_M5")) {
                                    b11 = -1;
                                } else {
                                    b11 = 116;
                                }
                                break;
                            case -1481772737:
                                if (!str2.equals("panell_dl")) {
                                    b11 = -1;
                                } else {
                                    b11 = 84;
                                }
                                break;
                            case -1481772730:
                                if (!str2.equals("panell_ds")) {
                                    b11 = -1;
                                } else {
                                    b11 = 85;
                                }
                                break;
                            case -1481772729:
                                if (!str2.equals("panell_dt")) {
                                    b11 = -1;
                                } else {
                                    b11 = 86;
                                }
                                break;
                            case -1320080169:
                                if (!str2.equals("GiONEE_GBL7319")) {
                                    b11 = -1;
                                } else {
                                    b11 = 41;
                                }
                                break;
                            case -1217592143:
                                if (!str2.equals("BRAVIA_ATV2")) {
                                    b11 = -1;
                                } else {
                                    b11 = 15;
                                }
                                break;
                            case -1180384755:
                                if (!str2.equals("iris60")) {
                                    b11 = -1;
                                } else {
                                    b11 = 59;
                                }
                                break;
                            case -1139198265:
                                if (!str2.equals("Slate_Pro")) {
                                    b11 = -1;
                                } else {
                                    b11 = 104;
                                }
                                break;
                            case -1052835013:
                                if (!str2.equals("namath")) {
                                    b11 = -1;
                                } else {
                                    b11 = 75;
                                }
                                break;
                            case -993250464:
                                if (!str2.equals("A10-70F")) {
                                    b11 = -1;
                                } else {
                                    b11 = 3;
                                }
                                break;
                            case -993250458:
                                if (!str2.equals("A10-70L")) {
                                    b11 = -1;
                                } else {
                                    b11 = 4;
                                }
                                break;
                            case -965403638:
                                if (!str2.equals("s905x018")) {
                                    b11 = -1;
                                } else {
                                    b11 = 106;
                                }
                                break;
                            case -958336948:
                                if (!str2.equals("ELUGA_Ray_X")) {
                                    b11 = -1;
                                } else {
                                    b11 = 29;
                                }
                                break;
                            case -879245230:
                                if (!str2.equals("tcl_eu")) {
                                    b11 = -1;
                                } else {
                                    b11 = 112;
                                }
                                break;
                            case -842500323:
                                if (!str2.equals("nicklaus_f")) {
                                    b11 = -1;
                                } else {
                                    b11 = 76;
                                }
                                break;
                            case -821392978:
                                if (!str2.equals("A7000-a")) {
                                    b11 = -1;
                                } else {
                                    b11 = 7;
                                }
                                break;
                            case -797483286:
                                if (!str2.equals("SVP-DTV15")) {
                                    b11 = -1;
                                } else {
                                    b11 = 105;
                                }
                                break;
                            case -794946968:
                                if (!str2.equals("watson")) {
                                    b11 = -1;
                                } else {
                                    b11 = 117;
                                }
                                break;
                            case -788334647:
                                if (!str2.equals("whyred")) {
                                    b11 = -1;
                                } else {
                                    b11 = 118;
                                }
                                break;
                            case -782144577:
                                if (!str2.equals("OnePlus5T")) {
                                    b11 = -1;
                                } else {
                                    b11 = 79;
                                }
                                break;
                            case -575125681:
                                if (!str2.equals("GiONEE_CBL7513")) {
                                    b11 = -1;
                                } else {
                                    b11 = 40;
                                }
                                break;
                            case -521118391:
                                if (!str2.equals("GIONEE_GBL7360")) {
                                    b11 = -1;
                                } else {
                                    b11 = ExifInterface.START_CODE;
                                }
                                break;
                            case -430914369:
                                if (!str2.equals("Pixi4-7_3G")) {
                                    b11 = -1;
                                } else {
                                    b11 = 92;
                                }
                                break;
                            case -290434366:
                                if (!str2.equals("taido_row")) {
                                    b11 = -1;
                                } else {
                                    b11 = 107;
                                }
                                break;
                            case -282781963:
                                if (!str2.equals("BLACK-1X")) {
                                    b11 = -1;
                                } else {
                                    b11 = 14;
                                }
                                break;
                            case -277133239:
                                if (!str2.equals("Z12_PRO")) {
                                    b11 = -1;
                                } else {
                                    b11 = 124;
                                }
                                break;
                            case -173639913:
                                if (!str2.equals("ELUGA_A3_Pro")) {
                                    b11 = -1;
                                } else {
                                    b11 = 26;
                                }
                                break;
                            case -56598463:
                                if (!str2.equals("woods_fn")) {
                                    b11 = -1;
                                } else {
                                    b11 = 120;
                                }
                                break;
                            case 2126:
                                if (!str2.equals("C1")) {
                                    b11 = -1;
                                } else {
                                    b11 = 17;
                                }
                                break;
                            case 2564:
                                if (!str2.equals("Q5")) {
                                    b11 = -1;
                                } else {
                                    b11 = 100;
                                }
                                break;
                            case 2715:
                                if (!str2.equals("V1")) {
                                    b11 = -1;
                                } else {
                                    b11 = 113;
                                }
                                break;
                            case 2719:
                                if (!str2.equals("V5")) {
                                    b11 = -1;
                                } else {
                                    b11 = 115;
                                }
                                break;
                            case 3483:
                                if (!str2.equals("mh")) {
                                    b11 = -1;
                                } else {
                                    b11 = 72;
                                }
                                break;
                            case 73405:
                                if (!str2.equals("JGZ")) {
                                    b11 = -1;
                                } else {
                                    b11 = 62;
                                }
                                break;
                            case 75739:
                                if (!str2.equals("M5c")) {
                                    b11 = -1;
                                } else {
                                    b11 = 68;
                                }
                                break;
                            case 76779:
                                if (!str2.equals("MX6")) {
                                    b11 = -1;
                                } else {
                                    b11 = 74;
                                }
                                break;
                            case 78669:
                                if (!str2.equals("P85")) {
                                    b11 = -1;
                                } else {
                                    b11 = 82;
                                }
                                break;
                            case 79305:
                                if (!str2.equals("PLE")) {
                                    b11 = -1;
                                } else {
                                    b11 = 94;
                                }
                                break;
                            case 80618:
                                if (!str2.equals("QX1")) {
                                    b11 = -1;
                                } else {
                                    b11 = 102;
                                }
                                break;
                            case 88274:
                                if (!str2.equals("Z80")) {
                                    b11 = -1;
                                } else {
                                    b11 = 125;
                                }
                                break;
                            case 98846:
                                if (!str2.equals("cv1")) {
                                    b11 = -1;
                                } else {
                                    b11 = 22;
                                }
                                break;
                            case 98848:
                                if (!str2.equals("cv3")) {
                                    b11 = -1;
                                } else {
                                    b11 = 23;
                                }
                                break;
                            case 99329:
                                if (!str2.equals("deb")) {
                                    b11 = -1;
                                } else {
                                    b11 = 24;
                                }
                                break;
                            case 101481:
                                if (!str2.equals("flo")) {
                                    b11 = -1;
                                } else {
                                    b11 = 38;
                                }
                                break;
                            case 1513190:
                                if (!str2.equals("1601")) {
                                    b11 = -1;
                                } else {
                                    b11 = 0;
                                }
                                break;
                            case 1514184:
                                if (!str2.equals("1713")) {
                                    b11 = -1;
                                } else {
                                    b11 = 1;
                                }
                                break;
                            case 1514185:
                                if (!str2.equals("1714")) {
                                    b11 = -1;
                                } else {
                                    b11 = 2;
                                }
                                break;
                            case 2436959:
                                if (!str2.equals("P681")) {
                                    b11 = -1;
                                } else {
                                    b11 = 81;
                                }
                                break;
                            case 2463773:
                                if (!str2.equals("Q350")) {
                                    b11 = -1;
                                } else {
                                    b11 = 96;
                                }
                                break;
                            case 2464648:
                                if (!str2.equals("Q427")) {
                                    b11 = -1;
                                } else {
                                    b11 = 98;
                                }
                                break;
                            case 2689555:
                                if (!str2.equals("XE2X")) {
                                    b11 = -1;
                                } else {
                                    b11 = 122;
                                }
                                break;
                            case 3154429:
                                if (!str2.equals("fugu")) {
                                    b11 = -1;
                                } else {
                                    b11 = 39;
                                }
                                break;
                            case 3284551:
                                if (!str2.equals("kate")) {
                                    b11 = -1;
                                } else {
                                    b11 = 64;
                                }
                                break;
                            case 3351335:
                                if (!str2.equals("mido")) {
                                    b11 = -1;
                                } else {
                                    b11 = 73;
                                }
                                break;
                            case 3386211:
                                if (!str2.equals("p212")) {
                                    b11 = -1;
                                } else {
                                    b11 = 80;
                                }
                                break;
                            case 41325051:
                                if (!str2.equals("MEIZU_M5")) {
                                    b11 = -1;
                                } else {
                                    b11 = 71;
                                }
                                break;
                            case 55178625:
                                if (!str2.equals("Aura_Note_2")) {
                                    b11 = -1;
                                } else {
                                    b11 = 13;
                                }
                                break;
                            case 61542055:
                                if (!str2.equals("A1601")) {
                                    b11 = -1;
                                } else {
                                    b11 = 5;
                                }
                                break;
                            case 65355429:
                                if (!str2.equals("E5643")) {
                                    b11 = -1;
                                } else {
                                    b11 = 25;
                                }
                                break;
                            case 66214468:
                                if (!str2.equals("F3111")) {
                                    b11 = -1;
                                } else {
                                    b11 = 31;
                                }
                                break;
                            case 66214470:
                                if (!str2.equals("F3113")) {
                                    b11 = -1;
                                } else {
                                    b11 = 32;
                                }
                                break;
                            case 66214473:
                                if (!str2.equals("F3116")) {
                                    b11 = -1;
                                } else {
                                    b11 = 33;
                                }
                                break;
                            case 66215429:
                                if (!str2.equals("F3211")) {
                                    b11 = -1;
                                } else {
                                    b11 = 34;
                                }
                                break;
                            case 66215431:
                                if (!str2.equals("F3213")) {
                                    b11 = -1;
                                } else {
                                    b11 = 35;
                                }
                                break;
                            case 66215433:
                                if (!str2.equals("F3215")) {
                                    b11 = -1;
                                } else {
                                    b11 = 36;
                                }
                                break;
                            case 66216390:
                                if (!str2.equals("F3311")) {
                                    b11 = -1;
                                } else {
                                    b11 = 37;
                                }
                                break;
                            case 76402249:
                                if (!str2.equals("PRO7S")) {
                                    b11 = -1;
                                } else {
                                    b11 = 95;
                                }
                                break;
                            case 76404105:
                                if (!str2.equals("Q4260")) {
                                    b11 = -1;
                                } else {
                                    b11 = 97;
                                }
                                break;
                            case 76404911:
                                if (!str2.equals("Q4310")) {
                                    b11 = -1;
                                } else {
                                    b11 = 99;
                                }
                                break;
                            case 80963634:
                                if (!str2.equals("V23GB")) {
                                    b11 = -1;
                                } else {
                                    b11 = 114;
                                }
                                break;
                            case 82882791:
                                if (!str2.equals("X3_HK")) {
                                    b11 = -1;
                                } else {
                                    b11 = 121;
                                }
                                break;
                            case 98715550:
                                if (!str2.equals("i9031")) {
                                    b11 = -1;
                                } else {
                                    b11 = 56;
                                }
                                break;
                            case 101370885:
                                if (!str2.equals("l5460")) {
                                    b11 = -1;
                                } else {
                                    b11 = 65;
                                }
                                break;
                            case 102844228:
                                if (!str2.equals("le_x6")) {
                                    b11 = -1;
                                } else {
                                    b11 = 66;
                                }
                                break;
                            case 165221241:
                                if (!str2.equals("A2016a40")) {
                                    b11 = -1;
                                } else {
                                    b11 = 6;
                                }
                                break;
                            case 182191441:
                                if (!str2.equals("CPY83_I00")) {
                                    b11 = -1;
                                } else {
                                    b11 = 21;
                                }
                                break;
                            case 245388979:
                                if (!str2.equals("marino_f")) {
                                    b11 = -1;
                                } else {
                                    b11 = 70;
                                }
                                break;
                            case 287431619:
                                if (!str2.equals("griffin")) {
                                    b11 = -1;
                                } else {
                                    b11 = 49;
                                }
                                break;
                            case 307593612:
                                if (!str2.equals("A7010a48")) {
                                    b11 = -1;
                                } else {
                                    b11 = 9;
                                }
                                break;
                            case 308517133:
                                if (!str2.equals("A7020a48")) {
                                    b11 = -1;
                                } else {
                                    b11 = 10;
                                }
                                break;
                            case 316215098:
                                if (!str2.equals("TB3-730F")) {
                                    b11 = -1;
                                } else {
                                    b11 = 108;
                                }
                                break;
                            case 316215116:
                                if (!str2.equals("TB3-730X")) {
                                    b11 = -1;
                                } else {
                                    b11 = 109;
                                }
                                break;
                            case 316246811:
                                if (!str2.equals("TB3-850F")) {
                                    b11 = -1;
                                } else {
                                    b11 = 110;
                                }
                                break;
                            case 316246818:
                                if (!str2.equals("TB3-850M")) {
                                    b11 = -1;
                                } else {
                                    b11 = 111;
                                }
                                break;
                            case 407160593:
                                if (!str2.equals("Pixi5-10_4G")) {
                                    b11 = -1;
                                } else {
                                    b11 = 93;
                                }
                                break;
                            case 507412548:
                                if (!str2.equals("QM16XE_U")) {
                                    b11 = -1;
                                } else {
                                    b11 = 101;
                                }
                                break;
                            case 793982701:
                                if (!str2.equals("GIONEE_WBL5708")) {
                                    b11 = -1;
                                } else {
                                    b11 = 46;
                                }
                                break;
                            case 794038622:
                                if (!str2.equals("GIONEE_WBL7365")) {
                                    b11 = -1;
                                } else {
                                    b11 = 47;
                                }
                                break;
                            case 794040393:
                                if (!str2.equals("GIONEE_WBL7519")) {
                                    b11 = -1;
                                } else {
                                    b11 = 48;
                                }
                                break;
                            case 835649806:
                                if (!str2.equals("manning")) {
                                    b11 = -1;
                                } else {
                                    b11 = 69;
                                }
                                break;
                            case 917340916:
                                if (!str2.equals("A7000plus")) {
                                    b11 = -1;
                                } else {
                                    b11 = 8;
                                }
                                break;
                            case 958008161:
                                if (!str2.equals("j2xlteins")) {
                                    b11 = -1;
                                } else {
                                    b11 = 61;
                                }
                                break;
                            case 1060579533:
                                if (!str2.equals("panell_d")) {
                                    b11 = -1;
                                } else {
                                    b11 = 83;
                                }
                                break;
                            case 1150207623:
                                if (!str2.equals("LS-5017")) {
                                    b11 = -1;
                                } else {
                                    b11 = 67;
                                }
                                break;
                            case 1176899427:
                                if (!str2.equals("itel_S41")) {
                                    b11 = -1;
                                } else {
                                    b11 = 60;
                                }
                                break;
                            case 1280332038:
                                if (!str2.equals("hwALE-H")) {
                                    b11 = -1;
                                } else {
                                    b11 = 51;
                                }
                                break;
                            case 1306947716:
                                if (!str2.equals("EverStar_S")) {
                                    b11 = -1;
                                } else {
                                    b11 = 30;
                                }
                                break;
                            case 1349174697:
                                if (!str2.equals("htc_e56ml_dtul")) {
                                    b11 = -1;
                                } else {
                                    b11 = 50;
                                }
                                break;
                            case 1522194893:
                                if (!str2.equals("woods_f")) {
                                    b11 = -1;
                                } else {
                                    b11 = 119;
                                }
                                break;
                            case 1691543273:
                                if (!str2.equals("CPH1609")) {
                                    b11 = -1;
                                } else {
                                    b11 = 20;
                                }
                                break;
                            case 1709443163:
                                if (!str2.equals("iball8735_9806")) {
                                    b11 = -1;
                                } else {
                                    b11 = 57;
                                }
                                break;
                            case 1865889110:
                                if (!str2.equals("santoni")) {
                                    b11 = -1;
                                } else {
                                    b11 = 103;
                                }
                                break;
                            case 1906253259:
                                if (!str2.equals("PB2-670M")) {
                                    b11 = -1;
                                } else {
                                    b11 = 87;
                                }
                                break;
                            case 1977196784:
                                if (!str2.equals("Infinix-X572")) {
                                    b11 = -1;
                                } else {
                                    b11 = 58;
                                }
                                break;
                            case 2006372676:
                                if (!str2.equals("BRAVIA_ATV3_4K")) {
                                    b11 = -1;
                                } else {
                                    b11 = 16;
                                }
                                break;
                            case 2029784656:
                                if (!str2.equals("HWBLN-H")) {
                                    b11 = -1;
                                } else {
                                    b11 = 52;
                                }
                                break;
                            case 2030379515:
                                if (!str2.equals("HWCAM-H")) {
                                    b11 = -1;
                                } else {
                                    b11 = 53;
                                }
                                break;
                            case 2033393791:
                                if (!str2.equals("ASUS_X00AD_2")) {
                                    b11 = -1;
                                } else {
                                    b11 = 12;
                                }
                                break;
                            case 2047190025:
                                if (!str2.equals("ELUGA_Note")) {
                                    b11 = -1;
                                }
                                break;
                            case 2047252157:
                                if (!str2.equals("ELUGA_Prim")) {
                                    b11 = -1;
                                } else {
                                    b11 = 28;
                                }
                                break;
                            case 2048319463:
                                if (!str2.equals("HWVNS-H")) {
                                    b11 = -1;
                                } else {
                                    b11 = 54;
                                }
                                break;
                            case 2048855701:
                                if (!str2.equals("HWWAS-H")) {
                                    b11 = -1;
                                } else {
                                    b11 = 55;
                                }
                                break;
                            default:
                                b11 = -1;
                                break;
                        }
                        switch (b11) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                            case 59:
                            case 60:
                            case 61:
                            case 62:
                            case 63:
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                            case 76:
                            case 77:
                            case 78:
                            case 79:
                            case 80:
                            case 81:
                            case 82:
                            case 83:
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                            case 88:
                            case 89:
                            case 90:
                            case 91:
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                            case 97:
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                            case 104:
                            case 105:
                            case 106:
                            case 107:
                            case 108:
                            case 109:
                            case 110:
                            case 111:
                            case 112:
                            case 113:
                            case 114:
                            case 115:
                            case 116:
                            case 117:
                            case 118:
                            case 119:
                            case 120:
                            case 121:
                            case 122:
                            case 123:
                            case 124:
                            case 125:
                                f53715m1 = true;
                                break;
                        }
                        String str3 = k0.f53111d;
                        int iHashCode = str3.hashCode();
                        if (iHashCode != -594534941) {
                            if (iHashCode != 2006354) {
                                if (iHashCode == 2006367 && str3.equals("AFTN")) {
                                    b10 = 1;
                                } else {
                                    b10 = -1;
                                }
                            } else if (!str3.equals("AFTA")) {
                                b10 = -1;
                            }
                        } else if (str3.equals("JSN-L21")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                        if (b10 == 0 || b10 == 1 || b10 == 2) {
                            f53715m1 = true;
                        }
                    }
                }
                f53714l1 = true;
            }
        }
        return f53715m1;
    }

    public void P0(MediaCodec mediaCodec, int i10, long j10) {
        h0.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        h0.c();
        t1(1);
    }

    public a S0(com.google.android.exoplayer2.mediacodec.a aVar, Format format, Format[] formatArr) {
        int iQ0;
        int iMax = format.f18975o;
        int iMax2 = format.f18976p;
        int iU0 = U0(aVar, format);
        if (formatArr.length == 1) {
            if (iU0 != -1 && (iQ0 = Q0(aVar, format.f18970j, format.f18975o, format.f18976p)) != -1) {
                iU0 = Math.min((int) (iU0 * 1.5f), iQ0);
            }
            return new a(iMax, iMax2, iU0);
        }
        boolean z10 = false;
        for (Format format2 : formatArr) {
            if (aVar.o(format, format2, false)) {
                int i10 = format2.f18975o;
                z10 |= i10 == -1 || format2.f18976p == -1;
                iMax = Math.max(iMax, i10);
                iMax2 = Math.max(iMax2, format2.f18976p);
                iU0 = Math.max(iU0, U0(aVar, format2));
            }
        }
        if (z10) {
            g5.m.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
            Point pointR0 = R0(aVar, format);
            if (pointR0 != null) {
                iMax = Math.max(iMax, pointR0.x);
                iMax2 = Math.max(iMax2, pointR0.y);
                iU0 = Math.max(iU0, Q0(aVar, format.f18970j, iMax, iMax2));
                g5.m.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + VastAttributes.HORIZONTAL_POSITION + iMax2);
            }
        }
        return new a(iMax, iMax2, iU0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean T() {
        return this.f53719d1 && k0.f53108a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<com.google.android.exoplayer2.mediacodec.a> V(com.google.android.exoplayer2.mediacodec.b bVar, Format format, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return T0(bVar, format, z10, this.f53719d1);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat V0(Format format, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairL;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.f18975o);
        mediaFormat.setInteger("height", format.f18976p);
        b4.e.e(mediaFormat, format.f18972l);
        b4.e.c(mediaFormat, "frame-rate", format.f18977q);
        b4.e.d(mediaFormat, "rotation-degrees", format.f18978r);
        b4.e.b(mediaFormat, format.f18982v);
        if ("video/dolby-vision".equals(format.f18970j) && (pairL = MediaCodecUtil.l(format)) != null) {
            b4.e.d(mediaFormat, Scopes.PROFILE, ((Integer) pairL.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f53730a);
        mediaFormat.setInteger("max-height", aVar.f53731b);
        b4.e.d(mediaFormat, "max-input-size", aVar.f53732c);
        if (k0.f53108a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            N0(mediaFormat, i10);
        }
        return mediaFormat;
    }

    public final void Z0() {
        if (this.O0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f53728y0.j(this.O0, jElapsedRealtime - this.N0);
            this.O0 = 0;
            this.N0 = jElapsedRealtime;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void a0(o3.e eVar) throws ExoPlaybackException {
        if (this.G0) {
            ByteBuffer byteBuffer = (ByteBuffer) g5.a.e(eVar.f64972f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    k1(Q(), bArr);
                }
            }
        }
    }

    public void a1() {
        if (this.K0) {
            return;
        }
        this.K0 = true;
        this.f53728y0.t(this.H0);
    }

    public final void b1() {
        int i10 = this.V0;
        if (i10 == -1 && this.W0 == -1) {
            return;
        }
        if (this.Z0 == i10 && this.f53716a1 == this.W0 && this.f53717b1 == this.X0 && this.f53718c1 == this.Y0) {
            return;
        }
        this.f53728y0.u(i10, this.W0, this.X0, this.Y0);
        this.Z0 = this.V0;
        this.f53716a1 = this.W0;
        this.f53717b1 = this.X0;
        this.f53718c1 = this.Y0;
    }

    public final void c1() {
        if (this.K0) {
            this.f53728y0.t(this.H0);
        }
    }

    public final void d1() {
        int i10 = this.Z0;
        if (i10 == -1 && this.f53716a1 == -1) {
            return;
        }
        this.f53728y0.u(i10, this.f53716a1, this.f53717b1, this.f53718c1);
    }

    public final void e1(long j10, long j11, Format format, MediaFormat mediaFormat) {
        g gVar = this.f53725j1;
        if (gVar != null) {
            gVar.a(j10, j11, format, mediaFormat);
        }
    }

    public final void h1(MediaCodec mediaCodec, int i10, int i11) {
        this.V0 = i10;
        this.W0 = i11;
        float f10 = this.T0;
        this.Y0 = f10;
        if (k0.f53108a >= 21) {
            int i12 = this.S0;
            if (i12 == 90 || i12 == 270) {
                this.V0 = i11;
                this.W0 = i10;
                this.Y0 = 1.0f / f10;
            }
        } else {
            this.X0 = this.S0;
        }
        mediaCodec.setVideoScalingMode(this.J0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void j0(String str, long j10, long j11) {
        this.f53728y0.h(str, j10, j11);
        this.F0 = M0(str);
        this.G0 = ((com.google.android.exoplayer2.mediacodec.a) g5.a.e(S())).m();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void l0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.U0 = mediaFormat;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        h1(mediaCodec, z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width"), z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height"));
    }

    public final void l1() {
        this.M0 = this.f53729z0 > 0 ? SystemClock.elapsedRealtime() + this.f53729z0 : -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void m0(long j10) {
        if (!this.f53719d1) {
            this.Q0--;
        }
        while (true) {
            int i10 = this.f53724i1;
            if (i10 == 0 || j10 < this.D0[0]) {
                return;
            }
            long[] jArr = this.C0;
            this.f53723h1 = jArr[0];
            int i11 = i10 - 1;
            this.f53724i1 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.D0;
            System.arraycopy(jArr2, 1, jArr2, 0, this.f53724i1);
            K0();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void n0(o3.e eVar) {
        if (!this.f53719d1) {
            this.Q0++;
        }
        this.f53722g1 = Math.max(eVar.f64971e, this.f53722g1);
        if (k0.f53108a >= 23 || !this.f53719d1) {
            return;
        }
        f1(eVar.f64971e);
    }

    public final void n1(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            Surface surface2 = this.I0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                com.google.android.exoplayer2.mediacodec.a aVarS = S();
                if (aVarS != null && r1(aVarS)) {
                    surface = DummySurface.f(this.f53726w0, aVarS.f19253g);
                    this.I0 = surface;
                }
            }
        }
        if (this.H0 == surface) {
            if (surface == null || surface == this.I0) {
                return;
            }
            d1();
            c1();
            return;
        }
        this.H0 = surface;
        int state = getState();
        MediaCodec mediaCodecQ = Q();
        if (mediaCodecQ != null) {
            if (k0.f53108a < 23 || surface == null || this.F0) {
                u0();
                g0();
            } else {
                m1(mediaCodecQ, surface);
            }
        }
        if (surface == null || surface == this.I0) {
            L0();
            K0();
            return;
        }
        d1();
        K0();
        if (state == 2) {
            l1();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean p0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws ExoPlaybackException {
        if (this.L0 == -9223372036854775807L) {
            this.L0 = j10;
        }
        long j13 = j12 - this.f53723h1;
        if (z10 && !z11) {
            s1(mediaCodec, i10, j13);
            return true;
        }
        long j14 = j12 - j10;
        if (this.H0 == this.I0) {
            if (!W0(j14)) {
                return false;
            }
            s1(mediaCodec, i10, j13);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = jElapsedRealtime - this.R0;
        boolean z12 = getState() == 2;
        if (this.M0 == -9223372036854775807L && j10 >= this.f53723h1 && (!this.K0 || (z12 && q1(j14, j15)))) {
            long jNanoTime = System.nanoTime();
            e1(j13, jNanoTime, format, this.U0);
            if (k0.f53108a >= 21) {
                j1(mediaCodec, i10, j13, jNanoTime);
                return true;
            }
            i1(mediaCodec, i10, j13);
            return true;
        }
        if (z12 && j10 != this.L0) {
            long jNanoTime2 = System.nanoTime();
            long jB = this.f53727x0.b(j12, ((j14 - (jElapsedRealtime - j11)) * 1000) + jNanoTime2);
            long j16 = (jB - jNanoTime2) / 1000;
            boolean z13 = this.M0 != -9223372036854775807L;
            if (o1(j16, j11, z11) && Y0(mediaCodec, i10, j13, j10, z13)) {
                return false;
            }
            if (p1(j16, j11, z11)) {
                if (z13) {
                    s1(mediaCodec, i10, j13);
                    return true;
                }
                P0(mediaCodec, i10, j13);
                return true;
            }
            if (k0.f53108a >= 21) {
                if (j16 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    e1(j13, jB, format, this.U0);
                    j1(mediaCodec, i10, j13, jB);
                    return true;
                }
            } else if (j16 < 30000) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                e1(j13, jB, format, this.U0);
                i1(mediaCodec, i10, j13);
                return true;
            }
        }
        return false;
    }

    public final boolean r1(com.google.android.exoplayer2.mediacodec.a aVar) {
        return k0.f53108a >= 23 && !this.f53719d1 && !M0(aVar.f19247a) && (!aVar.f19253g || DummySurface.e(this.f53726w0));
    }

    public void s1(MediaCodec mediaCodec, int i10, long j10) {
        h0.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        h0.c();
        this.f19224u0.f64964f++;
    }

    @Override // k3.e
    public void t(Format[] formatArr, long j10) throws ExoPlaybackException {
        if (this.f53723h1 == -9223372036854775807L) {
            this.f53723h1 = j10;
        } else {
            int i10 = this.f53724i1;
            if (i10 == this.C0.length) {
                g5.m.h("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.C0[this.f53724i1 - 1]);
            } else {
                this.f53724i1 = i10 + 1;
            }
            long[] jArr = this.C0;
            int i11 = this.f53724i1;
            jArr[i11 - 1] = j10;
            this.D0[i11 - 1] = this.f53722g1;
        }
        super.t(formatArr, j10);
    }

    public void t1(int i10) {
        o3.d dVar = this.f19224u0;
        dVar.f64965g += i10;
        this.O0 += i10;
        int i11 = this.P0 + i10;
        this.P0 = i11;
        dVar.f64966h = Math.max(i11, dVar.f64966h);
        int i12 = this.A0;
        if (i12 <= 0 || this.O0 < i12) {
            return;
        }
        Z0();
    }

    @TargetApi(23)
    public static void m1(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public boolean Y0(MediaCodec mediaCodec, int i10, long j10, long j11, boolean z10) throws ExoPlaybackException {
        int iV = v(j11);
        if (iV == 0) {
            return false;
        }
        o3.d dVar = this.f19224u0;
        dVar.f64967i++;
        int i11 = this.Q0 + iV;
        if (z10) {
            dVar.f64964f += i11;
        } else {
            t1(i11);
        }
        N();
        return true;
    }

    public void f1(long j10) {
        Format formatI0 = I0(j10);
        if (formatI0 != null) {
            h1(Q(), formatI0.f18975o, formatI0.f18976p);
        }
        b1();
        this.f19224u0.f64963e++;
        a1();
        m0(j10);
    }

    public final void g1() {
        A0();
    }

    public void i1(MediaCodec mediaCodec, int i10, long j10) {
        b1();
        h0.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        h0.c();
        this.R0 = SystemClock.elapsedRealtime() * 1000;
        this.f19224u0.f64963e++;
        this.P0 = 0;
        a1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.p0
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.K0 || (((surface = this.I0) != null && this.H0 == surface) || Q() == null || this.f53719d1))) {
            this.M0 = -9223372036854775807L;
            return true;
        }
        if (this.M0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.M0) {
            return true;
        }
        this.M0 = -9223372036854775807L;
        return false;
    }

    @TargetApi(21)
    public void j1(MediaCodec mediaCodec, int i10, long j10, long j11) {
        b1();
        h0.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j11);
        h0.c();
        this.R0 = SystemClock.elapsedRealtime() * 1000;
        this.f19224u0.f64963e++;
        this.P0 = 0;
        a1();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void k0(f0 f0Var) throws ExoPlaybackException {
        super.k0(f0Var);
        Format format = f0Var.f62129c;
        this.f53728y0.l(format);
        this.T0 = format.f18979s;
        this.S0 = format.f18978r;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void o(boolean z10) throws ExoPlaybackException {
        boolean z11;
        super.o(z10);
        int i10 = this.f53720e1;
        int i11 = h().f62238a;
        this.f53720e1 = i11;
        if (i11 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f53719d1 = z11;
        if (i11 != i10) {
            u0();
        }
        this.f53728y0.k(this.f19224u0);
        this.f53727x0.e();
    }

    public boolean o1(long j10, long j11, boolean z10) {
        if (X0(j10) && !z10) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void p(long j10, boolean z10) throws ExoPlaybackException {
        super.p(j10, z10);
        K0();
        this.L0 = -9223372036854775807L;
        this.P0 = 0;
        this.f53722g1 = -9223372036854775807L;
        int i10 = this.f53724i1;
        if (i10 != 0) {
            this.f53723h1 = this.C0[i10 - 1];
            this.f53724i1 = 0;
        }
        if (z10) {
            l1();
        } else {
            this.M0 = -9223372036854775807L;
        }
    }

    public boolean p1(long j10, long j11, boolean z10) {
        if (W0(j10) && !z10) {
            return true;
        }
        return false;
    }

    public boolean q1(long j10, long j11) {
        if (W0(j10) && j11 > 100000) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void r() {
        super.r();
        this.O0 = 0;
        this.N0 = SystemClock.elapsedRealtime();
        this.R0 = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void n() {
        this.f53722g1 = -9223372036854775807L;
        this.f53723h1 = -9223372036854775807L;
        this.f53724i1 = 0;
        this.U0 = null;
        L0();
        K0();
        this.f53727x0.d();
        this.f53721f1 = null;
        try {
            super.n();
        } finally {
            this.f53728y0.i(this.f19224u0);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, k3.e
    public void s() {
        this.M0 = -9223372036854775807L;
        Z0();
        super.s();
    }
}
