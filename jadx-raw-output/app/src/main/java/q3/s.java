package q3;

import androidx.annotation.Nullable;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: SeekMap.java */
/* JADX INFO: loaded from: classes4.dex */
public interface s {

    /* JADX INFO: compiled from: SeekMap.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f66478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t f66479b;

        public a(t tVar) {
            this(tVar, tVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f66478a.equals(aVar.f66478a) && this.f66479b.equals(aVar.f66479b);
        }

        public a(t tVar, t tVar2) {
            this.f66478a = (t) g5.a.e(tVar);
            this.f66479b = (t) g5.a.e(tVar2);
        }

        public int hashCode() {
            return (this.f66478a.hashCode() * 31) + this.f66479b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C3426d4.j.f28586d);
            sb2.append(this.f66478a);
            if (this.f66478a.equals(this.f66479b)) {
                str = "";
            } else {
                str = ", " + this.f66479b;
            }
            sb2.append(str);
            sb2.append(C3426d4.j.f28588e);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: SeekMap.java */
    public static class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f66480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f66481b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // q3.s
        public boolean isSeekable() {
            return false;
        }

        public b(long j10, long j11) {
            this.f66480a = j10;
            this.f66481b = new a(j11 == 0 ? t.f66482c : new t(0L, j11));
        }

        @Override // q3.s
        public long getDurationUs() {
            return this.f66480a;
        }

        @Override // q3.s
        public a getSeekPoints(long j10) {
            return this.f66481b;
        }
    }

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
