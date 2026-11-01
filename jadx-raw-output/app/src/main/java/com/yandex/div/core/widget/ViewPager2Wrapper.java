package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bk.l;
import bk.p;
import ck.i;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerPageTransformer;
import kotlin.jvm.internal.Ref$IntRef;
import mj.r;

/* JADX INFO: compiled from: ViewPager2Wrapper.kt */
/* JADX INFO: loaded from: classes7.dex */
public class ViewPager2Wrapper extends FrameLayout {
    private DivPagerPageTransformer pageTransformer;
    private final ViewPager2 viewPager;

    public ViewPager2Wrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ViewPager2Wrapper(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public String getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public ViewPager2Wrapper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.viewPager = new ViewPager2(context);
        addView(getViewPager());
    }

    private final int findMaxChildDimension(final p<? super RecyclerView.LayoutManager, ? super View, Integer> pVar) {
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        withRecyclerView(new l<RecyclerView, r>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper.findMaxChildDimension.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RecyclerView recyclerView) {
                kk.i<View> children = ViewGroupKt.getChildren(recyclerView);
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                p<RecyclerView.LayoutManager, View, Integer> pVar2 = pVar;
                for (View view : children) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        ref$IntRef2.element = Math.max(ref$IntRef2.element, pVar2.mo1invoke(layoutManager, view).intValue());
                    }
                }
            }
        });
        return ref$IntRef.element;
    }

    public final DivPagerPageTransformer getPageTransformer$div_release() {
        return this.pageTransformer;
    }

    public ViewPager2 getViewPager() {
        return this.viewPager;
    }

    public final void setPageTransformer$div_release(DivPagerPageTransformer divPagerPageTransformer) {
        this.pageTransformer = divPagerPageTransformer;
        getViewPager().setPageTransformer(divPagerPageTransformer);
    }

    public final void setRecycledViewPool(final RecyclerView.RecycledViewPool recycledViewPool) {
        withRecyclerView(new l<RecyclerView, r>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper.setRecycledViewPool.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RecyclerView recyclerView) {
                recyclerView.setRecycledViewPool(recycledViewPool);
            }
        });
    }

    private final void withRecyclerView(l<? super RecyclerView, r> lVar) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        lVar.invoke(recyclerView);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    public final RecyclerView getRecyclerView() {
        View childAt = getViewPager().getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    public final boolean isWrapContentAlongCrossAxis$div_release() {
        if (getOrientation() == 0 && getLayoutParams().height == -2) {
            return true;
        }
        if (getOrientation() == 1 && getLayoutParams().width == -2) {
            return true;
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!isWrapContentAlongCrossAxis$div_release()) {
            super.onMeasure(i10, i11);
            return;
        }
        measureChild(getViewPager(), i10, i11);
        int orientation = getOrientation();
        if (orientation != 0) {
            if (orientation == 1) {
                super.onMeasure(ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxWidth$1.INSTANCE)), i11);
                return;
            }
            return;
        }
        super.onMeasure(i10, ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxHeight$1.INSTANCE)));
    }

    public final void setOrientation(int i10) {
        DivPagerAdapter divPagerAdapter = (DivPagerAdapter) getViewPager().getAdapter();
        if (getViewPager().getOrientation() == i10) {
            boolean z10 = false;
            if (divPagerAdapter != null && divPagerAdapter.getOrientation() == i10) {
                z10 = true;
            }
            if (z10) {
                return;
            }
        }
        getViewPager().setOrientation(i10);
        if (divPagerAdapter != null) {
            divPagerAdapter.setOrientation(i10);
        }
        withRecyclerView(new l<RecyclerView, r>() { // from class: com.yandex.div.core.widget.ViewPager2Wrapper$orientation$1
            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(RecyclerView recyclerView) {
                invoke2(recyclerView);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(RecyclerView recyclerView) {
                recyclerView.getRecycledViewPool().clear();
                for (View view : ViewGroupKt.getChildren(recyclerView)) {
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                }
            }
        });
    }
}
