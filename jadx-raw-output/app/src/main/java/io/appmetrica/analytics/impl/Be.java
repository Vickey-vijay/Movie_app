package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final po f55028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qo f55029c;

    public Be(Context context) {
        this(context, new po(), new qo());
    }

    public final String a(String str) {
        try {
            this.f55029c.getClass();
            if (!qo.a(str)) {
                this.f55028b.getClass();
                str = lk.x.N(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.US);
            }
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f55027a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                Ka.a(str, new FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Be(Context context, po poVar, qo qoVar) {
        this.f55027a = context;
        this.f55028b = poVar;
        this.f55029c = qoVar;
    }

    public final void a() {
        File fileFromAppStorage;
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f55027a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f55027a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
