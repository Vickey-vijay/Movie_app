package io.bidmachine.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.models.RequestParams;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RequestParams<SelfType extends RequestParams<SelfType>> {
    public abstract void merge(@NonNull SelfType selftype);

    public static <T extends RequestParams<T>> T resolveParams(@Nullable T t10, @Nullable T t11) {
        if (t10 == null) {
            return t11;
        }
        if (t11 != null) {
            t10.merge(t11);
        }
        return t10;
    }
}
