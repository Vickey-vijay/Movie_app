package mm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes5.dex */
public interface d extends Cloneable {

    /* JADX INFO: compiled from: Buffer.java */
    public interface a {
    }

    byte[] H();

    void I(int i10, byte b10);

    int J(int i10, byte[] bArr, int i11, int i12);

    int K(InputStream inputStream, int i10) throws IOException;

    int L();

    int M(int i10, byte[] bArr, int i11, int i12);

    d N(int i10, int i11);

    String O();

    String P(Charset charset);

    byte Q(int i10);

    void R();

    int S(d dVar);

    int T();

    void U(int i10);

    byte[] V();

    void W(int i10);

    int X(byte[] bArr);

    boolean Y();

    int a0(byte[] bArr, int i10, int i11);

    void b0();

    d buffer();

    d c0();

    void clear();

    int e0();

    int f0();

    int g0(int i10, d dVar);

    byte get();

    d get(int i10);

    int getIndex();

    boolean h0();

    boolean hasContent();

    void i0(int i10);

    boolean isReadOnly();

    boolean j0(d dVar);

    d k0();

    int length();

    byte peek();

    void put(byte b10);

    int skip(int i10);

    String toString(String str);

    void writeTo(OutputStream outputStream) throws IOException;
}
