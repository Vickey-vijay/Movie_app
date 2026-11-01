package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.ViewGroup;
import bk.a;
import ck.i;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div2.DivPager;
import java.util.List;
import nj.d;

/* JADX INFO: compiled from: DivPagerAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivPagerAdapter extends DivCollectionAdapter<DivPagerViewHolder> {
    public static final Companion Companion = new Companion(null);
    private final BindingContext bindingContext;
    private DivPager.ItemAlignment crossAxisAlignment;
    private final DivBinder divBinder;
    private boolean infiniteScrollEnabled;
    private final d<DivItemBuilderResult> itemsToShow;
    private int orientation;
    private final SparseArray<Float> pageTranslations;
    private final DivPagerView pagerView;
    private int removedItems;
    private final DivViewCreator viewCreator;

    /* JADX INFO: compiled from: DivPagerAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final void notifyVirtualItemsChanged(int i10) {
        if (i10 >= 0 && i10 < 2) {
            notifyItemRangeChanged(getVisibleItems().size() + i10, 2 - i10);
            return;
        }
        if (i10 < getVisibleItems().size() && getVisibleItems().size() - 2 <= i10) {
            notifyItemRangeChanged((i10 - getVisibleItems().size()) + 2, 2);
        }
    }

    private final int getOffsetToRealItem() {
        return this.infiniteScrollEnabled ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHorizontal() {
        return this.orientation == 0;
    }

    public final DivPager.ItemAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final int getCurrentItem() {
        return this.pagerView.getCurrentItem$div_release();
    }

    public final boolean getInfiniteScrollEnabled() {
        return this.infiniteScrollEnabled;
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemsToShow.size();
    }

    public final d<DivItemBuilderResult> getItemsToShow() {
        return this.itemsToShow;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemChanged(int i10) {
        if (!this.infiniteScrollEnabled) {
            notifyItemChanged(i10);
        } else {
            notifyItemChanged(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemInserted(int i10) {
        if (!this.infiniteScrollEnabled) {
            notifyItemInserted(i10);
        } else {
            notifyItemInserted(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    @Override // com.yandex.div.core.view2.divs.VisibilityAwareAdapter
    public void notifyRawItemRemoved(int i10) {
        this.removedItems++;
        if (!this.infiniteScrollEnabled) {
            notifyItemRemoved(i10);
        } else {
            notifyItemRemoved(i10 + 2);
            notifyVirtualItemsChanged(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public DivPagerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new DivPagerViewHolder(this.bindingContext, new DivPagerPageLayout(this.bindingContext.getDivView().getContext$div_release(), new a<Boolean>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$onCreateViewHolder$view$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isHorizontal());
            }
        }), this.divBinder, this.viewCreator, new a<Boolean>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter.onCreateViewHolder.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Boolean invoke() {
                return Boolean.valueOf(DivPagerAdapter.this.isHorizontal());
            }
        }, new a<DivPager.ItemAlignment>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter.onCreateViewHolder.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final DivPager.ItemAlignment invoke() {
                return DivPagerAdapter.this.getCrossAxisAlignment();
            }
        });
    }

    public final void setCrossAxisAlignment(DivPager.ItemAlignment itemAlignment) {
        this.crossAxisAlignment = itemAlignment;
    }

    public final void setInfiniteScrollEnabled(boolean z10) {
        if (this.infiniteScrollEnabled == z10) {
            return;
        }
        this.infiniteScrollEnabled = z10;
        notifyItemRangeChanged(0, getItemCount());
        DivPagerView divPagerView = this.pagerView;
        divPagerView.setCurrentItem$div_release(divPagerView.getCurrentItem$div_release() + (z10 ? 2 : -2));
    }

    public final void setOrientation(int i10) {
        this.orientation = i10;
    }

    public DivPagerAdapter(List<DivItemBuilderResult> list, BindingContext bindingContext, DivBinder divBinder, SparseArray<Float> sparseArray, DivViewCreator divViewCreator, DivStatePath divStatePath, DivPagerView divPagerView) {
        super(bindingContext, divStatePath, list);
        this.bindingContext = bindingContext;
        this.divBinder = divBinder;
        this.pageTranslations = sparseArray;
        this.viewCreator = divViewCreator;
        this.pagerView = divPagerView;
        this.itemsToShow = new d<DivItemBuilderResult>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerAdapter$itemsToShow$1
            public /* bridge */ boolean contains(DivItemBuilderResult divItemBuilderResult) {
                return super.contains((Object) divItemBuilderResult);
            }

            public /* bridge */ int indexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.indexOf((Object) divItemBuilderResult);
            }

            public /* bridge */ int lastIndexOf(DivItemBuilderResult divItemBuilderResult) {
                return super.lastIndexOf((Object) divItemBuilderResult);
            }

            @Override // nj.b, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return contains((DivItemBuilderResult) obj);
                }
                return false;
            }

            @Override // nj.d, java.util.List
            public DivItemBuilderResult get(int i10) {
                return !this.this$0.getInfiniteScrollEnabled() ? this.this$0.getVisibleItems().get(i10) : this.this$0.getVisibleItems().get(this.this$0.realItemPosition(i10));
            }

            @Override // nj.d, nj.b
            public int getSize() {
                return this.this$0.getVisibleItems().size() + (this.this$0.getInfiniteScrollEnabled() ? 4 : 0);
            }

            @Override // nj.d, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return indexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }

            @Override // nj.d, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof DivItemBuilderResult) {
                    return lastIndexOf((DivItemBuilderResult) obj);
                }
                return -1;
            }
        };
        this.crossAxisAlignment = DivPager.ItemAlignment.START;
    }

    public final int getPosition(int i10) {
        return i10 + getOffsetToRealItem();
    }

    public final int getRealPosition(int i10) {
        return i10 - getOffsetToRealItem();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void onBindViewHolder(DivPagerViewHolder divPagerViewHolder, int i10) {
        super.onBindViewHolder(divPagerViewHolder, realItemPosition(i10));
        Float f10 = this.pageTranslations.get(i10);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            if (isHorizontal()) {
                divPagerViewHolder.itemView.setTranslationX(fFloatValue);
            } else {
                divPagerViewHolder.itemView.setTranslationY(fFloatValue);
            }
        }
    }

    public final int realItemPosition(int i10) {
        boolean z10;
        Integer numValueOf = Integer.valueOf(getVisibleItems().size());
        if (numValueOf.intValue() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return 0;
        }
        int iIntValue = numValueOf.intValue();
        return (getRealPosition(i10) + iIntValue) % iIntValue;
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionAdapter
    public void setItems(List<DivItemBuilderResult> list) {
        int size = getItems().size();
        this.removedItems = 0;
        int currentItem = getCurrentItem();
        super.setItems(list);
        if (this.removedItems == size) {
            this.pagerView.setCurrentItem$div_release(currentItem);
        }
    }
}
