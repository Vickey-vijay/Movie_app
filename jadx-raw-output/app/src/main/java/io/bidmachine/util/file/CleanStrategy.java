package io.bidmachine.util.file;

import com.ironsource.C3426d4;
import java.io.File;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: CleanStrategy.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/file/CleanStrategy;", "", "Ljava/io/File;", "dir", "Lmj/r;", "clean", C3426d4.i.f28530b, "", "canDelete", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public interface CleanStrategy {
    boolean canDelete(File file);

    default void clean(File file) {
        if (file != null) {
            try {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null && canDelete(file2)) {
                            FileUtils.deleteFile(file2);
                        }
                    }
                    r rVar = r.f64562a;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
