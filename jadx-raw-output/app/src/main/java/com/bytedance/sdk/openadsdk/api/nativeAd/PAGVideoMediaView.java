package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.lh.ouw;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.utils.yu;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public class PAGVideoMediaView extends PAGMediaView implements ouw.InterfaceC0125ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.ouw.vt.ouw f12195lh;
    private le vt;
    private vpp yu;

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        le leVar = this.vt;
        if (leVar != null) {
            leVar.mwh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.lh.ouw.InterfaceC0125ouw
    public long getVideoProgress() {
        le leVar = this.vt;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.vt.getNativeVideoController().bly;
    }

    public void handleInterruptVideo() {
        le leVar;
        le leVar2 = this.vt;
        if ((leVar2 != null ? leVar2.tlj() : false) || (leVar = this.vt) == null) {
            return;
        }
        leVar.ryl();
    }

    public void setMaterialMeta(vpp vppVar) {
        this.yu = vppVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar = this.f12195lh;
        if (ouwVar == null) {
            return;
        }
        ouwVar.ouw(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    public PAGVideoMediaView(Context context, @Nullable View view, @Nullable com.bytedance.sdk.openadsdk.ouw.vt.ouw ouwVar) {
        super(context);
        if (view instanceof le) {
            le leVar = (le) view;
            this.vt = leVar;
            addView(leVar, -1, -1);
        }
        this.f12195lh = ouwVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu.ouw(this, this.yu);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof ouw) {
            ((ouw) onClickListener).ouw((ouw.InterfaceC0125ouw) this);
        }
    }
}
