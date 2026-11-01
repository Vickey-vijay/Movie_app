package sg.bigo.ads.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import androidx.appcompat.widget.ActivityChooserModel;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f70023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f70024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f70025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f70026d;

    public static long a() {
        if (System.currentTimeMillis() - f70024b > 60000) {
            f70023a = e();
            f70024b = System.currentTimeMillis();
        }
        return f70023a;
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfoD = d(context);
        if (memoryInfoD == null) {
            return 0L;
        }
        return f.a(memoryInfoD.availMem, 3);
    }

    public static <T> Set<T> a(final int i10) {
        return Collections.newSetFromMap(new LinkedHashMap<T, Boolean>() { // from class: sg.bigo.ads.common.utils.p.1
            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<T, Boolean> entry) {
                return size() > i10;
            }
        });
    }

    public static long b(Context context) {
        ActivityManager.MemoryInfo memoryInfoD = d(context);
        if (memoryInfoD == null) {
            return 0L;
        }
        return f.a(memoryInfoD.totalMem, 3);
    }

    public static boolean b() {
        return f() > ServiceProvider.HTTP_CACHE_DISK_SIZE;
    }

    public static int c(Context context) {
        try {
            return (int) Math.min(15728640L, (((long) ((ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getLargeMemoryClass()) / 8) * 1024 * 1024);
        } catch (Exception unused) {
            return 15728640;
        }
    }

    public static long c() {
        if (System.currentTimeMillis() - f70026d > 60000) {
            try {
                f70025c = f();
            } catch (Throwable th2) {
                sg.bigo.ads.common.t.a.a(0, "StorageUtils", th2.toString());
            }
            f70026d = System.currentTimeMillis();
        }
        return f70025c;
    }

    private static ActivityManager.MemoryInfo d(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public static File d() {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    private static long e() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "StorageUtils", "getExternalStorageRemainSpace" + th2.getMessage());
            return 0L;
        }
    }

    private static long f() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
    }
}
