package com.google.android.gms.internal.ads;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.IOUtils;
import com.safedk.android.internal.partials.AdMobFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfws {
    public static boolean zzb(@NonNull File file, @NonNull byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStreamFileOutputStreamCtor = AdMobFilesBridge.fileOutputStreamCtor(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStreamFileOutputStreamCtor.write(bArr);
                fileOutputStreamFileOutputStreamCtor.flush();
                IOUtils.closeQuietly(fileOutputStreamFileOutputStreamCtor);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                IOUtils.closeQuietly(fileOutputStream);
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStreamFileOutputStreamCtor;
                IOUtils.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static File zzd(@NonNull File file, boolean z10) {
        if (z10 && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File zza(String str, String str2, @NonNull File file) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new File(zzc(str, file), str2);
        }
        return null;
    }

    public static File zzc(String str, @NonNull File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        zzd(file2, false);
        return file2;
    }

    public static boolean zze(@NonNull File file) {
        boolean z10;
        if (!file.exists()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            z10 = true;
            for (File file2 : fileArrListFiles) {
                if (file2 != null && zze(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        } else {
            z10 = true;
        }
        if (file.delete() && z10) {
            return true;
        }
        return false;
    }
}
