package com.yandex.div.core.view2.state;

import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivData;
import java.util.List;

/* JADX INFO: compiled from: DivStateSwitcher.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface DivStateSwitcher {
    void switchStates(DivData.State state, List<DivStatePath> list, ExpressionResolver expressionResolver) throws StateConflictException;
}
