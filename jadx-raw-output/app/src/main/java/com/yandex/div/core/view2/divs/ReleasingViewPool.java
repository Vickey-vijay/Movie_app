package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivViewVisitorKt;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: ReleasingViewPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ReleasingViewPool extends RecyclerView.RecycledViewPool {
    private final ReleaseViewVisitor releaseViewVisitor;
    private final Set<RecyclerView.ViewHolder> viewsSet = new LinkedHashSet();

    public ReleasingViewPool(ReleaseViewVisitor releaseViewVisitor) {
        this.releaseViewVisitor = releaseViewVisitor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void clear() {
        super.clear();
        Iterator<T> it = this.viewsSet.iterator();
        while (it.hasNext()) {
            DivViewVisitorKt.visitViewTree(this.releaseViewVisitor, ((RecyclerView.ViewHolder) it.next()).itemView);
        }
        this.viewsSet.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public RecyclerView.ViewHolder getRecycledView(int i10) {
        RecyclerView.ViewHolder recycledView = super.getRecycledView(i10);
        if (recycledView == null) {
            return null;
        }
        this.viewsSet.remove(recycledView);
        return recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        super.putRecycledView(viewHolder);
        if (viewHolder != null) {
            this.viewsSet.add(viewHolder);
        }
    }
}
