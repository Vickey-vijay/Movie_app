package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class r33 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f82096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f82097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f82098c = Uri.EMPTY;

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f82096a.a(r83Var);
    }

    @Override // yads.p30
    public final void close() {
        this.f82096a.close();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f82096a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f82096a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f82096a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f82097b += (long) i12;
        }
        return i12;
    }

    public r33(p30 p30Var) {
        this.f82096a = (p30) ni.a(p30Var);
        Collections.emptyMap();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        this.f82098c = u30Var.f83341a;
        Collections.emptyMap();
        long jA = this.f82096a.a(u30Var);
        Uri uri = this.f82096a.getUri();
        uri.getClass();
        this.f82098c = uri;
        this.f82096a.getResponseHeaders();
        return jA;
    }
}
