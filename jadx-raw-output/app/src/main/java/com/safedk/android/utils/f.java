package com.safedk.android.utils;

import android.os.SystemClock;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class f {
    private static final String aN = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)<TAG_NAME>[\\s\\S]*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)<TAG_NAME>(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44933e = "RegexFactory";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f44934f = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44935g = "(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f44936h = "(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44937i = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44938j = "(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44939k = "(?:\\\\+x3D|%3d|=)";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44940l = "(?:\\\\+x2B|%2b|\\+)";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f44941m = "[\\s\\S]*?";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44942n = "(?:%26|\\\\+x26|&)";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f44943o = "(?:%24|\\\\+x24|$)";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f44944p = "(?:%21|\\\\+x21|!)";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f44945q = "(?:%5B|\\\\+x5B|\\[|\\\\n)";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f44946r = "(?:%5D|\\\\+x5D|\\])";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f44947s = "\\)";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Pattern f44948t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static Pattern f44949u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static Pattern f44950v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static Pattern f44951w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static Pattern f44952x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static Pattern f44953y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static Pattern f44954z = null;
    private static Pattern A = null;
    private static Pattern B = null;
    private static Pattern C = null;
    private static Pattern D = null;
    private static Pattern E = null;
    private static Pattern F = null;
    private static Pattern G = null;
    private static Pattern H = null;
    private static Pattern I = null;
    private static Pattern J = null;
    private static Pattern K = null;
    private static Pattern L = null;
    private static Pattern M = null;
    private static Pattern N = null;
    private static Pattern O = null;
    private static Pattern P = null;
    private static Pattern Q = null;
    private static Pattern R = null;
    private static Pattern S = null;
    private static Pattern T = null;
    private static Pattern U = null;
    private static Pattern V = null;
    private static Pattern W = null;
    private static Pattern X = null;
    private static Pattern Y = null;
    private static Pattern Z = null;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private static Pattern f44907aa = null;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static Pattern f44908ab = null;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private static Pattern f44909ac = null;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private static Pattern f44910ad = null;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private static Pattern f44911ae = null;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    private static Pattern f44912af = null;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    private static Pattern f44913ag = null;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    private static Pattern f44914ah = null;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    private static Pattern f44915ai = null;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private static Pattern f44916aj = null;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private static Pattern f44917ak = null;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private static Pattern f44918al = null;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    private static Pattern f44919am = null;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private static Pattern f44920an = null;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    private static Pattern f44921ao = null;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private static Pattern f44922ap = null;
    private static Pattern aq = null;
    private static Pattern ar = null;
    private static Pattern as = null;
    private static Pattern at = null;
    private static Pattern au = null;
    private static Pattern av = null;
    private static Pattern aw = null;
    private static Pattern ax = null;
    private static Pattern ay = null;
    private static Pattern az = null;
    private static Pattern aA = null;
    private static Pattern aB = null;
    private static Pattern aC = null;
    private static Pattern aD = null;
    private static Pattern aE = null;
    private static Pattern aF = null;
    private static Pattern aG = null;
    private static Pattern aH = null;
    private static Pattern aI = null;
    private static Pattern aJ = null;
    private static Pattern aK = null;
    private static Pattern aL = null;
    private static Pattern aM = null;
    private static Pattern aO = null;
    private static Pattern aP = null;
    private static Pattern aQ = null;
    private static Pattern aR = null;
    private static Pattern aS = null;
    private static Pattern aT = null;
    private static Pattern aU = null;
    private static Pattern aV = null;
    private static Pattern aW = null;
    private static Pattern aX = null;
    private static Pattern aY = null;
    private static Pattern aZ = null;

    /* JADX INFO: renamed from: ba, reason: collision with root package name */
    private static Pattern f44924ba = null;

    /* JADX INFO: renamed from: bb, reason: collision with root package name */
    private static Pattern f44925bb = null;

    /* JADX INFO: renamed from: bc, reason: collision with root package name */
    private static Pattern f44926bc = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f44906a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Pattern f44923b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Pattern f44931c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Pattern f44932d = null;

    /* JADX INFO: renamed from: bd, reason: collision with root package name */
    private static Pattern f44927bd = null;

    /* JADX INFO: renamed from: be, reason: collision with root package name */
    private static Pattern f44928be = null;

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    private static Pattern f44929bf = null;

    /* JADX INFO: renamed from: bg, reason: collision with root package name */
    private static f f44930bg = null;

    public static f a() {
        return f44930bg;
    }

    public static Pattern b() {
        if (f44923b == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44923b = Pattern.compile("VAST.*/VAST", 2);
            Logger.d(f44933e, "Regex VAST_FAST_VAST_BLOCK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44923b;
    }

    public static Pattern c() {
        if (f44906a == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44906a = Pattern.compile(a(VastTagName.VAST), 2);
            Logger.d(f44933e, "Regex VAST_BLOCK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44906a;
    }

    public static Pattern d() {
        if (f44926bc == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44926bc = Pattern.compile(a(VastTagName.IMPRESSION), 2);
            Logger.d(f44933e, "Regex VAST_IMPRESSION_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44926bc;
    }

    public static Pattern e() {
        if (f44925bb == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44925bb = Pattern.compile(a(VastTagName.COMPANION_CLICK_TRACKING), 2);
            Logger.d(f44933e, "Regex VAST_COMPANION_CLICK_TRACKING_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44925bb;
    }

    public static Pattern f() {
        if (f44924ba == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44924ba = Pattern.compile(a(VastTagName.CLICK_TRACKING), 2);
            Logger.d(f44933e, "Regex VAST_CLICK_TRACKING_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44924ba;
    }

    public static Pattern g() {
        if (aZ == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aZ = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Tracking(?:[\\s]|%20)event(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)([\\s\\S]*?)(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Tracking(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2);
            Logger.d(f44933e, "Regex VAST_VIDEO_TRACKING_EVENT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aZ;
    }

    public static Pattern h() {
        if (aY == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aY = Pattern.compile(a(VastTagName.AD_PARAMETERS), 2);
            Logger.d(f44933e, "Regex VAST_AD_PARAMETERS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aY;
    }

    public static Pattern i() {
        if (aX == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aX = Pattern.compile(a(VastTagName.HTML_RESOURCE), 2);
            Logger.d(f44933e, "Regex VAST_HTML_RESOURCE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aX;
    }

    public static Pattern j() {
        if (aW == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aW = Pattern.compile(a(VastTagName.I_FRAME_RESOURCE), 2);
            Logger.d(f44933e, "Regex VAST_IFRAME_RESOURCE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aW;
    }

    public static Pattern k() {
        if (aV == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aV = Pattern.compile(a(VastTagName.STATIC_RESOURCE), 2);
            Logger.d(f44933e, "Regex VAST_STATIC_RESOURCE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aV;
    }

    public static Pattern l() {
        if (aU == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aU = Pattern.compile(a("YouTubeVideoId"), 2);
            Logger.d(f44933e, "Regex VAST_YOUTUBE_VIDEO initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aU;
    }

    public static Pattern m() {
        if (aT == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aT = Pattern.compile(a(VastTagName.VAST_AD_TAG_URI), 2);
            Logger.d(f44933e, "Regex VAST_VAST_AD_TAG_URI_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aT;
    }

    public static Pattern n() {
        if (aS == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aS = Pattern.compile(a(VastTagName.COMPANION_CLICK_THROUGH), 2);
            Logger.d(f44933e, "Regex VAST_COMPANION_CLICK_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aS;
    }

    public static Pattern o() {
        if (aR == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aR = Pattern.compile("(apiFramework(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)VPAID(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|type(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)application/javascript(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2);
            Logger.d(f44933e, "Regex VAST_MEDIA_FILE_PATTERN_JS_APP_ATTRIBUTE initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aR;
    }

    public static Pattern p() {
        if (aQ == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aQ = Pattern.compile(aN.replaceFirst("<TAG_NAME>", "MediaFile[^s]").replace("<TAG_NAME>", VastTagName.MEDIA_FILE), 2);
            Logger.d(f44933e, "Regex VAST_MEDIA_FILE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aQ;
    }

    public static Pattern q() {
        if (aP == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aP = Pattern.compile(a(VastTagName.CLICK_THROUGH), 2);
            Logger.d(f44933e, "Regex VAST_CLICK_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms, value = " + aP.toString());
        }
        return aP;
    }

    public static Pattern r() {
        if (aO == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aO = Pattern.compile(a(VastTagName.AD_SYSTEM), 2);
            Logger.d(f44933e, "Regex VAST_AD_SYSTEM_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aO;
    }

    public static Pattern s() {
        if (aM == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aM = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Creative[^s]?(?:id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([0-9]+)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))?.*?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Creative(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 2);
            Logger.d(f44933e, "Regex VAST_CREATIVE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aM;
    }

    public static Pattern t() {
        if (aL == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aL = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)((.*?)(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34);
            Logger.d(f44933e, "Regex VAST_AD_ID_OPTIONAL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aL;
    }

    public static Pattern u() {
        if (aK == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aK = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Ad(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34);
            Logger.d(f44933e, "Regex VAST_AD_ID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aK;
    }

    public static Pattern v() {
        if (aJ == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aJ = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)Ad(?:(?: +|%20)id(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)?(?:(?: +|%20).*?)?)?(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)[\\s\\S]*?(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:\\\\*/)Ad(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)", 34);
            Logger.d(f44933e, "Regex VAST_AD_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aJ;
    }

    public static Pattern w() {
        if (aI == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aI = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)(?:%21|\\\\+x21|!)(?:%5B|\\\\+x5B|\\[|\\\\n)CDATA(?:%5B|\\\\+x5B|\\[|\\\\n)([\\s\\S]*?)(?:%5D|\\\\+x5D|\\])(?:%5D|\\\\+x5D|\\])(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)");
            Logger.d(f44933e, "Regex CDATA_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aI;
    }

    public static Pattern x() {
        if (aH == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aH = Pattern.compile("\\\\+u([0-9a-f]{4})");
            Logger.d(f44933e, "Regex UNICODE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aH;
    }

    public static Pattern y() {
        if (aF == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aF = Pattern.compile("data:([a-zA-Z]*\\/[a-zA-Z1-9]*);?([\\s\\S]*?;)base64,([^\\\"\\')]*)");
            Logger.d(f44933e, "Regex HTML_DATA_RESOURCES_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aF;
    }

    public static Pattern z() {
        if (aE == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aE = Pattern.compile("(https?:\\/\\/.*?).googlevideo.com\\/videoplayback");
            Logger.d(f44933e, "Regex GOOGLE_VIDEO_DOMAIN_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aE;
    }

    public static Pattern A() {
        if (aD == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aD = Pattern.compile("(https?:\\\\*\\/\\\\*\\/.*?)(?:;frame-src|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)|(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)|\\s?(?:%5D|\\\\+x5D|\\]){2})");
            Logger.d(f44933e, "Regex URL_RESOURCES_WITH_SPECIAL_CHARS initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aD;
    }

    public static Pattern B() {
        if (aB == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aB = Pattern.compile("\\\\x3c(?:!DOCTYPE(?:.?))html\\\\x3e(.*?)(\\\\x3c/html\\\\x3e)");
            Logger.d(f44933e, "Regex UNICODE_ENCODED_HTML initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aB;
    }

    public static Pattern C() {
        if (aC == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aC = Pattern.compile("(?s)(<html>.+?</html>)|(%3Chtml%3E.+?%3C/html%3E)");
            Logger.d(f44933e, "Regex HTML_CONTENT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aC;
    }

    public static Pattern D() {
        if (aA == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aA = Pattern.compile("((http|https|gmsg)(:|%3A)\\\\*(/|%2F)\\\\*(/|%2F).*?)(?:;frame-src| alt|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)|(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)|(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)|(?:%5B|\\\\+x5B|\\[|\\\\n)|(?:%5D|\\\\+x5D|\\])|\\)|[\n\r\t\\x{0001}-\\x{001f}\\x{fffd}])");
            Logger.d(f44933e, "Regex URL_RESOURCES initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aA;
    }

    public static Pattern E() {
        if (ay == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ay = Pattern.compile("video_id(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
            Logger.d(f44933e, "Regex ADMOB_VIDEOID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return ay;
    }

    public static Pattern F() {
        if (ax == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ax = Pattern.compile("creative_id(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
            Logger.d(f44933e, "Regex ADMOB_CREATIVEID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return ax;
    }

    public static Pattern G() {
        if (aw == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aw = Pattern.compile("destination_url(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;):[\\s]*(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([\\s\\S]*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
            Logger.d(f44933e, "Regex ADMOB_VIDEO_CLICKURL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aw;
    }

    public static Pattern H() {
        if (av == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            av = Pattern.compile("........VAST .*?AdSystem", 32);
            Logger.d(f44933e, "Regex MULTI_VAST_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return av;
    }

    public static Pattern I() {
        if (au == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            au = Pattern.compile("pod.vast", 16);
            Logger.d(f44933e, "Regex POD_VAST_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return au;
    }

    public static Pattern J() {
        if (at == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            at = Pattern.compile("VAST ", 16);
            Logger.d(f44933e, "Regex VAST_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return at;
    }

    public static Pattern K() {
        if (as == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            as = Pattern.compile("ad_click_dest[\\s].*?=[\\s].*?\\\"([\\S].*?)\\\"");
            Logger.d(f44933e, "Regex MRAID_URL_CLICK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return as;
    }

    public static Pattern L() {
        if (ar == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ar = Pattern.compile("adUnitId='(.*?)'", 2);
            Logger.d(f44933e, "Regex MAX_AD_VIEW_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return ar;
    }

    public static Pattern M() {
        if (aq == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aq = Pattern.compile("[0-9]{2,3}\\.[0-9]{2,3}\\.[0-9]{2,3}\\.[0-9]{2,3}");
            Logger.d(f44933e, "Regex IP_ADDRESS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aq;
    }

    public static Pattern N() {
        if (f44922ap == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44922ap = Pattern.compile("publisher-app-icon\\s?\\{(.*?)background(-image)?:.*?url\\(\"\\s*(?<url>.*?)\"\\s*\\)(.*?)\\}", 34);
            Logger.d(f44933e, "Regex PUBLISHER_APP_ICON_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44922ap;
    }

    public static Pattern O() {
        if (f44921ao == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44921ao = Pattern.compile("<canvas\\sclass=\\\\?\\\"(\\S+?)\\send-frame");
            Logger.d(f44933e, "Regex IMAGE_URL_CLASS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44921ao;
    }

    public static Pattern P() {
        if (f44920an == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44920an = Pattern.compile("description[^>]+>\\s*<span[^>]+>([^<]+)");
            Logger.d(f44933e, "Regex DESCRIPTION_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44920an;
    }

    public static Pattern Q() {
        if (f44919am == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44919am = Pattern.compile("headline[^>]+>\\s*<span[^>]+>([^<]+)");
            Logger.d(f44933e, "Regex HEADLINE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44919am;
    }

    public static Pattern R() {
        if (f44918al == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44918al = Pattern.compile("short-app-name[^>]+truncated[^>]+>\\s*<span[^>]+>([^<]+)");
            Logger.d(f44933e, "Regex SHORT_APP_NAME_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44918al;
    }

    public static Pattern S() {
        if (f44917ak == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44917ak = Pattern.compile("<(?:canvas|svg)\\sclass=\\\\?\\\"(\\S+?)\\sendcard-app-icon");
            Logger.d(f44933e, "Regex APP_ICON_CLASS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44917ak;
    }

    public static Pattern T() {
        if (f44916aj == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44916aj = Pattern.compile("<div[^>]+podding-card[^>]*>");
            Logger.d(f44933e, "Regex PODDING_CARD_DIV_CLASS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44916aj;
    }

    public static Pattern U() {
        if (f44915ai == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44915ai = Pattern.compile("<div[^>]+\\sendcard[\\s>][^>]*>");
            Logger.d(f44933e, "Regex ENDCARD_DIV_CLASS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44915ai;
    }

    public static Pattern V() {
        if (f44914ah == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44914ah = Pattern.compile("\\/VAST(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos).+ytimg[^\"]+?\\/([^\\\"\\\\/]{11})\\/[^\"]+(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)");
            Logger.d(f44933e, "Regex YOUTUBE_VIDEO_ID_PATTERN_2 initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44914ah;
    }

    public static Pattern W() {
        if (f44913ag == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44913ag = Pattern.compile("\\/VAST(?:%3E|\\\\+x3e|>|&gt;|&amp;gt;|\\*&quot;|&apos)(?:[^,]+,){6}(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)([^\\\"]{11})(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)");
            Logger.d(f44933e, "Regex YOUTUBE_VIDEO_ID_PATTERN_1 initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44913ag;
    }

    public static Pattern X() {
        if (f44912af == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44912af = Pattern.compile("<meta([^>]+)\\sindex=\\\\?\\\"(\\d)\\\\?\\\"\\sname=\\\\?\\\"video_fields\\\\?\\\">");
            Logger.d(f44933e, "Regex META_VIDEO_FIELDS_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44912af;
    }

    public static Pattern Y() {
        if (f44911ae == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44911ae = Pattern.compile("https://www\\.youtube\\.com/watch\\?v(\\\\x3d)(.*?)(\\\\x26)");
            Logger.d(f44933e, "Regex YOUTUBE_VIDEO_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44911ae;
    }

    public static Pattern Z() {
        if (f44910ad == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44910ad = Pattern.compile("Clickstring\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2);
            Logger.d(f44933e, "Regex CLICK_STRING_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44910ad;
    }

    public static Pattern aa() {
        if (f44909ac == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44909ac = Pattern.compile("<img[^>]*src=[\\\"']([^\\\"^']*)(.*)\\/>|image:url((.*))");
            Logger.d(f44933e, "Regex AD_IMAGE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44909ac;
    }

    public static Pattern ab() {
        if (f44908ab == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44908ab = Pattern.compile("is_rewarded_html5_playable[^}]*?true");
            Logger.d(f44933e, "Regex PLAYABLE_FLAG_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44908ab;
    }

    public static Pattern ac() {
        if (f44907aa == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44907aa = Pattern.compile("survey_payload[\\'\\\"]\\s*:\\s*[\\'\\\"](.*?)[\\'\\\"]");
            Logger.d(f44933e, "Regex SURVEY_TEXT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44907aa;
    }

    public static Pattern ad() {
        if (Z == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Z = Pattern.compile("<(?!script|head|link|meta)([a-zA-Z0-9]+)(?:\\s*[^>]*)>([^=\\/\\{\\+]+?)<\\/\\1>");
            Logger.d(f44933e, "Regex INNER_TEXT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return Z;
    }

    public static Pattern ae() {
        if (Y == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Y = Pattern.compile("(?<!AdGroup\\+)Creative\\+ID\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2);
            Logger.d(f44933e, "Regex CREATIVE_ID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return Y;
    }

    public static Pattern af() {
        if (X == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            X = Pattern.compile("AdGroup\\+Creative\\+ID\\+([0-9])=(.*?)(?:(?:%24|\\\\+x24|$)|(?:%26|\\\\+x26|&)|(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;))", 2);
            Logger.d(f44933e, "Regex ADGROUP_CREATIVE_ID_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return X;
    }

    public static Pattern ag() {
        if (V == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            V = Pattern.compile("Landing\\+Page\\+([0-9])=(.*?)&", 2);
            Logger.d(f44933e, "Regex LANDING_PAGE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return V;
    }

    public static Pattern ah() {
        if (W == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            W = Pattern.compile("destinationUrl: (?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)", 2);
            Logger.d(f44933e, "Regex DESTINATION_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms, value : " + W);
        }
        return W;
    }

    public static Pattern ai() {
        if (U == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            U = Pattern.compile("Creative\\+ID\\+([0-9])", 2);
            Logger.d(f44933e, "Regex MULTIPLE_ADS_COUNT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return U;
    }

    public static Pattern aj() {
        if (Q == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Q = Pattern.compile("(src\\s*=\\s*['\\\"].*?\\/)([A-Za-z0-9]{8}_)(.*?['\\\"\\?])|(url\\(.*?\\/)([A-Za-z0-9]{8}_)(.*?[)\\?])", 2);
            Logger.d(f44933e, "Regex DIRECTSOLD_CONTENT_SRC_REGEX_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return Q;
    }

    public static Pattern ak() {
        if (R == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            R = Pattern.compile("var[ ]+trackingUrl[ =]*['\"]([^'\"]*)['\"]", 2);
            Logger.d(f44933e, "Regex TRACKING_URL_VAR_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return R;
    }

    public static Pattern al() {
        if (S == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            S = Pattern.compile("\"URL over\"[ ]href=\"(.*?)\"", 2);
            Logger.d(f44933e, "Regex URL_OVER_HREF_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return S;
    }

    public static Pattern am() {
        if (T == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            T = Pattern.compile("href=\"(.*?)\"", 2);
            Logger.d(f44933e, "Regex BANNER_HREF_CLICK_URL_PATTER initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return T;
    }

    public static Pattern an() {
        if (O == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            O = Pattern.compile("<video .*src=\"(\\S*?)\".*</video>");
            Logger.d(f44933e, "Regex VIDEO_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return O;
    }

    public static Pattern ao() {
        if (P == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            P = Pattern.compile("<script .*id=\"ad-context\">(.*?)</script>");
            Logger.d(f44933e, "Regex AD_CONTEXT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return P;
    }

    public static Pattern ap() {
        if (N == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            N = Pattern.compile("<span class=\"banner-description\">(.*?)</span>");
            Logger.d(f44933e, "Regex BANNER_DESCRIPTION initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return N;
    }

    public static Pattern aq() {
        if (M == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            M = Pattern.compile("<span class=\"banner-title\">(.*?)</span>");
            Logger.d(f44933e, "Regex BANNER_TITLE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return M;
    }

    public static Pattern ar() {
        if (L == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            L = Pattern.compile("!--(.*?)--");
            Logger.d(f44933e, "Regex HTML_COMMENT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return L;
    }

    public static Pattern as() {
        if (J == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            J = Pattern.compile("clickUrl: '([^']+)'");
            Logger.d(f44933e, "Regex PLAYABLE_CLICK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return J;
    }

    public static Pattern at() {
        if (K == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            K = Pattern.compile("(market:[^'\"]+)['\"]");
            Logger.d(f44933e, "Regex MARKET_APP_ID initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return K;
    }

    public static Pattern au() {
        if (f44948t == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44948t = Pattern.compile("<tns:Ad>([\\s\\S]*?)</tns:Ad>", 2);
            Logger.d(f44933e, "Regex PATTERN_FYBER_VAST_CONTENT initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44948t;
    }

    public static Pattern av() {
        if (f44949u == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44949u = Pattern.compile("<tns:AdNetwork Value=\"(.*?)\" />", 2);
            Logger.d(f44933e, "Regex PATTERN_FYBER_VAST_CONTENT initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44949u;
    }

    public static Pattern aw() {
        if (f44950v == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44950v = Pattern.compile("<meta name=\"inneractive-session\" content=\"([\\s\\S]*?)\" \\/>", 2);
            Logger.d(f44933e, "Regex PATTERN_FYBER_HTML_AD_META_SESSION initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44950v;
    }

    public static Pattern ax() {
        if (f44951w == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44951w = Pattern.compile("<meta name=\"inneractive-session\" content=\"([\\s\\S]*?)\" \\/>", 2);
            Logger.d(f44933e, "Regex PATTERN_FYBER_HTML_AD_CONTENT_JS_CSS initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44951w;
    }

    public static Pattern ay() {
        if (f44952x == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44952x = Pattern.compile("<a.*?id=\"liftoff-link\".*a>", 2);
            Logger.d(f44933e, "Regex LIFTOFF_CLICK_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44952x;
    }

    public static Pattern az() {
        if (f44953y == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44953y = Pattern.compile("videoSrc:%20%22(.*?)%22", 2);
            Logger.d(f44933e, "Regex VIDEO_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44953y;
    }

    public static Pattern aA() {
        if (f44954z == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44954z = Pattern.compile("<meta name=\"inneractive-session\" content=\"([\\s\\S]*?)\" \\/>", 2);
            Logger.d(f44933e, "Regex HREF_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44954z;
    }

    public static Pattern aB() {
        if (B == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            B = Pattern.compile("^[0-9a-f]*$");
            Logger.d(f44933e, "Regex HASH_FILENAME_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return B;
    }

    public static Pattern aC() {
        if (A == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            A = Pattern.compile("event_payload\".*\"event_pl\":\"(.*?)\"", 34);
            Logger.d(f44933e, "Regex EVENT_PAYLOAD_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return A;
    }

    public static Pattern aD() {
        if (C == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C = Pattern.compile("src=\\\\?\"([^\\\\\"]+)");
            Logger.d(f44933e, "Regex SRC_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return C;
    }

    public static Pattern aE() {
        if (D == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            D = Pattern.compile("&lt;(img|IMG) (src|SRC)=&quot;(.*?)&quot;?(.*?)( style| STYLE|&gt;)");
            Logger.d(f44933e, "Regex MRAID_IMG initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return D;
    }

    public static Pattern aF() {
        if (E == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            E = Pattern.compile("&lt;(a|A) (href|HREF)=&quot;(.*?)&quot;(&gt;| )");
            Logger.d(f44933e, "Regex MRAID_ANCHOR_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return E;
    }

    public static Pattern aG() {
        if (F == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            F = Pattern.compile("pinpoint_url\\\":\\\"([^\\\"]+)\"");
            Logger.d(f44933e, "Regex LIFTOFF_PINPOINT_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return F;
    }

    public static Pattern aH() {
        if (G == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            G = Pattern.compile("click_config\\\":\\{\\\"clickthrough_url\\\":\\{\\\"url\\\":\\\"([^\\\"]+)\\\"");
            Logger.d(f44933e, "Regex LIFTOFF_CLICKTHROUGH_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return G;
    }

    public static Pattern aI() {
        if (I == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            I = Pattern.compile("\\{\\\"clickURLs\\\":\\{\\\"clickthroughURL\\\":\\{\\\"url\\\":\\\"([^\\\"]+)\\\"");
            Logger.d(f44933e, "Regex LIFTOFF_PINPOINT_OUTER_ENV_CLICK_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return I;
    }

    public static Pattern aJ() {
        if (H == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            H = Pattern.compile("bidBundle\\\":\\\"([^\\\"]+)\\\"");
            Logger.d(f44933e, "Regex LIFTOFF_BIDBUNDLE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return H;
    }

    public static String a(String str) {
        return aN.replace("<TAG_NAME>", str);
    }

    public static Pattern aK() {
        if (f44931c == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44931c = Pattern.compile("trackingUrl = (\\'|\\\\\\\"|\\\")(.*?)(\\'|\\\\\\\"|\\\")(;| \\+)", 2);
            Logger.d(f44933e, "Regex APPLOVIN_MRAID_CLICK_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44931c;
    }

    public static Pattern aL() {
        if (f44927bd == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44927bd = Pattern.compile("OMG\\s+=\\s+.+\"clickUrl\".+?\"(.+?)\"");
            Logger.d(f44933e, "Regex MINTEGRAL_DSP_MULTI_CLICK_URL initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44927bd;
    }

    public static Pattern aM() {
        if (f44928be == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44928be = Pattern.compile("OMG\\s+=.*config\\\\\".?\\\\\"(.*?)\\\\\"");
            Logger.d(f44933e, "Regex MINTEGRAL_MOREOFFER_CONFIG initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44928be;
    }

    public static Pattern aN() {
        if (f44929bf == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44929bf = Pattern.compile("\"(<.*>)");
            Logger.d(f44933e, "Regex HTML_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44929bf;
    }

    public static Pattern aO() {
        if (aG == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aG = Pattern.compile("(?:%3C|\\\\+x3c|<|&lt;|&amp;lt;)a .*?href(?:\\\\+x3D|%3d|=)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)(.*?)(?:\\\\+x22|%22|\\\\*\"|&amp;quot;|\\\\*&quot;|\\\\*u0026|quot;|\\\\+x27|%27|\\\\*'|'|&amp;#39;|\\\\*&#39;)");
            Logger.d(f44933e, "Regex HTML_ANCHOR_REF_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return aG;
    }

    public static Pattern aP() {
        if (az == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            az = Pattern.compile("encrypted-tbn\\d*\\.gstatic.com/shopping\\?q");
            Logger.d(f44933e, "Regex ADMOB_SHOPPING_COLLAGE_URL_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return az;
    }

    public static Pattern aQ() {
        if (f44932d == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f44932d = Pattern.compile("\\\"clcode\\\":\\\"(\\S*?)\\\"");
            Logger.d(f44933e, "Regex APPLOVIN_CLCODE_PATTERN initialized, operation took " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
        }
        return f44932d;
    }
}
