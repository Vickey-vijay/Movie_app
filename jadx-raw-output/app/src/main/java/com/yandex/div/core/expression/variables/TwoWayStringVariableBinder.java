package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;

/* JADX INFO: compiled from: TwoWayVariableBinder.kt */
/* JADX INFO: loaded from: classes9.dex */
public class TwoWayStringVariableBinder extends TwoWayVariableBinder<String> {
    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public String toStringValue(String str) {
        return str;
    }

    public TwoWayStringVariableBinder(ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }
}
