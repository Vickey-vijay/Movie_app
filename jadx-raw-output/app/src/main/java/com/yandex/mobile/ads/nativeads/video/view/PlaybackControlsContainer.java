package com.yandex.mobile.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackControlsContainer extends CorePlaybackControlsContainer {
    public PlaybackControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44979y, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public PlaybackControlsContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    public TextView getCountDownProgress() {
        View viewFindViewById = findViewById(R$id.video_count_down_control);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    public CheckBox getMuteControl() {
        View viewFindViewById = findViewById(R$id.video_mute_control);
        if (viewFindViewById instanceof CheckBox) {
            return (CheckBox) viewFindViewById;
        }
        return null;
    }

    @Override // com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer, yads.gl1
    public ProgressBar getVideoProgress() {
        View viewFindViewById = findViewById(R$id.video_progress_control);
        if (viewFindViewById instanceof ProgressBar) {
            return (ProgressBar) viewFindViewById;
        }
        return null;
    }
}
