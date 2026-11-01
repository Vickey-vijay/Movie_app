package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public class PAGLogoView extends LinearLayout {
    public int containerHeight;
    private com.bytedance.sdk.openadsdk.core.le.yu mAdLogo;
    private com.bytedance.sdk.openadsdk.core.le.pno mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public void initData(vpp vppVar) {
        if (vppVar == null) {
            return;
        }
        initData(vppVar.f12852hk);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.le.bly.ouw(this, layoutParams));
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, vpp vppVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(vppVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iOuw = osn.ouw(context, 2.0f);
        this.containerHeight = osn.ouw(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(osn.ouw(context, 14.0f), osn.ouw(context, 6.0f));
        layoutParams.leftMargin = iOuw;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iOuw;
        layoutParams2.rightMargin = iOuw;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iOuw);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.vt vtVar) {
        if (vtVar == null) {
            return;
        }
        if (vtVar.fkw) {
            this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(com.bytedance.sdk.openadsdk.core.zih.ouw(), "tt_ad_logo"));
        } else {
            String str = vtVar.ouw;
            if (TextUtils.isEmpty(str)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (str.contains("logo")) {
                    this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(com.bytedance.sdk.openadsdk.core.zih.ouw(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.tlj.yu.ouw.ouw(com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(str).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw()))).lh(1).ouw(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String str2 = vtVar.vt;
        if (vtVar.fkw) {
            this.mAdText.setText(com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(str2)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(str2);
            this.mAdText.setVisibility(0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @RequiresApi(api = 21)
    public PAGLogoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }
}
