package com.yandex.div.core.view2.divs.gallery;

import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.DivLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bk.l;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.GalleryState;
import com.yandex.div.core.state.UpdateStateScrollListener;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.widget.PaddingItemDecoration;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivGallery;
import jj.a;
import mj.r;

/* JADX INFO: compiled from: DivGalleryBinder.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivGalleryBinder extends DivViewBinder<Div.d, DivGallery, DivRecyclerView> {
    private final DivBaseBinder baseBinder;
    private final a<DivBinder> divBinder;
    private final DivPatchCache divPatchCache;
    private final float recyclerScrollInterceptionAngle;
    private final DivViewCreator viewCreator;

    /* JADX INFO: compiled from: DivGalleryBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivGallery.ScrollMode.values().length];
            try {
                iArr[DivGallery.ScrollMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivGallery.ScrollMode.PAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void bindItemBuilder(final DivRecyclerView divRecyclerView, final BindingContext bindingContext, DivGallery divGallery) {
        final DivCollectionItemBuilder divCollectionItemBuilder = divGallery.f47279s;
        if (divCollectionItemBuilder == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, bindingContext.getExpressionResolver(), new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder.bindItemBuilder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivGalleryAdapter divGalleryAdapter = (DivGalleryAdapter) divRecyclerView.getAdapter();
                if (divGalleryAdapter != null) {
                    divGalleryAdapter.setItems(DivCollectionExtensionsKt.build(divCollectionItemBuilder, bindingContext.getExpressionResolver()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDecorations(DivRecyclerView divRecyclerView, BindingContext bindingContext, DivGallery divGallery) {
        PaddingItemDecoration paddingItemDecoration;
        int visibleItemIndex;
        int paddingStart;
        DisplayMetrics displayMetrics = divRecyclerView.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        int i10 = divGallery.f47284x.evaluate(expressionResolver) == DivGallery.Orientation.HORIZONTAL ? 0 : 1;
        boolean z10 = divGallery.D.evaluate(expressionResolver) == DivGallery.Scrollbar.AUTO;
        divRecyclerView.setVerticalScrollBarEnabled(z10 && i10 == 1);
        divRecyclerView.setHorizontalScrollBarEnabled(z10 && i10 == 0);
        divRecyclerView.setScrollbarFadingEnabled(false);
        Expression<Long> expression = divGallery.f47268h;
        long jLongValue = expression != null ? expression.evaluate(expressionResolver).longValue() : 1L;
        divRecyclerView.setClipChildren(false);
        if (jLongValue == 1) {
            paddingItemDecoration = new PaddingItemDecoration(0, BaseDivViewExtensionsKt.dpToPx(divGallery.f47280t.evaluate(expressionResolver), displayMetrics), 0, 0, 0, 0, i10, 61, null);
        } else {
            int iDpToPx = BaseDivViewExtensionsKt.dpToPx(divGallery.f47280t.evaluate(expressionResolver), displayMetrics);
            Expression<Long> expression2 = divGallery.f47271k;
            if (expression2 == null) {
                expression2 = divGallery.f47280t;
            }
            paddingItemDecoration = new PaddingItemDecoration(0, iDpToPx, BaseDivViewExtensionsKt.dpToPx(expression2.evaluate(expressionResolver), displayMetrics), 0, 0, 0, i10, 57, null);
        }
        setItemDecoration(divRecyclerView, paddingItemDecoration);
        DivGallery.ScrollMode scrollModeEvaluate = divGallery.C.evaluate(expressionResolver);
        divRecyclerView.setScrollMode(scrollModeEvaluate);
        int i11 = WhenMappings.$EnumSwitchMapping$0[scrollModeEvaluate.ordinal()];
        if (i11 == 1) {
            PagerSnapStartHelper pagerSnapStartHelper = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper != null) {
                pagerSnapStartHelper.attachToRecyclerView(null);
            }
        } else if (i11 == 2) {
            int iDpToPx2 = BaseDivViewExtensionsKt.dpToPx(divGallery.f47280t.evaluate(expressionResolver), divRecyclerView.getResources().getDisplayMetrics());
            PagerSnapStartHelper pagerSnapStartHelper2 = divRecyclerView.getPagerSnapStartHelper();
            if (pagerSnapStartHelper2 != null) {
                pagerSnapStartHelper2.setItemSpacing(iDpToPx2);
            } else {
                pagerSnapStartHelper2 = new PagerSnapStartHelper(iDpToPx2);
                divRecyclerView.setPagerSnapStartHelper(pagerSnapStartHelper2);
            }
            pagerSnapStartHelper2.attachToRecyclerView(divRecyclerView);
        }
        DivGalleryItemHelper divLinearLayoutManager = jLongValue == 1 ? new DivLinearLayoutManager(bindingContext, divRecyclerView, divGallery, i10) : new DivGridLayoutManager(bindingContext, divRecyclerView, divGallery, i10);
        divRecyclerView.setLayoutManager(divLinearLayoutManager.toLayoutManager());
        divRecyclerView.setScrollInterceptionAngle(this.recyclerScrollInterceptionAngle);
        divRecyclerView.clearOnScrollListeners();
        DivViewState currentState = bindingContext.getDivView().getCurrentState();
        if (currentState != null) {
            String id2 = divGallery.getId();
            if (id2 == null) {
                id2 = String.valueOf(divGallery.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(id2);
            GalleryState galleryState = blockState instanceof GalleryState ? (GalleryState) blockState : null;
            if (galleryState != null) {
                visibleItemIndex = galleryState.getVisibleItemIndex();
            } else {
                long jLongValue2 = divGallery.f47272l.evaluate(expressionResolver).longValue();
                long j10 = jLongValue2 >> 31;
                if (j10 == 0 || j10 == -1) {
                    visibleItemIndex = (int) jLongValue2;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
                    }
                    visibleItemIndex = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            if (galleryState != null) {
                paddingStart = galleryState.getScrollOffset();
            } else if (visibleItemIndex != 0) {
                paddingStart = 0;
            } else {
                paddingStart = i10 == 0 ? divRecyclerView.getPaddingStart() : divRecyclerView.getPaddingTop();
            }
            scrollToPositionInternal(divRecyclerView, visibleItemIndex, paddingStart, ScrollPositionKt.toScrollPosition(scrollModeEvaluate));
            divRecyclerView.addOnScrollListener(new UpdateStateScrollListener(id2, currentState, divLinearLayoutManager));
        }
        divRecyclerView.addOnScrollListener(new DivGalleryScrollListener(bindingContext, divRecyclerView, divLinearLayoutManager, divGallery));
        divRecyclerView.setOnInterceptTouchEventListener(divGallery.f47286z.evaluate(expressionResolver).booleanValue() ? ParentScrollRestrictor.INSTANCE : null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void bindView(BindingContext bindingContext, DivRecyclerView divRecyclerView, Div.d dVar, DivStatePath divStatePath) {
        DivRecyclerView divRecyclerView2 = divRecyclerView instanceof DivRecyclerView ? divRecyclerView : null;
        Div.d div = divRecyclerView2 != null ? divRecyclerView2.getDiv() : null;
        if (dVar != div) {
            this.baseBinder.bindView(bindingContext, divRecyclerView, dVar, div);
            bind(divRecyclerView, bindingContext, dVar.c(), divStatePath);
            return;
        }
        RecyclerView.Adapter adapter = divRecyclerView.getAdapter();
        DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
        if (divGalleryAdapter == null) {
            return;
        }
        divGalleryAdapter.applyPatch(divRecyclerView, this.divPatchCache, bindingContext);
        BaseDivViewExtensionsKt.bindStates(divRecyclerView, bindingContext, this.divBinder.get());
    }

    public DivGalleryBinder(DivBaseBinder divBaseBinder, DivViewCreator divViewCreator, a<DivBinder> aVar, DivPatchCache divPatchCache, float f10) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = aVar;
        this.divPatchCache = divPatchCache;
        this.recyclerScrollInterceptionAngle = f10;
    }

    private final void bind(final DivRecyclerView divRecyclerView, final BindingContext bindingContext, final DivGallery divGallery, DivStatePath divStatePath) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        l<? super DivGallery.Orientation, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$bind$reusableObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.this$0.updateDecorations(divRecyclerView, bindingContext, divGallery);
            }
        };
        divRecyclerView.addSubscription(divGallery.f47284x.observe(expressionResolver, lVar));
        divRecyclerView.addSubscription(divGallery.D.observe(expressionResolver, lVar));
        divRecyclerView.addSubscription(divGallery.C.observe(expressionResolver, lVar));
        divRecyclerView.addSubscription(divGallery.f47280t.observe(expressionResolver, lVar));
        divRecyclerView.addSubscription(divGallery.f47286z.observe(expressionResolver, lVar));
        Expression<Long> expression = divGallery.f47268h;
        if (expression != null) {
            divRecyclerView.addSubscription(expression.observe(expressionResolver, lVar));
        }
        divRecyclerView.setRecycledViewPool(new ReleasingViewPool(bindingContext.getDivView().getReleaseViewVisitor$div_release()));
        divRecyclerView.setScrollingTouchSlop(1);
        divRecyclerView.setClipToPadding(false);
        divRecyclerView.setOverScrollMode(2);
        divRecyclerView.setAdapter(new DivGalleryAdapter(DivCollectionExtensionsKt.buildItems(divGallery, expressionResolver), bindingContext, this.divBinder.get(), this.viewCreator, divStatePath));
        bindItemBuilder(divRecyclerView, bindingContext, divGallery);
        resetAnimatorAndRestoreOnLayout(divRecyclerView);
        updateDecorations(divRecyclerView, bindingContext, divGallery);
    }

    private final void removeItemDecorations(DivRecyclerView divRecyclerView) {
        int itemDecorationCount = divRecyclerView.getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 < itemDecorationCount) {
                divRecyclerView.removeItemDecorationAt(itemDecorationCount);
            } else {
                return;
            }
        }
    }

    private final void resetAnimatorAndRestoreOnLayout(final DivRecyclerView divRecyclerView) {
        final RecyclerView.ItemAnimator itemAnimator = divRecyclerView.getItemAnimator();
        divRecyclerView.setItemAnimator(null);
        if (ViewsKt.isActuallyLaidOut(divRecyclerView) && !divRecyclerView.isLayoutRequested()) {
            if (divRecyclerView.getItemAnimator() == null) {
                divRecyclerView.setItemAnimator(itemAnimator);
                return;
            }
            return;
        }
        divRecyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryBinder$resetAnimatorAndRestoreOnLayout$$inlined$doOnActualLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                if (divRecyclerView.getItemAnimator() == null) {
                    divRecyclerView.setItemAnimator(itemAnimator);
                }
            }
        });
    }

    private final void scrollToPositionInternal(DivRecyclerView divRecyclerView, int i10, int i11, ScrollPosition scrollPosition) {
        DivGalleryItemHelper divGalleryItemHelper;
        Object layoutManager = divRecyclerView.getLayoutManager();
        if (layoutManager instanceof DivGalleryItemHelper) {
            divGalleryItemHelper = (DivGalleryItemHelper) layoutManager;
        } else {
            divGalleryItemHelper = null;
        }
        if (divGalleryItemHelper == null) {
            return;
        }
        if (i11 == 0 && i10 == 0) {
            divGalleryItemHelper.instantScrollToPosition(i10, scrollPosition);
        } else {
            divGalleryItemHelper.instantScrollToPositionWithOffset(i10, i11, scrollPosition);
        }
    }

    private final void setItemDecoration(DivRecyclerView divRecyclerView, RecyclerView.ItemDecoration itemDecoration) {
        removeItemDecorations(divRecyclerView);
        divRecyclerView.addItemDecoration(itemDecoration);
    }
}
