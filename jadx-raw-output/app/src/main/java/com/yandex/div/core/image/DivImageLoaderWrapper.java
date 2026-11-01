package com.yandex.div.core.image;

import android.content.Context;
import ck.p;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import java.util.Iterator;
import java.util.List;
import lk.a0;
import lk.x;
import nj.r;

/* JADX INFO: compiled from: DivImageLoaderWrapper.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivImageLoaderWrapper implements DivImageLoader {
    private final List<DivImageUrlModifier> modifiers = r.e(new DivImageAssetUrlModifier());
    private final DivImageLoader providedImageLoader;
    private final SvgDivImageLoader svgImageLoader;

    private final String getModifiedUrl(String str) {
        Iterator<T> it = this.modifiers.iterator();
        while (it.hasNext()) {
            str = ((DivImageUrlModifier) it.next()).modifyImageUrl(str);
        }
        return str;
    }

    private final DivImageLoader getProperLoader(String str) {
        return (this.svgImageLoader == null || !isSvg(str)) ? this.providedImageLoader : this.svgImageLoader;
    }

    private final boolean isSvg(String str) {
        int iK0 = a0.k0(str, '?', 0, false, 6, null);
        if (iK0 < 0) {
            iK0 = str.length();
        }
        String strSubstring = str.substring(0, iK0);
        p.i(strSubstring, "substring(...)");
        return x.D(strSubstring, ".svg", false, 2, null);
    }

    public DivImageLoaderWrapper(DivImageLoader divImageLoader, Context context) {
        SvgDivImageLoader svgDivImageLoader;
        this.providedImageLoader = divImageLoader;
        if (!divImageLoader.hasSvgSupport().booleanValue()) {
            svgDivImageLoader = new SvgDivImageLoader(context);
        } else {
            svgDivImageLoader = null;
        }
        this.svgImageLoader = svgDivImageLoader;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback) {
        String modifiedUrl = getModifiedUrl(str);
        return getProperLoader(modifiedUrl).loadImage(modifiedUrl, divImageDownloadCallback);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback) {
        String modifiedUrl = getModifiedUrl(str);
        return getProperLoader(modifiedUrl).loadImageBytes(modifiedUrl, divImageDownloadCallback);
    }
}
