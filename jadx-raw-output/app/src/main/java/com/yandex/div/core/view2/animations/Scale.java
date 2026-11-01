package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.transition.TransitionValues;
import bk.l;
import ck.i;
import ck.p;
import java.util.Map;
import mj.r;

/* JADX INFO: compiled from: Scale.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class Scale extends OutlineAwareVisibility {
    private static final Companion Companion = new Companion(null);
    private final float pivotX;
    private final float pivotY;
    private final float scaleFactor;

    /* JADX INFO: compiled from: Scale.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Scale.kt */
    public final class ScaleAnimatorListener extends AnimatorListenerAdapter {
        private boolean isPivotSet;
        private final float nonTransitionScaleX;
        private final float nonTransitionScaleY;
        private final View view;

        public ScaleAnimatorListener(View view, float f10, float f11) {
            this.view = view;
            this.nonTransitionScaleX = f10;
            this.nonTransitionScaleY = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.view.setScaleX(this.nonTransitionScaleX);
            this.view.setScaleY(this.nonTransitionScaleY);
            if (this.isPivotSet) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.view.resetPivot();
                } else {
                    View view = this.view;
                    view.setPivotX(view.getWidth() * 0.5f);
                    View view2 = this.view;
                    view2.setPivotY(view2.getHeight() * 0.5f);
                }
            }
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.view.setVisibility(0);
            if (Scale.this.pivotX == 0.5f) {
                if (Scale.this.pivotY == 0.5f) {
                    return;
                }
            }
            this.isPivotSet = true;
            View view = this.view;
            view.setPivotX(view.getWidth() * Scale.this.pivotX);
            View view2 = this.view;
            view2.setPivotY(view2.getHeight() * Scale.this.pivotY);
        }
    }

    public /* synthetic */ Scale(float f10, float f11, float f12, int i10, i iVar) {
        this(f10, (i10 & 2) != 0 ? 0.5f : f11, (i10 & 4) != 0 ? 0.5f : f12);
    }

    private final float getCapturedScaleX(TransitionValues transitionValues, float f10) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.values) == null) ? null : map.get("yandex:scale:scaleX");
        Float f11 = obj instanceof Float ? (Float) obj : null;
        return f11 != null ? f11.floatValue() : f10;
    }

    private final float getCapturedScaleY(TransitionValues transitionValues, float f10) {
        Map<String, Object> map;
        Object obj = (transitionValues == null || (map = transitionValues.values) == null) ? null : map.get("yandex:scale:scaleY");
        Float f11 = obj instanceof Float ? (Float) obj : null;
        return f11 != null ? f11.floatValue() : f10;
    }

    public Scale(@FloatRange(from = 0.0d) float f10, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        this.scaleFactor = f10;
        this.pivotX = f11;
        this.pivotY = f12;
    }

    private final void captureStartScaleValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        int mode = getMode();
        if (mode == 1) {
            transitionValues.values.put("yandex:scale:scaleX", Float.valueOf(this.scaleFactor));
            transitionValues.values.put("yandex:scale:scaleY", Float.valueOf(this.scaleFactor));
        } else {
            if (mode != 2) {
                return;
            }
            transitionValues.values.put("yandex:scale:scaleX", Float.valueOf(view.getScaleX()));
            transitionValues.values.put("yandex:scale:scaleY", Float.valueOf(view.getScaleY()));
        }
    }

    private final Animator createScaleAnimator(View view, float f10, float f11, float f12, float f13) {
        if (f10 == f12) {
            if (f11 == f13) {
                return null;
            }
        }
        view.setVisibility(4);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f11, f13));
        objectAnimatorOfPropertyValuesHolder.addListener(new ScaleAnimatorListener(view, view.getScaleX(), view.getScaleY()));
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(final TransitionValues transitionValues) {
        float scaleX = transitionValues.view.getScaleX();
        float scaleY = transitionValues.view.getScaleY();
        transitionValues.view.setScaleX(1.0f);
        transitionValues.view.setScaleY(1.0f);
        super.captureEndValues(transitionValues);
        transitionValues.view.setScaleX(scaleX);
        transitionValues.view.setScaleY(scaleY);
        captureEndScaleValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.Scale.captureEndValues.2
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(int[] iArr) {
                invoke2(iArr);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(int[] iArr) {
                transitionValues.values.put("yandex:scale:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(final TransitionValues transitionValues) {
        float scaleX = transitionValues.view.getScaleX();
        float scaleY = transitionValues.view.getScaleY();
        transitionValues.view.setScaleX(1.0f);
        transitionValues.view.setScaleY(1.0f);
        super.captureStartValues(transitionValues);
        transitionValues.view.setScaleX(scaleX);
        transitionValues.view.setScaleY(scaleY);
        captureStartScaleValues(transitionValues);
        UtilsKt.capturePosition(transitionValues, new l<int[], r>() { // from class: com.yandex.div.core.view2.animations.Scale.captureStartValues.2
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(int[] iArr) {
                invoke2(iArr);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(int[] iArr) {
                transitionValues.values.put("yandex:scale:screenPosition", iArr);
            }
        });
    }

    @Override // androidx.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        float capturedScaleX = getCapturedScaleX(transitionValues, this.scaleFactor);
        float capturedScaleY = getCapturedScaleY(transitionValues, this.scaleFactor);
        float capturedScaleX2 = getCapturedScaleX(transitionValues2, 1.0f);
        float capturedScaleY2 = getCapturedScaleY(transitionValues2, 1.0f);
        Object obj = transitionValues2.values.get("yandex:scale:screenPosition");
        p.h(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return createScaleAnimator(ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, this, (int[]) obj), capturedScaleX, capturedScaleY, capturedScaleX2, capturedScaleY2);
    }

    @Override // androidx.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        return createScaleAnimator(UtilsKt.getViewForAnimate(this, view, viewGroup, transitionValues, "yandex:scale:screenPosition"), getCapturedScaleX(transitionValues, 1.0f), getCapturedScaleY(transitionValues, 1.0f), getCapturedScaleX(transitionValues2, this.scaleFactor), getCapturedScaleY(transitionValues2, this.scaleFactor));
    }

    private final void captureEndScaleValues(TransitionValues transitionValues) {
        int mode = getMode();
        if (mode != 1) {
            if (mode == 2) {
                transitionValues.values.put("yandex:scale:scaleX", Float.valueOf(this.scaleFactor));
                transitionValues.values.put("yandex:scale:scaleY", Float.valueOf(this.scaleFactor));
                return;
            }
            return;
        }
        transitionValues.values.put("yandex:scale:scaleX", Float.valueOf(1.0f));
        transitionValues.values.put("yandex:scale:scaleY", Float.valueOf(1.0f));
    }
}
