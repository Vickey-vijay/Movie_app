package io.bidmachine.nativead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.utils.ViewHelper;

/* JADX INFO: loaded from: classes2.dex */
class NativeAdContainer extends FrameLayout {

    @NonNull
    @VisibleForTesting
    public final FrameLayout innerContainer;

    @NonNull
    public final NativeAdOverlayContainer overlayContainer;

    @Nullable
    @VisibleForTesting
    public View previousConfiguredAdContainer;

    public NativeAdContainer(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view);
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
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

    public NativeAdContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        this.innerContainer.bringChildToFront(view);
    }

    public void configureContainer(@NonNull ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        super.removeView(this.innerContainer);
        ViewHelper.removeViewFromParent(this.innerContainer);
        ViewHelper.removeViewFromParent(viewGroup);
        removePreviousAdContainer();
        super.addView(viewGroup, 0, layoutParams);
        viewGroup.addView(this.innerContainer, 0, layoutParams);
        this.previousConfiguredAdContainer = viewGroup;
    }

    public void deConfigureContainer() {
        if (this.previousConfiguredAdContainer != null) {
            ViewHelper.removeViewFromParent(this.innerContainer);
            removePreviousAdContainer();
            super.addView(this.innerContainer, 0, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        this.innerContainer.removeAllViews();
    }

    public void removePreviousAdContainer() {
        View view = this.previousConfiguredAdContainer;
        if (view != null) {
            super.removeView(view);
            this.previousConfiguredAdContainer = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view == this.previousConfiguredAdContainer) {
            removePreviousAdContainer();
        } else {
            this.innerContainer.removeView(view);
        }
    }

    public NativeAdContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public NativeAdContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        FrameLayout frameLayout = new FrameLayout(context);
        this.innerContainer = frameLayout;
        NativeAdOverlayContainer nativeAdOverlayContainer = new NativeAdOverlayContainer(context);
        this.overlayContainer = nativeAdOverlayContainer;
        super.addView(frameLayout, -1, new FrameLayout.LayoutParams(-1, -1));
        super.addView(nativeAdOverlayContainer, -1, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i10);
        } else {
            super.addView(view, i10);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i10, i11);
        } else {
            super.addView(view, i10, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.innerContainer;
        if (view != frameLayout) {
            frameLayout.addView(view, i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }
}
