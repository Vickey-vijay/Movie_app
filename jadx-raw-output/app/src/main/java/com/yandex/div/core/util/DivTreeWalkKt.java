package com.yandex.div.core.util;

import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nj.s;

/* JADX INFO: compiled from: DivTreeWalk.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivTreeWalkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DivItemBuilderResult> getItems(Div div, ExpressionResolver expressionResolver) {
        if (div instanceof Div.q) {
            return s.k();
        }
        if (div instanceof Div.g) {
            return s.k();
        }
        if (div instanceof Div.e) {
            return s.k();
        }
        if (div instanceof Div.l) {
            return s.k();
        }
        if (div instanceof Div.h) {
            return s.k();
        }
        if (div instanceof Div.m) {
            return s.k();
        }
        if (div instanceof Div.i) {
            return s.k();
        }
        if (div instanceof Div.c) {
            return s.k();
        }
        if (div instanceof Div.k) {
            return s.k();
        }
        if (div instanceof Div.r) {
            return s.k();
        }
        if (div instanceof Div.o) {
            return s.k();
        }
        if (div instanceof Div.b) {
            return DivCollectionExtensionsKt.buildItems(((Div.b) div).c(), expressionResolver);
        }
        if (div instanceof Div.f) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.f) div).c(), expressionResolver);
        }
        if (div instanceof Div.d) {
            return DivCollectionExtensionsKt.buildItems(((Div.d) div).c(), expressionResolver);
        }
        if (div instanceof Div.j) {
            return DivCollectionExtensionsKt.buildItems(((Div.j) div).c(), expressionResolver);
        }
        if (div instanceof Div.p) {
            return DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.p) div).c(), expressionResolver);
        }
        if (div instanceof Div.n) {
            return DivCollectionExtensionsKt.statesToDivItemBuilderResult(((Div.n) div).c(), expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final DivTreeWalk walk(Div div, ExpressionResolver expressionResolver) {
        return new DivTreeWalk(div, expressionResolver);
    }
}
