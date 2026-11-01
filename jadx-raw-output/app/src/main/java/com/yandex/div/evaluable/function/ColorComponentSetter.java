package com.yandex.div.evaluable.function;

import bk.p;
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
/* JADX INFO: loaded from: classes2.dex */
public abstract class ColorComponentSetter extends Function {
    private final p<Color, Double, Color> componentSetter;
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentSetter(p<? super Color, ? super Double, Color> pVar) {
        ck.p.j(pVar, "componentSetter");
        this.componentSetter = pVar;
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null));
        this.resultType = evaluableType;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        ck.p.j(evaluationContext, "evaluationContext");
        ck.p.j(evaluable, "expressionContext");
        ck.p.j(list, "args");
        Object obj = list.get(0);
        ck.p.h(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        int iM3376unboximpl = ((Color) obj).m3376unboximpl();
        Object obj2 = list.get(1);
        ck.p.h(obj2, "null cannot be cast to non-null type kotlin.Double");
        double dDoubleValue = ((Double) obj2).doubleValue();
        try {
            return Color.m3368boximpl(this.componentSetter.mo1invoke(Color.m3368boximpl(iM3376unboximpl), Double.valueOf(dDoubleValue)).m3376unboximpl());
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), s.n(Color.m3375toStringimpl(iM3376unboximpl), Double.valueOf(dDoubleValue)), "Value out of range 0..1.", null, 8, null);
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
