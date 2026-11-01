package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import org.json.JSONArray;
import rj.c;

/* JADX INFO: compiled from: CacheFile.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface CacheFile {
    Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i10, c<? super CacheResult> cVar);
}
