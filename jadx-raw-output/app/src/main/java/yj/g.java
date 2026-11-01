package yj;

import bk.l;
import ck.p;
import com.ironsource.G5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: FileReadWrite.kt */
/* JADX INFO: loaded from: classes10.dex */
public class g extends e {
    public static final ByteBuffer d(int i10, CharsetEncoder charsetEncoder) {
        p.j(charsetEncoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(charsetEncoder.maxBytesPerChar())));
        p.i(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    public static final void e(File file, Charset charset, l<? super String, r> lVar) {
        p.j(file, "<this>");
        p.j(charset, G5.M);
        p.j(lVar, "action");
        k.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }

    public static final CharsetEncoder f(Charset charset) {
        p.j(charset, "<this>");
        return charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
    }

    public static final List<String> g(File file, Charset charset) {
        p.j(file, "<this>");
        p.j(charset, G5.M);
        final ArrayList arrayList = new ArrayList();
        e(file, charset, new l() { // from class: yj.f
            @Override // bk.l
            public final Object invoke(Object obj) {
                return g.i(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ List h(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lk.c.f63591b;
        }
        return g(file, charset);
    }

    public static final r i(ArrayList arrayList, String str) {
        p.j(str, "it");
        arrayList.add(str);
        return r.f64562a;
    }

    public static final String j(File file, Charset charset) throws IOException {
        p.j(file, "<this>");
        p.j(charset, G5.M);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strE = k.e(inputStreamReader);
            b.a(inputStreamReader, null);
            return strE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String k(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lk.c.f63591b;
        }
        return j(file, charset);
    }

    public static final void l(File file, byte[] bArr) {
        p.j(file, "<this>");
        p.j(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            r rVar = r.f64562a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static final void m(File file, String str, Charset charset) throws IOException {
        p.j(file, "<this>");
        p.j(str, "text");
        p.j(charset, G5.M);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            o(fileOutputStream, str, charset);
            r rVar = r.f64562a;
            b.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void n(File file, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = lk.c.f63591b;
        }
        m(file, str, charset);
    }

    public static final void o(OutputStream outputStream, String str, Charset charset) throws IOException {
        p.j(outputStream, "<this>");
        p.j(str, "text");
        p.j(charset, G5.M);
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            p.i(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderF = f(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        p.g(charsetEncoderF);
        ByteBuffer byteBufferD = d(8192, charsetEncoderF);
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int iMin = Math.min(8192 - i11, str.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            p.i(cArrArray, "array(...)");
            str.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderF.encode(charBufferAllocate, byteBufferD, i12 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferD.array(), 0, byteBufferD.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferD.clear();
            i10 = i12;
        }
    }
}
