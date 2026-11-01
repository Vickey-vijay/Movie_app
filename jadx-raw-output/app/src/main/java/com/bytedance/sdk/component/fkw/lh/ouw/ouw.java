package com.bytedance.sdk.component.fkw.lh.ouw;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw implements com.bytedance.sdk.component.fkw.vt, Cloneable {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.fkw.vt f11701le;
    private File fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f11702lh;
    private long ouw;
    private int vt;
    private boolean yu;

    public ouw(int i10, long j10, File file) {
        this(i10, j10, i10 != 0, j10 != 0, file);
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean le() {
        return false;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int lh() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final long ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int yu() {
        return 0;
    }

    private ouw(int i10, long j10, boolean z10, boolean z11, File file) {
        this.ouw = j10;
        this.vt = i10;
        this.f11702lh = z10;
        this.yu = z11;
        this.fkw = file;
    }

    public static com.bytedance.sdk.component.fkw.vt bly() {
        return f11701le;
    }

    public static void ouw(Context context, com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar != null) {
            f11701le = vtVar;
        } else {
            f11701le = ouw(new File(context.getCacheDir(), "image"));
        }
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean fkw() {
        return this.f11702lh;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final File pno() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean ra() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int vt() {
        return this.vt;
    }

    private static long tlj() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }

    public static com.bytedance.sdk.component.fkw.vt ouw(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (f11701le == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(tlj() / 16, 41943040L);
        } else {
            iMin = Math.min(f11701le.vt() / 2, 31457280);
            jMin = Math.min(f11701le.ouw() / 2, 41943040L);
        }
        return new ouw(Math.max(iMin, 26214400), Math.max(jMin, ServiceProvider.HTTP_CACHE_DISK_SIZE), file);
    }
}
