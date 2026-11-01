package com.yandex.div.evaluable;

import java.util.List;

/* JADX INFO: compiled from: FunctionProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface FunctionProvider {
    Function get(String str, List<? extends EvaluableType> list);

    Function getMethod(String str, List<? extends EvaluableType> list);
}
