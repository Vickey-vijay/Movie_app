package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lh extends com.bytedance.sdk.openadsdk.core.le.ra {
    public zih bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.pno f12245cf;
    public com.bytedance.sdk.openadsdk.core.le.pno fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public zih f12246le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.yu f12247lh;
    public com.bytedance.sdk.openadsdk.core.le.yu ouw;
    public final ra pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.pno f12248ra;
    public com.bytedance.sdk.openadsdk.core.widget.lh ryl;
    public com.bytedance.sdk.openadsdk.core.le.pno tlj;
    public com.bytedance.sdk.openadsdk.core.le.lh vt;
    public PAGLogoView yu;

    @Override // com.bytedance.sdk.openadsdk.core.le.ra, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public abstract com.bytedance.sdk.openadsdk.core.le.yu getAdIconView();

    public abstract com.bytedance.sdk.openadsdk.core.le.pno getAdTitleTextView();

    public com.bytedance.sdk.openadsdk.core.le.fkw getOverlayLayout() {
        return null;
    }

    public abstract rn getScoreBar();

    public abstract View getUserInfo();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.ra, android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public PAGLogoView getAdLogo() {
        return this.yu;
    }

    public com.bytedance.sdk.openadsdk.core.le.yu getBackImage() {
        return this.ouw;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getClickButton() {
        return this.fkw;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getContent() {
        return this.f12245cf;
    }

    public com.bytedance.sdk.openadsdk.core.widget.lh getDspAdChoice() {
        return this.ryl;
    }

    public zih getHostAppIcon() {
        return this.f12246le;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getHostAppName() {
        return this.f12248ra;
    }

    public zih getIconOnlyView() {
        return this.bly;
    }

    public com.bytedance.sdk.openadsdk.core.le.yu getImageView() {
        return this.f12247lh;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getTitle() {
        return this.tlj;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno getTopCountDown() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopCountDown();
        }
        return null;
    }

    public View getTopDisLike() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopDislike();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.le.yu getTopSkip() {
        ra raVar = this.pno;
        if (raVar != null) {
            return raVar.getTopSkip();
        }
        return null;
    }

    public com.bytedance.sdk.openadsdk.core.le.lh getVideoContainer() {
        return this.vt;
    }

    public lh(Context context) {
        super(context);
        this.pno = new ra(context);
    }
}
