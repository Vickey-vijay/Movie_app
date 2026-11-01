package q3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes4.dex */
public interface u {

    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f66486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f66487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f66488d;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f66485a == aVar.f66485a && this.f66487c == aVar.f66487c && this.f66488d == aVar.f66488d && Arrays.equals(this.f66486b, aVar.f66486b);
        }

        public int hashCode() {
            return (((((this.f66485a * 31) + Arrays.hashCode(this.f66486b)) * 31) + this.f66487c) * 31) + this.f66488d;
        }

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f66485a = i10;
            this.f66486b = bArr;
            this.f66487c = i11;
            this.f66488d = i12;
        }
    }

    void a(Format format);

    int b(h hVar, int i10, boolean z10) throws InterruptedException, IOException;

    void c(g5.t tVar, int i10);

    void d(long j10, int i10, int i11, int i12, @Nullable a aVar);
}
