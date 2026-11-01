package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.IAcloseButton;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.fyber.adsession.Partner;
import com.ironsource.C3426d4;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i0 extends i1 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String[] f18701o0 = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    public com.fyber.inneractive.sdk.mraid.f0 N;
    public final z O;
    public final d0 P;
    public final c0 Q;
    public ViewGroup R;
    public m S;
    public boolean T;
    public int U;
    public e0 V;
    public IAcloseButton W;
    public boolean X;
    public float Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f18702a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f18703b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f18704c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f18705d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f18706e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Orientation f18707f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f18708g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public FrameLayout f18709h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public FrameLayout f18710i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public FrameLayout f18711j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f18712k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f18713l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public t f18714m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final p f18715n0;

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.l
    public void a(boolean z10) {
        a(new com.fyber.inneractive.sdk.mraid.g0(z10));
        super.a(z10);
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void b() {
        com.fyber.inneractive.sdk.util.r.f18607b.post(new r(this));
    }

    @Override // com.fyber.inneractive.sdk.web.l
    public final void c() {
        m mVar = this.f18682b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.f18682b.getViewTreeObserver().removeOnPreDrawListener(this.f18715n0);
        }
        com.fyber.inneractive.sdk.util.r.f18607b.post(new s(this));
    }

    public void setResizeProperties() {
    }

    public final void d(boolean z10) {
        try {
            Activity activity = (Activity) com.fyber.inneractive.sdk.util.o.a(this.f18682b);
            if (activity != null) {
                if (!z10 || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                    activity.setRequestedOrientation(this.U);
                } else {
                    activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
                }
            }
        } catch (Exception unused) {
            IAlog.a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final com.fyber.inneractive.sdk.util.g1 g() {
        m mVar;
        return (this.N != com.fyber.inneractive.sdk.mraid.f0.EXPANDED || (mVar = this.S) == null) ? super.g() : mVar.getLastClickedLocation();
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void j() {
        m mVar = this.f18682b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireReadyEvent();");
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void k() {
        ArrayList arrayList = new ArrayList();
        m mVar = this.f18682b;
        if (mVar == null || mVar.getScaleX() == 1.0f || this.f18682b.getScaleY() == 1.0f) {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.Z, this.f18702a0));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.f18703b0, this.f18704c0));
        } else {
            arrayList.add(new com.fyber.inneractive.sdk.mraid.c0(this.f18682b.getWidthDp(), this.f18682b.getHeightDp()));
            arrayList.add(new com.fyber.inneractive.sdk.mraid.a0(this.f18682b.getWidthDp(), this.f18682b.getHeightDp()));
        }
        m mVar2 = this.f18682b;
        int iC = com.fyber.inneractive.sdk.util.o.c(mVar2 != null ? mVar2.getWidth() : this.f18703b0);
        m mVar3 = this.f18682b;
        arrayList.add(new com.fyber.inneractive.sdk.mraid.z(iC, com.fyber.inneractive.sdk.util.o.c(mVar3 != null ? mVar3.getHeight() : this.f18704c0)));
        a(arrayList);
        com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
        this.N = f0Var;
        a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final boolean m() {
        c0 c0Var = this.Q;
        return c0Var != null && c0Var.equals(c0.INTERSTITIAL);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    public final void o() {
        ViewGroup viewGroup;
        m mVar;
        com.fyber.inneractive.sdk.mraid.f0 f0Var;
        ViewGroup viewGroup2 = this.R;
        ViewGroup viewGroup3 = null;
        if (viewGroup2 == null) {
            viewGroup = null;
        } else {
            View viewFindViewById = viewGroup2.findViewById(R.id.ia_identifier_overlay);
            if (viewFindViewById instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewFindViewById;
            } else {
                viewGroup = null;
            }
        }
        if (viewGroup == null) {
            m mVar2 = this.f18682b;
            if (mVar2 != null) {
                View viewFindViewById2 = mVar2.findViewById(R.id.ia_identifier_overlay);
                if (viewFindViewById2 instanceof ViewGroup) {
                    viewGroup3 = (ViewGroup) viewFindViewById2;
                }
            }
        } else {
            viewGroup3 = viewGroup;
        }
        this.T = false;
        if (p() || (f0Var = this.N) == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
            c(false);
            m mVar3 = this.f18682b;
            if (mVar3 != null) {
                com.fyber.inneractive.sdk.mraid.f0 f0Var2 = this.N;
                if (f0Var2 == com.fyber.inneractive.sdk.mraid.f0.EXPANDED) {
                    FrameLayout frameLayout = this.f18710i0;
                    if (frameLayout != null && this.f18711j0 != null) {
                        frameLayout.removeAllViewsInLayout();
                        this.f18711j0.removeAllViewsInLayout();
                        ViewGroup viewGroup4 = this.R;
                        if (viewGroup4 != null) {
                            viewGroup4.removeView(this.f18711j0);
                        }
                    }
                    ViewGroup viewGroup5 = (ViewGroup) this.f18709h0.getParent();
                    if (viewGroup5 != null) {
                        viewGroup5.addView(this.f18682b, this.f18708g0);
                        m mVar4 = this.f18682b;
                        int i10 = this.f18712k0;
                        int i11 = this.f18713l0;
                        ViewGroup.LayoutParams layoutParams = mVar4.getLayoutParams();
                        layoutParams.width = i10;
                        layoutParams.height = i11;
                        mVar4.setLayoutParams(layoutParams);
                        com.fyber.inneractive.sdk.util.o.a(this.f18682b, 17);
                        viewGroup5.removeView(this.f18709h0);
                        viewGroup5.invalidate();
                        this.f18682b.requestLayout();
                    }
                    this.f18705d0 = this.f18712k0;
                    this.f18706e0 = this.f18713l0;
                } else if (f0Var2 == com.fyber.inneractive.sdk.mraid.f0.RESIZED) {
                    int i12 = this.f18712k0;
                    this.f18705d0 = i12;
                    int i13 = this.f18713l0;
                    this.f18706e0 = i13;
                    ViewGroup.LayoutParams layoutParams2 = mVar3.getLayoutParams();
                    layoutParams2.width = i12;
                    layoutParams2.height = i13;
                    mVar3.setLayoutParams(layoutParams2);
                    com.fyber.inneractive.sdk.util.o.a(this.f18682b, 17);
                }
            }
            if (viewGroup3 != null && (mVar = this.f18682b) != null) {
                viewGroup3.setLayoutParams(mVar.getLayoutParams());
                if (p()) {
                    com.fyber.inneractive.sdk.util.v.a(viewGroup3);
                    this.f18682b.addView(viewGroup3);
                }
            }
            this.N = com.fyber.inneractive.sdk.mraid.f0.DEFAULT;
            d(false);
            a(new com.fyber.inneractive.sdk.mraid.d0(this.N));
        } else if (f0Var == com.fyber.inneractive.sdk.mraid.f0.DEFAULT) {
            com.fyber.inneractive.sdk.mraid.f0 f0Var3 = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
            this.N = f0Var3;
            a(new com.fyber.inneractive.sdk.mraid.d0(f0Var3));
        }
        if (viewGroup3 != null) {
            viewGroup3.setPadding(0, 0, 0, 0);
        }
        j1 j1Var = this.f18687g;
        if (j1Var != null) {
            ((b0) j1Var).onClose();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            r();
        }
    }

    public final boolean p() {
        return this.N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
    }

    public final void q() {
        com.fyber.inneractive.sdk.measurement.tracker.e bVar;
        com.fyber.inneractive.sdk.measurement.e eVar = this.H;
        if (eVar != null) {
            m mVar = this.f18682b;
            com.fyber.inneractive.sdk.flow.x xVar = this.f18699s;
            boolean z10 = false;
            IAlog.a("omsdk initMraidSession", new Object[0]);
            if (eVar.f15810e == null) {
                IAlog.a("omsdk partner is null", new Object[0]);
                bVar = null;
            } else {
                if (xVar != null && xVar.b() != null && xVar.b().J) {
                    z10 = true;
                }
                com.fyber.inneractive.sdk.measurement.tracker.f fVar = eVar.f15811f;
                Partner partner = eVar.f15810e;
                fVar.getClass();
                bVar = z10 ? new com.fyber.inneractive.sdk.measurement.tracker.b(partner, mVar) : new com.fyber.inneractive.sdk.measurement.tracker.a(partner, mVar);
                bVar.a(mVar);
            }
            this.I = bVar;
        }
        g gVar = this.f18686f;
        if (gVar != null) {
            gVar.a(this);
        }
    }

    public final void r() {
        try {
            if (!(com.fyber.inneractive.sdk.util.o.a(this.f18682b) instanceof Activity) || this.f18714m0 == null) {
                return;
            }
            ((Activity) com.fyber.inneractive.sdk.util.o.a(this.f18682b)).getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f18714m0);
            this.f18714m0 = null;
        } catch (Exception e10) {
            IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e10.getMessage());
        }
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public void setAdDefaultSize(int i10, int i11) {
        this.f18712k0 = i10;
        this.f18713l0 = i11;
        this.f18705d0 = i10;
        this.f18706e0 = i11;
    }

    public void setOrientationProperties(boolean z10, String str) {
        if (C3426d4.i.D.equals(str)) {
            this.f18707f0 = Orientation.PORTRAIT;
        } else if (C3426d4.i.C.equals(str)) {
            this.f18707f0 = Orientation.LANDSCAPE;
        } else {
            this.f18707f0 = Orientation.NONE;
        }
        j1 j1Var = this.f18687g;
        if (j1Var != null) {
            ((b0) j1Var).a(z10, this.f18707f0);
        }
    }

    public i0(boolean z10, c0 c0Var, z zVar, d0 d0Var, com.fyber.inneractive.sdk.measurement.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(z10, c0Var, rVar);
        this.N = com.fyber.inneractive.sdk.mraid.f0.HIDDEN;
        this.T = false;
        this.Z = -1;
        this.f18702a0 = -1;
        this.f18703b0 = -1;
        this.f18704c0 = -1;
        this.f18705d0 = -1;
        this.f18706e0 = -1;
        this.f18707f0 = Orientation.NONE;
        this.H = eVar;
        this.Q = c0Var;
        this.O = zVar;
        this.P = d0Var;
        this.f18715n0 = new p(this);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void b(boolean z10) {
        m mVar = this.f18682b;
        if (mVar != null && mVar.getViewTreeObserver() != null) {
            this.f18682b.getViewTreeObserver().removeOnPreDrawListener(this.f18715n0);
        }
        com.fyber.inneractive.sdk.util.r.f18607b.post(new s(this));
        m mVar2 = this.S;
        if (mVar2 != null && mVar2.getParent() != null && (this.S.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.S.getParent()).removeView(this.S);
            this.S = null;
        }
        FrameLayout frameLayout = this.f18710i0;
        if (frameLayout != null && this.f18711j0 != null) {
            frameLayout.removeAllViewsInLayout();
            this.f18711j0.removeAllViewsInLayout();
            ViewGroup viewGroup = this.R;
            if (viewGroup != null) {
                viewGroup.removeView(this.f18711j0);
            }
        }
        this.f18681a = false;
        if (Build.VERSION.SDK_INT >= 33) {
            r();
        }
        super.b(z10);
    }

    @Override // com.fyber.inneractive.sdk.web.i
    public final void h() {
        int requestedOrientation;
        super.h();
        this.N = com.fyber.inneractive.sdk.mraid.f0.LOADING;
        Context contextA = com.fyber.inneractive.sdk.util.o.a(this.f18682b);
        if (contextA instanceof Activity) {
            requestedOrientation = ((Activity) contextA).getRequestedOrientation();
        } else {
            requestedOrientation = -1;
        }
        this.U = requestedOrientation;
        this.f18710i0 = new FrameLayout(contextA);
        this.f18711j0 = new FrameLayout(contextA);
        FrameLayout frameLayout = new FrameLayout(contextA);
        frameLayout.setBackgroundColor(-858993460);
        this.f18709h0 = frameLayout;
        a(contextA, false);
        this.f18682b.setOnKeyListener(new q(this));
    }

    @Override // com.fyber.inneractive.sdk.web.i, com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandle url for: %s webView = %s", IAlog.a(this), str, webView);
        if (this.N == com.fyber.inneractive.sdk.mraid.f0.EXPANDED && !TextUtils.isEmpty(str) && webView.equals(this.S) && !this.T) {
            this.T = true;
            return false;
        }
        return super.a(webView, str);
    }

    public final void c(boolean z10) {
        if (this.R == null) {
            return;
        }
        if (z10) {
            int iB = com.fyber.inneractive.sdk.util.o.b(35);
            if (this.W == null) {
                IAcloseButton iAcloseButton = new IAcloseButton(com.fyber.inneractive.sdk.util.o.a(this.f18682b), iB);
                this.W = iAcloseButton;
                iAcloseButton.setOnClickListener(new o(this));
            }
            com.fyber.inneractive.sdk.util.v.a(this.W);
            this.f18711j0.addView(this.W);
            IAcloseButton iAcloseButton2 = this.W;
            ViewGroup.LayoutParams layoutParams = iAcloseButton2.getLayoutParams();
            layoutParams.width = iB;
            layoutParams.height = iB;
            iAcloseButton2.setLayoutParams(layoutParams);
            com.fyber.inneractive.sdk.util.o.a(this.W, 53);
            IAcloseButton iAcloseButton3 = this.W;
            int iB2 = com.fyber.inneractive.sdk.util.o.b(10);
            int iB3 = com.fyber.inneractive.sdk.util.o.b(10);
            ViewGroup.LayoutParams layoutParams2 = iAcloseButton3.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.topMargin = iB2;
                marginLayoutParams.rightMargin = iB3;
                marginLayoutParams.bottomMargin = 0;
                iAcloseButton3.setLayoutParams(marginLayoutParams);
            }
        } else {
            this.f18711j0.removeView(this.W);
        }
        j1 j1Var = this.f18687g;
        if (j1Var != null) {
            ((b0) j1Var).b(z10);
        }
        this.X = !z10;
    }

    @Override // com.fyber.inneractive.sdk.web.i1
    public final void a(Context context, boolean z10) {
        Window window;
        Window window2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) IAConfigManager.O.f15027v.a().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.Y = displayMetrics.density;
        Rect rect = new Rect();
        boolean z11 = context instanceof Activity;
        if (z11 && (window2 = ((Activity) context).getWindow()) != null) {
            window2.getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        int i10 = rect.top;
        View viewFindViewById = (!z11 || (window = ((Activity) context).getWindow()) == null) ? null : window.findViewById(android.R.id.content);
        int top2 = viewFindViewById != null ? viewFindViewById.getTop() - i10 : 0;
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        double d10 = i11;
        double d11 = 160.0d / ((double) displayMetrics.densityDpi);
        int widthDp = (int) (d11 * d10);
        int heightDp = (int) (d11 * ((double) i12));
        int i13 = (i12 - i10) - top2;
        m mVar = this.f18682b;
        if (mVar != null && mVar.getScaleX() != 1.0f && this.f18682b.getScaleY() != 1.0f) {
            widthDp = this.f18682b.getWidthDp();
            heightDp = this.f18682b.getHeightDp();
            int iB = (com.fyber.inneractive.sdk.util.o.b(this.f18682b.getHeightDp()) - i10) - top2;
            this.f18703b0 = this.Z;
            this.f18704c0 = (int) ((160.0d / ((double) displayMetrics.densityDpi)) * ((double) iB));
        } else {
            double d12 = 160.0d / ((double) displayMetrics.densityDpi);
            this.f18703b0 = (int) (d10 * d12);
            this.f18704c0 = (int) (d12 * ((double) i13));
        }
        if (this.Z == widthDp && this.f18702a0 == heightDp) {
            return;
        }
        this.Z = widthDp;
        this.f18702a0 = heightDp;
        if (z10) {
            a(new com.fyber.inneractive.sdk.mraid.c0(widthDp, heightDp));
            a(new com.fyber.inneractive.sdk.mraid.a0(this.f18703b0, this.f18704c0));
            a(new com.fyber.inneractive.sdk.mraid.z(this.f18703b0, this.f18704c0));
            int i14 = this.f18705d0;
            if (i14 > 0 && this.f18706e0 > 0) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i14), com.fyber.inneractive.sdk.util.o.c(this.f18706e0)));
                return;
            }
            m mVar2 = this.f18682b;
            if (mVar2 == null || mVar2.getWidth() <= 0 || this.f18682b.getHeight() <= 0) {
                return;
            }
            a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(this.f18682b.getWidth()), com.fyber.inneractive.sdk.util.o.c(this.f18682b.getHeight())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    public final void a(String str, int i10, int i11, boolean z10, boolean z11) {
        ViewGroup viewGroup;
        if (this.f18682b == null || this.O == z.DISABLED || this.N != com.fyber.inneractive.sdk.mraid.f0.DEFAULT) {
            return;
        }
        if (str != null && !URLUtil.isValidUrl(str)) {
            a(com.fyber.inneractive.sdk.mraid.k.EXPAND, "URL passed to expand() was invalid.");
            return;
        }
        try {
            ViewGroup viewGroup2 = (ViewGroup) this.f18682b.getRootView().findViewById(android.R.id.content);
            this.R = viewGroup2;
            if (viewGroup2 == null) {
                IAlog.f("Couldn't find content in the view tree", new Object[0]);
                a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                this.f18714m0 = new t(this);
                if (com.fyber.inneractive.sdk.util.o.a(this.f18682b) instanceof Activity) {
                    ((Activity) com.fyber.inneractive.sdk.util.o.a(this.f18682b)).getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f18714m0);
                }
            }
            this.X = z10;
            j1 j1Var = this.f18687g;
            if (j1Var != null) {
                ((b0) j1Var).b(z10);
            }
            d(z11);
            if (this.f18706e0 >= 0) {
                this.f18706e0 = com.fyber.inneractive.sdk.util.o.b(i11);
            }
            if (this.f18705d0 >= 0) {
                this.f18705d0 = com.fyber.inneractive.sdk.util.o.b(i10);
            }
            m mVar = this.f18682b;
            ViewGroup viewGroup3 = (ViewGroup) mVar.getParent();
            if (viewGroup3 == null) {
                viewGroup = null;
            } else {
                View viewFindViewById = viewGroup3.findViewById(R.id.ia_identifier_overlay);
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                } else {
                    viewGroup = null;
                }
            }
            if (str != null) {
                m mVar2 = new m();
                this.S = mVar2;
                mVar2.setId(R.id.ia_inneractive_webview_mraid);
                DTExchangeNetworkBridge.webviewLoadUrl(this.S, str);
                this.S.setWebChromeClient(this.f18683c);
                this.S.setWebViewClient(this.f18684d);
                mVar = this.S;
                mVar.setOnKeyListener(new u(this));
            } else {
                ViewGroup viewGroup4 = (ViewGroup) this.f18682b.getParent();
                if (viewGroup4 != null) {
                    int childCount = viewGroup4.getChildCount();
                    int i12 = 0;
                    while (i12 < childCount && viewGroup4.getChildAt(i12) != this.f18682b) {
                        i12++;
                    }
                    ViewGroup viewGroup5 = (ViewGroup) viewGroup4.findViewById(R.id.ia_identifier_overlay);
                    this.f18708g0 = i12;
                    com.fyber.inneractive.sdk.util.v.a(viewGroup5);
                    com.fyber.inneractive.sdk.util.v.a(this.f18709h0);
                    viewGroup4.addView(this.f18709h0, i12);
                    FrameLayout frameLayout = this.f18709h0;
                    int width = this.f18682b.getWidth();
                    int height = this.f18682b.getHeight();
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    layoutParams.width = width;
                    layoutParams.height = height;
                    frameLayout.setLayoutParams(layoutParams);
                    com.fyber.inneractive.sdk.util.o.a(this.f18709h0, 17);
                    viewGroup4.removeView(this.f18682b);
                }
            }
            float f10 = this.Y;
            int i13 = (int) ((50.0f * f10) + 0.5f);
            if (i11 >= 0 && i10 >= 0) {
                i10 = (int) (i10 * f10);
                i11 = (int) (i11 * f10);
                if (i10 < i13) {
                    i10 = i13;
                }
                if (i11 < i13) {
                    i11 = i13;
                }
            }
            View view = new View(com.fyber.inneractive.sdk.util.o.a(this.f18682b));
            view.setBackgroundColor(com.fyber.inneractive.sdk.util.o.a(this.f18682b).getResources().getColor(R.color.ia_mraid_expanded_dimmed_bk));
            view.setOnTouchListener(new n());
            this.f18711j0.addView(view);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            view.setLayoutParams(layoutParams2);
            com.fyber.inneractive.sdk.util.v.a(mVar);
            this.f18710i0.addView(mVar);
            ViewGroup.LayoutParams layoutParams3 = mVar.getLayoutParams();
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            mVar.setLayoutParams(layoutParams3);
            com.fyber.inneractive.sdk.util.v.a(this.f18710i0);
            this.f18711j0.addView(this.f18710i0);
            FrameLayout frameLayout2 = this.f18710i0;
            ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
            layoutParams4.width = i10;
            layoutParams4.height = i11;
            frameLayout2.setLayoutParams(layoutParams4);
            com.fyber.inneractive.sdk.util.o.a(this.f18710i0, 17);
            com.fyber.inneractive.sdk.util.v.a(this.f18711j0);
            this.R.addView(this.f18711j0);
            FrameLayout frameLayout3 = this.f18711j0;
            ViewGroup.LayoutParams layoutParams5 = frameLayout3.getLayoutParams();
            layoutParams5.width = -1;
            layoutParams5.height = -1;
            frameLayout3.setLayoutParams(layoutParams5);
            if (!mVar.hasFocus()) {
                mVar.requestFocus();
            }
            d0 d0Var = this.P;
            if (d0Var == d0.ALWAYS_VISIBLE || (!this.X && d0Var != d0.ALWAYS_HIDDEN)) {
                c(true);
            }
            com.fyber.inneractive.sdk.mraid.f0 f0Var = com.fyber.inneractive.sdk.mraid.f0.EXPANDED;
            this.N = f0Var;
            a(new com.fyber.inneractive.sdk.mraid.d0(f0Var));
            int i14 = this.f18705d0;
            if (i14 != -1 && this.f18706e0 != -1) {
                a(new com.fyber.inneractive.sdk.mraid.x(com.fyber.inneractive.sdk.util.o.c(i14), com.fyber.inneractive.sdk.util.o.c(this.f18706e0)));
            }
            a(com.fyber.inneractive.sdk.mraid.k.EXPAND);
            if (viewGroup != null) {
                int dimension = (int) viewGroup.getContext().getResources().getDimension(R.dimen.ia_identifier_padding);
                viewGroup.setPadding(dimension, 0, 0, dimension);
                viewGroup.setLayoutParams(this.R.getLayoutParams());
                this.R.addView(viewGroup);
            }
            j1 j1Var2 = this.f18687g;
            if (j1Var2 != null) {
                ((b0) j1Var2).c();
            }
        } catch (Exception unused) {
            IAlog.f("Couldn't find content in the view tree", new Object[0]);
            a(com.fyber.inneractive.sdk.mraid.k.RESIZE, "Ad can be resized only if it's state is default or resized.");
        }
    }

    public static HashMap a(Map map) {
        String str;
        HashMap map2 = new HashMap();
        if (map.containsKey(UnifiedMediationParams.KEY_DESCRIPTION) && map.containsKey("start")) {
            map2.put("title", map.get(UnifiedMediationParams.KEY_DESCRIPTION));
            if (map.containsKey("start") && map.get("start") != null) {
                Date dateA = a((String) map.get("start"));
                if (dateA != null) {
                    map2.put("beginTime", Long.valueOf(dateA.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date dateA2 = a((String) map.get("end"));
                        if (dateA2 != null) {
                            map2.put("endTime", Long.valueOf(dateA2.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
                    }
                    if (map.containsKey("location")) {
                        map2.put("eventLocation", map.get("location"));
                    }
                    if (map.containsKey("summary")) {
                        map2.put(UnifiedMediationParams.KEY_DESCRIPTION, map.get("summary"));
                    }
                    if (map.containsKey("transparency")) {
                        map2.put("availability", Integer.valueOf(C3426d4.i.T.equals(map.get("transparency")) ? 1 : 0));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (map.containsKey("frequency")) {
                        String str2 = (String) map.get("frequency");
                        int i10 = map.containsKey("interval") ? Integer.parseInt((String) map.get("interval")) : -1;
                        if ("daily".equals(str2)) {
                            sb2.append("FREQ=DAILY;");
                            if (i10 != -1) {
                                sb2.append("INTERVAL=" + i10 + ";");
                            }
                        } else {
                            if ("weekly".equals(str2)) {
                                sb2.append("FREQ=WEEKLY;");
                                if (i10 != -1) {
                                    sb2.append("INTERVAL=" + i10 + ";");
                                }
                                if (map.containsKey("daysInWeek")) {
                                    String str3 = (String) map.get("daysInWeek");
                                    StringBuilder sb3 = new StringBuilder();
                                    boolean[] zArr = new boolean[7];
                                    String[] strArrSplit = str3.split(StringUtils.COMMA);
                                    for (String str4 : strArrSplit) {
                                        int i11 = Integer.parseInt(str4);
                                        if (i11 == 7) {
                                            i11 = 0;
                                        }
                                        if (!zArr[i11]) {
                                            StringBuilder sb4 = new StringBuilder();
                                            switch (i11) {
                                                case 0:
                                                    str = "SU";
                                                    break;
                                                case 1:
                                                    str = "MO";
                                                    break;
                                                case 2:
                                                    str = "TU";
                                                    break;
                                                case 3:
                                                    str = "WE";
                                                    break;
                                                case 4:
                                                    str = "TH";
                                                    break;
                                                case 5:
                                                    str = "FR";
                                                    break;
                                                case 6:
                                                    str = "SA";
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of week ", i11));
                                            }
                                            sb4.append(str);
                                            sb4.append(StringUtils.COMMA);
                                            sb3.append(sb4.toString());
                                            zArr[i11] = true;
                                        }
                                    }
                                    if (strArrSplit.length != 0) {
                                        sb3.deleteCharAt(sb3.length() - 1);
                                        String string = sb3.toString();
                                        if (string == null) {
                                            throw new IllegalArgumentException("invalid ");
                                        }
                                        sb2.append("BYDAY=" + string + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                                    }
                                }
                            } else if ("monthly".equals(str2)) {
                                sb2.append("FREQ=MONTHLY;");
                                if (i10 != -1) {
                                    sb2.append("INTERVAL=" + i10 + ";");
                                }
                                if (map.containsKey("daysInMonth")) {
                                    String str5 = (String) map.get("daysInMonth");
                                    StringBuilder sb5 = new StringBuilder();
                                    boolean[] zArr2 = new boolean[63];
                                    String[] strArrSplit2 = str5.split(StringUtils.COMMA);
                                    for (String str6 : strArrSplit2) {
                                        int i12 = Integer.parseInt(str6);
                                        int i13 = i12 + 31;
                                        if (!zArr2[i13]) {
                                            StringBuilder sb6 = new StringBuilder();
                                            if (i12 != 0 && i12 >= -31 && i12 <= 31) {
                                                sb6.append("" + i12);
                                                sb6.append(StringUtils.COMMA);
                                                sb5.append(sb6.toString());
                                                zArr2[i13] = true;
                                            } else {
                                                throw new IllegalArgumentException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("invalid day of month ", i12));
                                            }
                                        }
                                    }
                                    if (strArrSplit2.length != 0) {
                                        sb5.deleteCharAt(sb5.length() - 1);
                                        String string2 = sb5.toString();
                                        if (string2 == null) {
                                            throw new IllegalArgumentException();
                                        }
                                        sb2.append("BYMONTHDAY=" + string2 + ";");
                                    } else {
                                        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                            }
                        }
                    }
                    String string3 = sb2.toString();
                    if (!TextUtils.isEmpty(string3)) {
                        map2.put("rrule", string3);
                    }
                    return map2;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    public static Date a(String str) {
        Date date = null;
        int i10 = 0;
        while (true) {
            String[] strArr = f18701o0;
            if (i10 >= 2) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i10], Locale.getDefault()).parse(str);
                if (date != null) {
                    break;
                }
                i10++;
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar, String str) {
        String strA = kVar.a();
        m mVar = this.f18682b;
        if (mVar != null) {
            mVar.a("window.mraidbridge.fireErrorEvent('" + strA + "', '" + str + "');");
        }
    }

    public static LinkedHashMap a(URI uri) {
        int i10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split(C3426d4.j.f28584c)) {
                int iIndexOf = str.indexOf("=");
                linkedHashMap.put(iIndexOf > 0 ? URLDecoder.decode(str.substring(0, iIndexOf), "UTF-8") : str, (iIndexOf <= 0 || str.length() <= (i10 = iIndexOf + 1)) ? null : URLDecoder.decode(str.substring(i10), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    public final void a(View view, com.fyber.inneractive.sdk.measurement.tracker.d dVar) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        if (view == null || (eVar = this.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.f15831a;
            if (adSession != null) {
                if (dVar == com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton) {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.CLOSE_AD, dVar.name());
                } else {
                    adSession.addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, dVar.name());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(com.fyber.inneractive.sdk.mraid.k kVar) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.BANNER_RESIZE_EXPAND;
        InneractiveAdRequest inneractiveAdRequest = this.f18698r;
        com.fyber.inneractive.sdk.flow.x xVar = this.f18699s;
        com.fyber.inneractive.sdk.response.e eVarB = xVar != null ? xVar.b() : null;
        com.fyber.inneractive.sdk.flow.x xVar2 = this.f18699s;
        JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f15748c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
        wVar.f16129c = uVar;
        wVar.f16127a = inneractiveAdRequest;
        wVar.f16130d = jSONArrayB;
        wVar.a("action", kVar.a()).a((String) null);
    }
}
