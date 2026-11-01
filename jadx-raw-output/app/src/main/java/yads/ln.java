package yads;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ln f79856a = new ln();

    public static final byte[] a(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            if (str == null) {
                str = "";
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArrC = yj.a.c(gZIPInputStream);
                    yj.b.a(gZIPInputStream, null);
                    yj.b.a(byteArrayInputStream, null);
                    objM3458constructorimpl = Result.m3458constructorimpl(bArrC);
                    if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
                        objM3458constructorimpl = new byte[0];
                    }
                    return (byte[]) objM3458constructorimpl;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yj.b.a(gZIPInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    yj.b.a(byteArrayInputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th6));
        }
    }

    public static final String b(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(new String(a(str), lk.c.f63591b));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            objM3458constructorimpl = "";
        }
        return (String) objM3458constructorimpl;
    }
}
