package xm;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: ByteArrayOutputStream2.java */
/* JADX INFO: loaded from: classes10.dex */
public class g extends ByteArrayOutputStream {
    public g() {
    }

    public g(int i10) {
        super(i10);
    }

    public byte[] d() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public void e(int i10) {
        ((ByteArrayOutputStream) this).count = i10;
    }

    public int getCount() {
        return ((ByteArrayOutputStream) this).count;
    }
}
