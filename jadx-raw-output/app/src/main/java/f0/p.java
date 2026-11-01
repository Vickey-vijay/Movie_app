package f0;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* JADX INFO: compiled from: StorageUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public static boolean a(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        String[] list = file.list();
        if (list != null) {
            for (String str2 : list) {
                a(str + File.separator + str2);
            }
        }
        return file.delete();
    }

    public static boolean b(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (!file2.isDirectory() && file2.exists() && !file2.delete()) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static File c(Context context) {
        File cacheDir;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            cacheDir = context.getExternalCacheDir();
        } else {
            cacheDir = null;
        }
        if (cacheDir == null) {
            cacheDir = context.getCacheDir();
        }
        if (cacheDir == null) {
            return new File("/data/data/" + context.getPackageName() + "/cache/");
        }
        return cacheDir;
    }

    public static File d(Context context) {
        return new File(c(context), "video-cache");
    }
}
