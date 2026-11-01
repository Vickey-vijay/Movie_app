package com.bytedance.adsdk.vt.yu;

import androidx.multidex.MultiDexExtractor;

/* JADX INFO: loaded from: classes3.dex */
public enum lh {
    JSON(".json"),
    ZIP(MultiDexExtractor.EXTRACTED_SUFFIX);


    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final String f11352lh;

    public final String ouw() {
        return ".temp" + this.f11352lh;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11352lh;
    }

    lh(String str) {
        this.f11352lh = str;
    }
}
