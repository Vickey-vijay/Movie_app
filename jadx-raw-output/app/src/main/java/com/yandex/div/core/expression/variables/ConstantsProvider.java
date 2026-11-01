package com.yandex.div.core.expression.variables;

import com.yandex.div.evaluable.VariableProvider;
import java.util.Map;

/* JADX INFO: compiled from: ConstantsProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ConstantsProvider implements VariableProvider {
    private final Map<String, Object> constants;

    @Override // com.yandex.div.evaluable.VariableProvider
    public Object get(String str) {
        return this.constants.get(str);
    }

    public ConstantsProvider(Map<String, ? extends Object> map) {
        this.constants = map;
    }
}
