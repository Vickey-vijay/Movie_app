package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;

/* JADX INFO: compiled from: TwoWayVariableBinder.kt */
/* JADX INFO: loaded from: classes3.dex */
public class TwoWayBooleanVariableBinder extends TwoWayVariableBinder<Boolean> {
    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Boolean bool) {
        return toStringValue(bool.booleanValue());
    }

    public String toStringValue(boolean z10) {
        return String.valueOf(z10);
    }

    public TwoWayBooleanVariableBinder(ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }
}
