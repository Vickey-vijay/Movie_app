package com.yandex.div.core.view2.animations;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import androidx.core.content.ContextCompat;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import bk.l;
import bk.p;
import com.yandex.div.R$drawable;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import ik.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mj.r;
import nj.g0;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    private static final DivAnimation DEFAULT_CLICK_ANIMATION;

    /* JADX INFO: compiled from: Utils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final p<View, MotionEvent, r> asTouchListener(DivAnimation divAnimation, ExpressionResolver expressionResolver, View view) {
        final Animation animation$default = toAnimation$default(divAnimation, expressionResolver, false, view, 2, null);
        final Animation animation$default2 = toAnimation$default(divAnimation, expressionResolver, true, null, 4, null);
        if (animation$default == null && animation$default2 == null) {
            return null;
        }
        return new p<View, MotionEvent, r>() { // from class: com.yandex.div.core.view2.animations.UtilsKt.asTouchListener.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo1invoke(View view2, MotionEvent motionEvent) {
                invoke2(view2, motionEvent);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View view2, MotionEvent motionEvent) {
                Animation animation;
                if (view2.isEnabled() && view2.isClickable() && view2.hasOnClickListeners()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        Animation animation2 = animation$default;
                        if (animation2 != null) {
                            view2.startAnimation(animation2);
                            return;
                        }
                        return;
                    }
                    if ((action == 1 || action == 3) && (animation = animation$default2) != null) {
                        view2.startAnimation(animation);
                    }
                }
            }
        };
    }

    static {
        Expression.Companion companion = Expression.Companion;
        DEFAULT_CLICK_ANIMATION = new DivAnimation(Expression.Companion.constant$default(companion, 100L, null, 2, null), Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null), null, null, Expression.Companion.constant$default(companion, DivAnimation.Name.FADE, null, 2, null), null, null, Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null), 108, null);
    }

    private static final Float alphaValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(k.j((float) d10.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int[], java.lang.Object] */
    public static final void capturePosition(TransitionValues transitionValues, l<? super int[], r> lVar) {
        ?? r10 = new int[2];
        transitionValues.view.getLocationOnScreen(r10);
        lVar.invoke(r10);
    }

    private static final ScaleAnimation createScaleAnimation(float f10, float f11) {
        return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
    }

    public static final DivAnimation getDEFAULT_CLICK_ANIMATION() {
        return DEFAULT_CLICK_ANIMATION;
    }

    public static final View getViewForAnimate(Transition transition, View view, ViewGroup viewGroup, TransitionValues transitionValues, String str) {
        if (ck.p.e(transitionValues.view, view) || !ViewsKt.isActuallyLaidOut(view)) {
            return view;
        }
        Object obj = transitionValues.values.get(str);
        ck.p.h(obj, "null cannot be cast to non-null type kotlin.IntArray");
        return ViewCopiesKt.createOrGetVisualCopy(view, viewGroup, transition, (int[]) obj);
    }

    private static final Float scaleValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(k.c((float) d10.doubleValue(), 0.0f));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.view.animation.ScaleAnimation] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [ik.i, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    private static final Animation toAnimation(DivAnimation divAnimation, ExpressionResolver expressionResolver, boolean z10, View view) {
        float fFloatValue;
        ?? r10;
        ?? r11;
        DivAnimation.Name nameEvaluate = divAnimation.f46439e.evaluate(expressionResolver);
        int i10 = WhenMappings.$EnumSwitchMapping$0[nameEvaluate.ordinal()];
        animationSet = 0;
        animationSet = 0;
        animationSet = 0;
        ?? animationSet = 0;
        if (i10 == 1) {
            animationSet = new AnimationSet(false);
            List<DivAnimation> list = divAnimation.f46438d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Animation animation = toAnimation((DivAnimation) it.next(), expressionResolver, z10, view);
                    if (animation != null) {
                        animationSet.addAnimation(animation);
                    }
                }
            }
        } else if (i10 == 2) {
            Expression<Double> expression = divAnimation.f46442h;
            Float fScaleValue = scaleValue(expression != null ? expression.evaluate(expressionResolver) : null);
            fFloatValue = fScaleValue != null ? fScaleValue.floatValue() : 1.0f;
            Expression<Double> expression2 = divAnimation.f46436b;
            Float fScaleValue2 = scaleValue(expression2 != null ? expression2.evaluate(expressionResolver) : null);
            animationSet = createScaleAnimation(fFloatValue, fScaleValue2 != null ? fScaleValue2.floatValue() : 0.95f);
        } else if (i10 != 3) {
            if (i10 != 4) {
                Expression<Double> expression3 = divAnimation.f46442h;
                Float fAlphaValue = alphaValue(expression3 != null ? expression3.evaluate(expressionResolver) : null);
                fFloatValue = fAlphaValue != null ? fAlphaValue.floatValue() : 1.0f;
                Expression<Double> expression4 = divAnimation.f46436b;
                Float fAlphaValue2 = alphaValue(expression4 != null ? expression4.evaluate(expressionResolver) : null);
                animationSet = new AlphaAnimation(fFloatValue, fAlphaValue2 != null ? fAlphaValue2.floatValue() : 0.6f);
            }
        } else if (view != 0) {
            Drawable background = view.getBackground();
            LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
            if (layerDrawable != null) {
                ?? Q = k.q(0, layerDrawable.getNumberOfLayers());
                if (!(Q instanceof Collection) || !((Collection) Q).isEmpty()) {
                    Iterator it2 = Q.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            r11 = true;
                            break;
                        }
                        if ((layerDrawable.getId(((g0) it2).nextInt()) == R$drawable.native_animation_background) != false) {
                            r11 = false;
                            break;
                        }
                    }
                } else {
                    r11 = true;
                    break;
                }
                if (r11 == true) {
                    r10 = true;
                } else {
                    r10 = false;
                }
            } else {
                r10 = true;
            }
            if (r10 != false) {
                ArrayList arrayList = new ArrayList();
                if (layerDrawable != null) {
                    int numberOfLayers = layerDrawable.getNumberOfLayers();
                    for (int i11 = 0; i11 < numberOfLayers; i11++) {
                        arrayList.add(layerDrawable.getDrawable(i11));
                    }
                } else {
                    arrayList.add(view.getBackground());
                }
                Context context = view.getContext();
                int i12 = R$drawable.native_animation_background;
                Drawable drawable = ContextCompat.getDrawable(context, i12);
                if (drawable != null) {
                    arrayList.add(drawable);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
                layerDrawable2.setId(arrayList.size() - 1, i12);
                view.setBackground(layerDrawable2);
            }
        }
        if (nameEvaluate != DivAnimation.Name.SET) {
            if (animationSet != 0) {
                animationSet.setInterpolator(z10 ? ReverseInterpolatorKt.reversed(DivUtilKt.getAndroidInterpolator(divAnimation.f46437c.evaluate(expressionResolver))) : DivUtilKt.getAndroidInterpolator(divAnimation.f46437c.evaluate(expressionResolver)));
            }
            if (animationSet != 0) {
                animationSet.setDuration(divAnimation.f46435a.evaluate(expressionResolver).longValue());
            }
        }
        if (animationSet != 0) {
            animationSet.setStartOffset(divAnimation.f46441g.evaluate(expressionResolver).longValue());
        }
        if (animationSet != 0) {
            animationSet.setFillAfter(true);
        }
        return animationSet;
    }

    public static /* synthetic */ Animation toAnimation$default(DivAnimation divAnimation, ExpressionResolver expressionResolver, boolean z10, View view, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            view = null;
        }
        return toAnimation(divAnimation, expressionResolver, z10, view);
    }
}
