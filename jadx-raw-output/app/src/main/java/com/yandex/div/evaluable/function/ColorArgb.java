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
import nj.s;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ColorArgb extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final ColorArgb INSTANCE = new ColorArgb();
    private static final String name = "argb";

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = EvaluableType.COLOR;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        try {
            Object obj = list.get(0);
            p.h(obj, "null cannot be cast to non-null type kotlin.Double");
            int colorIntComponentValue = ColorFunctionsKt.toColorIntComponentValue(((Double) obj).doubleValue());
            Object obj2 = list.get(1);
            p.h(obj2, "null cannot be cast to non-null type kotlin.Double");
            int colorIntComponentValue2 = ColorFunctionsKt.toColorIntComponentValue(((Double) obj2).doubleValue());
            Object obj3 = list.get(2);
            p.h(obj3, "null cannot be cast to non-null type kotlin.Double");
            int colorIntComponentValue3 = ColorFunctionsKt.toColorIntComponentValue(((Double) obj3).doubleValue());
            Object obj4 = list.get(3);
            p.h(obj4, "null cannot be cast to non-null type kotlin.Double");
            return Color.m3368boximpl(Color.Companion.m3377argbH0kstlE(colorIntComponentValue, colorIntComponentValue2, colorIntComponentValue3, ColorFunctionsKt.toColorIntComponentValue(((Double) obj4).doubleValue())));
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Value out of range 0..1.", null, 8, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }

    private ColorArgb() {
    }
}
