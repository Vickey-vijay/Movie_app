package com.yandex.div.core.view2.divs.gallery;

import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: DivGalleryAdapter.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivGalleryAdapter extends DivCollectionAdapter<DivGalleryViewHolder> {
    private final BindingContext bindingContext;
    private final DivBinder divBinder;
    private final WeakHashMap<DivItemBuilderResult, Long> internalIds;
    private long lastItemId;
    private final DivViewCreator viewCreator;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public DivGalleryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new DivGalleryViewHolder(this.bindingContext, new DivGalleryItemLayout(this.bindingContext.getDivView().getContext$div_release()), this.divBinder, this.viewCreator);
    }

    public DivGalleryAdapter(List<DivItemBuilderResult> list, BindingContext bindingContext, DivBinder divBinder, DivViewCreator divViewCreator, DivStatePath divStatePath) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.viewCreator = divViewCreator;
        this.internalIds = new WeakHashMap<>();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        DivItemBuilderResult divItemBuilderResult = getVisibleItems().get(i10);
        Long l10 = this.internalIds.get(divItemBuilderResult);
        if (l10 != null) {
            return l10.longValue();
        }
        long j10 = this.lastItemId;
        this.lastItemId = 1 + j10;
        this.internalIds.put(divItemBuilderResult, Long.valueOf(j10));
        return j10;
    }
}
