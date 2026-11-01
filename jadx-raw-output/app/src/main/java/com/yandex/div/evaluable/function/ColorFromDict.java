package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.c;
import nj.s;

/* JADX INFO: compiled from: DictFunctions.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ColorFromDict extends Function {
    private final boolean isMethod;
    private final boolean isPure;
    private final List<FunctionArgument> declaredArgs = s.n(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
    private final EvaluableType resultType = EvaluableType.COLOR;

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        Object objM3458constructorimpl;
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objEvaluate = DictFunctionsKt.evaluate(getName(), list, isMethod());
        if (!(objEvaluate instanceof String)) {
            DictFunctionsKt.throwWrongTypeException(getName(), list, getResultType(), objEvaluate, isMethod());
            throw new KotlinNothingValueException();
        }
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Color.m3368boximpl(Color.Companion.m3378parseC4zCDoM((String) objEvaluate)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) == null) {
            return objM3458constructorimpl;
        }
        DictFunctionsKt.throwDictException(getName(), list, "Unable to convert value to Color, expected format #AARRGGBB.");
        throw new KotlinNothingValueException();
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
