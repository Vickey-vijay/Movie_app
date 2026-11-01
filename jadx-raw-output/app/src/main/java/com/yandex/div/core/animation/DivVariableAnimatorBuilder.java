package com.yandex.div.core.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionAnimatorStart;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivColorAnimator;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivNumberAnimator;
import com.yandex.div2.DivTypedValue;
import ik.k;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import oe.b2;

/* JADX INFO: compiled from: DivVariableAnimatorBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivVariableAnimatorBuilder {
    public static final DivVariableAnimatorBuilder INSTANCE = new DivVariableAnimatorBuilder();

    private DivVariableAnimatorBuilder() {
    }

    private final Animator buildDoubleAnimator(Div2View div2View, DivNumberAnimator divNumberAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver, Variable.DoubleVariable doubleVariable) {
        Double dEvaluate;
        Double dDoubleValue;
        DivTypedValue divTypedValue = divActionAnimatorStart.f46058h;
        if (divTypedValue == null || (dEvaluate = DivActionTypedUtilsKt.doubleValue(divTypedValue, expressionResolver)) == null) {
            Expression<Double> expression = divNumberAnimator.f48099j;
            dEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        }
        DivTypedValue divTypedValue2 = divActionAnimatorStart.f46054d;
        double dDoubleValue2 = (divTypedValue2 == null || (dDoubleValue = DivActionTypedUtilsKt.doubleValue(divTypedValue2, expressionResolver)) == null) ? divNumberAnimator.f48094e.evaluate(expressionResolver).doubleValue() : dDoubleValue.doubleValue();
        if (dEvaluate != null) {
            doubleVariable.setValueDirectly(dEvaluate);
        }
        return configure(ObjectAnimator.ofFloat(doubleVariable, NumberValueProperty.INSTANCE, (float) dDoubleValue2), div2View, divNumberAnimator, divActionAnimatorStart, expressionResolver);
    }

    private final Animator buildIntegerAnimator(Div2View div2View, DivNumberAnimator divNumberAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver, Variable.IntegerVariable integerVariable) {
        Object objEvaluate;
        Number numberEvaluate;
        DivTypedValue divTypedValue = divActionAnimatorStart.f46058h;
        if (divTypedValue == null || (objEvaluate = DivActionTypedUtilsKt.longValue(divTypedValue, expressionResolver)) == null) {
            Expression<Double> expression = divNumberAnimator.f48099j;
            objEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        }
        DivTypedValue divTypedValue2 = divActionAnimatorStart.f46054d;
        if (divTypedValue2 == null || (numberEvaluate = DivActionTypedUtilsKt.longValue(divTypedValue2, expressionResolver)) == null) {
            numberEvaluate = divNumberAnimator.f48094e.evaluate(expressionResolver);
        }
        if (objEvaluate != null) {
            integerVariable.setValueDirectly(objEvaluate);
        }
        return configure(ObjectAnimator.ofInt(integerVariable, IntegerValueProperty.INSTANCE, numberEvaluate.intValue()), div2View, divNumberAnimator, divActionAnimatorStart, expressionResolver);
    }

    private final ObjectAnimator configure(ObjectAnimator objectAnimator, final Div2View div2View, b2 b2Var, DivActionAnimatorStart divActionAnimatorStart, final ExpressionResolver expressionResolver) {
        DivAnimationDirection divAnimationDirectionEvaluate;
        DivAnimationInterpolator divAnimationInterpolatorEvaluate;
        int iD;
        Expression<DivAnimationDirection> expression = divActionAnimatorStart.f46052b;
        if (expression == null || (divAnimationDirectionEvaluate = expression.evaluate(expressionResolver)) == null) {
            divAnimationDirectionEvaluate = b2Var.getDirection().evaluate(expressionResolver);
        }
        Expression<Long> duration = divActionAnimatorStart.f46053c;
        if (duration == null) {
            duration = b2Var.getDuration();
        }
        objectAnimator.setDuration(duration.evaluate(expressionResolver).longValue());
        Expression<Long> expressionE = divActionAnimatorStart.f46057g;
        if (expressionE == null) {
            expressionE = b2Var.e();
        }
        objectAnimator.setStartDelay(expressionE.evaluate(expressionResolver).longValue());
        Expression<DivAnimationInterpolator> expression2 = divActionAnimatorStart.f46055e;
        if (expression2 == null || (divAnimationInterpolatorEvaluate = expression2.evaluate(expressionResolver)) == null) {
            divAnimationInterpolatorEvaluate = b2Var.c().evaluate(expressionResolver);
        }
        objectAnimator.setInterpolator(DivUtilKt.androidInterpolator(divAnimationInterpolatorEvaluate, DivUtilKt.isReversed(divAnimationDirectionEvaluate)));
        DivCount divCountB = divActionAnimatorStart.f46056f;
        if (divCountB == null) {
            divCountB = b2Var.b();
        }
        if (divCountB instanceof DivCount.b) {
            iD = k.d(((int) ((DivCount.b) divCountB).c().f47151a.evaluate(expressionResolver).longValue()) - 1, 0);
        } else {
            if (!(divCountB instanceof DivCount.c)) {
                throw new NoWhenBranchMatchedException();
            }
            iD = -1;
        }
        objectAnimator.setRepeatCount(iD);
        objectAnimator.setRepeatMode(DivUtilKt.isAlternated(divAnimationDirectionEvaluate) ? 2 : 1);
        final List<DivAction> listD = b2Var.d();
        if (listD != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$2$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    Iterator it = listD.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((DivAction) it.next(), "animation_end", expressionResolver);
                    }
                }
            });
        }
        final List<DivAction> listA = b2Var.a();
        if (listA != null) {
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.animation.DivVariableAnimatorBuilder$configure$lambda$5$$inlined$doOnCancel$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        div2View.handleAction((DivAction) it.next(), "animation_cancel", expressionResolver);
                    }
                }
            });
        }
        return objectAnimator;
    }

    public final Animator build(Div2View div2View, DivAnimator divAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver) {
        if (divAnimator instanceof DivAnimator.c) {
            return buildNumberAnimator(div2View, ((DivAnimator.c) divAnimator).c(), divActionAnimatorStart, expressionResolver);
        }
        if (divAnimator instanceof DivAnimator.a) {
            return buildColorAnimator(div2View, ((DivAnimator.a) divAnimator).c(), divActionAnimatorStart, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Animator buildColorAnimator(Div2View div2View, DivColorAnimator divColorAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver) {
        Variable mutableVariable;
        int iIntValue;
        Integer numColorIntValue;
        Integer numColorIntValue2;
        String strG = divColorAnimator.g();
        VariableController variableController = UtilsKt.getVariableController(expressionResolver);
        Integer numEvaluate = null;
        if (variableController != null) {
            mutableVariable = variableController.getMutableVariable(strG);
        } else {
            mutableVariable = null;
        }
        if (!(mutableVariable instanceof Variable.ColorVariable)) {
            mutableVariable = null;
        }
        Variable.ColorVariable colorVariable = (Variable.ColorVariable) mutableVariable;
        if (colorVariable == null) {
            DivActionTypedUtilsKt.logError(div2View, new MissingVariableException("Unable to find color variable with name '" + divColorAnimator.g() + '\'', null, 2, null));
            return null;
        }
        DivTypedValue divTypedValue = divActionAnimatorStart.f46058h;
        if (divTypedValue != null && (numColorIntValue2 = DivActionTypedUtilsKt.colorIntValue(divTypedValue, expressionResolver)) != null) {
            numEvaluate = numColorIntValue2;
        } else {
            Expression<Integer> expression = divColorAnimator.f46660j;
            if (expression != null) {
                numEvaluate = expression.evaluate(expressionResolver);
            }
        }
        DivTypedValue divTypedValue2 = divActionAnimatorStart.f46054d;
        if (divTypedValue2 != null && (numColorIntValue = DivActionTypedUtilsKt.colorIntValue(divTypedValue2, expressionResolver)) != null) {
            iIntValue = numColorIntValue.intValue();
        } else {
            iIntValue = divColorAnimator.f46655e.evaluate(expressionResolver).intValue();
        }
        if (numEvaluate != null) {
            colorVariable.setValueDirectly(Color.m3368boximpl(Color.m3369constructorimpl(numEvaluate.intValue())));
        }
        return configure(ObjectAnimator.ofArgb(colorVariable, ColorIntValueProperty.INSTANCE, iIntValue), div2View, divColorAnimator, divActionAnimatorStart, expressionResolver);
    }

    private final Animator buildNumberAnimator(Div2View div2View, DivNumberAnimator divNumberAnimator, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver) {
        Variable mutableVariable;
        String strG = divNumberAnimator.g();
        VariableController variableController = UtilsKt.getVariableController(expressionResolver);
        if (variableController != null) {
            mutableVariable = variableController.getMutableVariable(strG);
        } else {
            mutableVariable = null;
        }
        if (!(mutableVariable instanceof Variable)) {
            mutableVariable = null;
        }
        if (mutableVariable instanceof Variable.IntegerVariable) {
            return buildIntegerAnimator(div2View, divNumberAnimator, divActionAnimatorStart, expressionResolver, (Variable.IntegerVariable) mutableVariable);
        }
        if (mutableVariable instanceof Variable.DoubleVariable) {
            return buildDoubleAnimator(div2View, divNumberAnimator, divActionAnimatorStart, expressionResolver, (Variable.DoubleVariable) mutableVariable);
        }
        DivActionTypedUtilsKt.logError(div2View, new MissingVariableException("Unable to find number variable with name '" + divNumberAnimator.g() + '\'', null, 2, null));
        return null;
    }
}
