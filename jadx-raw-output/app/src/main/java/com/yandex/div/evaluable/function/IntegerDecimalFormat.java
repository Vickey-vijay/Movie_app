package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import nj.s;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class IntegerDecimalFormat extends AbsDecimalFormat<Long> {
    public static final IntegerDecimalFormat INSTANCE = new IntegerDecimalFormat();
    private static final String name = "decimalFormat";
    private static final List<FunctionArgument> declaredArgs = s.n(new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public /* bridge */ /* synthetic */ String format(DecimalFormat decimalFormat, Number number) {
        return format(decimalFormat, number.longValue());
    }

    public String format(DecimalFormat decimalFormat, long j10) {
        p.j(decimalFormat, "formatter");
        String str = decimalFormat.format(j10);
        p.i(str, "formatter.format(value)");
        return str;
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public Locale getLocale(List<? extends Object> list) {
        p.j(list, "args");
        Locale locale = Locale.getDefault();
        p.i(locale, "getDefault()");
        return locale;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public Long getValue(Object obj) {
        p.j(obj, "valueArgument");
        return (Long) obj;
    }

    private IntegerDecimalFormat() {
    }
}
