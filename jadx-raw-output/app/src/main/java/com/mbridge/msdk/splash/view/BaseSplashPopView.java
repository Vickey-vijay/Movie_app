package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f37240v = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CampaignEx f37244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.mbridge.msdk.splash.middle.d f37245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f37246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f37247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f37248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f37249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f37250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f37251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f37252l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f37254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.mbridge.msdk.click.a f37256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f37257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Runnable f37258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f37259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View.OnClickListener f37260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnClickListener f37261u;

    public class a implements j {
        public a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int i10;
            int i11 = 0;
            if (BaseSplashPopView.this.f37243c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iA = (v0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                int iA2 = v0.a(BaseSplashPopView.this.getContext(), 23.0f) + iA;
                int iA3 = iA + v0.a(BaseSplashPopView.this.getContext(), 10.0f);
                i11 = iA2;
                i10 = iA3;
            } else {
                i10 = 0;
            }
            u0.a(campaign, BaseSplashPopView.this, i11, i10);
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f37263a;

        public b(boolean z10) {
            this.f37263a = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            Bitmap bitmapA;
            try {
                if (!bitmap.isRecycled()) {
                    if (this.f37263a) {
                        bitmapA = p0.b(bitmap);
                    } else {
                        bitmapA = p0.a(bitmap, 1, 16);
                    }
                    ImageView imageView = BaseSplashPopView.this.f37246f;
                    if (bitmapA != null) {
                        bitmap = bitmapA;
                    }
                    imageView.setImageBitmap(bitmap);
                }
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (!bitmap.isRecycled()) {
                    BaseSplashPopView.this.f37248h.setImageBitmap(a0.a(bitmap, 10));
                }
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    public class d implements com.mbridge.msdk.foundation.same.image.c {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (!bitmap.isRecycled()) {
                    BaseSplashPopView.this.f37247g.setImageBitmap(p0.a(bitmap, 1, 16));
                }
            } catch (Throwable th2) {
                q0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.f37252l != null) {
                if (BaseSplashPopView.this.f37253m != 0) {
                    BaseSplashPopView.g(BaseSplashPopView.this);
                    BaseSplashPopView.this.f37252l.setText(String.valueOf(BaseSplashPopView.this.f37253m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f37254n.postDelayed(baseSplashPopView.f37258r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f37253m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f37254n.removeCallbacks(baseSplashPopView2.f37258r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView3.f37245e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView3.f37241a, baseSplashPopView3.f37242b), 5);
                }
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.f37245e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f37241a, baseSplashPopView.f37242b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f37243c);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f37245e != null) {
                baseSplashPopView.b(baseSplashPopView.f37244d);
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.f37253m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).f37245e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f37241a, baseSplashPopView.f37242b), 4);
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f37271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f37272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f37273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CampaignEx f37274d;

        public CampaignEx a() {
            return this.f37274d;
        }

        public String b() {
            return this.f37271a;
        }

        public String c() {
            return this.f37272b;
        }

        public int d() {
            return this.f37273c;
        }

        public i(String str, String str2, int i10, CampaignEx campaignEx) {
            this.f37271a = str;
            this.f37272b = str2;
            this.f37273c = i10;
            this.f37274d = campaignEx;
        }
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.f37243c = 1;
        this.f37253m = -1;
        this.f37254n = new Handler();
        this.f37255o = false;
        this.f37257q = new a();
        this.f37258r = new e();
        this.f37259s = new f();
        this.f37260t = new g();
        this.f37261u = new h();
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f37242b = iVar.c();
        this.f37241a = iVar.b();
        this.f37243c = iVar.d();
        this.f37244d = iVar.a();
        this.f37245e = dVar;
        a();
    }

    public static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f37253m;
        baseSplashPopView.f37253m = i10 - 1;
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
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

    public void pauseCountDown() {
        this.f37255o = true;
        if (this.f37252l != null) {
            this.f37254n.removeCallbacks(this.f37258r);
        }
    }

    private void b() {
        String language;
        this.f37249i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 32.0f), v0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f37246f.getId());
        this.f37249i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            q0.b("MBSplashPopView", th2.getMessage());
            language = "ZH";
        }
        this.f37249i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f37249i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        this.f37246f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 60.0f), v0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v0.a(getContext(), 10.0f);
        this.f37246f.setId(generateViewId());
        this.f37246f.setLayoutParams(layoutParams2);
        this.f37246f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f37244d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f37244d.getIconUrl(), true);
        }
        this.f37252l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v0.a(getContext(), 70.0f);
        this.f37252l.setId(generateViewId());
        this.f37252l.setTextSize(10.0f);
        this.f37252l.setTextColor(-1);
        this.f37252l.setGravity(17);
        this.f37252l.setMinWidth(v0.a(getContext(), 16.0f));
        this.f37252l.setMaxHeight(v0.a(getContext(), 16.0f));
        this.f37252l.setLayoutParams(layoutParams3);
        this.f37252l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(imageView);
        addView(this.f37252l);
        addView(this.f37246f);
        CampaignEx campaignEx2 = this.f37244d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.f37244d;
        if (campaignEx3 != null) {
            b1.a(this, campaignEx3.getLocalRequestId(), this.f37244d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f37260t);
        this.f37252l.setOnClickListener(this.f37261u);
    }

    private void d() {
        this.f37248h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f37248h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f37248h.setId(generateViewId());
        this.f37248h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f37244d.getImageUrl());
        this.f37247g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f37247g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f37247g.setId(generateViewId());
        this.f37247g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f37244d.getImageUrl());
        this.f37246f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f37248h.getId());
        layoutParams3.topMargin = 20;
        this.f37246f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f37246f.setId(generateViewId());
        this.f37246f.setLayoutParams(layoutParams3);
        a(this.f37244d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f37246f.getId());
        layoutParams4.addRule(6, this.f37246f.getId());
        layoutParams4.addRule(8, this.f37246f.getId());
        layoutParams4.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f37250j = textView;
        textView.setId(generateViewId());
        this.f37250j.setGravity(16);
        this.f37250j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f37250j.setTextSize(12.0f);
        this.f37250j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f37250j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f37250j.setMarqueeRepeatLimit(-1);
        this.f37250j.setSelected(true);
        this.f37250j.setSingleLine(true);
        this.f37250j.setText(this.f37244d.getAppName());
        TextView textView2 = new TextView(getContext());
        this.f37251k = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f37250j.getId());
        layoutParams5.addRule(3, this.f37250j.getId());
        layoutParams5.topMargin = v0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v0.a(getContext(), 36.0f);
        this.f37251k.setGravity(16);
        this.f37251k.setLayoutParams(layoutParams5);
        this.f37251k.setTextSize(8.0f);
        this.f37251k.setTextColor(-10066330);
        this.f37251k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f37251k.setMarqueeRepeatLimit(-1);
        this.f37251k.setSelected(true);
        this.f37251k.setSingleLine(true);
        this.f37251k.setText(this.f37244d.getAppDesc());
        relativeLayout.addView(this.f37250j);
        relativeLayout.addView(this.f37251k);
        addView(this.f37248h);
        addView(this.f37247g);
        addView(this.f37246f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f37244d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f37244d.getBidToken(), eVar, this.f37244d, this.f37242b).t(), this.f37244d.getLocalAllowTrackClick());
        setOnClickListener(this.f37260t);
    }

    private void e() {
        int iA = v0.a(getContext(), 4.0f);
        this.f37246f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f37246f.setId(generateViewId());
        this.f37246f.setLayoutParams(layoutParams);
        this.f37246f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f37246f.setPadding(iA, iA, iA, iA);
        a(this.f37244d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f37246f.getId());
        layoutParams2.addRule(6, this.f37246f.getId());
        layoutParams2.addRule(8, this.f37246f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f37250j = textView;
        textView.setId(generateViewId());
        this.f37250j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f37250j.setGravity(16);
        this.f37250j.setTextSize(12.0f);
        this.f37250j.setSelected(true);
        this.f37250j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f37250j.setMarqueeRepeatLimit(-1);
        this.f37250j.setSingleLine(true);
        this.f37250j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f37250j.setText(this.f37244d.getAppName());
        TextView textView2 = new TextView(getContext());
        this.f37251k = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f37250j.getId());
        layoutParams3.addRule(3, this.f37250j.getId());
        layoutParams3.topMargin = v0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v0.a(getContext(), 36.0f);
        this.f37251k.setGravity(16);
        this.f37251k.setLayoutParams(layoutParams3);
        this.f37251k.setTextSize(8.0f);
        this.f37251k.setTextColor(-10066330);
        this.f37251k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f37251k.setMarqueeRepeatLimit(-1);
        this.f37251k.setSelected(true);
        this.f37251k.setSingleLine(true);
        this.f37251k.setText(this.f37244d.getAppDesc());
        relativeLayout.addView(this.f37250j);
        relativeLayout.addView(this.f37251k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f37246f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f37244d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f37244d.getBidToken(), eVar, this.f37244d, this.f37242b).t(), this.f37244d.getLocalAllowTrackClick());
        setOnClickListener(this.f37260t);
    }

    private void f() {
        int iA = v0.a(getContext(), 4.0f);
        this.f37246f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f37246f.setId(generateViewId());
        this.f37246f.setLayoutParams(layoutParams);
        this.f37246f.setPadding(iA, iA, iA, iA);
        this.f37246f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f37244d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f37250j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f37246f.getId());
        layoutParams2.addRule(6, this.f37246f.getId());
        layoutParams2.addRule(8, this.f37246f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 40.0f);
        this.f37250j.setLayoutParams(layoutParams2);
        this.f37250j.setGravity(16);
        this.f37250j.setTextSize(10.0f);
        this.f37250j.setSelected(true);
        this.f37250j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f37250j.setMarqueeRepeatLimit(-1);
        this.f37250j.setSingleLine(true);
        this.f37250j.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f37250j.setText(this.f37244d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f37246f);
        addView(this.f37250j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f37244d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f37244d.getBidToken(), eVar, this.f37244d, this.f37242b).t(), this.f37244d.getLocalAllowTrackClick());
        setOnClickListener(this.f37260t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f37252l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v0.a(getContext(), 16.0f);
            layoutParams.height = v0.a(getContext(), 16.0f);
            this.f37252l.setLayoutParams(layoutParams);
            this.f37252l.setText("");
            this.f37252l.setSelected(true);
            this.f37252l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f37240v;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    public void reStartCountDown() {
        if (this.f37255o) {
            this.f37255o = false;
            int i10 = this.f37253m;
            if (i10 == -1 || i10 == 0) {
                g();
                return;
            }
            TextView textView = this.f37252l;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                this.f37254n.postDelayed(this.f37258r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f37254n.removeCallbacks(this.f37259s);
            this.f37254n.removeCallbacks(this.f37258r);
            this.f37258r = null;
            detachAllViewsFromParent();
            this.f37244d = null;
            this.f37245e = null;
        } catch (Exception e10) {
            q0.b("MBSplashPopView", e10.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f37242b = iVar.c();
        this.f37241a = iVar.b();
        this.f37243c = iVar.d();
        this.f37244d = iVar.a();
        this.f37245e = dVar;
        a();
    }

    public void startCountDown() {
        this.f37254n.removeCallbacks(this.f37258r);
        CampaignEx campaignEx = this.f37244d;
        if (campaignEx == null || this.f37243c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.f37253m = flbSkipTime;
        TextView textView = this.f37252l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f37254n.postDelayed(this.f37258r, 1000L);
        }
    }

    private void a() {
        if (this.f37244d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f37243c;
        if (i10 == 1) {
            c();
            return;
        }
        if (i10 == 2) {
            f();
        } else if (i10 == 3) {
            e();
        } else {
            if (i10 != 4) {
                return;
            }
            d();
        }
    }

    private void setBackgroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new c());
    }

    private void setForegroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f37245e != null) {
            postDelayed(this.f37259s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    private void a(String str, boolean z10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new b(z10));
    }

    public void a(CampaignEx campaignEx) {
        if (this.f37256p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37242b);
            this.f37256p = aVar;
            aVar.a(this.f37257q);
        }
        campaignEx.setCampaignUnitId(this.f37242b);
        this.f37256p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f37245e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.f37241a, this.f37242b));
            this.f37245e.a(new MBridgeIds(this.f37241a, this.f37242b), 6);
        }
    }

    public void b(CampaignEx campaignEx) {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f37242b);
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f37243c = 1;
        this.f37253m = -1;
        this.f37254n = new Handler();
        this.f37255o = false;
        this.f37257q = new a();
        this.f37258r = new e();
        this.f37259s = new f();
        this.f37260t = new g();
        this.f37261u = new h();
        this.f37243c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37243c = 1;
        this.f37253m = -1;
        this.f37254n = new Handler();
        this.f37255o = false;
        this.f37257q = new a();
        this.f37258r = new e();
        this.f37259s = new f();
        this.f37260t = new g();
        this.f37261u = new h();
        this.f37243c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37243c = 1;
        this.f37253m = -1;
        this.f37254n = new Handler();
        this.f37255o = false;
        this.f37257q = new a();
        this.f37258r = new e();
        this.f37259s = new f();
        this.f37260t = new g();
        this.f37261u = new h();
        this.f37243c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    @RequiresApi(api = 21)
    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f37243c = 1;
        this.f37253m = -1;
        this.f37254n = new Handler();
        this.f37255o = false;
        this.f37257q = new a();
        this.f37258r = new e();
        this.f37259s = new f();
        this.f37260t = new g();
        this.f37261u = new h();
        this.f37243c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
