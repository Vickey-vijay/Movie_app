package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes7.dex */
public abstract class tlj extends com.bytedance.sdk.openadsdk.core.le.lh {
    public com.bytedance.sdk.openadsdk.core.le.pno fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.le.pno f13218le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public zih f13219lh;
    public com.bytedance.sdk.openadsdk.core.le.lh ouw;
    public com.bytedance.sdk.openadsdk.core.le.yu vt;
    public com.bytedance.sdk.openadsdk.core.le.pno yu;

    public tlj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ouw(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public abstract void ouw(Context context);

    public static com.bytedance.sdk.openadsdk.core.le.lh fkw(Context context) {
        return new com.bytedance.sdk.openadsdk.core.le.lh(context);
    }

    public static com.bytedance.sdk.openadsdk.core.le.yu le(Context context) {
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        yuVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return yuVar;
    }

    public static PAGLogoView pno(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }

    public static zih ra(Context context) {
        zih zihVar = new zih(context);
        zihVar.setScaleType(ImageView.ScaleType.FIT_XY);
        zihVar.setBackgroundColor(0);
        return zihVar;
    }

    public FrameLayout getTtAdContainer() {
        return this.ouw;
    }

    public TextView getTtFullAdAppName() {
        return this.yu;
    }

    public TextView getTtFullAdDesc() {
        return this.fkw;
    }

    public TextView getTtFullAdDownload() {
        return this.f13218le;
    }

    public zih getTtFullAdIcon() {
        return this.f13219lh;
    }

    public ImageView getTtFullImg() {
        return this.vt;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno lh(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setMaxLines(1);
        pnoVar.setSingleLine();
        pnoVar.setTextColor(Color.parseColor("#FF999999"));
        pnoVar.setTextSize(2, 12.0f);
        return pnoVar;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno vt(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        pnoVar.setMaxLines(1);
        pnoVar.setTextColor(Color.parseColor("#FF999999"));
        pnoVar.setTextSize(2, 16.0f);
        return pnoVar;
    }

    public com.bytedance.sdk.openadsdk.core.le.pno yu(Context context) {
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        pnoVar.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_backup_btn_1"));
        pnoVar.setGravity(17);
        pnoVar.setText(vpp.ouw(context, "tt_video_download_apk"));
        pnoVar.setTextColor(-1);
        pnoVar.setTextSize(2, 14.0f);
        return pnoVar;
    }
}
