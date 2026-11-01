package to;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: IO.java */
/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f72496a;

    static {
        StringWriter stringWriter = new StringWriter(4);
        new PrintWriter(stringWriter).println();
        f72496a = stringWriter.toString();
    }

    public static long b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (-1 == i10) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public static byte[] d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void e(String str, OutputStream outputStream) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes());
        }
    }

    public static void f(String str, OutputStream outputStream, String str2) throws IOException {
        if (str != null) {
            if (str2 == null) {
                e(str, outputStream);
            } else {
                outputStream.write(str.getBytes(str2));
            }
        }
    }

    public static void g(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static void i(OutputStream outputStream, String str) throws IOException {
        f(str, outputStream, "UTF-8");
    }

    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jB = b(inputStream, outputStream);
        if (jB > 2147483647L) {
            return -1;
        }
        return (int) jB;
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        return d(inputStream);
    }

    public static void h(OutputStream outputStream, byte[] bArr) throws IOException {
        g(bArr, outputStream);
    }
}
