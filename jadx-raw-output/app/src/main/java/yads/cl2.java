package yads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.cl2;
import yads.mq0;

/* JADX INFO: loaded from: classes10.dex */
public final class cl2 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y63 f76307a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f76311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f76312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f76313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f76314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zk2 f76315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public pq0 f76316j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f76317k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f76309c = new jb2(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f76308b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final al2 f76310d = new al2();

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f76316j = pq0Var;
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.p0
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return cl2.a();
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:106:0x029a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws EOFException, InterruptedIOException {
        ?? r15;
        long j10;
        long j11;
        long j12;
        ul0 f01Var;
        long j13;
        long j14;
        pq0 pq0Var = this.f76316j;
        if (pq0Var == null) {
            throw new IllegalStateException();
        }
        ld0 ld0Var = (ld0) nq0Var;
        long j15 = ld0Var.f79756c;
        if (j15 != -1) {
            al2 al2Var = this.f76310d;
            if (!al2Var.f75554c) {
                if (!al2Var.f75556e) {
                    int iMin = (int) Math.min(20000L, j15);
                    long j16 = j15 - ((long) iMin);
                    if (ld0Var.f79757d != j16) {
                        gg2Var.f77799a = j16;
                        return 1;
                    }
                    al2Var.f75553b.c(iMin);
                    ld0Var.f79759f = 0;
                    ld0Var.b(al2Var.f75553b.f78966a, 0, iMin, false);
                    jb2 jb2Var = al2Var.f75553b;
                    int i10 = jb2Var.f78967b;
                    int i11 = jb2Var.f78968c - 4;
                    while (true) {
                        if (i11 < i10) {
                            j14 = -9223372036854775807L;
                            break;
                        }
                        byte[] bArr = jb2Var.f78966a;
                        if (((bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8)) == 442) {
                            jb2Var.e(i11 + 4);
                            long jA = al2.a(jb2Var);
                            if (jA != -9223372036854775807L) {
                                j14 = jA;
                                break;
                            }
                        }
                        i11--;
                    }
                    al2Var.f75558g = j14;
                    al2Var.f75556e = true;
                } else if (al2Var.f75558g == -9223372036854775807L) {
                    al2Var.f75553b.a(ib3.f78561f);
                    al2Var.f75554c = true;
                    ld0Var.f79759f = 0;
                } else if (al2Var.f75555d) {
                    long j17 = al2Var.f75557f;
                    if (j17 == -9223372036854775807L) {
                        al2Var.f75553b.a(ib3.f78561f);
                        al2Var.f75554c = true;
                        ld0Var.f79759f = 0;
                    } else {
                        long jB = al2Var.f75552a.b(al2Var.f75558g) - al2Var.f75552a.b(j17);
                        al2Var.f75559h = jB;
                        if (jB < 0) {
                            ih1.d("PsDurationReader", "Invalid duration: " + al2Var.f75559h + ". Using TIME_UNSET instead.");
                            al2Var.f75559h = -9223372036854775807L;
                        }
                        al2Var.f75553b.a(ib3.f78561f);
                        al2Var.f75554c = true;
                        ld0Var.f79759f = 0;
                    }
                } else {
                    int iMin2 = (int) Math.min(20000L, j15);
                    long j18 = 0;
                    if (ld0Var.f79757d != j18) {
                        gg2Var.f77799a = j18;
                        return 1;
                    }
                    al2Var.f75553b.c(iMin2);
                    ld0Var.f79759f = 0;
                    ld0Var.b(al2Var.f75553b.f78966a, 0, iMin2, false);
                    jb2 jb2Var2 = al2Var.f75553b;
                    int i12 = jb2Var2.f78967b;
                    int i13 = jb2Var2.f78968c;
                    while (true) {
                        if (i12 >= i13 - 3) {
                            j13 = -9223372036854775807L;
                            break;
                        }
                        byte[] bArr2 = jb2Var2.f78966a;
                        int i14 = i12 + 1;
                        if (((bArr2[i12 + 3] & 255) | ((bArr2[i12] & 255) << 24) | ((bArr2[i14] & 255) << 16) | ((bArr2[i12 + 2] & 255) << 8)) == 442) {
                            jb2Var2.e(i12 + 4);
                            long jA2 = al2.a(jb2Var2);
                            if (jA2 != -9223372036854775807L) {
                                j13 = jA2;
                                break;
                            }
                        }
                        i12 = i14;
                    }
                    al2Var.f75557f = j13;
                    al2Var.f75555d = true;
                }
                return 0;
            }
        }
        if (this.f76317k) {
            r15 = 0;
            j10 = 0;
        } else {
            this.f76317k = true;
            al2 al2Var2 = this.f76310d;
            long j19 = al2Var2.f75559h;
            if (j19 != -9223372036854775807L) {
                j10 = 0;
                r15 = 0;
                zk2 zk2Var = new zk2(al2Var2.f75552a, j19, j15);
                this.f76315i = zk2Var;
                this.f76316j.a(zk2Var.f83130a);
            } else {
                j10 = 0;
                r15 = 0;
                pq0Var.a(new uw2(j19, 0L));
            }
        }
        zk2 zk2Var2 = this.f76315i;
        if (zk2Var2 != null && zk2Var2.f83132c != null) {
            return zk2Var2.a(ld0Var, gg2Var);
        }
        ld0Var.f79759f = r15;
        if (j15 != -1) {
            j12 = j15 - (ld0Var.f79757d + ((long) r15));
            j11 = -1;
        } else {
            j11 = -1;
            j12 = -1;
        }
        if ((j12 != j11 && j12 < 4) || !ld0Var.b(this.f76309c.f78966a, r15, 4, true)) {
            return -1;
        }
        this.f76309c.e(r15);
        int iB = this.f76309c.b();
        if (iB == 441) {
            return -1;
        }
        if (iB == 442) {
            ld0Var.b(this.f76309c.f78966a, r15, 10, r15);
            this.f76309c.e(9);
            ld0Var.a((this.f76309c.m() & 7) + 14);
            return r15;
        }
        if (iB == 443) {
            ld0Var.b(this.f76309c.f78966a, r15, 2, r15);
            this.f76309c.e(r15);
            ld0Var.a(this.f76309c.r() + 6);
            return r15;
        }
        if (((iB & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            ld0Var.a(1);
            return r15;
        }
        int i15 = iB & 255;
        bl2 bl2Var = (bl2) this.f76308b.get(i15);
        if (!this.f76311e) {
            if (bl2Var == null) {
                ul0 ul0Var = null;
                if (i15 == 189) {
                    f01Var = new g0(null);
                    this.f76312f = true;
                    this.f76314h = ld0Var.f79757d;
                } else if ((iB & 224) == 192) {
                    f01Var = new nv1(null);
                    this.f76312f = true;
                    this.f76314h = ld0Var.f79757d;
                } else if ((iB & 240) == 224) {
                    f01Var = new f01(null);
                    this.f76313g = true;
                    this.f76314h = ld0Var.f79757d;
                } else if (ul0Var != null) {
                    ul0Var.a(this.f76316j, new l93(Integer.MIN_VALUE, i15, 256));
                    bl2 bl2Var2 = new bl2(ul0Var, this.f76307a);
                    this.f76308b.put(i15, bl2Var2);
                    bl2Var = bl2Var2;
                }
                ul0Var = f01Var;
                if (ul0Var != null) {
                    ul0Var.a(this.f76316j, new l93(Integer.MIN_VALUE, i15, 256));
                    bl2 bl2Var3 = new bl2(ul0Var, this.f76307a);
                    this.f76308b.put(i15, bl2Var3);
                    bl2Var = bl2Var3;
                }
            }
            if (ld0Var.f79757d > ((this.f76312f && this.f76313g) ? this.f76314h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f76311e = true;
                this.f76316j.a();
            }
        }
        ld0Var.b(this.f76309c.f78966a, r15, 2, r15);
        this.f76309c.e(r15);
        int iR = this.f76309c.r() + 6;
        if (bl2Var == null) {
            ld0Var.a(iR);
        } else {
            this.f76309c.c(iR);
            ld0Var.a(this.f76309c.f78966a, r15, iR, r15);
            this.f76309c.e(6);
            jb2 jb2Var3 = this.f76309c;
            jb2Var3.a(bl2Var.f75880c.f78552a, r15, 3);
            bl2Var.f75880c.b(r15);
            bl2Var.f75880c.c(8);
            bl2Var.f75881d = bl2Var.f75880c.e();
            bl2Var.f75882e = bl2Var.f75880c.e();
            bl2Var.f75880c.c(6);
            jb2Var3.a(bl2Var.f75880c.f78552a, r15, bl2Var.f75880c.a(8));
            bl2Var.f75880c.b(r15);
            bl2Var.f75884g = j10;
            if (bl2Var.f75881d) {
                bl2Var.f75880c.c(4);
                long jA3 = ((long) bl2Var.f75880c.a(3)) << 30;
                bl2Var.f75880c.c(1);
                long jA4 = jA3 | ((long) (bl2Var.f75880c.a(15) << 15));
                bl2Var.f75880c.c(1);
                long jA5 = jA4 | ((long) bl2Var.f75880c.a(15));
                bl2Var.f75880c.c(1);
                if (!bl2Var.f75883f && bl2Var.f75882e) {
                    bl2Var.f75880c.c(4);
                    long jA6 = ((long) bl2Var.f75880c.a(3)) << 30;
                    bl2Var.f75880c.c(1);
                    long jA7 = jA6 | ((long) (bl2Var.f75880c.a(15) << 15));
                    bl2Var.f75880c.c(1);
                    long jA8 = jA7 | ((long) bl2Var.f75880c.a(15));
                    bl2Var.f75880c.c(1);
                    bl2Var.f75879b.b(jA8);
                    bl2Var.f75883f = true;
                }
                bl2Var.f75884g = bl2Var.f75879b.b(jA5);
            }
            bl2Var.f75878a.a(4, bl2Var.f75884g);
            bl2Var.f75878a.a(jb2Var3);
            bl2Var.f75878a.b();
            jb2 jb2Var4 = this.f76309c;
            jb2Var4.d(jb2Var4.f78966a.length);
        }
        return r15;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        long j12;
        y63 y63Var = this.f76307a;
        synchronized (y63Var) {
            j12 = y63Var.f84834b;
        }
        boolean z10 = j12 == -9223372036854775807L;
        if (!z10) {
            long jA = this.f76307a.a();
            if (jA != -9223372036854775807L && jA != 0 && jA != j11) {
                this.f76307a.c(j11);
            }
        } else if (z10) {
            this.f76307a.c(j11);
        }
        zk2 zk2Var = this.f76315i;
        if (zk2Var != null) {
            zk2Var.a(j11);
        }
        for (int i10 = 0; i10 < this.f76308b.size(); i10++) {
            bl2 bl2Var = (bl2) this.f76308b.valueAt(i10);
            bl2Var.f75883f = false;
            bl2Var.f75878a.a();
        }
    }

    public cl2(y63 y63Var) {
        this.f76307a = y63Var;
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        ld0 ld0Var = (ld0) nq0Var;
        ld0Var.b(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        ld0Var.a(false, bArr[13] & 7);
        ld0Var.b(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public static mq0[] a() {
        return new mq0[]{new cl2(new y63(0L))};
    }
}
