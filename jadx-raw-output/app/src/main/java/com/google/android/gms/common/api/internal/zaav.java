package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zaav implements Runnable {
    public final /* synthetic */ zaaw zab;

    @WorkerThread
    public abstract void zaa();

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        this.zab.zab.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    zaa();
                }
            } catch (RuntimeException e10) {
                this.zab.zaa.zam(e10);
            }
        } finally {
            this.zab.zab.unlock();
        }
    }
}
