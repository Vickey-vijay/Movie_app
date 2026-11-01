package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import nj.b0;
import nj.r;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ColorStringComponentGetter extends Function {
    private final ColorComponentGetter componentGetter;
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    public ColorStringComponentGetter(ColorComponentGetter colorComponentGetter) {
        p.j(colorComponentGetter, "componentGetter");
        this.componentGetter = colorComponentGetter;
        this.declaredArgs = r.e(new FunctionArgument(EvaluableType.STRING, false, 2, null));
        this.resultType = EvaluableType.NUMBER;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objF0 = b0.f0(list);
        p.h(objF0, "null cannot be cast to non-null type kotlin.String");
        try {
            return this.componentGetter.m3327invokeex6DHhM(evaluationContext, evaluable, r.e(Color.m3368boximpl(Color.Companion.m3378parseC4zCDoM((String) objF0))));
        } catch (IllegalArgumentException e10) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.", e10);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
