package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes5.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.le.lh {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
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

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
            sDislikeSendTip = vpp.ouw(contextOuw, "tt_feedback_thank_text") + "\n" + vpp.ouw(contextOuw, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = vpp.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = vpp.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = osn.ouw(getContext(), 75.0f);
        int iOuw = osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 16.0f);
        int iOuw2 = osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 12.0f);
        this.mTextView.setPadding(iOuw, iOuw2, iOuw, iOuw2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(GravityCompat.START);
        Drawable drawableLh = vpp.lh(getContext(), "tt_dislike_toast");
        int iOuw3 = osn.ouw(getContext(), 16.0f);
        drawableLh.setBounds(0, 0, iOuw3, iOuw3);
        this.mTextView.setCompoundDrawablePadding(iOuw3 / 2);
        this.mTextView.setCompoundDrawables(drawableLh, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }

    public static void onResourceUpdated() {
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        sSkipText = vpp.ouw(contextOuw, "tt_reward_screen_skip_tx");
        sDislikeTip = vpp.ouw(contextOuw, "tt_feedback_submit_text");
        sDislikeSendTip = vpp.ouw(contextOuw, "tt_feedback_thank_text") + "\n" + vpp.ouw(contextOuw, "tt_feedback_experience_text");
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public final void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public final void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }
}
