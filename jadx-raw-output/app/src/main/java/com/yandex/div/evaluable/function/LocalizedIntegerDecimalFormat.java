package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.FunctionArgument;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import nj.s;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class LocalizedIntegerDecimalFormat extends AbsDecimalFormat<Long> {
    private static final List<FunctionArgument> declaredArgs;
    public static final LocalizedIntegerDecimalFormat INSTANCE = new LocalizedIntegerDecimalFormat();
    private static final String name = "decimalFormat";

    @Override // com.yandex.div.evaluable.function.AbsDecimalFormat
    public /* bridge */ /* synthetic */ String format(DecimalFormat decimalFormat, Number number) {
        return format(decimalFormat, number.longValue());
    }

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = s.n(new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
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
        Object obj = list.get(2);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        Locale localeForLanguageTag = Locale.forLanguageTag((String) obj);
        p.i(localeForLanguageTag, "forLanguageTag(args[2] as String)");
        return localeForLanguageTag;
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

    private LocalizedIntegerDecimalFormat() {
    }
}
