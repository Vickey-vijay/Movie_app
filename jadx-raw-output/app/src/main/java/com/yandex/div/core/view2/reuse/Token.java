package com.yandex.div.core.view2.reuse;

import ck.p;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.Div;

/* JADX INFO: compiled from: Token.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Token {
    private final int childIndex;
    private final Div div;
    private final int divHash;
    private final DivItemBuilderResult item;

    public final int getChildIndex() {
        return this.childIndex;
    }

    public final Div getDiv() {
        return this.div;
    }

    public final int getDivHash() {
        return this.divHash;
    }

    public final DivItemBuilderResult getItem() {
        return this.item;
    }

    public final boolean isCombinable(Token token) {
        return this.divHash == token.divHash && p.e(DivUtilKt.getType(this.div), DivUtilKt.getType(token.div));
    }

    public Token(DivItemBuilderResult divItemBuilderResult, int i10) {
        this.item = divItemBuilderResult;
        this.childIndex = i10;
        this.divHash = divItemBuilderResult.getDiv().propertiesHash();
        this.div = divItemBuilderResult.getDiv();
    }
}
