package yads;

import android.net.Uri;
import android.webkit.URLUtil;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ya3 {
    public static String a(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Uri.parse(b(str)).getHost());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (String) objM3458constructorimpl;
    }

    public static String b(String str) {
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            return "https://" + str;
        }
        return str;
    }
}
