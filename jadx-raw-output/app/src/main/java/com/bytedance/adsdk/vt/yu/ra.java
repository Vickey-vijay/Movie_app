package com.bytedance.adsdk.vt.yu;

import android.util.Pair;
import androidx.multidex.MultiDexExtractor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ra {
    private final fkw ouw;

    public final File ouw(String str, InputStream inputStream, lh lhVar) throws IOException {
        File file = new File(ouw(), ouw(str, lhVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            inputStream.close();
            throw th3;
        }
    }

    public ra(fkw fkwVar) {
        this.ouw = fkwVar;
    }

    public final File ouw() {
        File fileOuw = this.ouw.ouw();
        if (fileOuw.isFile()) {
            fileOuw.delete();
        }
        if (!fileOuw.exists()) {
            fileOuw.mkdirs();
        }
        return fileOuw;
    }

    public static String ouw(String str, lh lhVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? lhVar.ouw() : lhVar.f11352lh);
        return sb2.toString();
    }

    public final Pair<lh, InputStream> ouw(String str) {
        try {
            File fileOuw = ouw();
            lh lhVar = lh.JSON;
            File file = new File(fileOuw, ouw(str, lhVar, false));
            if (!file.exists()) {
                file = new File(ouw(), ouw(str, lh.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (file.getAbsolutePath().endsWith(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                lhVar = lh.ZIP;
            }
            com.bytedance.adsdk.vt.le.yu.ouw("Cache hit for " + str + " at " + file.getAbsolutePath());
            return new Pair<>(lhVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
