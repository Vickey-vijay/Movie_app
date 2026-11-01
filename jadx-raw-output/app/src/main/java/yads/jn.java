package yads;

import android.util.Base64;
import kotlin.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class jn {
    public static String a(String str) {
        byte[] bytes = str.getBytes(lk.c.f63591b);
        ck.p.i(bytes, "getBytes(...)");
        return a(bytes);
    }

    public static String a(byte[] bArr) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Base64.encodeToString(bArr, 2));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            boolean z10 = ad1.f75480a;
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (String) objM3458constructorimpl;
    }
}
