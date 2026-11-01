package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mk1 extends ro {
    public static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final long[] A;
    public pn0 A0;
    public mx0 B;
    public pa0 B0;
    public mx0 C;
    public long C0;
    public mk0 D;
    public long D0;
    public mk0 E;
    public int E0;
    public MediaCrypto F;
    public boolean G;
    public final long H;
    public float I;
    public float J;
    public dk1 K;
    public mx0 L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque P;
    public lk1 Q;
    public ik1 R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f80199a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f80200b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f80201c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ir f80202d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f80203e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f80204f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f80205g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ByteBuffer f80206h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f80207i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f80208j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f80209k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f80210l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f80211m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bk1 f80212n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f80213n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ok1 f80214o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f80215o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f80216p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f80217p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f80218q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f80219q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sa0 f80220r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f80221r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final sa0 f80222s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f80223s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sa0 f80224t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f80225t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final yo f80226u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f80227u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n63 f80228v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f80229v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f80230w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f80231w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MediaCodec.BufferInfo f80232x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f80233x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long[] f80234y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f80235y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long[] f80236z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f80237z0;

    public abstract float a(float f10, mx0[] mx0VarArr);

    public abstract int a(ok1 ok1Var, mx0 mx0Var);

    public abstract ArrayList a(ok1 ok1Var, mx0 mx0Var, boolean z10);

    public abstract ak1 a(ik1 ik1Var, mx0 mx0Var, MediaCrypto mediaCrypto, float f10);

    public final ux0 a(mk0 mk0Var) throws pn0 {
        k20 k20VarD = mk0Var.d();
        if (k20VarD == null || (k20VarD instanceof ux0)) {
            return (ux0) k20VarD;
        }
        throw a(6001, this.B, (Exception) new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + k20VarD), false);
    }

    public abstract va0 a(ik1 ik1Var, mx0 mx0Var, mx0 mx0Var2);

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j10, long j11);

    public abstract void a(mx0 mx0Var, MediaFormat mediaFormat);

    public void a(sa0 sa0Var) {
    }

    public abstract boolean a(long j10, long j11, dk1 dk1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, mx0 mx0Var);

    public boolean a(ik1 ik1Var) {
        return true;
    }

    public abstract void b(sa0 sa0Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    public final boolean b(long j10, long j11) {
        boolean z10;
        if (!(!this.f80233x0)) {
            throw new IllegalStateException();
        }
        yo yoVar = this.f80226u;
        int i10 = yoVar.f85077k;
        if (i10 <= 0) {
            z10 = 0;
        } else {
            if (!a(j10, j11, null, yoVar.f82568d, this.f80205g0, 0, i10, yoVar.f82570f, yoVar.b(Integer.MIN_VALUE), this.f80226u.b(4), this.C)) {
                return false;
            }
            a(this.f80226u.f85076j);
            this.f80226u.b();
            z10 = 0;
        }
        if (this.f80231w0) {
            this.f80233x0 = true;
            return z10;
        }
        if (this.f80210l0) {
            if (!this.f80226u.a(this.f80224t)) {
                throw new IllegalStateException();
            }
            this.f80210l0 = z10;
        }
        if (this.f80211m0) {
            yo yoVar2 = this.f80226u;
            if (yoVar2.f85077k > 0) {
                return true;
            }
            this.f80211m0 = z10;
            yoVar2.b();
            this.f80224t.b();
            this.f80210l0 = z10;
            this.f80209k0 = z10;
            this.f80211m0 = z10;
            r();
            if (!this.f80209k0) {
                return z10;
            }
        }
        if (!(!this.f80231w0)) {
            throw new IllegalStateException();
        }
        nx0 nx0Var = this.f82355c;
        nx0Var.f80853a = null;
        nx0Var.f80854b = null;
        this.f80224t.b();
        while (true) {
            this.f80224t.b();
            int iA = a(nx0Var, this.f80224t, (int) z10);
            if (iA == -5) {
                a(nx0Var);
                break;
            }
            if (iA != -4) {
                if (iA == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (this.f80224t.b(4)) {
                this.f80231w0 = true;
                break;
            }
            if (this.f80235y0) {
                mx0 mx0Var = this.B;
                mx0Var.getClass();
                this.C = mx0Var;
                a(mx0Var, (MediaFormat) null);
                this.f80235y0 = z10;
            }
            this.f80224t.c();
            if (!this.f80226u.a(this.f80224t)) {
                this.f80210l0 = true;
                break;
            }
        }
        yo yoVar3 = this.f80226u;
        if (yoVar3.f85077k > 0) {
            yoVar3.c();
        }
        if (this.f80226u.f85077k > 0 || this.f80231w0 || this.f80211m0) {
            return true;
        }
        return z10;
    }

    public boolean b(mx0 mx0Var) {
        return false;
    }

    public final boolean c(long j10, long j11) throws pn0 {
        boolean z10;
        boolean zA;
        int iA;
        boolean z11;
        if (this.f80205g0 < 0) {
            if (this.X && this.f80223s0) {
                try {
                    iA = this.K.a(this.f80232x);
                } catch (IllegalStateException unused) {
                    t();
                    if (this.f80233x0) {
                        u();
                    }
                    return false;
                }
            } else {
                iA = this.K.a(this.f80232x);
            }
            if (iA < 0) {
                if (iA != -2) {
                    if (this.f80201c0 && (this.f80231w0 || this.f80217p0 == 2)) {
                        t();
                    }
                    return false;
                }
                this.f80225t0 = true;
                MediaFormat mediaFormatA = this.K.a();
                if (this.S != 0 && mediaFormatA.getInteger("width") == 32 && mediaFormatA.getInteger("height") == 32) {
                    this.f80200b0 = true;
                } else {
                    if (this.Z) {
                        mediaFormatA.setInteger("channel-count", 1);
                    }
                    this.M = mediaFormatA;
                    this.N = true;
                }
                return true;
            }
            if (this.f80200b0) {
                this.f80200b0 = false;
                this.K.a(false, iA);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f80232x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                t();
                return false;
            }
            this.f80205g0 = iA;
            ByteBuffer byteBufferB = this.K.b(iA);
            this.f80206h0 = byteBufferB;
            if (byteBufferB != null) {
                byteBufferB.position(this.f80232x.offset);
                ByteBuffer byteBuffer = this.f80206h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f80232x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f80232x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f80227u0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            long j13 = this.f80232x.presentationTimeUs;
            int size = this.f80230w.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z11 = false;
                    break;
                }
                if (((Long) this.f80230w.get(i10)).longValue() == j13) {
                    this.f80230w.remove(i10);
                    z11 = true;
                    break;
                }
                i10++;
            }
            this.f80207i0 = z11;
            long j14 = this.f80229v0;
            long j15 = this.f80232x.presentationTimeUs;
            this.f80208j0 = j14 == j15;
            b(j15);
        }
        if (this.X && this.f80223s0) {
            try {
                dk1 dk1Var = this.K;
                ByteBuffer byteBuffer2 = this.f80206h0;
                int i11 = this.f80205g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f80232x;
                z10 = false;
                try {
                    zA = a(j10, j11, dk1Var, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f80207i0, this.f80208j0, this.C);
                } catch (IllegalStateException unused2) {
                    t();
                    if (this.f80233x0) {
                        u();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            dk1 dk1Var2 = this.K;
            ByteBuffer byteBuffer3 = this.f80206h0;
            int i12 = this.f80205g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f80232x;
            zA = a(j10, j11, dk1Var2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f80207i0, this.f80208j0, this.C);
        }
        if (zA) {
            a(this.f80232x.presentationTimeUs);
            boolean z12 = (this.f80232x.flags & 4) != 0 ? true : z10;
            this.f80205g0 = -1;
            this.f80206h0 = null;
            if (!z12) {
                return r14;
            }
            t();
        }
        return z10;
    }

    @Override // yads.ro
    public final int l() {
        return 8;
    }

    public boolean q() {
        return false;
    }

    public abstract void s();

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        try {
            dk1 dk1Var = this.K;
            if (dk1Var != null) {
                dk1Var.release();
                this.B0.f81320b++;
                a(this.R.f78680a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.F = null;
                mk0.a(this.D, null);
                this.D = null;
                x();
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.F = null;
                mk0.a(this.D, null);
                this.D = null;
                x();
            }
        }
    }

    public void v() {
    }

    public void w() {
        this.f80204f0 = -1;
        this.f80222s.f82568d = null;
        this.f80205g0 = -1;
        this.f80206h0 = null;
        this.f80203e0 = -9223372036854775807L;
        this.f80223s0 = false;
        this.f80221r0 = false;
        this.f80199a0 = false;
        this.f80200b0 = false;
        this.f80207i0 = false;
        this.f80208j0 = false;
        this.f80230w.clear();
        this.f80227u0 = -9223372036854775807L;
        this.f80229v0 = -9223372036854775807L;
        ir irVar = this.f80202d0;
        if (irVar != null) {
            irVar.f78773a = 0L;
            irVar.f78774b = 0L;
            irVar.f78775c = false;
        }
        this.f80217p0 = 0;
        this.f80219q0 = 0;
        this.f80215o0 = this.f80213n0 ? 1 : 0;
    }

    public final void y() throws pn0 {
        try {
            this.F.setMediaDrmSession(a(this.E).f83683b);
            mk0 mk0Var = this.E;
            mk0.a(this.D, mk0Var);
            this.D = mk0Var;
            this.f80217p0 = 0;
            this.f80219q0 = 0;
        } catch (MediaCryptoException e10) {
            throw a(6006, this.B, (Exception) e10, false);
        }
    }

    @Override // yads.ro
    public boolean f() {
        return this.f80233x0;
    }

    @Override // yads.ro
    public boolean g() {
        boolean zIsReady;
        if (this.B != null) {
            if (e()) {
                zIsReady = this.f82364l;
            } else {
                ns2 ns2Var = this.f82360h;
                ns2Var.getClass();
                zIsReady = ns2Var.isReady();
            }
            if (zIsReady || this.f80205g0 >= 0 || (this.f80203e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f80203e0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() throws pn0 {
        if (this.f80221r0) {
            this.f80217p0 = 1;
            if (this.U || this.W) {
                this.f80219q0 = 3;
                return false;
            }
            this.f80219q0 = 2;
        } else {
            y();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:166:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public final boolean n() throws pn0 {
        int i10;
        int i11;
        dk1 dk1Var = this.K;
        boolean z10 = 0;
        if (dk1Var == null || this.f80217p0 == 2 || this.f80231w0) {
            return false;
        }
        if (this.f80204f0 < 0) {
            int iB = dk1Var.b();
            this.f80204f0 = iB;
            if (iB < 0) {
                return false;
            }
            this.f80222s.f82568d = this.K.a(iB);
            this.f80222s.b();
        }
        if (this.f80217p0 == 1) {
            if (!this.f80201c0) {
                this.f80223s0 = true;
                this.K.a(this.f80204f0, 0, 0L, 4);
                this.f80204f0 = -1;
                this.f80222s.f82568d = null;
            }
            this.f80217p0 = 2;
            return false;
        }
        if (this.f80199a0) {
            this.f80199a0 = false;
            this.f80222s.f82568d.put(F0);
            this.K.a(this.f80204f0, 38, 0L, 0);
            this.f80204f0 = -1;
            this.f80222s.f82568d = null;
            this.f80221r0 = true;
            return true;
        }
        if (this.f80215o0 == 1) {
            for (int i12 = 0; i12 < this.L.f80431o.size(); i12++) {
                this.f80222s.f82568d.put((byte[]) this.L.f80431o.get(i12));
            }
            this.f80215o0 = 2;
        }
        int iPosition = this.f80222s.f82568d.position();
        nx0 nx0Var = this.f82355c;
        nx0Var.f80853a = null;
        nx0Var.f80854b = null;
        try {
            int iA = a(nx0Var, this.f80222s, 0);
            if (e()) {
                this.f80229v0 = this.f80227u0;
            }
            if (iA == -3) {
                return false;
            }
            if (iA == -5) {
                if (this.f80215o0 == 2) {
                    this.f80222s.b();
                    this.f80215o0 = 1;
                }
                a(nx0Var);
                return true;
            }
            if (this.f80222s.b(4)) {
                if (this.f80215o0 == 2) {
                    this.f80222s.b();
                    this.f80215o0 = 1;
                }
                this.f80231w0 = true;
                if (!this.f80221r0) {
                    t();
                    return false;
                }
                try {
                    if (!this.f80201c0) {
                        this.f80223s0 = true;
                        this.K.a(this.f80204f0, 0, 0L, 4);
                        this.f80204f0 = -1;
                        this.f80222s.f82568d = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    mx0 mx0Var = this.B;
                    int errorCode = e10.getErrorCode();
                    int i13 = ib3.f78556a;
                    if (errorCode == 2 || errorCode == 4) {
                        i11 = 6005;
                    } else if (errorCode == 10) {
                        i11 = 6004;
                    } else if (errorCode == 7) {
                        i11 = 6005;
                    } else if (errorCode != 8) {
                        switch (errorCode) {
                            case 15:
                                i11 = 6003;
                                break;
                            case 16:
                            case 18:
                                i11 = 6005;
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                i11 = 6004;
                                break;
                            default:
                                switch (errorCode) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        i11 = 6002;
                                        break;
                                    default:
                                        i11 = 6006;
                                        break;
                                }
                                break;
                        }
                    } else {
                        i11 = 6003;
                    }
                    throw a(i11, mx0Var, (Exception) e10, false);
                }
            }
            if (!this.f80221r0 && !this.f80222s.b(1)) {
                this.f80222s.b();
                if (this.f80215o0 == 2) {
                    this.f80215o0 = 1;
                }
                return true;
            }
            boolean zB = this.f80222s.b(1073741824);
            if (zB) {
                m20 m20Var = this.f80222s.f82567c;
                if (iPosition == 0) {
                    m20Var.getClass();
                } else {
                    if (m20Var.f80036d == null) {
                        int[] iArr = new int[1];
                        m20Var.f80036d = iArr;
                        m20Var.f80041i.numBytesOfClearData = iArr;
                    }
                    int[] iArr2 = m20Var.f80036d;
                    iArr2[0] = iArr2[0] + iPosition;
                }
            }
            if (this.T && !zB) {
                ByteBuffer byteBuffer = this.f80222s.f82568d;
                byte[] bArr = dy1.f76843a;
                int iPosition2 = byteBuffer.position();
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    int i16 = i14 + 1;
                    if (i16 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i17 = byteBuffer.get(i14) & 255;
                    if (i15 == 3) {
                        if (i17 == 1 && (byteBuffer.get(i16) & 31) == 7) {
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            byteBufferDuplicate.position(i14 - 3);
                            byteBufferDuplicate.limit(iPosition2);
                            byteBuffer.position(0);
                            byteBuffer.put(byteBufferDuplicate);
                            break;
                        }
                    } else if (i17 == 0) {
                        i15++;
                    }
                    if (i17 != 0) {
                        i15 = 0;
                    }
                    i14 = i16;
                }
                if (this.f80222s.f82568d.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            sa0 sa0Var = this.f80222s;
            long j10 = sa0Var.f82570f;
            ir irVar = this.f80202d0;
            if (irVar != null) {
                mx0 mx0Var2 = this.B;
                if (irVar.f78774b == 0) {
                    irVar.f78773a = j10;
                }
                if (!irVar.f78775c) {
                    ByteBuffer byteBuffer2 = sa0Var.f82568d;
                    byteBuffer2.getClass();
                    int i18 = 0;
                    for (int i19 = 0; i19 < 4; i19++) {
                        i18 = (i18 << 8) | (byteBuffer2.get(i19) & 255);
                    }
                    int iB2 = pv1.b(i18);
                    if (iB2 == -1) {
                        irVar.f78775c = true;
                        irVar.f78774b = 0L;
                        irVar.f78773a = sa0Var.f82570f;
                        ih1.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j10 = sa0Var.f82570f;
                    } else {
                        long jMax = Math.max(0L, ((irVar.f78774b - 529) * 1000000) / mx0Var2.A) + irVar.f78773a;
                        irVar.f78774b += (long) iB2;
                        j10 = jMax;
                    }
                }
                long j11 = this.f80227u0;
                ir irVar2 = this.f80202d0;
                mx0 mx0Var3 = this.B;
                irVar2.getClass();
                this.f80227u0 = Math.max(j11, Math.max(0L, ((irVar2.f78774b - 529) * 1000000) / mx0Var3.A) + irVar2.f78773a);
            }
            if (this.f80222s.b(Integer.MIN_VALUE)) {
                this.f80230w.add(Long.valueOf(j10));
            }
            if (this.f80235y0) {
                this.f80228v.a(this.B, j10);
                this.f80235y0 = false;
            }
            this.f80227u0 = Math.max(this.f80227u0, j10);
            this.f80222s.c();
            if (this.f80222s.b(268435456)) {
                a(this.f80222s);
            }
            b(this.f80222s);
            try {
                if (zB) {
                    this.K.a(this.f80204f0, this.f80222s.f82567c, j10);
                } else {
                    this.K.a(this.f80204f0, this.f80222s.f82568d.limit(), j10, 0);
                }
                this.f80204f0 = -1;
                this.f80222s.f82568d = null;
                this.f80221r0 = true;
                this.f80215o0 = 0;
                pa0 pa0Var = this.B0;
                z10 = pa0Var.f81321c + 1;
                pa0Var.f81321c = z10;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                mx0 mx0Var4 = this.B;
                int errorCode2 = e11.getErrorCode();
                int i20 = ib3.f78556a;
                if (errorCode2 == 2 || errorCode2 == 4) {
                    i10 = 6005;
                } else if (errorCode2 == 10) {
                    i10 = 6004;
                } else if (errorCode2 == 7) {
                    i10 = 6005;
                } else if (errorCode2 != 8) {
                    switch (errorCode2) {
                        case 15:
                            i10 = 6003;
                            break;
                        case 16:
                        case 18:
                            i10 = 6005;
                            break;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            i10 = 6004;
                            break;
                        default:
                            switch (errorCode2) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    i10 = 6002;
                                    break;
                                default:
                                    i10 = 6006;
                                    break;
                            }
                            break;
                    }
                } else {
                    i10 = 6003;
                }
                throw a(i10, mx0Var4, e11, z10);
            }
        } catch (ra0 e12) {
            a(e12);
            c(0);
            o();
            return true;
        }
    }

    public final void o() {
        try {
            this.K.flush();
        } finally {
            w();
        }
    }

    public final boolean p() {
        if (this.K == null) {
            return false;
        }
        int i10 = this.f80219q0;
        if (i10 == 3 || this.U || ((this.V && !this.f80225t0) || (this.W && this.f80223s0))) {
            u();
            return true;
        }
        if (i10 == 2) {
            int i11 = ib3.f78556a;
            if (i11 < 23) {
                throw new IllegalStateException();
            }
            if (i11 >= 23) {
                try {
                    y();
                } catch (pn0 e10) {
                    ih1.d("MediaCodecRenderer", ih1.a("Failed to update the DRM session, releasing the codec instead.", e10));
                    u();
                    return true;
                }
            }
        }
        o();
        return false;
    }

    public final void r() {
        mx0 mx0Var;
        if (this.K != null || this.f80209k0 || (mx0Var = this.B) == null) {
            return;
        }
        if (this.E == null && b(mx0Var)) {
            mx0 mx0Var2 = this.B;
            this.f80211m0 = false;
            this.f80226u.b();
            this.f80224t.b();
            this.f80210l0 = false;
            this.f80209k0 = false;
            String str = mx0Var2.f80429m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f80226u.f85078l = 32;
            } else {
                this.f80226u.f85078l = 1;
            }
            this.f80209k0 = true;
            return;
        }
        mk0 mk0Var = this.E;
        mk0.a(this.D, mk0Var);
        this.D = mk0Var;
        String str2 = this.B.f80429m;
        if (mk0Var != null) {
            if (this.F == null) {
                ux0 ux0VarA = a(mk0Var);
                if (ux0VarA != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(ux0VarA.f83682a, ux0VarA.f83683b);
                        this.F = mediaCrypto;
                        this.G = !ux0VarA.f83684c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e10) {
                        throw a(6006, this.B, e10, false);
                    }
                } else if (this.D.c() == null) {
                    return;
                }
            }
            if (ux0.f83681d) {
                int state = this.D.getState();
                if (state == 1) {
                    lk0 lk0VarC = this.D.c();
                    lk0VarC.getClass();
                    throw a(lk0VarC.f79828b, this.B, (Exception) lk0VarC, false);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (lk1 e11) {
            throw a(4001, this.B, e11, false);
        }
    }

    public final void t() throws pn0 {
        int i10 = this.f80219q0;
        if (i10 == 1) {
            o();
            return;
        }
        if (i10 == 2) {
            o();
            y();
        } else if (i10 != 3) {
            this.f80233x0 = true;
            v();
        } else {
            u();
            r();
        }
    }

    public mk1(int i10, ee0 ee0Var, ok1 ok1Var, boolean z10, float f10) {
        super(i10);
        this.f80212n = ee0Var;
        this.f80214o = (ok1) ni.a(ok1Var);
        this.f80216p = z10;
        this.f80218q = f10;
        this.f80220r = sa0.d();
        this.f80222s = new sa0(0);
        this.f80224t = new sa0(2);
        yo yoVar = new yo();
        this.f80226u = yoVar;
        this.f80228v = new n63();
        this.f80230w = new ArrayList();
        this.f80232x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f80234y = new long[10];
        this.f80236z = new long[10];
        this.A = new long[10];
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        yoVar.c(0);
        yoVar.f82568d.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f80215o0 = 0;
        this.f80204f0 = -1;
        this.f80205g0 = -1;
        this.f80203e0 = -9223372036854775807L;
        this.f80227u0 = -9223372036854775807L;
        this.f80229v0 = -9223372036854775807L;
        this.f80217p0 = 0;
        this.f80219q0 = 0;
    }

    public final void x() {
        w();
        this.A0 = null;
        this.f80202d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f80225t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f80201c0 = false;
        this.f80213n0 = false;
        this.f80215o0 = 0;
        this.G = false;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0213  */
    /* JADX WARN: Code duplicated, block: B:136:0x0267  */
    /* JADX WARN: Code duplicated, block: B:145:0x028c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a1  */
    public final void a(ik1 ik1Var, MediaCrypto mediaCrypto) {
        float fA;
        int i10;
        nk1 nk1Var;
        String strF;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        nk1 nk1Var2;
        boolean z13;
        String str2;
        nk1 nk1Var3;
        String str3 = ik1Var.f78680a;
        int i11 = ib3.f78556a;
        if (i11 < 23) {
            fA = -1.0f;
        } else {
            float f10 = this.J;
            mx0[] mx0VarArr = this.f82361i;
            mx0VarArr.getClass();
            fA = a(f10, mx0VarArr);
        }
        float f11 = fA > this.f80218q ? fA : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ak1 ak1VarA = a(ik1Var, this.B, mediaCrypto, f11);
        if (i11 >= 31) {
            ye2 ye2Var = this.f82358f;
            ye2Var.getClass();
            kk1.a(ak1VarA, ye2Var);
        }
        try {
            d73.a("createCodec:" + str3);
            this.K = this.f80212n.a(ak1VarA);
            d73.a();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.R = ik1Var;
            this.O = f11;
            this.L = this.B;
            if (i11 <= 25) {
                nk1 nk1Var4 = pk2.f81439b;
                if (nk1Var4.p().equals(str3)) {
                    String str4 = ib3.f78559d;
                    if (str4.startsWith(nk1Var4.J()) || str4.startsWith(nk1Var4.F()) || str4.startsWith(nk1Var4.G()) || str4.startsWith(nk1Var4.I())) {
                        i10 = 2;
                    } else if (i11 < 24) {
                        nk1Var = pk2.f81439b;
                        if (!nk1Var.s().equals(str3) || nk1Var.t().equals(str3)) {
                            strF = nk1Var.f();
                            str = ib3.f78557b;
                            if (!strF.equals(str) || nk1Var.g().equals(str) || nk1Var.k().equals(str) || nk1Var.M().equals(str)) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                        } else {
                            i10 = 0;
                        }
                    } else {
                        i10 = 0;
                    }
                } else if (i11 < 24) {
                    nk1Var = pk2.f81439b;
                    if (nk1Var.s().equals(str3)) {
                        strF = nk1Var.f();
                        str = ib3.f78557b;
                        if (strF.equals(str)) {
                        }
                        i10 = 1;
                    } else {
                        strF = nk1Var.f();
                        str = ib3.f78557b;
                        if (strF.equals(str)) {
                        }
                        i10 = 1;
                    }
                } else {
                    i10 = 0;
                }
            } else if (i11 < 24) {
                nk1Var = pk2.f81439b;
                if (nk1Var.s().equals(str3)) {
                    strF = nk1Var.f();
                    str = ib3.f78557b;
                    if (strF.equals(str)) {
                    }
                    i10 = 1;
                } else {
                    strF = nk1Var.f();
                    str = ib3.f78557b;
                    if (strF.equals(str)) {
                    }
                    i10 = 1;
                }
            } else {
                i10 = 0;
            }
            this.S = i10;
            this.T = i11 < 21 && this.L.f80431o.isEmpty() && pk2.f81439b.r().equals(str3);
            if (i11 < 18) {
                z10 = true;
            } else if (i11 == 18) {
                nk1 nk1Var5 = pk2.f81439b;
                if (nk1Var5.u().equals(str3) || nk1Var5.v().equals(str3)) {
                    z10 = true;
                } else {
                    if (i11 == 19) {
                        str2 = ib3.f78559d;
                        nk1Var3 = pk2.f81439b;
                        if (!str2.startsWith(nk1Var3.H()) && (nk1Var3.o().equals(str3) || nk1Var3.p().equals(str3))) {
                            z10 = true;
                        }
                    }
                    z10 = false;
                }
            } else {
                if (i11 == 19) {
                    str2 = ib3.f78559d;
                    nk1Var3 = pk2.f81439b;
                    if (!str2.startsWith(nk1Var3.H())) {
                    }
                }
                z10 = false;
            }
            this.U = z10;
            this.V = i11 == 29 && pk2.f81439b.d().equals(str3);
            if (i11 > 23 || !pk2.f81439b.D().equals(str3)) {
                if (i11 <= 19) {
                    nk1 nk1Var6 = pk2.f81439b;
                    String strL = nk1Var6.l();
                    String str5 = ib3.f78557b;
                    z11 = (strL.equals(str5) || nk1Var6.L().equals(str5)) && (nk1Var6.y().equals(str3) || nk1Var6.z().equals(str3));
                }
            }
            this.W = z11;
            this.X = i11 == 21 && pk2.f81439b.C().equals(str3);
            if (i11 < 21) {
                nk1 nk1Var7 = pk2.f81439b;
                if (nk1Var7.w().equals(str3) && nk1Var7.K().equals(ib3.f78558c)) {
                    String str6 = ib3.f78557b;
                    if (str6.startsWith(nk1Var7.c()) || str6.startsWith(nk1Var7.j()) || str6.startsWith(nk1Var7.h()) || str6.startsWith(nk1Var7.i()) || str6.startsWith(nk1Var7.m()) || str6.startsWith(nk1Var7.n())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
            this.Y = z12;
            this.Z = i11 <= 18 && this.L.f80442z == 1 && pk2.f81439b.q().equals(str3);
            String str7 = ik1Var.f78680a;
            if ((i11 <= 25 && pk2.f81439b.E().equals(str7)) || (i11 <= 17 && pk2.f81439b.x().equals(str7))) {
                z13 = true;
            } else if (i11 <= 29) {
                nk1 nk1Var8 = pk2.f81439b;
                if (nk1Var8.A().equals(str7) || nk1Var8.B().equals(str7)) {
                    z13 = true;
                } else {
                    nk1Var2 = pk2.f81439b;
                    if ((!nk1Var2.b().equals(ib3.f78558c) && nk1Var2.a().equals(ib3.f78559d) && ik1Var.f78685f) || q()) {
                        z13 = true;
                    }
                }
            } else {
                nk1Var2 = pk2.f81439b;
                z13 = !nk1Var2.b().equals(ib3.f78558c) ? false : false;
            }
            this.f80201c0 = z13;
            this.K.getClass();
            if (pk2.f81439b.e().equals(ik1Var.f78680a)) {
                this.f80202d0 = new ir();
            }
            if (this.f82359g == 2) {
                this.f80203e0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.B0.f81319a++;
            a(str3, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            d73.a();
            throw th2;
        }
    }

    public final boolean c(int i10) throws pn0 {
        nx0 nx0Var = this.f82355c;
        nx0Var.f80853a = null;
        nx0Var.f80854b = null;
        this.f80220r.b();
        int iA = a(nx0Var, this.f80220r, i10 | 4);
        if (iA == -5) {
            a(nx0Var);
            return true;
        }
        if (iA != -4 || !this.f80220r.b(4)) {
            return false;
        }
        this.f80231w0 = true;
        t();
        return false;
    }

    public final List b(boolean z10) {
        ArrayList arrayListA = a(this.f80214o, this.B, z10);
        if (arrayListA.isEmpty() && z10) {
            arrayListA = a(this.f80214o, this.B, false);
            if (!arrayListA.isEmpty()) {
                ih1.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f80429m + ", but no secure decoder available. Trying to proceed with " + arrayListA + ".");
            }
        }
        return arrayListA;
    }

    public final boolean c(mx0 mx0Var) {
        if (ib3.f78556a >= 23 && this.K != null && this.f80219q0 != 3 && this.f82359g != 0) {
            float f10 = this.J;
            mx0[] mx0VarArr = this.f82361i;
            mx0VarArr.getClass();
            float fA = a(f10, mx0VarArr);
            float f11 = this.O;
            if (f11 == fA) {
                return true;
            }
            if (fA == -1.0f) {
                if (this.f80221r0) {
                    this.f80217p0 = 1;
                    this.f80219q0 = 3;
                    return false;
                }
                u();
                r();
                return false;
            }
            if (f11 == -1.0f && fA <= this.f80218q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.K.a(bundle);
            this.O = fA;
        }
        return true;
    }

    public final void b(long j10) {
        Object objA;
        n63 n63Var = this.f80228v;
        synchronized (n63Var) {
            objA = n63Var.a(j10, true);
        }
        mx0 mx0Var = (mx0) objA;
        if (mx0Var == null && this.N) {
            mx0Var = (mx0) this.f80228v.c();
        }
        if (mx0Var != null) {
            this.C = mx0Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0049 A[SYNTHETIC] */
    public final void a(MediaCrypto mediaCrypto, boolean z10) throws lk1 {
        lk1 lk1Var;
        String strA;
        lk1 lk1Var2;
        if (this.P == null) {
            try {
                List listB = b(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.P = arrayDeque;
                if (this.f80216p) {
                    arrayDeque.addAll(listB);
                } else if (!listB.isEmpty()) {
                    this.P.add((ik1) listB.get(0));
                }
                this.Q = null;
            } catch (rk1 e10) {
                throw new lk1(-49998, this.B, e10, z10);
            }
        }
        if (!this.P.isEmpty()) {
            ik1 ik1Var = (ik1) this.P.peekFirst();
            while (this.K == null) {
                ik1 ik1Var2 = (ik1) this.P.peekFirst();
                if (!a(ik1Var2)) {
                    return;
                }
                try {
                    a(ik1Var2, mediaCrypto);
                } catch (Exception e11) {
                    if (ik1Var2 == ik1Var) {
                        try {
                            ih1.d("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50L);
                            a(ik1Var2, mediaCrypto);
                        } catch (Exception e12) {
                            ih1.d("MediaCodecRenderer", ih1.a("Failed to initialize decoder: " + ik1Var2, e12));
                            this.P.removeFirst();
                            mx0 mx0Var = this.B;
                            String str = "Decoder init failed: " + ik1Var2.f78680a + ", " + mx0Var;
                            String str2 = mx0Var.f80429m;
                            if (ib3.f78556a >= 21) {
                                strA = lk1.a(e12);
                            } else {
                                strA = null;
                            }
                            lk1Var = new lk1(str, e12, str2, z10, ik1Var2, strA);
                            a(lk1Var);
                            lk1Var2 = this.Q;
                            if (lk1Var2 == null) {
                                this.Q = lk1Var;
                            } else {
                                this.Q = new lk1(lk1Var2.getMessage(), lk1Var2.getCause(), lk1Var2.f79829b, lk1Var2.f79830c, lk1Var2.f79831d, lk1Var2.f79832e);
                            }
                            if (!this.P.isEmpty()) {
                                throw this.Q;
                            }
                        }
                    } else {
                        throw e11;
                    }
                    ih1.d("MediaCodecRenderer", ih1.a("Failed to initialize decoder: " + ik1Var2, e12));
                    this.P.removeFirst();
                    mx0 mx0Var2 = this.B;
                    String str3 = "Decoder init failed: " + ik1Var2.f78680a + ", " + mx0Var2;
                    String str4 = mx0Var2.f80429m;
                    if (ib3.f78556a >= 21) {
                        strA = lk1.a(e12);
                    } else {
                        strA = null;
                    }
                    lk1Var = new lk1(str3, e12, str4, z10, ik1Var2, strA);
                    a(lk1Var);
                    lk1Var2 = this.Q;
                    if (lk1Var2 == null) {
                        this.Q = lk1Var;
                    } else {
                        this.Q = new lk1(lk1Var2.getMessage(), lk1Var2.getCause(), lk1Var2.f79829b, lk1Var2.f79830c, lk1Var2.f79831d, lk1Var2.f79832e);
                    }
                    if (!this.P.isEmpty()) {
                        throw this.Q;
                    }
                }
            }
            this.P = null;
            return;
        }
        throw new lk1(-49999, this.B, null, z10);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r12 != false) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yads.va0 a(yads.nx0 r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mk1.a(yads.nx0):yads.va0");
    }

    @Override // yads.ro
    public void a(long j10, boolean z10) {
        int i10;
        this.f80231w0 = false;
        this.f80233x0 = false;
        this.f80237z0 = false;
        if (this.f80209k0) {
            this.f80226u.b();
            this.f80224t.b();
            this.f80210l0 = false;
        } else if (p()) {
            r();
        }
        n63 n63Var = this.f80228v;
        synchronized (n63Var) {
            i10 = n63Var.f80578d;
        }
        if (i10 > 0) {
            this.f80235y0 = true;
        }
        this.f80228v.a();
        int i11 = this.E0;
        if (i11 != 0) {
            int i12 = i11 - 1;
            this.D0 = this.f80236z[i12];
            this.C0 = this.f80234y[i12];
            this.E0 = 0;
        }
    }

    public void a(long j10) {
        while (true) {
            int i10 = this.E0;
            if (i10 == 0 || j10 < this.A[0]) {
                return;
            }
            long[] jArr = this.f80234y;
            this.C0 = jArr[0];
            this.D0 = this.f80236z[0];
            int i11 = i10 - 1;
            this.E0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f80236z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.E0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.E0);
            s();
        }
    }

    @Override // yads.ro
    public final void a(mx0[] mx0VarArr, long j10, long j11) {
        if (this.D0 == -9223372036854775807L) {
            if (this.C0 == -9223372036854775807L) {
                this.C0 = j10;
                this.D0 = j11;
                return;
            }
            throw new IllegalStateException();
        }
        int i10 = this.E0;
        if (i10 == this.f80236z.length) {
            ih1.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f80236z[this.E0 - 1]);
        } else {
            this.E0 = i10 + 1;
        }
        long[] jArr = this.f80234y;
        int i11 = this.E0 - 1;
        jArr[i11] = j10;
        this.f80236z[i11] = j11;
        this.A[i11] = this.f80227u0;
    }

    @Override // yads.ro
    public final void a(long j10, long j11) throws pn0 {
        boolean z10 = false;
        if (this.f80237z0) {
            this.f80237z0 = false;
            t();
        }
        pn0 pn0Var = this.A0;
        if (pn0Var == null) {
            try {
                if (this.f80233x0) {
                    v();
                    return;
                }
                if (this.B != null || c(2)) {
                    r();
                    if (this.f80209k0) {
                        d73.a("bypassRender");
                        while (b(j10, j11)) {
                        }
                        d73.a();
                    } else if (this.K != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        d73.a("drainAndFeed");
                        while (c(j10, j11) && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                        }
                        while (n() && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                        }
                        d73.a();
                    } else {
                        pa0 pa0Var = this.B0;
                        int i10 = pa0Var.f81322d;
                        ns2 ns2Var = this.f82360h;
                        ns2Var.getClass();
                        pa0Var.f81322d = i10 + ns2Var.a(j10 - this.f82362j);
                        c(1);
                    }
                    synchronized (this.B0) {
                    }
                    return;
                }
                return;
            } catch (IllegalStateException e10) {
                int i11 = ib3.f78556a;
                if (i11 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e10.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e10;
                    }
                }
                a(e10);
                if (i11 >= 21 && (e10 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e10).isRecoverable()) {
                    z10 = true;
                }
                if (z10) {
                    u();
                }
                throw a(4003, this.B, a(e10, this.R), z10);
            }
        }
        this.A0 = null;
        throw pn0Var;
    }

    @Override // yads.ro
    public void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        c(this.L);
    }

    @Override // yads.ro
    public final int a(mx0 mx0Var) throws pn0 {
        try {
            return a(this.f80214o, mx0Var);
        } catch (rk1 e10) {
            throw a(4002, mx0Var, (Exception) e10, false);
        }
    }

    public hk1 a(IllegalStateException illegalStateException, ik1 ik1Var) {
        return new hk1(illegalStateException, ik1Var);
    }
}
