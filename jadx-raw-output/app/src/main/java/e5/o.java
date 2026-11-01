package e5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: StatsDataSource.java */
/* JADX INFO: loaded from: classes10.dex */
public final class o implements com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f52425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f52426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f52427c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f52428d = Collections.emptyMap();

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(h hVar) throws IOException {
        this.f52427c = hVar.f52374a;
        this.f52428d = Collections.emptyMap();
        long jA = this.f52425a.a(hVar);
        this.f52427c = (Uri) g5.a.e(getUri());
        this.f52428d = getResponseHeaders();
        return jA;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void b(q qVar) {
        this.f52425a.b(qVar);
    }

    public long c() {
        return this.f52426b;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        this.f52425a.close();
    }

    public Uri d() {
        return this.f52427c;
    }

    public Map<String, List<String>> e() {
        return this.f52428d;
    }

    public void f() {
        this.f52426b = 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        return this.f52425a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f52425a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f52425a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f52426b += (long) i12;
        }
        return i12;
    }

    public o(com.google.android.exoplayer2.upstream.a aVar) {
        this.f52425a = (com.google.android.exoplayer2.upstream.a) g5.a.e(aVar);
    }
}
