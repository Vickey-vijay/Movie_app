package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.mwh;
import com.bytedance.sdk.openadsdk.common.th;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.ko;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity {

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public vm f12077cj;
    private LinearLayout coz;
    private com.bytedance.sdk.openadsdk.core.widget.ouw.fkw euf;
    private th fwd;
    private com.bytedance.sdk.openadsdk.common.fkw lvd;
    private TextView mt;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private boolean f12079ng;
    public TTAdDislikeToast pv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private PAGLogoView f12080sd;
    private mwh ucs;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private View f12081vh;
    private TextView xdk;
    private boolean yhj;
    private View yib;
    private long zvq;
    private boolean myk = false;
    public final AtomicBoolean wp = new AtomicBoolean(false);

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public final AtomicBoolean f12078kn = new AtomicBoolean(false);

    public static /* synthetic */ boolean tlj(TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity) {
        tTVideoLandingPageLink2Activity.yhj = true;
        return true;
    }

    public static /* synthetic */ boolean yu(TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity) {
        tTVideoLandingPageLink2Activity.myk = true;
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        vpp vppVar;
        com.bytedance.sdk.component.bly.le leVar;
        qbp qbpVar;
        qbp qbpVar2;
        super.onCreate(bundle);
        if (!jg.fkw() || (vppVar = this.f12071rn) == null || (leVar = ((TTVideoLandingPageActivity) this).ouw) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(vppVar, leVar, this.fkw);
        this.lvd = fkwVarOuw;
        if (fkwVarOuw != null) {
            fkwVarOuw.ouw("landingpage_split_screen");
        }
        this.f12079ng = zih.yu().jg();
        if (((TTVideoLandingPageActivity) this).ouw.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).ouw.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar = TTVideoLandingPageLink2Activity.this.rrs;
                    if (mwhVar != null) {
                        mwhVar.ouw(i11);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(this.fkw, this.pno, this.f12066le, this.lvd, this.rrs) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageLink2Activity$7;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str);
                safedk_TTVideoLandingPageLink2Activity$7_onPageFinished_29d2550c931810cdffd6cc4615910995(webView, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                return CreativeInfoManager.onWebViewResponse(g.f44975u, view, url, super.shouldInterceptRequest(view, url));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.zvq = System.currentTimeMillis();
            }

            public void safedk_TTVideoLandingPageLink2Activity$7_onPageFinished_29d2550c931810cdffd6cc4615910995(WebView p10, String p11) {
                super.onPageFinished(p10, p11);
                try {
                    if (TTVideoLandingPageLink2Activity.this.f12081vh != null && !TTVideoLandingPageLink2Activity.this.yhj) {
                        TTVideoLandingPageLink2Activity.this.f12081vh.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.coz != null) {
                        TTVideoLandingPageLink2Activity.this.coz.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.yu(TTVideoLandingPageLink2Activity.this);
                    TTVideoLandingPageLink2Activity.this.mwh();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageLink2Activity.f12071rn, tTVideoLandingPageLink2Activity.f12069pd, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.zvq, true);
                } catch (Throwable unused) {
                }
            }
        };
        this.euf = fkwVar;
        fkwVar.f13107ko = this.f12071rn;
        ((TTVideoLandingPageActivity) this).ouw.setWebViewClient(fkwVar);
        ((TTVideoLandingPageActivity) this).ouw.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.pno, this.rrs, this.lvd) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (TTVideoLandingPageLink2Activity.this.f12079ng && TTVideoLandingPageLink2Activity.this.fwd != null && i10 == 100) {
                    TTVideoLandingPageLink2Activity.this.fwd.ouw(webView, TTVideoLandingPageLink2Activity.this.ux);
                }
                if (TTVideoLandingPageLink2Activity.this.ucs != null) {
                    TTVideoLandingPageLink2Activity.this.ucs.ouw(i10);
                }
            }
        });
        TextView textView = (TextView) findViewById(rn.nit);
        if (textView != null && (qbpVar2 = this.f12071rn.kq) != null) {
            textView.setText(qbpVar2.fkw);
        }
        long j10 = 10000;
        vpp vppVar2 = this.f12071rn;
        if (vppVar2 != null && (qbpVar = vppVar2.kq) != null) {
            j10 = qbpVar.ouw * 1000;
        }
        jg.lh().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTVideoLandingPageLink2Activity.tlj(TTVideoLandingPageLink2Activity.this);
                    if (TTVideoLandingPageLink2Activity.this.ucs != null) {
                        TTVideoLandingPageLink2Activity.this.ucs.vt();
                    }
                    TTVideoLandingPageLink2Activity.this.yib.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.f12080sd != null) {
                        TTVideoLandingPageLink2Activity.this.f12080sd.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.myk) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageLink2Activity.f12071rn, tTVideoLandingPageLink2Activity.f12069pd, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.zvq, false);
                } catch (Exception unused) {
                }
            }
        }, j10);
    }

    public static /* synthetic */ void ko(TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity) {
        com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageLink2Activity.f12071rn, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mwh() {
        mwh mwhVar = this.ucs;
        if (mwhVar != null) {
            mwhVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public final void cf() {
        super.cf();
        vpp vppVar = this.f12071rn;
        if (vppVar != null) {
            vppVar.f12844cd = true;
        }
        TextView textView = this.xdk;
        if (textView != null) {
            textView.setText(yu());
            this.xdk.setClickable(true);
            this.xdk.setOnClickListener(this.f12074ub);
            this.xdk.setOnTouchListener(this.f12074ub);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public final void le() {
        super.le();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(com.bytedance.sdk.component.utils.vpp.ouw(zih.ouw(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageLink2Activity$12;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_TTVideoLandingPageLink2Activity$12_onClick_894a37655b01d0c1a7c730b2114f467f(view);
                }

                public void safedk_TTVideoLandingPageLink2Activity$12_onClick_894a37655b01d0c1a7c730b2114f467f(View p10) {
                    TTVideoLandingPageLink2Activity.this.ryl();
                }
            });
        }
        this.mt = (TextView) findViewById(520093714);
        this.ucs = (mwh) findViewById(rn.f13437ub);
        this.f12081vh = findViewById(rn.lso);
        this.yib = findViewById(rn.fak);
        TextView textView2 = (TextView) findViewById(rn.pv);
        TextView textView3 = (TextView) findViewById(rn.wp);
        com.bytedance.sdk.openadsdk.core.widget.zih zihVar = (com.bytedance.sdk.openadsdk.core.widget.zih) findViewById(rn.f13409cj);
        this.xdk = (TextView) findViewById(rn.f13418kn);
        com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = this.f12071rn.fak;
        if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.f12071rn;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, zihVar, vppVar);
        }
        textView2.setText(this.f12071rn.f12883vh);
        textView3.setText(this.f12071rn.hun);
        View viewFindViewById = findViewById(rn.ucs);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageLink2Activity$13;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_TTVideoLandingPageLink2Activity$13_onClick_c48c78cdf038801b4a80a07480afd49e(view);
            }

            public void safedk_TTVideoLandingPageLink2Activity$13_onClick_c48c78cdf038801b4a80a07480afd49e(View p10) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.ouw(tTVideoLandingPageLink2Activity.fkw, tTVideoLandingPageLink2Activity.f12071rn, tTVideoLandingPageLink2Activity.f12069pd);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.f12071rn);
        }
        com.bytedance.sdk.component.bly.le leVar = ((TTVideoLandingPageActivity) this).ouw;
        if (leVar != null && leVar.getWebView() != null) {
            uoy.ouw(this.f12071rn, ((TTVideoLandingPageActivity) this).ouw);
        }
        boolean zJg = zih.yu().jg();
        this.f12079ng = zJg;
        if (zJg) {
            ((com.bytedance.sdk.openadsdk.common.rn) findViewById(rn.yib)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(rn.f13433sd);
            this.coz = linearLayout;
            linearLayout.setVisibility(8);
            this.fwd = new th(this, this.coz, ((TTVideoLandingPageActivity) this).ouw, this.f12071rn, "landingpage_split_screen");
            if (((TTVideoLandingPageActivity) this).ouw.getWebView() != null) {
                ((TTVideoLandingPageActivity) this).ouw.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    public float ouw = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageLink2Activity$14;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
                        return safedk_TTVideoLandingPageLink2Activity$14_onTouch_a34d5a4f92d5a6c1e5ed04d7ec9967ed(view, motionEvent);
                    }

                    public boolean safedk_TTVideoLandingPageLink2Activity$14_onTouch_a34d5a4f92d5a6c1e5ed04d7ec9967ed(View p10, MotionEvent p11) {
                        if (p11.getAction() == 0) {
                            this.ouw = p11.getY();
                        }
                        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = TTVideoLandingPageLink2Activity.this.rrs;
                        if (mwhVar != null) {
                            mwhVar.ouw(p11);
                        }
                        if (TTVideoLandingPageLink2Activity.this.lvd != null) {
                            TTVideoLandingPageLink2Activity.this.lvd.ouw(p11);
                        }
                        if (p11.getAction() == 2) {
                            float y10 = p11.getY();
                            float f10 = this.ouw;
                            if (y10 - f10 > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.fwd != null) {
                                    TTVideoLandingPageLink2Activity.this.fwd.ouw();
                                }
                                return false;
                            }
                            if (y10 - f10 < -8.0f && TTVideoLandingPageLink2Activity.this.fwd != null) {
                                TTVideoLandingPageLink2Activity.this.fwd.vt();
                            }
                        }
                        return false;
                    }
                });
            }
        } else if (((TTVideoLandingPageActivity) this).ouw.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).ouw.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageLink2Activity$2;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
                    return safedk_TTVideoLandingPageLink2Activity$2_onTouch_e07c7ecb533d7d8a1fd10db6e64ff98c(view, motionEvent);
                }

                public boolean safedk_TTVideoLandingPageLink2Activity$2_onTouch_e07c7ecb533d7d8a1fd10db6e64ff98c(View p10, MotionEvent p11) {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar = TTVideoLandingPageLink2Activity.this.rrs;
                    if (mwhVar != null) {
                        mwhVar.ouw(p11);
                    }
                    if (TTVideoLandingPageLink2Activity.this.lvd == null) {
                        return false;
                    }
                    TTVideoLandingPageLink2Activity.this.lvd.ouw(p11);
                    return false;
                }
            });
        }
        mwh mwhVar = this.ucs;
        if (mwhVar != null) {
            mwhVar.ouw(this.f12071rn);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public final View lh() {
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(this);
        if (Build.VERSION.SDK_INT >= 35) {
            fkwVar.setFitsSystemWindows(true);
        }
        fkwVar.setOrientation(1);
        fkwVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(this);
        fkwVar.addView(lhVar, new LinearLayout.LayoutParams(-1, osn.ouw(this, 220.0f)));
        View lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(this);
        lhVar2.setId(rn.uoy);
        lhVar.addView(lhVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(this);
        fkwVar2.setOrientation(0);
        fkwVar2.setPadding(0, osn.ouw(this, 20.0f), 0, 0);
        lhVar.addView(fkwVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        fkwVar2.addView(view, layoutParams);
        ko koVar = new ko(this);
        koVar.setId(520093713);
        koVar.setGravity(17);
        koVar.setText(com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_reward_feedback"));
        koVar.setTextColor(-1);
        koVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, osn.ouw(this, 28.0f));
        int iOuw = osn.ouw(this, 16.0f);
        layoutParams2.rightMargin = iOuw;
        layoutParams2.leftMargin = iOuw;
        fkwVar2.addView(koVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.widget.jg jgVar = new com.bytedance.sdk.openadsdk.core.widget.jg(this);
        jgVar.setId(rn.osn);
        jgVar.setPadding(osn.ouw(this, 7.0f), osn.ouw(this, 7.0f), osn.ouw(this, 7.0f), osn.ouw(this, 7.0f));
        jgVar.setImageResource(com.bytedance.sdk.component.utils.vpp.yu(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(osn.ouw(this, 28.0f), osn.ouw(this, 28.0f));
        layoutParams3.rightMargin = osn.ouw(this, 12.0f);
        fkwVar2.addView(jgVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(this);
        raVar.setVisibility(8);
        raVar.setId(rn.ey);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = osn.ouw(this, 10.0f);
        fkwVar.addView(raVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.widget.ouw(this);
        ouwVar.setId(rn.rrs);
        ouwVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        ouwVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(osn.ouw(this, 44.0f), osn.ouw(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = osn.ouw(this, 5.0f);
        raVar.addView(ouwVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        int i10 = rn.jvy;
        pnoVar.setId(i10);
        pnoVar.setBackground(cf.ouw(this, "tt_circle_solid_mian"));
        pnoVar.setGravity(17);
        pnoVar.setTextColor(-1);
        pnoVar.setTextSize(2, 19.0f);
        pnoVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(osn.ouw(this, 44.0f), osn.ouw(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = osn.ouw(this, 5.0f);
        raVar.addView(pnoVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar2.setId(rn.fqk);
        pnoVar2.setMaxLines(1);
        pnoVar2.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar2.setTextColor(Color.parseColor("#e5000000"));
        pnoVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15);
        layoutParams7.leftMargin = osn.ouw(this, 5.0f);
        layoutParams7.rightMargin = osn.ouw(this, 80.0f);
        layoutParams7.addRule(1, i10);
        raVar.addView(pnoVar2, layoutParams7);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar3.setId(rn.hun);
        pnoVar3.setClickable(true);
        pnoVar3.setMaxLines(1);
        pnoVar3.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar3.setFocusable(true);
        pnoVar3.setGravity(17);
        pnoVar3.setText(com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_video_mobile_go_detail"));
        pnoVar3.setTextColor(-1);
        pnoVar3.setTextSize(2, 14.0f);
        pnoVar3.setPadding(osn.ouw(this, 2.0f), osn.ouw(this, 2.0f), osn.ouw(this, 2.0f), osn.ouw(this, 2.0f));
        pnoVar3.setBackground(cf.ouw(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(osn.ouw(this, 90.0f), osn.ouw(this, 36.0f));
        layoutParams8.addRule(11);
        layoutParams8.addRule(15);
        layoutParams8.rightMargin = osn.ouw(this, 5.0f);
        raVar.addView(pnoVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar3 = new com.bytedance.sdk.openadsdk.core.le.lh(this);
        fkwVar.addView(lhVar3, new LinearLayout.LayoutParams(-1, -1));
        View leVar = new com.bytedance.sdk.component.bly.le(this, com.bytedance.sdk.component.bly.le.lh.LANDING_PAGE);
        leVar.setId(rn.ux);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams9.topMargin = osn.ouw(this, 2.0f);
        lhVar3.addView(leVar, layoutParams9);
        com.bytedance.sdk.openadsdk.core.le.ra raVar2 = new com.bytedance.sdk.openadsdk.core.le.ra(this);
        raVar2.setId(rn.lso);
        raVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        lhVar3.addView(raVar2, new FrameLayout.LayoutParams(-1, -1));
        View mwhVar = new mwh(this);
        mwhVar.setId(rn.f13437ub);
        raVar2.addView(mwhVar, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(this);
        fkwVar3.setId(rn.fak);
        fkwVar3.setOrientation(1);
        fkwVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams10.addRule(13);
        raVar2.addView(fkwVar3, layoutParams10);
        com.bytedance.sdk.openadsdk.core.widget.zih zihVar = new com.bytedance.sdk.openadsdk.core.widget.zih(this);
        zihVar.setId(rn.f13409cj);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(osn.ouw(this, 80.0f), osn.ouw(this, 80.0f));
        layoutParams11.gravity = 17;
        fkwVar3.addView(zihVar, layoutParams11);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar4 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar4.setId(rn.pv);
        pnoVar4.setTextColor(Color.parseColor("#161823"));
        pnoVar4.setTextSize(0, osn.ouw(this, 24.0f));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        layoutParams12.topMargin = osn.ouw(this, 12.0f);
        fkwVar3.addView(pnoVar4, layoutParams12);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar5 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar5.setId(rn.wp);
        pnoVar5.setTextColor(Color.parseColor("#80161823"));
        pnoVar5.setTextSize(0, osn.ouw(this, 16.0f));
        pnoVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams13.gravity = 17;
        int iOuw2 = osn.ouw(this, 60.0f);
        layoutParams13.rightMargin = iOuw2;
        layoutParams13.leftMargin = iOuw2;
        layoutParams13.topMargin = osn.ouw(this, 8.0f);
        fkwVar3.addView(pnoVar5, layoutParams13);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar6 = new com.bytedance.sdk.openadsdk.core.le.pno(this);
        pnoVar6.setId(rn.f13418kn);
        pnoVar6.setGravity(17);
        pnoVar6.setTextColor(-1);
        pnoVar6.setText(com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_video_mobile_go_detail"));
        pnoVar6.setBackground(cf.ouw(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(osn.ouw(this, 255.0f), osn.ouw(this, 44.0f));
        layoutParams14.gravity = 17;
        layoutParams14.topMargin = osn.ouw(this, 32.0f);
        fkwVar3.addView(pnoVar6, layoutParams14);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.f12080sd = pAGLogoView;
        pAGLogoView.setId(rn.ucs);
        this.f12080sd.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, osn.ouw(this, 14.0f));
        layoutParams15.addRule(12);
        layoutParams15.leftMargin = osn.ouw(this, 18.0f);
        layoutParams15.bottomMargin = osn.ouw(this, 61.0f);
        raVar2.addView(this.f12080sd, layoutParams15);
        View rnVar = new com.bytedance.sdk.openadsdk.common.rn(this, new com.bytedance.sdk.openadsdk.common.rn.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.rn.ouw
            public final View ouw(Context context) {
                return new com.bytedance.sdk.openadsdk.common.pno(context);
            }
        });
        rnVar.setId(rn.f13440vh);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, osn.ouw(this, 48.0f));
        layoutParams16.gravity = 81;
        lhVar3.addView(rnVar, layoutParams16);
        View rnVar2 = new com.bytedance.sdk.openadsdk.common.rn(this, new com.bytedance.sdk.openadsdk.common.rn.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.rn.ouw
            public final View ouw(Context context) {
                return new com.bytedance.sdk.openadsdk.common.bly(context);
            }
        });
        rnVar2.setId(rn.yib);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, osn.ouw(this, 44.0f));
        layoutParams17.gravity = 80;
        lhVar3.addView(rnVar2, layoutParams17);
        return fkwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public final boolean pno() {
        int i10 = this.f12062cf;
        return i10 == 5 || i10 == 15 || i10 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    @SuppressLint({"ClickableViewAccessibility"})
    public final void ra() {
        if (!pno()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.th.vt.ouw();
                com.bytedance.sdk.openadsdk.th.vt.ouw(this.f12071rn.f12877tc.get(0), imageView, this.f12071rn);
                this.tlj.setVisibility(0);
                this.tlj.removeAllViews();
                this.tlj.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageLink2Activity$5;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view);
                        safedk_TTVideoLandingPageLink2Activity$5_onClick_9fee6148bff7bd1fe5405435fc5d12f6(view);
                    }

                    public void safedk_TTVideoLandingPageLink2Activity$5_onClick_9fee6148bff7bd1fe5405435fc5d12f6(View p10) {
                        com.bytedance.sdk.openadsdk.yu.lh.vt(TTVideoLandingPageLink2Activity.this.f12071rn, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.ra();
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null) {
            if (leVar.getNativeVideoController() != null) {
                this.ryl.getNativeVideoController().vt(false);
                this.ryl.getNativeVideoController().rrs = false;
                this.tlj.setClickable(true);
                this.tlj.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageLink2Activity$3;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
                        return safedk_TTVideoLandingPageLink2Activity$3_onTouch_fbfa42fcd09872eeca58acfca8fa69ec(view, motionEvent);
                    }

                    public boolean safedk_TTVideoLandingPageLink2Activity$3_onTouch_fbfa42fcd09872eeca58acfca8fa69ec(View p10, MotionEvent p11) {
                        if (p11.getAction() == 0) {
                            TTVideoLandingPageLink2Activity.ko(TTVideoLandingPageLink2Activity.this);
                            return false;
                        }
                        return false;
                    }
                });
            }
            this.ryl.getNativeVideoController().f12913od = new com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
                public final void ouw() {
                }

                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
                public final void ouw(long j10, int i10) {
                }

                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
                public final void vt(long j10, int i10) {
                }

                @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
                public final void ouw(long j10, long j11) {
                    if (TTVideoLandingPageLink2Activity.this.mt != null) {
                        int iMax = (int) Math.max(0L, (j11 - j10) / 1000);
                        TTVideoLandingPageLink2Activity.this.mt.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.mt.setVisibility(8);
                        }
                    }
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:14:0x0021, B:15:0x003b, B:17:0x004d), top: B:25:0x0021 }] */
    public final void ryl() {
        FrameLayout frameLayout;
        if (isFinishing()) {
            return;
        }
        if (this.f12078kn.get()) {
            TTAdDislikeToast tTAdDislikeToast = this.pv;
            if (tTAdDislikeToast != null) {
                tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
                return;
            }
            return;
        }
        vm vmVar = this.f12077cj;
        if (vmVar == null) {
            if (vmVar == null) {
                try {
                    vm vmVar2 = new vm(this.fkw, this.f12071rn);
                    this.f12077cj = vmVar2;
                    vmVar2.setDislikeSource("landing_page");
                    this.f12077cj.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                        public final void ouw() {
                            TTVideoLandingPageLink2Activity.this.wp.set(true);
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                        public final void ouw(FilterWord filterWord) {
                            if (TTVideoLandingPageLink2Activity.this.f12078kn.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                return;
                            }
                            TTVideoLandingPageLink2Activity.this.f12078kn.set(true);
                            TTVideoLandingPageLink2Activity.zih(TTVideoLandingPageLink2Activity.this);
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                        public final void vt() {
                            TTVideoLandingPageLink2Activity.this.wp.set(false);
                        }
                    });
                    frameLayout = (FrameLayout) findViewById(R.id.content);
                    frameLayout.addView(this.f12077cj);
                    if (this.pv == null) {
                        TTAdDislikeToast tTAdDislikeToast2 = new TTAdDislikeToast(this.fkw);
                        this.pv = tTAdDislikeToast2;
                        frameLayout.addView(tTAdDislikeToast2);
                    }
                } catch (Throwable th2) {
                    ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th2);
                }
            } else {
                frameLayout = (FrameLayout) findViewById(R.id.content);
                frameLayout.addView(this.f12077cj);
                if (this.pv == null) {
                    TTAdDislikeToast tTAdDislikeToast3 = new TTAdDislikeToast(this.fkw);
                    this.pv = tTAdDislikeToast3;
                    frameLayout.addView(tTAdDislikeToast3);
                }
            }
        }
        vm vmVar3 = this.f12077cj;
        if (vmVar3 != null) {
            vmVar3.ouw();
        }
    }

    public static /* synthetic */ void zih(TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity) {
        TTAdDislikeToast tTAdDislikeToast;
        if (!tTVideoLandingPageLink2Activity.isFinishing() && (tTAdDislikeToast = tTVideoLandingPageLink2Activity.pv) != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mwh mwhVar = this.ucs;
        if (mwhVar != null) {
            mwhVar.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        mwh();
        if (!this.yhj && this.rrs != null && ((TTVideoLandingPageActivity) this).ouw != null && this.ucs.getVisibility() == 8) {
            this.rrs.ouw(((TTVideoLandingPageActivity) this).ouw);
        }
        super.onDestroy();
    }
}
