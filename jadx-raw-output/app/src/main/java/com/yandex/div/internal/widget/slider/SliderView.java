package com.yandex.div.internal.widget.slider;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Px;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.slider.SliderView;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import ek.b;
import ik.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mj.r;

/* JADX INFO: compiled from: SliderView.kt */
/* JADX INFO: loaded from: classes.dex */
public class SliderView extends View {
    public static final Companion Companion = new Companion(null);
    private final SliderAccessibilityHelper a11yHelper;
    private final ActiveRange activeRange;
    private Drawable activeTickMarkDrawable;
    private Drawable activeTrackDrawable;
    private long animationDuration;
    private boolean animationEnabled;
    private AccelerateDecelerateInterpolator animationInterpolator;
    private final SliderThumbAnimatorListener animatorListener;
    private final SliderThumbAnimatorListener animatorSecondaryListener;
    private Drawable inactiveTickMarkDrawable;
    private Drawable inactiveTrackDrawable;
    private boolean interactive;
    private float interceptionAngle;
    private float interceptionAngleTg;
    private final ObserverList<ChangedListener> listeners;
    private int maxTickmarkOrThumbWidth;
    private float maxValue;
    private float minValue;
    private Float prevThumbSecondaryValue;
    private float prevThumbValue;
    private float prevX;
    private float prevY;
    private final List<Range> ranges;
    private ValueAnimator sliderAnimator;
    private final SliderDrawDelegate sliderDrawDelegate;
    private ValueAnimator sliderSecondaryAnimator;
    private Drawable thumbDrawable;
    private Thumb thumbOnTouch;
    private TextDrawable thumbSecondTextDrawable;
    private Drawable thumbSecondaryDrawable;
    private Float thumbSecondaryValue;
    private TextDrawable thumbTextDrawable;
    private float thumbValue;
    private Integer touchSlop;

    /* JADX INFO: compiled from: SliderView.kt */
    public final class ActiveRange {
        public ActiveRange() {
        }

        private final float max(float f10, Float f11) {
            if (f11 == null) {
                return f10;
            }
            f11.floatValue();
            return Math.max(f10, f11.floatValue());
        }

        private final float min(float f10, Float f11) {
            if (f11 == null) {
                return f10;
            }
            f11.floatValue();
            return Math.min(f10, f11.floatValue());
        }

