package com.yandex.div.internal.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Px;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import ck.i;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;

/* JADX INFO: compiled from: PaddingItemDecoration.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PaddingItemDecoration extends RecyclerView.ItemDecoration {

    @Px
    private final int crossItemPadding;

    @Px
    private final int midItemPadding;
    private final int orientation;

    @Px
    private final int paddingBottom;

    @Px
    private final int paddingLeft;

    @Px
    private final int paddingRight;

    @Px
    private final int paddingTop;

    public PaddingItemDecoration() {
        this(0, 0, 0, 0, 0, 0, 0, 127, null);
    }

    public /* synthetic */ PaddingItemDecoration(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, i iVar) {
        this((i17 & 1) != 0 ? 0 : i10, (i17 & 2) != 0 ? 0 : i11, (i17 & 4) != 0 ? 0 : i12, (i17 & 8) != 0 ? 0 : i13, (i17 & 16) != 0 ? 0 : i14, (i17 & 32) != 0 ? 0 : i15, (i17 & 64) != 0 ? 0 : i16);
    }

    public PaddingItemDecoration(@Px int i10, @Px int i11, @Px int i12, @Px int i13, @Px int i14, @Px int i15, int i16) {
        this.paddingLeft = i10;
        this.midItemPadding = i11;
        this.crossItemPadding = i12;
        this.paddingRight = i13;
        this.paddingTop = i14;
        this.paddingBottom = i15;
        this.orientation = i16;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int spanCount;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        boolean z12 = true;
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            spanCount = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        } else {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unsupported layoutManger: " + layoutManager);
                }
            }
            spanCount = 1;
        }
        if (spanCount == 1) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                int itemCount = adapter.getItemCount();
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == -1) {
                    return;
                }
                int i12 = 0;
                if (childAdapterPosition == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i13 = itemCount - 1;
                if (childAdapterPosition == i13) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = this.orientation;
                if (i14 != 0) {
                    if (i14 != 1) {
                        KAssert kAssert2 = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unsupported orientation: " + this.orientation);
                            return;
                        }
                        return;
                    }
                    int i15 = this.paddingLeft;
                    if (z10) {
                        i12 = this.paddingTop;
                    }
                    int i16 = this.paddingRight;
                    if (z11) {
                        i11 = this.paddingBottom;
                    } else {
                        i11 = this.midItemPadding;
                    }
                    rect.set(i15, i12, i16, i11);
                    return;
                }
                if (ViewsKt.isLayoutRtl(recyclerView)) {
                    if (childAdapterPosition == i13) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (childAdapterPosition != 0) {
                        z12 = false;
                    }
                    z11 = z12;
                }
                if (z10) {
                    i12 = this.paddingLeft;
                }
                int i17 = this.paddingTop;
                if (z11) {
                    i10 = this.paddingRight;
                } else {
                    i10 = this.midItemPadding;
                }
                rect.set(i12, i17, i10, this.paddingBottom);
                return;
            }
            return;
        }
        int i18 = this.midItemPadding / 2;
        int i19 = this.crossItemPadding / 2;
        int i20 = this.orientation;
        if (i20 != 0) {
            if (i20 != 1) {
                KAssert kAssert3 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unsupported orientation: " + this.orientation);
                    return;
                }
                return;
            }
            rect.set(i19, i18, i19, i18);
            return;
        }
        rect.set(i18, i19, i18, i19);
    }
}
