package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class MBridgeBTVideoView extends BTBaseView {
    private static boolean P;
    private static long Q;
    private AdSession A;
    private AdEvents B;
    private MediaEvents C;
    private d D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private String J;
    private boolean K;
    private boolean L;
    private boolean M;
    private RelativeLayout N;
    private ProgressBar O;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private PlayerView f38509p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SoundImageView f38510q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f38511r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f38512s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FeedBackButton f38513t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f38514u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private WebView f38515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f38516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f38517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f38518y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f38519z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean zIsSilent = MBridgeBTVideoView.this.f38509p.isSilent();
            if (MBridgeBTVideoView.this.f38515v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f38414n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f38419d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.E);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.f38515v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    q0.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + zIsSilent + " mute = " + MBridgeBTVideoView.this.E);
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.f38515v, e10.getMessage());
                }
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTVideoView.this.f38515v != null) {
                BTBaseView.a(MBridgeBTVideoView.this.f38515v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f38419d);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTVideoView.this.C != null) {
                try {
                    MBridgeBTVideoView.this.C.adUserInteraction(InteractionType.CLICK);
                    q0.a("omsdk", "btv adUserInteraction click");
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
            if (MBridgeBTVideoView.this.f38515v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f38414n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f38419d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(VastAttributes.HORIZONTAL_POSITION, String.valueOf(view.getX()));
                    jSONObject2.put(VastAttributes.VERTICAL_POSITION, String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.f38515v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.f38515v, "onClicked", MBridgeBTVideoView.this.f38419d);
                }
            }
        }
    }

    public static final class d extends DefaultVideoPlayerStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f38523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WebView f38524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaEvents f38525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f38526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f38527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f38528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f38529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f38530h;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f38534l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f38535m;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f38531i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f38532j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f38533k = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f38536n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f38537o = false;

        private void a() {
            int i10;
            MBridgeBTVideoView mBridgeBTVideoView;
            CampaignEx campaignEx;
            String str;
            if (!s0.a().a("h_c_r_w_p_c", false) || (i10 = this.f38534l) == 100 || this.f38535m != 0 || this.f38536n || i10 == 0 || (mBridgeBTVideoView = this.f38523a) == null || (campaignEx = mBridgeBTVideoView.f38417b) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f38523a.f38417b.getAdType() == 287) {
                    str = this.f38523a.f38417b.getRequestId() + this.f38523a.f38417b.getId() + this.f38523a.f38417b.getVideoUrlEncode();
                } else {
                    str = this.f38523a.f38417b.getId() + this.f38523a.f38417b.getVideoUrlEncode() + this.f38523a.f38417b.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f38527e, str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f38536n = true;
                    if (MBridgeConstans.DEBUG) {
                        q0.b(DefaultVideoPlayerStatusListener.TAG, "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b(DefaultVideoPlayerStatusListener.TAG, e10.getMessage());
                }
            }
        }

        public void b(int i10, int i11) {
            this.f38534l = i10;
            this.f38535m = i11;
            a();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                q0.b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.f38525c != null) {
                    q0.b("omsdk", "bt onBufferingStart");
                    this.f38525c.bufferStart();
                    this.f38537o = true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) {
            try {
                if ((str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) || str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) && this.f38524b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f38414n);
                        jSONObject.put("id", this.f38526d);
                        jSONObject.put("data", new JSONObject());
                        f.a().a(this.f38524b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        com.mbridge.msdk.video.bt.component.d.c().a(this.f38524b, e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) {
            super.onPlayError(str);
            if (this.f38524b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f38415o);
                    jSONObject.put("id", this.f38526d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f38526d);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(this.f38524b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.f38524b, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i10, int i11) {
            StringBuilder sb2;
            String str;
            String string;
            super.onPlayProgress(i10, i11);
            if (MBridgeBTVideoView.Q == 0) {
                long unused = MBridgeBTVideoView.Q = System.currentTimeMillis();
            }
            MBridgeBTVideoView mBridgeBTVideoView = this.f38523a;
            if (mBridgeBTVideoView.f38423h) {
                int videoCompleteTime = 0;
                CampaignEx campaignEx = mBridgeBTVideoView.f38417b;
                if (campaignEx != null) {
                    videoCompleteTime = campaignEx.getVideoCompleteTime();
                    com.mbridge.msdk.foundation.feedback.b.b().b(this.f38523a.f38417b.getCampaignUnitId() + "_1", i10);
                }
                if (videoCompleteTime > i11 || videoCompleteTime <= 0) {
                    videoCompleteTime = i11;
                }
                int i12 = videoCompleteTime <= 0 ? i11 - i10 : videoCompleteTime - i10;
                if (i12 <= 0) {
                    string = videoCompleteTime <= 0 ? "0" : (String) this.f38523a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    if (videoCompleteTime <= 0) {
                        sb2 = new StringBuilder();
                        sb2.append(i12);
                        str = "";
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(i12);
                        str = (String) this.f38523a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", TypedValues.Custom.S_STRING));
                    }
                    sb2.append(str);
                    string = sb2.toString();
                }
                CampaignEx campaignEx2 = this.f38523a.f38417b;
                if (campaignEx2 != null && campaignEx2.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f38523a.f38417b.getVst(), i11);
                    if (iMin >= videoCompleteTime || iMin < 0) {
                        int i13 = videoCompleteTime - i10;
                        if (this.f38523a.f38417b.getAdType() == 287) {
                            if (i13 > 0) {
                                string = i13 + ((String) this.f38523a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                            } else if (i13 == 0) {
                                this.f38523a.f38511r.setVisibility(4);
                            }
                        }
                    } else {
                        int i14 = iMin - i10;
                        if (i14 > 0) {
                            string = i14 + ((String) this.f38523a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", TypedValues.Custom.S_STRING)));
                        } else if (this.f38523a.f38417b.getAdType() == 287 && i14 == 0) {
                            this.f38523a.f38511r.setVisibility(4);
                        }
                    }
                }
                this.f38523a.f38511r.setText(string);
            }
            this.f38529g = i11;
            this.f38528f = i10;
            this.f38523a.O.setMax(this.f38529g);
            this.f38523a.O.setProgress(this.f38528f);
            if (this.f38524b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f38414n);
                    jSONObject.put("id", this.f38526d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f38526d);
                    jSONObject2.put("progress", MBridgeBTVideoView.b(i10, i11));
                    jSONObject2.put("time", String.valueOf(i10));
                    jSONObject2.put("duration", String.valueOf(i11));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(this.f38524b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.f38524b, e10.getMessage());
                }
            }
            MediaEvents mediaEvents = this.f38525c;
            if (mediaEvents != null) {
                int i15 = (i10 * 100) / i11;
                int i16 = ((i10 + 1) * 100) / i11;
                if (i15 <= 25 && 25 < i16 && !this.f38531i) {
                    this.f38531i = true;
                    mediaEvents.firstQuartile();
                    q0.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i15 <= 50 && 50 < i16 && !this.f38532j) {
                    this.f38532j = true;
                    mediaEvents.midpoint();
                    q0.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i15 <= 75 && 75 < i16 && !this.f38533k) {
                    this.f38533k = true;
                    mediaEvents.thirdQuartile();
                    q0.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            a(i10, i11);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i10) {
            super.onPlayStarted(i10);
            if (!this.f38530h) {
                this.f38523a.O.setMax(i10);
                WebView webView = this.f38524b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f38526d);
                }
                this.f38530h = true;
                if (this.f38525c != null) {
                    float volume = 0.0f;
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.f38523a;
                        if (mBridgeBTVideoView != null && mBridgeBTVideoView.f38509p != null) {
                            volume = this.f38523a.f38509p.getVolume();
                        }
                        this.f38525c.start(i10, volume);
                        q0.a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e10) {
                        q0.b("omsdk", e10.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.P = false;
        }

        public d(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, MediaEvents mediaEvents) {
            this.f38523a = mBridgeBTVideoView;
            this.f38524b = webView;
            this.f38525c = mediaEvents;
            if (mBridgeBTVideoView != null) {
                this.f38526d = mBridgeBTVideoView.f38419d;
                this.f38527e = mBridgeBTVideoView.f38418c;
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f38525c != null && this.f38537o) {
                    q0.b("omsdk", "bt onBufferingEnd");
                    this.f38537o = false;
                    this.f38525c.bufferFinish();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f38523a;
            CampaignEx campaignEx = mBridgeBTVideoView.f38417b;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.f38523a.f38511r.setText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", TypedValues.Custom.S_STRING));
                } else {
                    this.f38523a.f38511r.setText("0");
                }
            } else {
                mBridgeBTVideoView.f38511r.setText("0");
            }
            this.f38523a.f38509p.setClickable(false);
            WebView webView = this.f38524b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f38526d);
            }
            MediaEvents mediaEvents = this.f38525c;
            if (mediaEvents != null) {
                mediaEvents.complete();
                q0.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f38528f = this.f38529g;
            boolean unused = MBridgeBTVideoView.P = true;
            this.f38523a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        private void a(int i10, int i11) {
            int i12;
            int i13;
            String str;
            try {
                int i14 = this.f38534l;
                if (i14 == 100 || this.f38536n || i14 == 0 || (i12 = this.f38535m) < 0 || i10 < (i13 = (i11 * i12) / 100)) {
                    return;
                }
                if (this.f38523a.f38417b.getAdType() != 94 && this.f38523a.f38417b.getAdType() != 287) {
                    str = this.f38523a.f38417b.getId() + this.f38523a.f38417b.getVideoUrlEncode() + this.f38523a.f38417b.getBidToken();
                } else {
                    str = this.f38523a.f38417b.getRequestId() + this.f38523a.f38417b.getId() + this.f38523a.f38417b.getVideoUrlEncode();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f38527e, str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f38536n = true;
                    q0.b(DefaultVideoPlayerStatusListener.TAG, "CDRate is : " + i13 + " and start download !");
                }
            } catch (Exception e10) {
                q0.b(DefaultVideoPlayerStatusListener.TAG, e10.getMessage());
            }
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f38517x = 0;
        this.f38518y = 0;
        this.f38519z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }

    private int getBufferTimeout() {
        int i10 = 5;
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            i10 = aVarC != null ? (int) aVarC.i() : 5;
            q0.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + i10);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return i10;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f38509p;
            if (playerView != null && this.f38515v != null) {
                playerView.closeSound();
                this.f38510q.setSoundStatus(false);
                this.E = 1;
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.volumeChange(0.0f);
                    }
                } catch (Exception e10) {
                    q0.a("OMSDK", e10.getMessage());
                }
                BTBaseView.a(this.f38515v, "onPlayerMute", this.f38419d);
                return true;
            }
        } catch (Exception e11) {
            q0.b(BTBaseView.TAG, e11.getMessage());
        }
        return false;
    }

    private void d() {
        String str;
        if (this.f38417b.getAdType() == 94 || this.f38417b.getAdType() == 287) {
            str = this.f38417b.getRequestId() + this.f38417b.getId() + this.f38417b.getVideoUrlEncode();
        } else {
            str = this.f38417b.getId() + this.f38417b.getVideoUrlEncode() + this.f38417b.getBidToken();
        }
        com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f38418c, str);
        if (aVarA != null) {
            this.f38516w = aVarA;
        }
    }

    private boolean e() {
        try {
            this.f38509p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f38510q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f38511r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f38512s = findViewById(findID("mbridge_rl_playing_close"));
            this.N = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.O = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f38509p.setIsBTVideo(true);
            this.f38513t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f38514u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f38509p, this.f38510q, this.f38511r, this.f38512s);
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    private String getPlayURL() {
        String videoUrlEncode = "";
        try {
            videoUrlEncode = this.f38417b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f38516w;
            if (aVar == null) {
                return videoUrlEncode;
            }
            String strP = aVar.p();
            return (a1.a(strP) || !new File(strP).exists()) ? videoUrlEncode : strP;
        } catch (Throwable th2) {
            q0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return videoUrlEncode;
        }
    }

    public AdEvents getAdEvents() {
        return this.B;
    }

    public AdSession getAdSession() {
        return this.A;
    }

    public int getMute() {
        return this.E;
    }

    public MediaEvents getVideoEvents() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (i0.a(iFindLayout)) {
            this.f38421f.inflate(iFindLayout, this);
            boolean zE = e();
            this.f38423h = zE;
            if (!zE) {
                q0.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            b();
        }
        P = false;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            if (this.f38509p != null) {
                AdSession adSession = this.A;
                if (adSession != null) {
                    adSession.finish();
                }
                this.f38509p.setOnClickListener(null);
                this.f38509p.release();
                this.f38509p = null;
                if (!TextUtils.isEmpty(this.J)) {
                    e eVar = new e();
                    long jCurrentTimeMillis = Q;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - Q;
                    }
                    eVar.a("duration", Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f38417b, eVar);
                }
            }
            SoundImageView soundImageView = this.f38510q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f38512s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f38515v != null) {
                this.f38515v = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.C != null) {
                this.C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th2) {
            q0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f38509p;
        if (playerView != null) {
            boolean zIsPlayIng = playerView.isPlayIng();
            this.L = zIsPlayIng;
            this.f38509p.setIsBTVideoPlaying(zIsPlayIng);
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                this.f38509p.setVideoEvents(mediaEvents);
            }
            this.f38509p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f38509p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f38509p.setIsCovered(false);
            if (this.L) {
                this.f38509p.start(true);
            }
            this.f38509p.resumeOMSDK();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f38509p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f38509p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f38515v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f38419d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    public void play() {
        d dVar;
        try {
            if (this.M) {
                if (this.G) {
                    this.f38509p.playVideo(0);
                    this.G = false;
                } else {
                    this.f38509p.start(false);
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        q0.a("omsdk", "btv play2:  videoEvents.resume()");
                    }
                } catch (Throwable th2) {
                    q0.a(BTBaseView.TAG, th2.getMessage());
                }
                WebView webView = this.f38515v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f38419d);
                    return;
                }
                return;
            }
            String playURL = getPlayURL();
            this.J = playURL;
            this.f38509p.initVFPData(playURL, this.f38417b.getVideoUrlEncode(), this.D);
            if (this.H == 1) {
                playMute();
            } else {
                playUnMute();
            }
            try {
                if (this.B != null) {
                    q0.b("omsdk", "bt impressionOccurred");
                    this.B.impressionOccurred();
                }
            } catch (Throwable th3) {
                q0.a(BTBaseView.TAG, th3.getMessage());
            }
            if (!this.f38509p.playVideo() && (dVar = this.D) != null) {
                dVar.onPlayError("play video failed");
            }
            this.M = true;
            return;
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
        q0.b(BTBaseView.TAG, e10.getMessage(), e10);
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f38509p;
            if (playerView == null || this.f38515v == null) {
                return false;
            }
            playerView.openSound();
            this.f38510q.setSoundStatus(true);
            this.E = 2;
            try {
                MediaEvents mediaEvents = this.C;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(1.0f);
                }
            } catch (Exception e10) {
                q0.a("OMSDK", e10.getMessage());
            }
            BTBaseView.a(this.f38515v, "onUnmute", this.f38419d);
            return true;
        } catch (Exception e11) {
            q0.b(BTBaseView.TAG, e11.getMessage());
            return false;
        }
    }

    public void resume() {
        try {
            PlayerView playerView = this.f38509p;
            if (playerView != null) {
                if (this.G) {
                    playerView.playVideo(0);
                    this.G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    MediaEvents mediaEvents = this.C;
                    if (mediaEvents != null) {
                        mediaEvents.resume();
                        q0.a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th2) {
                    q0.a(BTBaseView.TAG, th2.getMessage());
                }
                WebView webView = this.f38515v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f38419d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage());
        }
    }

    public void setAdEvents(AdEvents adEvents) {
        this.B = adEvents;
    }

    public void setAdSession(AdSession adSession) {
        this.A = adSession;
    }

    public void setCloseViewVisable(int i10) {
        this.f38512s.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i10) {
        this.f38511r.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f38515v = webView;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            i10 = this.N.getPaddingLeft();
        }
        if (i11 <= 0) {
            i11 = this.N.getPaddingRight();
        }
        if (i12 <= 0) {
            i12 = this.N.getPaddingTop();
        }
        if (i13 <= 0) {
            i13 = this.N.getPaddingBottom();
        }
        q0.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.N.setPadding(i10, i12, i11, i13);
    }

    public void setOrientation(int i10) {
        this.I = i10;
    }

    public void setPlaybackParams(float f10) {
        PlayerView playerView = this.f38509p;
        if (playerView != null) {
            playerView.setPlaybackParams(f10);
        }
    }

    public void setProgressBarState(int i10) {
        ProgressBar progressBar = this.O;
        if (progressBar != null) {
            progressBar.setVisibility(i10 == 0 ? 8 : 0);
            CampaignEx campaignEx = this.f38417b;
            if (campaignEx == null || campaignEx.getProgressBarShow() != 1) {
                return;
            }
            this.O.setVisibility(0);
        }
    }

    public void setShowClose(int i10) {
        this.f38518y = i10;
    }

    public void setShowMute(int i10) {
        this.f38519z = i10;
    }

    public void setShowTime(int i10) {
        this.f38517x = i10;
    }

    public void setSoundImageViewVisble(int i10) {
        this.f38510q.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.C = mediaEvents;
        d dVar = this.D;
        if (dVar != null) {
            dVar.f38525c = mediaEvents;
        }
        PlayerView playerView = this.f38509p;
        if (playerView != null) {
            playerView.setVideoEvents(mediaEvents);
        }
    }

    public void setVolume(float f10, float f11) {
        PlayerView playerView = this.f38509p;
        if (playerView != null) {
            playerView.setVolume(f10, f11);
        }
    }

    public void soundOperate(int i10, int i11, String str) {
        if (this.f38423h) {
            this.E = i10;
            if (i10 == 1) {
                this.f38510q.setSoundStatus(false);
                this.f38509p.closeSound();
            } else if (i10 == 2) {
                this.f38510q.setSoundStatus(true);
                this.f38509p.openSound();
            }
            if (i11 == 1) {
                this.f38510q.setVisibility(8);
            } else if (i11 == 2) {
                this.f38510q.setVisibility(0);
            }
            MediaEvents mediaEvents = this.C;
            if (mediaEvents != null) {
                try {
                    mediaEvents.volumeChange(this.f38509p.getVolume());
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f38509p;
            if (playerView != null) {
                playerView.pause();
                this.f38509p.stop();
                this.G = true;
                WebView webView = this.f38515v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f38419d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    private int getCDRate() {
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38418c, false).g();
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void b() {
        super.b();
        if (this.f38423h) {
            this.f38510q.setOnClickListener(new a());
            this.f38512s.setOnClickListener(new b());
            setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View rootView;
        int i10;
        int i11;
        super.onAttachedToWindow();
        if (!this.M) {
            this.H = com.mbridge.msdk.video.bt.component.d.c().g(this.f38418c);
        }
        View view = this.f38512s;
        int i12 = 8;
        if (view != null) {
            if (this.f38518y == 0) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            view.setVisibility(i11);
        }
        SoundImageView soundImageView = this.f38510q;
        if (soundImageView != null) {
            if (this.f38519z == 0) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            soundImageView.setVisibility(i10);
        }
        CampaignEx campaignEx = this.f38417b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f38418c);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f38418c + "_1", this.f38417b);
        }
        TextView textView = this.f38511r;
        if (textView != null) {
            if (this.f38517x != 0) {
                i12 = 0;
            }
            textView.setVisibility(i12);
            if (this.f38511r.getVisibility() == 0 && com.mbridge.msdk.foundation.feedback.b.b().a()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f38418c + "_1", this.f38513t);
            }
        }
        if (this.A != null && (rootView = getRootView()) != null) {
            this.A.removeFriendlyObstruction(rootView);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void preLoadData() {
        d();
        this.F = getBufferTimeout();
        String playURL = getPlayURL();
        this.J = playURL;
        if (this.f38423h && !TextUtils.isEmpty(playURL) && this.f38417b != null) {
            AdSession adSession = this.A;
            if (adSession != null) {
                adSession.registerAdView(this.f38509p);
                AdSession adSession2 = this.A;
                SoundImageView soundImageView = this.f38510q;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                adSession2.addFriendlyObstruction(soundImageView, friendlyObstructionPurpose, null);
                this.A.addFriendlyObstruction(this.f38511r, friendlyObstructionPurpose, null);
                this.A.addFriendlyObstruction(this.f38512s, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            d dVar = new d(this, this.f38515v, this.C);
            this.D = dVar;
            dVar.b(a(this.f38417b), getCDRate());
            this.f38509p.setDesk(false);
            this.f38509p.initBufferIngParam(this.F);
            soundOperate(this.E, -1, null);
        }
        P = false;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx != null && campaignEx.getVideoCompleteTime() > 0) {
            this.f38511r.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
            int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
            layoutParams.setMargins(iA, 0, 0, 0);
            this.f38511r.setPadding(iA, 0, iA, 0);
            this.f38511r.setLayoutParams(layoutParams);
            return;
        }
        this.f38511r.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_shape_progress", "drawable"));
        this.f38511r.setWidth(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getReady_rate() != -1) {
                return campaignEx.getReady_rate();
            }
            return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38418c, false).w();
        }
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f38418c, false).w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10, int i11) {
        if (i11 != 0) {
            try {
                return v0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return i11 + "";
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38517x = 0;
        this.f38518y = 0;
        this.f38519z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }
}
