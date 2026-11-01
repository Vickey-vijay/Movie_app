package com.bytedance.sdk.component.adexpress.le;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes11.dex */
public final class ksc extends LinearLayout {
    private LinearLayout fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.adsdk.vt.le f11507le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private TextView f11508lh;
    private TextView ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.tlj f11509ra;
    private com.bytedance.sdk.component.utils.ex vt;
    private ouw yu;

    public interface ouw {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
    }

    public final TextView getTopTextView() {
        return this.ouw;
    }

    public final LinearLayout getWriggleLayout() {
        return this.fkw;
    }

    public final View getWriggleProgressIv() {
        return this.f11507le;
    }

    public final void setOnShakeViewListener(ouw ouwVar) {
        this.yu = ouwVar;
    }

    public final void setShakeText(String str) {
        this.f11508lh.setText(str);
    }

    public ksc(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar) {
        super(context);
        this.f11509ra = tljVar;
        setClipChildren(false);
        addView(view);
        this.fkw = (LinearLayout) findViewById(2097610722);
        this.ouw = (TextView) findViewById(2097610719);
        this.f11508lh = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.vt.le leVar = (com.bytedance.adsdk.vt.le) findViewById(2097610706);
        this.f11507le = leVar;
        leVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.f11507le.setImageAssetsFolder("images/");
        this.f11507le.ouw(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.vt == null) {
                getContext().getApplicationContext();
                this.vt = new com.bytedance.sdk.component.utils.ex();
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.le.ksc.2
            };
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.vt.le leVar = this.f11507le;
            if (leVar != null) {
                leVar.vt.add(com.bytedance.adsdk.vt.le.yu.PLAY_OPTION);
                com.bytedance.adsdk.vt.bly blyVar = leVar.ouw;
                blyVar.f11085ra.clear();
                blyVar.vt.cancel();
                if (!blyVar.isVisible()) {
                    blyVar.f11081le = com.bytedance.adsdk.vt.bly.vt.NONE;
                }
            }
        } catch (Exception unused) {
        }
    }
}
