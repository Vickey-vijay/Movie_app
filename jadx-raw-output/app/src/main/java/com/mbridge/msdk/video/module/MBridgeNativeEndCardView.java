package com.mbridge.msdk.video.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBHeatLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class MBridgeNativeEndCardView extends MBridgeNativeEndCardViewDiff {
    private LinearLayout A;
    private Runnable B;
    private Runnable C;
    private RelativeLayout D;
    private com.mbridge.msdk.video.signal.factory.b E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private AlphaAnimation K;
    private int L;
    private int M;
    private int N;
    private int O;
    private Bitmap P;
    private View Q;
    private FeedBackButton R;
    private String S;
    private CampaignUnit T;
    private MBShakeView U;
    private com.mbridge.msdk.shake.b V;
    private MBridgeBaitClickView W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f38910a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f38911b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f38912c0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f38913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewGroup f38914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RelativeLayout f38915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f38916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f38917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f38918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f38919s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f38920t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f38921u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ImageView f38922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f38923w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f38924x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f38925y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private LinearLayout f38926z;

    public class a extends com.mbridge.msdk.widget.a {
        public a() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (MBridgeNativeEndCardView.this.ctaView != null) {
                if (!com.mbridge.msdk.util.b.a()) {
                    MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                } else if (MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                    MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBridgeNativeEndCardView.this.D != null) {
                CampaignEx campaignEx = MBridgeNativeEndCardView.this.f38831b;
                if (campaignEx != null && !campaignEx.isDynamicView() && MBridgeNativeEndCardView.this.f38831b.getAdSpaceT() != 2) {
                    MBridgeNativeEndCardView.this.D.setPadding(MBridgeNativeEndCardView.this.L, MBridgeNativeEndCardView.this.N, MBridgeNativeEndCardView.this.M, MBridgeNativeEndCardView.this.O);
                    MBridgeNativeEndCardView.this.D.startAnimation(MBridgeNativeEndCardView.this.K);
                }
                MBridgeNativeEndCardView.this.D.setVisibility(0);
            }
            if (MBridgeNativeEndCardView.this.Q != null && MBridgeNativeEndCardView.this.Q.getVisibility() != 0 && MBridgeNativeEndCardView.this.G) {
                MBridgeNativeEndCardView.this.Q.setVisibility(0);
            }
            MBridgeNativeEndCardView.this.f();
        }
    }

    public class c implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeNativeEndCardView.this.I = true;
        }

        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeNativeEndCardView.this.I = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeNativeEndCardView.this.I = false;
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(5);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    public class e extends com.mbridge.msdk.shake.b {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        @Override // com.mbridge.msdk.shake.b
        public void a() {
            if ((com.mbridge.msdk.util.b.a() && MBridgeNativeEndCardView.this.checkChinaShakeState()) || MBridgeNativeEndCardView.this.I || !MBridgeNativeEndCardView.this.H) {
                return;
            }
            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
            mBridgeNativeEndCardView.f38835f = 0.0f;
            mBridgeNativeEndCardView.f38836g = 0.0f;
            mBridgeNativeEndCardView.f38831b.setTriggerClickSource(5);
            MBridgeNativeEndCardView.this.c(4);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.f38831b.setClickType(1);
            MBridgeNativeEndCardView.this.c(2);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(2);
            MBridgeNativeEndCardView.this.f38831b.setClickType(1);
            MBridgeNativeEndCardView.this.c(2);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView.this.G = true;
            if (MBridgeNativeEndCardView.this.Q != null) {
                MBridgeNativeEndCardView.this.Q.setVisibility(0);
            }
        }
    }

    public class j implements com.mbridge.msdk.video.dynview.listener.h {
        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                MBridgeNativeEndCardView.this.addView(aVar.b());
                MBridgeNativeEndCardView.this.f38910a0 = aVar.c();
                if (MBridgeNativeEndCardView.this.ctaViewCanGet(aVar.b(), MBridgeNativeEndCardView.this.f38910a0)) {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView.f38834e = mBridgeNativeEndCardView.a(aVar.b());
                    MBridgeNativeEndCardView.this.l();
                } else {
                    MBridgeNativeEndCardView.this.f38910a0 = false;
                    MBridgeNativeEndCardView mBridgeNativeEndCardView2 = MBridgeNativeEndCardView.this;
                    mBridgeNativeEndCardView2.f38837h = false;
                    mBridgeNativeEndCardView2.j();
                }
                MBridgeNativeEndCardView mBridgeNativeEndCardView3 = MBridgeNativeEndCardView.this;
                CampaignEx campaignEx = mBridgeNativeEndCardView3.f38831b;
                if (campaignEx != null) {
                    campaignEx.setECTemplateRenderSucc(mBridgeNativeEndCardView3.f38910a0);
                }
            }
        }

        public j() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            q0.b(MBridgeBaseView.TAG, "errorMsg:" + aVar.g());
        }
    }

    public class k implements com.mbridge.msdk.foundation.same.image.c {
        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        public k() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                if (MBridgeNativeEndCardView.this.f38917q != null) {
                    MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                    if (mBridgeNativeEndCardView.f38837h) {
                        mBridgeNativeEndCardView.f38917q.setBackground(null);
                    }
                    MBridgeNativeEndCardView.this.f38917q.setImageBitmap(bitmap);
                }
                MBridgeNativeEndCardView.this.setBannerBackGroundBlurBimap(bitmap);
            } catch (Throwable unused) {
                if (MBridgeNativeEndCardView.this.f38916p != null) {
                    MBridgeNativeEndCardView.this.f38916p.setVisibility(4);
                }
            }
        }
    }

    public class l implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBridgeNativeEndCardView.this.I = true;
        }

        public l() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBridgeNativeEndCardView.this.I = false;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBridgeNativeEndCardView.this.I = false;
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f38939a;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
                if (mBridgeNativeEndCardView.f38837h) {
                    mBridgeNativeEndCardView.f38916p.setBackground(null);
                }
                q0.b("async", "执行异步加载图");
                MBridgeNativeEndCardView.this.f38916p.setImageBitmap(MBridgeNativeEndCardView.this.P);
            }
        }

        public m(Bitmap bitmap) {
            this.f38939a = bitmap;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeNativeEndCardView mBridgeNativeEndCardView = MBridgeNativeEndCardView.this;
            mBridgeNativeEndCardView.P = mBridgeNativeEndCardView.blurBitmap(this.f38939a);
            if (MBridgeNativeEndCardView.this.P == null || MBridgeNativeEndCardView.this.P.isRecycled() || MBridgeNativeEndCardView.this.f38916p == null) {
                return;
            }
            MBridgeNativeEndCardView.this.f38916p.post(new a());
        }
    }

    public class n implements View.OnClickListener {
        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeNativeEndCardView.this.F) {
                MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(2);
                MBridgeNativeEndCardView.this.c(1);
            }
        }
    }

    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeNativeEndCardView.this.f38837h) {
                try {
                    com.mbridge.msdk.video.dynview.moffer.a.a().b();
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
                try {
                    CampaignEx campaignEx = MBridgeNativeEndCardView.this.f38831b;
                    if (campaignEx != null) {
                        String strA = c1.a(campaignEx.getendcard_url(), "ecid");
                        String strA2 = c1.a(MBridgeNativeEndCardView.this.f38831b.getendcard_url(), "mof");
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("type", "choseFromTwoClose");
                        eVar.a("endcard_id", strA);
                        eVar.a("mof", strA2);
                        com.mbridge.msdk.video.module.report.a.a("2000103", MBridgeNativeEndCardView.this.f38831b, eVar);
                    }
                } catch (Exception e11) {
                    if (MBridgeConstans.DEBUG) {
                        e11.printStackTrace();
                    }
                }
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a("type", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", MBridgeNativeEndCardView.this.f38831b);
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
            MBridgeNativeEndCardView.this.notifyListener.a(104, "");
        }
    }

    public class p extends com.mbridge.msdk.widget.a {
        public p() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(1);
            MBridgeNativeEndCardView.this.c(0);
        }
    }

    public class q extends com.mbridge.msdk.widget.a {
        public q() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (MBridgeNativeEndCardView.this.ctaView != null) {
                if (!com.mbridge.msdk.util.b.a()) {
                    MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                } else if (MBridgeNativeEndCardView.this.checkProgressBarIntercepted()) {
                    MBridgeNativeEndCardView.this.f38831b.setTriggerClickSource(2);
                    MBridgeNativeEndCardView.this.c(0);
                }
            }
        }
    }

    public MBridgeNativeEndCardView(Context context) {
        super(context);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f38910a0 = false;
        this.f38911b0 = 1;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeNativeEndCardViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    @Override // com.mbridge.msdk.video.module.MBridgeNativeEndCardViewDiff, com.mbridge.msdk.video.module.MBridgeBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setOnPause() {
        this.H = false;
    }

    public void setOnResume() {
        this.H = true;
    }

    private void e() {
        MBridgeBaitClickView mBridgeBaitClickView;
        try {
            CampaignEx campaignEx = this.f38831b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                return;
            }
            String endScreenUrl = this.f38831b.getendcard_url();
            if (TextUtils.isEmpty(endScreenUrl)) {
                endScreenUrl = this.f38831b.getEndScreenUrl();
            }
            String strA = c1.a(endScreenUrl, "bait_click");
            int i10 = 1;
            try {
                i10 = Integer.parseInt(strA);
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage());
            }
            if (TextUtils.isEmpty(strA) || i10 == 0 || (mBridgeBaitClickView = this.W) == null) {
                return;
            }
            mBridgeBaitClickView.setVisibility(0);
            this.W.init(1342177280, i10);
            if (this.f38831b.getEcTemplateId() == 1302) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(1342177280);
                gradientDrawable.setStroke(0, SupportMenu.CATEGORY_MASK);
                gradientDrawable.setCornerRadius(25.0f);
                this.W.setBackground(gradientDrawable);
            }
            this.W.startAnimation();
            b1.a(this.W, this.f38831b.getLocalRequestId(), this.f38831b.getLocalAllowTrackClick());
            this.W.setOnClickListener(new f());
        } catch (Throwable th3) {
            q0.b(MBridgeBaseView.TAG, th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.S);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.S + "_2", this.f38831b);
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            FeedBackButton feedBackButton = this.R;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.S + "_2", new c());
        com.mbridge.msdk.foundation.feedback.b.b().d(this.S + "_1");
        if (this.R != null) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.S + "_2", this.R);
        }
    }

    private void g() {
        int i10;
        int i11;
        try {
            CampaignEx campaignEx = this.f38831b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                return;
            }
            String endScreenUrl = this.f38831b.getendcard_url();
            if (TextUtils.isEmpty(endScreenUrl)) {
                endScreenUrl = this.f38831b.getEndScreenUrl();
            }
            String strA = c1.a(endScreenUrl, "shake_show");
            String strA2 = c1.a(endScreenUrl, "shake_strength");
            String strA3 = c1.a(endScreenUrl, "shake_time");
            if (!TextUtils.isEmpty(strA) && strA.equals("1") && this.U == null) {
                MBridgeBaitClickView mBridgeBaitClickView = this.W;
                if (mBridgeBaitClickView != null) {
                    mBridgeBaitClickView.setVisibility(8);
                }
                MBShakeView mBShakeView = new MBShakeView(getContext());
                this.U = mBShakeView;
                mBShakeView.initView(this.f38831b.getAdCall(), true);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                if (isLandscape()) {
                    layoutParams.addRule(13);
                } else {
                    layoutParams.addRule(2, filterFindViewId(this.f38910a0, "mbridge_iv_logo"));
                    layoutParams.addRule(14);
                    this.U.setPadding(0, 0, 0, v0.a(getContext(), 20.0f));
                }
                this.U.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = this.f38915o;
                if (relativeLayout != null && relativeLayout.isShown()) {
                    this.f38915o.addView(this.U);
                    TextView textView = this.ctaView;
                    if (textView != null) {
                        textView.setVisibility(4);
                    }
                    b1.a(this.U, this.f38831b.getLocalRequestId(), this.f38831b.getLocalAllowTrackClick());
                    this.U.setOnClickListener(new d());
                    int i12 = 10;
                    if (!TextUtils.isEmpty(strA2) && (i11 = Integer.parseInt(strA2)) > 0) {
                        i12 = i11;
                    }
                    int i13 = 5000;
                    if (!TextUtils.isEmpty(strA3) && (i10 = Integer.parseInt(strA3)) > 0) {
                        i13 = i10 * 1000;
                    }
                    this.V = new e(i12, i13);
                    com.mbridge.msdk.shake.a.a().a(this.V);
                }
            }
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void h() {
        com.mbridge.msdk.foundation.same.image.b.a(this.f38830a.getApplicationContext()).a(this.f38831b.getImageUrl(), new k());
        com.mbridge.msdk.foundation.same.image.b.a(this.f38830a.getApplicationContext()).a(this.f38831b.getIconUrl(), new com.mbridge.msdk.video.module.listener.impl.j(this.f38918r, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
        this.f38923w.setText(this.f38831b.getAppName());
        TextView textView = this.ctaView;
        if (textView != null) {
            textView.setText(this.f38831b.getAdCall());
        }
        TextView textView2 = this.f38924x;
        if (textView2 != null) {
            textView2.setText(this.f38831b.getAppDesc());
        }
        TextView textView3 = this.f38925y;
        if (textView3 != null) {
            textView3.setText(this.f38831b.getNumberRating() + ")");
        }
        this.f38926z.removeAllViews();
        double rating = this.f38831b.getRating();
        if (rating <= 0.0d) {
            rating = 5.0d;
        }
        LinearLayout linearLayout = this.f38926z;
        if (linearLayout instanceof StarLevelView) {
            ((StarLevelView) linearLayout).initScore(rating);
        }
        LinearLayout linearLayout2 = this.f38926z;
        if (linearLayout2 instanceof MBridgeLevelLayoutView) {
            ((MBridgeLevelLayoutView) linearLayout2).setRatingAndUser(rating, this.f38831b.getNumberRating());
        }
        LinearLayout linearLayout3 = this.f38926z;
        if (linearLayout3 instanceof MBStarLevelLayoutView) {
            ((MBStarLevelLayoutView) linearLayout3).setRating((int) rating);
        }
        LinearLayout linearLayout4 = this.A;
        if (linearLayout4 != null && (linearLayout4 instanceof MBHeatLevelLayoutView)) {
            ((MBHeatLevelLayoutView) linearLayout4).setHeatCount(this.f38831b.getNumberRating());
        }
        if (!TextUtils.isEmpty(this.f38831b.getendcard_url()) && this.f38831b.getendcard_url().contains("alecfc=1")) {
            this.F = true;
        }
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.f38919s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            this.f38912c0 = "AD";
        } else {
            this.f38919s.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().i())));
            this.f38912c0 = "广告";
        }
        if (this.f38911b0 == 0) {
            ImageView imageView = this.f38919s;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            ImageView imageView2 = this.f38921u;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView4 = this.f38920t;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.f38920t.setText(this.f38912c0);
            }
        }
        v0.a(2, this.f38922v, this.f38831b, this.f38830a, true, new l());
        if (this.G) {
            return;
        }
        this.Q.setVisibility(8);
    }

    private void i() throws Throwable {
        com.mbridge.msdk.video.dynview.c cVarA = new com.mbridge.msdk.video.dynview.wrapper.c().a(getContext(), this.f38831b, this.f38838i, com.mbridge.msdk.util.b.a() ? "cn_" : "en_");
        this.f38911b0 = cVarA.o();
        com.mbridge.msdk.video.dynview.b.a().a(cVarA, new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int iK = k();
        if (i0.a(iK)) {
            this.f38834e = b(iK);
            l();
            CampaignEx campaignEx = this.f38831b;
            if (campaignEx != null) {
                campaignEx.setECTemplateRenderSucc(false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0031  */
    /* JADX WARN: Code duplicated, block: B:26:0x0033 A[PHI: r3
  0x0033: PHI (r3v4 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:21:0x002a, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    private int k() {
        int i10 = this.f38840k;
        String str = "mbridge_reward_endcard_native_half_landscape";
        String str2 = "mbridge_reward_endcard_native_half_portrait";
        if (i10 == 0) {
            str2 = this.f38839j ? "mbridge_reward_endcard_native_half_portrait" : "mbridge_reward_endcard_native_hor";
            if (!isLandscape()) {
                str = str2;
            } else if (!this.f38839j) {
                str = "mbridge_reward_endcard_native_land";
            }
        } else {
            if (i10 != 1) {
                str2 = "";
            } else if (!this.f38839j) {
                str2 = "mbridge_reward_endcard_native_hor";
            }
            if (i10 != 2) {
                str = str2;
            } else if (!this.f38839j) {
                str = "mbridge_reward_endcard_native_land";
            }
        }
        return findLayout(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        d();
        if (!this.f38834e) {
            this.notifyListener.a(104, "");
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.K = alphaAnimation;
        alphaAnimation.setDuration(200L);
    }

    private void m() {
        try {
            CampaignEx campaignEx = this.f38831b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                return;
            }
            String endScreenUrl = this.f38831b.getendcard_url();
            if (TextUtils.isEmpty(endScreenUrl)) {
                endScreenUrl = this.f38831b.getEndScreenUrl();
            }
            String strA = c1.a(endScreenUrl, "alac");
            if (TextUtils.isEmpty(strA) || !strA.equals("1") || this.f38831b.getAutoShowStoreMiniCard() == 1) {
                return;
            }
            postDelayed(new g(), 1000L);
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void n() {
        try {
            CampaignEx campaignEx = this.f38831b;
            if (campaignEx == null || campaignEx.getAutoShowStoreMiniCard() == 0 || TextUtils.isEmpty(this.f38831b.getDeepLinkURL())) {
                return;
            }
            long showStoreMiniCardDelayTime = this.f38831b.getShowStoreMiniCardDelayTime();
            if (showStoreMiniCardDelayTime == 0) {
                showStoreMiniCardDelayTime = 1;
            }
            if (this.C == null) {
                this.C = new h();
            }
            postDelayed(this.C, showStoreMiniCardDelayTime * 1000);
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    private void o() {
        RelativeLayout relativeLayout;
        if (!this.f38834e || (relativeLayout = this.D) == null) {
            return;
        }
        relativeLayout.postDelayed(new b(), 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBannerBackGroundBlurBimap(Bitmap bitmap) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new m(bitmap));
        } catch (Exception e10) {
            q0.a(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    public boolean canBackPress() {
        View view = this.Q;
        return view != null && view.getVisibility() == 0;
    }

    public void clearMoreOfferBitmap() {
        CampaignUnit campaignUnit;
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx == null || !campaignEx.isDynamicView() || (campaignUnit = this.T) == null || campaignUnit.getAds() == null || this.T.getAds().size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.T.getAds()) {
            if (!TextUtils.isEmpty(campaignEx2.getIconUrl())) {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx2.getIconUrl());
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        if (this.f38834e) {
            b1.a(this.f38915o, this.f38831b.getLocalRequestId(), this.f38831b.getLocalAllowTrackClick());
            this.f38915o.setOnClickListener(new n());
            this.Q.setOnClickListener(new o());
            TextView textView = this.ctaView;
            if (textView != null) {
                b1.a(textView, this.f38831b.getLocalRequestId(), this.f38831b.getLocalAllowTrackClick());
                this.ctaView.setOnClickListener(new p());
            }
            b1.a(this.f38918r, this.f38831b.getLocalRequestId(), this.f38831b.getLocalAllowTrackClick());
            this.f38918r.setOnClickListener(new q());
            b1.a(this.f38917q, this.f38831b.getLocalRequestId(), this.f38831b.getLocalAllowTrackClick());
            this.f38917q.setOnClickListener(new a());
        }
    }

    public boolean isDyXmlSuccess() {
        return this.f38910a0;
    }

    public void notifyShowListener() {
        this.notifyListener.a(110, "");
    }

    @Override // com.mbridge.msdk.video.module.MBridgeNativeEndCardViewDiff
    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.E = bVar;
        try {
            if (this.f38831b == null || !this.f38834e) {
                return;
            }
            h();
        } catch (Throwable th2) {
            q0.a(MBridgeBaseView.TAG, th2.getMessage());
        }
    }

    public void setCloseBtnDelay(int i10) {
        this.J = i10;
    }

    public void setLayout() {
        if (this.f38837h) {
            i();
        } else {
            j();
        }
    }

    public void setMoreOfferCampaignUnit(CampaignUnit campaignUnit) {
        MBShakeView mBShakeView;
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            return;
        }
        this.T = campaignUnit;
        if (campaignUnit == null || campaignUnit.getAds() == null || this.T.getAds().size() <= 5 || (mBShakeView = this.U) == null) {
            return;
        }
        mBShakeView.setPadding(0, 0, 0, v0.a(getContext(), 5.0f));
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        q0.b(MBridgeBaseView.TAG, "NOTCH NativeEndCard " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.L = i10;
        this.M = i11;
        this.N = i12;
        this.O = i13;
        o();
    }

    public void setUnitId(String str) {
        this.S = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        JSONObject jSONObject;
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            try {
                CampaignEx.c rewardTemplateMode = this.f38831b.getRewardTemplateMode();
                String str = "";
                if (rewardTemplateMode != null) {
                    str = rewardTemplateMode.k() + "";
                }
                com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.n().d(), "end_card_click", this.f38831b.getCampaignUnitId(), this.f38831b.isBidCampaign(), this.f38831b.getRequestId(), this.f38831b.getRequestIdNotice(), this.f38831b.getId(), str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f34900j, a(i10));
                if (this.f38831b.getDynamicTempCode() == 5) {
                    jSONObject.put("camp_position", 0);
                }
            } catch (JSONException e11) {
                e = e11;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
            }
        } catch (JSONException e12) {
            e = e12;
        }
        this.f38831b.setClickTempSource(2);
        this.notifyListener.a(105, jSONObject);
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript renderScriptCreate = RenderScript.create(this.f38830a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(25.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B == null) {
            this.B = new i();
        }
        Runnable runnable = this.B;
        if (runnable != null) {
            postDelayed(runnable, this.J * 1000);
            if (!this.H) {
                this.H = true;
            }
            m();
        }
        e();
        g();
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.B;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.C;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        if (this.V != null) {
            com.mbridge.msdk.shake.a.a().b(this.V);
            this.V = null;
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx != null && campaignEx.isDynamicView()) {
            return;
        }
        RelativeLayout relativeLayout = this.D;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        int i10 = configuration.orientation;
        this.f38833d = i10;
        if (i10 == 2) {
            removeView(this.f38913m);
            b(this.f38914n);
        } else {
            removeView(this.f38914n);
            b(this.f38913m);
        }
    }

    public void release() {
        try {
            removeAllViews();
            AlphaAnimation alphaAnimation = this.K;
            if (alphaAnimation != null) {
                alphaAnimation.cancel();
            }
            this.B = null;
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
    }

    private void b(View view) {
        if (view == null) {
            setLayout();
            preLoadData(this.E);
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            addView(view);
            a(view);
            d();
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        try {
            this.f38915o = (RelativeLayout) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_native_ec_layout"));
            this.f38917q = (ImageView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_iv_adbanner"));
            this.f38918r = (ImageView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_iv_icon"));
            this.f38919s = (ImageView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_iv_flag"));
            this.f38920t = (TextView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_tv_flag"));
            this.f38921u = (ImageView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_iv_logo"));
            this.f38922v = (ImageView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_iv_link"));
            this.f38923w = (TextView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_tv_apptitle"));
            this.f38926z = (LinearLayout) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_sv_starlevel"));
            this.A = (LinearLayout) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_sv_heat_count_level"));
            this.Q = view.findViewById(filterFindViewId(this.f38910a0, "mbridge_iv_close"));
            this.ctaView = (TextView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_tv_cta"));
            this.R = (FeedBackButton) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_native_endcard_feed_btn"));
            this.D = (RelativeLayout) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_native_ec_controller"));
            this.f38916p = (ImageView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_iv_adbanner_bg"));
            this.W = (MBridgeBaitClickView) findViewById(filterFindViewId(this.f38910a0, "mbridge_animation_click_view"));
            this.f38924x = (TextView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_tv_appdesc"));
            if (this.f38837h) {
                ImageView imageView = this.f38917q;
                if (imageView != null && (imageView instanceof RoundImageView)) {
                    ((RoundImageView) imageView).setBorderRadius(10);
                }
                ImageView imageView2 = this.f38918r;
                if (imageView2 != null && (imageView2 instanceof RoundImageView)) {
                    ((RoundImageView) imageView2).setBorderRadius(10);
                }
                return isNotNULL(this.f38917q, this.f38918r, this.f38923w, this.f38926z, this.Q, this.ctaView);
            }
            TextView textView = (TextView) view.findViewById(filterFindViewId(this.f38910a0, "mbridge_tv_number"));
            this.f38925y = textView;
            return isNotNULL(this.f38917q, this.f38918r, this.f38923w, this.f38924x, textView, this.f38926z, this.Q, this.ctaView);
        } catch (Throwable th2) {
            q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f38910a0 = false;
        this.f38911b0 = 1;
    }

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f38832c.inflate(i10, (ViewGroup) null);
            this.f38914n = viewGroup;
            addView(viewGroup);
            return a(this.f38914n);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f38832c.inflate(i10, (ViewGroup) null);
        this.f38913m = viewGroup2;
        addView(viewGroup2);
        return a(this.f38913m);
    }

    public MBridgeNativeEndCardView(Context context, AttributeSet attributeSet, boolean z10, int i10, boolean z11, int i11, int i12) {
        super(context, attributeSet, z10, i10, z11, i11, i12);
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = 0;
        this.f38910a0 = false;
        this.f38911b0 = 1;
    }
}
