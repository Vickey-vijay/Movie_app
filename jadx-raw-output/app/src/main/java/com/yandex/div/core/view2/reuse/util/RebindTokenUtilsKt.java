package com.yandex.div.core.view2.reuse.util;

import com.yandex.div.core.view2.reuse.ExistingToken;
import com.yandex.div.core.view2.reuse.NewToken;

/* JADX INFO: compiled from: RebindTokenUtils.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RebindTokenUtilsKt {
    public static final ExistingToken combineTokens(ExistingToken existingToken, NewToken newToken) {
        return new ExistingToken(newToken.getItem(), newToken.getChildIndex(), existingToken.getView(), existingToken.getParentToken());
    }
}
