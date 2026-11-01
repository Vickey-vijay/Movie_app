package o8;

import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: SortUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class o {
    public static void e(List<LocalMediaFolder> list) {
        Collections.sort(list, new Comparator() { // from class: o8.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.c((LocalMediaFolder) obj, (LocalMediaFolder) obj2);
            }
        });
    }

    public static void f(List<LocalMedia> list) {
        Collections.sort(list, new Comparator() { // from class: o8.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.d((LocalMedia) obj, (LocalMedia) obj2);
            }
        });
    }

    public static /* synthetic */ int c(LocalMediaFolder localMediaFolder, LocalMediaFolder localMediaFolder2) {
        if (localMediaFolder.e() != null && localMediaFolder2.e() != null) {
            return Integer.compare(localMediaFolder2.i(), localMediaFolder.i());
        }
        return 0;
    }

    public static /* synthetic */ int d(LocalMedia localMedia, LocalMedia localMedia2) {
        return Long.compare(localMedia2.n(), localMedia.n());
    }
}
