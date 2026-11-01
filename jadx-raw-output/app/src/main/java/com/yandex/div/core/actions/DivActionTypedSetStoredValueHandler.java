package com.yandex.div.core.actions;

import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivActionSetStoredValue;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivTypedValue;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DivActionTypedSetStoredValueHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionTypedSetStoredValueHandler implements DivActionTypedHandler {
    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(divActionTyped instanceof DivActionTyped.p)) {
            return false;
        }
        handleAction(((DivActionTyped.p) divActionTyped).c(), div2View, expressionResolver);
        return true;
    }

    private final StoredValue createStoredValue(DivTypedValue divTypedValue, String str, ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.h) {
            return new StoredValue.StringStoredValue(str, ((DivTypedValue.h) divTypedValue).c().f50520a.evaluate(expressionResolver));
        }
        if (divTypedValue instanceof DivTypedValue.f) {
            return new StoredValue.IntegerStoredValue(str, ((DivTypedValue.f) divTypedValue).c().f50148a.evaluate(expressionResolver).longValue());
        }
        if (divTypedValue instanceof DivTypedValue.b) {
            return new StoredValue.BooleanStoredValue(str, ((DivTypedValue.b) divTypedValue).c().f45890a.evaluate(expressionResolver).booleanValue());
        }
        if (divTypedValue instanceof DivTypedValue.g) {
            return new StoredValue.DoubleStoredValue(str, ((DivTypedValue.g) divTypedValue).c().f50469a.evaluate(expressionResolver).doubleValue());
        }
        if (divTypedValue instanceof DivTypedValue.c) {
            return new StoredValue.ColorStoredValue(str, Color.m3369constructorimpl(((DivTypedValue.c) divTypedValue).c().f45906a.evaluate(expressionResolver).intValue()), null);
        }
        if (divTypedValue instanceof DivTypedValue.i) {
            return new StoredValue.UrlStoredValue(str, Url.Companion.m3386fromVcSV9u8(((DivTypedValue.i) divTypedValue).c().f50536a.evaluate(expressionResolver).toString()), null);
        }
        if (divTypedValue instanceof DivTypedValue.a) {
            return new StoredValue.ArrayStoredValue(str, ((DivTypedValue.a) divTypedValue).c().f45874a.evaluate(expressionResolver));
        }
        if (divTypedValue instanceof DivTypedValue.e) {
            return new StoredValue.DictStoredValue(str, ((DivTypedValue.e) divTypedValue).c().f45936a.evaluate(expressionResolver));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void handleAction(DivActionSetStoredValue divActionSetStoredValue, Div2View div2View, ExpressionResolver expressionResolver) {
        String strEvaluate = divActionSetStoredValue.f46252b.evaluate(expressionResolver);
        long jLongValue = divActionSetStoredValue.f46251a.evaluate(expressionResolver).longValue();
        StoredValuesActionHandler.INSTANCE.executeAction(createStoredValue(divActionSetStoredValue.f46253c, strEvaluate, expressionResolver), jLongValue, div2View);
    }
}
