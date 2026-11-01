package com.unity3d.ads.core.domain;

import ck.p;
import java.io.File;

/* JADX INFO: compiled from: CommonCreateFile.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(File file, String str) {
        p.j(file, "parent");
        p.j(str, "child");
        return new File(file, str);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(String str) {
        p.j(str, "pathname");
        return new File(str);
    }
}
