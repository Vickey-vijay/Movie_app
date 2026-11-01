package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import mj.r;
import org.json.JSONArray;
import rj.c;

/* JADX INFO: compiled from: CacheRepository.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface CacheRepository {

    /* JADX INFO: compiled from: CacheRepository.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i10, c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i11 & 2) != 0) {
                jSONArray = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return cacheRepository.getFile(str, jSONArray, i10, cVar);
        }
    }

    Object clearCache(c<? super r> cVar);

    Object doesFileExist(String str, c<? super Boolean> cVar);

    Object getCacheSize(c<? super Long> cVar);

    Object getFile(String str, JSONArray jSONArray, int i10, c<? super CacheResult> cVar);

    Object getWebviewFile(String str, String str2, c<? super CacheResult> cVar);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, c<? super CacheResult> cVar);
}
