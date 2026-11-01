package com.mbridge.msdk.splash.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.ironsource.C3426d4;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class MBSplashView extends RelativeLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static String f37277u = "MBSplashView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBSplashWebview f37279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.splash.view.a f37280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewGroup f37281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f37282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f37283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f37287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ViewGroup f37288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f37289l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f37291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout.LayoutParams f37292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.splash.signal.b f37293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private DyCountDownListener f37294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View.OnTouchListener f37296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f37297t;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.f37295r;
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37299a;

        public b(CampaignEx campaignEx) {
            this.f37299a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.b(this.f37299a);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBSplashView.f37277u, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.f37279b.getLocationOnScreen(iArr);
                    q0.b(MBSplashView.f37277u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th2) {
                    q0.b(MBSplashView.f37277u, th2.getMessage(), th2);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.f37279b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.f37279b, iArr2[0], iArr2[1], MBSplashView.this.f37279b.getWidth(), MBSplashView.this.f37279b.getHeight());
                f.a().a((WebView) MBSplashView.this.f37279b, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public void clearResState() {
        this.f37287j = false;
        this.f37286i = false;
        this.f37285h = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void resetLoadState() {
        this.f37286i = false;
        this.f37285h = false;
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        setBackgroundColor(0);
        this.f37278a = getResources().getConfiguration().orientation;
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        String str;
        q0.b(f37277u, "transInfoForMraid");
        try {
            int i14 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i14 == 2) {
                str = C3426d4.i.C;
            } else {
                str = i14 == 1 ? C3426d4.i.D : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "default");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th2) {
            q0.b(f37277u, "transInfoForMraid", th2);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f37282e;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.f37296s;
    }

    public View getCloseView() {
        return this.f37282e;
    }

    public ViewGroup getDevContainer() {
        return this.f37288k;
    }

    public View getIconVg() {
        return this.f37283f;
    }

    public View getSplashNativeView() {
        return this.f37289l;
    }

    public com.mbridge.msdk.splash.signal.b getSplashSignalCommunicationImpl() {
        return this.f37293p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f37279b;
    }

    public boolean isAttach() {
        return this.f37291n;
    }

    public boolean isDynamicView() {
        return this.f37290m;
    }

    public boolean isH5Ready() {
        return this.f37285h;
    }

    public boolean isImageReady() {
        return this.f37287j;
    }

    public boolean isVideoReady() {
        return this.f37286i;
    }

    public void onPause() {
        View view = this.f37289l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f37289l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setAllowClickSplash(boolean z10) {
        this.f37295r = z10;
        setOnTouchListener(this.f37296s);
    }

    public void setCloseView(View view) {
        this.f37282e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f37288k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f37294q = dyCountDownListener;
    }

    public void setDynamicView(boolean z10) {
        this.f37290m = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f37285h = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f37283f = view;
        this.f37292o = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f37287j = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        View view = this.f37289l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
        if (this.f37279b != null) {
            f.a().a((WebView) this.f37279b, "oncutoutfetched", Base64.encodeToString(d0.a(-999, i10, i11, i12, i13).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f37289l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(com.mbridge.msdk.splash.signal.b bVar) {
        this.f37293p = bVar;
        MBSplashWebview mBSplashWebview = this.f37279b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(bVar);
        }
    }

    public void setSplashWebView() {
        if (this.f37279b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f37279b = mBSplashWebview;
                com.mbridge.msdk.splash.signal.b bVar = this.f37293p;
                if (bVar != null) {
                    mBSplashWebview.setObject(bVar);
                }
                com.mbridge.msdk.splash.view.a aVar = this.f37280c;
                if (aVar != null) {
                    this.f37279b.setWebViewClient(aVar);
                    return;
                }
                com.mbridge.msdk.splash.view.a aVar2 = new com.mbridge.msdk.splash.view.a();
                this.f37280c = aVar2;
                this.f37279b.setWebViewClient(aVar2);
            } catch (Throwable th2) {
                q0.b(f37277u, th2.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z10) {
        this.f37286i = z10;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.f37293p != null && (viewGroup = this.f37288k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f37293p.a(this.f37288k.getContext());
            com.mbridge.msdk.splash.view.a aVar = this.f37280c;
            if (aVar != null) {
                aVar.a(this.f37293p.a());
            }
        }
        a(campaignEx);
        clearResState();
    }

    public void updateCountdown(int i10) {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f37279b != null && !this.f37290m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i10);
                f.a().a((WebView) this.f37279b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (this.f37290m && (view = this.f37289l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i10);
        }
        if (!this.f37290m || (dyCountDownListener = this.f37294q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i10);
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37295r = true;
        this.f37296s = new a();
        this.f37297t = true;
        b();
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f37288k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f37279b;
        if (mBSplashWebview != null && !mBSplashWebview.isDestoryed()) {
            this.f37279b.finishAdSession();
            com.mbridge.msdk.splash.signal.c.a(this.f37279b, "onSystemDestory", "");
            this.f37279b.release();
            this.f37279b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37291n = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    private void a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.f37297t = true;
        if (this.f37283f == null) {
            if (this.f37290m && (view3 = this.f37289l) != null) {
                if (view3.getParent() != null) {
                    f1.a(this.f37289l);
                }
                addView(this.f37289l, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.f37279b;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.f37279b, new ViewGroup.LayoutParams(-1, -1));
                }
                b(campaignEx);
            }
        } else {
            if (this.f37281d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f37281d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f37278a == 2) {
                this.f37284g = v0.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f37281d.getId());
                if (this.f37290m && (view2 = this.f37289l) != null) {
                    if (view2.getParent() != null) {
                        f1.a(this.f37289l);
                    }
                    addView(this.f37289l, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.f37279b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f37279b, layoutParams);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup = this.f37281d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i10 = this.f37292o.width;
                    f1.a(this.f37283f);
                    int i11 = this.f37284g / 4;
                    if (i10 > i11) {
                        this.f37281d.addView(this.f37283f, i11, -1);
                        i10 = i11;
                    } else {
                        this.f37281d.addView(this.f37283f, i10, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f37281d, layoutParams2);
                }
            } else {
                this.f37284g = v0.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f37281d.getId());
                if (this.f37290m && (view = this.f37289l) != null) {
                    if (view.getParent() != null) {
                        f1.a(this.f37289l);
                    }
                    addView(this.f37289l, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.f37279b;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.f37279b, layoutParams3);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup2 = this.f37281d;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i12 = this.f37292o.height;
                    int i13 = this.f37284g / 4;
                    if (i12 > i13) {
                        i12 = i13;
                    }
                    f1.a(this.f37283f);
                    this.f37281d.addView(this.f37283f, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f37281d, layoutParams4);
                }
            }
        }
        View view4 = this.f37282e;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v0.a(getContext(), 100.0f), v0.a(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = v0.a(getContext(), 10.0f);
                layoutParams5.topMargin = v0.a(getContext(), 10.0f);
                addView(this.f37282e, layoutParams5);
                return;
            }
            bringChildToFront(this.f37282e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        MBSplashWebview mBSplashWebview = this.f37279b;
        if (mBSplashWebview != null) {
            if (!(campaignEx != null ? h.b(campaignEx, null, mBSplashWebview, campaignEx.getImpReportType()) : true)) {
                if (this.f37297t) {
                    this.f37297t = false;
                    this.f37279b.postDelayed(new b(campaignEx), 200L);
                    return;
                }
                return;
            }
            this.f37279b.setObject(this.f37293p);
            this.f37279b.post(new c());
        }
    }
}
