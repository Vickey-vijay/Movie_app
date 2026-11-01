package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluationContext;
import ik.k;
import java.util.Iterator;
import nj.g0;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class StringFunctionsKt {
    /* JADX INFO: renamed from: buildRepeatableString-zb-MA7A, reason: not valid java name */
    public static final String m3338buildRepeatableStringzbMA7A(EvaluationContext evaluationContext, Evaluable evaluable, int i10, String str) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(str, "repeatable");
        if ((str.length() == 0) || i10 <= 0) {
            if (!(str.length() == 0)) {
                return "";
            }
            evaluationContext.getWarningSender().mo3297sendBIH1yYw(evaluable, "String for padding is empty.");
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i10);
        Iterator<Integer> it = k.q(0, i10).iterator();
        while (it.hasNext()) {
            sb2.append(str.charAt(((g0) it).nextInt() % str.length()));
        }
        String string = sb2.toString();
        p.i(string, "stringBuilder.toString()");
        return string;
    }
}
