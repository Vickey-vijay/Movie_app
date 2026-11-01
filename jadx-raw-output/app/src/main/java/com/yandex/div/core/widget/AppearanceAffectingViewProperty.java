package com.yandex.div.core.widget;

import android.view.View;
import bk.l;
import ck.p;
import fk.d;
import jk.k;

/* JADX INFO: compiled from: Views.kt */
/* JADX INFO: loaded from: classes5.dex */
final class AppearanceAffectingViewProperty<T> implements d<View, T> {
    private final l<T, T> modifier;
    private T propertyValue;

    @Override // fk.d
    public /* bridge */ /* synthetic */ Object getValue(View view, k kVar) {
        return getValue2(view, (k<?>) kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fk.d
    public /* bridge */ /* synthetic */ void setValue(View view, k kVar, Object obj) {
        setValue2(view, (k<?>) kVar, obj);
    }

    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public T getValue2(View view, k<?> kVar) {
        return this.propertyValue;
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(View view, k<?> kVar, T t10) {
        T tInvoke;
        l<T, T> lVar = this.modifier;
        if (lVar != null && (tInvoke = lVar.invoke(t10)) != null) {
            t10 = tInvoke;
        }
        if (p.e(this.propertyValue, t10)) {
            return;
        }
        this.propertyValue = t10;
        view.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppearanceAffectingViewProperty(T t10, l<? super T, ? extends T> lVar) {
        this.propertyValue = t10;
        this.modifier = lVar;
    }
}
