package sa;

import android.content.Context;
import java.io.File;
import java.math.BigDecimal;

/* JADX INFO: compiled from: CleanManagerUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class h {
    public static boolean b(File file) {
        if (file == null || !file.isDirectory()) {
            if (file == null || file.isDirectory()) {
                return true;
            }
            return file.delete();
        }
        for (String str : file.list()) {
            if (!b(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    public static long c(File file) throws Exception {
        long jC = 0;
        try {
            File[] fileArrListFiles = file.listFiles();
            for (int i10 = 0; i10 < fileArrListFiles.length; i10++) {
                jC += fileArrListFiles[i10].isDirectory() ? c(fileArrListFiles[i10]) : fileArrListFiles[i10].length();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jC;
    }

    public static String d(double d10) {
        double d11 = d10 / 1024.0d;
        if (d11 < 1.0d) {
            return "0M";
        }
        double d12 = d11 / 1024.0d;
        if (d12 < 1.0d) {
            return new BigDecimal(Double.toString(d11)).setScale(2, 4).toPlainString() + "KB";
        }
        double d13 = d12 / 1024.0d;
        if (d13 < 1.0d) {
            return new BigDecimal(Double.toString(d12)).setScale(2, 4).toPlainString() + "MB";
        }
        double d14 = d13 / 1024.0d;
        if (d14 < 1.0d) {
            return new BigDecimal(Double.toString(d13)).setScale(2, 4).toPlainString() + "GB";
        }
        return new BigDecimal(d14).setScale(2, 4).toPlainString() + "TB";
    }

    public static void a(Context context) {
        b(context.getCacheDir());
    }

    public static String e(Context context) throws Exception {
        return d(c(context.getCacheDir()));
    }
}
