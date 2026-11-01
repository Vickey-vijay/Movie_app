package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public final class lh extends View implements ouw<lh> {
    private ouw<lh> ouw;

    public lh(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public final lh ouw(@NonNull vpp vppVar) {
        if (this.ouw != null) {
            return this;
        }
        TopLayoutDislike2 topLayoutDislike2Load = new TopLayoutDislike2(getContext()).load(vppVar);
        this.ouw = topLayoutDislike2Load;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ouw(topLayoutDislike2Load, (ViewGroup) parent);
        }
        return this;
    }

    private lh(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void clickSkip() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.clickSkip();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void clickSound(String str) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.clickSound(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final View getCloseButton() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            return ouwVar.getCloseButton();
        }
        return null;
    }

    public final View getITopLayout() {
        Object obj = this.ouw;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setCountDownFor1InN(CharSequence charSequence, int i10) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setCountDownFor1InN(charSequence, i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setListener(vt vtVar) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setListener(vtVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowDislike(boolean z10) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowDislike(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowEndCardNextAd(boolean z10, vpp vppVar) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowEndCardNextAd(z10, vppVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowPlayableNextAd(boolean z10, vpp vppVar) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowPlayableNextAd(z10, vppVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowSkip(boolean z10) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowSkip(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setShowSound(boolean z10) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setShowSound(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setSkipEnable(boolean z10) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setSkipEnable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setSkipInvisiable() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setSkipInvisiable();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setSkipText(CharSequence charSequence) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setSkipText(charSequence);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setSoundMute(boolean z10) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setSoundMute(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void setTime(CharSequence charSequence, CharSequence charSequence2) {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.setTime(charSequence, charSequence2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void showCloseButton() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.showCloseButton();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void showCountDownText() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.showCountDownText();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public final void showSkipButton() {
        ouw<lh> ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.showSkipButton();
        }
    }

    private lh(Context context, @Nullable AttributeSet attributeSet, byte b10) {
        super(context, attributeSet, 0);
        setVisibility(8);
        setWillNotDraw(true);
    }

    private void ouw(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
        if (view != null) {
            view.setId(rn.upp);
        }
    }
}
