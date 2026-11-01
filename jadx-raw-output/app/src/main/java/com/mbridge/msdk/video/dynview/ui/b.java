package com.mbridge.msdk.video.dynview.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: MBridgeUIAnim.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    public class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f38697a;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public a(View view) {
            this.f38697a = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            View view = this.f38697a;
            if (view == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).removeAllViews();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f38697a;
            if (view == null || !(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).removeAllViews();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.ui.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    public class C0402b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f38699a;

        public C0402b(List list) {
            this.f38699a = list;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            List list = this.f38699a;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (View view : this.f38699a) {
                if (view != null) {
                    view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    view.requestLayout();
                }
            }
        }
    }

    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f38701a;

        public c(View view) {
            this.f38701a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f38701a;
            if (view != null) {
                view.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f38701a.requestLayout();
            }
        }
    }

    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f38703a;

        public d(View view) {
            this.f38703a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f38703a;
            if (view != null) {
                view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.f38703a.requestLayout();
                if (this.f38703a.getVisibility() != 0) {
                    this.f38703a.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f38705a;

        public e(View view) {
            this.f38705a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f38705a.getLayoutParams();
            layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            this.f38705a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: compiled from: MBridgeUIAnim.java */
    public class f implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f38707a;

        public f(View view) {
            this.f38707a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f38707a.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f38707a.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public void a(Map<String, Bitmap> map, com.mbridge.msdk.video.dynview.c cVar, View view) {
        if (view != null) {
            com.mbridge.msdk.video.dynview.util.draw.a.a().a(map, cVar, view);
        }
    }

    public ObjectAnimator b(View view) {
        ObjectAnimator objectAnimatorA = a(view, 1.0f, 1.0f, 5.0f, 2000L);
        objectAnimatorA.setRepeatCount(-1);
        return objectAnimatorA;
    }

    public ObjectAnimator c(View view) {
        ObjectAnimator objectAnimatorA = a(view, 1.0f, 1.0f, 2000L);
        objectAnimatorA.setRepeatCount(-1);
        return objectAnimatorA;
    }

    public ObjectAnimator a(View view) {
        ObjectAnimator objectAnimatorA = a(view, 2.0f, 1000L);
        objectAnimatorA.setRepeatCount(-1);
        return objectAnimatorA;
    }

    public void b(View view, long j10) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(j10).setListener(new a(view));
        }
    }

    public void c(View view, long j10) {
        if (view == null) {
            return;
        }
        a(view, 0, v0.g(view.getContext().getApplicationContext()), j10);
    }

    public void a(View view, long j10) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(j10);
        }
    }

    private PropertyValuesHolder b(Property property, float f10) {
        float f11 = f10 - 0.2f;
        float f12 = f10 + 0.3f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f10), Keyframe.ofFloat(0.1f, f10 - 0.4f), Keyframe.ofFloat(0.2f, f11), Keyframe.ofFloat(0.3f, f12), Keyframe.ofFloat(0.4f, f11), Keyframe.ofFloat(0.5f, f12), Keyframe.ofFloat(0.6f, f10 - 0.1f), Keyframe.ofFloat(0.7f, f12), Keyframe.ofFloat(0.8f, f10), Keyframe.ofFloat(0.9f, 0.1f + f10), Keyframe.ofFloat(1.0f, f10));
    }

    private PropertyValuesHolder c(Property property, float f10) {
        float f11 = (-2.0f) * f10;
        float f12 = f10 * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f11), Keyframe.ofFloat(0.2f, f11), Keyframe.ofFloat(0.3f, f12), Keyframe.ofFloat(0.4f, f11), Keyframe.ofFloat(0.5f, f12), Keyframe.ofFloat(0.6f, f11), Keyframe.ofFloat(0.7f, f12), Keyframe.ofFloat(0.8f, f11), Keyframe.ofFloat(0.9f, f12), Keyframe.ofFloat(1.0f, 0.0f));
    }

    public void a(List<View> list, int i10, int i11, long j10) {
        ValueAnimator duration = ValueAnimator.ofInt(i10, i11).setDuration(j10);
        duration.addUpdateListener(new C0402b(list));
        duration.start();
    }

    public void a(View view, int i10, int i11, int i12, int i13, long j10) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.addUpdateListener(new c(view));
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(i12, i13);
        valueAnimatorOfInt2.addUpdateListener(new d(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.setDuration(j10);
        animatorSet.start();
    }

    private ObjectAnimator a(View view, float f10, float f11, float f12, long j10) {
        return ObjectAnimator.ofPropertyValuesHolder(view, b(View.SCALE_X, f10), b(View.SCALE_Y, f11), c(View.ROTATION_X, f12)).setDuration(j10);
    }

    private void a(View view, int i10, int i11, long j10) {
        ValueAnimator valueAnimatorOfInt;
        if (view.getLayoutParams().width == 0) {
            valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        } else {
            valueAnimatorOfInt = ValueAnimator.ofInt(i11, i10);
        }
        valueAnimatorOfInt.setDuration(j10);
        valueAnimatorOfInt.addUpdateListener(new e(view));
        ValueAnimator valueAnimatorOfFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j10);
        valueAnimatorOfFloat.addUpdateListener(new f(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfInt, valueAnimatorOfFloat);
        animatorSet.start();
    }

    private ObjectAnimator a(View view, float f10, float f11, long j10) {
        return ObjectAnimator.ofPropertyValuesHolder(view, a(View.SCALE_X, f10), a(View.SCALE_Y, f11)).setDuration(j10);
    }

    public ObjectAnimator a(View view, float f10, long j10) {
        return ObjectAnimator.ofPropertyValuesHolder(view, c(View.ROTATION, f10)).setDuration(j10);
    }

    private PropertyValuesHolder a(Property property, float f10) {
        float f11 = f10 - 0.4f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f10), Keyframe.ofFloat(0.1f, f11), Keyframe.ofFloat(0.2f, f11), Keyframe.ofFloat(0.3f, f10), Keyframe.ofFloat(0.4f, f10), Keyframe.ofFloat(0.5f, f10), Keyframe.ofFloat(0.6f, f10), Keyframe.ofFloat(0.7f, f10), Keyframe.ofFloat(0.8f, f10), Keyframe.ofFloat(0.9f, f10), Keyframe.ofFloat(1.0f, f10));
    }
}
