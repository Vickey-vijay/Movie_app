package e5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: TeeDataSource.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p implements com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f52429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f52430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f52432d;

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        try {
            this.f52429a.close();
        } finally {
            if (this.f52431c) {
                this.f52431c = false;
                this.f52430b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws IOException {
        long jA = this.f52429a.a(hVar);
        this.f52432d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (hVar.f52380g == -1 && jA != -1) {
            hVar = hVar.f(0L, jA);
        }
        this.f52431c = true;
        this.f52430b.a(hVar);
        return this.f52432d;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void b(q qVar) {
        this.f52429a.b(qVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        return this.f52429a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f52429a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f52432d == 0) {
            return -1;
        }
        int i12 = this.f52429a.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f52430b.write(bArr, i10, i12);
            long j10 = this.f52432d;
            if (j10 != -1) {
                this.f52432d = j10 - ((long) i12);
            }
        }
        return i12;
    }

    public p(com.google.android.exoplayer2.upstream.a aVar, f fVar) {
        this.f52429a = (com.google.android.exoplayer2.upstream.a) g5.a.e(aVar);
        this.f52430b = (f) g5.a.e(fVar);
    }
}
