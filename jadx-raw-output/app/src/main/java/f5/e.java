package f5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: CacheSpan.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements Comparable<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f52845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f52847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final File f52848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f52849g;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull e eVar) {
        if (!this.f52844b.equals(eVar.f52844b)) {
            return this.f52844b.compareTo(eVar.f52844b);
        }
        long j10 = this.f52845c - eVar.f52845c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f52847e;
    }

    public boolean c() {
        return this.f52846d == -1;
    }

    public e(String str, long j10, long j11, long j12, @Nullable File file) {
        boolean z10;
        this.f52844b = str;
        this.f52845c = j10;
        this.f52846d = j11;
        if (file != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f52847e = z10;
        this.f52848f = file;
        this.f52849g = j12;
    }
}
