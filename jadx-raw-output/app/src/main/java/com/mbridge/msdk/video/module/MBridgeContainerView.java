package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.same.report.g;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView;
import com.mbridge.msdk.video.module.listener.impl.i;
import com.mbridge.msdk.video.module.listener.impl.k;
import com.mbridge.msdk.video.module.listener.impl.l;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.h;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeContainerView extends MBridgeBaseView implements f, h {
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private boolean I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private String P;
    private com.mbridge.msdk.video.signal.factory.b Q;
    private boolean R;
    private boolean S;
    private List<CampaignEx> T;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgePlayableView f38858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private MBridgeClickCTAView f38859n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MBridgeClickMiniCardView f38860o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private MBridgeNativeEndCardView f38861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MBridgeH5EndCardView f38862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private MBridgeVastEndCardView f38863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MBridgeLandingPageView f38864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MBridgeVideoEndCoverView f38865t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private MBridgeAlertWebview f38866u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeOrderCampView f38867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f38868w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f38869x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f38870y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38871z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.video.signal.factory.b f38872a;

        public a(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.f38872a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.f38872a, Integer.valueOf(mBridgeContainerView.f38831b.getVideo_end_type()));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.video.signal.factory.b f38874a;

        public b(com.mbridge.msdk.video.signal.factory.b bVar) {
            this.f38874a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
            mBridgeContainerView.a(this.f38874a, Integer.valueOf(mBridgeContainerView.f38831b.getVideo_end_type()));
        }
    }

    public class c implements com.mbridge.msdk.video.dynview.listener.b {
        public c() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.b
        public void a() {
            com.mbridge.msdk.video.module.listener.a aVar = MBridgeContainerView.this.notifyListener;
            if (aVar != null) {
                aVar.a(117, "");
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.b
        public void b() {
            if (MBridgeContainerView.this.f38831b.getAdSpaceT() == 2) {
                MBridgeContainerView.this.showVideoEndCover();
            } else {
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.showEndcard(mBridgeContainerView.f38831b.getVideo_end_type());
            }
        }
    }

    public class d extends i {
        public d(com.mbridge.msdk.video.module.listener.a aVar) {
            super(aVar);
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.i, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            int i11;
            super.a(i10, obj);
            if (i10 == 100) {
                MBridgeContainerView.this.webviewshow();
                MBridgeContainerView mBridgeContainerView = MBridgeContainerView.this;
                mBridgeContainerView.onConfigurationChanged(mBridgeContainerView.getResources().getConfiguration());
                n nVar = new n();
                nVar.n(MBridgeContainerView.this.f38831b.getRequestId());
                nVar.o(MBridgeContainerView.this.f38831b.getRequestIdNotice());
                nVar.b(MBridgeContainerView.this.f38831b.getId());
                if (MBridgeContainerView.this.f38831b.isMraid()) {
                    i11 = n.N;
                } else {
                    i11 = n.O;
                }
                nVar.b(i11);
                MBridgeContainerView mBridgeContainerView2 = MBridgeContainerView.this;
                g.d(nVar, mBridgeContainerView2.f38830a, mBridgeContainerView2.f38868w);
            }
        }
    }

    public MBridgeContainerView(Context context) {
        super(context);
        this.f38870y = 1;
        this.f38871z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void b(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
        if (this.f38865t == null) {
            MBridgeVideoEndCoverView mBridgeVideoEndCoverView = new MBridgeVideoEndCoverView(this.f38830a);
            this.f38865t = mBridgeVideoEndCoverView;
            mBridgeVideoEndCoverView.setCampaign(this.f38831b);
            this.f38865t.setNotifyListener(new i(this.notifyListener));
            this.f38865t.preLoadData(bVar);
        }
    }

    private void j() {
        this.f38870y = 1;
        if (this.f38861p == null) {
            a(this.Q, (Integer) 2);
        }
        addView(this.f38861p);
        onConfigurationChanged(getResources().getConfiguration());
        this.f38861p.notifyShowListener();
        this.S = true;
        bringToFront();
    }

    private void o() {
        this.C = false;
        this.S = false;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof MBridgeContainerView) {
                    i10++;
                } else {
                    viewGroup.bringChildToFront(childAt);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (view == null) {
            q0.b(MBridgeBaseView.TAG, "view is null");
        } else {
            a(view);
            super.addView(view);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        setVisibility(0);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void orientation(Configuration configuration) {
        a(this.f38858m, this.f38860o, this.f38862q, this.f38866u);
    }

    public void webviewshow() {
        try {
            e eVar = new e();
            eVar.a("type", 3);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", this.f38831b, eVar);
        } catch (Exception unused) {
        }
        b(this.f38858m, this.f38860o, this.f38862q, this.f38866u);
    }

    private void addCTAView() {
        if (this.f38859n == null) {
            b(-1);
        }
        if (this.f38859n != null) {
            CampaignEx campaignEx = this.f38831b;
            if (campaignEx == null || !campaignEx.isDynamicView()) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                addView(this.f38859n, 0, layoutParams);
            }
        }
    }

    private void e() {
        if (this.f38866u == null) {
            q();
        }
        MBridgeAlertWebview mBridgeAlertWebview = this.f38866u;
        if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
            removeView(this.f38866u);
        }
        addView(this.f38866u);
    }

    private void f() {
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx != null) {
            boolean zIsDynamicView = campaignEx.isDynamicView();
            boolean zL = v0.l(this.f38831b.getendcard_url());
            if (zIsDynamicView && !zL && !this.f38831b.isMraid()) {
                j();
                return;
            }
        }
        if (this.f38870y != 2 || this.I) {
            j();
        } else {
            g();
        }
    }

    private void g() {
        if (this.f38862q == null) {
            a(this.Q, (Integer) 2);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView == null || !mBridgeH5EndCardView.isLoadSuccess()) {
            j();
            MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f38862q;
            if (mBridgeH5EndCardView2 != null) {
                mBridgeH5EndCardView2.reportRenderResult("timeout", 3);
                this.f38862q.setError(true);
            }
        } else {
            this.I = true;
            addView(this.f38862q);
            webviewshow();
            onConfigurationChanged(getResources().getConfiguration());
            this.f38862q.excuteTask();
            this.f38862q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
            n nVar = new n();
            nVar.n(this.f38831b.getRequestId());
            nVar.o(this.f38831b.getRequestIdNotice());
            nVar.b(this.f38831b.getId());
            nVar.b(this.f38831b.isMraid() ? n.N : n.O);
            g.d(nVar, this.f38830a, this.f38868w);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView3 = this.f38862q;
        if (mBridgeH5EndCardView3 != null) {
            mBridgeH5EndCardView3.setUnitId(this.f38868w);
        }
    }

    private void h() {
        if (this.f38864s == null) {
            a(this.Q, (Integer) 4);
        }
        this.f38864s.setUnitId(this.f38868w);
        this.f38864s.preLoadData(this.Q);
        addView(this.f38864s);
    }

    private void i() {
        if (this.f38860o == null) {
            b(-2);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.D && this.E) {
            this.E = false;
            layoutParams.width = 1;
            layoutParams.height = 1;
        }
        addView(this.f38860o, layoutParams);
    }

    private void k() {
        if (this.f38858m == null) {
            preLoadData(this.Q);
        }
        addView(this.f38858m);
        MBridgePlayableView mBridgePlayableView = this.f38858m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.setUnitId(this.f38868w);
            CampaignEx campaignEx = this.f38831b;
            if (campaignEx != null && campaignEx.isMraid() && this.f38831b.getPlayable_ads_without_video() == 2) {
                this.f38858m.setCloseVisible(0);
            }
            this.f38858m.setNotchValue(this.P, this.K, this.L, this.M, this.N);
        }
    }

    private void l() {
        if (this.f38863r == null) {
            a(this.Q, (Integer) 3);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f38863r, layoutParams);
        this.f38863r.notifyShowListener();
    }

    private void m() {
        if (this.f38865t == null) {
            b(this.Q);
        }
        addView(this.f38865t);
        onConfigurationChanged(getResources().getConfiguration());
        this.S = true;
        bringToFront();
    }

    private void p() {
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getendcard_url();
        int i10 = 404;
        if (!TextUtils.isEmpty(str)) {
            try {
                i10 = Integer.parseInt(c1.a(str, "ecid"));
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage());
            }
        }
        this.f38861p = new MBridgeNativeEndCardView(this.f38830a, null, true, i10, this.f38831b.getAdSpaceT() == 2, this.f38840k, this.f38831b.getMof_tplid());
        if (this.f38831b.getDynamicTempCode() != 5) {
            this.f38861p.setCampaign(this.f38831b);
            return;
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.f38831b);
        }
        this.f38861p.setCampaign(this.f38831b);
    }

    private void q() {
        if (this.f38866u == null) {
            MBridgeAlertWebview mBridgeAlertWebview = new MBridgeAlertWebview(this.f38830a);
            this.f38866u = mBridgeAlertWebview;
            mBridgeAlertWebview.setUnitId(this.f38868w);
            this.f38866u.setCampaign(this.f38831b);
        }
        this.f38866u.preLoadData(this.Q);
    }

    public void addOrderViewData(List<CampaignEx> list) {
        if (list == null) {
            return;
        }
        this.T = list;
    }

    public boolean canBackPress() {
        if (this.f38861p != null) {
            return false;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView != null) {
            return mBridgeH5EndCardView.canBackPress();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f38864s;
        if (mBridgeLandingPageView != null) {
            return mBridgeLandingPageView.canBackPress();
        }
        MBridgePlayableView mBridgePlayableView = this.f38858m;
        if (mBridgePlayableView != null) {
            return mBridgePlayableView.canBackPress();
        }
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void configurationChanged(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f38860o;
        if (mBridgeClickMiniCardView == null || mBridgeClickMiniCardView.getVisibility() != 0) {
            return;
        }
        this.f38860o.resizeMiniCard(i10, i11);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean endCardShowing() {
        return this.B;
    }

    public boolean endcardIsPlayable() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        return mBridgeH5EndCardView != null && mBridgeH5EndCardView.isPlayable();
    }

    public MBridgeH5EndCardView getH5EndCardView() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        return mBridgeH5EndCardView == null ? this.f38858m : mBridgeH5EndCardView;
    }

    public CampaignEx getReSetCampaign() {
        if (!this.f38831b.isDynamicView() || !TextUtils.isEmpty(this.f38831b.getendcard_url())) {
            return null;
        }
        int size = this.T.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.T.get(i11) != null && this.T.get(i11).getId() == this.f38831b.getId()) {
                i10 = i11 - 1;
                break;
            }
        }
        if (i10 < 0 || i10 >= size || this.T.get(i10) == null) {
            return null;
        }
        return this.T.get(i10);
    }

    public boolean getShowingTransparent() {
        return this.D;
    }

    public String getUnitID() {
        return this.f38868w;
    }

    public int getVideoInteractiveType() {
        return this.f38869x;
    }

    public int getVideoSkipTime() {
        return this.H;
    }

    public void handlerPlayableException(String str) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView == null) {
            f();
            return;
        }
        mBridgeH5EndCardView.handlerPlayableException(str);
        if (this.I) {
            f();
        }
    }

    public void install(CampaignEx campaignEx) {
        this.notifyListener.a(105, campaignEx);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void ivRewardAdsWithoutVideo(String str) {
        this.notifyListener.a(103, str);
    }

    public boolean miniCardLoaded() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f38860o;
        return mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.isLoadSuccess();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean miniCardShowing() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f38858m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.notifyCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.notifyCloseBtn(i10);
        }
    }

    public void onEndcardBackPress() {
        if (this.f38861p != null || this.f38863r != null) {
            this.notifyListener.a(104, "");
            try {
                com.mbridge.msdk.video.dynview.moffer.a.a().b();
                return;
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
                return;
            }
        }
        if (this.f38864s != null) {
            this.notifyListener.a(103, "");
            return;
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.onBackPress();
        }
    }

    public void onMiniEndcardBackPress() {
        if (this.C) {
            this.notifyListener.a(107, "");
        }
    }

    public void onPlayableBackPress() {
        MBridgePlayableView mBridgePlayableView = this.f38858m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.onBackPress();
        }
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx != null) {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                a(bVar);
            } else {
                b(this.f38869x);
                if (this.f38831b.isDynamicView()) {
                    try {
                        a(bVar, Integer.valueOf(this.f38831b.getVideo_end_type()));
                    } catch (Throwable th2) {
                        q0.b(MBridgeBaseView.TAG, th2.getMessage());
                        new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new a(bVar));
                    }
                    if (!v0.l(this.f38831b.getendcard_url())) {
                        try {
                            String strA = c1.a(this.f38831b.getendcard_url(), "mof");
                            if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f38831b, 2);
                            }
                        } catch (Exception e10) {
                            q0.b(MBridgeBaseView.TAG, e10.getMessage());
                        }
                    }
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new b(bVar), getVideoSkipTime());
                }
            }
            q();
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void readyStatus(int i10) {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.readyStatus(i10);
        }
    }

    public void release() {
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.release();
            this.f38862q = null;
        }
        MBridgePlayableView mBridgePlayableView = this.f38858m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.release();
        }
        MBridgeLandingPageView mBridgeLandingPageView = this.f38864s;
        if (mBridgeLandingPageView != null) {
            mBridgeLandingPageView.release();
        }
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f38861p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.clearMoreOfferBitmap();
            this.f38861p.release();
        }
        if (this.notifyListener != null) {
            this.notifyListener = null;
        }
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void resizeMiniCard(int i10, int i11, int i12) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f38860o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.resizeMiniCard(i10, i11);
            this.f38860o.setRadius(i12);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            i();
        }
    }

    public void setCloseDelayTime(int i10) {
        this.f38871z = i10;
    }

    public void setEndscreenType(int i10) {
        this.f38870y = i10;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.Q = bVar;
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f38860o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMBridgeClickMiniCardViewTransparent();
            this.f38860o.setMBridgeClickMiniCardViewClickable(false);
        }
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        q0.b(MBridgeBaseView.TAG, "NOTCH ContainerView " + String.format("%1s-%2s-%3s-%4s-%5s", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i10)));
        this.O = i10;
        this.K = i11;
        this.L = i12;
        this.M = i13;
        this.N = i14;
        this.P = d0.a(i10, i11, i12, i13, i14);
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f38861p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.f38881p != null) {
            mBridgeH5EndCardView.setNotchValue(this.P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f38862q.f38881p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgePlayableView mBridgePlayableView = this.f38858m;
        if (mBridgePlayableView != null && mBridgePlayableView.f38881p != null) {
            mBridgePlayableView.setNotchValue(this.P, i11, i12, i13, i14);
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f38858m.f38881p, "oncutoutfetched", Base64.encodeToString(this.P.getBytes(), 0));
        }
        MBridgeOrderCampView mBridgeOrderCampView = this.f38867v;
        if (mBridgeOrderCampView != null) {
            mBridgeOrderCampView.setNotchPadding(i11, i12, i13, i14);
        }
    }

    public void setOnPause() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f38861p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnPause();
        }
    }

    public void setOnResume() {
        MBridgeNativeEndCardView mBridgeNativeEndCardView = this.f38861p;
        if (mBridgeNativeEndCardView != null) {
            mBridgeNativeEndCardView.setOnResume();
        }
    }

    public void setPlayCloseBtnTm(int i10) {
        this.A = i10;
    }

    public void setRewardStatus(boolean z10) {
        this.J = z10;
    }

    public void setShowingTransparent(boolean z10) {
        this.D = z10;
    }

    public void setUnitID(String str) {
        this.f38868w = str;
    }

    public void setVideoInteractiveType(int i10) {
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx == null || !campaignEx.isDynamicView()) {
            this.f38869x = i10;
            return;
        }
        int iB = com.mbridge.msdk.video.dynview.util.a.b(this.f38831b);
        if (iB == 100) {
            this.f38869x = i10;
        } else {
            this.f38869x = iB;
        }
    }

    public void setVideoSkipTime(int i10) {
        this.H = i10;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public boolean showAlertWebView() {
        MBridgeAlertWebview mBridgeAlertWebview = this.f38866u;
        if (mBridgeAlertWebview == null || !mBridgeAlertWebview.isLoadSuccess()) {
            return false;
        }
        setMatchParent();
        if (!n() && !this.S) {
            removeAllViews();
            bringToFront();
            this.R = true;
        }
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f38860o;
        if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
            return false;
        }
        e();
        setBackgroundColor(0);
        this.f38866u.webviewshow();
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showEndcard(int i10) {
        CampaignEx campaignEx = this.f38831b;
        if (campaignEx != null) {
            if (i10 == 1) {
                this.notifyListener.a(104, "");
            } else if (i10 == 100) {
                if (campaignEx.getPlayable_ads_without_video() == 2) {
                    this.G = true;
                }
                a(this.f38858m);
                setMatchParent();
                j();
            } else if (i10 == 3) {
                removeAllViews();
                setMatchParent();
                l();
                this.S = true;
                bringToFront();
            } else if (i10 == 4) {
                this.notifyListener.a(113, "");
                removeAllViews();
                setMatchParent();
                h();
                this.S = true;
                bringToFront();
            } else if (i10 != 5) {
                removeAllViews();
                setMatchParent();
                this.S = true;
                bringToFront();
                f();
                this.notifyListener.a(117, "");
            } else {
                this.notifyListener.a(106, "");
            }
        }
        this.B = true;
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f38860o;
        if (mBridgeClickMiniCardView != null) {
            mBridgeClickMiniCardView.setMiniCardLocation(i10, i11, i12, i13);
            this.f38860o.setRadius(i14);
            this.f38860o.setCloseVisible(8);
            this.f38860o.setClickable(false);
            removeAllViews();
            setMatchParent();
            this.S = true;
            bringToFront();
            i();
            if (this.F) {
                return;
            }
            this.F = true;
            this.notifyListener.a(109, "");
            this.notifyListener.a(117, "");
        }
    }

    public void showOrderCampView() {
        MBridgeOrderCampView mBridgeOrderCampView = new MBridgeOrderCampView(this.f38830a);
        this.f38867v = mBridgeOrderCampView;
        mBridgeOrderCampView.setCampaignExes(this.T);
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null && (aVar instanceof k)) {
            ((k) aVar).a(this.T);
        }
        this.f38867v.setNotifyListener(new i(this.notifyListener));
        this.f38867v.setRewarded(this.J);
        this.f38867v.setNotchPadding(this.K, this.L, this.M, this.N);
        this.f38867v.setCampOrderViewBuildCallback(new c());
        this.f38867v.createView(this);
    }

    public void showPlayableView() {
        if (this.f38831b == null || this.G) {
            return;
        }
        removeAllViews();
        setMatchParent();
        k();
        this.S = true;
        bringToFront();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoClickView(int i10) {
        if (this.f38831b != null) {
            if (i10 == -1) {
                if (isLast() || endCardShowing()) {
                    return;
                }
                o();
                return;
            }
            if (i10 == 1) {
                if (this.B) {
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
                if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getParent() != null) {
                    removeView(this.f38862q);
                }
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f38860o;
                if (mBridgeClickMiniCardView != null && mBridgeClickMiniCardView.getParent() != null) {
                    removeView(this.f38860o);
                }
                MBridgeClickCTAView mBridgeClickCTAView = this.f38859n;
                if (mBridgeClickCTAView == null || mBridgeClickCTAView.getParent() == null) {
                    try {
                        CampaignEx campaignEx = this.f38831b;
                        if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 1) {
                            this.S = true;
                            addCTAView();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                if (isLast()) {
                    bringToFront();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                return;
            }
            MBridgeClickCTAView mBridgeClickCTAView2 = this.f38859n;
            if (mBridgeClickCTAView2 != null && mBridgeClickCTAView2.getParent() != null) {
                removeView(this.f38859n);
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f38866u;
            if (mBridgeAlertWebview == null || mBridgeAlertWebview.getParent() == null) {
                MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f38860o;
                if (mBridgeClickMiniCardView2 == null || mBridgeClickMiniCardView2.getParent() == null) {
                    try {
                        CampaignEx campaignEx2 = this.f38831b;
                        if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 1) {
                            setMatchParent();
                            i();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (!miniCardLoaded()) {
                    o();
                    return;
                }
                MBridgeH5EndCardView mBridgeH5EndCardView2 = this.f38862q;
                if (mBridgeH5EndCardView2 != null && mBridgeH5EndCardView2.getParent() != null) {
                    removeView(this.f38862q);
                }
                this.notifyListener.a(112, "");
                CampaignEx campaignEx3 = this.f38831b;
                if (campaignEx3 != null && !campaignEx3.isHasReportAdTrackPause()) {
                    this.f38831b.setHasReportAdTrackPause(true);
                    com.mbridge.msdk.video.module.report.b.c(this.f38830a, this.f38831b);
                }
                if (this.D) {
                    this.notifyListener.a(115, "");
                } else {
                    this.S = true;
                    bringToFront();
                    webviewshow();
                    onConfigurationChanged(getResources().getConfiguration());
                }
                this.C = true;
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i10) {
        MBridgePlayableView mBridgePlayableView = this.f38858m;
        if (mBridgePlayableView != null) {
            mBridgePlayableView.toggleCloseBtn(i10);
        }
        MBridgeH5EndCardView mBridgeH5EndCardView = this.f38862q;
        if (mBridgeH5EndCardView != null) {
            mBridgeH5EndCardView.toggleCloseBtn(i10);
        }
    }

    public void triggerCloseBtn(String str) {
        try {
            e eVar = new e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f38831b);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                th2.printStackTrace();
            }
        }
        if (this.f38831b != null) {
            this.notifyListener.a(122, "");
            this.notifyListener.a(104, "");
        }
    }

    private void a(View view) {
        if (view != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            } catch (Throwable th2) {
                q0.b(MBridgeBaseView.TAG, th2.getMessage(), th2);
            }
        }
    }

    private boolean n() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup.indexOfChild(this) == viewGroup.getChildCount() - 1) {
            return true;
        }
        return false;
    }

    private void r() {
        setWrapContent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(12, -1);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void defaultShow() {
        super.defaultShow();
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void hideAlertWebview() {
        if (!isLast()) {
            if (this.R && !this.S) {
                o();
                this.R = false;
            }
            MBridgeAlertWebview mBridgeAlertWebview = this.f38866u;
            if (mBridgeAlertWebview != null && mBridgeAlertWebview.getParent() != null) {
                removeView(this.f38866u);
                MBridgeClickCTAView mBridgeClickCTAView = this.f38859n;
                if (mBridgeClickCTAView != null && mBridgeClickCTAView.getParent() != null) {
                    r();
                }
            }
        }
    }

    public boolean isLast() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null || viewGroup.indexOfChild(this) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration, this.f38858m, this.f38859n, this.f38860o, this.f38861p, this.f38862q, this.f38863r, this.f38864s, this.f38865t);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void setNotifyListener(com.mbridge.msdk.video.module.listener.a aVar) {
        super.setNotifyListener(aVar);
        a(aVar, this.f38858m, this.f38859n, this.f38860o, this.f38861p, this.f38862q, this.f38863r, this.f38864s, this.f38865t);
    }

    @Override // com.mbridge.msdk.video.signal.f
    public void showVideoEndCover() {
        removeAllViews();
        setMatchParent();
        m();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            a(view);
            super.addView(view, layoutParams);
        } else {
            q0.b(MBridgeBaseView.TAG, "view is null");
        }
    }

    private void a(com.mbridge.msdk.video.signal.factory.b bVar) {
        if (this.f38858m == null) {
            this.f38858m = new MBridgePlayableView(this.f38830a);
        }
        this.f38858m.setCloseDelayShowTime(this.f38871z);
        this.f38858m.setPlayCloseBtnTm(this.A);
        this.f38858m.setCampaign(this.f38831b);
        this.f38858m.setNotifyListener(new d(this.notifyListener));
        this.f38858m.preLoadData(bVar);
    }

    private void b(int i10) {
        if (i10 != -3) {
            if (i10 != -2) {
                if (this.f38859n == null) {
                    this.f38859n = new MBridgeClickCTAView(this.f38830a);
                }
                this.f38859n.setCampaign(this.f38831b);
                this.f38859n.setUnitId(this.f38868w);
                this.f38859n.setNotifyListener(new i(this.notifyListener));
                this.f38859n.preLoadData(this.Q);
                return;
            }
            CampaignEx campaignEx = this.f38831b;
            if (campaignEx == null || campaignEx.getVideo_end_type() != 2) {
                return;
            }
            if (this.f38860o == null) {
                this.f38860o = new MBridgeClickMiniCardView(this.f38830a);
            }
            this.f38860o.setCampaign(this.f38831b);
            MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f38860o;
            mBridgeClickMiniCardView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(mBridgeClickMiniCardView, this.notifyListener));
            this.f38860o.preLoadData(this.Q);
            setMatchParent();
            i();
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.video.signal.factory.b bVar, Integer num) {
        CampaignEx campaignEx;
        com.mbridge.msdk.video.module.listener.a aVar;
        CampaignEx campaignEx2;
        this.Q = bVar;
        CampaignEx campaignEx3 = this.f38831b;
        if (campaignEx3 != null) {
            if (num == null) {
                num = Integer.valueOf(campaignEx3.getVideo_end_type());
            }
            if (!isLast()) {
                o();
            }
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    if (this.f38863r == null) {
                        this.f38863r = new MBridgeVastEndCardView(this.f38830a);
                    }
                    this.f38863r.setCampaign(this.f38831b);
                    this.f38863r.setNotifyListener(new l(this.notifyListener));
                    this.f38863r.preLoadData(bVar);
                    return;
                }
                if (iIntValue == 4) {
                    if (this.f38864s == null) {
                        this.f38864s = new MBridgeLandingPageView(this.f38830a);
                    }
                    this.f38864s.setCampaign(this.f38831b);
                    this.f38864s.setNotifyListener(new i(this.notifyListener));
                    return;
                }
                if (iIntValue != 5) {
                    if (this.f38870y == 2) {
                        boolean zIsDynamicView = this.f38831b.isDynamicView();
                        boolean zL = v0.l(this.f38831b.getendcard_url());
                        if ((zIsDynamicView && !zL && (campaignEx2 = this.f38831b) != null && !campaignEx2.isMraid()) || (campaignEx = this.f38831b) == null || campaignEx.getAdSpaceT() == 2) {
                            return;
                        }
                        if (this.f38862q == null) {
                            this.f38862q = new MBridgeH5EndCardView(this.f38830a);
                            try {
                                e eVar = new e();
                                eVar.a("type", 3);
                                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", this.f38831b, eVar);
                            } catch (Throwable th2) {
                                q0.b(MBridgeBaseView.TAG, th2.getMessage());
                            }
                        }
                        if (this.f38831b.getDynamicTempCode() == 5 && (aVar = this.notifyListener) != null && (aVar instanceof k)) {
                            ((k) aVar).a(this.f38831b);
                        }
                        this.f38862q.setCampaign(this.f38831b);
                        this.f38862q.setCloseDelayShowTime(this.f38871z);
                        this.f38862q.setNotifyListener(new i(this.notifyListener));
                        this.f38862q.setUnitId(this.f38868w);
                        this.f38862q.setNotchValue(this.P, this.K, this.L, this.M, this.N);
                        this.f38862q.preLoadData(bVar);
                        if (this.D) {
                            return;
                        }
                        addView(this.f38862q);
                        return;
                    }
                    CampaignEx campaignEx4 = this.f38831b;
                    int iG = (campaignEx4 == null || campaignEx4.getRewardTemplateMode() == null) ? 0 : this.f38831b.getRewardTemplateMode().g();
                    if (this.f38861p == null) {
                        CampaignEx campaignEx5 = this.f38831b;
                        if (campaignEx5 != null && campaignEx5.isDynamicView()) {
                            p();
                        } else {
                            Context context = this.f38830a;
                            CampaignEx campaignEx6 = this.f38831b;
                            boolean z10 = campaignEx6 != null && campaignEx6.getAdSpaceT() == 2;
                            CampaignEx campaignEx7 = this.f38831b;
                            MBridgeNativeEndCardView mBridgeNativeEndCardView = new MBridgeNativeEndCardView(context, null, false, -1, z10, iG, campaignEx7 != null ? campaignEx7.getMof_tplid() : 0);
                            this.f38861p = mBridgeNativeEndCardView;
                            mBridgeNativeEndCardView.setCampaign(this.f38831b);
                        }
                    }
                    this.f38861p.setLayout();
                    if (this.f38831b.isDynamicView()) {
                        if (com.mbridge.msdk.video.dynview.moffer.a.a().b(this.f38831b.getRequestId() + "_" + this.f38831b.getId())) {
                            try {
                                com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f38861p, this.f38831b.getRequestId() + "_" + this.f38831b.getId(), new i(this.notifyListener));
                            } catch (Exception e10) {
                                q0.b(MBridgeBaseView.TAG, e10.getMessage());
                            }
                        } else {
                            try {
                                String strA = c1.a(this.f38831b.getendcard_url(), "mof");
                                if (!TextUtils.isEmpty(strA) && Integer.parseInt(strA) == 1) {
                                    com.mbridge.msdk.video.dynview.moffer.a.a().a(this.f38831b, this.f38861p, new i(this.notifyListener), 2);
                                }
                            } catch (Exception e11) {
                                q0.b(MBridgeBaseView.TAG, e11.getMessage());
                            }
                        }
                    }
                    this.f38861p.setUnitId(this.f38868w);
                    this.f38861p.setCloseBtnDelay(this.f38871z);
                    this.f38861p.setNotifyListener(new i(this.notifyListener));
                    this.f38861p.preLoadData(bVar);
                    this.f38861p.setNotchPadding(this.K, this.L, this.M, this.N);
                }
            }
        }
    }

    public MBridgeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38870y = 1;
        this.f38871z = 1;
        this.A = 1;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.I = false;
        this.J = false;
        this.R = false;
        this.S = false;
        this.T = new ArrayList();
    }

    private void b(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0 && mBridgeH5EndCardView.getParent() != null && !isLast()) {
                mBridgeH5EndCardView.webviewshow();
            }
        }
    }

    private void a(com.mbridge.msdk.video.module.listener.a aVar, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null) {
                if (mBridgeBaseView instanceof MBridgeClickMiniCardView) {
                    mBridgeBaseView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.g(this.f38860o, aVar));
                } else {
                    mBridgeBaseView.setNotifyListener(new i(aVar));
                }
            }
        }
    }

    private void a(Configuration configuration, MBridgeBaseView... mBridgeBaseViewArr) {
        for (MBridgeBaseView mBridgeBaseView : mBridgeBaseViewArr) {
            if (mBridgeBaseView != null && (mBridgeBaseView instanceof MBridgeClickMiniCardView)) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            } else if (mBridgeBaseView != null && mBridgeBaseView.getVisibility() == 0 && mBridgeBaseView.getParent() != null && !isLast()) {
                mBridgeBaseView.onSelfConfigurationChanged(configuration);
            }
        }
    }

    private void a(MBridgeH5EndCardView... mBridgeH5EndCardViewArr) {
        for (MBridgeH5EndCardView mBridgeH5EndCardView : mBridgeH5EndCardViewArr) {
            if (mBridgeH5EndCardView != null && mBridgeH5EndCardView.getVisibility() == 0) {
                mBridgeH5EndCardView.orientation(getResources().getConfiguration());
            }
        }
    }
}
