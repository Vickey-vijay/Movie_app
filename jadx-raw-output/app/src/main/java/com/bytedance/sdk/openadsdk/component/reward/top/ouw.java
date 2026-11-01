package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes11.dex */
public interface ouw<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i10);

    void setListener(vt vtVar);

    void setShowDislike(boolean z10);

    void setShowEndCardNextAd(boolean z10, vpp vppVar);

    void setShowPlayableNextAd(boolean z10, vpp vppVar);

    void setShowSkip(boolean z10);

    void setShowSound(boolean z10);

    void setSkipEnable(boolean z10);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z10);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
