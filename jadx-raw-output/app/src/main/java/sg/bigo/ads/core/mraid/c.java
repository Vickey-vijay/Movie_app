package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinMediationProvider;
import com.ironsource.C3426d4;
import com.safedk.android.internal.SafeDKWebAppInterface;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public b f71607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public C0741c f71608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.ac.a f71609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f71610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f71611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final n f71612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final h f71613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WebViewClient f71614h;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71621a;

        static {
            int[] iArr = new int[g.values().length];
            f71621a = iArr;
            try {
                iArr[g.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71621a[g.RESIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71621a[g.UNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71621a[g.EXPAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71621a[g.USE_CUSTOM_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71621a[g.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71621a[g.SET_ORIENTATION_PROPERTIES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f71621a[g.PLAY_VIDEO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f71621a[g.STORE_PICTURE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f71621a[g.CREATE_CALENDAR_EVENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f71621a[g.UNSPECIFIED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public interface a extends b {
        void a(String str, String str2);
    }

    public interface b {
        void a();

        void a(int i10, int i11, int i12, int i13, @NonNull sg.bigo.ads.core.mraid.a.a.EnumC0740a enumC0740a, boolean z10);

        void a(String str);

        void a(String str, @Nullable sg.bigo.ads.common.i iVar);

        void a(String str, boolean z10);

        void a(sg.bigo.ads.core.mraid.b bVar);

        void a(boolean z10);

        void a(boolean z10, i iVar);

        boolean a(@NonNull JsResult jsResult);

        void b();

        void b(boolean z10);

        void c();

        boolean d();

        void e();

        void f();
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$c, reason: collision with other inner class name */
    public static class C0741c extends sg.bigo.ads.core.h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public p f71622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f71623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private a f71624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private sg.bigo.ads.common.i f71625d;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.c$c$a */
        public interface a {
            void a(sg.bigo.ads.core.mraid.b bVar);

            void a(boolean z10);
        }

        private C0741c(Context context) {
            super(context);
            this.f71625d = new sg.bigo.ads.common.i();
            this.f71622a = new p(this);
            this.f71622a.f71738d = new p.b() { // from class: sg.bigo.ads.core.mraid.c.c.1
                @Override // sg.bigo.ads.core.mraid.p.b
                public final void a(boolean z10, sg.bigo.ads.core.mraid.b bVar) {
                    C0741c.this.setMraidViewable(z10);
                    C0741c.a(C0741c.this, bVar);
                }
            };
        }

        public /* synthetic */ C0741c(Context context, byte b10) {
            this(context);
        }

        public static /* synthetic */ void a(C0741c c0741c, sg.bigo.ads.core.mraid.b bVar) {
            a aVar = c0741c.f71624c;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMraidViewable(boolean z10) {
            if (this.f71623b == z10) {
                return;
            }
            this.f71623b = z10;
            a aVar = this.f71624c;
            if (aVar != null) {
                aVar.a(z10);
            }
        }

        @Override // sg.bigo.ads.core.h.e, android.webkit.WebView
        public final void destroy() {
            super.destroy();
            setWebChromeClient(null);
            setWebViewClient(null);
            this.f71622a = null;
            this.f71624c = null;
        }

        @Nullable
        public final sg.bigo.ads.common.i getClickPoints() {
            return this.f71625d;
        }

        @Override // android.webkit.WebView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.f71625d.f69740b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.f71625d.f69739a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        public final void onVisibilityChanged(@NonNull View view, int i10) {
            super.onVisibilityChanged(view, i10);
            if (this.f71622a == null) {
                setMraidViewable(i10 == 0);
            } else if (i10 != 0) {
                setMraidViewable(false);
            }
        }

        public final void setVisibilityChangedListener(@Nullable a aVar) {
            this.f71624c = aVar;
        }
    }

    public c(@Nullable n nVar) {
        this(nVar, new h());
    }

    @VisibleForTesting
    private c(@Nullable n nVar, @NonNull h hVar) {
        this.f71611e = false;
        this.f71614h = new k() { // from class: sg.bigo.ads.core.mraid.c.4
            @Override // sg.bigo.ads.core.mraid.k, sg.bigo.ads.core.h.d
            public final void a(RenderProcessGoneDetail renderProcessGoneDetail) {
                c cVar = c.this;
                sg.bigo.ads.common.t.a.a(0, "MraidBridge", (renderProcessGoneDetail == null || !renderProcessGoneDetail.didCrash()) ? "Render process is gone" : "Render process has crashed");
                cVar.a();
                b bVar = cVar.f71607a;
                if (bVar != null) {
                    bVar.c();
                }
            }

            @Override // sg.bigo.ads.core.h.d, android.webkit.WebViewClient
            public final void onPageFinished(@NonNull WebView webView, @NonNull String str) {
                p pVar;
                super.onPageFinished(webView, str);
                c cVar = c.this;
                if (cVar.f71610d) {
                    return;
                }
                cVar.f71610d = true;
                C0741c c0741c = cVar.f71608b;
                if (c0741c != null && (pVar = c0741c.f71622a) != null && !pVar.f71739e) {
                    pVar.f71739e = true;
                    pVar.f71737c.postDelayed(pVar.f71736b, 500L);
                }
                b bVar = cVar.f71607a;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(@NonNull WebView webView, int i10, @NonNull String str, @NonNull String str2) {
                sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Error: ".concat(String.valueOf(str)));
                super.onReceivedError(webView, i10, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(@NonNull WebView webView, String str) {
                return c.this.d(str);
            }
        };
        this.f71612f = nVar;
        this.f71613g = hVar;
    }

    private static int a(int i10, int i11) throws d {
        if (i10 < i11 || i10 > 100000) {
            throw new d("Integer parameter out of range: ".concat(String.valueOf(i10)));
        }
        return i10;
    }

    @NonNull
    private static String a(Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }

    @NonNull
    private static Map<String, String> a(@NonNull Uri uri) {
        HashMap map = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            map.put(str, TextUtils.join(StringUtils.COMMA, uri.getQueryParameters(str)));
        }
        return map;
    }

    @Nullable
    public static C0741c a(@NonNull Context context) {
        try {
            return new C0741c(context, (byte) 0);
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(e10));
            return null;
        }
    }

    private static boolean a(@Nullable String str, boolean z10) {
        return str == null ? z10 : g(str);
    }

    private static boolean a(@NonNull Map<String, String> map) {
        return a(map.get("shouldUseCustomClose"), false);
    }

    @NonNull
    private static String b(Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    private boolean d() {
        sg.bigo.ads.common.ac.a aVar = this.f71609c;
        if (aVar == null) {
            return false;
        }
        if (this.f71611e) {
            return aVar.f69485a.f69488a;
        }
        return aVar.a();
    }

    private static String e(String str) throws d {
        if (str != null) {
            return str;
        }
        throw new d("Parameter cannot be null");
    }

    private static int f(@NonNull String str) throws d {
        try {
            return Integer.parseInt(str, 10);
        } catch (NumberFormatException unused) {
            throw new d("Invalid numeric parameter: ".concat(String.valueOf(str)));
        }
    }

    private static boolean g(String str) throws d {
        if ("true".equals(str)) {
            return true;
        }
        if (com.ironsource.mediationsdk.metadata.a.f29886h.equals(str)) {
            return false;
        }
        throw new d("Invalid boolean parameter: ".concat(String.valueOf(str)));
    }

    public final void a() {
        C0741c c0741c = this.f71608b;
        if (c0741c != null) {
            c0741c.setOnTouchListener(null);
            this.f71608b.setVisibilityChangedListener(null);
            this.f71608b.destroy();
            this.f71608b = null;
        }
    }

    public final void a(@NonNull String str) {
        if (this.f71608b == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "MRAID bridge called setContentHtml before WebView was attached");
            return;
        }
        this.f71610d = false;
        sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "MraidBridge setContentHtml");
        this.f71608b.loadDataWithBaseURL("https://mraid.bigo.sg", str, "text/html", null, null);
    }

    public final void a(sg.bigo.ads.core.mraid.b bVar) {
        StringBuilder sb2 = new StringBuilder("mraidbridge.notifyExposureChangeEvent(");
        sb2.append(String.valueOf(bVar.f71604a) + ", " + sg.bigo.ads.core.mraid.b.a(bVar.f71605b) + ", " + sg.bigo.ads.core.mraid.b.a(bVar.f71606c));
        sb2.append(");");
        c(sb2.toString());
    }

    public final void a(@NonNull C0741c c0741c) {
        this.f71608b = c0741c;
        c0741c.getSettings().setJavaScriptEnabled(true);
        if (this.f71612f == n.INTERSTITIAL) {
            c0741c.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        this.f71608b.setScrollContainer(false);
        this.f71608b.setVerticalScrollBarEnabled(false);
        this.f71608b.setHorizontalScrollBarEnabled(false);
        this.f71608b.setBackgroundColor(0);
        this.f71608b.setWebViewClient(this.f71614h);
        this.f71608b.setWebChromeClient(new sg.bigo.ads.core.h.c() { // from class: sg.bigo.ads.core.mraid.c.1
            @Override // sg.bigo.ads.core.h.c
            public final void a(WebView webView, String str, String str2) {
                super.a(webView, str, str2);
                b bVar = c.this.f71607a;
                if (bVar == null || !(bVar instanceof a)) {
                    return;
                }
                ((a) bVar).a(str, str2);
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
                b bVar = c.this.f71607a;
                return bVar != null ? bVar.d() : super.onConsoleMessage(consoleMessage);
            }

            @Override // sg.bigo.ads.core.h.c, android.webkit.WebChromeClient
            public final boolean onJsAlert(@NonNull WebView webView, @NonNull String str, @NonNull String str2, @NonNull JsResult jsResult) {
                b bVar = c.this.f71607a;
                return bVar != null ? bVar.a(jsResult) : super.onJsAlert(webView, str, str2, jsResult);
            }

            @Override // android.webkit.WebChromeClient
            public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
                super.onShowCustomView(view, customViewCallback);
            }
        });
        this.f71609c = new sg.bigo.ads.common.ac.a(this.f71608b.getContext());
        this.f71608b.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.core.mraid.c.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                c.this.f71609c.onTouchEvent(motionEvent);
                int action = motionEvent.getAction();
                if ((action != 0 && action != 1) || view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            }
        });
        this.f71608b.setVisibilityChangedListener(new C0741c.a() { // from class: sg.bigo.ads.core.mraid.c.3
            @Override // sg.bigo.ads.core.mraid.c.C0741c.a
            public final void a(sg.bigo.ads.core.mraid.b bVar) {
                b bVar2 = c.this.f71607a;
                if (bVar2 != null) {
                    bVar2.a(bVar);
                }
            }

            @Override // sg.bigo.ads.core.mraid.c.C0741c.a
            public final void a(boolean z10) {
                b bVar = c.this.f71607a;
                if (bVar != null) {
                    bVar.a(z10);
                }
            }
        });
    }

    public final void a(@NonNull g gVar, @NonNull String str) {
        c("window.mraidbridge.notifyErrorEvent(" + JSONObject.quote(gVar.f71688l) + ", " + JSONObject.quote(str) + ")");
    }

    public final void a(@NonNull j jVar) {
        String str;
        StringBuilder sb2 = new StringBuilder("mraidbridge.setScreenSize(");
        sb2.append(b(jVar.f71711b));
        sb2.append(");mraidbridge.setMaxSize(");
        sb2.append(b(jVar.f71713d));
        sb2.append(");mraidbridge.setCurrentPosition(");
        sb2.append(a(jVar.f71715f));
        sb2.append(");mraidbridge.setDefaultPosition(");
        sb2.append(a(jVar.f71717h));
        sb2.append(");mraidbridge.setCurrentAppOrientation(");
        C0741c c0741c = this.f71608b;
        if (c0741c == null) {
            str = "";
        } else {
            Context context = c0741c.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            String str2 = context.getResources().getConfiguration().orientation == 2 ? C3426d4.i.C : C3426d4.i.D;
            boolean z10 = false;
            if (activity == null) {
                sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Context is not an Activity, set locked to false");
            } else if (activity.getRequestedOrientation() != -1) {
                z10 = true;
            }
            str = "'" + str2 + "', " + z10;
        }
        sb2.append(str);
        sb2.append(")");
        c(sb2.toString());
        c("mraidbridge.notifySizeChangeEvent(" + b(jVar.f71715f) + ")");
    }

    public final void a(n nVar) {
        c("mraidbridge.setPlacementType(" + JSONObject.quote(nVar.toString().toLowerCase(Locale.US)) + ")");
    }

    public final void a(o oVar) {
        c("mraidbridge.setState(" + JSONObject.quote(oVar.toString().toLowerCase(Locale.US)) + ")");
    }

    public final void a(boolean z10) {
        c("mraidbridge.setIsViewable(" + z10 + ")");
    }

    public final void a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        c("mraidbridge.setSupports(" + z10 + StringUtils.COMMA + z11 + StringUtils.COMMA + z12 + StringUtils.COMMA + z13 + StringUtils.COMMA + z14 + ")");
    }

    public final void b(String str) {
        C0741c c0741c = this.f71608b;
        if (c0741c == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "MRAID bridge called setContentHtml while WebView was not attached");
        } else {
            this.f71610d = false;
            c0741c.loadUrl(str);
        }
    }

    public final boolean b() {
        C0741c c0741c = this.f71608b;
        return c0741c != null && c0741c.f71623b;
    }

    public final void c(@NonNull String str) {
        if (this.f71608b == null) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Attempted to inject Javascript into MRAID WebView while was not attached:\n\t".concat(String.valueOf(str)));
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Injecting Javascript into MRAID WebView:\n\t".concat(String.valueOf(str)));
            this.f71608b.loadUrl(SafeDKWebAppInterface.f44738f.concat(String.valueOf(str)));
        }
    }

    public final boolean c() {
        return this.f71608b != null;
    }

    @VisibleForTesting
    public final boolean d(String str) {
        sg.bigo.ads.core.mraid.a.a.EnumC0740a enumC0740a;
        sg.bigo.ads.core.mraid.a.a.EnumC0740a enumC0740a2;
        i iVar;
        b bVar;
        try {
            Uri uri = Uri.parse(str);
            if (uri == null) {
                return true;
            }
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (AppLovinMediationProvider.MOPUB.equals(scheme)) {
                if ("failLoad".equals(host) && this.f71612f == n.INLINE && (bVar = this.f71607a) != null) {
                    bVar.b();
                }
                return true;
            }
            if (d() && !"mraid".equals(scheme)) {
                try {
                    StringBuilder sb2 = new StringBuilder("mraid://open?url=");
                    try {
                        sb2.append(URLEncoder.encode(str, "UTF-8"));
                        uri = Uri.parse(sb2.toString());
                        host = uri.getHost();
                        scheme = uri.getScheme();
                    } catch (UnsupportedEncodingException unused) {
                        sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Invalid MRAID URL encoding: ".concat(String.valueOf(str)));
                        a(g.OPEN, "Non-mraid URL is invalid");
                        return false;
                    }
                } catch (UnsupportedEncodingException unused2) {
                }
            }
            if (!"mraid".equals(scheme)) {
                sg.bigo.ads.common.ac.a aVar = this.f71609c;
                return aVar != null && aVar.a();
            }
            final g gVarA = g.a(host);
            try {
                Map<String, String> mapA = a(uri);
                if (gVarA.a(this.f71612f) && !d()) {
                    throw new d("Cannot execute this command unless the user clicks");
                }
                if (this.f71607a == null) {
                    throw new d("Invalid state to execute this command");
                }
                if (this.f71608b == null) {
                    throw new d("The current WebView is being destroyed");
                }
                switch (AnonymousClass6.f71621a[gVarA.ordinal()]) {
                    case 1:
                        this.f71607a.f();
                        break;
                    case 2:
                        int iA = a(f(mapA.get("width")), 0);
                        int iA2 = a(f(mapA.get("height")), 0);
                        int iA3 = a(f(mapA.get("offsetX")), -100000);
                        int iA4 = a(f(mapA.get("offsetY")), -100000);
                        String str2 = mapA.get("customClosePosition");
                        sg.bigo.ads.core.mraid.a.a.EnumC0740a enumC0740a3 = sg.bigo.ads.core.mraid.a.a.EnumC0740a.TOP_RIGHT;
                        if (TextUtils.isEmpty(str2)) {
                            enumC0740a2 = enumC0740a3;
                        } else {
                            if (str2.equals(C3426d4.e.f28477c)) {
                                enumC0740a = sg.bigo.ads.core.mraid.a.a.EnumC0740a.TOP_LEFT;
                            } else if (str2.equals(C3426d4.e.f28476b)) {
                                enumC0740a2 = enumC0740a3;
                            } else if (str2.equals("center")) {
                                enumC0740a = sg.bigo.ads.core.mraid.a.a.EnumC0740a.CENTER;
                            } else if (str2.equals(C3426d4.e.f28479e)) {
                                enumC0740a = sg.bigo.ads.core.mraid.a.a.EnumC0740a.BOTTOM_LEFT;
                            } else if (str2.equals(C3426d4.e.f28478d)) {
                                enumC0740a = sg.bigo.ads.core.mraid.a.a.EnumC0740a.BOTTOM_RIGHT;
                            } else if (str2.equals("top-center")) {
                                enumC0740a = sg.bigo.ads.core.mraid.a.a.EnumC0740a.TOP_CENTER;
                            } else {
                                if (!str2.equals("bottom-center")) {
                                    throw new d("Invalid close position: ".concat(str2));
                                }
                                enumC0740a = sg.bigo.ads.core.mraid.a.a.EnumC0740a.BOTTOM_CENTER;
                            }
                            enumC0740a2 = enumC0740a;
                        }
                        this.f71607a.a(iA, iA2, iA3, iA4, enumC0740a2, a(mapA.get("allowOffscreen"), true));
                        this.f71607a.b(false);
                        break;
                    case 3:
                        this.f71607a.e();
                        break;
                    case 4:
                        this.f71607a.a(mapA.get("url"), a(mapA));
                        break;
                    case 5:
                        this.f71607a.b(a(mapA));
                        break;
                    case 6:
                        this.f71607a.a(e(mapA.get("url")), this.f71608b.getClickPoints());
                        break;
                    case 7:
                        boolean zG = g(mapA.get("allowOrientationChange"));
                        String str3 = mapA.get("forceOrientation");
                        if (C3426d4.i.D.equals(str3)) {
                            iVar = i.PORTRAIT;
                        } else if (C3426d4.i.C.equals(str3)) {
                            iVar = i.LANDSCAPE;
                        } else {
                            if (!"none".equals(str3)) {
                                throw new d("Invalid orientation: ".concat(String.valueOf(str3)));
                            }
                            iVar = i.NONE;
                        }
                        this.f71607a.a(zG, iVar);
                        break;
                    case 8:
                        this.f71607a.a(e(mapA.get(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI)));
                        break;
                    case 9:
                        String strE = e(mapA.get(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI));
                        h hVar = this.f71613g;
                        Context context = this.f71608b.getContext();
                        h.c cVar = new h.c() { // from class: sg.bigo.ads.core.mraid.c.5
                            @Override // sg.bigo.ads.core.mraid.h.c
                            public final void a(d dVar) {
                                c.this.a(gVarA, dVar.getMessage());
                            }
                        };
                        if (!h.c(context)) {
                            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                            throw new d("Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted.");
                        }
                        if (!(context instanceof Activity)) {
                            Toast.makeText(context, "Downloading image", 0).show();
                            hVar.a(context, strE, cVar);
                        } else {
                            new AlertDialog.Builder(context).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new DialogInterface.OnClickListener() { // from class: sg.bigo.ads.core.mraid.h.3

                                /* JADX INFO: renamed from: a */
                                public final /* synthetic */ Context f71696a;

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ String f71697b;

                                /* JADX INFO: renamed from: c */
                                public final /* synthetic */ c f71698c;

                                public AnonymousClass3() {
                                    context = context;
                                    str = strE;
                                    cVar = cVar;
                                }

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i10) {
                                    h.this.a(context, str, cVar);
                                }
                            }).setCancelable(true).show();
                        }
                        break;
                        break;
                    case 10:
                        h.a(this.f71608b.getContext(), mapA);
                        break;
                    case 11:
                        throw new d("Unspecified MRAID Javascript command");
                }
                c("window.mraidbridge.nativeCallComplete(" + JSONObject.quote(gVarA.f71688l) + ")");
                return true;
            } catch (IllegalArgumentException | d e10) {
                a(gVarA, e10.getMessage());
            }
        } catch (Exception unused3) {
            return true;
        }
    }
}
