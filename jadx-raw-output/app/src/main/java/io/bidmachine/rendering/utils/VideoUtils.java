package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class VideoUtils {
    public static void saveVideo(@NonNull File file, @NonNull byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                io.bidmachine.iab.utils.Utils.flush(fileOutputStream2);
                io.bidmachine.iab.utils.Utils.close(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                io.bidmachine.iab.utils.Utils.flush(fileOutputStream);
                io.bidmachine.iab.utils.Utils.close(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
