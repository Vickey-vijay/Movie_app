package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class FileObserverC4184f6 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f56712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f56713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4085ba f56714c;

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        if (i10 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f56712a;
        C4085ba c4085ba = this.f56714c;
        File file = this.f56713b;
        c4085ba.getClass();
        consumer.consume(new File(file, str));
    }

    public FileObserverC4184f6(File file, C4236h6 c4236h6, C4085ba c4085ba) {
        super(file.getAbsolutePath(), 8);
        this.f56712a = c4236h6;
        this.f56713b = file;
        this.f56714c = c4085ba;
    }
}
