package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public final class Vf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f56026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f56027b;

    @Override // java.lang.Runnable
    public final void run() {
        File[] fileArrListFiles;
        if (!this.f56026a.exists() || !this.f56026a.isDirectory() || (fileArrListFiles = this.f56026a.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                this.f56027b.consume(file);
            } catch (Throwable unused) {
            }
        }
    }

    public Vf(File file, C4236h6 c4236h6) {
        this.f56026a = file;
        this.f56027b = c4236h6;
    }
}
