package lk;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Charsets.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f63590a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f63591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f63592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f63593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f63594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f63595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f63596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Charset f63597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile Charset f63598i;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        ck.p.i(charsetForName, "forName(...)");
        f63591b = charsetForName;
        Charset charsetForName2 = Charset.forName(C.UTF16_NAME);
        ck.p.i(charsetForName2, "forName(...)");
        f63592c = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16BE");
        ck.p.i(charsetForName3, "forName(...)");
        f63593d = charsetForName3;
        Charset charsetForName4 = Charset.forName("UTF-16LE");
        ck.p.i(charsetForName4, "forName(...)");
        f63594e = charsetForName4;
        Charset charsetForName5 = Charset.forName(C.ASCII_NAME);
        ck.p.i(charsetForName5, "forName(...)");
        f63595f = charsetForName5;
        Charset charsetForName6 = Charset.forName("ISO-8859-1");
        ck.p.i(charsetForName6, "forName(...)");
        f63596g = charsetForName6;
    }

    public final Charset a() {
        Charset charset = f63598i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        ck.p.i(charsetForName, "forName(...)");
        f63598i = charsetForName;
        return charsetForName;
    }

    public final Charset b() {
        Charset charset = f63597h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        ck.p.i(charsetForName, "forName(...)");
        f63597h = charsetForName;
        return charsetForName;
    }
}
