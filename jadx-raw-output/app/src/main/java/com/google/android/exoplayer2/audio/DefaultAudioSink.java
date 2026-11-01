package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import g5.k0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import k3.l0;
import m3.m;
import m3.n;
import q3.q;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultAudioSink implements AudioSink {
    public static boolean S;
    public static boolean T;
    public int A;
    public int B;
    public long C;
    public float D;
    public AudioProcessor[] E;
    public ByteBuffer[] F;

    @Nullable
    public ByteBuffer G;

    @Nullable
    public ByteBuffer H;
    public byte[] I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public m P;
    public boolean Q;
    public long R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final m3.d f18993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f18994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.d f18996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f18997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AudioProcessor[] f18998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AudioProcessor[] f18999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConditionVariable f19000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.b f19001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque<f> f19002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public AudioSink.a f19003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public AudioTrack f19004l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public d f19005m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f19006n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AudioTrack f19007o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m3.c f19008p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public l0 f19009q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l0 f19010r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f19011s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f19012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public ByteBuffer f19013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f19014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f19015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f19016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f19017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f19018z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public /* synthetic */ InvalidAudioTrackTimestampException(String str, a aVar) {
            this(str);
        }

        public InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f19019b;

        public a(AudioTrack audioTrack) {
            this.f19019b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f19019b.flush();
                this.f19019b.release();
            } finally {
                DefaultAudioSink.this.f19000h.open();
            }
        }
    }

    public class b extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f19021b;

        public b(AudioTrack audioTrack) {
            this.f19021b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f19021b.release();
        }
    }

    public interface c {
        l0 a(l0 l0Var);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long j10);

        long getSkippedOutputFrameCount();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f19023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f19025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f19026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f19030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f19031i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f19032j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AudioProcessor[] f19033k;

        public AudioTrack a(boolean z10, m3.c cVar, int i10) throws AudioSink.InitializationException {
            AudioTrack audioTrack;
            if (k0.f53108a >= 21) {
                audioTrack = c(z10, cVar, i10);
            } else {
                int iU = k0.U(cVar.f63967c);
                audioTrack = i10 == 0 ? new AudioTrack(iU, this.f19027e, this.f19028f, this.f19029g, this.f19030h, 1) : new AudioTrack(iU, this.f19027e, this.f19028f, this.f19029g, this.f19030h, 1, i10);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, this.f19027e, this.f19028f, this.f19030h);
        }

        public boolean b(d dVar) {
            return dVar.f19029g == this.f19029g && dVar.f19027e == this.f19027e && dVar.f19028f == this.f19028f;
        }

        @TargetApi(21)
        public final AudioTrack c(boolean z10, m3.c cVar, int i10) {
            AudioAttributes audioAttributesBuild = z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : cVar.a();
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.f19028f).setEncoding(this.f19029g).setSampleRate(this.f19027e).build();
            int i11 = this.f19030h;
            if (i10 == 0) {
                i10 = 0;
            }
            return new AudioTrack(audioAttributesBuild, audioFormatBuild, i11, 1, i10);
        }

        public long d(long j10) {
            return (j10 * ((long) this.f19027e)) / 1000000;
        }

        public final int f() {
            if (this.f19023a) {
                int minBufferSize = AudioTrack.getMinBufferSize(this.f19027e, this.f19028f, this.f19029g);
                g5.a.f(minBufferSize != -2);
                return k0.q(minBufferSize * 4, ((int) d(250000L)) * this.f19026d, (int) Math.max(minBufferSize, d(750000L) * ((long) this.f19026d)));
            }
            int iS = DefaultAudioSink.s(this.f19029g);
            if (this.f19029g == 5) {
                iS *= 2;
            }
            return (int) ((((long) iS) * 250000) / 1000000);
        }

        public d(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11, boolean z12, AudioProcessor[] audioProcessorArr) {
            this.f19023a = z10;
            this.f19024b = i10;
            this.f19025c = i11;
            this.f19026d = i12;
            this.f19027e = i13;
            this.f19028f = i14;
            this.f19029g = i15;
            this.f19030h = i16 == 0 ? f() : i16;
            this.f19031i = z11;
            this.f19032j = z12;
            this.f19033k = audioProcessorArr;
        }

        public long e(long j10) {
            return (j10 * 1000000) / ((long) this.f19027e);
        }

        public long g(long j10) {
            return (j10 * 1000000) / ((long) this.f19025c);
        }
    }

    public static class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioProcessor[] f19034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f19035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i f19036c;

        public e(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new h(), new i());
        }

        public e(AudioProcessor[] audioProcessorArr, h hVar, i iVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f19034a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f19035b = hVar;
            this.f19036c = iVar;
            audioProcessorArr2[audioProcessorArr.length] = hVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = iVar;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.c
        public l0 a(l0 l0Var) {
            this.f19035b.q(l0Var.f62211c);
            return new l0(this.f19036c.d(l0Var.f62209a), this.f19036c.c(l0Var.f62210b), l0Var.f62211c);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.c
        public AudioProcessor[] getAudioProcessors() {
            return this.f19034a;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.c
        public long getMediaDuration(long j10) {
            return this.f19036c.b(j10);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.c
        public long getSkippedOutputFrameCount() {
            return this.f19035b.k();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f19037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19039c;

        public /* synthetic */ f(l0 l0Var, long j10, long j11, a aVar) {
            this(l0Var, j10, j11);
        }

        public f(l0 l0Var, long j10, long j11) {
            this.f19037a = l0Var;
            this.f19038b = j10;
            this.f19039c = j11;
        }
    }

    public final class g implements com.google.android.exoplayer2.audio.b.a {
        public g() {
        }

        public /* synthetic */ g(DefaultAudioSink defaultAudioSink, a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void onInvalidLatency(long j10) {
            g5.m.h("AudioTrack", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void onPositionFramesMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.t() + ", " + DefaultAudioSink.this.u();
            if (DefaultAudioSink.T) {
                throw new InvalidAudioTrackTimestampException(str, null);
            }
            g5.m.h("AudioTrack", str);
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.t() + ", " + DefaultAudioSink.this.u();
            if (DefaultAudioSink.T) {
                throw new InvalidAudioTrackTimestampException(str, null);
            }
            g5.m.h("AudioTrack", str);
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public void onUnderrun(int i10, long j10) {
            if (DefaultAudioSink.this.f19003k != null) {
                DefaultAudioSink.this.f19003k.onUnderrun(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.R);
            }
        }
    }

    public DefaultAudioSink(@Nullable m3.d dVar, AudioProcessor[] audioProcessorArr) {
        this(dVar, audioProcessorArr, false);
    }

    @TargetApi(21)
    public static int G(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    public static int s(int i10) {
        if (i10 == 5) {
            return 80000;
        }
        if (i10 == 6) {
            return 768000;
        }
        if (i10 == 7) {
            return 192000;
        }
        if (i10 == 8) {
            return 2250000;
        }
        if (i10 == 14) {
            return 3062500;
        }
        if (i10 == 17) {
            return 336000;
        }
        if (i10 == 18) {
            return 768000;
        }
        throw new IllegalArgumentException();
    }

    public final long n(long j10) {
        long j11;
        long jO;
        f fVarRemove = null;
        while (!this.f19002j.isEmpty() && j10 >= this.f19002j.getFirst().f19039c) {
            fVarRemove = this.f19002j.remove();
        }
        if (fVarRemove != null) {
            this.f19010r = fVarRemove.f19037a;
            this.f19012t = fVarRemove.f19039c;
            this.f19011s = fVarRemove.f19038b - this.C;
        }
        if (this.f19010r.f62209a == 1.0f) {
            return (j10 + this.f19011s) - this.f19012t;
        }
        if (this.f19002j.isEmpty()) {
            j11 = this.f19011s;
            jO = this.f18994b.getMediaDuration(j10 - this.f19012t);
        } else {
            j11 = this.f19011s;
            jO = k0.O(j10 - this.f19012t, this.f19010r.f62209a);
        }
        return j11 + jO;
    }

    public final void p() {
        int i10 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.E;
            if (i10 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i10];
            audioProcessor.flush();
            this.F[i10] = audioProcessor.getOutput();
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.N = false;
        if (x() && this.f19001i.p()) {
            this.f19007o.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.N = true;
        if (x()) {
            this.f19001i.t();
            this.f19007o.play();
        }
    }

    public DefaultAudioSink(@Nullable m3.d dVar, AudioProcessor[] audioProcessorArr, boolean z10) {
        this(dVar, new e(audioProcessorArr), z10);
    }

    public static int q(int i10, boolean z10) {
        int i11 = k0.f53108a;
        if (i11 <= 28 && !z10) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(k0.f53109b) && !z10 && i10 == 1) {
            i10 = 2;
        }
        return k0.B(i10);
    }

    public static int r(int i10, ByteBuffer byteBuffer) {
        if (i10 == 14) {
            int iA = m3.a.a(byteBuffer);
            if (iA == -1) {
                return 0;
            }
            return m3.a.h(byteBuffer, iA) * 16;
        }
        if (i10 == 17) {
            return m3.b.c(byteBuffer);
        }
        if (i10 != 18) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    return n.e(byteBuffer);
                case 9:
                    return q.a(byteBuffer.get(byteBuffer.position()));
                default:
                    throw new IllegalStateException("Unexpected audio encoding: " + i10);
            }
        }
        return m3.a.d(byteBuffer);
    }

    public static AudioTrack w(int i10) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
    }

    public final void A() {
        AudioTrack audioTrack = this.f19004l;
        if (audioTrack == null) {
            return;
        }
        this.f19004l = null;
        new b(audioTrack).start();
    }

    public final void E() {
        AudioProcessor[] audioProcessorArr = this.f19006n.f19033k;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.E = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.F = new ByteBuffer[size];
        p();
    }

    @TargetApi(21)
    public final int H(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (k0.f53108a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f19013u == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f19013u = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f19013u.putInt(1431633921);
        }
        if (this.f19014v == 0) {
            this.f19013u.putInt(4, i10);
            this.f19013u.putLong(8, j10 * 1000);
            this.f19013u.position(0);
            this.f19014v = i10;
        }
        int iRemaining = this.f19013u.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f19013u, iRemaining, 1);
            if (iWrite < 0) {
                this.f19014v = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iG = G(audioTrack, byteBuffer, i10);
        if (iG < 0) {
            this.f19014v = 0;
            return iG;
        }
        this.f19014v -= iG;
        return iG;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void b(l0 l0Var) {
        d dVar = this.f19006n;
        if (dVar != null && !dVar.f19032j) {
            this.f19010r = l0.f62208e;
        } else {
            if (l0Var.equals(getPlaybackParameters())) {
                return;
            }
            if (x()) {
                this.f19009q = l0Var;
            } else {
                this.f19010r = l0Var;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void c(m3.c cVar) {
        if (this.f19008p.equals(cVar)) {
            return;
        }
        this.f19008p = cVar;
        if (this.Q) {
            return;
        }
        flush();
        this.O = 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, int i15) throws AudioSink.ConfigurationException {
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        boolean z10 = false;
        if (k0.f53108a < 21 && i11 == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i19 = 0; i19 < 6; i19++) {
                iArr2[i19] = i19;
            }
        } else {
            iArr2 = iArr;
        }
        boolean zF0 = k0.f0(i10);
        boolean z11 = this.f18995c && d(i11, 4) && k0.e0(i10);
        AudioProcessor[] audioProcessorArr = z11 ? this.f18999g : this.f18998f;
        if (zF0) {
            this.f18997e.j(i14, i15);
            this.f18996d.h(iArr2);
            AudioProcessor.a aVar = new AudioProcessor.a(i12, i11, i10);
            for (AudioProcessor audioProcessor : audioProcessorArr) {
                try {
                    AudioProcessor.a aVarA = audioProcessor.a(aVar);
                    if (audioProcessor.isActive()) {
                        aVar = aVarA;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                    throw new AudioSink.ConfigurationException(e10);
                }
            }
            int i20 = aVar.f18989a;
            i16 = aVar.f18990b;
            i17 = aVar.f18991c;
            i18 = i20;
        } else {
            i16 = i11;
            i17 = i10;
            i18 = i12;
        }
        int iQ = q(i16, zF0);
        if (iQ == 0) {
            throw new AudioSink.ConfigurationException("Unsupported channel count: " + i16);
        }
        int iS = zF0 ? k0.S(i10, i11) : -1;
        int iS2 = zF0 ? k0.S(i17, i16) : -1;
        if (zF0 && !z11) {
            z10 = true;
        }
        d dVar = new d(zF0, iS, i12, iS2, i18, iQ, i17, i13, zF0, z10, audioProcessorArr);
        if (x()) {
            this.f19005m = dVar;
        } else {
            this.f19006n = dVar;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.Q) {
            this.Q = false;
            this.O = 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void e(m mVar) {
        if (this.P.equals(mVar)) {
            return;
        }
        int i10 = mVar.f64005a;
        float f10 = mVar.f64006b;
        AudioTrack audioTrack = this.f19007o;
        if (audioTrack != null) {
            if (this.P.f64005a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f19007o.setAuxEffectSendLevel(f10);
            }
        }
        this.P = mVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21(int i10) {
        g5.a.f(k0.f53108a >= 21);
        if (this.Q && this.O == i10) {
            return;
        }
        this.Q = true;
        this.O = i10;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void f(AudioSink.a aVar) {
        this.f19003k = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public l0 getPlaybackParameters() {
        l0 l0Var = this.f19009q;
        if (l0Var != null) {
            return l0Var;
        }
        return !this.f19002j.isEmpty() ? this.f19002j.getLast().f19037a : this.f19010r;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j10) throws AudioSink.WriteException, AudioSink.InitializationException {
        ByteBuffer byteBuffer2 = this.G;
        g5.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f19005m != null) {
            if (!o()) {
                return false;
            }
            if (this.f19005m.b(this.f19006n)) {
                this.f19006n = this.f19005m;
                this.f19005m = null;
            } else {
                y();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            l(this.f19010r, j10);
        }
        if (!x()) {
            v(j10);
            if (this.N) {
                play();
            }
        }
        if (!this.f19001i.k(u())) {
            return false;
        }
        if (this.G == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            d dVar = this.f19006n;
            if (!dVar.f19023a && this.A == 0) {
                int iR = r(dVar.f19029g, byteBuffer);
                this.A = iR;
                if (iR == 0) {
                    return true;
                }
            }
            if (this.f19009q != null) {
                if (!o()) {
                    return false;
                }
                l0 l0Var = this.f19009q;
                this.f19009q = null;
                l(l0Var, j10);
            }
            if (this.B == 0) {
                this.C = Math.max(0L, j10);
                this.B = 1;
            } else {
                long jG = this.C + this.f19006n.g(t() - this.f18997e.h());
                if (this.B == 1 && Math.abs(jG - j10) > 200000) {
                    g5.m.c("AudioTrack", "Discontinuity detected [expected " + jG + ", got " + j10 + C3426d4.j.f28588e);
                    this.B = 2;
                }
                if (this.B == 2) {
                    long j11 = j10 - jG;
                    this.C += j11;
                    this.B = 1;
                    AudioSink.a aVar = this.f19003k;
                    if (aVar != null && j11 != 0) {
                        aVar.onPositionDiscontinuity();
                    }
                }
            }
            if (this.f19006n.f19023a) {
                this.f19015w += (long) byteBuffer.remaining();
            } else {
                this.f19016x += (long) this.A;
            }
            this.G = byteBuffer;
        }
        if (this.f19006n.f19031i) {
            z(j10);
        } else {
            F(this.G, j10);
        }
        if (!this.G.hasRemaining()) {
            this.G = null;
            return true;
        }
        if (!this.f19001i.j(u())) {
            return false;
        }
        g5.m.h("AudioTrack", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        if (this.B == 1) {
            this.B = 2;
        }
    }

    public final void l(l0 l0Var, long j10) {
        this.f19002j.add(new f(this.f19006n.f19032j ? this.f18994b.a(l0Var) : l0.f62208e, Math.max(0L, j10), this.f19006n.e(u()), null));
        E();
    }

    public final long m(long j10) {
        return j10 + this.f19006n.e(this.f18994b.getSkippedOutputFrameCount());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0034 -> B:9:0x0014). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean o() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r9 = this;
            int r0 = r9.K
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L16
            com.google.android.exoplayer2.audio.DefaultAudioSink$d r0 = r9.f19006n
            boolean r0 = r0.f19031i
            if (r0 == 0) goto Lf
            r0 = r3
            goto L12
        Lf:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r9.E
            int r0 = r0.length
        L12:
            r9.K = r0
        L14:
            r0 = r2
            goto L17
        L16:
            r0 = r3
        L17:
            int r4 = r9.K
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.E
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L3a
            r4 = r5[r4]
            if (r0 == 0) goto L2a
            r4.queueEndOfStream()
        L2a:
            r9.z(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L34
            return r3
        L34:
            int r0 = r9.K
            int r0 = r0 + r2
            r9.K = r0
            goto L14
        L3a:
            java.nio.ByteBuffer r0 = r9.H
            if (r0 == 0) goto L46
            r9.F(r0, r7)
            java.nio.ByteBuffer r0 = r9.H
            if (r0 == 0) goto L46
            return r3
        L46:
            r9.K = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.o():boolean");
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.L && x() && o()) {
            y();
            this.L = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f10) {
        if (this.D != f10) {
            this.D = f10;
            B();
        }
    }

    public final long t() {
        d dVar = this.f19006n;
        return dVar.f19023a ? this.f19015w / ((long) dVar.f19024b) : this.f19016x;
    }

    public final long u() {
        d dVar = this.f19006n;
        return dVar.f19023a ? this.f19017y / ((long) dVar.f19026d) : this.f19018z;
    }

    public final void v(long j10) throws AudioSink.InitializationException {
        this.f19000h.block();
        AudioTrack audioTrackA = ((d) g5.a.e(this.f19006n)).a(this.Q, this.f19008p, this.O);
        this.f19007o = audioTrackA;
        int audioSessionId = audioTrackA.getAudioSessionId();
        if (S && k0.f53108a < 21) {
            AudioTrack audioTrack = this.f19004l;
            if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                A();
            }
            if (this.f19004l == null) {
                this.f19004l = w(audioSessionId);
            }
        }
        if (this.O != audioSessionId) {
            this.O = audioSessionId;
            AudioSink.a aVar = this.f19003k;
            if (aVar != null) {
                aVar.onAudioSessionId(audioSessionId);
            }
        }
        l(this.f19010r, j10);
        com.google.android.exoplayer2.audio.b bVar = this.f19001i;
        AudioTrack audioTrack2 = this.f19007o;
        d dVar = this.f19006n;
        bVar.s(audioTrack2, dVar.f19029g, dVar.f19026d, dVar.f19030h);
        B();
        int i10 = this.P.f64005a;
        if (i10 != 0) {
            this.f19007o.attachAuxEffect(i10);
            this.f19007o.setAuxEffectSendLevel(this.P.f64006b);
        }
    }

    public final boolean x() {
        return this.f19007o != null;
    }

    public final void y() {
        if (this.M) {
            return;
        }
        this.M = true;
        this.f19001i.g(u());
        this.f19007o.stop();
        this.f19014v = 0;
    }

    public final void z(long j10) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.E.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.F[i10 - 1];
            } else {
                byteBuffer = this.G;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f18987a;
                }
            }
            if (i10 == length) {
                F(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.E[i10];
                audioProcessor.queueInput(byteBuffer);
                ByteBuffer output = audioProcessor.getOutput();
                this.F[i10] = output;
                if (output.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    public DefaultAudioSink(@Nullable m3.d dVar, c cVar, boolean z10) {
        this.f18993a = dVar;
        this.f18994b = (c) g5.a.e(cVar);
        this.f18995c = z10;
        this.f19000h = new ConditionVariable(true);
        this.f19001i = new com.google.android.exoplayer2.audio.b(new g(this, null));
        com.google.android.exoplayer2.audio.d dVar2 = new com.google.android.exoplayer2.audio.d();
        this.f18996d = dVar2;
        j jVar = new j();
        this.f18997e = jVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.g(), dVar2, jVar);
        Collections.addAll(arrayList, cVar.getAudioProcessors());
        this.f18998f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f18999g = new AudioProcessor[]{new com.google.android.exoplayer2.audio.e()};
        this.D = 1.0f;
        this.B = 0;
        this.f19008p = m3.c.f63964f;
        this.O = 0;
        this.P = new m(0, 0.0f);
        this.f19010r = l0.f62208e;
        this.K = -1;
        this.E = new AudioProcessor[0];
        this.F = new ByteBuffer[0];
        this.f19002j = new ArrayDeque<>();
    }

    @TargetApi(21)
    public static void C(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    public static void D(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    public final void B() {
        if (x()) {
            if (k0.f53108a >= 21) {
                C(this.f19007o, this.D);
            } else {
                D(this.f19007o, this.D);
            }
        }
    }

    public final void F(ByteBuffer byteBuffer, long j10) throws AudioSink.WriteException {
        boolean z10;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.H;
        boolean z11 = true;
        int iG = 0;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z10 = true;
            } else {
                z10 = false;
            }
            g5.a.a(z10);
        } else {
            this.H = byteBuffer;
            if (k0.f53108a < 21) {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = this.I;
                if (bArr == null || bArr.length < iRemaining) {
                    this.I = new byte[iRemaining];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.get(this.I, 0, iRemaining);
                byteBuffer.position(iPosition);
                this.J = 0;
            }
        }
        int iRemaining2 = byteBuffer.remaining();
        if (k0.f53108a < 21) {
            int iC = this.f19001i.c(this.f19017y);
            if (iC > 0) {
                iG = this.f19007o.write(this.I, this.J, Math.min(iRemaining2, iC));
                if (iG > 0) {
                    this.J += iG;
                    byteBuffer.position(byteBuffer.position() + iG);
                }
            }
        } else if (this.Q) {
            if (j10 == -9223372036854775807L) {
                z11 = false;
            }
            g5.a.f(z11);
            iG = H(this.f19007o, byteBuffer, iRemaining2, j10);
        } else {
            iG = G(this.f19007o, byteBuffer, iRemaining2);
        }
        this.R = SystemClock.elapsedRealtime();
        if (iG >= 0) {
            boolean z12 = this.f19006n.f19023a;
            if (z12) {
                this.f19017y += (long) iG;
            }
            if (iG == iRemaining2) {
                if (!z12) {
                    this.f19018z += (long) this.A;
                }
                this.H = null;
                return;
            }
            return;
        }
        throw new AudioSink.WriteException(iG);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean d(int i10, int i11) {
        if (k0.f0(i11)) {
            if (i11 != 4 || k0.f53108a >= 21) {
                return true;
            }
            return false;
        }
        m3.d dVar = this.f18993a;
        if (dVar != null && dVar.e(i11) && (i10 == -1 || i10 <= this.f18993a.d())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (x()) {
            this.f19015w = 0L;
            this.f19016x = 0L;
            this.f19017y = 0L;
            this.f19018z = 0L;
            this.A = 0;
            l0 l0Var = this.f19009q;
            if (l0Var != null) {
                this.f19010r = l0Var;
                this.f19009q = null;
            } else if (!this.f19002j.isEmpty()) {
                this.f19010r = this.f19002j.getLast().f19037a;
            }
            this.f19002j.clear();
            this.f19011s = 0L;
            this.f19012t = 0L;
            this.f18997e.i();
            p();
            this.G = null;
            this.H = null;
            this.M = false;
            this.L = false;
            this.K = -1;
            this.f19013u = null;
            this.f19014v = 0;
            this.B = 0;
            if (this.f19001i.i()) {
                this.f19007o.pause();
            }
            AudioTrack audioTrack = this.f19007o;
            this.f19007o = null;
            d dVar = this.f19005m;
            if (dVar != null) {
                this.f19006n = dVar;
                this.f19005m = null;
            }
            this.f19001i.q();
            this.f19000h.close();
            new a(audioTrack).start();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z10) {
        if (x() && this.B != 0) {
            return this.C + m(n(Math.min(this.f19001i.d(z10), this.f19006n.e(u()))));
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        if (x() && this.f19001i.h(u())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        if (x() && (!this.L || hasPendingData())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        A();
        for (AudioProcessor audioProcessor : this.f18998f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f18999g) {
            audioProcessor2.reset();
        }
        this.O = 0;
        this.N = false;
    }
}
