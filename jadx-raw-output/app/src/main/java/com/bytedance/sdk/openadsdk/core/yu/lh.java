package com.bytedance.sdk.openadsdk.core.yu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bly.rn;
import com.bytedance.sdk.openadsdk.core.bly.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes9.dex */
public final class lh extends yu {
    private int bly;
    private com.bytedance.sdk.openadsdk.ouw.ouw.vt pno;
    private int tlj;

    @Override // com.bytedance.sdk.openadsdk.core.yu.yu, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.yu.yu, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final com.bytedance.sdk.openadsdk.multipro.vt.ouw getVideoModel() {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            return ((th) qbpVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.yu.yu
    public final void lh() {
        th thVar = new th(this.ouw, this.f13201lh, this.yu, this.f13200le, this.f13202ra) { // from class: com.bytedance.sdk.openadsdk.core.yu.lh.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.th, com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me2) {
                DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
                return super.dispatchTouchEvent(me2);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.openadsdk.core.bly.th, com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
            public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
            public final com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw lh(int i10) {
                return lh.this.ouw(super.lh(i10));
            }
        };
        this.vt = thVar;
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh videoController = thVar.getVideoController();
        if (videoController != null) {
            videoController.hun = this.bly;
        }
        addView(this.vt, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.fkw;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            ((th) qbpVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.ouw.vt.lh() { // from class: com.bytedance.sdk.openadsdk.core.yu.lh.2
                @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
                public final void lh() {
                }

                @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
                public final void ouw() {
                }

                @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
                public final void vt() {
                    if (lh.this.tlj == 3) {
                        lh lhVar = lh.this;
                        lhVar.ouw(lhVar.pno);
                    } else if (lh.this.tlj == 2) {
                        lh.this.ouw();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.ouw.vt.lh
                public final void yu() {
                    if (lh.this.pno != null) {
                        lh.this.pno.ouw();
                    }
                }
            });
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.ouw.ouw.vt vtVar) {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            th thVar = (th) qbpVar;
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = thVar.f12564cf;
            if (leVar != null) {
                leVar.ryl();
            } else {
                rn rnVar = thVar.vt;
                if (rnVar != null) {
                    rnVar.ryl();
                }
            }
            this.pno = vtVar;
            this.tlj = 3;
        }
    }

    public final void vt() {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            com.bytedance.sdk.openadsdk.core.mwh.vt.lh videoController = ((th) qbpVar).getVideoController();
            if (videoController instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.lh) {
                videoController.fkw(true);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.yu.yu
    public final void yu() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.lh videoController;
        qbp qbpVar = this.vt;
        if ((qbpVar instanceof th) && (videoController = ((th) qbpVar).getVideoController()) != null) {
            this.bly = videoController.hun;
        }
        super.yu();
    }

    public lh(@NonNull Context context, vpp vppVar, AdSlot adSlot, boolean z10) {
        super(context, vppVar, adSlot, z10);
        this.bly = 1;
        this.tlj = -1;
    }

    public final void ouw() {
        qbp qbpVar = this.vt;
        if (qbpVar != null) {
            th thVar = (th) qbpVar;
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = thVar.f12564cf;
            if (leVar != null) {
                leVar.tlj();
            } else {
                rn rnVar = thVar.vt;
                if (rnVar != null) {
                    rnVar.tlj();
                }
            }
            this.tlj = 2;
        }
    }
}
