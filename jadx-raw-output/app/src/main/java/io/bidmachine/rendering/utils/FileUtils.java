package io.bidmachine.rendering.utils;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.internal.o;
import java.io.File;
import java.math.BigInteger;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class FileUtils {
    public static void clearTempFiles(@NonNull Context context) {
        new PrefixCleanStrategy("temp").clean(getExternalDir(context));
    }

    public static boolean deleteFile(@NonNull File file) {
        try {
            return file.delete();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Nullable
    public static String generateFileName(@NonNull String str) {
        byte[] md5 = Utils.getMD5(str.getBytes());
        if (md5 == null) {
            return null;
        }
        return new BigInteger(md5).abs().toString(36);
    }

    @Nullable
    public static File getExternalDir(@NonNull Context context) {
        File externalFilesDir;
        if (!io.bidmachine.util.file.FileUtils.canUseExternalFilesDir() || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            return null;
        }
        File file = new File(externalFilesDir, "Rendering");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @Nullable
    public static File getExternalFile(@NonNull Context context, @Nullable String str) {
        File externalDir;
        if (TextUtils.isEmpty(str) || (externalDir = getExternalDir(context)) == null) {
            return null;
        }
        return new File(externalDir, str);
    }

    @Nullable
    public static File getFileByUrl(@NonNull Context context, @NonNull String str) {
        return getExternalFile(context, generateFileName(str));
    }

    public static boolean isEmpty(@Nullable File file) {
        return file == null || !file.exists() || file.length() <= 0;
    }

    public static boolean isFileOlderThanDate(@NonNull File file, @NonNull Date date) {
        return new Date(file.lastModified()).before(date);
    }

    public static boolean startWith(@NonNull File file, @NonNull String str) {
        return file.getName().startsWith(str);
    }

    @Nullable
    public static Uri toUri(@Nullable File file) {
        if (file == null) {
            return null;
        }
        try {
            return Uri.fromFile(file);
        } catch (Throwable th2) {
            o.b(th2);
            return null;
        }
    }
}
