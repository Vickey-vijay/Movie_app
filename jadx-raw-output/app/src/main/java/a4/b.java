package a4;

import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import g5.k0;
import g5.t;
import java.io.IOException;
import m3.p;
import q3.g;
import q3.h;
import q3.i;
import q3.k;
import q3.r;
import q3.u;

/* JADX INFO: compiled from: WavExtractor.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f3439f = new k() { // from class: a4.a
        @Override // q3.k
        public final g[] createExtractors() {
            return b.f();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f3440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f3441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0000b f3442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3443d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3444e = -1;

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class a implements InterfaceC0000b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int[] f3445m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int[] f3446n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f3447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f3448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a4.c f3449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f3450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f3451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final t f3452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f3453g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Format f3454h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3455i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f3456j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f3457k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f3458l;

        public static int f(int i10, int i11) {
            return i10 * 2 * i11;
        }

        public final void b(byte[] bArr, int i10, t tVar) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f3449c.f3468b; i12++) {
                    c(bArr, i11, i12, tVar.f53154a);
                }
            }
            tVar.H(e(this.f3450d * i10));
        }

        @Override // a4.b.InterfaceC0000b
        public void reset(long j10) {
            this.f3455i = 0;
            this.f3456j = j10;
            this.f3457k = 0;
            this.f3458l = 0L;
        }

        public a(i iVar, u uVar, a4.c cVar) throws ParserException {
            this.f3447a = iVar;
            this.f3448b = uVar;
            this.f3449c = cVar;
            int iMax = Math.max(1, cVar.f3469c / 10);
            this.f3453g = iMax;
            t tVar = new t(cVar.f3473g);
            tVar.q();
            int iQ = tVar.q();
            this.f3450d = iQ;
            int i10 = cVar.f3468b;
            int i11 = (((cVar.f3471e - (i10 * 4)) * 8) / (cVar.f3472f * i10)) + 1;
            if (iQ == i11) {
                int iK = k0.k(iMax, iQ);
                this.f3451e = new byte[cVar.f3471e * iK];
                this.f3452f = new t(iK * f(iQ, i10));
                this.f3454h = Format.o(null, "audio/raw", null, ((cVar.f3469c * cVar.f3471e) * 8) / iQ, f(iMax, i10), cVar.f3468b, cVar.f3469c, 2, null, null, 0, null);
                return;
            }
            throw new ParserException("Expected frames per block: " + i11 + "; got: " + iQ);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0038 A[LOOP:0: B:6:0x001e->B:12:0x0038, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0020  */
        /* JADX WARN: Code duplicated, block: B:9:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // a4.b.InterfaceC0000b
        public boolean a(q3.h r7, long r8) throws java.io.IOException, java.lang.InterruptedException {
            /*
                r6 = this;
                int r0 = r6.f3453g
                int r1 = r6.f3457k
                int r1 = r6.d(r1)
                int r0 = r0 - r1
                int r1 = r6.f3450d
                int r0 = g5.k0.k(r0, r1)
                a4.c r1 = r6.f3449c
                int r1 = r1.f3471e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f3455i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f3451e
                int r5 = r6.f3455i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f3455i
                int r4 = r4 + r3
                r6.f3455i = r4
                goto L1e
            L3e:
                int r7 = r6.f3455i
                a4.c r8 = r6.f3449c
                int r8 = r8.f3471e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f3451e
                g5.t r9 = r6.f3452f
                r6.b(r8, r7, r9)
                int r8 = r6.f3455i
                a4.c r9 = r6.f3449c
                int r9 = r9.f3471e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f3455i = r8
                g5.t r7 = r6.f3452f
                int r7 = r7.d()
                q3.u r8 = r6.f3448b
                g5.t r9 = r6.f3452f
                r8.c(r9, r7)
                int r8 = r6.f3457k
                int r8 = r8 + r7
                r6.f3457k = r8
                int r7 = r6.d(r8)
                int r8 = r6.f3453g
                if (r7 < r8) goto L75
                r6.g(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f3457k
                int r7 = r6.d(r7)
                if (r7 <= 0) goto L82
                r6.g(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.b.a.a(q3.h, long):boolean");
        }

        public final void c(byte[] bArr, int i10, int i11, byte[] bArr2) {
            a4.c cVar = this.f3449c;
            int i12 = cVar.f3471e;
            int i13 = cVar.f3468b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iQ = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f3446n[iMin];
            int i18 = ((i10 * this.f3450d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iQ & 255);
            bArr2[i18 + 1] = (byte) (iQ >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                int i20 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)] & 255;
                int i21 = i19 % 2 == 0 ? i20 & 15 : i20 >> 4;
                int i22 = ((((i21 & 7) * 2) + 1) * i17) >> 3;
                if ((i21 & 8) != 0) {
                    i22 = -i22;
                }
                iQ = k0.q(iQ + i22, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iQ & 255);
                bArr2[i18 + 1] = (byte) (iQ >> 8);
                int i23 = iMin + f3445m[i21];
                int[] iArr = f3446n;
                iMin = k0.q(i23, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        public final int d(int i10) {
            return i10 / (this.f3449c.f3468b * 2);
        }

        public final int e(int i10) {
            return f(i10, this.f3449c.f3468b);
        }

        public final void g(int i10) {
            long jY0 = this.f3456j + k0.y0(this.f3458l, 1000000L, this.f3449c.f3469c);
            int iE = e(i10);
            this.f3448b.d(jY0, 1, iE, this.f3457k - iE, null);
            this.f3458l += (long) i10;
            this.f3457k -= iE;
        }

        @Override // a4.b.InterfaceC0000b
        public void init(int i10, long j10) {
            this.f3447a.e(new e(this.f3449c, this.f3450d, i10, j10));
            this.f3448b.a(this.f3454h);
        }
    }

    /* JADX INFO: renamed from: a4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WavExtractor.java */
    public interface InterfaceC0000b {
        boolean a(h hVar, long j10) throws InterruptedException, IOException;

        void init(int i10, long j10) throws ParserException;

        void reset(long j10);
    }

    /* JADX INFO: compiled from: WavExtractor.java */
    public static final class c implements InterfaceC0000b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f3459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f3460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a4.c f3461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Format f3462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f3464f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3465g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f3466h;

        public c(i iVar, u uVar, a4.c cVar, String str, int i10) throws ParserException {
            this.f3459a = iVar;
            this.f3460b = uVar;
            this.f3461c = cVar;
            int i11 = (cVar.f3468b * cVar.f3472f) / 8;
            if (cVar.f3471e == i11) {
                int iMax = Math.max(i11, (cVar.f3469c * i11) / 10);
                this.f3463e = iMax;
                int i12 = cVar.f3469c;
                this.f3462d = Format.o(null, str, null, i11 * i12 * 8, iMax, cVar.f3468b, i12, i10, null, null, 0, null);
                return;
            }
            throw new ParserException("Expected block size: " + i11 + "; got: " + cVar.f3471e);
        }

        @Override // a4.b.InterfaceC0000b
        public boolean a(h hVar, long j10) throws InterruptedException, IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f3465g) < (i11 = this.f3463e)) {
                int iB = this.f3460b.b(hVar, (int) Math.min(i11 - i10, j11), true);
                if (iB == -1) {
                    j11 = 0;
                } else {
                    this.f3465g += iB;
                    j11 -= (long) iB;
                }
            }
            a4.c cVar = this.f3461c;
            int i12 = cVar.f3471e;
            int i13 = this.f3465g / i12;
            if (i13 > 0) {
                long jY0 = this.f3464f + k0.y0(this.f3466h, 1000000L, cVar.f3469c);
                int i14 = i13 * i12;
                int i15 = this.f3465g - i14;
                this.f3460b.d(jY0, 1, i14, i15, null);
                this.f3466h += (long) i13;
                this.f3465g = i15;
            }
            return j11 <= 0;
        }

        @Override // a4.b.InterfaceC0000b
        public void init(int i10, long j10) {
            this.f3459a.e(new e(this.f3461c, 1, i10, j10));
            this.f3460b.a(this.f3462d);
        }

        @Override // a4.b.InterfaceC0000b
        public void reset(long j10) {
            this.f3464f = j10;
            this.f3465g = 0;
            this.f3466h = 0L;
        }
    }

    public static /* synthetic */ g[] f() {
        return new g[]{new b()};
    }

    @Override // q3.g
    public void release() {
    }

    @Override // q3.g
    public void c(i iVar) {
        this.f3440a = iVar;
        this.f3441b = iVar.track(0, 1);
        iVar.endTracks();
    }

    public final void e() {
        g5.a.h(this.f3441b);
        k0.i(this.f3440a);
    }

    @Override // q3.g
    public void seek(long j10, long j11) {
        InterfaceC0000b interfaceC0000b = this.f3442c;
        if (interfaceC0000b != null) {
            interfaceC0000b.reset(j11);
        }
    }

    @Override // q3.g
    public int a(h hVar, r rVar) throws InterruptedException, IOException {
        boolean z10;
        e();
        if (this.f3442c == null) {
            a4.c cVarA = d.a(hVar);
            if (cVarA != null) {
                int i10 = cVarA.f3467a;
                if (i10 == 17) {
                    this.f3442c = new a(this.f3440a, this.f3441b, cVarA);
                } else if (i10 == 6) {
                    this.f3442c = new c(this.f3440a, this.f3441b, cVarA, "audio/g711-alaw", -1);
                } else if (i10 == 7) {
                    this.f3442c = new c(this.f3440a, this.f3441b, cVarA, "audio/g711-mlaw", -1);
                } else {
                    int iA = p.a(i10, cVarA.f3472f);
                    if (iA != 0) {
                        this.f3442c = new c(this.f3440a, this.f3441b, cVarA, "audio/raw", iA);
                    } else {
                        throw new ParserException("Unsupported WAV format type: " + cVarA.f3467a);
                    }
                }
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (this.f3443d == -1) {
            Pair<Long, Long> pairB = d.b(hVar);
            this.f3443d = ((Long) pairB.first).intValue();
            long jLongValue = ((Long) pairB.second).longValue();
            this.f3444e = jLongValue;
            this.f3442c.init(this.f3443d, jLongValue);
        } else if (hVar.getPosition() == 0) {
            hVar.skipFully(this.f3443d);
        }
        if (this.f3444e != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.f(z10);
        if (this.f3442c.a(hVar, this.f3444e - hVar.getPosition())) {
            return -1;
        }
        return 0;
    }

    @Override // q3.g
    public boolean b(h hVar) throws InterruptedException, IOException {
        if (d.a(hVar) != null) {
            return true;
        }
        return false;
    }
}
