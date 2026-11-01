package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zb0 implements jl {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public bl[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public ql X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk f85271a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f85272a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb0 f85273b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f85274b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final st f85276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y83 f85277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bl[] f85278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bl[] f85279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vy f85280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ol f85281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque f85282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f85283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f85284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public yb0 f85285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vb0 f85286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vb0 f85287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bc0 f85288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ye2 f85289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gl f85290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public rb0 f85291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public rb0 f85292t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AudioTrack f85293u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public pk f85294v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ub0 f85295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ub0 f85296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ee2 f85297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer f85298z;

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    public final void a(long j10) {
        ee2 ee2Var;
        boolean z10;
        if (this.Y || !"audio/raw".equals(this.f85292t.f82165a.f80429m)) {
            ee2Var = ee2.f77039e;
        } else {
            int i10 = this.f85292t.f82165a.B;
            if (this.f85275c) {
                int i11 = ib3.f78556a;
                if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
                    ee2Var = ee2.f77039e;
                }
            }
            sb0 sb0Var = this.f85273b;
            ee2Var = c().f83407a;
            d23 d23Var = sb0Var.f82577c;
            float f10 = ee2Var.f77040b;
            if (d23Var.f76525c != f10) {
                d23Var.f76525c = f10;
                d23Var.f76531i = true;
            }
            float f11 = ee2Var.f77041c;
            if (d23Var.f76526d != f11) {
                d23Var.f76526d = f11;
                d23Var.f76531i = true;
            }
        }
        ee2 ee2Var2 = ee2Var;
        int i12 = 0;
        if (this.Y || !"audio/raw".equals(this.f85292t.f82165a.f80429m)) {
            z10 = false;
        } else {
            int i13 = this.f85292t.f82165a.B;
            if (this.f85275c) {
                int i14 = ib3.f78556a;
                if (i13 == 536870912 || i13 == 805306368 || i13 == 4) {
                    z10 = false;
                }
            }
            sb0 sb0Var2 = this.f85273b;
            z10 = c().f83408b;
            sb0Var2.f82576b.f83246m = z10;
        }
        this.f85282j.add(new ub0(ee2Var2, z10, Math.max(0L, j10), (d() * 1000000) / ((long) this.f85292t.f82169e)));
        bl[] blVarArr = this.f85292t.f82173i;
        ArrayList arrayList = new ArrayList();
        for (bl blVar : blVarArr) {
            if (blVar.isActive()) {
                arrayList.add(blVar);
            } else {
                blVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (bl[]) arrayList.toArray(new bl[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            bl[] blVarArr2 = this.K;
            if (i12 >= blVarArr2.length) {
                break;
            }
            bl blVar2 = blVarArr2[i12];
            blVar2.flush();
            this.L[i12] = blVar2.a();
            i12++;
        }
        gl glVar = this.f85290r;
        if (glVar != null) {
            ((ek1) glVar).f77103a.H0.b(z10);
        }
    }

    public final void b() {
        if (f()) {
            j();
            AudioTrack audioTrack = this.f85281i.f81072c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f85293u.pause();
            }
            if (a(this.f85293u)) {
                yb0 yb0Var = this.f85285m;
                yb0Var.getClass();
                yb0Var.b(this.f85293u);
            }
            AudioTrack audioTrack2 = this.f85293u;
            this.f85293u = null;
            if (ib3.f78556a < 21 && !this.V) {
                this.W = 0;
            }
            rb0 rb0Var = this.f85291s;
            if (rb0Var != null) {
                this.f85292t = rb0Var;
                this.f85291s = null;
            }
            ol olVar = this.f85281i;
            olVar.f81081l = 0L;
            olVar.f81092w = 0;
            olVar.f81091v = 0;
            olVar.f81082m = 0L;
            olVar.C = 0L;
            olVar.F = 0L;
            olVar.f81080k = false;
            olVar.f81072c = null;
            olVar.f81075f = null;
            vy vyVar = this.f85280h;
            synchronized (vyVar) {
                vyVar.f84041a = false;
            }
            new nb0(this, audioTrack2).start();
        }
        this.f85287o.f83872a = null;
        this.f85286n.f83872a = null;
    }

    public final void g() {
        this.U = false;
        if (f()) {
            ol olVar = this.f85281i;
            olVar.f81081l = 0L;
            olVar.f81092w = 0;
            olVar.f81091v = 0;
            olVar.f81082m = 0L;
            olVar.C = 0L;
            olVar.F = 0L;
            olVar.f81080k = false;
            if (olVar.f81093x == -9223372036854775807L) {
                ml mlVar = olVar.f81075f;
                mlVar.getClass();
                mlVar.a();
                this.f85293u.pause();
            }
        }
    }

    public final void h() {
        this.U = true;
        if (f()) {
            ml mlVar = this.f85281i.f81075f;
            mlVar.getClass();
            mlVar.a();
            this.f85293u.play();
        }
    }

    public final ub0 c() {
        ub0 ub0Var = this.f85295w;
        if (ub0Var != null) {
            return ub0Var;
        }
        return !this.f85282j.isEmpty() ? (ub0) this.f85282j.getLast() : this.f85296x;
    }

    public final long d() {
        rb0 rb0Var = this.f85292t;
        return rb0Var.f82167c == 0 ? this.D / ((long) rb0Var.f82168d) : this.E;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    public final boolean e() throws fl {
        boolean z10;
        AudioTrack audioTrackA;
        ye2 ye2Var;
        vy vyVar = this.f85280h;
        synchronized (vyVar) {
            z10 = vyVar.f84041a;
        }
        if (!z10) {
            return false;
        }
        try {
            rb0 rb0Var = this.f85292t;
            rb0Var.getClass();
            try {
                audioTrackA = rb0Var.a(this.Y, this.f85294v, this.W);
                this.f85293u = audioTrackA;
                if (a(audioTrackA)) {
                    AudioTrack audioTrack = this.f85293u;
                    if (this.f85285m == null) {
                        this.f85285m = new yb0(this);
                    }
                    this.f85285m.a(audioTrack);
                    if (this.f85284l != 3) {
                        AudioTrack audioTrack2 = this.f85293u;
                        mx0 mx0Var = this.f85292t.f82165a;
                        audioTrack2.setOffloadDelayPadding(mx0Var.C, mx0Var.D);
                    }
                }
                if (ib3.f78556a >= 31 && (ye2Var = this.f85289q) != null) {
                    ob0.a(this.f85293u, ye2Var);
                }
                this.W = this.f85293u.getAudioSessionId();
                ol olVar = this.f85281i;
                AudioTrack audioTrack3 = this.f85293u;
                rb0 rb0Var2 = this.f85292t;
                olVar.a(audioTrack3, rb0Var2.f82167c == 2, rb0Var2.f82171g, rb0Var2.f82168d, rb0Var2.f82172h);
                k();
                this.X.getClass();
                this.H = true;
                return true;
            } catch (fl e10) {
                gl glVar = this.f85290r;
                if (glVar != null) {
                    ih1.b("MediaCodecAudioRenderer", ih1.a("Audio sink error", e10));
                    ((ek1) glVar).f77103a.H0.b(e10);
                }
                throw e10;
            }
        } catch (fl e11) {
            rb0 rb0Var3 = this.f85292t;
            if (rb0Var3.f82172h > 1000000) {
                rb0 rb0Var4 = new rb0(rb0Var3.f82165a, rb0Var3.f82166b, rb0Var3.f82167c, rb0Var3.f82168d, rb0Var3.f82169e, rb0Var3.f82170f, rb0Var3.f82171g, 1000000, rb0Var3.f82173i);
                try {
                    try {
                        audioTrackA = rb0Var4.a(this.Y, this.f85294v, this.W);
                        this.f85292t = rb0Var4;
                    } catch (fl e12) {
                        e11.addSuppressed(e12);
                        if (this.f85292t.f82167c == 1) {
                            throw e11;
                        }
                        this.f85272a0 = true;
                        throw e11;
                    }
                } catch (fl e13) {
                    gl glVar2 = this.f85290r;
                    if (glVar2 != null) {
                        ih1.b("MediaCodecAudioRenderer", ih1.a("Audio sink error", e13));
                        ((ek1) glVar2).f77103a.H0.b(e13);
                    }
                    throw e13;
                }
            }
            if (this.f85292t.f82167c == 1) {
                throw e11;
            }
            this.f85272a0 = true;
            throw e11;
        }
    }

    public final boolean f() {
        return this.f85293u != null;
    }

    public final void i() {
        if (this.T) {
            return;
        }
        this.T = true;
        ol olVar = this.f85281i;
        long jD = d();
        olVar.f81095z = olVar.a();
        olVar.f81093x = SystemClock.elapsedRealtime() * 1000;
        olVar.A = jD;
        this.f85293u.stop();
        this.A = 0;
    }

    public final void j() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.f85274b0 = false;
        this.F = 0;
        this.f85296x = new ub0(c().f83407a, c().f83408b, 0L, 0L);
        this.I = 0L;
        this.f85295w = null;
        this.f85282j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f85298z = null;
        this.A = 0;
        this.f85277e.f84853o = 0L;
        while (true) {
            bl[] blVarArr = this.K;
            if (i10 >= blVarArr.length) {
                return;
            }
            bl blVar = blVarArr[i10];
            blVar.flush();
            this.L[i10] = blVar.a();
            i10++;
        }
    }

    public zb0(qb0 qb0Var) {
        boolean z10;
        boolean z11;
        int i10;
        this.f85271a = qb0Var.f81786a;
        sb0 sb0Var = qb0Var.f81787b;
        this.f85273b = sb0Var;
        int i11 = ib3.f78556a;
        if (i11 >= 21 && qb0Var.f81788c) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f85275c = z10;
        if (i11 >= 23 && qb0Var.f81789d) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f85283k = z11;
        if (i11 >= 29) {
            i10 = qb0Var.f81790e;
        } else {
            i10 = 0;
        }
        this.f85284l = i10;
        this.f85288p = qb0Var.f81791f;
        vy vyVar = new vy(0);
        this.f85280h = vyVar;
        vyVar.d();
        this.f85281i = new ol(new wb0(this));
        st stVar = new st();
        this.f85276d = stVar;
        y83 y83Var = new y83();
        this.f85277e = y83Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new rp2(), stVar, y83Var);
        Collections.addAll(arrayList, sb0Var.a());
        this.f85278f = (bl[]) arrayList.toArray(new bl[0]);
        this.f85279g = new bl[]{new ew0()};
        this.J = 1.0f;
        this.f85294v = pk.f81431h;
        this.W = 0;
        this.X = new ql();
        ee2 ee2Var = ee2.f77039e;
        this.f85296x = new ub0(ee2Var, false, 0L, 0L);
        this.f85297y = ee2Var;
        this.R = -1;
        this.K = new bl[0];
        this.L = new ByteBuffer[0];
        this.f85282j = new ArrayDeque();
        this.f85286n = new vb0();
        this.f85287o = new vb0();
    }

    public final void k() {
        if (f()) {
            if (ib3.f78556a >= 21) {
                this.f85293u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.f85293u;
            float f10 = this.J;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final void b(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = bl.f75859a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j10);
            } else {
                bl blVar = this.K[i10];
                if (i10 > this.R) {
                    blVar.a(byteBuffer);
                }
                ByteBuffer byteBufferA = blVar.a();
                this.L[i10] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
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

    public final void a(mx0 mx0Var, int[] iArr) throws el {
        bl[] blVarArr;
        int iIntValue;
        int i10;
        int iB;
        int i11;
        int iB2;
        int iMax;
        int i12;
        bl[] blVarArr2;
        int i13;
        int i14;
        bl[] blVarArr3;
        int[] iArr2;
        int i15 = -1;
        if ("audio/raw".equals(mx0Var.f80429m)) {
            if (ib3.e(mx0Var.B)) {
                int iB3 = ib3.b(mx0Var.B, mx0Var.f80442z);
                int i16 = mx0Var.B;
                if (this.f85275c && (i16 == 536870912 || i16 == 805306368 || i16 == 4)) {
                    blVarArr3 = this.f85279g;
                } else {
                    blVarArr3 = this.f85278f;
                }
                y83 y83Var = this.f85277e;
                int i17 = mx0Var.C;
                int i18 = mx0Var.D;
                y83Var.f84847i = i17;
                y83Var.f84848j = i18;
                if (ib3.f78556a < 21 && mx0Var.f80442z == 8 && iArr == null) {
                    iArr2 = new int[6];
                    for (int i19 = 0; i19 < 6; i19++) {
                        iArr2[i19] = i19;
                    }
                } else {
                    iArr2 = iArr;
                }
                this.f85276d.f82742i = iArr2;
                zk zkVar = new zk(mx0Var.A, mx0Var.f80442z, mx0Var.B);
                for (bl blVar : blVarArr3) {
                    try {
                        zk zkVarA = blVar.a(zkVar);
                        if (blVar.isActive()) {
                            zkVar = zkVarA;
                        }
                    } catch (al e10) {
                        throw new el(e10, mx0Var);
                    }
                }
                int i20 = zkVar.f85462c;
                i11 = zkVar.f85460a;
                int iA = ib3.a(zkVar.f85461b);
                iB2 = ib3.b(i20, zkVar.f85461b);
                blVarArr = blVarArr3;
                i15 = iB3;
                i10 = 0;
                iB = i20;
                iIntValue = iA;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            blVarArr = new bl[0];
            int i21 = mx0Var.A;
            if (a(mx0Var, this.f85294v)) {
                String str = mx0Var.f80429m;
                str.getClass();
                i10 = 1;
                iB = ht1.b(str, mx0Var.f80426j);
                iIntValue = ib3.a(mx0Var.f80442z);
            } else {
                Pair pairA = this.f85271a.a(mx0Var);
                if (pairA != null) {
                    int iIntValue2 = ((Integer) pairA.first).intValue();
                    iIntValue = ((Integer) pairA.second).intValue();
                    i10 = 2;
                    iB = iIntValue2;
                } else {
                    throw new el("Unable to configure passthrough for: " + mx0Var, mx0Var);
                }
            }
            i11 = i21;
            iB2 = -1;
        }
        bc0 bc0Var = this.f85288p;
        int minBufferSize = AudioTrack.getMinBufferSize(i11, iIntValue, iB);
        if (minBufferSize != -2) {
            double d10 = this.f85283k ? 8.0d : 1.0d;
            bc0Var.getClass();
            if (i10 == 0) {
                long j10 = i11;
                long j11 = iB2;
                int iA2 = td1.a(((((long) 250000) * j10) * j11) / 1000000);
                int iA3 = td1.a(((((long) 750000) * j10) * j11) / 1000000);
                int i22 = ib3.f78556a;
                iMax = Math.max(iA2, Math.min(minBufferSize * 4, iA3));
            } else if (i10 == 1) {
                switch (iB) {
                    case 5:
                        i13 = 80000;
                        break;
                    case 6:
                    case 18:
                        i13 = 768000;
                        break;
                    case 7:
                        i13 = 192000;
                        break;
                    case 8:
                        i13 = 2250000;
                        break;
                    case 9:
                        i13 = 40000;
                        break;
                    case 10:
                        i13 = 100000;
                        break;
                    case 11:
                        i13 = 16000;
                        break;
                    case 12:
                        i13 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i13 = 3062500;
                        break;
                    case 15:
                        i13 = 8000;
                        break;
                    case 16:
                        i13 = 256000;
                        break;
                    case 17:
                        i13 = 336000;
                        break;
                }
                iMax = td1.a((((long) 50000000) * ((long) i13)) / 1000000);
            } else if (i10 == 2) {
                int i23 = iB == 5 ? 500000 : 250000;
                switch (iB) {
                    case 5:
                        i14 = 80000;
                        break;
                    case 6:
                    case 18:
                        i14 = 768000;
                        break;
                    case 7:
                        i14 = 192000;
                        break;
                    case 8:
                        i14 = 2250000;
                        break;
                    case 9:
                        i14 = 40000;
                        break;
                    case 10:
                        i14 = 100000;
                        break;
                    case 11:
                        i14 = 16000;
                        break;
                    case 12:
                        i14 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i14 = 3062500;
                        break;
                    case 15:
                        i14 = 8000;
                        break;
                    case 16:
                        i14 = 256000;
                        break;
                    case 17:
                        i14 = 336000;
                        break;
                }
                iMax = td1.a((((long) i23) * ((long) i14)) / 1000000);
            } else {
                throw new IllegalArgumentException();
            }
            int iMax2 = (((Math.max(minBufferSize, (int) (((double) iMax) * d10)) + iB2) - 1) / iB2) * iB2;
            if (iB == 0) {
                throw new el("Invalid output encoding (mode=" + i10 + ") for: " + mx0Var, mx0Var);
            }
            if (iIntValue != 0) {
                this.f85272a0 = false;
                rb0 rb0Var = new rb0(mx0Var, i12, i10, iB2, i11, iIntValue, iB, iMax2, blVarArr2);
                if (f()) {
                    i12 = i15;
                    blVarArr2 = blVarArr;
                    this.f85291s = rb0Var;
                    return;
                } else {
                    i12 = i15;
                    blVarArr2 = blVarArr;
                    this.f85292t = rb0Var;
                    return;
                }
            }
            throw new el("Invalid output channel config (mode=" + i10 + ") for: " + mx0Var, mx0Var);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean a() {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.R = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.R
            yads.bl[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.b()
        L1f:
            r9.b(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.R
            int r0 = r0 + r2
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a():boolean");
    }

    public final long a(boolean z10) {
        long j10;
        long jA;
        if (!f() || this.H) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f85281i.a(z10), (d() * 1000000) / ((long) this.f85292t.f82169e));
        while (!this.f85282j.isEmpty() && jMin >= ((ub0) this.f85282j.getFirst()).f83410d) {
            this.f85296x = (ub0) this.f85282j.remove();
        }
        ub0 ub0Var = this.f85296x;
        long j11 = jMin - ub0Var.f83410d;
        if (ub0Var.f83407a.equals(ee2.f77039e)) {
            j10 = this.f85296x.f83409c + j11;
        } else if (this.f85282j.isEmpty()) {
            d23 d23Var = this.f85273b.f82577c;
            if (d23Var.f76537o >= 1024) {
                long j12 = d23Var.f76536n;
                c23 c23Var = d23Var.f76532j;
                c23Var.getClass();
                long j13 = j12 - ((long) ((c23Var.f76113k * c23Var.f76104b) * 2));
                int i10 = d23Var.f76530h.f85460a;
                int i11 = d23Var.f76529g.f85460a;
                if (i10 == i11) {
                    jA = ib3.a(j11, j13, d23Var.f76537o);
                } else {
                    jA = ib3.a(j11, j13 * ((long) i10), d23Var.f76537o * ((long) i11));
                }
            } else {
                jA = (long) (((double) d23Var.f76525c) * j11);
            }
            j10 = jA + this.f85296x.f83409c;
        } else {
            ub0 ub0Var2 = (ub0) this.f85282j.getFirst();
            long jRound = ub0Var2.f83410d - jMin;
            float f10 = this.f85296x.f83407a.f77040b;
            int i12 = ib3.f78556a;
            if (f10 != 1.0f) {
                jRound = Math.round(jRound * ((double) f10));
            }
            j10 = ub0Var2.f83409c - jRound;
        }
        return ((this.f85273b.f82576b.f83253t * 1000000) / ((long) this.f85292t.f82169e)) + j10;
    }

    public final int a(mx0 mx0Var) {
        if (!"audio/raw".equals(mx0Var.f80429m)) {
            return ((this.f85272a0 || !a(mx0Var, this.f85294v)) && this.f85271a.a(mx0Var) == null) ? 0 : 2;
        }
        if (!ib3.e(mx0Var.B)) {
            ih1.d("DefaultAudioSink", "Invalid PCM encoding: " + mx0Var.B);
            return 0;
        }
        int i10 = mx0Var.B;
        return (i10 == 2 || (this.f85275c && i10 == 4)) ? 2 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x011d, code lost:
    
        if (r5.a() == 0) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.nio.ByteBuffer r23, long r24, int r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a(java.nio.ByteBuffer, long, int):boolean");
    }

    public final void a(ee2 ee2Var) {
        if (f()) {
            try {
                this.f85293u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(ee2Var.f77040b).setPitch(ee2Var.f77041c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                ih1.d("DefaultAudioSink", ih1.a("Failed to set playback params", e10));
            }
            ee2Var = new ee2(this.f85293u.getPlaybackParams().getSpeed(), this.f85293u.getPlaybackParams().getPitch());
            ol olVar = this.f85281i;
            olVar.f81079j = ee2Var.f77040b;
            ml mlVar = olVar.f81075f;
            if (mlVar != null) {
                mlVar.a();
            }
        }
        this.f85297y = ee2Var;
    }

    public final void a(ql qlVar) {
        if (this.X.equals(qlVar)) {
            return;
        }
        qlVar.getClass();
        if (this.f85293u != null) {
            this.X.getClass();
        }
        this.X = qlVar;
    }

    public final void a(ek1 ek1Var) {
        this.f85290r = ek1Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    public final void a(ByteBuffer byteBuffer, long j10) throws Exception {
        int iWrite;
        gl glVar;
        ln2 ln2Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 == null) {
                this.O = byteBuffer;
                if (ib3.f78556a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.Q = 0;
                }
            } else if (byteBuffer2 != byteBuffer) {
                throw new IllegalArgumentException();
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = ib3.f78556a;
            if (i10 < 21) {
                ol olVar = this.f85281i;
                int iA = olVar.f81074e - ((int) (this.D - (olVar.a() * ((long) olVar.f81073d))));
                if (iA > 0) {
                    iWrite = this.f85293u.write(this.P, this.Q, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else if (!this.Y) {
                iWrite = this.f85293u.write(byteBuffer, iRemaining2, 1);
            } else if (j10 != -9223372036854775807L) {
                AudioTrack audioTrack = this.f85293u;
                if (i10 >= 26) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, j10 * 1000);
                } else {
                    if (this.f85298z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f85298z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f85298z.putInt(1431633921);
                    }
                    if (this.A == 0) {
                        this.f85298z.putInt(4, iRemaining2);
                        this.f85298z.putLong(8, j10 * 1000);
                        this.f85298z.position(0);
                        this.A = iRemaining2;
                    }
                    int iRemaining3 = this.f85298z.remaining();
                    if (iRemaining3 > 0) {
                        int iWrite2 = audioTrack.write(this.f85298z, iRemaining3, 1);
                        if (iWrite2 < 0) {
                            this.A = 0;
                            iWrite = iWrite2;
                        } else if (iWrite2 < iRemaining3) {
                            iWrite = 0;
                        } else {
                            iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                            if (iWrite < 0) {
                                this.A = 0;
                            } else {
                                this.A -= iWrite;
                            }
                        }
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.A = 0;
                        } else {
                            this.A -= iWrite;
                        }
                    }
                }
            } else {
                throw new IllegalStateException();
            }
            this.Z = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                boolean z10 = (i10 >= 24 && iWrite == -6) || iWrite == -32;
                if (z10 && this.f85292t.f82167c == 1) {
                    this.f85272a0 = true;
                }
                il ilVar = new il(iWrite, this.f85292t.f82165a, z10);
                gl glVar2 = this.f85290r;
                if (glVar2 != null) {
                    ih1.b("MediaCodecAudioRenderer", ih1.a("Audio sink error", ilVar));
                    ((ek1) glVar2).f77103a.H0.b(ilVar);
                }
                if (!ilVar.f78691c) {
                    vb0 vb0Var = this.f85287o;
                    vb0Var.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (vb0Var.f83872a == null) {
                        vb0Var.f83872a = ilVar;
                        vb0Var.f83873b = 100 + jElapsedRealtime;
                    }
                    if (jElapsedRealtime >= vb0Var.f83873b) {
                        Exception exc = vb0Var.f83872a;
                        if (exc != ilVar) {
                            exc.addSuppressed(ilVar);
                        }
                        Exception exc2 = vb0Var.f83872a;
                        vb0Var.f83872a = null;
                        throw exc2;
                    }
                    return;
                }
                throw ilVar;
            }
            this.f85287o.f83872a = null;
            if (a(this.f85293u)) {
                if (this.E > 0) {
                    this.f85274b0 = false;
                }
                if (this.U && (glVar = this.f85290r) != null && iWrite < iRemaining2 && !this.f85274b0 && (ln2Var = ((ek1) glVar).f77103a.Q0) != null) {
                    ((ao0) ln2Var).f75580a.I = true;
                }
            }
            int i11 = this.f85292t.f82167c;
            if (i11 == 0) {
                this.D += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    if (byteBuffer != this.M) {
                        throw new IllegalStateException();
                    }
                    this.E = (((long) this.F) * ((long) this.N)) + this.E;
                }
                this.O = null;
            }
        }
    }

    public final boolean a(mx0 mx0Var, pk pkVar) {
        int iA;
        int playbackOffloadSupport;
        int i10 = ib3.f78556a;
        if (i10 < 29 || this.f85284l == 0) {
            return false;
        }
        String str = mx0Var.f80429m;
        str.getClass();
        int iB = ht1.b(str, mx0Var.f80426j);
        if (iB == 0 || (iA = ib3.a(mx0Var.f80442z)) == 0) {
            return false;
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(mx0Var.A).setChannelMask(iA).setEncoding(iB).build();
        if (pkVar.f81437g == null) {
            pkVar.f81437g = new ok(pkVar);
        }
        AudioAttributes audioAttributes = pkVar.f81437g.f81061a;
        if (i10 >= 31) {
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, audioAttributes);
        } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, audioAttributes)) {
            playbackOffloadSupport = (i10 == 30 && ib3.f78559d.startsWith("Pixel")) ? 2 : 1;
        } else {
            playbackOffloadSupport = 0;
        }
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((mx0Var.C != 0 || mx0Var.D != 0) && (this.f85284l == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    public static boolean a(AudioTrack audioTrack) {
        return ib3.f78556a >= 29 && audioTrack.isOffloadedPlayback();
    }
}
