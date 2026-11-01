package io.bidmachine;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public enum MediaAssetType {
    Icon,
    Image,
    Video,
    All;

    public static boolean isAll(@NonNull List<MediaAssetType> list) {
        return list.contains(All) || (list.contains(Icon) && list.contains(Image) && list.contains(Video));
    }
}
