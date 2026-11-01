package com.yandex.div.core.view2.divs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import bk.l;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div2.DivVisibility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mj.r;
import nj.b0;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: VisibilityAwareAdapter.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class VisibilityAwareAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements ExpressionSubscriber {
    private boolean isVisibleItemListValid;
    private final List<DivItemBuilderResult> itemList;
    private final List<Boolean> itemVisibilityList;
    private final List<Disposable> subscriptions;
    private final List<DivItemBuilderResult> visibleItemList = new ArrayList();

    private final int visiblePositionOf(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (this.itemVisibilityList.get(i12).booleanValue()) {
                i11++;
            }
        }
        return i11;
    }

    private final List<DivItemBuilderResult> buildVisibleItemList() {
        if (!this.isVisibleItemListValid) {
            this.visibleItemList.clear();
            List<DivItemBuilderResult> list = this.itemList;
            List<DivItemBuilderResult> list2 = this.visibleItemList;
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                if (!this.itemVisibilityList.get(i10).booleanValue()) {
                    divItemBuilderResult = null;
                }
                if (divItemBuilderResult != null) {
                    list2.add(divItemBuilderResult);
                }
                i10 = i11;
            }
            this.isVisibleItemListValid = true;
        }
        return this.visibleItemList;
    }

    public static /* synthetic */ void setItem$default(VisibilityAwareAdapter visibilityAwareAdapter, int i10, DivItemBuilderResult divItemBuilderResult, DivVisibility divVisibility, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setItem");
        }
        if ((i11 & 4) != 0) {
            divVisibility = VisibilityAwareAdapterKt.getVisibility(divItemBuilderResult);
        }
        visibilityAwareAdapter.setItem(i10, divItemBuilderResult, divVisibility);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemVisibility(int i10, DivVisibility divVisibility) {
        boolean z10 = divVisibility == DivVisibility.VISIBLE;
        boolean zBooleanValue = this.itemVisibilityList.get(i10).booleanValue();
        if (z10 == zBooleanValue) {
            return;
        }
        this.itemVisibilityList.set(i10, Boolean.valueOf(z10));
        this.isVisibleItemListValid = false;
        if (zBooleanValue) {
            notifyVisibleItemRemoved(i10);
        } else {
            notifyVisibleItemInserted(i10);
        }
    }

    public final void addItems(int i10, Collection<DivItemBuilderResult> collection) {
        this.itemList.addAll(i10, collection);
        List<Boolean> list = this.itemVisibilityList;
        ArrayList arrayList = new ArrayList(t.v(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next())));
        }
        list.addAll(i10, arrayList);
        this.isVisibleItemListValid = false;
        int i11 = 0;
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                s.u();
            }
            if (VisibilityAwareAdapterKt.getVisibility((DivItemBuilderResult) obj) == DivVisibility.VISIBLE) {
                notifyVisibleItemInserted(i11 + i10);
            }
            i11 = i12;
        }
    }

    public final List<DivItemBuilderResult> getItems() {
        return this.itemList;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void removeItem(int i10) {
        this.itemList.remove(i10);
        boolean zBooleanValue = this.itemVisibilityList.remove(i10).booleanValue();
        this.isVisibleItemListValid = false;
        if (zBooleanValue) {
            notifyVisibleItemRemoved(i10);
        }
    }

    public final void setItem(int i10, DivItemBuilderResult divItemBuilderResult, DivVisibility divVisibility) {
        boolean z10 = divVisibility == DivVisibility.VISIBLE;
        boolean zBooleanValue = this.itemVisibilityList.get(i10).booleanValue();
        this.itemList.set(i10, divItemBuilderResult);
        this.itemVisibilityList.set(i10, Boolean.valueOf(z10));
        if (z10 || zBooleanValue) {
            this.isVisibleItemListValid = false;
        }
        if (zBooleanValue && !z10) {
            notifyVisibleItemRemoved(i10);
            return;
        }
        if (!zBooleanValue && z10) {
            notifyVisibleItemInserted(i10);
        } else if (zBooleanValue && z10) {
            notifyVisibleItemChanged(i10);
        }
    }

    public VisibilityAwareAdapter(List<DivItemBuilderResult> list) {
        this.itemList = b0.R0(list);
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(VisibilityAwareAdapterKt.isVisible((DivItemBuilderResult) it.next())));
        }
        this.itemVisibilityList = b0.R0(arrayList);
        this.subscriptions = new ArrayList();
        subscribeOnElements();
    }

    private final void notifyVisibleItemChanged(int i10) {
        notifyRawItemChanged(visiblePositionOf(i10));
    }

    private final void notifyVisibleItemInserted(int i10) {
        notifyRawItemInserted(visiblePositionOf(i10));
    }

    private final void notifyVisibleItemRemoved(int i10) {
        notifyRawItemRemoved(visiblePositionOf(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getVisibleItems().size();
    }

    public final List<DivItemBuilderResult> getVisibleItems() {
        return buildVisibleItemList();
    }

    public void notifyRawItemChanged(int i10) {
        notifyItemChanged(i10);
    }

    public void notifyRawItemInserted(int i10) {
        notifyItemInserted(i10);
    }

    public void notifyRawItemRemoved(int i10) {
        notifyItemRemoved(i10);
    }

    public final void subscribeOnElements() {
        closeAllSubscription();
        final int i10 = 0;
        for (Object obj : this.itemList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            addSubscription(divItemBuilderResult.getDiv().b().getVisibility().observe(divItemBuilderResult.getExpressionResolver(), new l<DivVisibility, r>(this) { // from class: com.yandex.div.core.view2.divs.VisibilityAwareAdapter$subscribeOnElements$1$subscription$1
                public final /* synthetic */ VisibilityAwareAdapter<VH> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(DivVisibility divVisibility) {
                    invoke2(divVisibility);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DivVisibility divVisibility) {
                    this.this$0.updateItemVisibility(i10, divVisibility);
                }
            }));
            i10 = i11;
        }
    }
}
