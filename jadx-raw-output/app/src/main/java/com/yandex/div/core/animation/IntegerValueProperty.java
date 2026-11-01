package com.yandex.div.core.animation;

import ck.p;
import com.yandex.div.data.Variable;

/* JADX INFO: compiled from: VariableProperties.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class IntegerValueProperty extends IntegerProperty<Variable.IntegerVariable> {
    public static final IntegerValueProperty INSTANCE = new IntegerValueProperty();

    private IntegerValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    public Integer get(Variable.IntegerVariable integerVariable) {
        Object value = integerVariable.getValue();
        p.h(value, "null cannot be cast to non-null type kotlin.Long");
        return Integer.valueOf((int) ((Long) value).longValue());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(Variable.IntegerVariable integerVariable, int i10) {
        integerVariable.setValueDirectly(Long.valueOf(i10));
    }
}
