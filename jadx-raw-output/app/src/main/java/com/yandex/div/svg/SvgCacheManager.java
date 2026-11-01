package com.yandex.div.svg;

import android.graphics.drawable.PictureDrawable;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: SvgCacheManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class SvgCacheManager {
    private final WeakHashMap<String, PictureDrawable> cache = new WeakHashMap<>();

    public final PictureDrawable get(String str) {
        return this.cache.get(str);
    }

    public final void set(String str, PictureDrawable pictureDrawable) {
        this.cache.put(str, pictureDrawable);
    }
}
