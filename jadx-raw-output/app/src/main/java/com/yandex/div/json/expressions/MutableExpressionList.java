package com.yandex.div.json.expressions;

import bk.l;
import ck.p;
import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.r;
import nj.b0;
import nj.t;

/* JADX INFO: compiled from: ExpressionList.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class MutableExpressionList<T> implements ExpressionList<T> {
    private final List<Expression<T>> expressions;
    private final String key;
    private List<? extends T> lastValidValuesList;
    private final ListValidator<T> listValidator;
    private final ParsingErrorLogger logger;

    private final List<T> tryResolve(ExpressionResolver expressionResolver) {
        List<Expression<T>> list = this.expressions;
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Expression) it.next()).evaluate(expressionResolver));
        }
        if (this.listValidator.isValid(arrayList)) {
            return arrayList;
        }
        throw ParsingExceptionKt.invalidValue(this.key, arrayList);
    }

    public boolean equals(Object obj) {
        return (obj instanceof MutableExpressionList) && p.e(this.expressions, ((MutableExpressionList) obj).expressions);
    }

    public final List<Expression<T>> getExpressionsInternal() {
        return this.expressions;
    }

    public int hashCode() {
        return this.expressions.hashCode() * 16;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    public Disposable observe(final ExpressionResolver expressionResolver, final l<? super List<? extends T>, r> lVar) {
        l<T, r> lVar2 = new l<T, r>() { // from class: com.yandex.div.json.expressions.MutableExpressionList$observe$itemCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10) {
                lVar.invoke(this.evaluate(expressionResolver));
            }
        };
        if (this.expressions.size() == 1) {
            return ((Expression) b0.f0(this.expressions)).observe(expressionResolver, lVar2);
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Iterator<T> it = this.expressions.iterator();
        while (it.hasNext()) {
            compositeDisposable.add(((Expression) it.next()).observe(expressionResolver, lVar2));
        }
        return compositeDisposable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableExpressionList(String str, List<? extends Expression<T>> list, ListValidator<T> listValidator, ParsingErrorLogger parsingErrorLogger) {
        this.key = str;
        this.expressions = list;
        this.listValidator = listValidator;
        this.logger = parsingErrorLogger;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    public List<T> evaluate(ExpressionResolver expressionResolver) {
        try {
            List<T> listTryResolve = tryResolve(expressionResolver);
            this.lastValidValuesList = listTryResolve;
            return listTryResolve;
        } catch (ParsingException e10) {
            this.logger.logError(e10);
            List<? extends T> list = this.lastValidValuesList;
            if (list != null) {
                return list;
            }
            throw e10;
        }
    }
}
