package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import nj.s;

/* JADX INFO: compiled from: ArrayFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class ArrayOptFunction extends Function {
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;
    private final EvaluableType resultType;

    public ArrayOptFunction(EvaluableType evaluableType) {
        p.j(evaluableType, "resultType");
        this.resultType = evaluableType;
        this.declaredArgs = s.n(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public final EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
