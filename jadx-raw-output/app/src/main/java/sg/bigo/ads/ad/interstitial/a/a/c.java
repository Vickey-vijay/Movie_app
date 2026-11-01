package sg.bigo.ads.ad.interstitial.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.common.i;
import sg.bigo.ads.common.n.d;
import sg.bigo.ads.common.p.e;
import sg.bigo.ads.common.p.f;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements sg.bigo.ads.ad.interstitial.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.api.core.b f67821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.ad.interstitial.a.b.c.b f67822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f67823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f67824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f67825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.b.c.a f67826f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f67828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f67829i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sg.bigo.ads.core.f.a.a.C0736a f67831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f67832l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final sg.bigo.ads.core.player.c f67834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private final p f67835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    private final Ad f67836p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f67827g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f67830j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final List<sg.bigo.ads.core.f.a.a.C0736a> f67833m = new ArrayList();

    public class a extends FrameLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f67847b;

        public a(@NonNull Context context) {
            super(context);
            this.f67847b = new i();
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 1) {
                this.f67847b.f69740b = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            if (motionEvent.getActionMasked() == 0) {
                this.f67847b.f69739a = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sg.bigo.ads.core.f.a.a.C0736a f67848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewConfiguration f67849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f67850c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f67852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f67853f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f67851d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public i f67854g = new i();

        public b(Context context, sg.bigo.ads.core.f.a.a.C0736a c0736a) {
            this.f67848a = c0736a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f67849b = viewConfiguration;
            this.f67850c = viewConfiguration.getScaledTouchSlop();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                this.f67851d = true;
                this.f67852e = motionEvent.getX();
                this.f67853f = motionEvent.getY();
                this.f67854g.f69739a = new Point((int) this.f67852e, (int) this.f67853f);
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.f67851d) {
                    this.f67851d = false;
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    this.f67854g.f69740b = new Point((int) x10, (int) y10);
                    if (Math.abs(this.f67852e - x10) < this.f67850c && Math.abs(this.f67853f - y10) < this.f67850c) {
                        c cVar = c.this;
                        cVar.a(cVar.g().f67537b.f69380e, this.f67854g);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                this.f67851d = false;
            }
            return true;
        }
    }

    public c(@NonNull Ad ad2, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar, @Nullable sg.bigo.ads.ad.interstitial.a.b.c.b bVar2) {
        this.f67834n = cVar;
        this.f67835o = pVar;
        this.f67836p = ad2;
        this.f67821a = bVar;
        this.f67822b = bVar2;
        if (pVar != null) {
            Iterator<sg.bigo.ads.core.f.a.a> it = pVar.A.iterator();
            while (it.hasNext()) {
                List<sg.bigo.ads.core.f.a.a.C0736a> list = it.next().f71388b;
                if (list != null) {
                    for (sg.bigo.ads.core.f.a.a.C0736a c0736a : list) {
                        if (c0736a.a() && c0736a.b()) {
                            this.f67833m.add(c0736a);
                        }
                    }
                    for (sg.bigo.ads.core.f.a.a.C0736a c0736a2 : list) {
                        if (c0736a2.a() && c0736a2.c()) {
                            this.f67833m.add(c0736a2);
                        }
                    }
                }
            }
        }
        this.f67832l = !this.f67833m.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context, final List<sg.bigo.ads.core.f.a.a.C0736a> list, @Nullable final sg.bigo.ads.core.f.a.a.C0736a c0736a, final int i10) {
        d.b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                if (c.this.f67827g) {
                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "static vast companion destroyed, stop preload.");
                    return;
                }
                if (list.isEmpty()) {
                    sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image list empty, stop preload.");
                    c cVar = c.this;
                    sg.bigo.ads.ad.interstitial.a.b.c.b bVar = cVar.f67822b;
                    if (bVar != null) {
                        sg.bigo.ads.api.core.b bVar2 = cVar.f67821a;
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - c.this.f67828h;
                        sg.bigo.ads.core.f.a.a.C0736a c0736a2 = c0736a;
                        bVar.a(bVar2, jElapsedRealtime, c0736a2 == null ? null : c0736a2.f71390b, i10 - 1, c0736a2 == null ? null : c0736a2.f71393e, "load failed");
                        return;
                    }
                    return;
                }
                c.this.f67831k = (sg.bigo.ads.core.f.a.a.C0736a) list.remove(0);
                String str = c.this.f67831k.f71390b;
                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "try to preload image: ".concat(String.valueOf(str)));
                if (URLUtil.isNetworkUrl(str)) {
                    e.a(context, str, c.this.f67821a.al(), new g() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.1.1
                        @Override // sg.bigo.ads.common.p.g
                        public final void a(int i11, @NonNull String str2, String str3) {
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image load failed: " + str2 + ", try to preload next image.");
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            c cVar2 = c.this;
                            cVar2.a(context, list, cVar2.f67831k, i10 + 1);
                        }

                        @Override // sg.bigo.ads.common.p.g
                        public final void a(@NonNull Bitmap bitmap, @NonNull f fVar) {
                            String string;
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image load success.");
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            final c cVar2 = c.this;
                            final Context context2 = context;
                            sg.bigo.ads.core.f.a.a.C0736a c0736a3 = cVar2.f67831k;
                            int i11 = i10;
                            sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "try to handle image.");
                            View view = null;
                            if (c0736a3.b()) {
                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle jpg/png image.");
                                AdImageView adImageView = new AdImageView(context2);
                                adImageView.setImageBitmap(bitmap);
                                adImageView.setOnTouchListener(cVar2.new b(context2, c0736a3));
                                string = null;
                                view = adImageView;
                            } else if (c0736a3.c()) {
                                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle gif image.");
                                try {
                                    File file = new File(fVar.f69884d);
                                    if (file.exists()) {
                                        URI uri = file.toURI();
                                        WebView webView = new WebView(context2);
                                        webView.getSettings().setAllowFileAccess(true);
                                        webView.getSettings().setAllowFileAccessFromFileURLs(false);
                                        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
                                        if (uri.toString().startsWith(AdPayload.FILE_SCHEME)) {
                                            webView.getSettings().setJavaScriptEnabled(false);
                                        } else {
                                            webView.getSettings().setJavaScriptEnabled(true);
                                        }
                                        webView.loadUrl(uri.toString());
                                        webView.getSettings().setLoadWithOverviewMode(true);
                                        webView.getSettings().setUseWideViewPort(true);
                                        webView.setOnTouchListener(cVar2.new b(context2, c0736a3));
                                        cVar2.f67824d = webView;
                                        string = null;
                                        view = webView;
                                    } else {
                                        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "gif image file is not exists.");
                                        string = "git file not exists";
                                    }
                                } catch (Exception e10) {
                                    string = e10.toString();
                                }
                            } else {
                                string = null;
                            }
                            if (view == null) {
                                sg.bigo.ads.ad.interstitial.a.b.c.b bVar3 = cVar2.f67822b;
                                if (bVar3 != null) {
                                    cVar2.f67830j = true;
                                    bVar3.a(cVar2.f67821a, SystemClock.elapsedRealtime() - cVar2.f67828h, c0736a3.f71390b, i11, c0736a3.f71393e, string);
                                    return;
                                }
                                return;
                            }
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            if (width <= 0 || height <= 0) {
                                width = sg.bigo.ads.common.utils.e.a(context2, c0736a3.f71391c);
                                height = sg.bigo.ads.common.utils.e.a(context2, c0736a3.f71392d);
                            }
                            float f10 = context2.getResources().getDisplayMetrics().widthPixels;
                            float fC = sg.bigo.ads.common.utils.e.c(context2);
                            if (f10 > 0.0f && fC > 0.0f) {
                                float f11 = height;
                                float f12 = width;
                                float f13 = (f11 * f10) / f12;
                                if (f13 > fC) {
                                    f10 = (f12 * fC) / f11;
                                } else {
                                    fC = f13;
                                }
                                width = (int) f10;
                                height = (int) fC;
                            }
                            FrameLayout.LayoutParams layoutParams = (width <= 0 || height <= 0) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(width, height, 17);
                            final a aVar = cVar2.new a(context2);
                            aVar.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.interstitial.a.a.c.2
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    c.this.a(context2, aVar.f67847b);
                                }
                            });
                            cVar2.f67825e = view;
                            aVar.addView(view, layoutParams);
                            cVar2.f67823c = aVar;
                            sg.bigo.ads.ad.interstitial.a.b.c.b bVar4 = cVar2.f67822b;
                            if (bVar4 != null) {
                                cVar2.f67829i = true;
                                bVar4.a(cVar2.f67821a, SystemClock.elapsedRealtime() - cVar2.f67828h, c0736a3.f71390b, i11, c0736a3.f71393e);
                            }
                        }
                    });
                    return;
                }
                sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "image url is invalid: " + str + ", try to preload next image.");
                c cVar2 = c.this;
                cVar2.a(context, list, cVar2.f67831k, i10 + 1);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        return this.f67823c;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        sg.bigo.ads.core.player.c cVar;
        if (i10 != 1 || (cVar = this.f67834n) == null) {
            return;
        }
        cVar.a();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams;
        int i12;
        int i13;
        View view = this.f67825e;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || (i12 = layoutParams.width) == -1 || (i13 = layoutParams.height) == 0 || i12 == 0) {
            return;
        }
        if (i10 > 0 && i11 > 0) {
            float f10 = i10;
            float f11 = i13;
            float f12 = i12;
            float f13 = (f11 * f10) / f12;
            float f14 = i11;
            if (f13 > f14) {
                f10 = (f12 * f14) / f11;
                f13 = f14;
            }
            i12 = (int) f10;
            i13 = (int) f13;
        }
        layoutParams.width = i12;
        layoutParams.height = i13;
        this.f67825e = null;
    }

    public final void a(Context context, i iVar) {
        sg.bigo.ads.api.core.d dVarA;
        int i10 = 0;
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "handle ad click.");
        Ad ad2 = this.f67836p;
        if (ad2 instanceof sg.bigo.ads.api.b.f) {
            ((sg.bigo.ads.api.b.f) ad2).L();
        }
        if (this.f67821a.f().c() == 0 || !(this.f67836p instanceof sg.bigo.ads.ad.c)) {
            boolean zA = this.f67821a.a(16);
            dVarA = sg.bigo.ads.ad.interstitial.a.a.a.a(context, zA ? sg.bigo.ads.common.utils.c.a(this.f67823c) : null, this.f67836p, this.f67821a, null, this.f67835o, this.f67831k, zA);
        } else {
            sg.bigo.ads.controller.landing.e.a(this.f67823c.getContext(), g());
            dVarA = new sg.bigo.ads.api.core.d();
            i10 = 1;
        }
        dVarA.f69369k = i10;
        sg.bigo.ads.core.player.c cVar = this.f67834n;
        if (cVar != null && !cVar.b(this.f67821a)) {
            this.f67834n.a(this.f67821a);
        }
        sg.bigo.ads.ad.interstitial.a.b.c.a aVar = this.f67826f;
        if (aVar != null) {
            aVar.a(iVar, dVarA);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        String str;
        if (!this.f67832l) {
            str = "image resource is disable.";
        } else if (this.f67827g) {
            str = "static vast companion destroyed, stop preload.";
        } else {
            if (!this.f67833m.isEmpty()) {
                this.f67828h = SystemClock.elapsedRealtime();
                sg.bigo.ads.ad.interstitial.a.b.c.b bVar = this.f67822b;
                if (bVar != null) {
                    bVar.a(this.f67821a);
                }
                a(context, this.f67833m, null, 0);
                return true;
            }
            str = "image list empty, stop preload.";
        }
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", str);
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        return (this.f67827g || this.f67823c == null) ? false : true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        View view = this.f67823c;
        if (view instanceof WebView) {
            ((WebView) view).onResume();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        View view = this.f67823c;
        if (view instanceof WebView) {
            ((WebView) view).onPause();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @SuppressLint({"ClickableViewAccessibility"})
    public final void e() {
        sg.bigo.ads.common.t.a.a(0, 3, "StaticVastCompanion", "release");
        WebView webView = this.f67824d;
        if (webView != null) {
            webView.setOnTouchListener(null);
            this.f67824d.destroy();
            this.f67824d = null;
        }
        View view = this.f67823c;
        if (view != null) {
            u.b(view);
            this.f67823c = null;
        }
        this.f67827g = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        sg.bigo.ads.ad.interstitial.a.b.c.b bVar;
        if (this.f67830j || this.f67829i || (bVar = this.f67822b) == null || this.f67828h <= 0) {
            return;
        }
        bVar.a(this.f67821a, SystemClock.elapsedRealtime() - this.f67828h);
    }

    public final sg.bigo.ads.ad.c<?, ?> g() {
        Ad ad2 = this.f67836p;
        if (ad2 instanceof sg.bigo.ads.ad.b.a.a.c) {
            return (sg.bigo.ads.ad.b.a.a.c) ad2;
        }
        if (ad2 instanceof sg.bigo.ads.ad.b.a.a.d) {
            return (sg.bigo.ads.ad.b.a.a.d) ad2;
        }
        return ad2 instanceof s ? ((s) ad2).H() : (sg.bigo.ads.ad.c) ad2;
    }
}
