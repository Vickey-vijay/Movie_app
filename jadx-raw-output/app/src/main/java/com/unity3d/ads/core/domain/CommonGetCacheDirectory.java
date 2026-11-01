package com.unity3d.ads.core.domain;

import ck.p;
import java.io.File;

/* JADX INFO: compiled from: CommonGetCacheDirectory.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    public File invoke(File file, String str) {
        p.j(file, "cacheDirectoryBase");
        p.j(str, "cacheDirectoryPath");
        return new File(file, str);
    }
}
