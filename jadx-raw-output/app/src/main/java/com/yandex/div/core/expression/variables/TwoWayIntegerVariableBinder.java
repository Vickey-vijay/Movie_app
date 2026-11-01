package com.yandex.div.core.expression.variables;

import com.yandex.div.core.view2.errors.ErrorCollectors;

/* JADX INFO: compiled from: TwoWayVariableBinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public class TwoWayIntegerVariableBinder extends TwoWayVariableBinder<Long> {
    @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder
    public /* bridge */ /* synthetic */ String toStringValue(Long l10) {
        return toStringValue(l10.longValue());
    }

    public String toStringValue(long j10) {
        return String.valueOf(j10);
    }

    public TwoWayIntegerVariableBinder(ErrorCollectors errorCollectors) {
        super(errorCollectors);
    }
}
