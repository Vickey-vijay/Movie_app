package z3;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double[] f86073q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f86074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q3.u f86075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f86077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0 f86078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g5.t f86079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f86080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f86081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f86082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f86083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f86084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f86085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f86086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f86087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f86088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f86089p;

    /* JADX INFO: compiled from: H262Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final byte[] f86090e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f86091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f86093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f86094d;

        public void c() {
            this.f86091a = false;
            this.f86092b = 0;
            this.f86093c = 0;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f86091a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f86094d;
                int length = bArr2.length;
                int i13 = this.f86092b;
                if (length < i13 + i12) {
                    this.f86094d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f86094d, this.f86092b, i12);
                this.f86092b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f86091a) {
                int i12 = this.f86092b - i11;
                this.f86092b = i12;
                if (this.f86093c != 0 || i10 != 181) {
                    this.f86091a = false;
                    return true;
                }
                this.f86093c = i12;
            } else if (i10 == 179) {
                this.f86091a = true;
            }
            byte[] bArr = f86090e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public a(int i10) {
            this.f86094d = new byte[i10];
        }
    }

    public n() {
        this(null);
    }

    @Override // z3.m
    public void packetFinished() {
    }

    public n(j0 j0Var) {
        this.f86078e = j0Var;
        this.f86080g = new boolean[4];
        this.f86081h = new a(128);
        if (j0Var != null) {
            this.f86082i = new t(178, 128);
            this.f86079f = new g5.t();
        } else {
            this.f86082i = null;
            this.f86079f = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    public static Pair<Format, Long> a(a aVar, String str) {
        float f10;
        int i10;
        float f11;
        long j10;
        int i11;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f86094d, aVar.f86092b);
        int i14 = bArrCopyOf[4] & 255;
        int i15 = bArrCopyOf[5] & 255;
        int i16 = (i14 << 4) | (i15 >> 4);
        int i17 = ((i15 & 15) << 8) | (bArrCopyOf[6] & 255);
        int i18 = (bArrCopyOf[7] & 240) >> 4;
        if (i18 == 2) {
            f10 = i17 * 4;
            i10 = i16 * 3;
        } else {
            if (i18 != 3) {
                if (i18 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i17 * 121;
                    i10 = i16 * 100;
                }
                Format formatB = Format.B(str, "video/mpeg2", null, -1, -1, i16, i17, -1.0f, Collections.singletonList(bArrCopyOf), -1, f11, null);
                j10 = 0;
                i11 = (bArrCopyOf[7] & 15) - 1;
                if (i11 >= 0) {
                    dArr = f86073q;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b10 = bArrCopyOf[aVar.f86093c + 9];
                        i12 = (b10 & 96) >> 5;
                        i13 = b10 & 31;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    }
                }
                return Pair.create(formatB, Long.valueOf(j10));
            }
            f10 = i17 * 16;
            i10 = i16 * 9;
        }
        f11 = f10 / i10;
        Format formatB2 = Format.B(str, "video/mpeg2", null, -1, -1, i16, i17, -1.0f, Collections.singletonList(bArrCopyOf), -1, f11, null);
        j10 = 0;
        i11 = (bArrCopyOf[7] & 15) - 1;
        if (i11 >= 0) {
            dArr = f86073q;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b11 = bArrCopyOf[aVar.f86093c + 9];
                i12 = (b11 & 96) >> 5;
                i13 = b11 & 31;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            }
        }
        return Pair.create(formatB2, Long.valueOf(j10));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // z3.m
    public void b(g5.t tVar) {
        int i10;
        int iC = tVar.c();
        int iD = tVar.d();
        byte[] bArr = tVar.f53154a;
        this.f86083j += (long) tVar.a();
        this.f86075b.c(tVar, tVar.a());
        while (true) {
            int iC2 = g5.q.c(bArr, iC, iD, this.f86080g);
            if (iC2 == iD) {
                break;
            }
            int i11 = iC2 + 3;
            int i12 = tVar.f53154a[i11] & 255;
            int i13 = iC2 - iC;
            if (!this.f86076c) {
                if (i13 > 0) {
                    this.f86081h.a(bArr, iC, iC2);
                }
                if (this.f86081h.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<Format, Long> pairA = a(this.f86081h, this.f86074a);
                    this.f86075b.a((Format) pairA.first);
                    this.f86077d = ((Long) pairA.second).longValue();
                    this.f86076c = true;
                }
            }
            if (this.f86078e != null) {
                if (i13 > 0) {
                    this.f86082i.a(bArr, iC, iC2);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f86082i.b(i10)) {
                    t tVar2 = this.f86082i;
                    this.f86079f.J(this.f86082i.f86212d, g5.q.k(tVar2.f86212d, tVar2.f86213e));
                    this.f86078e.a(this.f86087n, this.f86079f);
                }
                if (i12 == 178 && tVar.f53154a[iC2 + 2] == 1) {
                    this.f86082i.e(i12);
                }
            }
            if (i12 == 0 || i12 == 179) {
                int i14 = iD - iC2;
                if (this.f86084k && this.f86089p && this.f86076c) {
                    this.f86075b.d(this.f86087n, this.f86088o ? 1 : 0, ((int) (this.f86083j - this.f86086m)) - i14, i14, null);
                }
                boolean z10 = this.f86084k;
                if (!z10 || this.f86089p) {
                    this.f86086m = this.f86083j - ((long) i14);
                    long j10 = this.f86085l;
                    if (j10 == -9223372036854775807L) {
                        j10 = z10 ? this.f86087n + this.f86077d : 0L;
                    }
                    this.f86087n = j10;
                    this.f86088o = false;
                    this.f86085l = -9223372036854775807L;
                    this.f86084k = true;
                }
                this.f86089p = i12 == 0;
            } else if (i12 == 184) {
                this.f86088o = true;
            }
            iC = i11;
        }
        if (!this.f86076c) {
            this.f86081h.a(bArr, iC, iD);
        }
        if (this.f86078e != null) {
            this.f86082i.a(bArr, iC, iD);
        }
    }

    @Override // z3.m
    public void packetStarted(long j10, int i10) {
        this.f86085l = j10;
    }

    @Override // z3.m
    public void seek() {
        g5.q.a(this.f86080g);
        this.f86081h.c();
        if (this.f86078e != null) {
            this.f86082i.d();
        }
        this.f86083j = 0L;
        this.f86084k = false;
    }

    @Override // z3.m
    public void c(q3.i iVar, h0.d dVar) {
        dVar.a();
        this.f86074a = dVar.b();
        this.f86075b = iVar.track(dVar.c(), 2);
        j0 j0Var = this.f86078e;
        if (j0Var != null) {
            j0Var.b(iVar, dVar);
        }
    }
}
