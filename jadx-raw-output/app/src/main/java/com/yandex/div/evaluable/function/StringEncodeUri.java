package com.yandex.div.evaluable.function;

import ck.p;
import com.google.android.material.badge.BadgeDrawable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import lk.c;
import lk.x;
import nj.r;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StringEncodeUri extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final StringEncodeUri INSTANCE = new StringEncodeUri();
    private static final String name = "encodeUri";

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
        String strEncode = URLEncoder.encode((String) obj, c.f63591b.name());
        p.i(strEncode, "encode(str, Charsets.UTF_8.name())");
        return x.N(x.N(x.N(x.N(x.N(x.N(strEncode, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20", false, 4, null), "%21", "!", false, 4, null), "%7E", "~", false, 4, null), "%27", "'", false, 4, null), "%28", "(", false, 4, null), "%29", ")", false, 4, null);
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

    private StringEncodeUri() {
    }
}
