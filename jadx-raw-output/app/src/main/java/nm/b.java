package nm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import mm.d;
import mm.k;

/* JADX INFO: compiled from: StreamEndPoint.java */
/* JADX INFO: loaded from: classes6.dex */
public class b implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InputStream f64860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OutputStream f64861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64864f;

    @Override // mm.k
    public int c() {
        return 0;
    }

    @Override // mm.k
    public String e() {
        return null;
    }

    @Override // mm.k
    public boolean f() {
        return true;
    }

    @Override // mm.k
    public String g() {
        return null;
    }

    @Override // mm.k
    public boolean h(long j10) throws IOException {
        return true;
    }

    @Override // mm.k
    public void j() throws IOException {
        InputStream inputStream;
        this.f64863e = true;
        if (!this.f64864f || (inputStream = this.f64860b) == null) {
            return;
        }
        inputStream.close();
    }

    @Override // mm.k
    public boolean k(long j10) throws IOException {
        return true;
    }

    @Override // mm.k
    public void l() throws IOException {
        OutputStream outputStream;
        this.f64864f = true;
        if (!this.f64863e || (outputStream = this.f64861c) == null) {
            return;
        }
        outputStream.close();
    }

    @Override // mm.k
    public String r() {
        return null;
    }

    public void B() throws IOException {
        InputStream inputStream = this.f64860b;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // mm.k
    public void close() throws IOException {
        InputStream inputStream = this.f64860b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f64860b = null;
        OutputStream outputStream = this.f64861c;
        if (outputStream != null) {
            outputStream.close();
        }
        this.f64861c = null;
    }

    @Override // mm.k
    public int d() {
        return this.f64862d;
    }

    @Override // mm.k
    public void flush() throws IOException {
        OutputStream outputStream = this.f64861c;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // mm.k
    public int i(d dVar, d dVar2, d dVar3) throws IOException {
        int iU;
        int length;
        int length2;
        if (dVar == null || (length2 = dVar.length()) <= 0) {
            iU = 0;
        } else {
            iU = u(dVar);
            if (iU < length2) {
                return iU;
            }
        }
        if (dVar2 != null && (length = dVar2.length()) > 0) {
            int iU2 = u(dVar2);
            if (iU2 < 0) {
                return iU > 0 ? iU : iU2;
            }
            iU += iU2;
            if (iU2 < length) {
                return iU;
            }
        }
        if (dVar3 == null || dVar3.length() <= 0) {
            return iU;
        }
        int iU3 = u(dVar3);
        if (iU3 < 0) {
            return iU > 0 ? iU : iU3;
        }
        return iU + iU3;
    }

    @Override // mm.k
    public boolean isOpen() {
        return this.f64860b != null;
    }

    @Override // mm.k
    public void q(int i10) throws IOException {
        this.f64862d = i10;
    }

    @Override // mm.k
    public boolean s() {
        return this.f64864f;
    }

    @Override // mm.k
    public int u(d dVar) throws IOException {
        if (this.f64864f) {
            return -1;
        }
        if (this.f64861c == null) {
            return 0;
        }
        int length = dVar.length();
        if (length > 0) {
            dVar.writeTo(this.f64861c);
        }
        if (!dVar.Y()) {
            dVar.clear();
        }
        return length;
    }

    @Override // mm.k
    public boolean x() {
        return this.f64863e;
    }

    @Override // mm.k
    public int y(d dVar) throws IOException {
        if (this.f64863e) {
            return -1;
        }
        if (this.f64860b == null) {
            return 0;
        }
        int iL = dVar.L();
        if (iL <= 0) {
            if (dVar.hasContent()) {
                return 0;
            }
            throw new IOException("FULL");
        }
        try {
            int iK = dVar.K(this.f64860b, iL);
            if (iK < 0) {
                j();
            }
            return iK;
        } catch (SocketTimeoutException unused) {
            B();
            return -1;
        }
    }

    public InputStream z() {
        return this.f64860b;
    }

    public b(InputStream inputStream, OutputStream outputStream) {
        this.f64860b = inputStream;
        this.f64861c = outputStream;
    }

    public final boolean C() {
        return !isOpen();
    }
}
