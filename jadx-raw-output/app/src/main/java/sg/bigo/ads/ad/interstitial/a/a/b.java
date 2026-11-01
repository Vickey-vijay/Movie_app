package sg.bigo.ads.ad.interstitial.a.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.b.f;
import sg.bigo.ads.api.core.d;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.utils.t;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.mraid.e;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements sg.bigo.ads.ad.banner.b.InterfaceC0656b, sg.bigo.ads.ad.interstitial.a.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.core.b f67793a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f67797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.core.c.b f67798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f67799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WebView f67800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f67801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f67802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f67803k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.ad.interstitial.a.b.b.a f67806n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f67807o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f67808p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final sg.bigo.ads.core.f.a.a.C0736a f67809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private final sg.bigo.ads.core.player.c f67810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private final p f67811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private final Ad f67812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e f67813u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f67794b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f67795c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67796d = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f67804l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0665b f67805m = new C0665b(0);

    public final class a {
        private a() {
        }

        public /* synthetic */ a(b bVar, byte b10) {
            this();
        }

        @JavascriptInterface
        public final void gameEnd(String str) {
            sg.bigo.ads.ad.interstitial.a.b.b.a aVar = b.this.f67806n;
            if (aVar != null) {
                aVar.b();
            }
        }

        @JavascriptInterface
        public final void onBGNDomContentLoaded() {
            b bVar = b.this;
            bVar.f67803k = true;
            sg.bigo.ads.ad.interstitial.a.b.b.a aVar = bVar.f67806n;
            if (aVar != null) {
                aVar.c(bVar.f67793a, SystemClock.elapsedRealtime() - b.this.f67797e);
            }
        }

        @JavascriptInterface
        public final void onBGNLoaded() {
            b bVar = b.this;
            bVar.f67802j = true;
            sg.bigo.ads.ad.interstitial.a.b.b.a aVar = bVar.f67806n;
            if (aVar != null) {
                aVar.b(bVar.f67793a, SystemClock.elapsedRealtime() - b.this.f67797e);
            }
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.a.b$b, reason: collision with other inner class name */
    public static final class C0665b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f67818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f67819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<Activity> f67820c;

        private C0665b() {
            this.f67818a = false;
            this.f67819b = -1;
        }

        public /* synthetic */ C0665b(byte b10) {
            this();
        }

        private void b() {
            if (this.f67818a) {
                int i10 = this.f67819b;
                this.f67819b = -1;
                if (i10 == 0 || i10 == 1) {
                    WeakReference<Activity> weakReference = this.f67820c;
                    Activity activity = weakReference == null ? null : weakReference.get();
                    if (activity == null) {
                        return;
                    }
                    activity.setRequestedOrientation(i10);
                }
            }
        }

        public final void a() {
            this.f67818a = true;
            b();
        }

        public final void a(Activity activity, int i10) {
            this.f67819b = i10;
            this.f67820c = new WeakReference<>(activity);
            b();
        }
    }

    public b(@NonNull Ad ad2, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable sg.bigo.ads.core.f.a.a.C0736a c0736a, @Nullable sg.bigo.ads.ad.interstitial.a.b.b.a aVar) {
        this.f67809q = c0736a;
        String str = c0736a == null ? null : c0736a.f71390b;
        this.f67808p = str;
        this.f67810r = cVar;
        this.f67811s = pVar;
        this.f67812t = ad2;
        this.f67793a = bVar;
        this.f67806n = aVar;
        this.f67807o = !TextUtils.isEmpty(str);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        return this.f67801i;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        if (i10 == 1) {
            this.f67805m.a();
            sg.bigo.ads.core.player.c cVar = this.f67810r;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        int i12;
        int i13;
        WebView webView = this.f67800h;
        if (webView == null) {
            return;
        }
        Context context = webView.getContext();
        sg.bigo.ads.core.f.a.a.C0736a c0736a = this.f67809q;
        int i14 = 0;
        if (c0736a != null) {
            i13 = c0736a.f71391c;
            i12 = c0736a.f71392d;
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (sg.bigo.ads.common.utils.e.a(context, i13) <= i10 && sg.bigo.ads.common.utils.e.a(context, i12) <= i11) {
            i14 = i13;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f67800h.getLayoutParams();
        if (i14 <= 0 || i12 <= 0) {
            layoutParams.width = i10;
            layoutParams.height = i11;
        } else {
            layoutParams.gravity = 17;
            layoutParams.width = sg.bigo.ads.common.utils.e.a(context, i14);
            layoutParams.height = sg.bigo.ads.common.utils.e.a(context, i12);
        }
    }

    public final void a(Context context, String str, i iVar) {
        d dVarA;
        sg.bigo.ads.ad.c cVarH;
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "handle ad click.");
        Ad ad2 = this.f67812t;
        if (ad2 instanceof f) {
            ((f) ad2).L();
        }
        sg.bigo.ads.ad.interstitial.a.b.b.a aVar = this.f67806n;
        String str2 = (aVar == null || !aVar.c()) ? null : str;
        if (this.f67793a.f().c() == 0 || !(this.f67812t instanceof sg.bigo.ads.ad.c)) {
            boolean zA = this.f67793a.a(16);
            dVarA = sg.bigo.ads.ad.interstitial.a.a.a.a(context, zA ? sg.bigo.ads.common.utils.c.a(this.f67801i) : null, this.f67812t, this.f67793a, str2, this.f67811s, this.f67809q, zA);
            dVarA.f69369k = 0;
        } else {
            Context context2 = this.f67801i.getContext();
            Ad ad3 = this.f67812t;
            if (ad3 instanceof sg.bigo.ads.ad.b.a.a.c) {
                cVarH = (sg.bigo.ads.ad.b.a.a.c) ad3;
            } else if (ad3 instanceof sg.bigo.ads.ad.b.a.a.d) {
                cVarH = (sg.bigo.ads.ad.b.a.a.d) ad3;
            } else {
                cVarH = ad3 instanceof s ? ((s) ad3).H() : (sg.bigo.ads.ad.c) ad3;
            }
            sg.bigo.ads.controller.landing.e.a(context2, (sg.bigo.ads.ad.c<?, ?>) cVarH);
            dVarA = new d();
            dVarA.f69369k = 1;
        }
        sg.bigo.ads.core.player.c cVar = this.f67810r;
        if (cVar != null && !cVar.b(this.f67793a)) {
            this.f67810r.a(this.f67793a);
        }
        h hVar = this.f67799g;
        if (hVar != null) {
            hVar.a(iVar, dVarA);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @SuppressLint({"AddJavascriptInterface"})
    public final boolean a(final Context context) {
        int i10;
        int i11;
        byte b10 = 0;
        if (!this.f67807o) {
            return false;
        }
        if (this.f67813u == null) {
            try {
                this.f67813u = new e(context, n.INTERSTITIAL);
            } catch (NoClassDefFoundError unused) {
                sg.bigo.ads.common.t.a.a(0, "HtmlVastCompanion", "Banner webview is not support");
            }
            e eVar = this.f67813u;
            if (eVar == null) {
                return false;
            }
            eVar.f71633g = new e.b() { // from class: sg.bigo.ads.ad.interstitial.a.a.b.1
                @Override // sg.bigo.ads.core.mraid.e.b
                public final void a() {
                    b bVar = b.this;
                    bVar.f67795c = true;
                    bVar.f67796d = false;
                    bVar.f67798f = sg.bigo.ads.core.c.c.a.f71217a.a(b.this.f67800h, new View[0]);
                    b bVar2 = b.this;
                    if (bVar2.f67794b) {
                        if (bVar2.f67800h != null) {
                            sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "javascript:onViewImpression()");
                            bVar2.f67800h.loadUrl("javascript:onViewImpression()");
                        }
                        sg.bigo.ads.core.c.b bVar3 = b.this.f67798f;
                        if (bVar3 != null) {
                            bVar3.a();
                        }
                    }
                    sg.bigo.ads.ad.banner.b.b(b.this);
                    sg.bigo.ads.ad.interstitial.a.b.b.a aVar = b.this.f67806n;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void a(@NonNull String str, @Nullable i iVar) {
                    b.this.a(context, str, iVar);
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final boolean a(Activity activity, int i12) {
                    b.this.f67805m.a(activity, i12);
                    return true;
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void b() {
                    b bVar = b.this;
                    bVar.f67796d = false;
                    bVar.f67804l = true;
                    sg.bigo.ads.ad.banner.b.c(bVar);
                    b bVar2 = b.this;
                    sg.bigo.ads.ad.interstitial.a.b.b.a aVar = bVar2.f67806n;
                    if (aVar != null) {
                        aVar.a(bVar2.f67793a, SystemClock.elapsedRealtime() - b.this.f67797e);
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final boolean b(Activity activity, int i12) {
                    b.this.f67805m.a(activity, i12);
                    return true;
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void c() {
                    sg.bigo.ads.common.t.a.a(0, "HtmlVastCompanion", "onRenderProcessGone");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void d() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onExpand");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void e() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onResize");
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void f() {
                    h hVar = b.this.f67799g;
                    if (hVar != null) {
                        hVar.a();
                    }
                }

                @Override // sg.bigo.ads.core.mraid.e.b
                public final void g() {
                    h hVar = b.this.f67799g;
                    if (hVar != null) {
                        hVar.a();
                    }
                }
            };
            String str = (sg.bigo.ads.core.c.c.a.f71217a.c(this.f67808p) + "\n<script>document.addEventListener('DOMContentLoaded',function(){BGN_PLAYABLE.onBGNDomContentLoaded()});\nwindow.addEventListener('load',function(){BGN_PLAYABLE.onBGNLoaded()});</script>") + "\n<script type=\"text/javascript\">\n    document.body.style.margin = '0px';\n</script>";
            this.f67797e = SystemClock.elapsedRealtime();
            sg.bigo.ads.ad.interstitial.a.b.b.a aVar = this.f67806n;
            if (aVar != null) {
                aVar.a(this.f67793a);
            }
            this.f67813u.a(str, new e.d() { // from class: sg.bigo.ads.ad.interstitial.a.a.b.2
                @Override // sg.bigo.ads.core.mraid.e.d
                public final void a() {
                    sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "onReady");
                }
            });
            this.f67796d = true;
            t.a();
        }
        sg.bigo.ads.core.mraid.c.C0741c c0741cB = this.f67813u.b();
        this.f67800h = c0741cB;
        if (c0741cB != null) {
            c0741cB.setOverScrollMode(2);
            this.f67800h.setHorizontalScrollBarEnabled(false);
            this.f67800h.setHorizontalScrollbarOverlay(false);
            this.f67800h.setVerticalScrollBarEnabled(false);
            this.f67800h.setVerticalScrollbarOverlay(false);
            this.f67800h.getSettings().setSupportZoom(false);
            this.f67800h.setBackgroundColor(-1);
            sg.bigo.ads.core.f.a.a.C0736a c0736a = this.f67809q;
            if (c0736a != null) {
                i11 = c0736a.f71391c;
                i10 = c0736a.f71392d;
            } else {
                i10 = 0;
                i11 = 0;
            }
            WebView webView = this.f67800h;
            if (webView != null) {
                Object parent = webView.getParent();
                if (parent instanceof FrameLayout) {
                    this.f67801i = (View) parent;
                    sg.bigo.ads.ad.banner.b.a(this);
                    Context context2 = webView.getContext();
                    int i12 = context2.getResources().getDisplayMetrics().widthPixels;
                    int iC = sg.bigo.ads.common.utils.e.c(context2);
                    if (sg.bigo.ads.common.utils.e.a(context2, i11) > i12 || sg.bigo.ads.common.utils.e.a(context2, i10) > iC) {
                        i11 = 0;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webView.getLayoutParams();
                    if (i11 <= 0 || i10 <= 0) {
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                    } else {
                        layoutParams.gravity = 17;
                        layoutParams.width = sg.bigo.ads.common.utils.e.a(context2, i11);
                        layoutParams.height = sg.bigo.ads.common.utils.e.a(context2, i10);
                    }
                }
            }
            this.f67800h.addJavascriptInterface(new a(this, b10), "BGN_PLAYABLE");
        }
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        if (this.f67807o) {
            return this.f67795c;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        e eVar = this.f67813u;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        e eVar = this.f67813u;
        if (eVar != null) {
            eVar.a(false);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "HtmlVastCompanion", "release");
        sg.bigo.ads.ad.banner.b.h(this);
        sg.bigo.ads.core.c.b bVar = this.f67798f;
        if (bVar != null) {
            bVar.b();
        }
        e eVar = this.f67813u;
        if (eVar != null) {
            eVar.e();
            this.f67813u = null;
        }
        WebView webView = this.f67800h;
        if (webView != null) {
            u.b(webView);
            this.f67800h = null;
        }
        this.f67799g = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        sg.bigo.ads.ad.interstitial.a.b.b.a aVar;
        if (this.f67802j || this.f67803k || this.f67804l || (aVar = this.f67806n) == null || this.f67797e <= 0) {
            return;
        }
        aVar.d(this.f67793a, SystemClock.elapsedRealtime() - this.f67797e);
    }
}
