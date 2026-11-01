package com.yandex.div.evaluable;

import ck.p;
import java.util.List;

/* JADX INFO: compiled from: EvaluableException.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class MissingLocalFunctionException extends EvaluableException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingLocalFunctionException(String str, List<? extends EvaluableType> list) {
        super("Function '" + str + '(' + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list) + ")' is missing.", null, 2, null);
        p.j(str, "name");
        p.j(list, "args");
    }
}
