package com.yandex.div.internal.core;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.Releasable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ExpressionSubscriber.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface ExpressionSubscriber extends Releasable {
    List<Disposable> getSubscriptions();

    default void addSubscription(Disposable disposable) {
        if (disposable == null || disposable == Disposable.NULL) {
            return;
        }
        getSubscriptions().add(disposable);
    }

    default void closeAllSubscription() {
        Iterator<T> it = getSubscriptions().iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        getSubscriptions().clear();
    }

    @Override // com.yandex.div.core.view2.Releasable
    default void release() {
        closeAllSubscription();
    }
}
