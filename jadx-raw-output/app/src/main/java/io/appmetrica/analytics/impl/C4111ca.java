package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4111ca implements Co {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56484b;

    @Override // io.appmetrica.analytics.impl.Co
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f56483a, this.f56484b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f56483a, this.f56484b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return yj.g.k(fileFromSdkStorage, null, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public C4111ca(Context context, String str) {
        this.f56483a = context;
        this.f56484b = str;
    }

    @Override // io.appmetrica.analytics.impl.Co
    public final void a(String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f56483a, this.f56484b);
            if (fileFromSdkStorage != null) {
                yj.g.n(fileFromSdkStorage, str, null, 2, null);
            }
        } catch (Throwable unused) {
        }
    }
}
