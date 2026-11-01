package yads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class me0 implements p92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o92 f80152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f80153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f80154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z33 f80155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f80157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f80158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f80159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f80160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f80161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f80162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f80163l;

    @Override // yads.p92
    public final vw2 a() {
        if (this.f80157f != 0) {
            return new le0(this);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    @Override // yads.p92
    public final long a(ld0 ld0Var) throws IOException {
        long jMax;
        long j10;
        int i10 = this.f80156e;
        if (i10 == 0) {
            long j11 = ld0Var.f79757d;
            this.f80158g = j11;
            this.f80156e = 1;
            long j12 = this.f80154c - 65307;
            if (j12 > j11) {
                return j12;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j13 = this.f80160i;
                long j14 = this.f80161j;
                if (j13 == j14) {
                    jMax = -1;
                    j10 = -1;
                } else {
                    long j15 = ld0Var.f79757d;
                    if (this.f80152a.a(ld0Var, j14)) {
                        this.f80152a.a(ld0Var, false);
                        ld0Var.f79759f = 0;
                        long j16 = this.f80159h;
                        o92 o92Var = this.f80152a;
                        long j17 = o92Var.f80977b;
                        long j18 = j16 - j17;
                        int i11 = o92Var.f80979d + o92Var.f80980e;
                        if (0 > j18 || j18 >= 72000) {
                            if (j18 < 0) {
                                this.f80161j = j15;
                                this.f80163l = j17;
                            } else {
                                this.f80160i = ld0Var.f79757d + ((long) i11);
                                this.f80162k = j17;
                            }
                            long j19 = this.f80161j;
                            long j20 = this.f80160i;
                            long j21 = j19 - j20;
                            if (j21 < 100000) {
                                this.f80161j = j20;
                                jMax = j20;
                            } else {
                                long j22 = ld0Var.f79757d - (((long) i11) * (j18 <= 0 ? 2L : 1L));
                                int i12 = ib3.f78556a;
                                jMax = Math.max(j20, Math.min(((j21 * j18) / (this.f80163l - this.f80162k)) + j22, j19 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                        j10 = -1;
                    } else {
                        jMax = this.f80160i;
                        if (jMax == j15) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j10 = -1;
                    }
                }
                if (jMax != j10) {
                    return jMax;
                }
                this.f80156e = 3;
            } else {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j10 = -1;
            }
            while (true) {
                this.f80152a.a(ld0Var, j10);
                this.f80152a.a(ld0Var, false);
                o92 o92Var2 = this.f80152a;
                if (o92Var2.f80977b > this.f80159h) {
                    ld0Var.f79759f = 0;
                    this.f80156e = 4;
                    return -(this.f80162k + 2);
                }
                ld0Var.a(o92Var2.f80979d + o92Var2.f80980e);
                this.f80160i = ld0Var.f79757d;
                this.f80162k = this.f80152a.f80977b;
                j10 = -1;
            }
        }
        o92 o92Var3 = this.f80152a;
        o92Var3.f80976a = 0;
        o92Var3.f80977b = 0L;
        o92Var3.f80978c = 0;
        o92Var3.f80979d = 0;
        o92Var3.f80980e = 0;
        if (!o92Var3.a(ld0Var, -1L)) {
            throw new EOFException();
        }
        this.f80152a.a(ld0Var, false);
        o92 o92Var4 = this.f80152a;
        ld0Var.a(o92Var4.f80979d + o92Var4.f80980e);
        long j23 = this.f80152a.f80977b;
        while (true) {
            o92 o92Var5 = this.f80152a;
            if ((o92Var5.f80976a & 4) == 4 || !o92Var5.a(ld0Var, -1L) || ld0Var.f79757d >= this.f80154c || !this.f80152a.a(ld0Var, true)) {
                break;
            }
            o92 o92Var6 = this.f80152a;
            try {
                ld0Var.a(o92Var6.f80979d + o92Var6.f80980e);
                j23 = this.f80152a.f80977b;
            } catch (EOFException unused) {
            }
        }
        this.f80157f = j23;
        this.f80156e = 4;
        return this.f80158g;
    }

    public me0(z33 z33Var, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        ni.a(z11);
        this.f80155d = z33Var;
        this.f80153b = j10;
        this.f80154c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f80156e = 0;
        } else {
            this.f80157f = j13;
            this.f80156e = 4;
        }
        this.f80152a = new o92();
    }

    @Override // yads.p92
    public final void a(long j10) {
        long j11 = this.f80157f - 1;
        int i10 = ib3.f78556a;
        this.f80159h = Math.max(0L, Math.min(j10, j11));
        this.f80156e = 2;
        this.f80160i = this.f80153b;
        this.f80161j = this.f80154c;
        this.f80162k = 0L;
        this.f80163l = this.f80157f;
    }
}
