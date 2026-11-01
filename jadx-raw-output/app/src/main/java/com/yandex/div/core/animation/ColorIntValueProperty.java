package com.yandex.div.core.animation;

import ck.p;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;

/* JADX INFO: compiled from: VariableProperties.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ColorIntValueProperty extends IntegerProperty<Variable.ColorVariable> {
    public static final ColorIntValueProperty INSTANCE = new ColorIntValueProperty();

    private ColorIntValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    public Integer get(Variable.ColorVariable colorVariable) {
        Object value = colorVariable.getValue();
        p.h(value, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        return Integer.valueOf(((Color) value).m3376unboximpl());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(Variable.ColorVariable colorVariable, int i10) {
        colorVariable.setValueDirectly(Color.m3368boximpl(Color.m3369constructorimpl(i10)));
    }
}
