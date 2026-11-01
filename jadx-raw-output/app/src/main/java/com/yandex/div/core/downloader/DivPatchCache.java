package com.yandex.div.core.downloader;

import androidx.collection.ArrayMap;
import com.yandex.div.DivDataTag;
import com.yandex.div2.Div;
import java.util.List;

/* JADX INFO: compiled from: DivPatchCache.kt */
/* JADX INFO: loaded from: classes9.dex */
public class DivPatchCache {
    private final ArrayMap<DivDataTag, DivPatchMap> patches = new ArrayMap<>();

    public DivPatchMap getPatch(DivDataTag divDataTag) {
        return this.patches.get(divDataTag);
    }

    public List<Div> getPatchDivListById(DivDataTag divDataTag, String str) {
        DivPatchMap divPatchMap = this.patches.get(divDataTag);
        if (divPatchMap == null) {
            return null;
        }
        return divPatchMap.getPatches().get(str);
    }
}
