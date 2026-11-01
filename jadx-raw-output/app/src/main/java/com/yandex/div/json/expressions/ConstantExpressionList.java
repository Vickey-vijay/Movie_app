package com.yandex.div.json.expressions;

import bk.l;
import ck.p;
import com.yandex.div.core.Disposable;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: ExpressionList.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ConstantExpressionList<T> implements ExpressionList<T> {
    private final List<T> values;

    public boolean equals(Object obj) {
        return (obj instanceof ConstantExpressionList) && p.e(this.values, ((ConstantExpressionList) obj).values);
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    public List<T> evaluate(ExpressionResolver expressionResolver) {
        return this.values;
    }

    public final List<T> getValues$div_data_release() {
        return this.values;
    }

    public int hashCode() {
        return this.values.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    public Disposable observe(ExpressionResolver expressionResolver, l<? super List<? extends T>, r> lVar) {
        return Disposable.NULL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConstantExpressionList(List<? extends T> list) {
        this.values = list;
    }
}
