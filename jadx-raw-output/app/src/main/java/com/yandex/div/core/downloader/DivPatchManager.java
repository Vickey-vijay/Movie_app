package com.yandex.div.core.downloader;

import android.view.View;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div2.Div;
import ik.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jj.a;
import nj.l0;
import nj.t;

/* JADX INFO: compiled from: DivPatchManager.kt */
/* JADX INFO: loaded from: classes9.dex */
public class DivPatchManager {
    private final DivPatchCache divPatchCache;
    private final a<Div2Builder> divViewCreator;

    public List<View> buildViewsForId(BindingContext bindingContext, String str) {
        List<Div> patchDivListById = this.divPatchCache.getPatchDivListById(bindingContext.getDivView().getDataTag(), str);
        if (patchDivListById == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(t.v(patchDivListById, 10));
        Iterator<T> it = patchDivListById.iterator();
        while (it.hasNext()) {
            arrayList.add(this.divViewCreator.get().buildView((Div) it.next(), bindingContext, bindingContext.getDivView().getCurrentRootPath$div_release()));
        }
        return arrayList;
    }

    public Map<Div, View> createViewsForId(BindingContext bindingContext, String str) {
        List<Div> patchDivListById = this.divPatchCache.getPatchDivListById(bindingContext.getDivView().getDataTag(), str);
        if (patchDivListById == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k.d(l0.f(t.v(patchDivListById, 10)), 16));
        for (Object obj : patchDivListById) {
            linkedHashMap.put(obj, this.divViewCreator.get().createView((Div) obj, bindingContext, bindingContext.getDivView().getCurrentRootPath$div_release()));
        }
        return linkedHashMap;
    }

    public DivPatchManager(DivPatchCache divPatchCache, a<Div2Builder> aVar) {
        this.divPatchCache = divPatchCache;
        this.divViewCreator = aVar;
    }
}
