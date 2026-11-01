package lm;

import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;

/* JADX INFO: compiled from: HttpHeaders.java */
/* JADX INFO: loaded from: classes.dex */
public class i extends mm.e {
    public static final mm.d A;
    public static final mm.d B;
    public static final mm.d C;
    public static final mm.d D;
    public static final mm.d E;
    public static final mm.d F;
    public static final mm.d G;
    public static final mm.d H;
    public static final mm.d I;
    public static final mm.d J;
    public static final mm.d K;
    public static final mm.d L;
    public static final mm.d M;
    public static final mm.d N;
    public static final mm.d O;
    public static final mm.d P;
    public static final mm.d Q;
    public static final mm.d R;
    public static final mm.d S;
    public static final mm.d T;
    public static final mm.d U;
    public static final mm.d V;
    public static final mm.d W;
    public static final mm.d X;
    public static final mm.d Y;
    public static final mm.d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final mm.d f63773a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final mm.d f63774b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final mm.d f63775c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f63776d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final mm.d f63777d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mm.d f63778e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final mm.d f63779e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mm.d f63780f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final mm.d f63781f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mm.d f63782g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final mm.d f63783g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mm.d f63784h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final mm.d f63785h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final mm.d f63786i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final mm.d f63787i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mm.d f63788j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final mm.d f63789j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final mm.d f63790k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final mm.d f63791k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final mm.d f63792l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final mm.d f63793l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final mm.d f63794m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final mm.d f63795m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final mm.d f63796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final mm.d f63797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final mm.d f63798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final mm.d f63799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final mm.d f63800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final mm.d f63801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final mm.d f63802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final mm.d f63803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final mm.d f63804v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final mm.d f63805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final mm.d f63806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final mm.d f63807y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final mm.d f63808z;

    static {
        i iVar = new i();
        f63776d = iVar;
        f63778e = iVar.a("Host", 27);
        f63780f = iVar.a(com.safedk.android.utils.k.f45009b, 19);
        f63782g = iVar.a("Accept-Charset", 20);
        f63784h = iVar.a("Accept-Encoding", 21);
        f63786i = iVar.a("Accept-Language", 22);
        f63788j = iVar.a("Content-Length", 12);
        f63790k = iVar.a("Connection", 1);
        f63792l = iVar.a("Cache-Control", 57);
        f63794m = iVar.a("Date", 2);
        f63796n = iVar.a("Pragma", 3);
        f63797o = iVar.a("Trailer", 4);
        f63798p = iVar.a("Transfer-Encoding", 5);
        f63799q = iVar.a("Upgrade", 6);
        f63800r = iVar.a("Via", 7);
        f63801s = iVar.a("Warning", 8);
        f63802t = iVar.a("Allow", 9);
        f63803u = iVar.a("Content-Encoding", 10);
        f63804v = iVar.a("Content-Language", 11);
        f63805w = iVar.a("Content-Location", 13);
        f63806x = iVar.a("Content-MD5", 14);
        f63807y = iVar.a("Content-Range", 15);
        f63808z = iVar.a("Content-Type", 16);
        A = iVar.a("Expires", 17);
        B = iVar.a("Last-Modified", 18);
        C = iVar.a("Authorization", 23);
        D = iVar.a("Expect", 24);
        E = iVar.a("Forwarded", 25);
        F = iVar.a("From", 26);
        G = iVar.a("If-Match", 28);
        H = iVar.a("If-Modified-Since", 29);
        I = iVar.a("If-None-Match", 30);
        J = iVar.a("If-Range", 31);
        K = iVar.a("If-Unmodified-Since", 32);
        L = iVar.a("Keep-Alive", 33);
        M = iVar.a("Max-Forwards", 34);
        N = iVar.a("Proxy-Authorization", 35);
        O = iVar.a(Command.HTTP_HEADER_RANGE, 36);
        P = iVar.a("Request-Range", 37);
        Q = iVar.a("Referer", 38);
        R = iVar.a("TE", 39);
        S = iVar.a("User-Agent", 40);
        T = iVar.a("X-Forwarded-For", 41);
        U = iVar.a("X-Forwarded-Proto", 59);
        V = iVar.a("X-Forwarded-Server", 60);
        W = iVar.a("X-Forwarded-Host", 61);
        X = iVar.a("Accept-Ranges", 42);
        Y = iVar.a("Age", 43);
        Z = iVar.a(Command.HTTP_HEADER_ETAG, 44);
        f63773a0 = iVar.a("Location", 45);
        f63774b0 = iVar.a("Proxy-Authenticate", 46);
        f63775c0 = iVar.a(CommonGatewayClient.HEADER_RETRY_AFTER, 47);
        f63777d0 = iVar.a("Server", 48);
        f63779e0 = iVar.a("Servlet-Engine", 49);
        f63781f0 = iVar.a("Vary", 50);
        f63783g0 = iVar.a("WWW-Authenticate", 51);
        f63785h0 = iVar.a("Cookie", 52);
        f63787i0 = iVar.a("Set-Cookie", 53);
        f63789j0 = iVar.a("Set-Cookie2", 54);
        f63791k0 = iVar.a("MIME-Version", 55);
        f63793l0 = iVar.a("identity", 56);
        f63795m0 = iVar.a("Proxy-Connection", 58);
    }
}
