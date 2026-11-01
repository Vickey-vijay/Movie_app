package xm;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/* JADX INFO: compiled from: IO.java */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zm.c f75015a = zm.b.a(j.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f75016b = {13, 10};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f75017c = 65536;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f75018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static b f75019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static d f75020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static PrintWriter f75021g;

    /* JADX INFO: compiled from: IO.java */
    public static class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return -1;
        }
    }

    /* JADX INFO: compiled from: IO.java */
    public static class c extends OutputStream {
        public c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
        }
    }

    /* JADX INFO: compiled from: IO.java */
    public static class d extends Writer {
        public d() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) {
        }

        @Override // java.io.Writer
        public void write(String str) {
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
        }
    }

    static {
        f75018d = new c();
        f75019e = new b();
        f75020f = new d();
        f75021g = new PrintWriter(f75020f);
    }

    public static void a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e10) {
                f75015a.h(e10);
            }
        }
    }

    public static void b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e10) {
                f75015a.h(e10);
            }
        }
    }

    public static void c(InputStream inputStream, OutputStream outputStream) throws IOException {
        d(inputStream, outputStream, -1L);
    }

    public static void d(InputStream inputStream, OutputStream outputStream, long j10) throws IOException {
        byte[] bArr = new byte[f75017c];
        if (j10 >= 0) {
            while (j10 > 0) {
                int i10 = f75017c;
                if (j10 < i10) {
                    i10 = (int) j10;
                }
                int i11 = inputStream.read(bArr, 0, i10);
                if (i11 == -1) {
                    return;
                }
                j10 -= (long) i11;
                outputStream.write(bArr, 0, i11);
            }
            return;
        }
        while (true) {
            int i12 = inputStream.read(bArr, 0, f75017c);
            if (i12 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i12);
            }
        }
    }

    public static void e(Reader reader, Writer writer, long j10) throws IOException {
        int i10;
        char[] cArr = new char[f75017c];
        if (j10 >= 0) {
            while (j10 > 0) {
                int i11 = f75017c;
                int i12 = j10 < ((long) i11) ? reader.read(cArr, 0, (int) j10) : reader.read(cArr, 0, i11);
                if (i12 == -1) {
                    return;
                }
                j10 -= (long) i12;
                writer.write(cArr, 0, i12);
            }
            return;
        }
        if (writer instanceof PrintWriter) {
            PrintWriter printWriter = (PrintWriter) writer;
            while (!printWriter.checkError() && (i10 = reader.read(cArr, 0, f75017c)) != -1) {
                writer.write(cArr, 0, i10);
            }
            return;
        }
        while (true) {
            int i13 = reader.read(cArr, 0, f75017c);
            if (i13 == -1) {
                return;
            } else {
                writer.write(cArr, 0, i13);
            }
        }
    }

    public static InputStream f() {
        return f75019e;
    }

    public static PrintWriter g() {
        return f75021g;
    }

    public static boolean delete(File file) {
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            for (int i10 = 0; fileArrListFiles != null && i10 < fileArrListFiles.length; i10++) {
                delete(fileArrListFiles[i10]);
            }
        }
        return file.delete();
    }
}