        public final float getEnd() {
            return !SliderView.this.isThumbSecondaryEnabled() ? SliderView.this.getThumbValue() : max(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }

        public final float getStart() {
            return !SliderView.this.isThumbSecondaryEnabled() ? SliderView.this.getMinValue() : min(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }
    }

    /* JADX INFO: compiled from: SliderView.kt */
    public interface ChangedListener {
        default void onThumbSecondaryValueChanged(Float f10) {
        }

        default void onThumbValueChanged(float f10) {
        }
    }

    /* JADX INFO: compiled from: SliderView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final int getBoundsHeight(Drawable drawable) {
            Rect bounds;
            if (drawable == null || (bounds = drawable.getBounds()) == null) {
                return 0;
            }
            return bounds.height();
        }

        public final int getBoundsWidth(Drawable drawable) {
            Rect bounds;
            if (drawable == null || (bounds = drawable.getBounds()) == null) {
                return 0;
            }
            return bounds.width();
        }
    }

    /* JADX INFO: compiled from: SliderView.kt */
    public static final class Range {
        private Drawable activeTrackDrawable;

        @Px
        private int endPosition;
        private float endValue;
        private Drawable inactiveTrackDrawable;

        @Px
        private int marginEnd;

        @Px
        private int marginStart;

        @Px
        private int startPosition;
        private float startValue;

        public final Drawable getActiveTrackDrawable() {
            return this.activeTrackDrawable;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final float getEndValue() {
            return this.endValue;
        }

        public final Drawable getInactiveTrackDrawable() {
            return this.inactiveTrackDrawable;
        }

        public final int getMarginEnd() {
            return this.marginEnd;
        }

        public final int getMarginStart() {
            return this.marginStart;
        }

        public final int getStartPosition() {
            return this.startPosition;
        }

        public final float getStartValue() {
            return this.startValue;
        }

        public final void setActiveTrackDrawable(Drawable drawable) {
            this.activeTrackDrawable = drawable;
        }

        public final void setEndPosition(int i10) {
            this.endPosition = i10;
        }

        public final void setEndValue(float f10) {
            this.endValue = f10;
        }

        public final void setInactiveTrackDrawable(Drawable drawable) {
            this.inactiveTrackDrawable = drawable;
        }

        public final void setMarginEnd(int i10) {
            this.marginEnd = i10;
        }

        public final void setMarginStart(int i10) {
            this.marginStart = i10;
        }

        public final void setStartPosition(int i10) {
            this.startPosition = i10;
        }

        public final void setStartValue(float f10) {
            this.startValue = f10;
        }
    }

    /* JADX INFO: compiled from: SliderView.kt */
    public enum Thumb {
        THUMB,
        THUMB_SECONDARY
    }

    /* JADX INFO: compiled from: SliderView.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Thumb.values().length];
            try {
                iArr[Thumb.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Thumb.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SliderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SliderView(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Px
    private final int toPosition(float f10, int i10) {
        return b.c((getTrackLength(i10) / (this.maxValue - this.minValue)) * (ViewsKt.isLayoutRtl(this) ? this.maxValue - f10 : f10 - this.minValue));
    }

    public final int getPositionInView$div_release(float f10) {
        return toPosition$default(this, f10, 0, 1, null) + getPaddingLeft();
    }

    public final void setThumbSecondaryValue(Float f10, boolean z10) {
        trySetThumbSecondaryValue(f10, z10, true);
    }

    public final void setThumbValue(float f10, boolean z10) {
        trySetThumbValue(f10, z10, true);
    }

    public SliderView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.sliderDrawDelegate = new SliderDrawDelegate();
        this.listeners = new ObserverList<>();
        this.animatorListener = new SliderThumbAnimatorListener(new l<Boolean, r>() { // from class: com.yandex.div.internal.widget.slider.SliderView$animatorListener$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f64562a;
            }

            public final void invoke(boolean z10) {
                this.this$0.sliderAnimator = null;
                if (z10) {
                    return;
                }
                SliderView sliderView = this.this$0;
                sliderView.notifyThumbChangedListeners(Float.valueOf(sliderView.prevThumbValue), this.this$0.getThumbValue());
            }
        });
        this.animatorSecondaryListener = new SliderThumbAnimatorListener(new l<Boolean, r>() { // from class: com.yandex.div.internal.widget.slider.SliderView$animatorSecondaryListener$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f64562a;
            }

            public final void invoke(boolean z10) {
                this.this$0.sliderSecondaryAnimator = null;
                if (z10) {
                    return;
                }
                SliderView sliderView = this.this$0;
                sliderView.notifyThumbSecondaryChangedListeners(sliderView.prevThumbSecondaryValue, this.this$0.getThumbSecondaryValue());
            }
        });
        this.ranges = new ArrayList();
        this.animationDuration = 300L;
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        this.animationEnabled = true;
        this.maxValue = 100.0f;
        this.thumbValue = this.minValue;
        this.a11yHelper = new SliderAccessibilityHelper(this);
        this.maxTickmarkOrThumbWidth = -1;
        this.activeRange = new ActiveRange();
        this.thumbOnTouch = Thumb.THUMB;
        this.interactive = true;
        this.interceptionAngle = 45.0f;
        this.interceptionAngleTg = (float) Math.tan(45.0f);
    }

    private final int getMaxTickmarkOrThumbWidth() {
        if (this.maxTickmarkOrThumbWidth == -1) {
            Companion companion = Companion;
            this.maxTickmarkOrThumbWidth = Math.max(Math.max(companion.getBoundsWidth(this.activeTickMarkDrawable), companion.getBoundsWidth(this.inactiveTickMarkDrawable)), Math.max(companion.getBoundsWidth(this.thumbDrawable), companion.getBoundsWidth(this.thumbSecondaryDrawable)));
        }
        return this.maxTickmarkOrThumbWidth;
    }

    private final float getTouchValue(int i10) {
        return (this.inactiveTickMarkDrawable == null && this.activeTickMarkDrawable == null) ? toValue(i10) : b.c(toValue(i10));
    }

    public static /* synthetic */ int getTrackLength$default(SliderView sliderView, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrackLength");
        }
        if ((i11 & 1) != 0) {
            i10 = sliderView.getWidth();
        }
        return sliderView.getTrackLength(i10);
    }

    private final float inBoarders(float f10) {
        return Math.min(Math.max(f10, this.minValue), this.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThumbSecondaryEnabled() {
        return this.thumbSecondaryValue != null;
    }

    private static final void onDraw$lambda$10$drawTrackPart(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i10, int i11) {
        sliderView.sliderDrawDelegate.drawTrackPart(canvas, drawable, i10, i11);
    }

    public static /* synthetic */ void onDraw$lambda$10$drawTrackPart$default(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw$lambda$10$drawTrackPart");
        }
        if ((i12 & 16) != 0) {
            i10 = range.getStartPosition();
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            i11 = range.getEndPosition();
        }
        onDraw$lambda$10$drawTrackPart(range, sliderView, canvas, drawable, i13, i11);
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
    }

    private final void setThumbsInBoarders() {
        trySetThumbValue(inBoarders(this.thumbValue), false, true);
        if (isThumbSecondaryEnabled()) {
            Float f10 = this.thumbSecondaryValue;
            trySetThumbSecondaryValue(f10 != null ? Float.valueOf(inBoarders(f10.floatValue())) : null, false, true);
        }
    }

    private final void setThumbsOnTickMarks() {
        trySetThumbValue(b.c(this.thumbValue), false, true);
        Float f10 = this.thumbSecondaryValue;
        if (f10 != null) {
            trySetThumbSecondaryValue(Float.valueOf(b.c(f10.floatValue())), false, true);
        }
    }

    private final void setValueToThumb(Thumb thumb, float f10, boolean z10, boolean z11) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[thumb.ordinal()];
        if (i10 == 1) {
            trySetThumbValue(f10, z10, z11);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            trySetThumbSecondaryValue(Float.valueOf(f10), z10, z11);
        }
    }

    public static /* synthetic */ void setValueToThumb$default(SliderView sliderView, Thumb thumb, float f10, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValueToThumb");
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        sliderView.setValueToThumb(thumb, f10, z10, z11);
    }

    public static /* synthetic */ int toPosition$default(SliderView sliderView, float f10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPosition");
        }
        if ((i11 & 1) != 0) {
            i10 = sliderView.getWidth();
        }
        return sliderView.toPosition(f10, i10);
    }

