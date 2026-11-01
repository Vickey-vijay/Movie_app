package rm;

import java.io.IOException;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: HttpInput.java */
/* JADX INFO: loaded from: classes2.dex */
public class k extends kj.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f66890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm.k f66891c;

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f66891c.b();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        mm.d dVarC = this.f66891c.c(this.f66890b.s());
        if (dVarC != null) {
            return dVarC.a0(bArr, i10, i11);
        }
        if (this.f66890b.H()) {
            throw new EofException("early EOF");
        }
        return -1;
    }

    public k(b bVar) {
        this.f66890b = bVar;
        this.f66891c = (lm.k) bVar.u();
    }
}
