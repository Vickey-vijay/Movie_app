package k4;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: IcyDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class n implements com.google.android.exoplayer2.upstream.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f62575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f62576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f62577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f62578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f62579e;

    /* JADX INFO: compiled from: IcyDataSource.java */
    public interface a {
        void a(g5.t tVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long a(e5.h hVar) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void b(e5.q qVar) {
        this.f62575a.b(qVar);
    }

    public final boolean c() throws IOException {
        if (this.f62575a.read(this.f62578d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f62578d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f62575a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f62577c.a(new g5.t(bArr, i10));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> getResponseHeaders() {
        return this.f62575a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    @Nullable
    public Uri getUri() {
        return this.f62575a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f62579e == 0) {
            if (!c()) {
                return -1;
            }
            this.f62579e = this.f62576b;
        }
        int i12 = this.f62575a.read(bArr, i10, Math.min(this.f62579e, i11));
        if (i12 != -1) {
            this.f62579e -= i12;
        }
        return i12;
    }

    public n(com.google.android.exoplayer2.upstream.a aVar, int i10, a aVar2) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.a(z10);
        this.f62575a = aVar;
        this.f62576b = i10;
        this.f62577c = aVar2;
        this.f62578d = new byte[1];
        this.f62579e = i10;
    }
}
