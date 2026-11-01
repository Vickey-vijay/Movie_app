package com.yandex.div.json.expressions;

import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.json.ParsingException;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: ExpressionList.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface ExpressionList<T> {
    List<T> evaluate(ExpressionResolver expressionResolver) throws ParsingException;

    Disposable observe(ExpressionResolver expressionResolver, l<? super List<? extends T>, r> lVar);
}
