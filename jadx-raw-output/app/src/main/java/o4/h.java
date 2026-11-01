package o4;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import g5.i0;

/* JADX INFO: compiled from: RangedUri.java */
/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f65035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f65036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f65038d;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f65035a == hVar.f65035a && this.f65036b == hVar.f65036b && this.f65037c.equals(hVar.f65037c);
    }

    public Uri b(String str) {
        return i0.d(str, this.f65037c);
    }

    public String c(String str) {
        return i0.c(str, this.f65037c);
    }

    public int hashCode() {
        if (this.f65038d == 0) {
            this.f65038d = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.f65035a)) * 31) + ((int) this.f65036b)) * 31) + this.f65037c.hashCode();
        }
        return this.f65038d;
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.f65037c + ", start=" + this.f65035a + ", length=" + this.f65036b + ")";
    }

    public h(@Nullable String str, long j10, long j11) {
        this.f65037c = str == null ? "" : str;
        this.f65035a = j10;
        this.f65036b = j11;
    }

    @Nullable
    public h a(@Nullable h hVar, String str) {
        String strC = c(str);
        if (hVar != null && strC.equals(hVar.c(str))) {
            long j10 = this.f65036b;
            long j11 = -1;
            if (j10 != -1) {
                long j12 = this.f65035a;
                if (j12 + j10 == hVar.f65035a) {
                    long j13 = hVar.f65036b;
                    if (j13 != -1) {
                        j11 = j10 + j13;
                    }
                    return new h(strC, j12, j11);
                }
            }
            long j14 = hVar.f65036b;
            if (j14 != -1) {
                long j15 = hVar.f65035a;
                if (j15 + j14 == this.f65035a) {
                    if (j10 != -1) {
                        j11 = j14 + j10;
                    }
                    return new h(strC, j15, j11);
                }
            }
        }
        return null;
    }
}
