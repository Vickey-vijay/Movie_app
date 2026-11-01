package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.splash.view.nativeview.MBNoRecycledCrashImageView;
import com.mbridge.msdk.splash.view.nativeview.MBSplashClickView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes11.dex */
public class BaseMBSplashNativeView extends RelativeLayout {
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private boolean F;
    private boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public String K;
    private String L;
    public MBSplashView M;
    public CampaignEx N;
    public MBShakeView O;
    private String P;
    private String Q;
    private String R;
    public com.mbridge.msdk.shake.b S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBNoRecycledCrashImageView f37207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBNoRecycledCrashImageView f37208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f37209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView f37210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FeedBackButton f37211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f37212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private RelativeLayout f37213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MBNoRecycledCrashImageView f37214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f37215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNoRecycledCrashImageView f37216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f37217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f37218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f37219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f37220n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f37221o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f37222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f37223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MBSplashClickView f37224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f37225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f37227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f37228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f37229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f37230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f37231y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f37232z;

    public class a implements com.mbridge.msdk.foundation.same.image.c {
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        BaseMBSplashNativeView.this.G = true;
                        BaseMBSplashNativeView.this.f37213g.setVisibility(4);
                        BaseMBSplashNativeView.this.f37208b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f37208b.setImageBitmap(bitmap);
                    } else if (BaseMBSplashNativeView.this.A == 1) {
                        BaseMBSplashNativeView.this.f37213g.setVisibility(0);
                        try {
                            Bitmap bitmapA = p0.a(bitmap, 1, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 10.0f));
                            if (bitmapA != null && !bitmapA.isRecycled()) {
                                BaseMBSplashNativeView.this.f37216j.setScaleType(ImageView.ScaleType.FIT_XY);
                                BaseMBSplashNativeView.this.f37216j.setImageBitmap(bitmapA);
                            }
                        } catch (Throwable th2) {
                            try {
                                q0.b("MBSplashNativeView", th2.getMessage());
                                BaseMBSplashNativeView.this.f37216j.setImageBitmap(bitmap);
                            } catch (Throwable th3) {
                                q0.b("MBSplashNativeView", th3.getMessage());
                            }
                        }
                        BaseMBSplashNativeView.this.f37215i.setText(BaseMBSplashNativeView.this.N.getAppName());
                        BaseMBSplashNativeView.this.f();
                        try {
                            try {
                                Bitmap bitmapA2 = p0.a(bitmap);
                                if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                                    BaseMBSplashNativeView.this.f37208b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    BaseMBSplashNativeView.this.f37208b.setImageBitmap(bitmapA2);
                                }
                            } catch (Throwable th4) {
                                q0.b("MBSplashNativeView", th4.getMessage());
                            }
                        } catch (Throwable unused) {
                            BaseMBSplashNativeView.this.f37208b.setImageBitmap(bitmap);
                        }
                    } else {
                        BaseMBSplashNativeView.this.f37213g.setVisibility(4);
                        BaseMBSplashNativeView.this.f37208b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f37208b.setImageBitmap(bitmap);
                    }
                    try {
                        Bitmap bitmapA3 = p0.a(bitmap);
                        if (bitmapA3 == null || bitmapA3.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f37207a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        BaseMBSplashNativeView.this.f37207a.setImageBitmap(bitmapA3);
                    } catch (Throwable unused2) {
                        BaseMBSplashNativeView.this.f37208b.setImageBitmap(bitmap);
                    }
                } catch (Throwable th5) {
                    q0.b("MBSplashNativeView", th5.getMessage());
                }
            }
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaseMBSplashNativeView.this.f37214h.setVisibility(4);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            Bitmap bitmapA;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (BaseMBSplashNativeView.this.f37214h == null || (bitmapA = p0.a(bitmap, 1, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 40.0f))) == null || bitmapA.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f37214h.setImageBitmap(bitmapA);
                        return;
                    } catch (Throwable th2) {
                        q0.b("MBSplashNativeView", th2.getMessage());
                        BaseMBSplashNativeView.this.f37214h.setImageBitmap(bitmap);
                        return;
                    }
                    q0.b("MBSplashNativeView", th.getMessage());
                } catch (Throwable th3) {
                    q0.b("MBSplashNativeView", th3.getMessage());
                }
            }
        }
    }

    public class c implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(1);
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(0);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            if (baseMBSplashNativeView.H) {
                if (baseMBSplashNativeView.M.getSplashSignalCommunicationImpl() != null && BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a() != null) {
                    BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a().close();
                }
                BaseMBSplashNativeView.this.f37212f.setVisibility(4);
                BaseMBSplashNativeView.this.f37212f.setEnabled(false);
            }
        }
    }

    public class g implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        public g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.I = false;
        this.J = false;
    }

    public void b() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public void e() {
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private void c() {
        try {
            this.F = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
        a();
        g();
        h();
        e();
        i();
        j();
        b();
        updateCountDown(this.f37225s);
    }

    private void d() {
        try {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.A == 1 ? i0.a(getContext().getApplicationContext(), "mbridge_splash_portrait", "layout") : i0.a(getContext().getApplicationContext(), "mbridge_splash_landscape", "layout"), (ViewGroup) null);
            addView(viewInflate);
            this.f37207a = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image_bg", "id"));
            this.f37208b = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image", "id"));
            this.f37209c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_topcontroller", "id"));
            this.f37210d = (ImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_link", "id"));
            this.f37211e = (FeedBackButton) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_feedback", "id"));
            this.f37212f = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_skip", "id"));
            this.f37213g = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_landscape_foreground", "id"));
            this.f37214h = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_icon", "id"));
            this.f37215i = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_title", "id"));
            this.f37216j = (MBNoRecycledCrashImageView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_iv_foregroundimage", "id"));
            this.f37217k = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adrect", "id"));
            this.f37219m = (RelativeLayout) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_layout_appinfo", "id"));
            this.f37220n = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_appinfo", "id"));
            this.f37221o = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_privacy", "id"));
            this.f37222p = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_permission", "id"));
            this.f37223q = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_app_desc", "id"));
            this.f37224r = (MBSplashClickView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_click", "id"));
            this.f37218l = (TextView) viewInflate.findViewById(i0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adcircle", "id"));
            int iA = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip", TypedValues.Custom.S_STRING);
            int iA2 = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_not", TypedValues.Custom.S_STRING);
            int iA3 = i0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_s", TypedValues.Custom.S_STRING);
            this.Q = getContext().getResources().getString(iA);
            this.R = getContext().getResources().getString(iA2);
            this.P = getContext().getResources().getString(iA3);
            this.C = v0.a(getContext(), 9.0f);
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.N.getIconUrl())) {
            this.f37214h.setVisibility(4);
        } else {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.N.getIconUrl(), new b());
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.N.getImageUrl())) {
            this.f37208b.setVisibility(4);
        } else {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.N.getImageUrl(), new a());
        }
    }

    private void h() {
        Drawable drawable;
        v0.a(3, this.f37210d, this.N, getContext(), true, new c());
        try {
            drawable = getResources().getDrawable(i0.a(getContext().getApplicationContext(), "mbridge_splash_m_circle", "drawable"));
            try {
                drawable.setBounds(0, 0, v0.a(getContext(), 10.0f), v0.a(getContext(), 10.0f));
            } catch (Throwable th2) {
                th = th2;
                q0.b("MBSplashNativeView", th.getMessage());
            }
        } catch (Throwable th3) {
            th = th3;
            drawable = null;
        }
        if (this.A == 1 && this.G) {
            if (this.B != 0 && drawable != null) {
                this.f37218l.setCompoundDrawables(drawable, null, null, null);
            }
            this.f37218l.setText(this.F ? "广告" : "AD");
            this.f37217k.setVisibility(4);
            return;
        }
        if (this.B != 0 && drawable != null) {
            this.f37217k.setCompoundDrawables(drawable, null, null, null);
        }
        this.f37217k.setText(this.F ? "广告" : "AD");
        this.f37218l.setVisibility(4);
    }

    private void i() {
        if (this.f37228v == 1) {
            this.f37224r.setVisibility(8);
        } else if (this.f37230x == 1) {
            this.f37224r.setVisibility(8);
        } else {
            this.f37224r.initView(this.N.getAdCall());
        }
    }

    private void j() {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.N.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.N.getBidToken(), eVar, this.N, this.K);
        if (this.f37227u == 1) {
            b1.a(this, cVarA.t(), this.N.getLocalAllowTrackClick());
            setOnClickListener(new d());
        } else {
            b1.a(this.f37224r, cVarA.t(), this.N.getLocalAllowTrackClick());
            this.f37224r.setOnClickListener(new e());
        }
        this.f37212f.setOnClickListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownStatus(boolean z10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        this.M.getSplashSignalCommunicationImpl().a().a(z10 ? 2 : 1, this.f37226t);
    }

    public void release() {
        try {
            if (this.S != null) {
                com.mbridge.msdk.shake.a.a().b(this.S);
                this.S = null;
            }
            com.mbridge.msdk.foundation.feedback.b.b().d(this.K);
            detachAllViewsFromParent();
        } catch (Exception e10) {
            q0.b("MBSplashNativeView", e10.getMessage());
        }
    }

    public void setIsPause(boolean z10) {
        this.I = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        try {
            RelativeLayout relativeLayout = this.f37209c;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i14 = this.C;
            layoutParams.leftMargin = i10 + i14;
            layoutParams.rightMargin = i11 + i14;
            layoutParams.topMargin = i12 + i14;
            layoutParams.bottomMargin = i14 + i13;
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    public void updateCountDown(int i10) {
        String str;
        if (this.f37212f != null) {
            this.f37226t = i10;
            if (this.H) {
                str = this.Q + Z7.f27998r + i10 + this.P;
            } else {
                str = i10 + this.P + Z7.f27998r + this.R;
            }
            this.f37212f.setText(str);
        }
    }

    public void a(int i10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        try {
            this.M.getSplashSignalCommunicationImpl().a().a(com.mbridge.msdk.splash.common.util.a.a(com.mbridge.msdk.splash.common.util.a.a(i10, this.D, this.E), this.N));
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
            this.M.getSplashSignalCommunicationImpl().a().a(this.N);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f37230x == 1 && this.O != null && this.S != null) {
                com.mbridge.msdk.shake.a.a().a(this.S);
            }
        } catch (Throwable th2) {
            q0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.D = motionEvent.getRawX();
        this.E = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = false;
        this.J = false;
    }

    public BaseMBSplashNativeView(Context context, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar) {
        super(context);
        this.I = false;
        this.J = false;
        if (cVar != null) {
            this.K = cVar.l();
            this.L = cVar.h();
            this.N = cVar.b();
            this.M = mBSplashView;
            this.f37225s = cVar.d();
            this.f37228v = cVar.c();
            this.f37227u = cVar.f();
            this.f37229w = cVar.a();
            this.f37230x = cVar.i();
            this.f37231y = cVar.j();
            this.f37232z = cVar.k();
            this.A = cVar.g();
            this.H = cVar.m();
            this.B = cVar.e();
            d();
            c();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a() {
        CampaignEx campaignEx = this.N;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.K);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, new g());
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.f37211e);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
            return;
        }
        FeedBackButton feedBackButton = this.f37211e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }
}
