package com.yandex.div.core.image;

import lk.a0;
import lk.x;

/* JADX INFO: compiled from: DivImageAssetUrlModifier.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivImageAssetUrlModifier implements DivImageUrlModifier {
    @Override // com.yandex.div.core.image.DivImageUrlModifier
    public String modifyImageUrl(String str) {
        if (!x.R(str, "divkit-asset", false, 2, null)) {
            return str;
        }
        return "file:///android_asset/divkit/" + a0.E0(str, "divkit-asset://");
    }
}
