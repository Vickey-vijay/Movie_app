package io.bidmachine.rendering.utils;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class ObjectHolder<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f60937a;

    public ObjectHolder() {
        this(null);
    }

    @Nullable
    public T get() {
        return (T) this.f60937a;
    }

    public void set(@Nullable T t10) {
        this.f60937a = t10;
    }

    public ObjectHolder(@Nullable T t10) {
        this.f60937a = t10;
    }
}
