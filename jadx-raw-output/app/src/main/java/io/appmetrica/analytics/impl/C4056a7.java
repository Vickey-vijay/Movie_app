package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4056a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J6 f56328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56330c;

    public final String a(Context context, Y6 y10) {
        File parentFile;
        try {
            File fileA = this.f56328a.a(context, y10.b());
            if (!fileA.exists() && (parentFile = fileA.getParentFile()) != null && (parentFile.exists() || parentFile.mkdirs())) {
                a(context, y10.a(), fileA);
            }
            return fileA.getPath();
        } catch (Throwable unused) {
            return y10.b();
        }
    }

    public C4056a7(J6 j10, ArrayList arrayList, boolean z10) {
        this.f56328a = j10;
        this.f56329b = arrayList;
        this.f56330c = z10;
    }

    public final void a(Context context, String str, File file) {
        List list = this.f56329b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File fileA = ((J6) it.next()).a(context, str);
            if (fileA.exists()) {
                try {
                    if (this.f56330c) {
                        FileUtils.copyToNullable(fileA, file);
                    } else {
                        FileUtils.move(fileA, file);
                    }
                    String path = fileA.getPath();
                    String path2 = file.getPath();
                    for (String str2 : nj.s.n("-journal", "-shm", "-wal")) {
                        File file2 = new File(path + str2);
                        File file3 = new File(path2 + str2);
                        if (this.f56330c) {
                            FileUtils.copyToNullable(file2, file3);
                        } else {
                            FileUtils.move(file2, file3);
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }
}
