package v7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import w7.c;

/* JADX INFO: compiled from: FileDownloadRandomAccessFile.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements v7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedOutputStream f73127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDescriptor f73128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RandomAccessFile f73129c;

    /* JADX INFO: compiled from: FileDownloadRandomAccessFile.java */
    public static class a implements c.e {
        @Override // w7.c.e
        public boolean a() {
            return true;
        }

        @Override // w7.c.e
        public v7.a b(File file) throws IOException {
            return new b(file);
        }
    }

    @Override // v7.a
    public void close() throws IOException {
        this.f73127a.close();
        this.f73129c.close();
    }

    @Override // v7.a
    public void flushAndSync() throws IOException {
        this.f73127a.flush();
        this.f73128b.sync();
    }

    @Override // v7.a
    public void seek(long j10) throws IOException {
        this.f73129c.seek(j10);
    }

    @Override // v7.a
    public void setLength(long j10) throws IOException {
        this.f73129c.setLength(j10);
    }

    @Override // v7.a
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f73127a.write(bArr, i10, i11);
    }

    public b(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f73129c = randomAccessFile;
        this.f73128b = randomAccessFile.getFD();
        this.f73127a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }
}
