package o4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import g5.k0;
import java.util.List;

/* JADX INFO: compiled from: SegmentBase.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final h f65051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f65052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f65053c;

    /* JADX INFO: compiled from: SegmentBase.java */
    public static abstract class a extends j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f65054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f65055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final List<d> f65056f;

        public abstract int d(long j10);

        public abstract h h(i iVar, long j10);

        public long c() {
            return this.f65054d;
        }

        public final long e(long j10, long j11) {
            List<d> list = this.f65056f;
            if (list != null) {
                return (list.get((int) (j10 - this.f65054d)).f65062b * 1000000) / this.f65052b;
            }
            int iD = d(j11);
            return (iD == -1 || j10 != (c() + ((long) iD)) - 1) ? (this.f65055e * 1000000) / this.f65052b : j11 - g(j10);
        }

        public final long g(long j10) {
            List<d> list = this.f65056f;
            return k0.y0(list != null ? list.get((int) (j10 - this.f65054d)).f65061a - this.f65053c : (j10 - this.f65054d) * this.f65055e, 1000000L, this.f65052b);
        }

        public boolean i() {
            return this.f65056f != null;
        }

        public a(@Nullable h hVar, long j10, long j11, long j12, long j13, @Nullable List<d> list) {
            super(hVar, j10, j11);
            this.f65054d = j12;
            this.f65055e = j13;
            this.f65056f = list;
        }

        public long f(long j10, long j11) {
            long jC = c();
            long jD = d(j11);
            if (jD == 0) {
                return jC;
            }
            if (this.f65056f == null) {
                long j12 = this.f65054d + (j10 / ((this.f65055e * 1000000) / this.f65052b));
                if (j12 >= jC) {
                    if (jD == -1) {
                        return j12;
                    }
                    return Math.min(j12, (jC + jD) - 1);
                }
                return jC;
            }
            long j13 = (jD + jC) - 1;
            long j14 = jC;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long jG = g(j15);
                if (jG < j10) {
                    j14 = j15 + 1;
                } else if (jG > j10) {
                    j13 = j15 - 1;
                } else {
                    return j15;
                }
            }
            if (j14 == jC) {
                return j14;
            }
            return j13;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class b extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final List<h> f65057g;

        @Override // o4.j.a
        public boolean i() {
            return true;
        }

        @Override // o4.j.a
        public int d(long j10) {
            return this.f65057g.size();
        }

        @Override // o4.j.a
        public h h(i iVar, long j10) {
            return this.f65057g.get((int) (j10 - this.f65054d));
        }

        public b(h hVar, long j10, long j11, long j12, long j13, @Nullable List<d> list, @Nullable List<h> list2) {
            super(hVar, j10, j11, j12, j13, list);
            this.f65057g = list2;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class c extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final l f65058g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final l f65059h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f65060i;

        public c(h hVar, long j10, long j11, long j12, long j13, long j14, @Nullable List<d> list, @Nullable l lVar, @Nullable l lVar2) {
            super(hVar, j10, j11, j12, j14, list);
            this.f65058g = lVar;
            this.f65059h = lVar2;
            this.f65060i = j13;
        }

        @Override // o4.j.a
        public h h(i iVar, long j10) {
            List<d> list = this.f65056f;
            long j11 = list != null ? list.get((int) (j10 - this.f65054d)).f65061a : (j10 - this.f65054d) * this.f65055e;
            l lVar = this.f65059h;
            Format format = iVar.f65040b;
            return new h(lVar.a(format.f18962b, j10, format.f18966f, j11), 0L, -1L);
        }

        @Override // o4.j
        @Nullable
        public h a(i iVar) {
            l lVar = this.f65058g;
            if (lVar == null) {
                return super.a(iVar);
            }
            Format format = iVar.f65040b;
            return new h(lVar.a(format.f18962b, 0L, format.f18966f, 0L), 0L, -1L);
        }

        @Override // o4.j.a
        public int d(long j10) {
            List<d> list = this.f65056f;
            if (list != null) {
                return list.size();
            }
            long j11 = this.f65060i;
            if (j11 != -1) {
                return (int) ((j11 - this.f65054d) + 1);
            }
            if (j10 != -9223372036854775807L) {
                return (int) k0.l(j10, (this.f65055e * 1000000) / this.f65052b);
            }
            return -1;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f65061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f65062b;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f65061a == dVar.f65061a && this.f65062b == dVar.f65062b;
        }

        public int hashCode() {
            return (((int) this.f65061a) * 31) + ((int) this.f65062b);
        }

        public d(long j10, long j11) {
            this.f65061a = j10;
            this.f65062b = j11;
        }
    }

    /* JADX INFO: compiled from: SegmentBase.java */
    public static class e extends j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f65063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f65064e;

        public e(@Nullable h hVar, long j10, long j11, long j12, long j13) {
            super(hVar, j10, j11);
            this.f65063d = j12;
            this.f65064e = j13;
        }

        @Nullable
        public h c() {
            long j10 = this.f65064e;
            if (j10 <= 0) {
                return null;
            }
            return new h(null, this.f65063d, j10);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }

    @Nullable
    public h a(i iVar) {
        return this.f65051a;
    }

    public long b() {
        return k0.y0(this.f65053c, 1000000L, this.f65052b);
    }

    public j(@Nullable h hVar, long j10, long j11) {
        this.f65051a = hVar;
        this.f65052b = j10;
        this.f65053c = j11;
    }
}
