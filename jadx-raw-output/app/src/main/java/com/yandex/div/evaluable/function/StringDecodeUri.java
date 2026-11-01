package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import lk.c;
import nj.r;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StringDecodeUri extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final StringDecodeUri INSTANCE = new StringDecodeUri();
    private static final String name = "decodeUri";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = r.e(new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws UnsupportedEncodingException {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        String strDecode = URLDecoder.decode((String) obj, c.f63591b.name());
        p.i(strDecode, "decode(str, Charsets.UTF_8.name())");
        return strDecode;
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

    private StringDecodeUri() {
    }
}
