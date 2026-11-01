package yads;

import java.net.URI;
import kotlin.Result;

/* JADX INFO: loaded from: classes9.dex */
public final class bb3 {
    public static boolean a(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            new URI(str);
            objM3458constructorimpl = Result.m3458constructorimpl(Boolean.valueOf((str == null || str.length() == 0) ? false : true));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = bool;
        }
        return ((Boolean) objM3458constructorimpl).booleanValue();
    }
}
