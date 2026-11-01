package q3;

import androidx.annotation.Nullable;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f66482c = new t(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66484b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f66483a == tVar.f66483a && this.f66484b == tVar.f66484b;
    }

    public int hashCode() {
        return (((int) this.f66483a) * 31) + ((int) this.f66484b);
    }

    public String toString() {
        return "[timeUs=" + this.f66483a + ", position=" + this.f66484b + C3426d4.j.f28588e;
    }

    public t(long j10, long j11) {
        this.f66483a = j10;
        this.f66484b = j11;
    }
}
