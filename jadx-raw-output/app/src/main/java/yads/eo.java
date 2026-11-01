package yads;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes11.dex */
public abstract class eo implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f77149b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f77150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u30 f77151d;

    public final void e() {
        for (int i10 = 0; i10 < this.f77150c; i10++) {
            ((r83) this.f77149b.get(i10)).getClass();
        }
    }

    public final void b(u30 u30Var) {
        this.f77151d = u30Var;
        for (int i10 = 0; i10 < this.f77150c; i10++) {
            r83 r83Var = (r83) this.f77149b.get(i10);
            boolean z10 = this.f77148a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                sm2 sm2Var = dc0.f76611n;
                if (z10 && (u30Var.f83349i & 8) != 8) {
                    if (dc0Var.f76623f == 0) {
                        ((f53) dc0Var.f76621d).getClass();
                        dc0Var.f76624g = SystemClock.elapsedRealtime();
                    }
                    dc0Var.f76623f++;
                }
            }
        }
    }

    public final void c(int i10) {
        u30 u30Var = this.f77151d;
        int i11 = ib3.f78556a;
        for (int i12 = 0; i12 < this.f77150c; i12++) {
            r83 r83Var = (r83) this.f77149b.get(i12);
            boolean z10 = this.f77148a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                sm2 sm2Var = dc0.f76611n;
                if (z10 && (u30Var.f83349i & 8) != 8) {
                    dc0Var.f76625h += (long) i10;
                }
            }
        }
    }

    public final void d() {
        a13 a13Var;
        float f10;
        long j10;
        u30 u30Var = this.f77151d;
        int i10 = ib3.f78556a;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f77150c) {
            r83 r83Var = (r83) this.f77149b.get(i12);
            boolean z10 = this.f77148a;
            dc0 dc0Var = (dc0) r83Var;
            synchronized (dc0Var) {
                sm2 sm2Var = dc0.f76611n;
                if (!z10 || (u30Var.f83349i & 8) == 8) {
                    i12 = i12;
                } else {
                    if (dc0Var.f76623f <= 0) {
                        throw new IllegalStateException();
                    }
                    ((f53) dc0Var.f76621d).getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int i13 = (int) (jElapsedRealtime - dc0Var.f76624g);
                    dc0Var.f76627j += (long) i13;
                    long j11 = dc0Var.f76628k;
                    long j12 = dc0Var.f76625h;
                    dc0Var.f76628k = j11 + j12;
                    if (i13 > 0) {
                        float f11 = (j12 * 8000.0f) / i13;
                        b13 b13Var = dc0Var.f76620c;
                        int iSqrt = (int) Math.sqrt(j12);
                        if (b13Var.f75692d != 1) {
                            Collections.sort(b13Var.f75690b, b13.f75687h);
                            b13Var.f75692d = 1;
                        }
                        int i14 = b13Var.f75695g;
                        if (i14 > 0) {
                            a13[] a13VarArr = b13Var.f75691c;
                            int i15 = i14 - 1;
                            b13Var.f75695g = i15;
                            a13Var = a13VarArr[i15];
                        } else {
                            a13Var = new a13();
                        }
                        int i16 = b13Var.f75693e;
                        b13Var.f75693e = i16 + 1;
                        a13Var.f75366a = i16;
                        a13Var.f75367b = iSqrt;
                        a13Var.f75368c = f11;
                        b13Var.f75690b.add(a13Var);
                        b13Var.f75694f += iSqrt;
                        while (true) {
                            int i17 = b13Var.f75694f;
                            int i18 = b13Var.f75689a;
                            if (i17 <= i18) {
                                break;
                            }
                            int i19 = i17 - i18;
                            a13 a13Var2 = (a13) b13Var.f75690b.get(i11);
                            int i20 = a13Var2.f75367b;
                            if (i20 <= i19) {
                                b13Var.f75694f -= i20;
                                b13Var.f75690b.remove(i11);
                                int i21 = b13Var.f75695g;
                                if (i21 < 5) {
                                    a13[] a13VarArr2 = b13Var.f75691c;
                                    b13Var.f75695g = i21 + 1;
                                    a13VarArr2[i21] = a13Var2;
                                }
                            } else {
                                a13Var2.f75367b = i20 - i19;
                                b13Var.f75694f -= i19;
                            }
                        }
                        if (dc0Var.f76627j >= 2000 || dc0Var.f76628k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                            b13 b13Var2 = dc0Var.f76620c;
                            if (b13Var2.f75692d != 0) {
                                Collections.sort(b13Var2.f75690b, b13.f75688i);
                                b13Var2.f75692d = i11;
                            }
                            float f12 = 0.5f * b13Var2.f75694f;
                            int i22 = i11;
                            int i23 = i22;
                            while (true) {
                                if (i22 >= b13Var2.f75690b.size()) {
                                    if (!b13Var2.f75690b.isEmpty()) {
                                        ArrayList arrayList = b13Var2.f75690b;
                                        f10 = ((a13) arrayList.get(arrayList.size() - 1)).f75368c;
                                        break;
                                    } else {
                                        f10 = Float.NaN;
                                        break;
                                    }
                                }
                                a13 a13Var3 = (a13) b13Var2.f75690b.get(i22);
                                i23 += a13Var3.f75367b;
                                if (i23 >= f12) {
                                    f10 = a13Var3.f75368c;
                                    break;
                                }
                                i22++;
                            }
                            dc0Var.f76629l = (long) f10;
                        }
                        long j13 = dc0Var.f76625h;
                        long j14 = dc0Var.f76629l;
                        if (i13 == 0 && j13 == 0 && j14 == dc0Var.f76630m) {
                            j10 = 0;
                        } else {
                            dc0Var.f76630m = j14;
                            j10 = 0;
                            dc0Var.f76619b.a(i13, j13, j14);
                        }
                        dc0Var.f76624g = jElapsedRealtime;
                        dc0Var.f76625h = j10;
                    } else {
                        i12 = i12;
                    }
                    dc0Var.f76623f--;
                }
            }
            i12++;
            i11 = 0;
        }
        this.f77151d = null;
    }

    public eo(boolean z10) {
        this.f77148a = z10;
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        if (!this.f77149b.contains(r83Var)) {
            this.f77149b.add(r83Var);
            this.f77150c++;
        }
    }
}
