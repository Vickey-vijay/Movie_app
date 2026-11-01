package com.yandex.div.core.animation;

import android.util.Log;
import ck.p;
import com.yandex.div.data.Variable;

/* JADX INFO: compiled from: VariableProperties.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NumberValueProperty extends FloatProperty<Variable.DoubleVariable> {
    public static final NumberValueProperty INSTANCE = new NumberValueProperty();

    private NumberValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    public Float get(Variable.DoubleVariable doubleVariable) {
        Object value = doubleVariable.getValue();
        p.h(value, "null cannot be cast to non-null type kotlin.Double");
        return Float.valueOf((float) ((Double) value).doubleValue());
    }

    @Override // com.yandex.div.core.animation.FloatProperty
    public void setValue(Variable.DoubleVariable doubleVariable, float f10) {
        Log.i("NumberValueProperty", "set variable value: " + f10);
        doubleVariable.setValueDirectly(Double.valueOf((double) f10));
    }
}
