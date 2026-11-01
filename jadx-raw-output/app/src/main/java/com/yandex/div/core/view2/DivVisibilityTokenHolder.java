package com.yandex.div.core.view2;

import androidx.annotation.AnyThread;
import bk.l;
import ck.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import mj.r;
import oe.c9;

/* JADX INFO: compiled from: DivVisibilityTokenHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
@AnyThread
public final class DivVisibilityTokenHolder {
    private final ConcurrentLinkedQueue<Map<CompositeLogId, c9>> tokens = new ConcurrentLinkedQueue<>();

    public final boolean add(Map<CompositeLogId, c9> map) {
        return this.tokens.add(map);
    }

    public final CompositeLogId getLogId(CompositeLogId compositeLogId) {
        Object next;
        Set setKeySet;
        Iterator<T> it = this.tokens.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Map) next).containsKey(compositeLogId));
        Map map = (Map) next;
        if (map == null || (setKeySet = map.keySet()) == null) {
            return null;
        }
        CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) setKeySet.toArray(new CompositeLogId[0]);
        if (compositeLogIdArr == null) {
            return null;
        }
        for (CompositeLogId compositeLogId2 : compositeLogIdArr) {
            if (p.e(compositeLogId2, compositeLogId)) {
                return compositeLogId2;
            }
        }
        return null;
    }

    public final void remove(CompositeLogId compositeLogId, l<? super Map<CompositeLogId, ? extends c9>, r> lVar) {
        Object next;
        Iterator<T> it = this.tokens.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Map) next).remove(compositeLogId) != null));
        Map map = (Map) next;
        if (map != null && map.isEmpty()) {
            lVar.invoke(map);
            this.tokens.remove(map);
        }
    }
}
