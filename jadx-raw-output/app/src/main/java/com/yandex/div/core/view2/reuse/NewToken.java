package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivState;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nj.r;
import nj.s;

/* JADX INFO: compiled from: NewToken.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class NewToken extends Token {
    private ExistingToken lastExistingParent;

    private final List<NewToken> itemsToNewTokenList(List<DivItemBuilderResult> list) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            arrayList.add(new NewToken((DivItemBuilderResult) obj, i10, this.lastExistingParent));
            i10 = i11;
        }
        return arrayList;
    }

    public final ExistingToken getLastExistingParent() {
        return this.lastExistingParent;
    }

    public final void setLastExistingParent(ExistingToken existingToken) {
        this.lastExistingParent = existingToken;
    }

    public NewToken(DivItemBuilderResult divItemBuilderResult, int i10, ExistingToken existingToken) {
        super(divItemBuilderResult, i10);
        this.lastExistingParent = existingToken;
    }

    public final List<NewToken> getChildrenTokens() {
        Div div;
        ExpressionResolver expressionResolver = getItem().getExpressionResolver();
        Div div2 = getItem().getDiv();
        if (div2 instanceof Div.q) {
            return s.k();
        }
        if (div2 instanceof Div.g) {
            return s.k();
        }
        if (div2 instanceof Div.e) {
            return s.k();
        }
        if (div2 instanceof Div.l) {
            return s.k();
        }
        if (div2 instanceof Div.h) {
            return s.k();
        }
        if (div2 instanceof Div.m) {
            return s.k();
        }
        if (div2 instanceof Div.i) {
            return s.k();
        }
        if (div2 instanceof Div.k) {
            return s.k();
        }
        if (div2 instanceof Div.r) {
            return s.k();
        }
        if (div2 instanceof Div.o) {
            return s.k();
        }
        if (div2 instanceof Div.b) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Div.b) div2).c(), expressionResolver));
        }
        if (div2 instanceof Div.c) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(DivCollectionExtensionsKt.getNonNullItems(((Div.c) div2).c()), expressionResolver));
        }
        if (div2 instanceof Div.f) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.f) div2).c(), expressionResolver));
        }
        if (div2 instanceof Div.d) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Div.d) div2).c(), expressionResolver));
        }
        if (div2 instanceof Div.j) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.buildItems(((Div.j) div2).c(), expressionResolver));
        }
        if (div2 instanceof Div.p) {
            return itemsToNewTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(((Div.p) div2).c(), expressionResolver));
        }
        if (div2 instanceof Div.n) {
            DivState.State defaultState = DivUtilKt.getDefaultState(((Div.n) div2).c(), expressionResolver);
            if (defaultState != null && (div = defaultState.f49049c) != null) {
                return itemsToNewTokenList(r.e(DivCollectionExtensionsKt.toItemBuilderResult(div, expressionResolver)));
            }
            return s.k();
        }
        throw new NoWhenBranchMatchedException();
    }
}
