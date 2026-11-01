package sg.bigo.ads.core.g.a;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.ironsource.Mf;
import com.safedk.android.internal.SafeDKWebAppInterface;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.i;
import sg.bigo.ads.core.g.d;
import sg.bigo.ads.core.g.e;
import sg.bigo.ads.core.g.f;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends sg.bigo.ads.core.h.b implements sg.bigo.ads.core.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public e f71499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f71500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f71501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f71502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.ac.a f71503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicBoolean f71504f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f71505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f f71506l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f71507m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f71508n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f71509o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f71510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    private final i f71511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicBoolean f71512r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f71513s;

    public interface a {
        void a();
    }

    public b(Context context, String str, int i10, int i11, @NonNull f fVar, @Nullable String str2, int i12, t tVar) {
        super(context);
        this.f71511q = new i();
        this.f71504f = new AtomicBoolean(false);
        this.f71513s = true;
        this.f71505k = str;
        this.f71509o = i10;
        this.f71510p = i11;
        this.f71506l = fVar;
        this.f71507m = str2;
        this.f71508n = i12;
        this.f71502d = tVar;
        this.f71512r = new AtomicBoolean(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setMediaPlaybackRequiresUserGesture(true);
        setScrollContainer(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setBackgroundColor(0);
        this.f71503e = new sg.bigo.ads.common.ac.a(getContext());
        setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.g.a.b.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                b.this.f71504f.set(false);
                b.this.f71503e.onTouchEvent(motionEvent);
                return false;
            }
        });
        setWebViewClient(new c(str) { // from class: sg.bigo.ads.core.g.a.b.2
            @Override // sg.bigo.ads.core.g.a.c, sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                b bVar = b.this;
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                a aVar = bVar.f71500b;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(@NonNull WebView webView, @NonNull String str3) {
                super.onPageFinished(webView, str3);
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "onPageFinished: ".concat(String.valueOf(str3)));
                if (b.this.f71512r.compareAndSet(false, true)) {
                    final b bVar = b.this;
                    final ValueCallback<String> valueCallback = new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.2.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str4) {
                            String str5 = str4;
                            b.this.f71502d.b(1);
                            b.this.f71502d.f69427a = str5 != null ? str5 : "";
                            StringBuilder sb2 = new StringBuilder("handshakeVersion: ");
                            if (str5 == null) {
                                str5 = "";
                            }
                            sb2.append(str5);
                            sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", sb2.toString());
                        }
                    };
                    bVar.f71502d.a(1);
                    bVar.evaluateJavascript("window.vpaidwrapper.handshakeVersion('2.0')", new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.6
                        @Override // android.webkit.ValueCallback
                        public final /* bridge */ /* synthetic */ void onReceiveValue(String str4) {
                            valueCallback.onReceiveValue(str4);
                        }
                    });
                    b.this.b();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(@NonNull WebView webView, int i13, @NonNull String str3, @NonNull String str4) {
                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Error: ".concat(String.valueOf(str3)));
                super.onReceivedError(webView, i13, str3, str4);
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0175  */
            /* JADX WARN: Code duplicated, block: B:103:0x017f  */
            /* JADX WARN: Code duplicated, block: B:104:0x0183  */
            /* JADX WARN: Code duplicated, block: B:107:0x018c  */
            /* JADX WARN: Code duplicated, block: B:108:0x018e  */
            /* JADX WARN: Code duplicated, block: B:111:0x0197  */
            /* JADX WARN: Code duplicated, block: B:112:0x0199  */
            /* JADX WARN: Code duplicated, block: B:115:0x01a2  */
            /* JADX WARN: Code duplicated, block: B:116:0x01a4  */
            /* JADX WARN: Code duplicated, block: B:119:0x01ad  */
            /* JADX WARN: Code duplicated, block: B:120:0x01af  */
            /* JADX WARN: Code duplicated, block: B:123:0x01b8  */
            /* JADX WARN: Code duplicated, block: B:124:0x01ba  */
            /* JADX WARN: Code duplicated, block: B:127:0x01c3  */
            /* JADX WARN: Code duplicated, block: B:128:0x01c5  */
            /* JADX WARN: Code duplicated, block: B:131:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:132:0x01d0  */
            /* JADX WARN: Code duplicated, block: B:135:0x01d9  */
            /* JADX WARN: Code duplicated, block: B:139:0x01e3  */
            /* JADX WARN: Code duplicated, block: B:141:0x01e7  */
            /* JADX WARN: Code duplicated, block: B:142:0x01ec  */
            /* JADX WARN: Code duplicated, block: B:144:0x01f0  */
            /* JADX WARN: Code duplicated, block: B:145:0x01f5  */
            /* JADX WARN: Code duplicated, block: B:147:0x01f9  */
            /* JADX WARN: Code duplicated, block: B:148:0x020b  */
            /* JADX WARN: Code duplicated, block: B:150:0x020f  */
            /* JADX WARN: Code duplicated, block: B:151:0x021a  */
            /* JADX WARN: Code duplicated, block: B:153:0x021e  */
            /* JADX WARN: Code duplicated, block: B:154:0x023b  */
            /* JADX WARN: Code duplicated, block: B:156:0x023f  */
            /* JADX WARN: Code duplicated, block: B:157:0x0244  */
            /* JADX WARN: Code duplicated, block: B:159:0x0248  */
            /* JADX WARN: Code duplicated, block: B:160:0x025a  */
            /* JADX WARN: Code duplicated, block: B:162:0x025e  */
            /* JADX WARN: Code duplicated, block: B:163:0x0263  */
            /* JADX WARN: Code duplicated, block: B:165:0x0267  */
            /* JADX WARN: Code duplicated, block: B:166:0x026c  */
            /* JADX WARN: Code duplicated, block: B:168:0x0270  */
            /* JADX WARN: Code duplicated, block: B:169:0x0275  */
            /* JADX WARN: Code duplicated, block: B:171:0x0283  */
            /* JADX WARN: Code duplicated, block: B:172:0x0288  */
            /* JADX WARN: Code duplicated, block: B:173:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:175:0x02c1  */
            /* JADX WARN: Code duplicated, block: B:176:0x02d2  */
            /* JADX WARN: Code duplicated, block: B:178:0x02d6  */
            /* JADX WARN: Code duplicated, block: B:179:0x02db  */
            /* JADX WARN: Code duplicated, block: B:181:0x02e4  */
            /* JADX WARN: Code duplicated, block: B:182:0x02ef  */
            /* JADX WARN: Code duplicated, block: B:184:0x02f8  */
            /* JADX WARN: Code duplicated, block: B:185:0x02fd  */
            /* JADX WARN: Code duplicated, block: B:187:0x0301  */
            /* JADX WARN: Code duplicated, block: B:188:0x0306  */
            /* JADX WARN: Code duplicated, block: B:193:0x034e  */
            /* JADX WARN: Code duplicated, block: B:195:0x0352  */
            /* JADX WARN: Code duplicated, block: B:196:0x0356  */
            /* JADX WARN: Code duplicated, block: B:198:0x035a  */
            /* JADX WARN: Code duplicated, block: B:199:0x035e  */
            /* JADX WARN: Code duplicated, block: B:201:0x0362  */
            /* JADX WARN: Code duplicated, block: B:202:0x0373  */
            /* JADX WARN: Code duplicated, block: B:204:0x0377  */
            /* JADX WARN: Code duplicated, block: B:205:0x037b  */
            /* JADX WARN: Code duplicated, block: B:207:0x037f  */
            /* JADX WARN: Code duplicated, block: B:208:0x038f  */
            /* JADX WARN: Code duplicated, block: B:210:0x0393  */
            /* JADX WARN: Code duplicated, block: B:211:0x0397  */
            /* JADX WARN: Code duplicated, block: B:213:0x039b  */
            /* JADX WARN: Code duplicated, block: B:214:0x03a5  */
            /* JADX WARN: Code duplicated, block: B:216:0x03ae  */
            /* JADX WARN: Code duplicated, block: B:217:0x03b2  */
            /* JADX WARN: Code duplicated, block: B:219:0x03b6  */
            /* JADX WARN: Code duplicated, block: B:21:0x0045  */
            /* JADX WARN: Code duplicated, block: B:24:0x0058 A[LOOP:0: B:22:0x0052->B:24:0x0058, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:28:0x0079  */
            /* JADX WARN: Code duplicated, block: B:31:0x0083  */
            /* JADX WARN: Code duplicated, block: B:32:0x0087  */
            /* JADX WARN: Code duplicated, block: B:35:0x0091  */
            /* JADX WARN: Code duplicated, block: B:36:0x0095  */
            /* JADX WARN: Code duplicated, block: B:39:0x009f  */
            /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
            /* JADX WARN: Code duplicated, block: B:43:0x00ad  */
            /* JADX WARN: Code duplicated, block: B:44:0x00b1  */
            /* JADX WARN: Code duplicated, block: B:47:0x00bb  */
            /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
            /* JADX WARN: Code duplicated, block: B:51:0x00c9  */
            /* JADX WARN: Code duplicated, block: B:52:0x00cd  */
            /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
            /* JADX WARN: Code duplicated, block: B:56:0x00db  */
            /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
            /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
            /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
            /* JADX WARN: Code duplicated, block: B:64:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:67:0x0101  */
            /* JADX WARN: Code duplicated, block: B:68:0x0105  */
            /* JADX WARN: Code duplicated, block: B:71:0x010f  */
            /* JADX WARN: Code duplicated, block: B:72:0x0113  */
            /* JADX WARN: Code duplicated, block: B:75:0x011d  */
            /* JADX WARN: Code duplicated, block: B:76:0x0121  */
            /* JADX WARN: Code duplicated, block: B:79:0x012b  */
            /* JADX WARN: Code duplicated, block: B:80:0x012f  */
            /* JADX WARN: Code duplicated, block: B:83:0x0139  */
            /* JADX WARN: Code duplicated, block: B:84:0x013d  */
            /* JADX WARN: Code duplicated, block: B:87:0x0147  */
            /* JADX WARN: Code duplicated, block: B:88:0x014b  */
            /* JADX WARN: Code duplicated, block: B:91:0x0155  */
            /* JADX WARN: Code duplicated, block: B:92:0x0159  */
            /* JADX WARN: Code duplicated, block: B:95:0x0163  */
            /* JADX WARN: Code duplicated, block: B:96:0x0167  */
            /* JADX WARN: Code duplicated, block: B:99:0x0171  */
            /* JADX WARN: Instruction removed from duplicated block: B:172:0x0288, please report this as an issue */
            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(@NonNull WebView webView, String str3) {
                HashMap map;
                e eVar;
                e eVar2;
                e eVar3;
                e eVar4;
                e eVar5;
                e eVar6;
                e eVar7;
                e eVar8;
                e eVar9;
                e eVar10;
                e eVar11;
                e eVar12;
                e eVar13;
                e eVar14;
                e eVar15;
                e eVar16;
                e eVar17;
                e eVar18;
                e eVar19;
                e eVar20;
                e eVar21;
                e eVar22;
                e eVar23;
                e eVar24;
                e eVar25;
                b bVar = b.this;
                try {
                    Uri uri = Uri.parse(str3);
                    if (uri != null) {
                        String scheme = uri.getScheme();
                        String host = uri.getHost();
                        if (host != null) {
                            if ("vpaid".equals(scheme)) {
                                map = new HashMap();
                                for (String str4 : uri.getQueryParameterNames()) {
                                    map.put(str4, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str4)));
                                }
                                switch (host) {
                                    case "onAdSkippableStateChange":
                                        eVar = bVar.f71499a;
                                        if (eVar != null) {
                                            eVar.g();
                                            break;
                                        }
                                        break;
                                    case "onAdVideoStart":
                                        bVar.f71502d.b(3);
                                        eVar2 = bVar.f71499a;
                                        if (eVar2 != null) {
                                            eVar2.b();
                                            break;
                                        }
                                        break;
                                    case "onAdLog":
                                        eVar3 = bVar.f71499a;
                                        if (eVar3 != null) {
                                            eVar3.b((String) map.get("message"));
                                            break;
                                        }
                                        break;
                                    case "onAdVideoMidpoint":
                                        eVar4 = bVar.f71499a;
                                        if (eVar4 != null) {
                                            eVar4.d();
                                            break;
                                        }
                                        break;
                                    case "onAdExpandedChange":
                                        eVar5 = bVar.f71499a;
                                        if (eVar5 != null) {
                                            eVar5.a(d.c((String) map.get("expanded")));
                                            break;
                                        }
                                        break;
                                    case "onAdVideoFirstQuartile":
                                        eVar6 = bVar.f71499a;
                                        if (eVar6 != null) {
                                            eVar6.c();
                                            break;
                                        }
                                        break;
                                    case "onAdDurationChange":
                                        eVar7 = bVar.f71499a;
                                        if (eVar7 != null) {
                                            eVar7.a((int) d.b((String) map.get("duration")));
                                            break;
                                        }
                                        break;
                                    case "onStartAd":
                                        eVar8 = bVar.f71499a;
                                        if (eVar8 != null) {
                                            eVar8.j();
                                            break;
                                        }
                                        break;
                                    case "onAdVideoComplete":
                                        eVar9 = bVar.f71499a;
                                        if (eVar9 != null) {
                                            eVar9.f();
                                            break;
                                        }
                                        break;
                                    case "onAdClickThru":
                                        bVar.f71502d.a((String) map.get("url"), (String) map.get("id"), d.c((String) map.get("playerHandles")));
                                        if (bVar.f71499a != null && bVar.f71504f.compareAndSet(false, true)) {
                                            bVar.f71499a.a((String) map.get("url"), (String) map.get("id"), d.c((String) map.get("playerHandles")));
                                            break;
                                        }
                                        break;
                                    case "onAdPlaying":
                                        eVar10 = bVar.f71499a;
                                        if (eVar10 != null) {
                                            eVar10.i();
                                            break;
                                        }
                                        break;
                                    case "onAdImpression":
                                        bVar.f71502d.b(4);
                                        eVar11 = bVar.f71499a;
                                        if (eVar11 != null) {
                                            eVar11.a();
                                            break;
                                        }
                                        break;
                                    case "onAdError":
                                        sg.bigo.ads.common.n.d.a(bVar.f71501c);
                                        eVar12 = bVar.f71499a;
                                        if (eVar12 != null) {
                                            eVar12.a((String) map.get("message"));
                                            break;
                                        }
                                        break;
                                    case "onAdUserAcceptInvitation":
                                        eVar13 = bVar.f71499a;
                                        if (eVar13 != null) {
                                            eVar13.n();
                                            break;
                                        }
                                        break;
                                    case "onAdLinearChange":
                                        eVar14 = bVar.f71499a;
                                        if (eVar14 != null) {
                                            eVar14.b(d.c((String) map.get("adLinear")));
                                            break;
                                        }
                                        break;
                                    case "VPAIDCreativeError":
                                        sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "VPAID error, command=" + ((String) map.get(com.ironsource.sdk.controller.f.b.f30923g)) + ", message=" + ((String) map.get(NotificationCompat.CATEGORY_MESSAGE)) + ", try to rePrepareAd.");
                                        bVar.b();
                                        break;
                                    case "onAdLoaded":
                                        sg.bigo.ads.common.n.d.a(bVar.f71501c);
                                        bVar.f71502d.b(2);
                                        eVar15 = bVar.f71499a;
                                        if (eVar15 != null) {
                                            eVar15.h();
                                            break;
                                        }
                                        break;
                                    case "onAdPaused":
                                        eVar16 = bVar.f71499a;
                                        if (eVar16 != null) {
                                            eVar16.m();
                                            break;
                                        }
                                        break;
                                    case "onSkipAd":
                                        eVar17 = bVar.f71499a;
                                        if (eVar17 != null) {
                                            eVar17.l();
                                            break;
                                        }
                                        break;
                                    case "onStopAd":
                                        eVar18 = bVar.f71499a;
                                        if (eVar18 != null) {
                                            eVar18.k();
                                            break;
                                        }
                                        break;
                                    case "onAdRemainingTimeChange":
                                        eVar19 = bVar.f71499a;
                                        if (eVar19 != null) {
                                            eVar19.b((int) d.b((String) map.get("remaining")));
                                            break;
                                        }
                                        break;
                                    case "onAdVideoThirdQuartile":
                                        eVar20 = bVar.f71499a;
                                        if (eVar20 != null) {
                                            eVar20.e();
                                            break;
                                        }
                                        break;
                                    case "onAdSizeChange":
                                        eVar21 = bVar.f71499a;
                                        if (eVar21 != null) {
                                            eVar21.a(d.a((String) map.get("w")), d.a((String) map.get("h")));
                                            break;
                                        }
                                        break;
                                    case "onAdInteraction":
                                        eVar22 = bVar.f71499a;
                                        if (eVar22 != null) {
                                            eVar22.c((String) map.get("id"));
                                            break;
                                        }
                                        break;
                                    case "onAdVolumeChange":
                                        eVar23 = bVar.f71499a;
                                        if (eVar23 != null) {
                                            eVar23.a(d.a((String) map.get("volume")));
                                            break;
                                        }
                                        break;
                                    case "onAdUserMinimize":
                                        eVar24 = bVar.f71499a;
                                        if (eVar24 != null) {
                                            eVar24.o();
                                            break;
                                        }
                                        break;
                                    case "onAdUserClose":
                                        eVar25 = bVar.f71499a;
                                        if (eVar25 != null) {
                                            eVar25.p();
                                            break;
                                        }
                                        break;
                                }
                                bVar.a("window.vpaidwrapper.nativeCallComplete(" + JSONObject.quote(host) + ")");
                            } else {
                                sg.bigo.ads.common.ac.a aVar = bVar.f71503e;
                                if (!(aVar != null && aVar.f69485a.f69488a)) {
                                    map = new HashMap();
                                    while (r2.hasNext()) {
                                        map.put(str4, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str4)));
                                    }
                                    switch (host) {
                                        case -1657484168:
                                            if (host.equals("onAdSkippableStateChange")) {
                                            }
                                            break;
                                        case -1633535831:
                                            if (host.equals("onAdVideoStart")) {
                                            }
                                            break;
                                        case -1354015358:
                                            if (host.equals("onAdLog")) {
                                            }
                                            break;
                                        case -1347047775:
                                            if (host.equals("onAdVideoMidpoint")) {
                                            }
                                            break;
                                        case -1160015669:
                                            if (host.equals("onAdExpandedChange")) {
                                            }
                                            break;
                                        case -742226534:
                                            if (host.equals("onAdVideoFirstQuartile")) {
                                            }
                                            break;
                                        case -609164954:
                                            if (host.equals("onAdDurationChange")) {
                                            }
                                            break;
                                        case -560906938:
                                            if (host.equals("onStartAd")) {
                                            }
                                            break;
                                        case -307657838:
                                            if (host.equals("onAdVideoComplete")) {
                                            }
                                            break;
                                        case -164095715:
                                            if (host.equals("onAdClickThru")) {
                                            }
                                            break;
                                        case 98253676:
                                            if (host.equals("onAdPlaying")) {
                                            }
                                            break;
                                        case 116028939:
                                            if (host.equals("onAdImpression")) {
                                            }
                                            break;
                                        case 159970502:
                                            if (host.equals("onAdError")) {
                                            }
                                            break;
                                        case 183427630:
                                            if (host.equals("onAdUserAcceptInvitation")) {
                                            }
                                            break;
                                        case 590531255:
                                            if (host.equals("onAdLinearChange")) {
                                            }
                                            break;
                                        case 652779159:
                                            if (host.equals("VPAIDCreativeError")) {
                                            }
                                            break;
                                        case 861234439:
                                            if (host.equals(Mf.f27060j)) {
                                            }
                                            break;
                                        case 963431984:
                                            if (host.equals("onAdPaused")) {
                                            }
                                            break;
                                        case 1497850049:
                                            if (host.equals("onSkipAd")) {
                                            }
                                            break;
                                        case 1506340484:
                                            if (host.equals("onStopAd")) {
                                            }
                                            break;
                                        case 1648218545:
                                            if (host.equals("onAdRemainingTimeChange")) {
                                            }
                                            break;
                                        case 1654690129:
                                            if (host.equals("onAdVideoThirdQuartile")) {
                                            }
                                            break;
                                        case 1697251091:
                                            if (host.equals("onAdSizeChange")) {
                                            }
                                            break;
                                        case 1701669456:
                                            if (host.equals("onAdInteraction")) {
                                            }
                                            break;
                                        case 2014353132:
                                            if (host.equals("onAdVolumeChange")) {
                                            }
                                            break;
                                        case 2047444747:
                                            if (host.equals("onAdUserMinimize")) {
                                            }
                                            break;
                                        case 2114403499:
                                            if (host.equals("onAdUserClose")) {
                                            }
                                            break;
                                    }
                                    /*  JADX ERROR: Method code generation error
                                        java.lang.NullPointerException: Switch insn not found in header
                                        	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                        */
                                    /*
                                        Method dump skipped, instruction units count: 1148
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.g.a.b.AnonymousClass2.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
                                }
                            });
                            setWebChromeClient(new sg.bigo.ads.core.h.c() { // from class: sg.bigo.ads.core.g.a.b.3
                                @Override // android.webkit.WebChromeClient
                                public final boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
                                    return super.onConsoleMessage(consoleMessage);
                                }
                            });
                            sg.bigo.ads.common.n.d.a(this.f71501c);
                            if (this.f71501c == null) {
                                this.f71501c = new Runnable() { // from class: sg.bigo.ads.core.g.a.b.4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (b.this.f71499a != null) {
                                            b.this.f71499a.a("vpaid prepare timeout");
                                        }
                                    }
                                };
                            }
                            sg.bigo.ads.common.n.d.a(3, this.f71501c, 15000L);
                            loadDataWithBaseURL("http://127.0.0.1/", "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>VPAID AD</title>\n    <script>\n        window.onload = function() {\n            tryToPrepareAd();\n        }\n\n        document.onreadystatechange = function() {\n            tryToPrepareAd();\n        }\n\n        function tryToPrepareAd() {\n            if (document.readyState != \"complete\") {\n                return;\n            }\n\n            if (window.vpaidwrapper && window.vpaidwrapper.isVPAIDCreativeReady()) {\n                return;\n            }\n\n            window.vpaidframe = document.getElementById(\"vpaid-iframe\");\n            if (window.vpaidframe) {\n                var fn = window.vpaidframe.contentWindow['getVPAIDAd'];\n                var vpaidDiv = document.getElementById(\"vpaid-container\");\n                var vpaidframeDoc = window.vpaidframe.contentDocument || window.vpaidframe.contentWindow.document;\n                var slot = vpaidframeDoc.getElementById(\"slot\");\n                var videoSlot = document.getElementById(\"video-slot\");\n                var vpaidwrapper;\n                if (fn && typeof fn == 'function') {\n                    vpaidwrapper = new VPAIDWrapper(fn(), vpaidDiv, slot, videoSlot)\n                } else {\n                    vpaidwrapper = new VPAIDWrapper();\n                }\n                window.vpaidwrapper = vpaidwrapper;\n            }\n        }\n    </script>\n    <script src=\"vpaid.js\" type=\"text/javascript\"></script>\n</head>\n\n<body style=\"display: flex; justify-content: center; align-items: center;\">\n<div id=\"ad-container\">\n    <video height=\"100%\" id=\"video-slot\" muted playsinline width=\"100%\"></video>\n</div>\n<div id=\"vpaid-container\"\n     style=\"position: absolute; width: 100%; height: 100%; margin: 0px; padding: 0px; border: none;\">\n    <iframe frameborder=\"0\" height=\"100%\" id=\"vpaid-iframe\" marginheight=\"0\" marginwidth=\"0\"\n            scrolling=\"no\"\n            src=\"vpaid_iframe.html\"\n            style=\"margin: 0px; padding: 0px; border: none;\"\n            width=\"100%\"></iframe>\n</div>\n</body>\n</html>", "text/html", "UTF-8", null);
                            setLayoutParams((i12 == 1 || i12 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
                        }

                        private void a(int i10, int i11) {
                            t tVar = this.f71502d;
                            if (tVar == null || !tVar.f69436j) {
                                return;
                            }
                            a("window.vpaidwrapper.resizeAd(" + sg.bigo.ads.common.utils.e.c(getContext(), i10) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), i11) + ", " + JSONObject.quote(this.f71506l.f71529d) + ")");
                        }

                        @Nullable
                        private String b(@NonNull String str) {
                            final CountDownLatch countDownLatch = new CountDownLatch(1);
                            final String[] strArr = new String[1];
                            evaluateJavascript(str, new ValueCallback<String>() { // from class: sg.bigo.ads.core.g.a.b.5
                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(String str2) {
                                    countDownLatch.countDown();
                                    strArr[0] = str2;
                                }
                            });
                            try {
                                countDownLatch.await(1L, TimeUnit.SECONDS);
                            } catch (Exception unused) {
                            }
                            return strArr[0];
                        }

                        private void b(int i10, int i11) {
                            setMeasuredDimension(i10, i11);
                            a(i10, i11);
                        }

                        @Override // sg.bigo.ads.api.c.a
                        public final void a() {
                            a("window.vpaidwrapper.pauseAd()");
                        }

                        public final void a(@NonNull String str) {
                            if (!this.f71512r.get()) {
                                sg.bigo.ads.common.t.a.a(0, "VPAIDWebView", "Injecting Javascript into VPAID WebView error, creative no ready:\n\t".concat(String.valueOf(str)));
                            } else {
                                sg.bigo.ads.common.t.a.a(0, 3, "VPAIDWebView", "Injecting Javascript into VPAID WebView:\n\t".concat(String.valueOf(str)));
                                loadUrl(SafeDKWebAppInterface.f44738f.concat(String.valueOf(str)));
                            }
                        }

                        public final void b() {
                            a("tryToPrepareAd()");
                            int measuredWidth = getMeasuredWidth();
                            int measuredHeight = getMeasuredHeight();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                String str = this.f71507m;
                                if (str == null) {
                                    str = "";
                                }
                                jSONObject.putOpt(VastTagName.AD_PARAMETERS, str);
                            } catch (JSONException unused) {
                            }
                            this.f71502d.a(2);
                            a("window.vpaidwrapper.initAd(" + sg.bigo.ads.common.utils.e.c(getContext(), measuredWidth) + ", " + sg.bigo.ads.common.utils.e.c(getContext(), measuredHeight) + ", " + JSONObject.quote(this.f71506l.f71529d) + ", -1, " + jSONObject + ")");
                        }

                        @Override // sg.bigo.ads.core.h.e, android.webkit.WebView
                        public final void destroy() {
                            super.destroy();
                            setWebChromeClient(null);
                            setWebViewClient(null);
                        }

                        @Override // sg.bigo.ads.core.h.e, android.view.ViewGroup, android.view.View
                        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                            if (motionEvent.getActionMasked() == 1) {
                                this.f71511q.f69740b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                this.f71511q.f69739a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
                            }
                            return this.f71513s && super.dispatchTouchEvent(motionEvent);
                        }

                        public final String getAdCompanions() {
                            return b("window.vpaidwrapper.getAdCompanions()");
                        }

                        public final int getAdDuration() {
                            return (int) d.b(b("window.vpaidwrapper.getAdDuration()"));
                        }

                        public final boolean getAdExpanded() {
                            return d.c(b("window.vpaidwrapper.getAdExpanded()"));
                        }

                        public final int getAdHeight() {
                            return d.a(b("window.vpaidwrapper.getAdHeight()"));
                        }

                        public final boolean getAdIcons() {
                            return d.c(b("window.vpaidwrapper.getAdIcons()"));
                        }

                        public final boolean getAdLinear() {
                            return d.c(b("window.vpaidwrapper.getAdLinear()"));
                        }

                        public final int getAdRemainingTime() {
                            return (int) d.b(b("window.vpaidwrapper.getAdRemainingTime()"));
                        }

                        public final boolean getAdSkippableState() {
                            return d.c(b("window.vpaidwrapper.getAdSkippableState()"));
                        }

                        public final float getAdVolume() {
                            return d.b(b("window.vpaidwrapper.getAdVolume()"));
                        }

                        public final int getAdWidth() {
                            return d.a(b("window.vpaidwrapper.getAdWidth()"));
                        }

                        @NonNull
                        public final i getClickPoints() {
                            return this.f71511q;
                        }

                        @Nullable
                        public final e getVPAIDEvenListener() {
                            return this.f71499a;
                        }

                        /* JADX WARN: Code duplicated, block: B:37:0x00ac A[PHI: r0 r3
  0x00ac: PHI (r0v10 int) = (r0v9 int), (r0v11 int) binds: [B:36:0x00aa, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x00ac: PHI (r3v6 int) = (r3v5 int), (r3v8 int) binds: [B:36:0x00aa, B:33:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
                        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
                        
                            if (r0 != 4) goto L39;
                         */
                        @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onMeasure(int r13, int r14) {
                            /*
                                Method dump skipped, instruction units count: 202
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.g.a.b.onMeasure(int, int):void");
                        }

                        public final void setAdVolume(float f10) {
                            a("window.vpaidwrapper.setAdVolume(" + f10 + ")");
                        }

                        public final void setOnRenderProcessGoneListener(@Nullable a aVar) {
                            this.f71500b = aVar;
                        }

                        public final void setVPAIDClickable(boolean z10) {
                            this.f71513s = z10;
                        }

                        public final void setVPAIDEvenListener(@Nullable e eVar) {
                            this.f71499a = eVar;
                        }
                    }
