package com.yandex.div.core.util;

import android.view.View;
import androidx.collection.SparseArrayCompat;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.internal.core.ExpressionSubscriber;

/* JADX INFO: compiled from: Releasables.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ReleasablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ExpressionSubscriber getExpressionSubscriber(View view) {
        if (view instanceof ExpressionSubscriber) {
            return (ExpressionSubscriber) view;
        }
        int i10 = R$id.div_releasable_list;
        Object tag = view.getTag(i10);
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat();
            view.setTag(i10, sparseArrayCompat);
        }
        Object obj = sparseArrayCompat.get(0);
        ExpressionSubscriber expressionSubscriber = obj instanceof ExpressionSubscriber ? (ExpressionSubscriber) obj : null;
        if (expressionSubscriber != null) {
            return expressionSubscriber;
        }
        ExpressionSubscriberImpl expressionSubscriberImpl = new ExpressionSubscriberImpl();
        sparseArrayCompat.put(0, expressionSubscriberImpl);
        return expressionSubscriberImpl;
    }

    public static final Iterable<Releasable> getReleasableList(View view) {
        Object tag = view.getTag(R$id.div_releasable_list);
        SparseArrayCompat sparseArrayCompat = tag instanceof SparseArrayCompat ? (SparseArrayCompat) tag : null;
        if (sparseArrayCompat != null) {
            return SparseArraysKt.toIterable(sparseArrayCompat);
        }
        return null;
    }
}
