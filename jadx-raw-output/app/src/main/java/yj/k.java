package yj;

import bk.l;
import ck.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import mj.r;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static final long a(Reader reader, Writer writer, int i10) throws IOException {
        p.j(reader, "<this>");
        p.j(writer, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            writer.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return a(reader, writer, i10);
    }

    public static final void c(Reader reader, l<? super String, r> lVar) {
        p.j(reader, "<this>");
        p.j(lVar, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = d(bufferedReader).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            r rVar = r.f64562a;
            b.a(bufferedReader, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public static final kk.i<String> d(BufferedReader bufferedReader) {
        p.j(bufferedReader, "<this>");
        return kk.r.h(new j(bufferedReader));
    }

    public static final String e(Reader reader) {
        p.j(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        p.i(string, "toString(...)");
        return string;
    }
}
