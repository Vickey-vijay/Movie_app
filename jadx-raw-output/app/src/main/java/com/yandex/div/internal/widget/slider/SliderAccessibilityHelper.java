package com.yandex.div.internal.widget.slider;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.yandex.div.R$string;
import ek.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SliderAccessibilityHelper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SliderAccessibilityHelper extends ExploreByTouchHelper {
    private final Rect bounds;
    private final SliderView slider;

    /* JADX INFO: compiled from: SliderAccessibilityHelper.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SliderView.Thumb.values().length];
            try {
                iArr[SliderView.Thumb.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SliderView.Thumb.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void updateBounds(int i10) {
        int boundsWidth;
        int boundsHeight;
        if (i10 == 1) {
            SliderView.Companion companion = SliderView.Companion;
            boundsWidth = companion.getBoundsWidth(this.slider.getThumbSecondaryDrawable());
            boundsHeight = companion.getBoundsHeight(this.slider.getThumbSecondaryDrawable());
        } else {
            SliderView.Companion companion2 = SliderView.Companion;
            boundsWidth = companion2.getBoundsWidth(this.slider.getThumbDrawable());
            boundsHeight = companion2.getBoundsHeight(this.slider.getThumbDrawable());
        }
        int positionInView$div_release = this.slider.getPositionInView$div_release(toThumbValue(i10));
        Rect rect = this.bounds;
        rect.left = positionInView$div_release;
        rect.right = positionInView$div_release + boundsWidth;
        rect.top = (((this.slider.getHeight() + this.slider.getPaddingTop()) - this.slider.getPaddingBottom()) - boundsHeight) / 2;
        rect.bottom = (((this.slider.getHeight() + this.slider.getPaddingTop()) - this.slider.getPaddingBottom()) + boundsHeight) / 2;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void getVisibleVirtualViews(List<Integer> list) {
        list.add(0);
        Float thumbSecondaryValue = this.slider.getThumbSecondaryValue();
        if (thumbSecondaryValue != null) {
            thumbSecondaryValue.floatValue();
            list.add(1);
        }
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    private final int getStep() {
        return Math.max(b.b(((double) (this.slider.getMaxValue() - this.slider.getMinValue())) * 0.05d), 1);
    }

    private final void setThumbValue(int i10, float f10) {
        this.slider.setValueToAccessibilityThumb$div_release(toThumb(i10), f10);
        sendEventForVirtualView(i10, 4);
        invalidateVirtualView(i10);
    }

    private final String startOrEndDescription(int i10) {
        if (this.slider.getThumbSecondaryValue() == null) {
            return "";
        }
        if (i10 == 0) {
            return this.slider.getContext().getString(R$string.div_slider_range_start);
        }
        return i10 == 1 ? this.slider.getContext().getString(R$string.div_slider_range_end) : "";
    }

    private final SliderView.Thumb toThumb(int i10) {
        if (i10 == 0) {
            return SliderView.Thumb.THUMB;
        }
        return this.slider.getThumbSecondaryValue() != null ? SliderView.Thumb.THUMB_SECONDARY : SliderView.Thumb.THUMB;
    }

    private final float toThumbValue(int i10) {
        if (i10 == 0) {
            return this.slider.getThumbValue();
        }
        Float thumbSecondaryValue = this.slider.getThumbSecondaryValue();
        return thumbSecondaryValue != null ? thumbSecondaryValue.floatValue() : this.slider.getThumbValue();
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public int getVirtualViewAt(float f10, float f11) {
        if (f10 < this.slider.getPaddingLeft()) {
            return 0;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.slider.getClosestThumb$div_release((int) f10).ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
        float thumbValue;
        if (i11 == 4096) {
            thumbValue = toThumbValue(i10) + getStep();
        } else if (i11 == 8192) {
            thumbValue = toThumbValue(i10) - getStep();
        } else {
            if (i11 != 16908349) {
                return false;
            }
            if (!(bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                return false;
            }
            thumbValue = bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE);
        }
        setThumbValue(i10, thumbValue);
        return true;
    }

    @Override // androidx.customview.widget.ExploreByTouchHelper
    public void onPopulateNodeForVirtualView(int i10, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
        accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(0, this.slider.getMinValue(), this.slider.getMaxValue(), toThumbValue(i10)));
        StringBuilder sb2 = new StringBuilder();
        CharSequence contentDescription = this.slider.getContentDescription();
        if (contentDescription != null) {
            sb2.append(contentDescription);
            sb2.append(StringUtils.COMMA);
        }
        sb2.append(startOrEndDescription(i10));
        accessibilityNodeInfoCompat.setContentDescription(sb2.toString());
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
        updateBounds(i10);
        accessibilityNodeInfoCompat.setBoundsInParent(this.bounds);
    }

    public SliderAccessibilityHelper(SliderView sliderView) {
        super(sliderView);
        this.slider = sliderView;
        this.bounds = new Rect();
        ViewCompat.setAccessibilityDelegate(sliderView, this);
        sliderView.setAccessibilityLiveRegion(1);
    }
}
