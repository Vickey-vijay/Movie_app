package yads;

import android.util.Pair;
import java.io.EOFException;
import java.io.InterruptedIOException;
import yads.ln3;
import yads.mq0;

/* JADX INFO: loaded from: classes3.dex */
public final class ln3 implements mq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pq0 f79859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f79860b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jn3 f79863e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f79861c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f79862d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79864f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f79865g = -1;

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f79859a = pq0Var;
        this.f79860b = pq0Var.a(0, 1);
        pq0Var.a();
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.f6
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return ln3.a();
            }
        };
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.f79861c = j10 == 0 ? 0 : 4;
        jn3 jn3Var = this.f79863e;
        if (jn3Var != null) {
            jn3Var.a(j11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x018a  */
    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        byte[] bArr;
        int iB;
        if (this.f79860b != null) {
            int i10 = ib3.f78556a;
            int i11 = this.f79861c;
            if (i11 == 0) {
                ld0 ld0Var = (ld0) nq0Var;
                if (ld0Var.f79757d == 0) {
                    int i12 = this.f79864f;
                    if (i12 != -1) {
                        ld0Var.a(i12);
                        this.f79861c = 4;
                    } else if (on3.a(ld0Var)) {
                        long j10 = ld0Var.f79757d;
                        ld0Var.a((int) ((((long) ld0Var.f79759f) + j10) - j10));
                        this.f79861c = 1;
                    } else {
                        throw new ob2("Unsupported or unrecognized wav file type.", null, true, 1);
                    }
                    return 0;
                }
                throw new IllegalStateException();
            }
            long jE = -1;
            if (i11 == 1) {
                jb2 jb2Var = new jb2(8);
                ld0 ld0Var2 = (ld0) nq0Var;
                nn3 nn3VarA = nn3.a(ld0Var2, jb2Var);
                if (nn3VarA.f80715a != 1685272116) {
                    ld0Var2.f79759f = 0;
                } else {
                    ld0Var2.a(false, 8);
                    jb2Var.e(0);
                    ld0Var2.b(jb2Var.f78966a, 0, 8, false);
                    jE = jb2Var.e();
                    ld0Var2.a(((int) nn3VarA.f80716b) + 8);
                }
                this.f79862d = jE;
                this.f79861c = 2;
                return 0;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        long j11 = this.f79865g;
                        if (j11 != -1) {
                            ld0 ld0Var3 = (ld0) nq0Var;
                            long j12 = j11 - ld0Var3.f79757d;
                            jn3 jn3Var = this.f79863e;
                            jn3Var.getClass();
                            return jn3Var.a(ld0Var3, j12) ? -1 : 0;
                        }
                        throw new IllegalStateException();
                    }
                    throw new IllegalStateException();
                }
                ld0 ld0Var4 = (ld0) nq0Var;
                ld0Var4.f79759f = 0;
                nn3 nn3VarA2 = on3.a(1684108385, ld0Var4, new jb2(8));
                ld0Var4.a(8);
                Pair pairCreate = Pair.create(Long.valueOf(ld0Var4.f79757d), Long.valueOf(nn3VarA2.f80716b));
                this.f79864f = ((Long) pairCreate.first).intValue();
                long jLongValue = ((Long) pairCreate.second).longValue();
                long j13 = this.f79862d;
                if (j13 != -1 && jLongValue == 4294967295L) {
                    jLongValue = j13;
                }
                long j14 = ((long) this.f79864f) + jLongValue;
                this.f79865g = j14;
                long j15 = ld0Var4.f79756c;
                if (j15 != -1 && j14 > j15) {
                    ih1.d("WavExtractor", "Data exceeds input length: " + this.f79865g + ", " + j15);
                    this.f79865g = j15;
                }
                jn3 jn3Var2 = this.f79863e;
                jn3Var2.getClass();
                jn3Var2.a(this.f79864f, this.f79865g);
                this.f79861c = 4;
                return 0;
            }
            jb2 jb2Var2 = new jb2(16);
            ld0 ld0Var5 = (ld0) nq0Var;
            nn3 nn3VarA3 = on3.a(1718449184, ld0Var5, jb2Var2);
            if (nn3VarA3.f80716b >= 16) {
                ld0Var5.b(jb2Var2.f78966a, 0, 16, false);
                jb2Var2.e(0);
                int iH = jb2Var2.h();
                int iH2 = jb2Var2.h();
                int iD = jb2Var2.d();
                if (iD >= 0) {
                    int iD2 = jb2Var2.d();
                    if (iD2 >= 0) {
                        int iH3 = jb2Var2.h();
                        int iH4 = jb2Var2.h();
                        int i13 = ((int) nn3VarA3.f80716b) - 16;
                        if (i13 > 0) {
                            bArr = new byte[i13];
                            ld0Var5.b(bArr, 0, i13, false);
                        } else {
                            bArr = ib3.f78561f;
                        }
                        long j16 = ld0Var5.f79757d;
                        ld0Var5.a((int) ((((long) ld0Var5.f79759f) + j16) - j16));
                        mn3 mn3Var = new mn3(iH, iH2, iD, iH3, iH4, bArr);
                        if (iH == 17) {
                            this.f79863e = new in3(this.f79859a, this.f79860b, mn3Var);
                        } else if (iH == 6) {
                            this.f79863e = new kn3(this.f79859a, this.f79860b, mn3Var, "audio/g711-alaw", -1);
                        } else if (iH == 7) {
                            this.f79863e = new kn3(this.f79859a, this.f79860b, mn3Var, "audio/g711-mlaw", -1);
                        } else {
                            if (iH == 1) {
                                iB = ib3.b(iH4);
                            } else {
                                if (iH != 3) {
                                    if (iH == 65534) {
                                        iB = ib3.b(iH4);
                                    }
                                } else if (iH4 == 32) {
                                    iB = 4;
                                }
                                iB = 0;
                            }
                            if (iB != 0) {
                                this.f79863e = new kn3(this.f79859a, this.f79860b, mn3Var, "audio/raw", iB);
                            } else {
                                throw ob2.b("Unsupported WAV format type: " + iH);
                            }
                        }
                        this.f79861c = 3;
                        return 0;
                    }
                    throw new IllegalStateException(mg2.a("Top bit not zero: ", iD2));
                }
                throw new IllegalStateException(mg2.a("Top bit not zero: ", iD));
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) {
        return on3.a((ld0) nq0Var);
    }

    public static /* synthetic */ mq0[] a() {
        return new mq0[]{new ln3()};
    }
}
