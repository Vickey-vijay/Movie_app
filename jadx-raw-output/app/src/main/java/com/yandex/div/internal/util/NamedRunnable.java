package com.yandex.div.internal.util;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NamedRunnable implements Runnable {

    @NonNull
    private final String mThreadSuffix;

    @WorkerThread
    public abstract void execute();

    public NamedRunnable(@NonNull String str) {
        this.mThreadSuffix = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(name + "-" + this.mThreadSuffix);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
