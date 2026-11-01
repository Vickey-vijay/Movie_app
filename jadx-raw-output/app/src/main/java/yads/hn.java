package yads;

import android.util.Base64;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes11.dex */
public final class hn {
    public static String a(String str) {
        Charset charset = lk.c.f63591b;
        byte[] bytes = str.getBytes(charset);
        ck.p.i(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            String str2 = new String(bytes, lk.c.f63591b);
            boolean z10 = ad1.f75480a;
            return str2;
        }
    }

    public static String b(String str) {
        Charset charset = lk.c.f63591b;
        byte[] bytes = str.getBytes(charset);
        ck.p.i(bytes, "getBytes(...)");
        try {
            return new String(Base64.decode(bytes, 0), charset);
        } catch (Exception unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }
}
