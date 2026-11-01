package com.yandex.div.core.view2;

import bk.l;
import ck.p;
import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: ViewBindingProvider.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ViewBindingProvider {
    private Binding current = new Binding(DivDataTag.INVALID, null);
    private final List<l<Binding, r>> observers = new ArrayList();

    public final void observeAndGet(l<? super Binding, r> lVar) {
        lVar.invoke(this.current);
        this.observers.add(lVar);
    }

    public final void update(DivDataTag divDataTag, DivData divData) {
        if (p.e(divDataTag, this.current.getTag()) && this.current.getData() == divData) {
            return;
        }
        this.current = new Binding(divDataTag, divData);
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(this.current);
        }
    }
}
