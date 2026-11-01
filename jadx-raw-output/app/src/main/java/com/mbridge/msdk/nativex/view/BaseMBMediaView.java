package com.mbridge.msdk.nativex.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.multidex.MultiDexExtractor;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.PlayerState;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.G5;
import com.ironsource.InterfaceC3382ae;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.video.signal.communication.IRewardCommunication;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.mbridge.msdk.widget.MBAdChoice;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.mediation.LevelPlayAdError;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseMBMediaView extends LinearLayout implements VideoPlayerStatusListener, IRewardCommunication {
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_1_LANDING_PAGE = 1;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_2_NORMAL_FULLSCREEN = 2;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_3_NORMAL_FULLSCREEN_ENDCARD = 3;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_4_NORMAL_FULLSCREEN_LP = 4;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_6_SMALLVIDEO = 6;
    public static final String TAG = "BaseMBMediaView";
    public static final int WHAT_VIEW_FULL_SCREEN = 2;
    public static final int WHAT_VIEW_SMALL_SCREEN = 1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static int f36155n0 = 2;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static int f36156o0 = 1;
    private WindVaneWebViewForNV A;
    private MyImageView B;
    private ProgressBar C;
    private View D;
    private BaseView E;
    private RelativeLayout F;
    private RelativeLayout G;
    private TextView H;
    private ProgressBar I;
    private RelativeLayout J;
    private int K;
    private Handler L;
    private CampaignEx M;
    private int N;
    private int O;
    private double P;
    private double Q;
    private int R;
    private int S;
    private w T;
    private SensorManager U;
    private Sensor V;
    private com.mbridge.msdk.videocommon.download.a W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36157a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private s f36158a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36159b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private OnMBMediaViewListener f36160b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36161c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private OnMBMediaViewListenerPlus f36162c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36163d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f36164d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36165e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f36166e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36167f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f36168f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36169g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private RelativeLayout f36170g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f36171h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private ImageView f36172h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f36173i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f36174i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f36175j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f36176j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f36177k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Context f36178k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f36179l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f36180l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList<String> f36181m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private Runnable f36182m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<String> f36183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f36185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdSession f36186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AdEvents f36187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private MediaEvents f36188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f36189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36190u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MediaViewPlayerView f36191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RelativeLayout f36192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private RelativeLayout f36193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private RelativeLayout f36194y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private WindVaneWebViewForNV f36195z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.l();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.g();
        }
    }

    public class c extends com.mbridge.msdk.widget.a {
        public c() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            try {
                BaseMBMediaView.this.a(view.getContext());
                if (BaseMBMediaView.this.f36188s != null) {
                    try {
                        BaseMBMediaView.this.f36188s.adUserInteraction(InteractionType.CLICK);
                        q0.a("omsdk", "bmnv adUserInteraction click");
                    } catch (Exception e10) {
                        q0.b("omsdk", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                q0.b(BaseMBMediaView.TAG, e11.getMessage());
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseMBMediaView.this.f36185p = true;
            if (BaseMBMediaView.this.f36171h) {
                TextView unused = BaseMBMediaView.this.H;
            }
        }
    }

    public class e extends com.mbridge.msdk.nativex.listener.b {
        public e() {
        }

        @Override // com.mbridge.msdk.nativex.listener.b
        public void a() {
            BaseMBMediaView.this.exitFullScreen();
        }
    }

    public class f extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public f() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            BaseMBMediaView.this.f36166e0 = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            BaseMBMediaView.this.f36166e0 = false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.E, BaseMBMediaView.this.f36173i);
                if (BaseMBMediaView.this.f36174i0 == 0) {
                    BaseMBMediaView.this.O();
                } else {
                    BaseMBMediaView.this.P();
                }
                BaseMBMediaView.this.u();
                BaseMBMediaView.this.o();
                BaseMBMediaView.this.x();
                if (BaseMBMediaView.this.A != null) {
                    BaseMBMediaView.this.A.orientation(BaseMBMediaView.this.f36173i);
                }
            } catch (Exception e10) {
                q0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!BaseMBMediaView.this.f36171h) {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    if (baseMBMediaView.a((View) baseMBMediaView)) {
                        BaseMBMediaView.this.a0();
                    } else {
                        BaseMBMediaView.this.A();
                    }
                }
                BaseMBMediaView.this.L.postDelayed(this, 300L);
            } catch (Exception e10) {
                q0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }
    }

    public class j extends Handler {
        public j() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (message != null) {
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        BaseMBMediaView.this.S();
                    } else if (i10 == 3 && (obj = message.obj) != null && (obj instanceof View)) {
                        if (BaseMBMediaView.this.a((View) obj)) {
                            BaseMBMediaView.this.E();
                        }
                    }
                } catch (Exception e10) {
                    q0.b(BaseMBMediaView.TAG, e10.getMessage());
                }
            }
        }
    }

    public class k extends com.mbridge.msdk.widget.a {
        public k() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            try {
                if (!BaseMBMediaView.this.f36171h) {
                    BaseMBMediaView.this.L();
                }
                BaseMBMediaView.this.f36191v.showSoundIndicator(true);
                BaseMBMediaView.this.f36191v.showProgressView(true);
                if (BaseMBMediaView.this.f36163d && !BaseMBMediaView.this.f36171h && (BaseMBMediaView.this.D == null || BaseMBMediaView.this.D.getParent() == null)) {
                    if (!BaseMBMediaView.this.f36191v.halfLoadingViewisVisible() && BaseMBMediaView.this.f36191v.isPlaying()) {
                        BaseMBMediaView.this.a();
                        return;
                    }
                    q0.c(BaseMBMediaView.TAG, "is loading or no playing return;");
                    return;
                }
                if (BaseMBMediaView.this.f36171h) {
                    q0.c(BaseMBMediaView.TAG, "fullScreenShowUI");
                    BaseMBMediaView.this.l();
                    return;
                }
                if (BaseMBMediaView.this.f36178k0 != null) {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    baseMBMediaView.a(baseMBMediaView.f36178k0);
                } else {
                    BaseMBMediaView.this.a(view.getContext());
                }
                if (BaseMBMediaView.this.f36188s != null) {
                    try {
                        BaseMBMediaView.this.f36188s.adUserInteraction(InteractionType.CLICK);
                        q0.a("omsdk", "mnv adUserInteraction click");
                    } catch (Exception e10) {
                        q0.b("omsdk", e10.getMessage());
                    }
                }
            } catch (Throwable th2) {
                q0.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
            }
        }
    }

    public class l implements com.mbridge.msdk.foundation.same.image.c {

        public class a extends com.mbridge.msdk.widget.a {
            public a() {
            }

            @Override // com.mbridge.msdk.widget.a
            public void a(View view) {
                if (BaseMBMediaView.this.f36178k0 == null) {
                    BaseMBMediaView.this.a(view.getContext());
                } else {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    baseMBMediaView.a(baseMBMediaView.f36178k0);
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        public l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (BaseMBMediaView.this.B == null || BaseMBMediaView.this.f36158a0 != s.BIG_IMAGE) {
                return;
            }
            if (bitmap != null) {
                BaseMBMediaView.this.R = bitmap.getWidth();
                BaseMBMediaView.this.S = bitmap.getHeight();
                BaseMBMediaView.this.B.setImageUrl(str);
                BaseMBMediaView.this.B.setImageBitmap(bitmap);
            }
            b1.a(BaseMBMediaView.this.B, BaseMBMediaView.this.M.getLocalRequestId(), BaseMBMediaView.this.M.getLocalAllowTrackClick());
            BaseMBMediaView.this.B.setOnClickListener(new a());
        }
    }

    public class m extends com.mbridge.msdk.widget.a {
        public m() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (BaseMBMediaView.this.f36178k0 != null) {
                BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                baseMBMediaView.a(baseMBMediaView.f36178k0);
            } else {
                BaseMBMediaView.this.a(view.getContext());
            }
            q0.c(BaseMBMediaView.TAG, "CLICK WEBVIEW LAYOUT ");
        }
    }

    public class n implements NativeListener.NativeTrackingListener {
        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return true;
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }

        public n() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.n();
                BaseMBMediaView.this.m();
                BaseMBMediaView.this.a(campaign, str);
            } catch (Exception e10) {
                q0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.n();
                BaseMBMediaView.this.m();
                BaseMBMediaView.this.b(campaign, str);
            } catch (Exception e10) {
                q0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.Y();
                BaseMBMediaView.this.W();
                BaseMBMediaView.this.c(campaign, str);
            } catch (Exception e10) {
                q0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f36211a;

        public o(String str) {
            this.f36211a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BaseMBMediaView.this.I();
                BaseMBMediaView.this.c(this.f36211a);
                v0.a(BaseMBMediaView.this.M.getCampaignUnitId(), BaseMBMediaView.this.M, com.mbridge.msdk.foundation.same.a.f34914x);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(BaseMBMediaView.TAG, e10.getMessage());
                }
            }
        }
    }

    public class p extends MediaViewPlayerView.h {
        public p(MediaViewPlayerView mediaViewPlayerView) {
            super(mediaViewPlayerView);
        }

        @Override // com.mbridge.msdk.nativex.view.MediaViewPlayerView.h
        public void a() {
            int nvT2 = BaseMBMediaView.this.M.getNvT2();
            if (!BaseMBMediaView.this.f36171h || (nvT2 != 3 && nvT2 != 4)) {
                super.a();
                return;
            }
            WindVaneWebViewForNV endCardWebview = BaseMBMediaView.this.getEndCardWebview();
            if (endCardWebview == null) {
                super.a();
                return;
            }
            View viewQ = BaseMBMediaView.this.q();
            if (viewQ == null) {
                super.a();
                return;
            }
            if (nvT2 == 3 && BaseMBMediaView.this.f36166e0) {
                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(viewQ, BaseMBMediaView.this.E);
                com.mbridge.msdk.mbnative.report.a.a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.M, BaseMBMediaView.this.M.getCampaignUnitId());
            } else {
                if (nvT2 != 4) {
                    super.a();
                    return;
                }
                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(viewQ, BaseMBMediaView.this.E);
                String clickURL = BaseMBMediaView.this.M.getClickURL();
                if (!TextUtils.isEmpty(clickURL)) {
                    com.mbridge.msdk.click.a.a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.M, BaseMBMediaView.this.getUnitId(), BaseMBMediaView.this.getAddNVT2ToNoticeURL(), true, false, com.mbridge.msdk.click.retry.a.f32918o);
                    MintegralNetworkBridge.webviewLoadUrl(BaseMBMediaView.this.A, clickURL);
                }
            }
            endCardWebview.webViewShow(BaseMBMediaView.this.M, BaseMBMediaView.this.getUnitId());
            endCardWebview.orientation(BaseMBMediaView.this.f36173i);
        }
    }

    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.exitFullScreen();
        }
    }

    public class r implements View.OnKeyListener {
        public r() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            try {
                if (keyEvent.getKeyCode() == 4) {
                    BaseMBMediaView.this.g();
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                q0.b(BaseMBMediaView.TAG, th2.getMessage());
                return false;
            }
        }
    }

    public enum s {
        BIG_IMAGE,
        VIDEO,
        GIF
    }

    public static final class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<BaseMBMediaView> f36220a;

        @Override // java.lang.Runnable
        public void run() {
            BaseMBMediaView baseMBMediaView = this.f36220a.get();
            if (baseMBMediaView != null) {
                try {
                    if (baseMBMediaView.f36158a0 == null || baseMBMediaView.f36158a0 != s.BIG_IMAGE) {
                        return;
                    }
                    baseMBMediaView.U();
                    baseMBMediaView.f36158a0 = s.VIDEO;
                    baseMBMediaView.changeNoticeURL();
                } catch (Throwable th2) {
                    q0.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
                }
            }
        }

        public t(BaseMBMediaView baseMBMediaView) {
            this.f36220a = new WeakReference<>(baseMBMediaView);
        }
    }

    public static final class u implements com.mbridge.msdk.nativex.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<BaseMBMediaView> f36221a;

        @Override // com.mbridge.msdk.nativex.listener.a
        public void a() {
            BaseMBMediaView baseMBMediaView = this.f36221a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.K();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void b() {
            BaseMBMediaView baseMBMediaView = this.f36221a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.G();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void c() {
            BaseMBMediaView baseMBMediaView = this.f36221a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.H();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void d() {
            BaseMBMediaView baseMBMediaView = this.f36221a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.J();
            }
        }

        public u(BaseMBMediaView baseMBMediaView) {
            this.f36221a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void a(String str) {
            BaseMBMediaView baseMBMediaView = this.f36221a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.a(str);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void b(String str) {
            BaseMBMediaView baseMBMediaView = this.f36221a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.b(str);
            }
        }
    }

    public class w implements SensorEventListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.E, BaseMBMediaView.this.f36173i);
                    BaseMBMediaView.this.O();
                    BaseMBMediaView.this.u();
                    BaseMBMediaView.this.o();
                    BaseMBMediaView.this.x();
                    if (BaseMBMediaView.this.A != null) {
                        BaseMBMediaView.this.A.orientation(BaseMBMediaView.this.f36173i);
                    }
                } catch (Exception e10) {
                    q0.b(BaseMBMediaView.TAG, e10.getMessage());
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.E, BaseMBMediaView.this.f36173i);
                    BaseMBMediaView.this.P();
                    BaseMBMediaView.this.u();
                    BaseMBMediaView.this.o();
                    BaseMBMediaView.this.x();
                    if (BaseMBMediaView.this.A != null) {
                        BaseMBMediaView.this.A.orientation(BaseMBMediaView.this.f36173i);
                    }
                } catch (Exception e10) {
                    q0.b(BaseMBMediaView.TAG, e10.getMessage());
                }
            }
        }

        private w() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public /* synthetic */ w(BaseMBMediaView baseMBMediaView, j jVar) {
            this();
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int iRound;
            if (BaseMBMediaView.this.f36176j0) {
                return;
            }
            try {
                float[] fArr = sensorEvent.values;
                float f10 = -fArr[0];
                float f11 = -fArr[1];
                float f12 = -fArr[2];
                if (((f10 * f10) + (f11 * f11)) * 4.0f >= f12 * f12) {
                    iRound = 90 - Math.round(((float) Math.atan2(-f11, f10)) * 57.29578f);
                    while (iRound >= 360) {
                        iRound -= 360;
                    }
                    while (iRound < 0) {
                        iRound += 360;
                    }
                } else {
                    iRound = -1;
                }
                float allScreenWidth = BaseMBMediaView.this.getAllScreenWidth();
                int iH = v0.h(BaseMBMediaView.this.getContext());
                if ((iRound > 45 && iRound < 135) || (iRound > 225 && iRound < 315)) {
                    if (allScreenWidth < iH || BaseMBMediaView.this.f36175j) {
                        return;
                    }
                    BaseMBMediaView.this.f36173i = true;
                    BaseMBMediaView.this.f36175j = true;
                    BaseMBMediaView.this.L.postDelayed(new a(), 200L);
                    return;
                }
                if (((iRound <= 135 || iRound >= 225) && ((iRound <= 315 || iRound >= 360) && ((iRound < 0 || iRound > 45) && iRound != -1))) || allScreenWidth > iH || !BaseMBMediaView.this.f36175j) {
                    return;
                }
                BaseMBMediaView.this.f36173i = false;
                BaseMBMediaView.this.f36175j = false;
                BaseMBMediaView.this.L.postDelayed(new b(), 200L);
            } catch (Throwable th2) {
                q0.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
            }
        }
    }

    public static final class x implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<BaseMBMediaView> f36225a;

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            BaseMBMediaView baseMBMediaView = this.f36225a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.L.post(new t(baseMBMediaView));
            }
        }

        public x(BaseMBMediaView baseMBMediaView) {
            this.f36225a = new WeakReference<>(baseMBMediaView);
        }
    }

    public static final class y extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<BaseMBMediaView> f36226a;

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44969o, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/nativex/view/BaseMBMediaView$y;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
            CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44969o, webView, str);
            safedk_BaseMBMediaView$y_onPageFinished_2eb2e230506fece246ae55e6d8afe926(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44969o, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44969o, view, url, super.shouldInterceptRequest(view, url));
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            q0.b(BaseMBMediaView.TAG, "WebView called onRenderProcessGone");
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    q0.b(BaseMBMediaView.TAG, th2.getMessage());
                }
            }
            return true;
        }

        public y(BaseMBMediaView baseMBMediaView) {
            this.f36226a = new WeakReference<>(baseMBMediaView);
        }

        public void safedk_BaseMBMediaView$y_onPageFinished_2eb2e230506fece246ae55e6d8afe926(WebView p10, String p11) {
            super.onPageFinished(p10, p11);
            try {
                BaseMBMediaView baseMBMediaView = this.f36226a.get();
                if (baseMBMediaView != null && baseMBMediaView.f36158a0 != null && baseMBMediaView.f36158a0 == s.BIG_IMAGE) {
                    baseMBMediaView.R();
                    baseMBMediaView.f36158a0 = s.GIF;
                    baseMBMediaView.changeNoticeURL();
                }
            } catch (Exception e10) {
                q0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }
    }

    public BaseMBMediaView(Context context) {
        super(context);
        this.f36157a = true;
        this.f36159b = true;
        this.f36161c = true;
        this.f36163d = true;
        this.f36165e = true;
        this.f36167f = false;
        this.f36169g = true;
        this.f36171h = false;
        this.f36173i = false;
        this.f36175j = false;
        this.f36177k = true;
        this.f36179l = true;
        this.f36181m = new ArrayList<>();
        this.f36183n = new ArrayList<>();
        this.f36184o = false;
        this.f36185p = false;
        this.f36186q = null;
        this.f36187r = null;
        this.f36188s = null;
        this.f36189t = 0;
        this.f36190u = false;
        this.W = null;
        this.f36158a0 = null;
        this.f36166e0 = false;
        this.f36168f0 = false;
        this.f36176j0 = false;
        this.f36180l0 = false;
        this.f36182m0 = new h();
        b(context);
    }

    private String getPlayUrl() {
        try {
            if (this.M == null) {
                return null;
            }
            com.mbridge.msdk.videocommon.download.a aVar = this.W;
            if (aVar != null && aVar.o() == 5) {
                String strP = this.W.p();
                if (new File(strP).exists() && (this.W.v() || this.W.j() == v0.a(new File(strP)))) {
                    return strP;
                }
            }
            String videoUrlEncode = this.M.getVideoUrlEncode();
            if (a1.b(videoUrlEncode)) {
                return videoUrlEncode;
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
        return null;
    }

    private com.mbridge.msdk.setting.l getUnitSetting() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx != null && !a1.a(campaignEx.getCampaignUnitId())) {
                String campaignUnitId = this.M.getCampaignUnitId();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                if (!a1.a(campaignUnitId) && !a1.a(strB)) {
                    com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(strB, campaignUnitId);
                    return lVarE != null ? lVarE : com.mbridge.msdk.setting.l.i(campaignUnitId);
                }
                return com.mbridge.msdk.setting.l.i(campaignUnitId);
            }
            return null;
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
            return null;
        }
    }

    public boolean canShowVideo() {
        return a(false) == s.VIDEO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.f36160b0 = onMBMediaViewListener;
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
    }

    public static /* synthetic */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36204a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            f36204a = iArr;
            try {
                iArr[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36204a[BaseView.a.FULL_TOP_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class v implements com.mbridge.msdk.mbsignalcommon.base.a {
        private v() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.base.a
        public boolean a(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (u0.a.b(str)) {
                        u0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    }
                    if (URLUtil.isNetworkUrl(str)) {
                        return false;
                    }
                    u0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, (BaseTrackingListener) null);
                    return true;
                }
            } catch (Exception e10) {
                q0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
            return false;
        }

        public /* synthetic */ v(j jVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f36191v;
            if (mediaViewPlayerView != null && mediaViewPlayerView.hasPrepare() && this.f36191v.isPlaying()) {
                z();
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void B() {
        try {
            SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
            this.U = sensorManager;
            this.V = sensorManager.getDefaultSensor(1);
            w wVar = new w(this, null);
            this.T = wVar;
            this.U.registerListener(wVar, this.V, 2);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void C() {
        Handler handler = this.L;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void D() {
        if (this.M.isReportClick()) {
            return;
        }
        this.M.setReportClick(true);
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().i() == null) {
            return;
        }
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().i(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null) {
            return;
        }
        com.mbridge.msdk.foundation.controller.c.n().a(getContext());
        com.mbridge.msdk.mbnative.report.b.a(this.M, getContext(), getUnitId(), (com.mbridge.msdk.mbnative.listener.a) null);
        CampaignEx.b mediaViewHolder = this.M.getMediaViewHolder();
        if (!mediaViewHolder.f34706l && this.f36158a0 == s.VIDEO && a1.b(this.M.getImpressionURL())) {
            mediaViewHolder.f34706l = true;
            String impressionURL = this.M.getImpressionURL();
            if (!impressionURL.contains("is_video=1")) {
                StringBuilder sb2 = new StringBuilder(impressionURL);
                if (impressionURL.contains("?")) {
                    sb2.append("&is_video=1");
                } else {
                    sb2.append("?is_video=1");
                }
                impressionURL = sb2.toString();
            }
            Context context = getContext();
            CampaignEx campaignEx2 = this.M;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), impressionURL, false, true, com.mbridge.msdk.click.retry.a.f32916m);
        }
    }

    private void F() {
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || this.M.getMediaViewHolder().f34699e || TextUtils.isEmpty(this.M.getCampaignUnitId()) || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().h() == null) {
            return;
        }
        this.M.getMediaViewHolder().f34699e = true;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f34700f || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().r() == null) {
            return;
        }
        mediaViewHolder.f34700f = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().r(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f34701g || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().s() == null) {
            return;
        }
        mediaViewHolder.f34701g = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().s(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || this.M.getMediaViewHolder().f34698d || TextUtils.isEmpty(this.M.getCampaignUnitId()) || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().n() == null) {
            return;
        }
        this.M.getMediaViewHolder().f34698d = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().n(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f34703i || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().u() == null) {
            return;
        }
        mediaViewHolder.f34703i = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().u(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f34704j || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().x() == null) {
            return;
        }
        mediaViewHolder.f34704j = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().x(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f34705k || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().y() == null) {
            return;
        }
        mediaViewHolder.f34705k = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().y(), false, false);
    }

    private void M() {
        this.f36165e = true;
        this.f36169g = true;
        this.f36171h = false;
        this.f36173i = false;
        this.f36175j = false;
        this.f36185p = false;
    }

    private void N() {
        AdSession adSession;
        try {
            this.f36158a0 = a(true);
            changeNoticeURL();
            s sVar = this.f36158a0;
            if (sVar == s.BIG_IMAGE) {
                CampaignEx campaignEx = this.M;
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) && (adSession = this.f36186q) != null) {
                    try {
                        adSession.registerAdView(this.B);
                        this.f36187r = AdEvents.createAdEvents(this.f36186q);
                        this.f36186q.start();
                        AdEvents adEvents = this.f36187r;
                        if (adEvents != null) {
                            adEvents.impressionOccurred();
                        }
                    } catch (Exception e10) {
                        q0.a("omsdk", e10.getMessage());
                    }
                }
                V();
                i();
            } else if (sVar == s.VIDEO) {
                U();
            } else if (sVar == s.GIF) {
                j();
                R();
            }
            this.f36184o = true;
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        try {
            if (this.G == null && this.f36172h0 == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            if (this.f36164d0 == 0 && com.mbridge.msdk.foundation.tools.f.a(getContext())) {
                layoutParams.rightMargin = v0.c(getContext()) + v0.a(getContext(), 8.0f);
            } else {
                layoutParams.rightMargin = v0.a(getContext(), 8.0f);
            }
            layoutParams.topMargin = v0.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.G;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.f36172h0;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(true);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        try {
            if (this.G == null && this.f36172h0 == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = v0.a(getContext(), 8.0f);
            layoutParams.rightMargin = v0.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.G;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.f36172h0;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(false);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void Q() {
        try {
            this.D.setFocusableInTouchMode(true);
            this.D.requestFocus();
            this.D.setOnKeyListener(new r());
            this.D.setOnClickListener(new a());
            this.G.setOnClickListener(new b());
            CampaignEx campaignEx = this.M;
            if (campaignEx != null) {
                b1.a(this.H, campaignEx.getLocalRequestId(), this.M.getLocalAllowTrackClick());
            }
            this.H.setOnClickListener(new c());
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        try {
            if (getVisibility() != 0) {
                return;
            }
            CampaignEx campaignEx = this.M;
            if (com.mbridge.msdk.foundation.tools.h.b(campaignEx, this.f36178k0, this, campaignEx.getImpReportType())) {
                com.mbridge.msdk.setting.l unitSetting = getUnitSetting();
                int i10 = 0;
                int iS = unitSetting != null ? unitSetting.s() : 0;
                CampaignEx campaignEx2 = this.M;
                if (campaignEx2 == null || campaignEx2.getImpReportType() != 1) {
                    i10 = iS;
                }
                Message messageObtainMessage = this.L.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.obj = this;
                this.L.sendMessageDelayed(messageObtainMessage, (i10 == 0 ? 0L : ((long) i10) * 1000) + 300);
            }
            if (this.f36158a0 == s.VIDEO) {
                MediaViewPlayerView mediaViewPlayerView = this.f36191v;
                if (mediaViewPlayerView == null) {
                    b();
                    return;
                }
                if (this.M != mediaViewPlayerView.getCampaign()) {
                    this.f36191v.release();
                    b();
                    if (getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                    requestLayout();
                }
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void T() {
        try {
            if (this.f36191v == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 42);
            if (TextUtils.isEmpty(this.M.getBidToken())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            b1.a(this.f36191v, this.M.getLocalRequestId(), this.M.getLocalAllowTrackClick());
            this.f36191v.setOnClickListener(new k());
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void V() {
        try {
            v0.a((ImageView) this.B);
            this.B.setVisibility(0);
            this.f36192w.setVisibility(8);
            this.f36194y.setVisibility(8);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        try {
            ProgressBar progressBar = this.I;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void X() {
        try {
            this.f36192w.setVisibility(8);
            this.B.setVisibility(8);
            this.f36194y.setVisibility(0);
            this.f36195z.setVisibility(0);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        try {
            ProgressBar progressBar = this.C;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void Z() {
        try {
            this.f36192w.setVisibility(0);
            this.B.setVisibility(8);
            this.f36194y.setVisibility(8);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f36191v;
            if (mediaViewPlayerView == null || !mediaViewPlayerView.hasPrepare() || this.f36191v.isPlaying() || this.f36191v.isComplete() || !this.f36191v.hasPrepare()) {
                return;
            }
            this.f36191v.startOrPlayVideo();
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void b0() {
        w wVar;
        try {
            SensorManager sensorManager = this.U;
            if (sensorManager == null || (wVar = this.T) == null) {
                return;
            }
            sensorManager.unregisterListener(wVar);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void c0() {
        com.mbridge.msdk.videocommon.download.a aVar = this.W;
        if (aVar != null) {
            aVar.b((com.mbridge.msdk.videocommon.listener.a) null);
        }
    }

    private void e() {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f36160b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoAdClicked(this.M);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f36162c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoAdClicked(this.M);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void f() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || campaignEx.getNativeVideoTracking() == null) {
                return;
            }
            String[] strArrH = this.M.getNativeVideoTracking().h();
            int i10 = this.f36173i ? f36155n0 : f36156o0;
            for (String str : strArrH) {
                if (!TextUtils.isEmpty(str)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.M;
                    com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), str + "&orienation=" + i10, false, false);
                }
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
            FrameLayout frameLayout2 = (FrameLayout) getRootView().findViewById(100);
            RelativeLayout relativeLayout = (RelativeLayout) getRootView().findViewById(101);
            RelativeLayout relativeLayout2 = (RelativeLayout) getRootView().findViewById(103);
            if (relativeLayout2 == null && relativeLayout != null) {
                relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(103);
            }
            RelativeLayout relativeLayout3 = (RelativeLayout) getRootView().findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            if (relativeLayout3 == null && relativeLayout2 != null) {
                relativeLayout3 = (RelativeLayout) relativeLayout2.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) getRootView().findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            if (relativeLayout4 == null && relativeLayout3 != null) {
                relativeLayout4 = (RelativeLayout) relativeLayout3.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            }
            ProgressBar progressBar = (ProgressBar) getRootView().findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            RelativeLayout relativeLayout5 = (RelativeLayout) getRootView().findViewById(i0.a(getContext(), "mbridge_full_rl_install", "id"));
            LinearLayout linearLayout = (LinearLayout) getRootView().findViewById(i0.a(getContext(), "mbridge_full_ll_pro_dur", "id"));
            ViewGroup viewGroup = frameLayout2 != null ? (ViewGroup) frameLayout2.getParent() : null;
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(linearLayout);
            } else if (linearLayout != null && linearLayout.getParent() != null) {
                ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            }
            RelativeLayout relativeLayout6 = this.f36170g0;
            if (relativeLayout6 != null) {
                if (relativeLayout2 != null) {
                    relativeLayout2.removeView(relativeLayout6);
                } else if (relativeLayout6.getParent() != null) {
                    ((ViewGroup) this.f36170g0.getParent()).removeView(this.f36170g0);
                }
                this.A.setBackListener(null);
                this.A.setObject(null);
                this.A = null;
                this.f36170g0 = null;
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout5);
            } else if (relativeLayout5 != null && relativeLayout5.getParent() != null) {
                ((ViewGroup) relativeLayout5.getParent()).removeView(relativeLayout5);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(progressBar);
            } else if (progressBar != null && progressBar.getParent() != null) {
                ((ViewGroup) progressBar.getParent()).removeView(progressBar);
            }
            if (relativeLayout4 != null) {
                relativeLayout4.removeView(this.f36191v);
            }
            if (relativeLayout3 != null) {
                relativeLayout3.removeView(relativeLayout4);
            } else if (relativeLayout4 != null && relativeLayout4.getParent() != null) {
                ((ViewGroup) relativeLayout4.getParent()).removeView(relativeLayout4);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout3);
            } else if (relativeLayout3 == null || relativeLayout3.getParent() == null) {
                BaseView baseView = this.E;
                if (baseView != null) {
                    baseView.removeView(this.F);
                }
            } else {
                ((ViewGroup) relativeLayout3.getParent()).removeView(relativeLayout3);
            }
            if (relativeLayout != null) {
                relativeLayout.removeView(relativeLayout2);
            } else if (relativeLayout2 == null || relativeLayout2.getParent() == null) {
                View view = this.D;
                if (view != null) {
                    ((ViewGroup) view).removeView(this.E);
                    ((ViewGroup) this.D.getParent()).removeView(this.D);
                }
            } else {
                ((ViewGroup) relativeLayout2.getParent()).removeView(relativeLayout2);
            }
            if (frameLayout != null) {
                if (relativeLayout != null) {
                    frameLayout.removeView(relativeLayout);
                } else {
                    frameLayout.removeView(this.D);
                    if (this.D.getParent() != null) {
                        ((ViewGroup) this.D.getParent()).removeView(this.D);
                        this.D.setVisibility(8);
                    }
                }
            }
            setVisibility(0);
            requestLayout();
            if (viewGroup != null) {
                if (this.f36191v.getParent() != null && this.f36191v.getParent() != viewGroup) {
                    ((ViewGroup) this.f36191v.getParent()).removeView(this.f36191v);
                }
                viewGroup.addView(this.f36191v, this.K);
                viewGroup.removeView(frameLayout2);
                viewGroup.invalidate();
            }
            d();
            this.f36171h = false;
            MediaViewPlayerView mediaViewPlayerView = this.f36191v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.setExitFullScreen();
                if (this.f36167f) {
                    this.f36191v.openSound();
                } else {
                    this.f36191v.closeSound();
                }
                this.f36191v.gonePauseView();
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindVaneWebViewForNV getEndCardWebview() {
        try {
            WindVaneWebViewForNV windVaneWebViewForNV = this.A;
            if (windVaneWebViewForNV != null && this.f36168f0) {
                return windVaneWebViewForNV;
            }
            if (this.f36168f0) {
                return null;
            }
            b(true);
            return null;
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUnitId() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || !a1.b(campaignEx.getCampaignUnitId())) {
                return null;
            }
            return this.M.getCampaignUnitId();
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
            return null;
        }
    }

    private void h() {
        try {
            e();
            if (this.M != null && !a1.a(getUnitId())) {
                D();
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), getUnitId());
                aVar.a(new n());
                aVar.a(this.M);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void i() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (a1.a(imageUrl) || getContext() == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(imageUrl, new l());
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void j() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null) {
                return;
            }
            String gifUrl = campaignEx.getGifUrl();
            if (a1.a(gifUrl) || getContext() == null) {
                return;
            }
            MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.f36195z, null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", gifUrl), "text/html", G5.N, null);
            this.f36195z.setInterceptTouch(true);
            CampaignEx campaignEx2 = this.M;
            if (campaignEx2 != null) {
                b1.a(this.f36194y, campaignEx2.getLocalRequestId(), this.M.getLocalAllowTrackClick());
            }
            this.f36194y.setOnClickListener(new m());
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private boolean k() {
        try {
            this.F = this.E.getMBridgeFullPlayContainer();
            this.J = this.E.getMBridgeFullPlayerParent();
            this.G = this.E.getMBridgeFullClose();
            this.H = this.E.getMBridgeFullTvInstall();
            this.I = this.E.getMBridgeFullPb();
            return true;
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f36191v;
            if (mediaViewPlayerView == null) {
                return;
            }
            mediaViewPlayerView.onClickPlayerView();
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            ProgressBar progressBar = this.I;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            ProgressBar progressBar = this.C;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f36158a0 != s.BIG_IMAGE || (i10 = this.O) == 0 || (i11 = this.S) == 0 || (i12 = this.R) == 0) {
                return;
            }
            int i13 = (i10 * i11) / i12;
            MyImageView myImageView = this.B;
            if (myImageView == null || i13 == 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) myImageView.getLayoutParams();
            layoutParams.width = this.O;
            layoutParams.height = i13;
            this.B.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void p() {
        try {
            this.f36173i = v0.i(getContext()) >= v0.h(getContext());
            this.f36175j = this.f36173i;
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View q() {
        try {
            this.f36170g0 = new RelativeLayout(getContext());
            this.f36170g0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ImageView imageView = new ImageView(getContext());
            this.f36172h0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = v0.a(getContext(), 8.0f);
            layoutParams.rightMargin = v0.a(getContext(), 8.0f);
            this.f36172h0.setLayoutParams(layoutParams);
            this.f36172h0.setBackgroundResource(i0.a(getContext(), "mbridge_nativex_close", "drawable"));
            this.f36172h0.setOnClickListener(new q());
            this.A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f36170g0.addView(this.A);
            this.f36170g0.addView(this.f36172h0);
            return this.f36170g0;
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
            return null;
        }
    }

    private void r() {
        try {
            if (this.f36171h) {
                MediaViewPlayerView mediaViewPlayerView = this.f36191v;
                if (mediaViewPlayerView == null) {
                    q0.b(TAG, "fullscreen playerview is null return");
                } else if (!this.f36165e) {
                    mediaViewPlayerView.pause();
                } else if (mediaViewPlayerView.isPlaying()) {
                    q0.c(TAG, "fullscreen windowfocuse true isPlaying do nothing return");
                } else {
                    MediaViewPlayerView mediaViewPlayerView2 = this.f36191v;
                    if (mediaViewPlayerView2 != null && !mediaViewPlayerView2.isComplete() && !this.f36191v.getIsActiviePause()) {
                        this.f36191v.onClickPlayButton();
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void s() {
        try {
            p();
            a(this.F, getAllScreenWidth(), getAllScreenHeight());
            com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext()).a(this.E, this.f36173i);
            if (this.f36173i) {
                O();
            } else {
                P();
            }
            this.L.postDelayed(new d(), 3000L);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void setIsFrontDesk(boolean z10) {
        MediaViewPlayerView mediaViewPlayerView = this.f36191v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.setIsFrontDesk(z10);
        }
    }

    private void setPlayViewParamsDefault(View view) {
        if (view == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            if (this.f36173i) {
                layoutParams.height = -1;
            } else {
                layoutParams.height = (((int) getAllScreenWidth()) * 9) / 16;
                layoutParams.addRule(13);
            }
            view.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void t() {
        this.L = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        try {
            if (this.f36158a0 != s.VIDEO || this.f36192w == null) {
                return;
            }
            int allScreenWidth = (int) getAllScreenWidth();
            int iH = v0.h(getContext());
            if (this.f36171h) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.F.getLayoutParams();
                layoutParams.width = allScreenWidth;
                layoutParams.height = iH;
                layoutParams.addRule(13);
                this.F.setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f36192w.getLayoutParams();
                layoutParams2.width = this.O;
                layoutParams2.height = this.N;
                layoutParams2.addRule(13);
                this.f36192w.setLayoutParams(layoutParams2);
            }
            S();
            if (this.f36171h) {
                a(this.f36191v, allScreenWidth, iH);
            } else {
                a(this.f36191v, this.O, this.N);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void v() {
        String[] strArrSplit;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || a1.a(campaignEx.getVideoResolution()) || (strArrSplit = this.M.getVideoResolution().split(VastAttributes.HORIZONTAL_POSITION)) == null || strArrSplit.length != 2) {
                return;
            }
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            double dM = v0.m(str);
            double dM2 = v0.m(str2);
            if (dM <= 0.0d || dM2 <= 0.0d) {
                return;
            }
            this.P = dM;
            this.Q = dM2;
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void w() {
        int iA = i0.a(getContext(), "mbridge_nativex_mbmediaview", "layout");
        if (!i0.a(iA)) {
            q0.b(TAG, "can not find mediaview resource");
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(iA, (ViewGroup) null);
        this.f36193x = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_rl_mediaview_root", "id"));
        this.f36192w = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_ll_playerview_container", "id"));
        this.B = (MyImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_my_big_img", "id"));
        this.C = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_native_pb", "id"));
        this.f36194y = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_nativex_webview_layout", "id"));
        this.f36195z = (WindVaneWebViewForNV) viewInflate.findViewById(i0.a(getContext(), "mbridge_nativex_webview_layout_webview", "id"));
        this.f36193x.setClickable(true);
        addView(viewInflate, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        RelativeLayout relativeLayout;
        int i10;
        int i11;
        try {
            if (this.f36158a0 == s.GIF) {
                int i12 = this.O;
                if (i12 != 0 && (i10 = this.S) != 0 && (i11 = this.R) != 0) {
                    int i13 = (i12 * i10) / i11;
                    RelativeLayout relativeLayout2 = this.f36194y;
                    if (relativeLayout2 != null && i13 != 0) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
                        layoutParams.width = this.O;
                        layoutParams.height = i13;
                        layoutParams.addRule(13);
                        this.f36194y.setLayoutParams(layoutParams);
                    }
                } else if (i12 != 0 && (relativeLayout = this.f36194y) != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    int i14 = this.O;
                    layoutParams2.width = i14;
                    layoutParams2.height = (i14 * LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED) / InterfaceC3382ae.c.f28182d;
                    layoutParams2.addRule(13);
                    this.f36194y.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private boolean y() {
        try {
            com.mbridge.msdk.setting.l unitSetting = getUnitSetting();
            if (unitSetting == null) {
                return false;
            }
            int iL = unitSetting.L();
            if (iL == 1) {
                return v0.n(getContext());
            }
            if (iL == 2) {
                return false;
            }
            if (iL == 3) {
                return !s0.a().a("s_a_w_n_c", true) || v0.l(getContext());
            }
            return v0.n(getContext());
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void z() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f36191v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.pause();
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) {
        q0.a(TAG, "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String strOptString = new JSONObject(str).optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                if (TextUtils.isEmpty(strOptString)) {
                    com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "packageName is empty");
                }
                int i10 = v0.c(com.mbridge.msdk.foundation.controller.c.n().d(), strOptString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", com.mbridge.msdk.mbsignalcommon.communication.d.f36067b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, e10.getMessage());
                    q0.a(TAG, e10.getMessage());
                }
            } catch (Throwable th2) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + th2.getLocalizedMessage());
                q0.b(TAG, "cai", th2);
            }
        } catch (JSONException e11) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + e11.getLocalizedMessage());
            q0.b(TAG, "cai", e11);
        }
    }

    public void changeNoticeURL() {
        String str;
        CampaignEx campaignEx = this.M;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (noticeUrl.contains("is_video")) {
                s sVar = this.f36158a0;
                if (sVar == s.VIDEO) {
                    if (noticeUrl.contains("is_video=2")) {
                        noticeUrl = noticeUrl.replace("is_video=2", "is_video=1");
                    }
                } else if (sVar == s.BIG_IMAGE && noticeUrl.contains("is_video=1")) {
                    noticeUrl = noticeUrl.replace("is_video=1", "is_video=2");
                }
            } else {
                s sVar2 = this.f36158a0;
                if (sVar2 == s.VIDEO) {
                    str = "1";
                } else {
                    str = sVar2 == s.BIG_IMAGE ? "2" : "";
                }
                StringBuilder sb2 = new StringBuilder(noticeUrl);
                if (noticeUrl.contains("?")) {
                    sb2.append("&is_video=");
                    sb2.append(str);
                } else {
                    sb2.append("?is_video=");
                    sb2.append(str);
                }
                noticeUrl = sb2.toString();
            }
            this.M.setNoticeUrl(noticeUrl);
        }
    }

    public void destory() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f36191v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.release();
            }
            c0();
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    public String getAddNVT2ToNoticeURL() {
        CampaignEx campaignEx = this.M;
        if (campaignEx == null) {
            return null;
        }
        String noticeUrl = campaignEx.getNoticeUrl();
        if (TextUtils.isEmpty(noticeUrl) || noticeUrl.contains(CampaignEx.JSON_KEY_NV_T2)) {
            return noticeUrl;
        }
        return noticeUrl + "&nv_t2=" + this.M.getNvT2();
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.M);
            String strA = a(arrayList, getUnitId(), "MAL_17.0.31,3.0.1");
            String strEncodeToString = !TextUtils.isEmpty(strA) ? Base64.encodeToString(strA.getBytes(), 2) : "";
            q0.b(TAG, "getEndScreenInfo-mCampaign.name:" + this.M.getAppName());
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, strEncodeToString);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public BaseView getFullScreenViewByStyle(Context context, BaseView.a aVar) {
        BaseView mBridgeFullView;
        BaseView baseView;
        int i10 = i.f36204a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                baseView = null;
            } else {
                mBridgeFullView = new MBridgeTopFullView(context);
            }
            if (baseView != null) {
                baseView.setStytle(aVar);
            }
            return baseView;
        }
        mBridgeFullView = new MBridgeFullView(context);
        baseView = mBridgeFullView;
        if (baseView != null) {
            baseView.setStytle(aVar);
        }
        return baseView;
    }

    public float getMediaContentAspectRatio() {
        float f10 = 0.0f;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx != null) {
                String videoResolution = !TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) ? this.M.getVideoResolution() : this.M.getImageSize();
                if (!TextUtils.isEmpty(videoResolution)) {
                    String[] strArrSplit = videoResolution.split(VastAttributes.HORIZONTAL_POSITION);
                    if (strArrSplit.length == 2) {
                        f10 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                    }
                }
                q0.b(TAG, "resource ratio is : " + f10);
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
        return f10;
    }

    public BaseView.a handleViewStyleResult(Context context) {
        int nvT2 = this.M.getNvT2();
        if (nvT2 == 1) {
            a(context);
        } else {
            if (nvT2 == 2 || nvT2 == 3 || nvT2 == 4) {
                return BaseView.a.FULL_MIDDLE_VIEW;
            }
            if (nvT2 == 6) {
                return BaseView.a.FULL_TOP_VIEW;
            }
        }
        return null;
    }

    public void hideEndCardWebViewCloseBtn() {
        ImageView imageView = this.f36172h0;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.f36172h0.setVisibility(8);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            Context context = this.f36178k0;
            if (context != null) {
                a(context);
            } else {
                if (!(obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) || (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b) == null) {
                    return;
                }
                a(windVaneWebView.getContext());
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    public boolean ismCurIsFullScreen() {
        return this.f36171h;
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        q0.c("omsdk", "base media end");
        MediaEvents mediaEvents = this.f36188s;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        q0.c("omsdk", "base media start");
        MediaEvents mediaEvents = this.f36188s;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        MediaEvents mediaEvents = this.f36188s;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            q0.c("error", str);
            o oVar = new o(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(oVar);
            } else {
                oVar.run();
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        q0.c("errorstr", str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) {
        MediaEvents mediaEvents = this.f36188s;
        if (mediaEvents != null) {
            try {
                mediaEvents.start(i10, this.f36167f ? 1.0f : 0.0f);
            } catch (IllegalArgumentException e10) {
                q0.a("omsdk", e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        q0.b(TAG, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextD == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f36112b) != null) {
                    contextD = windVaneWebView.getContext();
                }
            } catch (Exception e10) {
                q0.b(TAG, e10.getMessage());
            }
        }
        if (contextD == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextD, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextD, strOptString);
            }
        } catch (JSONException e11) {
            q0.b(TAG, e11.getMessage());
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z10) {
        this.f36159b = z10;
    }

    public void setAllowScreenChange(boolean z10) {
        this.f36161c = z10;
    }

    public void setAllowVideoRefresh(boolean z10) {
        this.f36157a = z10;
    }

    public void setFollowActivityOrientation(boolean z10) {
        this.f36176j0 = z10;
    }

    public void setFullScreenViewBackgroundColor(int i10) {
        this.f36189t = i10;
    }

    public void setIsAllowFullScreen(boolean z10) {
        this.f36163d = z10;
    }

    public void setNativeAd(Campaign campaign) {
        String str;
        if (campaign == null) {
            return;
        }
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || campaignEx != campaign) {
                M();
                p();
                CampaignEx campaignEx2 = (CampaignEx) campaign;
                this.M = campaignEx2;
                if (campaignEx2.getMediaViewHolder() == null) {
                    CampaignEx.b bVar = new CampaignEx.b();
                    bVar.f34695a = this.M.getAdvImpList();
                    this.M.setMediaViewHolder(bVar);
                }
                if (this.M.getAdType() == 94 || this.M.getAdType() == 287) {
                    str = this.M.getRequestId() + this.M.getId() + this.M.getVideoUrlEncode();
                } else {
                    str = this.M.getId() + this.M.getVideoUrlEncode() + this.M.getBidToken();
                }
                this.W = com.mbridge.msdk.videocommon.download.b.getInstance().a(getUnitId(), str);
                if (this.f36184o) {
                    if (this.f36186q != null) {
                        MediaViewPlayerView mediaViewPlayerView = this.f36191v;
                        if (mediaViewPlayerView != null) {
                            mediaViewPlayerView.unregisterView();
                        }
                        this.f36186q.finish();
                        this.f36186q = null;
                    }
                    if (this.f36188s != null) {
                        this.f36188s = null;
                    }
                    if (this.f36187r != null) {
                        this.f36187r = null;
                    }
                }
                CampaignEx campaignEx3 = this.M;
                if (campaignEx3 != null && campaignEx3.isActiveOm()) {
                    this.f36186q = com.mbridge.msdk.omsdk.b.a(getContext(), TextUtils.isEmpty(this.M.getVideoUrlEncode()), this.M.getOmid(), this.M.getRequestId(), this.M.getId(), getUnitId(), "", this.M.getRequestIdNotice());
                }
                if (this.f36184o) {
                    N();
                }
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.f36162c0 = onMBMediaViewListenerPlus;
    }

    public void setProgressVisibility(boolean z10) {
        this.f36177k = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f36191v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showProgressView(z10);
        }
    }

    public void setSoundIndicatorVisibility(boolean z10) {
        this.f36179l = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f36191v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showSoundIndicator(z10);
        }
    }

    public void setVideoSoundOnOff(boolean z10) {
        this.f36167f = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f36191v;
        if (mediaViewPlayerView != null) {
            if (z10) {
                mediaViewPlayerView.openSound();
            } else {
                mediaViewPlayerView.closeSound();
            }
        }
    }

    public void showEndCardWebViewCloseBtn() {
        ImageView imageView = this.f36172h0;
        if (imageView == null || imageView.getVisibility() == 0) {
            return;
        }
        this.f36172h0.setVisibility(0);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str).optInt("state", 1);
                } catch (Exception e10) {
                    q0.b(TAG, e10.getMessage());
                }
            }
            q0.b(TAG, "SHOW CLOSE BTN ");
            showEndCardWebViewCloseBtn();
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, a(0));
        } catch (Exception e11) {
            q0.b(TAG, e11.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(obj, a(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        v();
        Z();
    }

    private void d() {
        try {
            this.f36191v.showSoundIndicator(this.f36179l);
            this.f36191v.showProgressView(this.f36177k);
            OnMBMediaViewListener onMBMediaViewListener = this.f36160b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onExitFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f36162c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onExitFullscreen();
            }
            MediaEvents mediaEvents = this.f36188s;
            if (mediaEvents != null) {
                mediaEvents.playerStateChange(PlayerState.NORMAL);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private float getAllScreenHeight() {
        try {
            float fH = v0.h(getContext());
            if (!this.f36173i) {
                return fH + v0.c(getContext());
            }
            return fH;
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAllScreenWidth() {
        try {
            float fI = v0.i(getContext());
            if (this.f36173i) {
                return fI + v0.c(getContext());
            }
            return fI;
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
            return 0.0f;
        }
    }

    private int getCDRate() {
        if (getUnitSetting() != null) {
            return getUnitSetting().i();
        }
        return 0;
    }

    private int getReadyRate() {
        if (getUnitSetting() != null) {
            return getUnitSetting().C();
        }
        return 100;
    }

    public void exitFullScreen() {
        try {
            g();
            if (this.f36159b) {
                this.f36191v.onClickPlayButton();
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f36161c) {
                B();
            }
            this.f36169g = isHardwareAccelerated();
            this.f36174i0 = getOrientation();
            N();
            this.L.postDelayed(this.f36182m0, 300L);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        boolean z10;
        super.onConfigurationChanged(configuration);
        if (this.f36176j0) {
            int i10 = this.f36174i0;
            int i11 = configuration.orientation;
            if (i10 == i11) {
                return;
            }
            this.f36174i0 = i11;
            boolean z11 = true;
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f36173i = z10;
            if (this.f36174i0 != 0) {
                z11 = false;
            }
            this.f36175j = z11;
            this.L.postDelayed(new g(), 200L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f36186q != null) {
                MediaViewPlayerView mediaViewPlayerView = this.f36191v;
                if (mediaViewPlayerView != null) {
                    mediaViewPlayerView.unregisterView();
                }
                this.f36186q.finish();
                this.f36186q = null;
            }
            if (this.f36188s != null) {
                this.f36188s = null;
            }
            if (this.f36187r != null) {
                this.f36187r = null;
            }
            this.L.removeCallbacks(this.f36182m0);
            C();
            b0();
            c0();
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        try {
            this.N = getHeight();
            int width = getWidth();
            this.O = width;
            if (width == 0) {
                this.O = getMeasuredWidth();
            }
            if (this.N == 0) {
                this.N = getMeasuredHeight();
            }
            if (this.O == 0 && this.N == 0) {
                this.O = (int) getAllScreenWidth();
            }
            s sVar = this.f36158a0;
            if (sVar == s.VIDEO && !this.f36171h) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (this.N == 0 || ((layoutParams != null && layoutParams.height == -2) || (layoutParams != null && layoutParams.height == -1))) {
                    this.N = (int) ((((double) this.O) * this.Q) / this.P);
                }
                u();
                return;
            }
            if (sVar == s.BIG_IMAGE && !this.f36171h) {
                o();
            } else if (sVar == s.GIF && !this.f36171h) {
                x();
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        int i12;
        String str;
        b(i10);
        a(i10, i11);
        MediaEvents mediaEvents = this.f36188s;
        if (mediaEvents != null) {
            int i13 = (i10 * 100) / i11;
            int i14 = ((i10 + 1) * 100) / i11;
            if (i13 <= 25 && 25 < i14) {
                mediaEvents.firstQuartile();
            } else if (i13 <= 50 && 50 < i14) {
                mediaEvents.midpoint();
            } else if (i13 <= 75 && 75 < i14) {
                mediaEvents.thirdQuartile();
            }
        }
        if (getReadyRate() != 100 && !this.f36180l0) {
            int cDRate = getCDRate();
            int readyRate = getReadyRate();
            if (readyRate == 0) {
                return;
            }
            if (cDRate > readyRate) {
                cDRate = readyRate / 2;
            }
            if (cDRate >= 0 && i10 >= (i12 = (i11 * cDRate) / 100)) {
                if (this.M.getAdType() != 94 && this.M.getAdType() != 287) {
                    str = this.M.getId() + this.M.getVideoUrlEncode() + this.M.getBidToken();
                } else {
                    str = this.M.getRequestId() + this.M.getId() + this.M.getVideoUrlEncode();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(getUnitId(), str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f36180l0 = true;
                    q0.b(TAG, "CDRate is : " + i12 + " and start download !");
                }
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        try {
            this.f36165e = z10;
            if (this.f36158a0 == s.VIDEO) {
                setIsFrontDesk(z10);
            }
            r();
            requestLayout();
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            exitFullScreen();
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, a(0));
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(obj, a(1));
        }
    }

    public void updateViewManger(boolean z10) {
        com.mbridge.msdk.nativex.view.mbfullview.a aVarA = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
        if (aVarA != null) {
            try {
                aVarA.a(this.E);
                aVarA.a(z10, !this.f36191v.isComplete(), this.E);
                aVarA.a(z10, this.E, this.f36164d0);
            } catch (NullPointerException e10) {
                e10.printStackTrace();
                return;
            }
        }
        BaseView baseView = this.E;
        if ((baseView instanceof MBridgeTopFullView) && aVarA != null) {
            aVarA.a(!z10, baseView);
        }
    }

    private void c() {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f36160b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onEnterFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f36162c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onEnterFullscreen();
            }
            MediaEvents mediaEvents = this.f36188s;
            if (mediaEvents != null) {
                mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void b(Context context) {
        try {
            t();
            w();
            this.f36178k0 = context;
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f36160b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onFinishRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f36162c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onFinishRedirection(campaign, str);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f36160b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onRedirectionFailed(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f36162c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onRedirectionFailed(campaign, str);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f36160b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onStartRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f36162c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onStartRedirection(campaign, str);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    public void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f36183n.contains(str)) {
                return;
            }
            this.f36183n.add(str);
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f36162c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoComplete();
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    public void b(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f36181m.contains(str)) {
                return;
            }
            this.f36181m.add(str);
            OnMBMediaViewListener onMBMediaViewListener = this.f36160b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoStart();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f36162c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoStart();
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        try {
            com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(getContext()));
            com.mbridge.msdk.foundation.entity.n nVar = null;
            if (!TextUtils.isEmpty(this.M.getNoticeUrl())) {
                int iS = m0.s(getContext());
                nVar = new com.mbridge.msdk.foundation.entity.n("2000021", iS, this.M.getNoticeUrl(), str, m0.a(getContext(), iS));
            } else if (!TextUtils.isEmpty(this.M.getClickURL())) {
                int iS2 = m0.s(getContext());
                nVar = new com.mbridge.msdk.foundation.entity.n("2000021", iS2, this.M.getClickURL(), str, m0.a(getContext(), iS2));
            }
            if (nVar != null) {
                nVar.b(this.M.getId());
                nVar.v(this.M.getVideoUrlEncode());
                nVar.m(str);
                nVar.n(this.M.getRequestId());
                nVar.o(this.M.getRequestIdNotice());
                nVar.u(getUnitId());
                nVarA.a(nVar);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        h();
    }

    private s a(boolean z10) {
        s sVar;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null) {
                return null;
            }
            if (a1.a(campaignEx.getVideoUrlEncode())) {
                s sVar2 = a1.b(this.M.getImageUrl()) ? s.BIG_IMAGE : null;
                if (!a1.b(this.M.getGifUrl())) {
                    return sVar2;
                }
                if (a1.a(this.M.getImageUrl())) {
                    sVar2 = s.GIF;
                }
                this.f36195z.setWebViewClient(new y(this));
                j();
                return sVar2;
            }
            if (this.f36169g && this.W != null) {
                if (a1.b(this.M.getVideoUrlEncode()) && a1.a(this.M.getImageUrl())) {
                    sVar = s.VIDEO;
                } else {
                    if (!a1.b(this.M.getVideoUrlEncode()) || !a1.b(this.M.getImageUrl())) {
                        return null;
                    }
                    if (com.mbridge.msdk.videocommon.download.l.a(this.W, getReadyRate())) {
                        return s.VIDEO;
                    }
                    s sVar3 = s.BIG_IMAGE;
                    if (!z10 || !this.f36157a) {
                        return sVar3;
                    }
                    this.W.b(new x(this));
                    return sVar3;
                }
            } else {
                sVar = s.BIG_IMAGE;
            }
            return sVar;
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
            return s.BIG_IMAGE;
        }
    }

    private void b() {
        try {
            if (this.M == null) {
                q0.c(TAG, "campaign is null addPlayerView return");
            }
            MediaViewPlayerView mediaViewPlayerView = this.f36191v;
            if (mediaViewPlayerView != null && mediaViewPlayerView.getParent() != null) {
                ((ViewGroup) this.f36191v.getParent()).removeView(this.f36191v);
            }
            Z();
            MediaViewPlayerView mediaViewPlayerView2 = new MediaViewPlayerView(getContext());
            this.f36191v = mediaViewPlayerView2;
            mediaViewPlayerView2.showProgressView(this.f36177k);
            this.f36191v.showSoundIndicator(this.f36179l);
            if (this.f36167f) {
                this.f36191v.openSound();
            } else {
                this.f36191v.closeSound();
            }
            this.f36191v.setAllowLoopPlay(this.f36159b);
            this.f36191v.initPlayerViewData(getPlayUrl(), this.M, y(), this, this.W, getUnitId());
            this.f36191v.setOnMediaViewPlayerViewListener(new u(this));
            this.f36192w.addView(this.f36191v, -1, -1);
            T();
            AdSession adSession = this.f36186q;
            if (adSession != null) {
                MediaViewPlayerView mediaViewPlayerView3 = this.f36191v;
                if (mediaViewPlayerView3 != null) {
                    mediaViewPlayerView3.registerView(adSession);
                }
                this.f36187r = AdEvents.createAdEvents(this.f36186q);
                this.f36188s = MediaEvents.createMediaEvents(this.f36186q);
                this.f36186q.start();
                this.f36187r.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                MediaViewPlayerView mediaViewPlayerView4 = this.f36191v;
                if (mediaViewPlayerView4 != null) {
                    mediaViewPlayerView4.setVideoEvents(this.f36188s);
                }
                try {
                    AdEvents adEvents = this.f36187r;
                    if (adEvents != null) {
                        adEvents.impressionOccurred();
                    }
                } catch (Exception e10) {
                    q0.a("omsdk", e10.getMessage());
                }
            }
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    public BaseMBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36157a = true;
        this.f36159b = true;
        this.f36161c = true;
        this.f36163d = true;
        this.f36165e = true;
        this.f36167f = false;
        this.f36169g = true;
        this.f36171h = false;
        this.f36173i = false;
        this.f36175j = false;
        this.f36177k = true;
        this.f36179l = true;
        this.f36181m = new ArrayList<>();
        this.f36183n = new ArrayList<>();
        this.f36184o = false;
        this.f36185p = false;
        this.f36186q = null;
        this.f36187r = null;
        this.f36188s = null;
        this.f36189t = 0;
        this.f36190u = false;
        this.W = null;
        this.f36158a0 = null;
        this.f36166e0 = false;
        this.f36168f0 = false;
        this.f36176j0 = false;
        this.f36180l0 = false;
        this.f36182m0 = new h();
        b(context);
    }

    private boolean c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        try {
            CampaignEx campaignEx = this.M;
            return !e1.a(view, campaignEx == null ? 0 : campaignEx.getImpReportType());
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
            return false;
        }
    }

    @SuppressLint({"ResourceType"})
    public void a() {
        WindowInsets rootWindowInsets;
        CampaignEx campaignEx;
        try {
            if (getRootView() != null && (getRootView() instanceof ViewGroup)) {
                BaseView.a aVarHandleViewStyleResult = handleViewStyleResult(getContext());
                if (aVarHandleViewStyleResult == null) {
                    return;
                }
                BaseView fullScreenViewByStyle = getFullScreenViewByStyle(getContext(), aVarHandleViewStyleResult);
                this.E = fullScreenViewByStyle;
                if (fullScreenViewByStyle != null && k()) {
                    com.mbridge.msdk.nativex.view.mbfullview.a aVarA = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
                    BaseView baseView = this.E;
                    aVarA.a(baseView.style, this.M, baseView);
                    this.f36171h = true;
                    this.f36185p = false;
                    MediaViewPlayerView mediaViewPlayerView = this.f36191v;
                    if (mediaViewPlayerView != null) {
                        mediaViewPlayerView.setEnterFullScreen();
                        this.f36191v.setIsActivePause(false);
                    }
                    c();
                    FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
                    RelativeLayout relativeLayout = new RelativeLayout(getContext());
                    this.D = relativeLayout;
                    relativeLayout.setClickable(true);
                    ViewGroup viewGroup = (ViewGroup) this.f36191v.getParent();
                    int childCount = viewGroup.getChildCount();
                    int i10 = 0;
                    while (i10 < childCount && viewGroup.getChildAt(i10) != this.f36191v) {
                        i10++;
                    }
                    this.K = i10;
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setId(100);
                    viewGroup.addView(frameLayout2, i10, new ViewGroup.LayoutParams(getWidth(), getHeight()));
                    viewGroup.removeView(this.f36191v);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    relativeLayout.setId(101);
                    new RelativeLayout.LayoutParams(-1, -1);
                    this.J.addView(this.f36191v, new RelativeLayout.LayoutParams(-1, -1));
                    if (this.J != null && (campaignEx = this.M) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                        try {
                            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                            mBAdChoice.setCampaign(this.M);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(12);
                            this.J.addView(mBAdChoice, layoutParams2);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (this.f36190u) {
                        a(frameLayout);
                    }
                    frameLayout.addView(relativeLayout, layoutParams);
                    int i11 = ViewCompat.MEASURED_STATE_MASK;
                    if (i.f36204a[this.E.style.ordinal()] == 2) {
                        i11 = -1;
                    }
                    int i12 = this.f36189t;
                    if (i12 != 0) {
                        relativeLayout.setBackgroundColor(i12);
                    } else {
                        relativeLayout.setBackgroundColor(i11);
                    }
                    this.E.setId(103);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    int[] iArr = new int[2];
                    frameLayout.getLocationInWindow(iArr);
                    int i13 = iArr[1];
                    this.f36164d0 = i13;
                    if (i13 == 0 && (rootWindowInsets = getRootWindowInsets()) != null) {
                        layoutParams3.setMargins(0, rootWindowInsets.getStableInsetTop(), 0, 0);
                    }
                    relativeLayout.addView(this.E, layoutParams3);
                    s();
                    Q();
                    MediaViewPlayerView mediaViewPlayerView2 = this.f36191v;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.openSound();
                        MediaViewPlayerView mediaViewPlayerView3 = this.f36191v;
                        mediaViewPlayerView3.setMediaViewPlayListener(new p(mediaViewPlayerView3));
                    }
                    b(false);
                    F();
                    return;
                }
                return;
            }
            q0.c(TAG, "rootView is null");
        } catch (Exception e11) {
            q0.b(TAG, e11.getMessage());
        }
    }

    private void b(int i10) {
        CampaignEx.b mediaViewHolder;
        Map<Integer, String> map;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f34696b || (map = mediaViewHolder.f34695a) == null || map.size() <= 0) {
                return;
            }
            Map<Integer, String> map2 = mediaViewHolder.f34695a;
            Iterator<Map.Entry<Integer, String>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, String> next = it.next();
                Integer key = next.getKey();
                String value = next.getValue();
                if (i10 >= key.intValue() && !TextUtils.isEmpty(value)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.M;
                    com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), value, false, false);
                    it.remove();
                }
            }
            if (map2.size() <= 0) {
                mediaViewHolder.f34696b = true;
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void b(boolean z10) {
        try {
            int nvT2 = this.M.getNvT2();
            if (this.A == null) {
                WindVaneWebViewForNV windVaneWebViewForNV = new WindVaneWebViewForNV(getContext());
                this.A = windVaneWebViewForNV;
                windVaneWebViewForNV.setObject(this);
                this.A.setBackListener(new e());
                this.A.setWebViewListener(new f());
            }
            if (nvT2 != 3) {
                if (nvT2 == 4) {
                    this.f36168f0 = true;
                    CampaignEx campaignEx = this.M;
                    if (campaignEx != null) {
                        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(campaignEx);
                        aVar.a(this.M.getAppName());
                        this.A.setDownloadListener(aVar);
                        this.A.setFilter(new v(null));
                        return;
                    }
                    return;
                }
                return;
            }
            String str = this.M.getendcard_url();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.M.getMediaViewHolder();
            if (str.contains(MultiDexExtractor.EXTRACTED_SUFFIX) && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (a1.b(h5ResAddress)) {
                    this.f36168f0 = true;
                    MintegralNetworkBridge.webviewLoadUrl(this.A, h5ResAddress);
                    return;
                }
                return;
            }
            String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
            if (a1.b(htmlContentFromUrl)) {
                q0.a(TAG, "load html...");
                this.f36168f0 = true;
                MintegralNetworkBridge.webviewLoadDataWithBaseURL(this.A, str, htmlContentFromUrl, "text/html", "UTF-8", null);
            }
        } catch (Exception e10) {
            q0.b(TAG, e10.getMessage());
        }
    }

    private void a(FrameLayout frameLayout) {
        BitmapDrawable bitmapDrawableA;
        if (frameLayout == null || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(getUnitId(), this.M.getAdType())) == null) {
            return;
        }
        ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
        v0.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
        this.E.addView(imageView, new RelativeLayout.LayoutParams(-1, -1));
        AdSession adSession = this.f36186q;
        if (adSession != null) {
            adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
        }
    }

    private void a(View view, float f10, float f11) {
        if (view == null) {
            return;
        }
        try {
            double d10 = this.P;
            double d11 = 0.0d;
            if (d10 > 0.0d) {
                double d12 = this.Q;
                if (d12 > 0.0d) {
                    double d13 = d10 / d12;
                    if (f10 > 0.0f && f11 > 0.0f) {
                        d11 = f10 / f11;
                    }
                    double dA = v0.a(Double.valueOf(d13));
                    double dA2 = v0.a(Double.valueOf(d11));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f36192w.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    boolean z10 = c(getContext()) && this.f36173i;
                    int i10 = -1;
                    if (dA > dA2) {
                        double d14 = (((double) f10) * this.Q) / this.P;
                        layoutParams2.width = -1;
                        if (!z10) {
                            i10 = (int) d14;
                        }
                        layoutParams2.height = i10;
                        layoutParams2.addRule(13);
                        layoutParams.width = this.O;
                        layoutParams.height = (int) d14;
                        layoutParams.addRule(13);
                    } else if (dA < dA2) {
                        double d15 = ((double) f11) * d13;
                        layoutParams2.width = z10 ? -1 : (int) d15;
                        layoutParams2.height = -1;
                        layoutParams2.addRule(13);
                        layoutParams.width = (int) d15;
                        layoutParams.height = this.N;
                        layoutParams.addRule(13);
                    } else {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        layoutParams.width = this.O;
                        layoutParams.height = this.N;
                        layoutParams.addRule(13);
                    }
                    if (!this.f36171h) {
                        this.f36192w.setLayoutParams(layoutParams);
                    }
                    view.setLayoutParams(layoutParams2);
                    return;
                }
            }
            setPlayViewParamsDefault(view);
        } catch (Throwable th2) {
            q0.b(TAG, th2.getMessage());
        }
    }

    private void a(int i10, int i11) {
        CampaignEx.b mediaViewHolder;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f34702h || i11 == 0) {
                return;
            }
            List<Map<Integer, String>> listT = this.M.getNativeVideoTracking().t();
            int i12 = ((i10 + 1) * 100) / i11;
            if (listT != null) {
                int i13 = 0;
                while (i13 < listT.size()) {
                    Map<Integer, String> map = listT.get(i13);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int iIntValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (iIntValue <= i12 && !TextUtils.isEmpty(value)) {
                                Context context = getContext();
                                CampaignEx campaignEx2 = this.M;
                                com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), new String[]{value}, false, true);
                                it.remove();
                                listT.remove(i13);
                                i13--;
                            }
                        }
                    }
                    i13++;
                }
                if (listT.size() <= 0) {
                    mediaViewHolder.f34702h = true;
                }
            }
        } catch (Throwable unused) {
            q0.b(TAG, "reportPlayPercentageData error");
        }
    }

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            if (!TextUtils.isEmpty(string)) {
                return Base64.encodeToString(string.getBytes(), 2);
            }
        } catch (Throwable unused) {
            q0.b(TAG, "code to string is error");
        }
        return "";
    }

    private String a(List<CampaignEx> list, String str, String str2) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray camplistToJson = CampaignEx.parseCamplistToJson(list);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("campaignList", camplistToJson);
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    jSONObject.put("sdk_info", str2);
                    return jSONObject.toString();
                }
            } catch (Exception e10) {
                q0.b(TAG, e10.getMessage());
            }
        }
        return null;
    }
}
