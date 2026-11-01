package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f75962a = Charset.forName(C.ASCII_NAME);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f75963b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f75964c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f75965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f75966e;

    static {
        Charset.forName("UTF-16BE");
        f75965d = Charset.forName("UTF-16LE");
        f75966e = Charset.forName(C.UTF16_NAME);
    }
}
