package g5;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.ironsource.C3426d4;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import k3.q0;
import k3.v0;
import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: compiled from: EventLogger.java */
/* JADX INFO: loaded from: classes5.dex */
public class i implements l3.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final NumberFormat f53087f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final com.google.android.exoplayer2.trackselection.b f53088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0.c f53090c = new v0.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v0.b f53091d = new v0.b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f53092e = SystemClock.elapsedRealtime();

    public static String O(int i10, int i11) {
        if (i10 < 2) {
            return "N/A";
        }
        if (i11 == 0) {
            return "NO";
        }
        if (i11 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i11 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String P(int i10) {
        if (i10 == 0) {
            return "PERIOD_TRANSITION";
        }
        if (i10 == 1) {
            return "SEEK";
        }
        if (i10 == 2) {
            return "SEEK_ADJUSTMENT";
        }
        if (i10 != 3) {
            return i10 != 4 ? "?" : "INTERNAL";
        }
        return "AD_INSERTION";
    }

    public static String S(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return Constraint.NONE;
    }

    public static String T(int i10) {
        if (i10 == 0) {
            return "OFF";
        }
        if (i10 != 1) {
            return i10 != 2 ? "?" : "ALL";
        }
        return "ONE";
    }

    public static String U(int i10) {
        if (i10 == 1) {
            return "IDLE";
        }
        if (i10 == 2) {
            return "BUFFERING";
        }
        if (i10 != 3) {
            return i10 != 4 ? "?" : "ENDED";
        }
        return "READY";
    }

    public static String W(int i10) {
        if (i10 == 0) {
            return "PREPARED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "?" : "DYNAMIC";
        }
        return "RESET";
    }

    public static String Y(boolean z10) {
        return z10 ? "[X]" : "[ ]";
    }

    @Override // l3.b
    public void K(l3.b.a aVar, k4.b0.b bVar, k4.b0.c cVar) {
    }

    public final void a0(l3.b.a aVar, String str) {
        Z(Q(aVar, str, null, null));
    }

    public final void b0(l3.b.a aVar, String str, String str2) {
        Z(Q(aVar, str, str2, null));
    }

    public final void e0(l3.b.a aVar, String str, @Nullable Throwable th2) {
        c0(Q(aVar, str, null, th2));
    }

    public final void g0(Metadata metadata, String str) {
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Z(str + metadata.c(i10));
        }
    }

    @Override // l3.b
    public void h(l3.b.a aVar, k4.b0.b bVar, k4.b0.c cVar) {
    }

    @Override // l3.b
    public void o(l3.b.a aVar, int i10, long j10, long j11) {
    }

    @Override // l3.b
    public void y(l3.b.a aVar, k4.b0.b bVar, k4.b0.c cVar) {
    }

    @Override // l3.b
    public void z(l3.b.a aVar, k3.l0 l0Var) {
        b0(aVar, "playbackParameters", k0.y("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(l0Var.f62209a), Float.valueOf(l0Var.f62210b), Boolean.valueOf(l0Var.f62211c)));
    }

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f53087f = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String X(@Nullable com.google.android.exoplayer2.trackselection.c cVar, TrackGroup trackGroup, int i10) {
        return Y((cVar == null || cVar.getTrackGroup() != trackGroup || cVar.indexOf(i10) == -1) ? false : true);
    }

    @Override // l3.b
    public void A(l3.b.a aVar, int i10, int i11, int i12, float f10) {
        b0(aVar, "videoSize", i10 + ", " + i11);
    }

    @Override // l3.b
    public void B(l3.b.a aVar, int i10, String str, long j10) {
        b0(aVar, "decoderInitialized", k0.a0(i10) + ", " + str);
    }

    @Override // l3.b
    public void C(l3.b.a aVar, ExoPlaybackException exoPlaybackException) {
        e0(aVar, "playerFailed", exoPlaybackException);
    }

    @Override // l3.b
    public void E(l3.b.a aVar) {
        a0(aVar, "mediaPeriodCreated");
    }

    @Override // l3.b
    public void G(l3.b.a aVar, TrackGroupArray trackGroupArray, c5.c cVar) {
        com.google.android.exoplayer2.trackselection.b bVar = this.f53088a;
        com.google.android.exoplayer2.trackselection.b.a aVarG = bVar != null ? bVar.g() : null;
        if (aVarG == null) {
            b0(aVar, "tracks", "[]");
            return;
        }
        Z("tracks [" + R(aVar));
        int iC = aVarG.c();
        int i10 = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i10 >= iC) {
                break;
            }
            TrackGroupArray trackGroupArrayE = aVarG.e(i10);
            com.google.android.exoplayer2.trackselection.c cVarA = cVar.a(i10);
            if (trackGroupArrayE.f19435b > 0) {
                Z("  Renderer:" + i10 + " [");
                int i11 = 0;
                while (i11 < trackGroupArrayE.f19435b) {
                    TrackGroup trackGroupA = trackGroupArrayE.a(i11);
                    TrackGroupArray trackGroupArray2 = trackGroupArrayE;
                    String str3 = str;
                    Z("    Group:" + i11 + ", adaptive_supported=" + O(trackGroupA.f19431b, aVarG.a(i10, i11, false)) + str2);
                    int i12 = 0;
                    while (i12 < trackGroupA.f19431b) {
                        Z("      " + X(cVarA, trackGroupA, i12) + " Track:" + i12 + ", " + Format.F(trackGroupA.a(i12)) + ", supported=" + q0.f(aVarG.f(i10, i11, i12)));
                        i12++;
                        str2 = str2;
                    }
                    Z("    ]");
                    i11++;
                    trackGroupArrayE = trackGroupArray2;
                    str = str3;
                }
                String str4 = str;
                if (cVarA != null) {
                    for (int i13 = 0; i13 < cVarA.length(); i13++) {
                        Metadata metadata = cVarA.getFormat(i13).f18968h;
                        if (metadata != null) {
                            Z("    Metadata [");
                            g0(metadata, "      ");
                            Z("    ]");
                            break;
                        }
                    }
                }
                Z(str4);
            }
            i10++;
            iC = iC;
        }
        String str5 = " [";
        TrackGroupArray trackGroupArrayG = aVarG.g();
        if (trackGroupArrayG.f19435b > 0) {
            Z("  Renderer:None [");
            int i14 = 0;
            while (i14 < trackGroupArrayG.f19435b) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("    Group:");
                sb2.append(i14);
                String str6 = str5;
                sb2.append(str6);
                Z(sb2.toString());
                TrackGroup trackGroupA2 = trackGroupArrayG.a(i14);
                for (int i15 = 0; i15 < trackGroupA2.f19431b; i15++) {
                    Z("      " + Y(false) + " Track:" + i15 + ", " + Format.F(trackGroupA2.a(i15)) + ", supported=" + q0.f(0));
                }
                Z("    ]");
                i14++;
                str5 = str6;
            }
            Z("  ]");
        }
        Z(C3426d4.j.f28588e);
    }

    @Override // l3.b
    public void H(l3.b.a aVar, Exception exc) {
        f0(aVar, "drmSessionManagerError", exc);
    }

    @Override // l3.b
    public void I(l3.b.a aVar, Metadata metadata) {
        Z("metadata [" + R(aVar));
        g0(metadata, "  ");
        Z(C3426d4.j.f28588e);
    }

    @Override // l3.b
    public void J(l3.b.a aVar, k4.b0.b bVar, k4.b0.c cVar, IOException iOException, boolean z10) {
        f0(aVar, "loadError", iOException);
    }

    @Override // l3.b
    public void M(l3.b.a aVar) {
        a0(aVar, "drmSessionReleased");
    }

    @Override // l3.b
    public void N(l3.b.a aVar) {
        a0(aVar, "seekProcessed");
    }

    public final String Q(l3.b.a aVar, String str, @Nullable String str2, @Nullable Throwable th2) {
        String str3 = str + " [" + R(aVar);
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String strE = m.e(th2);
        if (!TextUtils.isEmpty(strE)) {
            str3 = str3 + "\n  " + strE.replace("\n", "\n  ") + '\n';
        }
        return str3 + C3426d4.j.f28588e;
    }

    public final String R(l3.b.a aVar) {
        String str = "window=" + aVar.f63412c;
        if (aVar.f63413d != null) {
            str = str + ", period=" + aVar.f63411b.b(aVar.f63413d.f62602a);
            if (aVar.f63413d.b()) {
                str = (str + ", adGroup=" + aVar.f63413d.f62603b) + ", ad=" + aVar.f63413d.f62604c;
            }
        }
        return "eventTime=" + V(aVar.f63410a - this.f53092e) + ", mediaPos=" + V(aVar.f63415f) + ", " + str;
    }

    public void Z(String str) {
        m.b(this.f53089b, str);
    }

    @Override // l3.b
    public void a(l3.b.a aVar) {
        a0(aVar, "mediaPeriodReleased");
    }

    @Override // l3.b
    public void c(l3.b.a aVar) {
        a0(aVar, "mediaPeriodReadingStarted");
    }

    public void c0(String str) {
        m.c(this.f53089b, str);
    }

    @Override // l3.b
    public void d(l3.b.a aVar, k4.b0.c cVar) {
        b0(aVar, "upstreamDiscarded", Format.F(cVar.f62384c));
    }

    @Override // l3.b
    public void f(l3.b.a aVar, boolean z10, int i10) {
        b0(aVar, "state", z10 + ", " + U(i10));
    }

    public final void f0(l3.b.a aVar, String str, Exception exc) {
        d0(aVar, "internalError", str, exc);
    }

    @Override // l3.b
    public void g(l3.b.a aVar, int i10, long j10, long j11) {
        d0(aVar, "audioTrackUnderrun", i10 + ", " + j10 + ", " + j11 + C3426d4.j.f28588e, null);
    }

    @Override // l3.b
    public void i(l3.b.a aVar, int i10) {
        int i11 = aVar.f63411b.i();
        int iP = aVar.f63411b.p();
        Z("timeline [" + R(aVar) + ", periodCount=" + i11 + ", windowCount=" + iP + ", reason=" + W(i10));
        for (int i12 = 0; i12 < Math.min(i11, 3); i12++) {
            aVar.f63411b.f(i12, this.f53091d);
            Z("  period [" + V(this.f53091d.h()) + C3426d4.j.f28588e);
        }
        if (i11 > 3) {
            Z("  ...");
        }
        for (int i13 = 0; i13 < Math.min(iP, 3); i13++) {
            aVar.f63411b.n(i13, this.f53090c);
            Z("  window [" + V(this.f53090c.c()) + ", " + this.f53090c.f62338f + ", " + this.f53090c.f62339g + C3426d4.j.f28588e);
        }
        if (iP > 3) {
            Z("  ...");
        }
        Z(C3426d4.j.f28588e);
    }

    @Override // l3.b
    public void l(l3.b.a aVar, int i10, Format format) {
        b0(aVar, "decoderInputFormat", k0.a0(i10) + ", " + Format.F(format));
    }

    @Override // l3.b
    public void q(l3.b.a aVar) {
        a0(aVar, "drmKeysRestored");
    }

    @Override // l3.b
    public void s(l3.b.a aVar) {
        a0(aVar, "drmKeysLoaded");
    }

    @Override // l3.b
    public void t(l3.b.a aVar, k4.b0.c cVar) {
        b0(aVar, "downstreamFormat", Format.F(cVar.f62384c));
    }

    @Override // l3.b
    public void v(l3.b.a aVar) {
        a0(aVar, "seekStarted");
    }

    @Override // l3.b
    public void w(l3.b.a aVar, int i10, int i11) {
        b0(aVar, "surfaceSize", i10 + ", " + i11);
    }

    @Override // l3.b
    public void x(l3.b.a aVar) {
        a0(aVar, "drmSessionAcquired");
    }

    public i(@Nullable com.google.android.exoplayer2.trackselection.b bVar, String str) {
        this.f53088a = bVar;
        this.f53089b = str;
    }

    @Override // l3.b
    public void D(l3.b.a aVar, int i10, o3.d dVar) {
        b0(aVar, "decoderEnabled", k0.a0(i10));
    }

    @Override // l3.b
    public void F(l3.b.a aVar, int i10, long j10) {
        b0(aVar, "droppedFrames", Integer.toString(i10));
    }

    @Override // l3.b
    public void L(l3.b.a aVar, int i10) {
        b0(aVar, "repeatMode", T(i10));
    }

    @Override // l3.b
    public void b(l3.b.a aVar, float f10) {
        b0(aVar, "volume", Float.toString(f10));
    }

    public final void d0(l3.b.a aVar, String str, String str2, @Nullable Throwable th2) {
        c0(Q(aVar, str, str2, th2));
    }

    @Override // l3.b
    public void e(l3.b.a aVar, int i10, o3.d dVar) {
        b0(aVar, "decoderDisabled", k0.a0(i10));
    }

    @Override // l3.b
    public void j(l3.b.a aVar, @Nullable Surface surface) {
        b0(aVar, "renderedFirstFrame", String.valueOf(surface));
    }

    @Override // l3.b
    public void k(l3.b.a aVar, int i10) {
        b0(aVar, "audioSessionId", Integer.toString(i10));
    }

    @Override // l3.b
    public void m(l3.b.a aVar, boolean z10) {
        b0(aVar, "loading", Boolean.toString(z10));
    }

    @Override // l3.b
    public void n(l3.b.a aVar, boolean z10) {
        b0(aVar, "shuffleModeEnabled", Boolean.toString(z10));
    }

    @Override // l3.b
    public void p(l3.b.a aVar, int i10) {
        b0(aVar, "playbackSuppressionReason", S(i10));
    }

    @Override // l3.b
    public void r(l3.b.a aVar, boolean z10) {
        b0(aVar, "isPlaying", Boolean.toString(z10));
    }

    @Override // l3.b
    public void u(l3.b.a aVar, int i10) {
        b0(aVar, "positionDiscontinuity", P(i10));
    }

    public static String V(long j10) {
        if (j10 == -9223372036854775807L) {
            return "?";
        }
        return f53087f.format(j10 / 1000.0f);
    }
}
