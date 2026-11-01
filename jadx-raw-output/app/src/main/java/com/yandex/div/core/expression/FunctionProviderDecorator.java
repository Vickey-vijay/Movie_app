package com.yandex.div.core.expression;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.LocalFunctionProvider;
import com.yandex.div.evaluable.MissingLocalFunctionException;
import java.util.List;

/* JADX INFO: compiled from: FunctionProviderDecorator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class FunctionProviderDecorator implements FunctionProvider {
    private final FunctionProvider provider;

    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function get(String str, List<? extends EvaluableType> list) {
        return this.provider.get(str, list);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function getMethod(String str, List<? extends EvaluableType> list) {
        return this.provider.getMethod(str, list);
    }

    public final FunctionProviderDecorator plus(List<? extends Function> list) {
        final LocalFunctionProvider localFunctionProvider = new LocalFunctionProvider(list);
        return new FunctionProviderDecorator(new FunctionProvider() { // from class: com.yandex.div.core.expression.FunctionProviderDecorator.plus.1
            @Override // com.yandex.div.evaluable.FunctionProvider
            public Function get(String str, List<? extends EvaluableType> list2) {
                try {
                    return localFunctionProvider.get(str, list2);
                } catch (MissingLocalFunctionException unused) {
                    return this.provider.get(str, list2);
                }
            }

            @Override // com.yandex.div.evaluable.FunctionProvider
            public Function getMethod(String str, List<? extends EvaluableType> list2) {
                try {
                    return localFunctionProvider.getMethod(str, list2);
                } catch (MissingLocalFunctionException unused) {
                    return this.provider.getMethod(str, list2);
                }
            }
        });
    }

    public FunctionProviderDecorator(FunctionProvider functionProvider) {
        this.provider = functionProvider;
    }
}
