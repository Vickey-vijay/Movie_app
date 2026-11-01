package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr f75940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nr f75941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u30 f75942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f75943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f75944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final as f75945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f75946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f75947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f75948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f75949j;

    /* JADX WARN: Code duplicated, block: B:100:0x01bc A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ca A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01de  */
    /* JADX WARN: Code duplicated, block: B:126:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x0154 A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x015a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:75:0x0163 A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0175 A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0179 A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x018f A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b3 A[Catch: IOException -> 0x01af, TryCatch #2 {IOException -> 0x01af, blocks: (B:67:0x014d, B:70:0x0154, B:76:0x0169, B:75:0x0163, B:80:0x0175, B:82:0x0179, B:84:0x0185, B:86:0x018f, B:90:0x01a0, B:89:0x019a, B:91:0x01a7, B:92:0x01a9, B:93:0x01ae, B:97:0x01b3, B:100:0x01bc, B:106:0x01d0, B:105:0x01ca), top: B:120:0x014d }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01bb  */
    public final void a() throws IOException {
        boolean z10;
        String str;
        long jA;
        int i10;
        int i11;
        long j10;
        long j11;
        as asVar;
        long j12;
        long j13;
        long j14;
        as asVar2;
        long j15;
        long j16;
        long j17;
        as asVar3;
        long j18;
        if (this.f75949j) {
            throw new InterruptedIOException();
        }
        nr nrVar = this.f75941b;
        String str2 = this.f75943d;
        u30 u30Var = this.f75942c;
        this.f75948i = ((vy2) nrVar).a(str2, u30Var.f83346f, u30Var.f83347g);
        u30 u30Var2 = this.f75942c;
        long j19 = u30Var2.f83347g;
        long j20 = -1;
        if (j19 != -1) {
            this.f75947h = u30Var2.f83346f + j19;
        } else {
            long jA2 = qz.a(((vy2) this.f75941b).b(this.f75943d));
            if (jA2 == -1) {
                jA2 = -1;
            }
            this.f75947h = jA2;
        }
        as asVar4 = this.f75945f;
        if (asVar4 != null) {
            long j21 = this.f75947h;
            asVar4.a(j21 == -1 ? -1L : j21 - this.f75942c.f83346f, this.f75948i, 0L);
        }
        while (true) {
            long j22 = this.f75947h;
            if (j22 != j20 && this.f75946g >= j22) {
                return;
            }
            if (this.f75949j) {
                throw new InterruptedIOException();
            }
            long j23 = this.f75947h;
            long jB = ((vy2) this.f75941b).b(this.f75943d, this.f75946g, j23 == j20 ? Long.MAX_VALUE : j23 - this.f75946g);
            if (jB > 0) {
                this.f75946g += jB;
            } else {
                long j24 = -jB;
                long j25 = j24 == Long.MAX_VALUE ? j20 : j24;
                long j26 = this.f75946g;
                boolean z11 = true;
                boolean z12 = j26 + j25 == this.f75947h || j25 == j20;
                if (j25 != j20) {
                    u30 u30Var3 = this.f75942c;
                    u30Var3.getClass();
                    Uri uri = u30Var3.f83341a;
                    long j27 = u30Var3.f83342b;
                    int i12 = u30Var3.f83343c;
                    byte[] bArr = u30Var3.f83344d;
                    Map map = u30Var3.f83345e;
                    String str3 = u30Var3.f83348h;
                    int i13 = u30Var3.f83349i;
                    Object obj = u30Var3.f83350j;
                    ni.a(uri, "The uri must be set.");
                    z10 = z12;
                    str = "The uri must be set.";
                    try {
                        jA = this.f75940a.a(new u30(uri, j27, i12, bArr, map, j26, j25, str3, i13, obj));
                    } catch (IOException unused) {
                        s30.a(this.f75940a);
                        jA = -1;
                        z11 = false;
                    }
                    if (!z11) {
                        if (!this.f75949j) {
                            throw new InterruptedIOException();
                        }
                        u30 u30Var4 = this.f75942c;
                        u30Var4.getClass();
                        Uri uri2 = u30Var4.f83341a;
                        long j28 = u30Var4.f83342b;
                        int i14 = u30Var4.f83343c;
                        byte[] bArr2 = u30Var4.f83344d;
                        Map map2 = u30Var4.f83345e;
                        String str4 = u30Var4.f83348h;
                        int i15 = u30Var4.f83349i;
                        Object obj2 = u30Var4.f83350j;
                        ni.a(uri2, str);
                        try {
                            jA = this.f75940a.a(new u30(uri2, j28, i14, bArr2, map2, j26, -1L, str4, i15, obj2));
                        } catch (IOException e10) {
                            s30.a(this.f75940a);
                            throw e10;
                        }
                    }
                    if (z10 && jA != -1) {
                        j17 = jA + j26;
                        try {
                            if (this.f75947h == j17) {
                                this.f75947h = j17;
                                asVar3 = this.f75945f;
                                if (asVar3 != null) {
                                    if (j17 == -1) {
                                        j18 = -1;
                                    } else {
                                        j18 = j17 - this.f75942c.f83346f;
                                    }
                                    asVar3.a(j18, this.f75948i, 0L);
                                }
                            }
                        } catch (IOException e11) {
                            s30.a(this.f75940a);
                            throw e11;
                        }
                    }
                    i10 = 0;
                    i11 = 0;
                    while (i11 != -1) {
                        if (!this.f75949j) {
                            throw new InterruptedIOException();
                        }
                        rr rrVar = this.f75940a;
                        byte[] bArr3 = this.f75944e;
                        i11 = rrVar.read(bArr3, 0, bArr3.length);
                        if (i11 != -1) {
                            j13 = i11;
                            j14 = this.f75948i + j13;
                            this.f75948i = j14;
                            asVar2 = this.f75945f;
                            if (asVar2 != null) {
                                j15 = this.f75947h;
                                if (j15 == -1) {
                                    j16 = -1;
                                } else {
                                    j16 = j15 - this.f75942c.f83346f;
                                }
                                asVar2.a(j16, j14, j13);
                            }
                            i10 += i11;
                        }
                    }
                    if (z10) {
                        j11 = ((long) i10) + j26;
                        if (this.f75947h == j11) {
                            this.f75947h = j11;
                            asVar = this.f75945f;
                            if (asVar != null) {
                                j10 = -1;
                                if (j11 == -1) {
                                    j12 = -1;
                                } else {
                                    j12 = j11 - this.f75942c.f83346f;
                                }
                                asVar.a(j12, this.f75948i, 0L);
                            }
                        }
                        j10 = -1;
                    } else {
                        j10 = -1;
                    }
                    this.f75940a.close();
                    this.f75946g = j26 + ((long) i10);
                    j20 = j10;
                } else {
                    z10 = z12;
                    str = "The uri must be set.";
                }
                jA = -1;
                z11 = false;
                if (!z11) {
                    if (!this.f75949j) {
                        throw new InterruptedIOException();
                    }
                    u30 u30Var5 = this.f75942c;
                    u30Var5.getClass();
                    Uri uri3 = u30Var5.f83341a;
                    long j29 = u30Var5.f83342b;
                    int i16 = u30Var5.f83343c;
                    byte[] bArr4 = u30Var5.f83344d;
                    Map map3 = u30Var5.f83345e;
                    String str5 = u30Var5.f83348h;
                    int i17 = u30Var5.f83349i;
                    Object obj3 = u30Var5.f83350j;
                    ni.a(uri3, str);
                    jA = this.f75940a.a(new u30(uri3, j29, i16, bArr4, map3, j26, -1L, str5, i17, obj3));
                }
                if (z10) {
                    j17 = jA + j26;
                    if (this.f75947h == j17) {
                        this.f75947h = j17;
                        asVar3 = this.f75945f;
                        if (asVar3 != null) {
                            if (j17 == -1) {
                                j18 = -1;
                            } else {
                                j18 = j17 - this.f75942c.f83346f;
                            }
                            asVar3.a(j18, this.f75948i, 0L);
                        }
                    }
                }
                i10 = 0;
                i11 = 0;
                while (i11 != -1) {
                    if (!this.f75949j) {
                        throw new InterruptedIOException();
                    }
                    rr rrVar2 = this.f75940a;
                    byte[] bArr5 = this.f75944e;
                    i11 = rrVar2.read(bArr5, 0, bArr5.length);
                    if (i11 != -1) {
                        j13 = i11;
                        j14 = this.f75948i + j13;
                        this.f75948i = j14;
                        asVar2 = this.f75945f;
                        if (asVar2 != null) {
                            j15 = this.f75947h;
                            if (j15 == -1) {
                                j16 = -1;
                            } else {
                                j16 = j15 - this.f75942c.f83346f;
                            }
                            asVar2.a(j16, j14, j13);
                        }
                        i10 += i11;
                    }
                }
                if (z10) {
                    j11 = ((long) i10) + j26;
                    if (this.f75947h == j11) {
                        this.f75947h = j11;
                        asVar = this.f75945f;
                        if (asVar != null) {
                            j10 = -1;
                            if (j11 == -1) {
                                j12 = -1;
                            } else {
                                j12 = j11 - this.f75942c.f83346f;
                            }
                            asVar.a(j12, this.f75948i, 0L);
                        }
                    }
                    j10 = -1;
                } else {
                    j10 = -1;
                }
                this.f75940a.close();
                this.f75946g = j26 + ((long) i10);
                j20 = j10;
            }
        }
    }

    public bs(rr rrVar, u30 u30Var, byte[] bArr, as asVar) {
        this.f75940a = rrVar;
        this.f75941b = rrVar.e();
        this.f75942c = u30Var;
        this.f75944e = bArr == null ? new byte[131072] : bArr;
        this.f75945f = asVar;
        this.f75943d = rrVar.f().a(u30Var);
        this.f75946g = u30Var.f83346f;
    }
}
