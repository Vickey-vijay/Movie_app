package com.yandex.div.evaluable.function;

import bk.l;
import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import nj.b0;
import nj.r;

/* JADX INFO: compiled from: ColorFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ColorComponentGetter extends Function {
    private final l<Color, Integer> componentGetter;
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentGetter(l<? super Color, Integer> lVar) {
        p.j(lVar, "componentGetter");
        this.componentGetter = lVar;
        this.declaredArgs = r.e(new FunctionArgument(EvaluableType.COLOR, false, 2, null));
        this.resultType = EvaluableType.NUMBER;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        l<Color, Integer> lVar = this.componentGetter;
        Object objF0 = b0.f0(list);
        p.h(objF0, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        return Double.valueOf(ColorFunctionsKt.toColorFloatComponentValue(lVar.invoke((Color) objF0).intValue()));
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