    private final float toValue(int i10) {
        float f10 = this.minValue;
        float trackLength$default = (i10 * (this.maxValue - f10)) / getTrackLength$default(this, 0, 1, null);
        if (ViewsKt.isLayoutRtl(this)) {
            trackLength$default = (this.maxValue - trackLength$default) - 1;
        }
        return f10 + trackLength$default;
    }

    private final void trySetThumbSecondaryValue(Float f10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator;
        Float f11;
        Float fValueOf = f10 != null ? Float.valueOf(inBoarders(f10.floatValue())) : null;
        if (p.d(this.thumbSecondaryValue, fValueOf)) {
            return;
        }
        if (!z10 || !this.animationEnabled || (f11 = this.thumbSecondaryValue) == null || fValueOf == null) {
            if (z11 && (valueAnimator = this.sliderSecondaryAnimator) != null) {
                valueAnimator.cancel();
            }
            if (z11 || this.sliderSecondaryAnimator == null) {
                Float f12 = this.thumbSecondaryValue;
                this.prevThumbSecondaryValue = f12;
                this.thumbSecondaryValue = fValueOf;
                notifyThumbSecondaryChangedListeners(f12, fValueOf);
            }
        } else {
            ValueAnimator valueAnimator2 = this.sliderSecondaryAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbSecondaryValue = f11;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            Float f13 = this.thumbSecondaryValue;
            p.g(f13);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f13.floatValue(), fValueOf.floatValue());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: je.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbSecondaryValue$lambda$5$lambda$4(this.f61767b, valueAnimator3);
                }
            });
            valueAnimatorOfFloat.addListener(this.animatorSecondaryListener);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.sliderSecondaryAnimator = valueAnimatorOfFloat;
        }
        invalidate();
    }

    public final void addOnThumbChangedListener(ChangedListener changedListener) {
        this.listeners.addObserver(changedListener);
    }

    public final void clearOnThumbChangedListener() {
        this.listeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.a11yHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a11yHelper.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final Drawable getActiveTickMarkDrawable() {
        return this.activeTickMarkDrawable;
    }

    public final Drawable getActiveTrackDrawable() {
        return this.activeTrackDrawable;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    public final Drawable getInactiveTickMarkDrawable() {
        return this.inactiveTickMarkDrawable;
    }

    public final Drawable getInactiveTrackDrawable() {
        return this.inactiveTrackDrawable;
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final float getInterceptionAngle() {
        return this.interceptionAngle;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final List<Range> getRanges() {
        return this.ranges;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Integer numValueOf;
        Companion companion = Companion;
        int iMax = Math.max(companion.getBoundsHeight(this.activeTrackDrawable), companion.getBoundsHeight(this.inactiveTrackDrawable));
        Iterator<T> it = this.ranges.iterator();
        if (it.hasNext()) {
            Range range = (Range) it.next();
            numValueOf = Integer.valueOf(Math.max(companion.getBoundsHeight(range.getActiveTrackDrawable()), companion.getBoundsHeight(range.getInactiveTrackDrawable())));
            while (it.hasNext()) {
                Range range2 = (Range) it.next();
                Companion companion2 = Companion;
                Integer numValueOf2 = Integer.valueOf(Math.max(companion2.getBoundsHeight(range2.getActiveTrackDrawable()), companion2.getBoundsHeight(range2.getInactiveTrackDrawable())));
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        Integer num = numValueOf;
        int iIntValue = num != null ? num.intValue() : 0;
        Companion companion3 = Companion;
        return Math.max(Math.max(companion3.getBoundsHeight(this.thumbDrawable), companion3.getBoundsHeight(this.thumbSecondaryDrawable)), Math.max(iMax, iIntValue));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int i10 = (int) ((this.maxValue - this.minValue) + 1);
        Companion companion = Companion;
        int iMax = Math.max(Math.max(companion.getBoundsWidth(this.thumbDrawable), companion.getBoundsWidth(this.thumbSecondaryDrawable)), Math.max(companion.getBoundsWidth(this.activeTrackDrawable), companion.getBoundsWidth(this.inactiveTrackDrawable)) * i10);
        TextDrawable textDrawable = this.thumbTextDrawable;
        int intrinsicWidth = textDrawable != null ? textDrawable.getIntrinsicWidth() : 0;
        TextDrawable textDrawable2 = this.thumbSecondTextDrawable;
        return Math.max(iMax, Math.max(intrinsicWidth, textDrawable2 != null ? textDrawable2.getIntrinsicWidth() : 0));
    }

    public final Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    public final TextDrawable getThumbSecondTextDrawable() {
        return this.thumbSecondTextDrawable;
    }

    public final Drawable getThumbSecondaryDrawable() {
        return this.thumbSecondaryDrawable;
    }

    public final Float getThumbSecondaryValue() {
        return this.thumbSecondaryValue;
    }

    public final TextDrawable getThumbTextDrawable() {
        return this.thumbTextDrawable;
    }

    public final float getThumbValue() {
        return this.thumbValue;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft() + (getMaxTickmarkOrThumbWidth() / 2), getPaddingTop());
        int iSave = canvas.save();
        for (Range range : this.ranges) {
            canvas.clipRect(range.getStartPosition() - range.getMarginStart(), 0.0f, range.getEndPosition() + range.getMarginEnd(), getHeight(), Region.Op.DIFFERENCE);
        }
        this.sliderDrawDelegate.drawInactiveTrack(canvas, this.inactiveTrackDrawable);
        float start = this.activeRange.getStart();
        float end = this.activeRange.getEnd();
        int position$default = toPosition$default(this, start, 0, 1, null);
        int position$default2 = toPosition$default(this, end, 0, 1, null);
        this.sliderDrawDelegate.drawTrackPart(canvas, this.activeTrackDrawable, k.g(position$default, position$default2), k.d(position$default2, position$default));
        canvas.restoreToCount(iSave);
        for (Range range2 : this.ranges) {
            if (range2.getEndPosition() < position$default || range2.getStartPosition() > position$default2) {
                i10 = position$default2;
                onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
            } else if (range2.getStartPosition() < position$default || range2.getEndPosition() > position$default2) {
                i10 = position$default2;
                if (range2.getStartPosition() < position$default && range2.getEndPosition() <= i10) {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getInactiveTrackDrawable(), 0, k.d(position$default - 1, range2.getStartPosition()), 16, null);
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), position$default, 0, 32, null);
                } else if (range2.getStartPosition() < position$default || range2.getEndPosition() <= i10) {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
                    onDraw$lambda$10$drawTrackPart(range2, this, canvas, range2.getActiveTrackDrawable(), position$default, i10);
                } else {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), 0, i10, 16, null);
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getInactiveTrackDrawable(), k.g(i10 + 1, range2.getEndPosition()), 0, 32, null);
                }
            } else {
                i10 = position$default2;
                onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), 0, 0, 48, null);
            }
            position$default2 = i10;
        }
        int i11 = (int) this.minValue;
        int i12 = (int) this.maxValue;
        if (i11 <= i12) {
            while (true) {
                this.sliderDrawDelegate.drawOnPosition(canvas, i11 <= ((int) end) && ((int) start) <= i11 ? this.activeTickMarkDrawable : this.inactiveTickMarkDrawable, toPosition(i11));
                if (i11 == i12) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.sliderDrawDelegate.drawThumb(canvas, toPosition$default(this, this.thumbValue, 0, 1, null), this.thumbDrawable, (int) this.thumbValue, this.thumbTextDrawable);
        if (isThumbSecondaryEnabled()) {
            SliderDrawDelegate sliderDrawDelegate = this.sliderDrawDelegate;
            Float f10 = this.thumbSecondaryValue;
            p.g(f10);
            int position$default3 = toPosition$default(this, f10.floatValue(), 0, 1, null);
            Drawable drawable = this.thumbSecondaryDrawable;
            Float f11 = this.thumbSecondaryValue;
            p.g(f11);
            sliderDrawDelegate.drawThumb(canvas, position$default3, drawable, (int) f11.floatValue(), this.thumbSecondTextDrawable);
        }
        canvas.restore();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int scaledTouchSlop;
        if (!this.interactive) {
            return false;
        }
        int x10 = (((int) motionEvent.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
        int action = motionEvent.getAction();
        if (action == 0) {
            Thumb closestThumb$div_release = getClosestThumb$div_release(x10);
            this.thumbOnTouch = closestThumb$div_release;
            setValueToThumb$default(this, closestThumb$div_release, getTouchValue(x10), this.animationEnabled, false, 8, null);
            this.prevX = motionEvent.getX();
            this.prevY = motionEvent.getY();
            return true;
        }
        if (action == 1) {
            setValueToThumb$default(this, this.thumbOnTouch, getTouchValue(x10), this.animationEnabled, false, 8, null);
            return true;
        }
        if (action != 2) {
            return false;
        }
        setValueToThumb(this.thumbOnTouch, getTouchValue(x10), false, true);
        Integer num = this.touchSlop;
        if (num != null) {
            scaledTouchSlop = num.intValue();
        } else {
            scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.touchSlop = Integer.valueOf(scaledTouchSlop);
        }
        float fAbs = Math.abs(motionEvent.getY() - this.prevY);
        if (fAbs < scaledTouchSlop) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getParent().requestDisallowInterceptTouchEvent(fAbs / Math.abs(motionEvent.getX() - this.prevX) <= this.interceptionAngleTg);
        }
        this.prevX = motionEvent.getX();
        this.prevY = motionEvent.getY();
        return true;
    }

    public final void setActiveTickMarkDrawable(Drawable drawable) {
        this.activeTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setActiveTrackDrawable(Drawable drawable) {
        this.activeTrackDrawable = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j10) {
        if (this.animationDuration == j10 || j10 < 0) {
            return;
        }
        this.animationDuration = j10;
    }

    public final void setAnimationEnabled(boolean z10) {
        this.animationEnabled = z10;
    }

    public final void setInactiveTickMarkDrawable(Drawable drawable) {
        this.inactiveTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setInactiveTrackDrawable(Drawable drawable) {
        this.inactiveTrackDrawable = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z10) {
        this.interactive = z10;
    }

    public final void setMaxValue(float f10) {
        if (this.maxValue == f10) {
            return;
        }
        setMinValue(Math.min(this.minValue, f10 - 1.0f));
        this.maxValue = f10;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setMinValue(float f10) {
        if (this.minValue == f10) {
            return;
        }
        setMaxValue(Math.max(this.maxValue, 1.0f + f10));
        this.minValue = f10;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setThumbDrawable(Drawable drawable) {
        this.thumbDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(TextDrawable textDrawable) {
        this.thumbSecondTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(Drawable drawable) {
        this.thumbSecondaryDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbTextDrawable(TextDrawable textDrawable) {
        this.thumbTextDrawable = textDrawable;
        invalidate();
    }

    private final int getTrackLength(int i10) {
        return ((i10 - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
    }

    private final int measureDimension(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                return size;
            }
            return i10;
        }
        return Math.min(i10, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbChangedListeners(Float f10, float f11) {
        if (!p.c(f10, f11)) {
            Iterator<ChangedListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onThumbValueChanged(f11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbSecondaryChangedListeners(Float f10, Float f11) {
        if (!p.d(f10, f11)) {
            Iterator<ChangedListener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onThumbSecondaryValueChanged(f11);
            }
        }
    }

    @Px
    private final int toPosition(int i10) {
        return toPosition$default(this, i10, 0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbSecondaryValue$lambda$5$lambda$4(SliderView sliderView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        p.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sliderView.thumbSecondaryValue = (Float) animatedValue;
        sliderView.postInvalidateOnAnimation();
    }

    private final void trySetThumbValue(float f10, boolean z10, boolean z11) {
        boolean z12;
        ValueAnimator valueAnimator;
        float fInBoarders = inBoarders(f10);
        float f11 = this.thumbValue;
        if (f11 == fInBoarders) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return;
        }
        if (z10 && this.animationEnabled) {
            ValueAnimator valueAnimator2 = this.sliderAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbValue = f11;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbValue, fInBoarders);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: je.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbValue$lambda$3$lambda$2(this.f61766b, valueAnimator3);
                }
            });
            valueAnimatorOfFloat.addListener(this.animatorListener);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.sliderAnimator = valueAnimatorOfFloat;
        } else {
            if (z11 && (valueAnimator = this.sliderAnimator) != null) {
                valueAnimator.cancel();
            }
            if (z11 || this.sliderAnimator == null) {
                float f12 = this.thumbValue;
                this.prevThumbValue = f12;
                this.thumbValue = fInBoarders;
                notifyThumbChangedListeners(Float.valueOf(f12), this.thumbValue);
            }
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbValue$lambda$3$lambda$2(SliderView sliderView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        p.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sliderView.thumbValue = ((Float) animatedValue).floatValue();
        sliderView.postInvalidateOnAnimation();
    }

    public final Thumb getClosestThumb$div_release(int i10) {
        if (!isThumbSecondaryEnabled()) {
            return Thumb.THUMB;
        }
        int iAbs = Math.abs(i10 - toPosition$default(this, this.thumbValue, 0, 1, null));
        Float f10 = this.thumbSecondaryValue;
        p.g(f10);
        if (iAbs < Math.abs(i10 - toPosition$default(this, f10.floatValue(), 0, 1, null))) {
            return Thumb.THUMB;
        }
        return Thumb.THUMB_SECONDARY;
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.a11yHelper.onFocusChanged(z10, i10, rect);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int iMeasureDimension = measureDimension(suggestedMinimumWidth, i10);
        int iMeasureDimension2 = measureDimension(suggestedMinimumHeight, i11);
        setMeasuredDimension(iMeasureDimension, iMeasureDimension2);
        this.sliderDrawDelegate.onMeasure(getTrackLength(iMeasureDimension), (iMeasureDimension2 - getPaddingTop()) - getPaddingBottom());
        for (Range range : this.ranges) {
            range.setStartPosition(toPosition(Math.max(range.getStartValue(), this.minValue), iMeasureDimension) + range.getMarginStart());
            range.setEndPosition(toPosition(Math.min(range.getEndValue(), this.maxValue), iMeasureDimension) - range.getMarginEnd());
        }
    }

    public final void setInterceptionAngle(float f10) {
        float fMax = Math.max(45.0f, Math.abs(f10) % 90);
        this.interceptionAngle = fMax;
        this.interceptionAngleTg = (float) Math.tan(fMax);
    }

    public final void setValueToAccessibilityThumb$div_release(Thumb thumb, float f10) {
        setValueToThumb(thumb, inBoarders(f10), false, true);
    }
}
