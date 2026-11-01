package com.mbridge.msdk.video.module.listener.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: VideoViewDefaultListener.java */
/* JADX INFO: loaded from: classes8.dex */
public class m extends o {
    private Timer A;
    private Handler B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private MBridgeVideoView.u H;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private MBridgeVideoView f39083x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private MBridgeContainerView f39084y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f39085z;

    /* JADX INFO: compiled from: VideoViewDefaultListener.java */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VideoViewDefaultListener.java */
        public class RunnableC0409a implements Runnable {
            public RunnableC0409a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m.this.f39084y.showVideoClickView(-1);
                m.this.f39083x.soundOperate(0, 2);
            }
        }

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                m.this.B.post(new RunnableC0409a());
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    th2.printStackTrace();
                }
            }
        }
    }

    public m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, int i10, int i11, com.mbridge.msdk.video.module.listener.a aVar2, int i12, boolean z10, int i13) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i12, z10);
        this.B = new Handler();
        this.C = false;
        this.D = false;
        this.E = false;
        this.f39083x = mBridgeVideoView;
        this.f39084y = mBridgeContainerView;
        this.G = i10;
        this.f39085z = i11;
        this.F = i13;
        if (mBridgeVideoView != null) {
            this.C = mBridgeVideoView.getVideoSkipTime() == 0;
        }
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f39066a = false;
        }
    }

    private void n() {
        try {
            Timer timer = this.A;
            if (timer != null) {
                timer.cancel();
                this.A = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void o() {
        CampaignEx campaignEx = this.f39067b;
        if (campaignEx == null || campaignEx.getDynamicTempCode() != 5) {
            return;
        }
        CampaignEx campaignEx2 = null;
        MBridgeVideoView mBridgeVideoView = this.f39083x;
        if (mBridgeVideoView != null && mBridgeVideoView.mCampOrderViewData != null) {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f39083x.mCampOrderViewData.size(); i11++) {
                if (this.f39083x.mCampOrderViewData.get(i11) != null && this.f39083x.mCampOrderViewData.get(i11).getId() == this.f39067b.getId()) {
                    i10 = i11 - 1;
                    break;
                }
            }
            if (i10 >= 0 && this.f39083x.mCampOrderViewData.get(i10) != null) {
                campaignEx2 = this.f39083x.mCampOrderViewData.get(i10);
            }
        }
        if (campaignEx2 != null) {
            MBridgeVideoView mBridgeVideoView2 = this.f39083x;
            if (mBridgeVideoView2 != null) {
                mBridgeVideoView2.setCampaign(campaignEx2);
            }
            MBridgeContainerView mBridgeContainerView = this.f39084y;
            if (mBridgeContainerView != null) {
                mBridgeContainerView.setCampaign(campaignEx2);
            }
            a(campaignEx2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0253  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0273  */
    /* JADX WARN: Code duplicated, block: B:128:0x027a  */
    /* JADX WARN: Code duplicated, block: B:156:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:171:0x033a  */
    /* JADX WARN: Code duplicated, block: B:173:0x033e  */
    /* JADX WARN: Code duplicated, block: B:179:0x035b  */
    @Override // com.mbridge.msdk.video.module.listener.impl.o, com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        CampaignEx campaignEx;
        CampaignEx campaignEx2;
        int bufferTimeout;
        String playURL;
        int i11;
        if (this.f39066a) {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f39083x.dismissAllAlert();
                    SpecialsBridge.MBridgeVideoView_videoOperate(this.f39083x, 3);
                    campaignEx = this.f39067b;
                    if (campaignEx == null && campaignEx.isDynamicView() && this.f39067b.getDynamicTempCode() == 5) {
                        if (this.f39084y != null) {
                            MBridgeVideoView mBridgeVideoView = this.f39083x;
                            if (mBridgeVideoView.mCurrPlayNum == mBridgeVideoView.mCampaignSize) {
                                if (this.f39067b.getAdSpaceT() == 2) {
                                    i10 = 16;
                                } else {
                                    this.f39084y.setRewardStatus(true);
                                    this.f39084y.showOrderCampView();
                                }
                            }
                        }
                        com.mbridge.msdk.video.bt.module.orglistener.f.a(this.f39067b, this.f39072g, this.f39083x.mCurrentPlayProgressTime);
                        if (this.G == 2) {
                            i10 = 16;
                        } else {
                            i10 = 16;
                        }
                    } else if (this.G == 2 || this.f39084y.endCardShowing() || this.f39067b.getAdSpaceT() == 2) {
                        i10 = 16;
                    } else {
                        this.f39084y.showEndcard(this.f39067b.getVideo_end_type());
                    }
                } else if (i10 != 5) {
                    if (i10 == 6) {
                        this.f39083x.dismissAllAlert();
                        SpecialsBridge.MBridgeVideoView_videoOperate(this.f39083x, 3);
                        campaignEx = this.f39067b;
                        if (campaignEx == null) {
                            if (this.G == 2) {
                                i10 = 16;
                            } else {
                                i10 = 16;
                            }
                        } else if (this.G == 2) {
                            i10 = 16;
                        } else {
                            i10 = 16;
                        }
                    } else if (i10 == 8) {
                        MBridgeContainerView mBridgeContainerView = this.f39084y;
                        if (mBridgeContainerView == null) {
                            MBridgeVideoView mBridgeVideoView2 = this.f39083x;
                            if (mBridgeVideoView2 != null) {
                                mBridgeVideoView2.showAlertView();
                            }
                        } else if (mBridgeContainerView.showAlertWebView()) {
                            MBridgeVideoView mBridgeVideoView3 = this.f39083x;
                            if (mBridgeVideoView3 != null) {
                                mBridgeVideoView3.alertWebViewShowed();
                            }
                        } else {
                            MBridgeVideoView mBridgeVideoView4 = this.f39083x;
                            if (mBridgeVideoView4 != null) {
                                mBridgeVideoView4.showAlertView();
                            }
                        }
                    } else if (i10 != 20) {
                        switch (i10) {
                            case 10:
                                this.D = true;
                                this.f39083x.soundOperate(0, 2);
                                this.f39083x.progressOperate(0, 2);
                                break;
                            case 11:
                                SpecialsBridge.MBridgeVideoView_videoOperate(this.f39083x, 3);
                                this.f39083x.dismissAllAlert();
                                CampaignEx campaignEx3 = this.f39067b;
                                if (campaignEx3 == null || campaignEx3.getVideo_end_type() == 3 || this.f39067b.getRewardTemplateMode() == null || this.f39067b.getRewardTemplateMode().k() == 5002010) {
                                    this.f39083x.setVisibility(0);
                                } else if (this.f39067b.getAdSpaceT() != 2) {
                                    this.f39083x.setVisibility(8);
                                }
                                CampaignEx campaignEx4 = this.f39067b;
                                if (campaignEx4 != null && campaignEx4.getDynamicTempCode() == 5) {
                                    MBridgeVideoView mBridgeVideoView5 = this.f39083x;
                                    if (mBridgeVideoView5.mCurrPlayNum != mBridgeVideoView5.mCampaignSize) {
                                        campaignEx2 = this.f39067b;
                                        if (campaignEx2 == null) {
                                            if (this.f39067b.getAdSpaceT() != 2) {
                                                this.f39084y.showEndcard(this.f39067b.getVideo_end_type());
                                            } else {
                                                this.f39084y.showVideoEndCover();
                                            }
                                        } else if (this.f39067b.getAdSpaceT() != 2) {
                                            this.f39084y.showEndcard(this.f39067b.getVideo_end_type());
                                        } else {
                                            this.f39084y.showVideoEndCover();
                                        }
                                    } else {
                                        MBridgeContainerView mBridgeContainerView2 = this.f39084y;
                                        if (mBridgeContainerView2 != null) {
                                            mBridgeContainerView2.setRewardStatus(true);
                                            this.f39084y.showOrderCampView();
                                        }
                                    }
                                } else {
                                    campaignEx2 = this.f39067b;
                                    if (campaignEx2 == null || campaignEx2.getRewardTemplateMode() == null || this.f39067b.getRewardTemplateMode().k() != 5002010) {
                                        if (this.f39067b.getAdSpaceT() != 2) {
                                            this.f39084y.showEndcard(this.f39067b.getVideo_end_type());
                                        } else {
                                            this.f39084y.showVideoEndCover();
                                        }
                                    }
                                }
                                break;
                            case 12:
                                k();
                                SpecialsBridge.MBridgeVideoView_videoOperate(this.f39083x, 3);
                                this.f39083x.dismissAllAlert();
                                if (this.f39067b.getVideo_end_type() != 3) {
                                    this.f39083x.setVisibility(8);
                                } else {
                                    this.f39083x.setVisibility(0);
                                }
                                if (this.D || this.F != 0) {
                                    if (this.f39067b.isDynamicView() && this.f39067b.getDynamicTempCode() == 5 && TextUtils.isEmpty(this.f39067b.getendcard_url())) {
                                        o();
                                        this.F = 0;
                                    }
                                    if (!this.D && this.F == 1) {
                                        j();
                                        h();
                                        i();
                                        if (s0.a().a("i_l_s_t_r_i", false) && !this.E) {
                                            this.E = true;
                                            MBridgeVideoView.u uVar = this.H;
                                            if (uVar != null) {
                                                uVar.a();
                                            }
                                        }
                                    }
                                    if (this.f39067b.getAdSpaceT() == 2) {
                                        this.f39084y.showVideoEndCover();
                                    } else {
                                        this.f39084y.showEndcard(this.f39067b.getVideo_end_type());
                                    }
                                }
                                break;
                            case 13:
                                MBridgeVideoView mBridgeVideoView6 = this.f39083x;
                                if (mBridgeVideoView6 != null) {
                                    mBridgeVideoView6.closeVideoOperate(0, 2);
                                    playURL = this.f39083x.getPlayURL();
                                    bufferTimeout = this.f39083x.getBufferTimeout();
                                } else {
                                    bufferTimeout = -1;
                                    playURL = "";
                                }
                                CampaignEx campaignEx5 = this.f39067b;
                                String videoUrlEncode = campaignEx5 != null ? campaignEx5.getVideoUrlEncode() : "";
                                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                                eVar.a("play_url", playURL);
                                eVar.a("video_url", videoUrlEncode);
                                eVar.a("timeout", Integer.valueOf(bufferTimeout));
                                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_video_buffer_timeout", this.f39067b, eVar);
                                break;
                            case 14:
                                if (!this.C) {
                                    this.f39083x.closeVideoOperate(0, 1);
                                }
                                break;
                            case 15:
                                if (obj != null && (obj instanceof MBridgeVideoView.v)) {
                                    MBridgeVideoView.v vVar = (MBridgeVideoView.v) obj;
                                    int videoInteractiveType = this.f39084y.getVideoInteractiveType();
                                    if (this.f39067b.getAdSpaceT() == 2) {
                                        SoundImageView soundImageView = this.f39083x.mSoundImageView;
                                        if (soundImageView != null && (soundImageView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f39083x.mSoundImageView.getLayoutParams();
                                            layoutParams.setMargins(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f), 0, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 85.0f));
                                            this.f39083x.mSoundImageView.setLayoutParams(layoutParams);
                                        }
                                        TextView textView = this.f39083x.tvFlag;
                                        if (textView != null && (textView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f39083x.tvFlag.getLayoutParams();
                                            layoutParams2.setMargins(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f), 0, 0, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 85.0f));
                                            this.f39083x.tvFlag.setVisibility(0);
                                            this.f39083x.tvFlag.setLayoutParams(layoutParams2);
                                        }
                                        this.f39084y.showVideoClickView(1);
                                    } else if (videoInteractiveType >= 0 && vVar.f39034a >= videoInteractiveType) {
                                        this.f39084y.showVideoClickView(1);
                                        this.f39083x.soundOperate(0, 1);
                                    }
                                    this.C = vVar.f39036c;
                                    if (this.f39067b.getDynamicTempCode() != 5) {
                                        int i12 = this.f39085z;
                                        if (((i12 >= 0 && ((i11 = vVar.f39034a) >= i12 || i11 == vVar.f39035b)) || (this.f39067b.getVideoCompleteTime() > 0 && (vVar.f39034a > this.f39067b.getVideoCompleteTime() || vVar.f39034a == vVar.f39035b))) && !this.C) {
                                            this.f39083x.closeVideoOperate(0, 2);
                                            this.C = true;
                                        }
                                    } else {
                                        a(vVar.f39034a, vVar.f39035b);
                                    }
                                }
                                break;
                        }
                    } else if (s0.a().a("i_l_s_t_r_i", false) && (obj instanceof MBridgeVideoView.u)) {
                        this.H = (MBridgeVideoView.u) obj;
                    }
                } else if (obj != null && (obj instanceof Integer)) {
                    this.f39083x.soundOperate((((Integer) obj).intValue() == 1 ? 2 : 1).intValue(), -1);
                }
            } else if (!this.f39084y.endCardShowing()) {
                int videoInteractiveType2 = this.f39084y.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.f39084y.isLast()) {
                            this.f39084y.showVideoClickView(1);
                            this.f39083x.soundOperate(0, 1);
                            p();
                        } else {
                            this.f39084y.showVideoClickView(-1);
                            this.f39083x.soundOperate(0, 2);
                            n();
                        }
                    }
                } else if (this.f39084y.miniCardLoaded()) {
                    this.f39084y.showVideoClickView(2);
                }
            }
        }
        super.a(i10, obj);
    }

    private void p() {
        try {
            n();
            this.A = new Timer();
            this.A.schedule(new a(), 3000L);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(int i10, int i11) {
        CampaignEx campaignEx;
        if (this.C || this.f39083x == null || (campaignEx = this.f39067b) == null) {
            return;
        }
        int i12 = this.f39085z;
        int i13 = (i12 < 0 || i10 < i12) ? 1 : 2;
        if (i13 != 2 && (campaignEx.getVideoCompleteTime() != 0 ? i10 > this.f39067b.getVideoCompleteTime() : this.f39083x.mCurrPlayNum > 1)) {
            i13 = 2;
        }
        if (i13 != 2 && this.f39083x.mCurrPlayNum > 1 && i10 == i11) {
            i13 = 2;
        }
        if (i13 == 2) {
            this.f39083x.closeVideoOperate(0, i13);
            this.C = true;
        }
    }
}
