package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import oi.o;

/* JADX INFO: loaded from: classes11.dex */
public enum ArrayListSupplier implements Callable<List<Object>>, o<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> o<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // oi.o
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
