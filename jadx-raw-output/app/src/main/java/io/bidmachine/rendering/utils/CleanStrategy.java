package io.bidmachine.rendering.utils;

import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CleanStrategy {
    public abstract boolean a(File file);

    public void clean(@Nullable File file) {
        File[] fileArrListFiles;
        if (file == null || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null && a(file2)) {
                FileUtils.deleteFile(file2);
            }
        }
    }
}
