package com.unity3d.ads.core.data.datasource;

import ck.p;
import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import java.io.File;
import lk.x;
import rj.c;

/* JADX INFO: compiled from: AndroidLocalCacheDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, c<? super CacheResult> cVar) {
        File fileInvoke = this.createFile.invoke(file, str);
        if (fileInvoke.exists()) {
            String name = fileInvoke.getName();
            p.i(name, "file.name");
            if (!x.D(name, ".part", false, 2, null)) {
                String strInvoke = str2 == null || str2.length() == 0 ? null : this.getFileExtensionFromUrl.invoke(str2);
                return new CacheResult.Success(new CachedFile(str2 == null ? "" : str2, str, fileInvoke, strInvoke == null ? "" : strInvoke, fileInvoke.length(), null, num != null ? num.intValue() : Integer.MAX_VALUE, 32, null), CacheSource.LOCAL);
            }
        }
        return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL, null, 4, null);
    }

    public AndroidLocalCacheDataSource(CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl) {
        p.j(createFile, "createFile");
        p.j(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}
