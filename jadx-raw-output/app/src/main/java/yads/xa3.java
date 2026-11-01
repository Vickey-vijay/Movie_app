package yads;

import java.net.URI;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public abstract class xa3 {
    public static String a(String str) {
        Object objM3458constructorimpl;
        String str2;
        try {
            Result.a aVar = Result.Companion;
            boolean zX = lk.a0.X(str, "://", false, 2, null);
            if (!zX) {
                str = b(str);
            }
            URI uri = new URI(str);
            if (zX) {
                str2 = uri.getScheme() + "://";
            } else {
                str2 = "";
            }
            objM3458constructorimpl = Result.m3458constructorimpl(str2 + uri.getHost());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = "bad_url";
        }
        return (String) objM3458constructorimpl;
    }

    public static String b(String str) {
        return "stub://" + str;
    }
}
