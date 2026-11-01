package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ck.p;
import ck.x;
import com.yandex.div2.Div;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import nj.b0;

/* JADX INFO: compiled from: ReusableTokenList.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ReusableTokenList {
    private final HashMap<Integer, LinkedList<ExistingToken>> reusable = new HashMap<>();
    private final Map<Integer, Integer> viewIndexShift = new LinkedHashMap();

    public final ExistingToken pop(int i10) {
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(i10));
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        ExistingToken existingTokenPop = linkedList.pop();
        LinkedList<ExistingToken> linkedList2 = this.reusable.get(Integer.valueOf(i10));
        if (linkedList2 == null || linkedList2.isEmpty()) {
            this.reusable.remove(Integer.valueOf(i10));
        }
        return existingTokenPop;
    }

    public final void clear() {
        this.reusable.clear();
        this.viewIndexShift.clear();
    }

    public final boolean isEmpty() {
        return this.reusable.isEmpty();
    }

    public final boolean remove(ExistingToken existingToken) {
        Object next;
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(existingToken.getDivHash()));
        if (linkedList == null) {
            return false;
        }
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (p.e(((ExistingToken) next).getView(), existingToken.getView())) {
                return x.a(linkedList).remove(next);
            }
        }
        next = null;
        return x.a(linkedList).remove(next);
    }

    public final void add(ExistingToken existingToken) {
        int divHash = existingToken.getDivHash();
        HashMap<Integer, LinkedList<ExistingToken>> map = this.reusable;
        Integer numValueOf = Integer.valueOf(divHash);
        LinkedList<ExistingToken> linkedList = map.get(numValueOf);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            map.put(numValueOf, linkedList);
        }
        linkedList.add(existingToken);
    }

    public final View getUniqueViewForDiv(Div div) {
        ExistingToken existingToken;
        int iPropertiesHash = div.propertiesHash();
        Map<Integer, Integer> map = this.viewIndexShift;
        Integer numValueOf = Integer.valueOf(iPropertiesHash);
        Integer num = map.get(numValueOf);
        if (num == null) {
            num = 0;
            map.put(numValueOf, num);
        }
        int iIntValue = num.intValue();
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(iPropertiesHash));
        ViewGroup viewGroup = null;
        if (linkedList == null || (existingToken = (ExistingToken) b0.i0(linkedList, iIntValue)) == null) {
            return null;
        }
        this.viewIndexShift.put(Integer.valueOf(iPropertiesHash), Integer.valueOf(iIntValue + 1));
        ViewParent parent = existingToken.getView().getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.removeView(existingToken.getView());
        }
        return existingToken.getView();
    }

    public final ExistingToken pop(Div div) {
        return pop(div.propertiesHash());
    }
}
