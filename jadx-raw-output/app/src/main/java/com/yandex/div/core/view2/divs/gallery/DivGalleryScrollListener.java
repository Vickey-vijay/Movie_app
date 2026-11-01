package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import ck.p;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div2.Div;
import com.yandex.div2.DivGallery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: DivGalleryScrollListener.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivGalleryScrollListener extends RecyclerView.OnScrollListener {
    private boolean alreadyLogged;
    private final BindingContext bindingContext;
    private String direction;
    private final Div2View divView;
    private final DivGallery galleryDiv;
    private final DivGalleryItemHelper galleryItemHelper;
    private final int minimumSignificantDx;
    private final DivRecyclerView recycler;
    private int totalDelta;

    private final void trackViews() {
        DivVisibilityActionTracker visibilityActionTracker = this.divView.getDiv2Component$div_release().getVisibilityActionTracker();
        visibilityActionTracker.updateVisibleViews(SequencesKt___SequencesKt.T(ViewGroupKt.getChildren(this.recycler)));
        for (View view : ViewGroupKt.getChildren(this.recycler)) {
            int childAdapterPosition = this.recycler.getChildAdapterPosition(view);
            if (childAdapterPosition != -1) {
                RecyclerView.Adapter adapter = this.recycler.getAdapter();
                p.h(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
                visibilityActionTracker.startTrackingViewsHierarchy(this.bindingContext, view, ((DivGalleryAdapter) adapter).getVisibleItems().get(childAdapterPosition).getDiv());
            }
        }
        Map<View, Div> divWithWaitingDisappearActions = visibilityActionTracker.getDivWithWaitingDisappearActions();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, Div> entry : divWithWaitingDisappearActions.entrySet()) {
            if (!SequencesKt___SequencesKt.w(ViewGroupKt.getChildren(this.recycler), entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            visibilityActionTracker.trackDetachedView(this.bindingContext, (View) entry2.getKey(), (Div) entry2.getValue());
        }
    }

    public DivGalleryScrollListener(BindingContext bindingContext, DivRecyclerView divRecyclerView, DivGalleryItemHelper divGalleryItemHelper, DivGallery divGallery) {
        this.bindingContext = bindingContext;
        this.recycler = divRecyclerView;
        this.galleryItemHelper = divGalleryItemHelper;
        this.galleryDiv = divGallery;
        Div2View divView = bindingContext.getDivView();
        this.divView = divView;
        this.minimumSignificantDx = divView.getConfig().getLogCardScrollSignificantThreshold();
        this.direction = "next";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        super.onScrollStateChanged(recyclerView, i10);
        if (i10 == 1) {
            this.alreadyLogged = false;
        }
        if (i10 == 0) {
            this.divView.getDiv2Component$div_release().getDiv2Logger().logGalleryCompleteScroll(this.divView, this.bindingContext.getExpressionResolver(), this.galleryDiv, this.galleryItemHelper.firstVisibleItemPosition(), this.galleryItemHelper.lastVisibleItemPosition(), this.direction);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        String str;
        super.onScrolled(recyclerView, i10, i11);
        int iWidth = this.minimumSignificantDx;
        if (iWidth > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            iWidth = this.galleryItemHelper.width() / 20;
        }
        int iAbs = this.totalDelta + Math.abs(i10) + Math.abs(i11);
        this.totalDelta = iAbs;
        if (iAbs > iWidth) {
            this.totalDelta = 0;
            if (!this.alreadyLogged) {
                this.alreadyLogged = true;
                this.divView.getDiv2Component$div_release().getDiv2Logger().logGalleryScroll(this.divView);
                if (i10 <= 0 && i11 <= 0) {
                    str = "back";
                } else {
                    str = "next";
                }
                this.direction = str;
            }
            trackViews();
        }
    }
}
