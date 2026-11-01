package com.mbridge.msdk.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import io.bidmachine.ads.networks.nast.NastAdapter;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MBTempContainer extends MBTempContainerDiff {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f38429s0 = "MBTempContainer";
    private int A;
    private int B;
    private boolean C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private String I;
    private String J;
    private List<CampaignEx> K;
    private int L;
    private com.mbridge.msdk.foundation.same.report.metrics.c M;
    public boolean N;
    private LayoutInflater O;
    public boolean P;
    public k Q;
    public WindVaneWebView R;
    public MBridgeContainerView S;
    public Handler T;
    private int U;
    private int V;
    public Runnable W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Runnable f38430a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private View f38431b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f38432c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f38433d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f38434e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f38435f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f38436g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f38437h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f38438i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f38439j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f38440k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f38441l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.d f38442m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private AdSession f38443n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private MediaEvents f38444o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private AdEvents f38445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private Runnable f38446q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f38447r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f38448r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CampaignEx f38449s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f38450t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.orglistener.h f38451u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f38452v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f38453w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f38454x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f38455y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f38456z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBTempContainer.this.f38431b0.setVisibility(8);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.getActivityProxy().a() == 0) {
                MBTempContainer.this.defaultLoad(-1, "WebView load timeout");
            } else {
                MBTempContainer.this.U = -3;
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.getActivityProxy().a() == 0) {
                MBTempContainer.this.defaultLoad(-3, "Signal Communication connect timeout");
            } else {
                MBTempContainer.this.U = -4;
            }
        }
    }

    public class d implements MBridgeVideoView.u {
        public d() {
        }

        @Override // com.mbridge.msdk.video.module.MBridgeVideoView.u
        public void a() {
            if (MBTempContainer.this.f38449s != null) {
                MBTempContainer.this.l();
                if (!MBTempContainer.this.f38449s.isDynamicView() || !MBTempContainer.this.f39400p || MBTempContainer.this.f38449s.isCampaignIsFiltered()) {
                    MBTempContainer.this.f38451u.a(MBTempContainer.this.M);
                }
                com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f38449s, MBTempContainer.this.f39388d, MBTempContainer.this.f38454x);
            }
        }
    }

    public class e implements com.mbridge.msdk.video.dynview.listener.f {
        public e() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.f
        public void a() {
            MBTempContainer.this.w();
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.f38431b0 != null) {
                MBTempContainer.this.f38431b0.setVisibility(8);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBTempContainer.this.f39387c != null) {
                MBTempContainer.this.f39387c.finish();
            }
        }
    }

    public class h implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            MBTempContainer.this.onPause();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBTempContainer.f38429s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        public h() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            MBTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBTempContainer.f38429s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            MBTempContainer.this.onResume();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put("status", 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th2) {
                q0.b(MBTempContainer.f38429s0, th2.getMessage(), th2);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) MBTempContainer.this.R, "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public class i implements com.mbridge.msdk.mbsignalcommon.mraid.d.b {
        public i() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.d.b
        public void a(double d10) {
            MBridgeContainerView mBridgeContainerView;
            q0.b(MBTempContainer.f38429s0, "volume is : " + d10);
            try {
                if (MBTempContainer.this.f38449s.isMraid() && (mBridgeContainerView = MBTempContainer.this.S) != null && mBridgeContainerView.getH5EndCardView() != null) {
                    MBTempContainer.this.S.getH5EndCardView().volumeChange(d10);
                }
            } catch (Exception e10) {
                q0.b(MBTempContainer.f38429s0, e10.getMessage());
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBTempContainer.this.f38431b0.setBackgroundColor(0);
            MBTempContainer.this.f38431b0.setVisibility(0);
            MBTempContainer.this.f38431b0.bringToFront();
        }
    }

    public interface k {

        public static class a implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f38467a = false;

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k
            public void a(boolean z10) {
                this.f38467a = z10;
            }

            @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k
            public void onError(String str) {
                q0.b("ActivityErrorListener", str);
                this.f38467a = true;
            }
        }

        void a(boolean z10);

        void onError(String str);
    }

    public static final class l extends AppletSchemeCallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CampaignEx f38468a;

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestFailed(int i10, String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                q0.a(MBTempContainer.f38429s0, "request wx scheme failed: errorCode: " + i10 + " errorMessage: " + str);
            }
            try {
                CampaignEx campaignEx = this.f38468a;
                if (campaignEx != null) {
                    campaignEx.setClickURL(str2);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(MBTempContainer.f38429s0, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestStart() {
            if (MBridgeConstans.DEBUG) {
                q0.a(MBTempContainer.f38429s0, "start request wx scheme");
            }
        }

        @Override // com.mbridge.msdk.scheme.applet.AppletSchemeCallBack
        public void onRequestSuccess(String str) {
            if (MBridgeConstans.DEBUG) {
                q0.a(MBTempContainer.f38429s0, "request wx scheme success");
            }
            try {
                CampaignEx campaignEx = this.f38468a;
                if (campaignEx != null) {
                    campaignEx.setDeepLinkUrl(str);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(MBTempContainer.f38429s0, e10.getMessage());
                }
            }
        }

        public l(CampaignEx campaignEx) {
            this.f38468a = campaignEx;
        }
    }

    public final class m extends com.mbridge.msdk.video.module.listener.impl.a {
        public m(Activity activity, CampaignEx campaignEx) {
            super(activity, campaignEx);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
        @Override // com.mbridge.msdk.video.module.listener.impl.a, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            if (com.mbridge.msdk.util.b.a()) {
                MBTempContainer.this.setChinaJsCommonContext();
            }
            String string = "";
            if (i10 != 108) {
                if (i10 != 113) {
                    if (i10 != 117) {
                        if (i10 != 126 && i10 != 128) {
                            if (i10 != 131) {
                                switch (i10) {
                                    case 103:
                                    case 104:
                                        MBTempContainer.this.onAdClose();
                                        break;
                                    case 105:
                                        if (com.mbridge.msdk.util.b.a()) {
                                            MBTempContainer.this.setChinaCTACallBack();
                                        }
                                        com.mbridge.msdk.video.signal.d jSCommon = MBTempContainer.this.getJSCommon();
                                        if (obj != null) {
                                            string = obj.toString();
                                        }
                                        jSCommon.click(1, string);
                                        break;
                                    case 106:
                                        if (com.mbridge.msdk.util.b.a()) {
                                            MBTempContainer mBTempContainer = MBTempContainer.this;
                                            mBTempContainer.setChinaBrowserCallBack(mBTempContainer.f38452v, MBTempContainer.this.f38455y, MBTempContainer.this.f38451u, MBTempContainer.this.f38449s);
                                            if (MBTempContainer.this.f39387c != null && MBTempContainer.this.f38449s != null) {
                                                MBTempContainer.this.onAdClose();
                                            }
                                        } else {
                                            MBTempContainer.this.f38451u.a(true, MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
                                        }
                                        break;
                                }
                            } else {
                                MBTempContainer.this.f38451u.a(true, MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
                            }
                        } else {
                            MBTempContainer.this.f38451u.a(false, MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
                        }
                    } else {
                        MBridgeVideoView mBridgeVideoView = MBTempContainer.this.mbridgeVideoView;
                        if (mBridgeVideoView != null) {
                            mBridgeVideoView.setVisible(4);
                        }
                        MBTempContainer.this.f38439j0 = true;
                        MBTempContainer.this.f38451u.a(MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
                    }
                } else {
                    MBTempContainer.this.f38451u.a(true, MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
                }
            } else {
                if (com.mbridge.msdk.util.b.a()) {
                    MBTempContainer mBTempContainer2 = MBTempContainer.this;
                    mBTempContainer2.setChinaCallBackStatus(mBTempContainer2.R);
                }
                MBTempContainer.this.getJSCommon().a(new com.mbridge.msdk.video.signal.impl.a.b(MBTempContainer.this.getJSCommon(), new o(MBTempContainer.this, null)));
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    string = obj.toString();
                }
                jSCommon2.click(1, string);
            }
            super.a(i10, obj);
        }
    }

    public final class n extends com.mbridge.msdk.video.module.listener.impl.f {
        private n() {
        }

        public /* synthetic */ n(MBTempContainer mBTempContainer, b bVar) {
            this();
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            String string;
            super.a(i10, obj);
            try {
                if (obj instanceof JSONObject) {
                    string = obj.toString();
                } else {
                    string = (String) obj;
                }
                if (MBTempContainer.this.f39395k && !TextUtils.isEmpty(string)) {
                    JSONObject jSONObject = new JSONObject(string);
                    int iOptInt = jSONObject.optInt("type");
                    int iOptInt2 = jSONObject.optInt("complete");
                    if (iOptInt == 2) {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.D;
                    } else if (iOptInt != 3) {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.F;
                    } else {
                        MBTempContainer.this.A = com.mbridge.msdk.foundation.same.a.E;
                    }
                    MBTempContainer.this.B = iOptInt2;
                }
            } catch (Exception unused) {
                q0.b("NotifyListener", "PlayableResultListener ERROR");
            }
            if (i10 != 120) {
                String string2 = "";
                if (i10 != 131) {
                    if (i10 != 126) {
                        if (i10 != 127) {
                            switch (i10) {
                                case 100:
                                    MBTempContainer.this.f38440k0 = true;
                                    MBTempContainer mBTempContainer = MBTempContainer.this;
                                    mBTempContainer.T.postDelayed(mBTempContainer.f38446q0, 250L);
                                    MBTempContainer.this.f38451u.a(MBTempContainer.this.M);
                                    break;
                                case 101:
                                case 102:
                                    MBTempContainer.this.getJSCommon().f();
                                    break;
                                case 103:
                                    MBTempContainer.this.f38433d0 = true;
                                    if (MBTempContainer.this.f38449s.isMraid()) {
                                        MBTempContainer.this.onAdClose();
                                    } else {
                                        MBTempContainer.this.getJSCommon().f();
                                    }
                                    break;
                                case 104:
                                    MBTempContainer.this.onAdClose();
                                    break;
                                case 105:
                                    if (com.mbridge.msdk.util.b.a()) {
                                        MBTempContainer.this.setChinaCTACallBack();
                                    }
                                    com.mbridge.msdk.video.signal.d jSCommon = MBTempContainer.this.getJSCommon();
                                    if (obj != null) {
                                        string2 = obj.toString();
                                    }
                                    jSCommon.click(1, string2);
                                    break;
                            }
                        }
                        MBTempContainer.this.f38433d0 = true;
                        MBTempContainer.this.f38451u.a(MBTempContainer.this.M);
                        MBTempContainer.this.f38451u.a(MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
                        MBTempContainer.this.getJSContainerModule().showEndcard(100);
                        return;
                    }
                    MBTempContainer.this.f38451u.a(false, MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
                    return;
                }
                com.mbridge.msdk.video.signal.d jSCommon2 = MBTempContainer.this.getJSCommon();
                if (obj != null) {
                    string2 = obj.toString();
                }
                jSCommon2.click(4, string2);
                return;
            }
            MBTempContainer.this.f38451u.a(MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
        }
    }

    public class o extends com.mbridge.msdk.video.signal.impl.a.C0411a {
        private o() {
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0411a, com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a(boolean z10) {
            if (MBTempContainer.this.f38444o0 != null) {
                try {
                    MBTempContainer.this.f38444o0.adUserInteraction(InteractionType.CLICK);
                    q0.a("omsdk", "mbtc adUserInteraction click");
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
            super.a(z10);
            MBTempContainer.this.f38451u.a(z10, MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
        }

        public /* synthetic */ o(MBTempContainer mBTempContainer, b bVar) {
            this();
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0411a, com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            MBTempContainer.this.f38437h0 = true;
            MBTempContainer.this.m();
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String strOptString = new JSONObject(MBTempContainer.this.getJSVideoModule().getCurrentProgress()).optString("progress", "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && strOptString.equals(NastAdapter.ADAPTER_SDK_VERSION_NAME) && MBTempContainer.this.f39387c != null) {
                        if (MBTempContainer.this.f39400p) {
                            MBTempContainer.this.onAdClose();
                        } else {
                            MBTempContainer.this.f39387c.finish();
                        }
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            if (MBTempContainer.this.f38448r0) {
                MBTempContainer.this.onResume();
            }
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0411a, com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void onInitSuccess() {
            super.onInitSuccess();
            MBTempContainer.this.receiveSuccess();
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0411a, com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
            MBTempContainer.this.m();
            MBTempContainer.this.f38437h0 = true;
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0411a, com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
            MBTempContainer.this.y();
            if (MBTempContainer.this.f38448r0) {
                MBTempContainer.this.onPause();
            }
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0411a, com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a(int i10, String str) {
            super.a(i10, str);
            MBTempContainer.this.defaultLoad(i10, str);
        }

        @Override // com.mbridge.msdk.video.signal.impl.a.C0411a, com.mbridge.msdk.video.signal.a.InterfaceC0410a
        public void a() {
            super.a();
            MBTempContainer mBTempContainer = MBTempContainer.this;
            Handler handler = mBTempContainer.T;
            if (handler != null) {
                handler.removeCallbacks(mBTempContainer.W);
            }
        }
    }

    public final class p extends com.mbridge.msdk.video.module.listener.impl.f {
        private p() {
        }

        public /* synthetic */ p(MBTempContainer mBTempContainer, b bVar) {
            this();
        }

        @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
        public void a(int i10, Object obj) {
            String string;
            int i11;
            super.a(i10, obj);
            if (MBTempContainer.this.f39395k) {
                try {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject jSONObject = new JSONObject(str);
                            MBTempContainer.this.A = jSONObject.getInt("Alert_window_status");
                            MBTempContainer.this.B = jSONObject.getInt("complete_info");
                        }
                    }
                } catch (Exception e10) {
                    q0.b("NotifyListener", e10.getMessage());
                }
            }
            if (i10 != 2) {
                if (i10 == 121) {
                    MBTempContainer.this.f38433d0 = true;
                    MBTempContainer.this.f38451u.b(MBTempContainer.this.f39389e, MBTempContainer.this.f39388d);
                    MBTempContainer.this.f38438i0 = false;
                    return;
                }
                if (i10 != 16) {
                    if (i10 != 17) {
                        switch (i10) {
                            case 10:
                                MBTempContainer.this.f38438i0 = true;
                                if (MBTempContainer.this.f38449s != null && !s0.a().a("i_l_s_t_r_i", false)) {
                                    MBTempContainer.this.l();
                                    if (!MBTempContainer.this.f38449s.isDynamicView() || !MBTempContainer.this.f39400p || MBTempContainer.this.f38449s.isCampaignIsFiltered()) {
                                        MBTempContainer.this.f38451u.a(MBTempContainer.this.M);
                                    }
                                    com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f38449s, MBTempContainer.this.f39388d, MBTempContainer.this.f38454x);
                                    break;
                                }
                                break;
                        }
                    }
                    MBTempContainer.this.f38433d0 = true;
                    MBridgeContainerView mBridgeContainerView = MBTempContainer.this.S;
                    if (mBridgeContainerView != null) {
                        mBridgeContainerView.setRewardStatus(true);
                        return;
                    }
                    return;
                }
                if (com.mbridge.msdk.util.b.a()) {
                    MBTempContainer.this.onAdClose();
                    return;
                } else {
                    MBTempContainer.this.getJSCommon().f();
                    return;
                }
            }
            if (i10 == 12) {
                try {
                    if (obj instanceof String) {
                        string = obj.toString();
                    } else {
                        string = "Play error but has no message.";
                    }
                } catch (Throwable th2) {
                    q0.b("NotifyListener", th2.getMessage());
                }
                com.mbridge.msdk.video.bt.module.orglistener.f.a(MBTempContainer.this.getContext(), MBTempContainer.this.f38449s, MBTempContainer.this.f39388d, string, MBTempContainer.this.f38454x);
                if (!MBTempContainer.this.f38438i0) {
                    if (MBTempContainer.this.f39390f.C() != 0) {
                        MBTempContainer.this.l();
                        if (MBTempContainer.this.f38449s == null || !MBTempContainer.this.f38449s.isDynamicView() || !MBTempContainer.this.f39400p || MBTempContainer.this.f38449s.isCampaignIsFiltered()) {
                            MBTempContainer.this.f38451u.a(MBTempContainer.this.M);
                        }
                    } else {
                        MBTempContainer.this.f38451u.a(MBTempContainer.this.M, "play error");
                        MBTempContainer.this.f38438i0 = false;
                        MBTempContainer.this.onAdClose();
                        return;
                    }
                }
            }
            com.mbridge.msdk.video.signal.j jSVideoModule = MBTempContainer.this.getJSVideoModule();
            if (i10 == 2) {
                i11 = 6;
            } else {
                i11 = 3;
            }
            jSVideoModule.videoOperate(i11);
            MBTempContainer.this.f38438i0 = false;
            if (MBTempContainer.this.f38444o0 != null && i10 == 2) {
                q0.b("omsdk", "mbtc skip");
                try {
                    MBTempContainer.this.f38444o0.skipped();
                    MBTempContainer.this.f38444o0 = null;
                } catch (Exception e11) {
                    q0.a("omsdk", e11.getMessage());
                }
            }
        }
    }

    public MBTempContainer(Context context) {
        super(context);
        this.f38454x = 1;
        this.f38455y = "";
        this.A = com.mbridge.msdk.foundation.same.a.F;
        this.C = false;
        this.I = "";
        this.K = new ArrayList();
        this.L = 0;
        this.N = false;
        this.P = false;
        this.Q = new k.a();
        this.T = new Handler();
        this.U = 0;
        this.V = 0;
        this.W = new b();
        this.f38430a0 = new c();
        this.f38432c0 = false;
        this.f38433d0 = false;
        this.f38434e0 = false;
        this.f38436g0 = false;
        this.f38437h0 = false;
        this.f38438i0 = false;
        this.f38439j0 = false;
        this.f38440k0 = false;
        this.f38441l0 = false;
        this.f38443n0 = null;
        this.f38444o0 = null;
        this.f38445p0 = null;
        this.f38446q0 = new f();
        this.f38448r0 = false;
        init(context);
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainerDiff, com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainerDiff, com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void preload() {
    }

    public void setMediaPlayerUrl(String str) {
    }

    private void A() {
        if (this.f38449s == null) {
            return;
        }
        AppletsModel appletsModel = null;
        try {
            appletsModel = AppletModelManager.getInstance().get(this.f38449s);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        if (appletsModel != null) {
            try {
                if (appletsModel.can(0)) {
                    appletsModel.setUserClick(false);
                    appletsModel.requestWxAppletsScheme(0, new l(this.f38449s));
                }
            } catch (Exception e11) {
                appletsModel.clearRequestState();
                if (MBridgeConstans.DEBUG) {
                    e11.printStackTrace();
                }
            }
        }
    }

    private int getCloseBtnTime() {
        CampaignEx campaignEx = this.f38449s;
        if (campaignEx == null) {
            return 1;
        }
        boolean zB = v0.b(MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE, campaignEx.getendcard_url());
        int iD = v0.d(this.f38449s.getendcard_url(), MBridgeConstans.DYNAMIC_VIEW_KEY_CLOSE_BTN_DELATE);
        if (!zB || iD < 0) {
            return this.f38449s.getCbd() > -2 ? this.f38449s.getCbd() : this.f39390f.i();
        }
        return iD;
    }

    private void k() {
        if (this.f39390f == null) {
            this.f39390f = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f39388d, this.f39395k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView == null || mBridgeVideoView.notifyListener == null) {
                eVar.a("notify_listener", 0);
            } else {
                eVar.a("notify_listener", 1);
                com.mbridge.msdk.video.module.listener.a aVar = this.mbridgeVideoView.notifyListener;
                if (aVar instanceof com.mbridge.msdk.video.module.listener.impl.n) {
                    eVar.a("listener_type", 1);
                } else if (aVar instanceof com.mbridge.msdk.video.module.listener.impl.m) {
                    eVar.a("listener_type", 2);
                } else {
                    eVar.a("listener_type", 3);
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = this.M;
            if (cVar != null) {
                cVar.a("2000130", eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (isLoadSuccess()) {
            this.f39387c.runOnUiThread(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdClose() {
        int i10;
        try {
            com.mbridge.msdk.video.bt.module.listener.b bVar = this.f38452v;
            if (bVar == null) {
                Activity activity = this.f39387c;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            if (this.f39395k && ((i10 = this.f39397m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
                boolean z10 = true;
                if (this.B != 1) {
                    z10 = false;
                }
                bVar.a(z10, this.A);
            }
            this.f38452v.a(this.f38455y, this.f38433d0, this.f39392h);
        } catch (Exception unused) {
            Activity activity2 = this.f39387c;
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    private void q() {
        AdSession adSession = this.f38443n0;
        if (adSession != null) {
            try {
                MBridgeContainerView mBridgeContainerView = this.S;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession.addFriendlyObstruction(mBridgeContainerView, friendlyObstructionPurpose, null);
                View view = this.f38431b0;
                if (view != null) {
                    this.f38443n0.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
                }
                WindVaneWebView windVaneWebView = this.R;
                if (windVaneWebView != null) {
                    this.f38443n0.addFriendlyObstruction(windVaneWebView, friendlyObstructionPurpose, null);
                }
                this.mbridgeVideoView.setVideoEvents(this.f38444o0);
                this.f38443n0.start();
                if (this.f38445p0 != null) {
                    VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                    q0.a("omsdk", "bt:   adEvents.loaded");
                    this.f38445p0.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                    this.f38445p0.impressionOccurred();
                }
            } catch (Exception e10) {
                q0.a("omsdk", e10.getMessage());
            }
        }
    }

    private void r() {
        CampaignEx campaignEx;
        int i10;
        boolean z10 = true;
        try {
            this.f38432c0 = true;
            CampaignEx campaignEx2 = this.f38449s;
            if (campaignEx2 != null && campaignEx2.getPlayable_ads_without_video() == 2) {
                this.f38433d0 = true;
            }
            MediaEvents mediaEvents = this.f38444o0;
            if (mediaEvents != null && !this.f38433d0) {
                try {
                    mediaEvents.skipped();
                    this.f38444o0 = null;
                } catch (Exception e10) {
                    q0.a("omsdk", e10.getMessage());
                }
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar = this.f38451u;
            if (hVar != null) {
                if (this.f39395k && ((i10 = this.f39397m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
                    if (this.B != 1) {
                        z10 = false;
                    }
                    hVar.a(z10, this.A);
                }
                if (!this.f38433d0) {
                    this.f39392h.a(0);
                }
                this.M.a(this.f38449s);
                this.f38451u.a(this.M, this.f38433d0, this.f39392h);
            }
            this.T.removeCallbacks(this.f38446q0);
            if ((!this.f39395k && !this.f39400p) || ((campaignEx = this.f38449s) != null && campaignEx.isDynamicView())) {
                u();
            }
            if (!this.f39400p) {
                if (this.f39395k) {
                    com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f38449s);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f38449s);
                }
            }
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.release();
            }
        } catch (Throwable th2) {
            q0.b(f38429s0, th2.getMessage(), th2);
        }
    }

    private void s() {
        com.mbridge.msdk.foundation.same.report.h hVar = new com.mbridge.msdk.foundation.same.report.h(getContext());
        CampaignEx campaignEx = this.f38449s;
        if (campaignEx != null) {
            hVar.b(campaignEx.getRequestId(), this.f38449s.getRequestIdNotice(), this.f38449s.getId(), this.f39388d, com.mbridge.msdk.mbsignalcommon.mraid.c.b(this.f38449s.getId()), this.f38449s.isBidCampaign());
            com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f38449s.getId());
            this.f38435f0 = true;
        }
    }

    private void t() {
        Runnable runnable;
        int i10 = this.U;
        if (i10 == -3) {
            runnable = this.W;
        } else {
            runnable = i10 == -4 ? this.f38430a0 : null;
        }
        if (runnable != null) {
            runnable.run();
            this.U = 0;
        }
    }

    private void u() {
        if (this.f38433d0) {
            if (com.mbridge.msdk.util.b.a() && checkChinaSendToServerDiff(this.f38451u)) {
                return;
            }
            q0.a(f38429s0, "sendToServerRewardInfo");
            com.mbridge.msdk.video.module.report.b.a(this.f38449s, this.f39392h, this.f39388d, this.f39391g, this.J);
        }
    }

    private void v() {
        getJSCommon().setAdEvents(this.f38445p0);
        getJSCommon().setAdSession(this.f38443n0);
        getJSCommon().setVideoEvents(this.f38444o0);
        getJSCommon().g(this.f39394j);
        getJSCommon().setUnitId(this.f39388d);
        getJSCommon().setRewardUnitSetting(this.f39390f);
        getJSCommon().a(new o(this, null));
        CampaignEx campaignEx = this.f38449s;
        if (campaignEx != null) {
            if (campaignEx.isMraid() || this.f38449s.isActiveOm()) {
                com.mbridge.msdk.mbsignalcommon.mraid.d dVar = new com.mbridge.msdk.mbsignalcommon.mraid.d(getContext());
                this.f38442m0 = dVar;
                dVar.c();
                this.f38442m0.a();
                this.f38442m0.a(new i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("temp_container", getWidth() + VastAttributes.HORIZONTAL_POSITION + getHeight());
            if (this.R != null) {
                eVar.a("web_view", this.R.getWidth() + VastAttributes.HORIZONTAL_POSITION + this.R.getHeight());
            }
            if (this.mbridgeVideoView != null) {
                eVar.a("mbridge_video_view", this.mbridgeVideoView.getWidth() + VastAttributes.HORIZONTAL_POSITION + this.mbridgeVideoView.getHeight());
                if (this.mbridgeVideoView.mPlayerView != null) {
                    eVar.a("player_view", this.mbridgeVideoView.mPlayerView.getWidth() + VastAttributes.HORIZONTAL_POSITION + this.mbridgeVideoView.mPlayerView.getHeight());
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = this.M;
            if (cVar != null) {
                cVar.a("2000136", eVar);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (isLoadSuccess()) {
            this.f39387c.runOnUiThread(new j());
        }
    }

    public boolean canBackPress() {
        MBridgeContainerView mBridgeContainerView = this.S;
        return mBridgeContainerView == null || mBridgeContainerView.canBackPress();
    }

    public void defaultLoad(int i10, String str) {
        int i11;
        superDefaultLoad(i10, str);
        CampaignEx campaignEx = this.f38449s;
        if (campaignEx != null && !campaignEx.isDynamicView()) {
            this.f38449s.setTemplateRenderSucc(false);
        }
        if (!isLoadSuccess()) {
            b(i10, str);
            Activity activity = this.f39387c;
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        b bVar = null;
        if (this.f38449s.getPlayable_ads_without_video() == 2) {
            this.S.setCampaign(this.f38449s);
            this.S.addOrderViewData(this.K);
            this.S.setUnitID(this.f39388d);
            this.S.setCloseDelayTime(getCloseBtnTime());
            this.S.setPlayCloseBtnTm(this.f39390f.u());
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.h(this.f38449s, this.f38450t, this.f39392h, getInnerPlacementId(), this.f39388d, new n(this, bVar), this.f39390f.A(), this.f39400p));
            this.S.preLoadData(this.f38456z);
            this.f38456z.getJSCommon().g(this.f39394j);
            SpecialsBridge.MintegralContainerView_showPlayableView(this.S);
        } else {
            b(i10, str);
            this.f38431b0.setVisibility(8);
            loadModuleDatas();
            int iE = this.f39390f.E();
            int h5CloseType = getH5CloseType();
            int i12 = h5CloseType != 0 ? h5CloseType : iE;
            CampaignEx campaignEx2 = this.f38449s;
            if (campaignEx2 != null && campaignEx2.isDynamicView()) {
                this.mbridgeVideoView.setContainerViewOnNotifyListener(new m(this.f39387c, this.f38449s));
            }
            CampaignEx campaignEx3 = this.f38449s;
            int iF = (campaignEx3 == null || campaignEx3.getVst() <= -2) ? this.f39390f.F() : this.f38449s.getVst();
            CampaignEx campaignEx4 = this.f38449s;
            if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5 && (i11 = this.f38454x) > 1) {
                iF = a(iF, i11);
                this.f38449s.setVst(iF);
            }
            int i13 = iF;
            this.mbridgeVideoView.setVideoSkipTime(i13);
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            mBridgeVideoView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.m(mBridgeVideoView, this.S, this.f38449s, this.f39392h, this.f38450t, getInnerPlacementId(), this.f39388d, i12, i13, new p(this, bVar), this.f39390f.A(), this.f39400p, this.f39390f.C()));
            this.mbridgeVideoView.setAdSession(this.f38443n0);
            this.mbridgeVideoView.setVideoEvents(this.f38444o0);
            this.mbridgeVideoView.defaultShow();
            MBridgeContainerView mBridgeContainerView = this.S;
            mBridgeContainerView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.b(this.mbridgeVideoView, mBridgeContainerView, this.f38449s, this.f39392h, this.f38450t, getInnerPlacementId(), this.f39388d, new m(this.f39387c, this.f38449s), this.f39390f.A(), this.f39400p));
            this.S.defaultShow();
        }
        q();
    }

    public MBridgeContainerView findMBridgeContainerView() {
        return (MBridgeContainerView) findViewById(findID("mbridge_video_templete_container"));
    }

    public MBridgeVideoView findMBridgeVideoView() {
        return (MBridgeVideoView) findViewById(findID("mbridge_video_templete_videoview"));
    }

    public WindVaneWebView findWindVaneWebView() {
        try {
            if (!this.f39400p) {
                com.mbridge.msdk.videocommon.a.C0412a c0412aA = this.f39395k ? com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f38449s) : com.mbridge.msdk.videocommon.a.a(94, this.f38449s);
                if (c0412aA == null || !c0412aA.c()) {
                    return null;
                }
                if (this.f39395k) {
                    com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f38449s);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f38449s);
                }
                WindVaneWebView windVaneWebViewB = c0412aA.b();
                if (this.f38436g0) {
                    windVaneWebViewB.setWebViewTransparent();
                }
                return windVaneWebViewB;
            }
            CampaignEx campaignEx = this.f38449s;
            if (campaignEx == null || campaignEx.getRewardTemplateMode() == null) {
                return null;
            }
            com.mbridge.msdk.videocommon.a.C0412a c0412aB = com.mbridge.msdk.videocommon.a.b(this.f39388d + "_" + this.f38449s.getId() + "_" + this.f38449s.getRequestId() + "_" + this.f38449s.getRewardTemplateMode().j());
            if (c0412aB != null) {
                return c0412aB.b();
            }
            return null;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e10.printStackTrace();
            return null;
        }
    }

    public AdEvents getAdEvents() {
        return this.f38445p0;
    }

    public AdSession getAdSession() {
        return this.f38443n0;
    }

    public CampaignEx getCampaign() {
        return this.f38449s;
    }

    public RelativeLayout.LayoutParams getContentLayoutParams() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public int getH5CloseType() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f38449s);
        if (kVarB != null) {
            return kVarB.l();
        }
        return 0;
    }

    public int getH5MuteState() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f38449s);
        if (kVarB != null) {
            return kVarB.m();
        }
        return 0;
    }

    public String getInstanceId() {
        return this.f38455y;
    }

    public boolean getIsShowingTransparent() {
        com.mbridge.msdk.video.signal.impl.k kVarB = b(this.f38449s);
        if (kVarB != null) {
            return kVarB.p();
        }
        return false;
    }

    public int getLayoutID() {
        return findLayout(this.f38436g0 ? "mbridge_reward_activity_video_templete_transparent" : "mbridge_reward_activity_video_templete");
    }

    public MediaEvents getVideoEvents() {
        return this.f38444o0;
    }

    public boolean initViews() {
        View viewFindViewById = findViewById(findID("mbridge_video_templete_progressbar"));
        this.f38431b0 = viewFindViewById;
        return viewFindViewById != null;
    }

    public boolean isHasDestoryed() {
        return this.C;
    }

    public boolean isLoadSuccess() {
        return this.P;
    }

    public void loadModuleDatas() {
        int i10;
        int i11;
        int h5MuteState = getH5MuteState();
        if (h5MuteState != 0) {
            this.f39394j = h5MuteState;
        }
        int iE = this.f39390f.E();
        int h5CloseType = getH5CloseType();
        int i12 = h5CloseType != 0 ? h5CloseType : iE;
        this.mbridgeVideoView.setSoundState(this.f39394j);
        this.mbridgeVideoView.setCampaign(this.f38449s);
        this.mbridgeVideoView.setPlayURL(this.f38450t.l());
        CampaignEx campaignEx = this.f38449s;
        int iF = (campaignEx == null || campaignEx.getVst() <= -2) ? this.f39390f.F() : this.f38449s.getVst();
        CampaignEx campaignEx2 = this.f38449s;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (i11 = this.f38454x) > 1) {
            iF = a(iF, i11);
            this.f38449s.setVst(iF);
        }
        this.mbridgeVideoView.setVideoSkipTime(iF);
        this.mbridgeVideoView.setCloseAlert(this.f39390f.h());
        this.mbridgeVideoView.setBufferTimeout(getBufferTimeout());
        int i13 = iF;
        this.mbridgeVideoView.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.n(this.f38456z, this.f38449s, this.f39392h, this.f38450t, getInnerPlacementId(), this.f39388d, i12, iF, new p(this, null), this.f39390f.A(), this.f39400p, this.f39390f.C()));
        this.mbridgeVideoView.setShowingTransparent(this.f38436g0);
        this.mbridgeVideoView.setAdSession(this.f38443n0);
        if (this.f39395k && ((i10 = this.f39397m) == com.mbridge.msdk.foundation.same.a.H || i10 == com.mbridge.msdk.foundation.same.a.I)) {
            this.mbridgeVideoView.setIVRewardEnable(i10, this.f39398n, this.f39399o);
            this.mbridgeVideoView.setDialogRole(getH5DialogRole());
        }
        this.S.setCampaign(this.f38449s);
        this.S.addOrderViewData(this.K);
        this.S.setUnitID(this.f39388d);
        this.S.setCloseDelayTime(getCloseBtnTime());
        this.S.setPlayCloseBtnTm(this.f39390f.u());
        this.S.setVideoInteractiveType(this.f39390f.D());
        this.S.setEndscreenType(this.f39390f.m());
        this.S.setVideoSkipTime(i13);
        this.S.setShowingTransparent(this.f38436g0);
        this.S.setJSFactory(this.f38456z);
        this.f38456z.getJSCommon().g(this.f39394j);
        if (this.f38449s.getPlayable_ads_without_video() == 2) {
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.h(this.f38449s, this.f38450t, this.f39392h, getInnerPlacementId(), this.f39388d, new n(this, null), this.f39390f.A(), this.f39400p));
            this.S.preLoadData(this.f38456z);
            SpecialsBridge.MintegralContainerView_showPlayableView(this.S);
        } else {
            this.S.setNotifyListener(new com.mbridge.msdk.video.module.listener.impl.c(this.f38456z, this.f38449s, this.f39392h, this.f38450t, getInnerPlacementId(), this.f39388d, new m(this.f39387c, this.f38449s), this.f39390f.A(), this.f39400p));
            this.S.preLoadData(this.f38456z);
            this.mbridgeVideoView.preLoadData(this.f38456z);
        }
        if (this.f38436g0) {
            this.S.setMBridgeClickMiniCardViewTransparent();
        }
    }

    public boolean n() {
        this.R = findWindVaneWebView();
        MBridgeVideoView mBridgeVideoViewFindMBridgeVideoView = findMBridgeVideoView();
        this.mbridgeVideoView = mBridgeVideoViewFindMBridgeVideoView;
        mBridgeVideoViewFindMBridgeVideoView.setVideoLayout(this.f38449s);
        this.mbridgeVideoView.setIsIV(this.f39395k);
        this.mbridgeVideoView.setUnitId(this.f39388d);
        this.mbridgeVideoView.setCamPlayOrderCallback(this.f38453w, this.K, this.f38454x, this.L);
        if (this.f39400p) {
            this.mbridgeVideoView.setNotchPadding(this.E, this.F, this.G, this.H);
        }
        MBridgeContainerView mBridgeContainerViewFindMBridgeContainerView = findMBridgeContainerView();
        this.S = mBridgeContainerViewFindMBridgeContainerView;
        if (this.f39400p) {
            mBridgeContainerViewFindMBridgeContainerView.setNotchPadding(this.D, this.E, this.F, this.G, this.H);
        }
        if (s0.a().a("i_l_s_t_r_i", false)) {
            this.mbridgeVideoView.setPlayerViewAttachListener(new d());
        }
        this.mbridgeVideoView.setIPlayVideoViewLayoutCallBack(new e());
        return (this.mbridgeVideoView == null || this.S == null || !initViews()) ? false : true;
    }

    public boolean o() {
        if (this.mbridgeVideoView == null) {
            return false;
        }
        if (com.mbridge.msdk.util.b.a()) {
            return this.mbridgeVideoView.isShowingAlertView() || checkChinaShowingAlertViewState() || this.mbridgeVideoView.isRewardPopViewShowing();
        }
        return this.mbridgeVideoView.isShowingAlertView() || this.mbridgeVideoView.isRewardPopViewShowing();
    }

    public void onBackPressed() {
        MBridgeContainerView mBridgeContainerView;
        MBridgeContainerView mBridgeContainerView2;
        MBridgeVideoView mBridgeVideoView;
        MBridgeVideoView mBridgeVideoView2;
        if (this.f38436g0 && (mBridgeVideoView2 = this.mbridgeVideoView) != null) {
            mBridgeVideoView2.notifyVideoClose();
            return;
        }
        CampaignEx campaignEx = this.f38449s;
        if (((campaignEx != null && campaignEx.getRewardTemplateMode() != null && this.f38449s.getRewardTemplateMode().k() == 5002010) || this.f38438i0) && (mBridgeVideoView = this.mbridgeVideoView) != null) {
            if (!mBridgeVideoView.isMiniCardShowing()) {
                this.mbridgeVideoView.onBackPress();
                return;
            }
            MBridgeContainerView mBridgeContainerView3 = this.S;
            if (mBridgeContainerView3 != null) {
                mBridgeContainerView3.onMiniEndcardBackPress();
                return;
            }
            return;
        }
        if (this.f38440k0 && (mBridgeContainerView2 = this.S) != null) {
            mBridgeContainerView2.onPlayableBackPress();
            return;
        }
        if (this.f38439j0 && (mBridgeContainerView = this.S) != null) {
            mBridgeContainerView.onEndcardBackPress();
        }
        if (getJSCommon().a()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().e();
                return;
            }
            return;
        }
        if (!canBackPress()) {
            q0.a(f38429s0, "onBackPressed can't excute");
            return;
        }
        Activity activity = this.f39387c;
        if (activity == null || this.f39400p || this.f38441l0) {
            return;
        }
        this.f38441l0 = true;
        activity.onBackPressed();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.C) {
            return;
        }
        this.C = true;
        super.onDestroy();
        try {
            if (com.mbridge.msdk.util.b.a()) {
                setChinaDestroy();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.releasePlayer();
            }
            WindVaneWebView windVaneWebView = this.R;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.R.clearWebView();
                this.R.release();
            }
            if (this.f38452v != null) {
                this.f38452v = null;
            }
            this.T.removeCallbacks(this.W);
            this.T.removeCallbacks(this.f38430a0);
            getJSCommon().release();
            if (this.f39395k) {
                com.mbridge.msdk.setting.h.b().g(this.f39388d);
            }
            if (!this.f38432c0) {
                r();
            }
            if (!this.f38435f0) {
                s();
            }
            com.mbridge.msdk.mbsignalcommon.mraid.d dVar = this.f38442m0;
            if (dVar != null) {
                dVar.d();
            }
            if (this.f38443n0 != null) {
                q0.b("omsdk", "tc onDestroy");
                this.f38443n0.removeAllFriendlyObstructions();
                this.f38443n0.finish();
                this.f38443n0 = null;
            }
            if (!this.f39400p) {
                if (isLoadSuccess()) {
                    this.T.postDelayed(new g(), 100L);
                } else {
                    Activity activity = this.f39387c;
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }
            if (!this.f38435f0) {
                s();
            }
            com.mbridge.msdk.video.bt.component.d.c().a(this.f38455y);
        } catch (Throwable th2) {
            q0.a(f38429s0, th2.getMessage());
        }
    }

    public void p() {
        ViewGroup viewGroup;
        List<CampaignEx> list;
        WindVaneWebView windVaneWebView = this.R;
        CampaignEx campaignEx = this.f38449s;
        if (campaignEx != null) {
            b1.a(windVaneWebView, campaignEx.getLocalRequestId(), this.f38449s.getLocalAllowTrackClick());
        }
        this.f38456z = new com.mbridge.msdk.video.signal.factory.b(this.f39387c, windVaneWebView, this.mbridgeVideoView, this.S, this.f38449s, new o(this, null));
        CampaignEx campaignEx2 = this.f38449s;
        if (campaignEx2 != null && campaignEx2.getDynamicTempCode() == 5 && (list = this.K) != null) {
            this.f38456z.a(list);
        }
        registerJsFactory(this.f38456z);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f39388d + "_1", new h());
        q();
        if (windVaneWebView == null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f38447r.findViewById(i0.a(getContext(), "mbridge_video_templete_webview_parent", "id"));
        windVaneWebView.setApiManagerJSFactory(this.f38456z);
        if (windVaneWebView.getParent() != null) {
            defaultLoad(0, "preload template webview is null or load error");
            return;
        }
        if (windVaneWebView.getObject() instanceof com.mbridge.msdk.video.signal.impl.k) {
            v();
            getJSContainerModule().readyStatus(((com.mbridge.msdk.video.signal.impl.k) windVaneWebView.getObject()).v());
            z();
            ((com.mbridge.msdk.video.signal.impl.k) windVaneWebView.getObject()).f39430m.onInitSuccess();
            if (this.f39400p) {
                getJSCommon().setWebViewFront(this.V);
            }
        }
        if (getJSCommon().b() == 1 && (viewGroup = (ViewGroup) this.f38447r.findViewById(i0.a(getContext(), "mbridge_video_templete_webview_parent", "id"))) != null) {
            ((ViewGroup) this.f38447r).removeView(viewGroup);
            ((ViewGroup) this.f38447r).addView(viewGroup, 1);
        }
        viewGroup2.addView(windVaneWebView, new ViewGroup.LayoutParams(-1, -1));
    }

    public void receiveSuccess() {
        q0.a(f38429s0, "receiveSuccess ,start hybrid");
        this.T.removeCallbacks(this.f38430a0);
        this.T.postDelayed(this.f38446q0, 250L);
    }

    public void registerErrorListener(k kVar) {
        this.Q = kVar;
    }

    public void setAdEvents(AdEvents adEvents) {
        this.f38445p0 = adEvents;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f38456z;
        if (bVar == null || bVar.getJSCommon() == null) {
            return;
        }
        this.f38456z.getJSCommon().setAdEvents(adEvents);
    }

    public void setAdSession(AdSession adSession) {
        this.f38443n0 = adSession;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f38456z;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.f38456z.getJSCommon().setAdSession(adSession);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setAdSession(adSession);
        }
    }

    public void setCamPlayOrderCallback(com.mbridge.msdk.video.dynview.listener.a aVar, int i10) {
        this.f38453w = aVar;
        this.f38454x = i10;
    }

    public void setCampOrderViewData(List<CampaignEx> list, int i10) {
        if (list != null) {
            this.K = list;
        }
        this.L = i10;
    }

    public void setCampaign(CampaignEx campaignEx) {
        this.f38449s = campaignEx;
        if (campaignEx != null) {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
            this.M = cVarB;
            if (cVarB == null) {
                this.M = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.M.i(campaignEx.getCurrentLocalRid());
            this.M.a(campaignEx);
            if (TextUtils.isEmpty(campaignEx.getCampaignUnitId()) && !TextUtils.isEmpty(this.f39388d)) {
                campaignEx.setCampaignUnitId(this.f39388d);
            }
            AppletsModel appletsModel = AppletModelManager.getInstance().get(campaignEx);
            if (appletsModel != null) {
                this.f38448r0 = appletsModel.isSupportWxScheme();
            }
            com.mbridge.msdk.foundation.feedback.b.b().a(campaignEx.getCampaignUnitId() + "_1", campaignEx);
        }
    }

    public void setCampaignDownLoadTask(com.mbridge.msdk.videocommon.download.a aVar) {
        this.f38450t = aVar;
    }

    public void setCampaignExpired(boolean z10) {
        try {
            CampaignEx campaignEx = this.f38449s;
            if (campaignEx != null) {
                if (z10) {
                    campaignEx.setSpareOfferFlag(1);
                    if (!com.mbridge.msdk.util.b.a()) {
                        com.mbridge.msdk.videocommon.setting.c cVar = this.f39390f;
                        if (cVar != null) {
                            if (cVar.A() == 1) {
                                this.f38449s.setCbt(1);
                            } else {
                                this.f38449s.setCbt(0);
                            }
                        }
                    } else if (this.f39396l) {
                        this.f38449s.setCbt(0);
                    } else {
                        com.mbridge.msdk.videocommon.setting.c cVar2 = this.f39390f;
                        if (cVar2 != null) {
                            if (cVar2.A() == 1) {
                                this.f38449s.setCbt(1);
                            } else {
                                this.f38449s.setCbt(0);
                            }
                        }
                    }
                } else {
                    campaignEx.setSpareOfferFlag(0);
                    this.f38449s.setCbt(0);
                }
            }
        } catch (Exception e10) {
            q0.b(f38429s0, e10.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.J = str;
    }

    public void setInstanceId(String str) {
        this.f38455y = str;
    }

    public void setJSFactory(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f38456z = bVar;
    }

    public void setMBridgeTempCallback(com.mbridge.msdk.video.bt.module.listener.b bVar) {
        this.f38452v = bVar;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13, int i14) {
        this.D = i10;
        this.E = i11;
        this.F = i12;
        this.G = i13;
        this.H = i14;
        String strA = d0.a(i10, i11, i12, i13, i14);
        this.I = strA;
        q0.b(f38429s0, strA);
        if (getJSCommon() != null && !TextUtils.isEmpty(this.I)) {
            getJSCommon().a(this.I);
            if (this.R != null && !TextUtils.isEmpty(this.I)) {
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.R, "oncutoutfetched", Base64.encodeToString(this.I.getBytes(), 0));
            }
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setNotchPadding(i11, i12, i13, i14);
        }
        MBridgeContainerView mBridgeContainerView = this.S;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.setNotchPadding(i10, i11, i12, i13, i14);
        }
    }

    public void setShowRewardListener(com.mbridge.msdk.video.bt.module.orglistener.h hVar) {
        this.f38451u = hVar;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f38444o0 = mediaEvents;
        com.mbridge.msdk.video.signal.factory.b bVar = this.f38456z;
        if (bVar != null && bVar.getJSCommon() != null) {
            this.f38456z.getJSCommon().setVideoEvents(mediaEvents);
        }
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setVideoEvents(mediaEvents);
        }
    }

    public void setWebViewFront(int i10) {
        this.V = i10;
    }

    public void superDefaultLoad(int i10, String str) {
        this.T.removeCallbacks(this.W);
        this.T.removeCallbacks(this.f38430a0);
        this.Q.a(true);
        WindVaneWebView windVaneWebView = this.R;
        if (windVaneWebView != null) {
            windVaneWebView.setVisibility(8);
        }
    }

    public void x() {
        if (this.N) {
            setMatchParent();
        }
    }

    public void z() {
        int iG;
        int iF;
        try {
            if (this.R != null) {
                int i10 = getResources().getConfiguration().orientation;
                if (getIsShowingTransparent()) {
                    iG = v0.i(getContext());
                    iF = v0.h(getContext());
                    if (com.mbridge.msdk.foundation.tools.f.a(getContext())) {
                        int iC = v0.c(getContext());
                        if (i10 == 2) {
                            iG += iC;
                        } else {
                            iF += iC;
                        }
                    }
                } else {
                    iG = v0.g(getContext());
                    iF = v0.f(getContext());
                }
                int iG2 = this.f38449s.getRewardTemplateMode().g();
                if (a(this.f38449s) == 1) {
                    iG2 = i10;
                }
                getJSNotifyProxy().a(i10, iG2, iG, iF);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(com.mbridge.msdk.foundation.same.a.f34902l, v0.d(getContext()));
                try {
                    if (this.f39392h != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", this.f39392h.c());
                        jSONObject2.put("amount", this.f39392h.a());
                        jSONObject2.put("id", this.f39393i);
                        jSONObject.put("userId", this.f39391g);
                        jSONObject.put("reward", jSONObject2);
                        jSONObject.put("playVideoMute", this.f39394j);
                        jSONObject.put("extra", this.J);
                    }
                } catch (JSONException e10) {
                    q0.a(f38429s0, e10.getMessage());
                } catch (Exception e11) {
                    q0.a(f38429s0, e11.getMessage());
                }
                String string = jSONObject.toString();
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000133", this.f38449s, eVar);
                getJSNotifyProxy().a(string);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.R, "oncutoutfetched", Base64.encodeToString(this.I.getBytes(), 0));
                getJSCommon().b(true);
                if (com.mbridge.msdk.util.b.a()) {
                    setChinaCallBackStatus(this.R);
                }
                loadModuleDatas();
                this.T.postDelayed(this.W, 2000L);
            }
        } catch (Exception e12) {
            if (MBridgeConstans.DEBUG) {
                e12.printStackTrace();
            }
        }
    }

    private int getBufferTimeout() {
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            if (aVarC != null) {
                return (int) aVarC.i();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return 5;
    }

    public int findID(String str) {
        return i0.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getContext(), str, "layout");
    }

    public int getH5DialogRole() {
        if (getJSCommon() != null) {
            return getJSCommon().d();
        }
        return 1;
    }

    public void init(Context context) {
        this.O = LayoutInflater.from(context);
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate() {
        k();
        try {
            A();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        this.f38441l0 = false;
        try {
            if (this.f39400p) {
                CampaignEx campaignEx = this.f38449s;
                if (campaignEx != null && campaignEx.isDynamicView()) {
                    this.f38451u = new com.mbridge.msdk.video.bt.module.orglistener.d(getContext(), this.f39395k, this.f39390f, this.f38449s, this.f38451u, getInnerPlacementId(), this.f39388d);
                } else {
                    this.f38451u = new com.mbridge.msdk.video.bt.module.orglistener.c(this.f38452v, this.f38455y);
                }
            } else {
                this.f38451u = new com.mbridge.msdk.video.bt.module.orglistener.d(getContext(), this.f39395k, this.f39390f, this.f38449s, this.f38451u, getInnerPlacementId(), this.f39388d);
            }
            registerErrorListener(new com.mbridge.msdk.video.bt.module.orglistener.e(this.M, this.f38451u));
            a(this.f39390f, this.f38449s);
            setShowingTransparent();
            int layoutID = getLayoutID();
            if (!i0.a(layoutID)) {
                b("layoutID not found");
                return;
            }
            View viewInflate = this.O.inflate(layoutID, (ViewGroup) null);
            this.f38447r = viewInflate;
            addView(viewInflate, getContentLayoutParams());
            x();
            if (!n()) {
                this.Q.onError("not found View IDS");
                Activity activity = this.f39387c;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            this.P = true;
            p();
        } catch (Throwable th2) {
            th2.printStackTrace();
            b("onCreate error" + th2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onPause() {
        super.onPause();
        this.f38434e0 = true;
        try {
            getJSVideoModule().videoOperate(2);
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnPause();
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityPause();
            }
        } catch (Throwable th2) {
            q0.b(f38429s0, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onResume() {
        Activity activity;
        super.onResume();
        t();
        try {
            if (this.mbridgeVideoView != null && !o() && !this.mbridgeVideoView.isMiniCardShowing() && !com.mbridge.msdk.foundation.feedback.b.f34851f) {
                this.mbridgeVideoView.setCover(false);
            }
            MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
            if (mBridgeVideoView != null) {
                mBridgeVideoView.onActivityResume();
            }
            MBridgeContainerView mBridgeContainerView = this.S;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setOnResume();
            }
            if (this.f38434e0 && !o() && !com.mbridge.msdk.foundation.feedback.b.f34851f) {
                getJSVideoModule().videoOperate(1);
            }
            Activity activity2 = this.f39387c;
            if (activity2 != null) {
                v0.a(activity2.getWindow().getDecorView());
            }
            if (this.f38436g0 && this.f38437h0 && (activity = this.f39387c) != null) {
                activity.finish();
            }
        } catch (Throwable th2) {
            q0.b(f38429s0, th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void onStop() {
        super.onStop();
        MBridgeVideoView mBridgeVideoView = this.mbridgeVideoView;
        if (mBridgeVideoView != null) {
            mBridgeVideoView.setCover(true);
            this.mbridgeVideoView.onActivityStop();
        }
    }

    public void setMatchParent() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
    }

    public void setShowingTransparent() {
        Activity activity;
        boolean isShowingTransparent = getIsShowingTransparent();
        this.f38436g0 = isShowingTransparent;
        if (!isShowingTransparent) {
            int iA = i0.a(getContext(), "mbridge_reward_theme", "style");
            if (i0.a(iA) && (activity = this.f39387c) != null) {
                activity.setTheme(iA);
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.container.AbstractJSContainer
    public void b(String str) {
        com.mbridge.msdk.video.bt.module.orglistener.h hVar = this.f38451u;
        if (hVar != null) {
            hVar.a(this.M, str);
        }
        super.b(str);
    }

    private int a(int i10, int i11) {
        List<CampaignEx> list;
        if (i10 < 0 || (list = this.K) == null || list.size() == 0 || i11 <= 1) {
            return i10;
        }
        int videoLength = 0;
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            if (this.K.get(i12) != null) {
                videoLength += this.K.get(i12).getVideoLength();
            }
        }
        if (i10 > videoLength) {
            return i10 - videoLength;
        }
        return 0;
    }

    private void b(int i10, String str) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.j("2000037");
            nVar.h("code=" + i10 + ",desc=" + str);
            CampaignEx campaignEx = this.f38449s;
            nVar.t((campaignEx == null || campaignEx.getRewardTemplateMode() == null) ? "" : this.f38449s.getRewardTemplateMode().j());
            nVar.u(this.f39388d);
            CampaignEx campaignEx2 = this.f38449s;
            nVar.b(campaignEx2 != null ? campaignEx2.getId() : "");
            CampaignEx campaignEx3 = this.f38449s;
            if (campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getRequestId())) {
                nVar.n(this.f38449s.getRequestId());
            }
            CampaignEx campaignEx4 = this.f38449s;
            if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getRequestIdNotice())) {
                nVar.o(this.f38449s.getRequestIdNotice());
            }
            int iS = m0.s(getContext());
            nVar.c(iS);
            nVar.l(m0.a(getContext(), iS));
            com.mbridge.msdk.foundation.same.report.o.i(nVar);
        } catch (Throwable th2) {
            q0.b(f38429s0, th2.getMessage(), th2);
        }
    }

    public MBTempContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38454x = 1;
        this.f38455y = "";
        this.A = com.mbridge.msdk.foundation.same.a.F;
        this.C = false;
        this.I = "";
        this.K = new ArrayList();
        this.L = 0;
        this.N = false;
        this.P = false;
        this.Q = new k.a();
        this.T = new Handler();
        this.U = 0;
        this.V = 0;
        this.W = new b();
        this.f38430a0 = new c();
        this.f38432c0 = false;
        this.f38433d0 = false;
        this.f38434e0 = false;
        this.f38436g0 = false;
        this.f38437h0 = false;
        this.f38438i0 = false;
        this.f38439j0 = false;
        this.f38440k0 = false;
        this.f38441l0 = false;
        this.f38443n0 = null;
        this.f38444o0 = null;
        this.f38445p0 = null;
        this.f38446q0 = new f();
        this.f38448r0 = false;
        init(context);
    }
}
