package lj;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ResourceBundle;
import kj.n;

/* JADX INFO: compiled from: HttpServlet.java */
/* JADX INFO: loaded from: classes2.dex */
public class k extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ResourceBundle f63582d = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63583c = 0;

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f63583c++;
    }

    public int d() {
        return this.f63583c;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException(f63582d.getString("err.io.nullArray"));
        }
        if (i10 < 0 || i11 < 0 || i10 + i11 > bArr.length) {
            throw new IndexOutOfBoundsException(MessageFormat.format(f63582d.getString("err.io.indexOutOfBounds"), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
        }
        this.f63583c += i11;
    }
}
