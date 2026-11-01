package com.yandex.div.core.expression;

import com.yandex.div2.DivVariable;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: RuntimeStoreProvider.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RuntimeStoreProviderKt {
    public static final String getName(DivVariable divVariable) {
        if (divVariable instanceof DivVariable.b) {
            return ((DivVariable.b) divVariable).c().f45897a;
        }
        if (divVariable instanceof DivVariable.f) {
            return ((DivVariable.f) divVariable).c().f50155a;
        }
        if (divVariable instanceof DivVariable.g) {
            return ((DivVariable.g) divVariable).c().f50476a;
        }
        if (divVariable instanceof DivVariable.i) {
            return ((DivVariable.i) divVariable).c().f50527a;
        }
        if (divVariable instanceof DivVariable.c) {
            return ((DivVariable.c) divVariable).c().f45913a;
        }
        if (divVariable instanceof DivVariable.j) {
            return ((DivVariable.j) divVariable).c().f50543a;
        }
        if (divVariable instanceof DivVariable.e) {
            return ((DivVariable.e) divVariable).c().f45943a;
        }
        if (divVariable instanceof DivVariable.a) {
            return ((DivVariable.a) divVariable).c().f45881a;
        }
        if (divVariable instanceof DivVariable.h) {
            return ((DivVariable.h) divVariable).c().f50494b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
