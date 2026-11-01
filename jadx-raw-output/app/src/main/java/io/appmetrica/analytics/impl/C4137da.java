package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4137da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Boolean f56580a;

    public final void a(Context context) {
        if (this.f56580a == null) {
            synchronized (this) {
                if (this.f56580a == null) {
                    boolean z10 = false;
                    try {
                        File fileFromAppStorage = FileUtils.getFileFromAppStorage(context, "uuid.dat");
                        boolean zExists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                        boolean zExists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                        if (zExists || zExists2) {
                            z10 = true;
                        }
                    } catch (Throwable unused) {
                    }
                    this.f56580a = Boolean.valueOf(z10);
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
    }
}
