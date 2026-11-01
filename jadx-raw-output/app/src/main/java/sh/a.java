package sh;

import android.media.ThumbnailUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: CacheUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    @Nullable
    public static File cacheVideoFile(@NonNull String str, @NonNull File file, int i10) throws Throwable {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = b.getInputStream(str, i10);
            try {
                try {
                    File file2 = new File(file, Utils.generateFileName(str));
                    if (file2.exists() && file2.length() > 0 && isVideoFileSupported(file2)) {
                        Utils.close(inputStream);
                        return file2;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i11 = inputStream.read(bArr);
                        if (i11 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i11);
                    }
                    Utils.close(fileOutputStream);
                    if (isVideoFileSupported(file2)) {
                        Utils.close(inputStream);
                        return file2;
                    }
                } catch (Exception e10) {
                    e = e10;
                    Logger.w(e);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                Utils.close(inputStream2);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            Utils.close(inputStream2);
            throw th;
        }
        Utils.close(inputStream);
        return null;
    }

    private static boolean isVideoFileSupported(@NonNull File file) {
        if (ThumbnailUtils.createVideoThumbnail(file.getPath(), 1) != null) {
            return true;
        }
        return false;
    }
}
