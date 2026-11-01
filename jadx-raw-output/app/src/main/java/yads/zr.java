package yads;

import com.ironsource.C3426d4;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public abstract class zr implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f85571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f85573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f85574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f85575g;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zr zrVar = (zr) obj;
        if (!this.f85570b.equals(zrVar.f85570b)) {
            return this.f85570b.compareTo(zrVar.f85570b);
        }
        long j10 = this.f85571c - zrVar.f85571c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        return C3426d4.j.f28586d + this.f85571c + ", " + this.f85572d + C3426d4.j.f28588e;
    }

    public zr(String str, long j10, long j11, long j12, File file) {
        boolean z10;
        this.f85570b = str;
        this.f85571c = j10;
        this.f85572d = j11;
        if (file != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f85573e = z10;
        this.f85574f = file;
        this.f85575g = j12;
    }
}
