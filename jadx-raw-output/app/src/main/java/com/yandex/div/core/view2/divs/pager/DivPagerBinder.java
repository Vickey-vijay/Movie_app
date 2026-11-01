package com.yandex.div.core.view2.divs.pager;

import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import bk.l;
import ck.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.downloader.DivPatchCache;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.PagerState;
import com.yandex.div.core.state.UpdateStateChangePageCallback;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.ReleasingViewPool;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerLayoutMode;
import jj.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;

/* JADX INFO: compiled from: DivPagerBinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivPagerBinder extends DivViewBinder<Div.j, DivPager, DivPagerView> {
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final DivBaseBinder baseBinder;
    private final DivActionBinder divActionBinder;
    private final a<DivBinder> divBinder;
    private final DivPatchCache divPatchCache;
    private final PagerIndicatorConnector pagerIndicatorConnector;
    private final DivViewCreator viewCreator;

    /* JADX INFO: renamed from: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DivPagerBinder.kt */
    public static final class ViewOnLayoutChangeListenerC40271 implements Disposable, View.OnLayoutChangeListener {
        public final /* synthetic */ DivPager $div;
        public final /* synthetic */ l<Object, r> $observer;
        public final /* synthetic */ ViewPager2 $this_observeSizeChange;
        private int oldSize;

        public ViewOnLayoutChangeListenerC40271(final ViewPager2 viewPager2, final l<Object, r> lVar, DivPager divPager) {
            this.$this_observeSizeChange = viewPager2;
            this.$observer = lVar;
            this.$div = divPager;
            viewPager2.addOnLayoutChangeListener(this);
            OneShotPreDrawListener.add(viewPager2, new Runnable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1$special$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    int size = this.getSize();
                    lVar.invoke(Integer.valueOf(size));
                    this.oldSize = size;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getSize() {
            return this.$this_observeSizeChange.getOrientation() == 0 ? this.$this_observeSizeChange.getWidth() : this.$this_observeSizeChange.getHeight();
        }

        @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
        public void close() {
            this.$this_observeSizeChange.removeOnLayoutChangeListener(this);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int size = getSize();
            if (this.oldSize == size) {
                if (this.$div.f48261u instanceof DivPagerLayoutMode.c) {
                    this.$this_observeSizeChange.requestTransform();
                }
            } else {
                this.oldSize = size;
                this.$observer.invoke(Integer.valueOf(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e3  */
    public final void applyDecorations(DivPagerView divPagerView, DivPager divPager, ExpressionResolver expressionResolver, SparseArray<Float> sparseArray, DivPagerAdapter divPagerAdapter) {
        DivPagerPageSizeProvider wrapContentPageSizeProvider;
        DivPagerPageSizeProvider neighbourPageSizeProvider;
        DivPagerPageSizeProvider divPagerPageSizeProvider;
        DivPagerPaddingsHolder divPagerPaddingsHolder;
        RecyclerView.ItemDecoration wrapContentPageSizeItemDecoration;
        DivPager.ItemAlignment itemAlignment;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        boolean zIsHorizontal = isHorizontal(divPager, expressionResolver);
        divPagerView.setOrientation(!zIsHorizontal ? 1 : 0);
        divPagerAdapter.setCrossAxisAlignment(divPager.f48249i.evaluate(expressionResolver));
        if (ViewsKt.isActuallyLaidOut(divPagerView)) {
            DisplayMetrics displayMetrics = divPagerView.getResources().getDisplayMetrics();
            ViewPager2 viewPager = divPagerView.getViewPager();
            int width = zIsHorizontal ? viewPager.getWidth() : viewPager.getHeight();
            float pxF = BaseDivViewExtensionsKt.toPxF(divPager.f48259s, displayMetrics, expressionResolver);
            boolean zBooleanValue = divPager.f48257q.evaluate(expressionResolver).booleanValue();
            DivPager.ItemAlignment itemAlignmentEvaluate = divPager.D.evaluate(expressionResolver);
            DivPagerPaddingsHolder divPagerPaddingsHolder2 = new DivPagerPaddingsHolder(divPager.r(), expressionResolver, divPagerView, displayMetrics, zIsHorizontal, itemAlignmentEvaluate);
            DivPagerLayoutMode divPagerLayoutMode = divPager.f48261u;
            if (!(divPagerLayoutMode instanceof DivPagerLayoutMode.d)) {
                if (divPagerLayoutMode instanceof DivPagerLayoutMode.b) {
                    neighbourPageSizeProvider = new NeighbourPageSizeProvider(((DivPagerLayoutMode.b) divPagerLayoutMode).c(), expressionResolver, displayMetrics, width, pxF, divPagerPaddingsHolder2, itemAlignmentEvaluate);
                } else {
                    if (!(divPagerLayoutMode instanceof DivPagerLayoutMode.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wrapContentPageSizeProvider = new WrapContentPageSizeProvider(recyclerView, zIsHorizontal, width, divPagerPaddingsHolder2, itemAlignmentEvaluate);
                }
                if (neighbourPageSizeProvider instanceof FixedPageSizeProvider) {
                    FixedPageSizeProvider fixedPageSizeProvider = (FixedPageSizeProvider) neighbourPageSizeProvider;
                    divPagerPageSizeProvider = neighbourPageSizeProvider;
                    new FixedPageSizeOffScreenPagesController(divPagerView, width, pxF, fixedPageSizeProvider, divPagerPaddingsHolder2, zBooleanValue, divPagerAdapter);
                    divPagerPaddingsHolder = divPagerPaddingsHolder2;
                    wrapContentPageSizeItemDecoration = new FixedPageSizeItemDecoration(divPagerPaddingsHolder, fixedPageSizeProvider);
                    itemAlignment = itemAlignmentEvaluate;
                } else {
                    divPagerPageSizeProvider = neighbourPageSizeProvider;
                    divPagerPaddingsHolder = divPagerPaddingsHolder2;
                    new WrapContentPageSizeOffScreenPagesController(divPagerView, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, divPagerAdapter);
                    itemAlignment = itemAlignmentEvaluate;
                    wrapContentPageSizeItemDecoration = new WrapContentPageSizeItemDecoration(width, divPagerPaddingsHolder, itemAlignment);
                }
                setItemDecoration(divPagerView.getViewPager(), wrapContentPageSizeItemDecoration);
                divPagerView.setPageTransformer$div_release(new DivPagerPageTransformer(recyclerView, expressionResolver, sparseArray, width, divPager.f48266z, new DivPagerPageOffsetProvider(width, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, zBooleanValue, divPagerAdapter, itemAlignment), zIsHorizontal));
            }
            wrapContentPageSizeProvider = new PercentagePageSizeProvider(((DivPagerLayoutMode.d) divPagerLayoutMode).c(), expressionResolver, width, divPagerPaddingsHolder2, itemAlignmentEvaluate);
            neighbourPageSizeProvider = wrapContentPageSizeProvider;
            if (neighbourPageSizeProvider instanceof FixedPageSizeProvider) {
                FixedPageSizeProvider fixedPageSizeProvider2 = (FixedPageSizeProvider) neighbourPageSizeProvider;
                divPagerPageSizeProvider = neighbourPageSizeProvider;
                new FixedPageSizeOffScreenPagesController(divPagerView, width, pxF, fixedPageSizeProvider2, divPagerPaddingsHolder2, zBooleanValue, divPagerAdapter);
                divPagerPaddingsHolder = divPagerPaddingsHolder2;
                wrapContentPageSizeItemDecoration = new FixedPageSizeItemDecoration(divPagerPaddingsHolder, fixedPageSizeProvider2);
                itemAlignment = itemAlignmentEvaluate;
            } else {
                divPagerPageSizeProvider = neighbourPageSizeProvider;
                divPagerPaddingsHolder = divPagerPaddingsHolder2;
                new WrapContentPageSizeOffScreenPagesController(divPagerView, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, divPagerAdapter);
                itemAlignment = itemAlignmentEvaluate;
                wrapContentPageSizeItemDecoration = new WrapContentPageSizeItemDecoration(width, divPagerPaddingsHolder, itemAlignment);
            }
            setItemDecoration(divPagerView.getViewPager(), wrapContentPageSizeItemDecoration);
            divPagerView.setPageTransformer$div_release(new DivPagerPageTransformer(recyclerView, expressionResolver, sparseArray, width, divPager.f48266z, new DivPagerPageOffsetProvider(width, pxF, divPagerPageSizeProvider, divPagerPaddingsHolder, zBooleanValue, divPagerAdapter, itemAlignment), zIsHorizontal));
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0220  */
    private final void bind(final DivPagerView divPagerView, BindingContext bindingContext, final DivPager divPager, DivStatePath divStatePath) {
        long jLongValue;
        long j10;
        int i10;
        int position;
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        RecyclerView recyclerView = divPagerView.getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final SparseArray sparseArray = new SparseArray();
        boolean zIsAccessibilityEnabled = this.accessibilityStateProvider.isAccessibilityEnabled(divPagerView.getContext());
        divPagerView.setRecycledViewPool(new ReleasingViewPool(divView.getReleaseViewVisitor$div_release()));
        final DivPagerAdapter divPagerAdapter = new DivPagerAdapter(DivCollectionExtensionsKt.buildItems(divPager, expressionResolver), bindingContext, this.divBinder.get(), sparseArray, this.viewCreator, divStatePath, divPagerView);
        divPagerView.getViewPager().setAdapter(divPagerAdapter);
        bindInfiniteScroll(divPagerView, divPager, expressionResolver);
        DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView.getPagerOnItemsCountChange$div_release();
        if (pagerOnItemsCountChange$div_release != null) {
            pagerOnItemsCountChange$div_release.onItemsUpdated();
        }
        divPagerView.setClipToPage$div_release(divView.getDiv2Component$div_release().isPagerPageClipEnabled());
        divPagerView.setOrientation(!isHorizontal(divPager, expressionResolver) ? 1 : 0);
        divPagerAdapter.setCrossAxisAlignment(divPager.f48249i.evaluate(expressionResolver));
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bind$reusableObserver$1
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
                this.this$0.applyDecorations(divPagerView, divPager, expressionResolver, sparseArray, divPagerAdapter);
            }
        };
        DivEdgeInsets divEdgeInsetsR = divPager.r();
        divPagerView.addSubscription((divEdgeInsetsR == null || (expression4 = divEdgeInsetsR.f47056c) == null) ? null : expression4.observe(expressionResolver, lVar));
        DivEdgeInsets divEdgeInsetsR2 = divPager.r();
        divPagerView.addSubscription((divEdgeInsetsR2 == null || (expression3 = divEdgeInsetsR2.f47057d) == null) ? null : expression3.observe(expressionResolver, lVar));
        DivEdgeInsets divEdgeInsetsR3 = divPager.r();
        divPagerView.addSubscription((divEdgeInsetsR3 == null || (expression2 = divEdgeInsetsR3.f47059f) == null) ? null : expression2.observe(expressionResolver, lVar));
        DivEdgeInsets divEdgeInsetsR4 = divPager.r();
        divPagerView.addSubscription((divEdgeInsetsR4 == null || (expression = divEdgeInsetsR4.f47054a) == null) ? null : expression.observe(expressionResolver, lVar));
        divPagerView.addSubscription(divPager.f48259s.f47188b.observe(expressionResolver, lVar));
        divPagerView.addSubscription(divPager.f48259s.f47187a.observe(expressionResolver, lVar));
        divPagerView.addSubscription(divPager.D.observe(expressionResolver, lVar));
        divPagerView.addSubscription(divPager.f48249i.observe(expressionResolver, lVar));
        divPagerView.addSubscription(divPager.f48264x.observe(expressionResolver, lVar));
        divPagerView.addSubscription(observeSizeChange(divPagerView.getViewPager(), divPager, lVar));
        DivPagerLayoutMode divPagerLayoutMode = divPager.f48261u;
        if (divPagerLayoutMode instanceof DivPagerLayoutMode.b) {
            DivPagerLayoutMode.b bVar = (DivPagerLayoutMode.b) divPagerLayoutMode;
            divPagerView.addSubscription(bVar.c().f48070a.f47188b.observe(expressionResolver, lVar));
            divPagerView.addSubscription(bVar.c().f48070a.f47187a.observe(expressionResolver, lVar));
        } else if (divPagerLayoutMode instanceof DivPagerLayoutMode.d) {
            divPagerView.addSubscription(((DivPagerLayoutMode.d) divPagerLayoutMode).c().f48138a.f48371a.observe(expressionResolver, lVar));
        } else {
            boolean z10 = divPagerLayoutMode instanceof DivPagerLayoutMode.c;
        }
        divPagerView.setPagerSelectedActionsDispatcher$div_release(new PagerSelectedActionsDispatcher(divView, divPagerAdapter.getItemsToShow(), this.divActionBinder));
        divPagerView.setChangePageCallbackForLogger$div_release(new DivPagerPageChangeCallback(divPager, divPagerAdapter.getItemsToShow(), bindingContext, recyclerView, divPagerView));
        DivViewState currentState = divView.getCurrentState();
        if (currentState != null) {
            String id2 = divPager.getId();
            if (id2 == null) {
                id2 = String.valueOf(divPager.hashCode());
            }
            DivViewState.BlockState blockState = currentState.getBlockState(id2);
            PagerState pagerState = blockState instanceof PagerState ? (PagerState) blockState : null;
            divPagerView.setChangePageCallbackForState$div_release(new UpdateStateChangePageCallback(id2, currentState));
            if (pagerState != null) {
                Integer numValueOf = Integer.valueOf(pagerState.getCurrentPageIndex());
                Integer num = Boolean.valueOf(numValueOf.intValue() < divPagerAdapter.getRealPosition(divPagerAdapter.getItemsToShow().size())).booleanValue() ? numValueOf : null;
                if (num != null) {
                    position = num.intValue();
                } else {
                    jLongValue = divPager.f48250j.evaluate(expressionResolver).longValue();
                    j10 = jLongValue >> 31;
                    if (j10 != 0 || j10 == -1) {
                        i10 = (int) jLongValue;
                    } else {
                        KAssert kAssert = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Unable convert '" + jLongValue + "' to Int");
                        }
                        i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    position = divPagerAdapter.getPosition(i10);
                }
            } else {
                jLongValue = divPager.f48250j.evaluate(expressionResolver).longValue();
                j10 = jLongValue >> 31;
                if (j10 != 0) {
                    i10 = (int) jLongValue;
                } else {
                    i10 = (int) jLongValue;
                }
                position = divPagerAdapter.getPosition(i10);
            }
            divPagerView.setCurrentItem$div_release(position);
        }
        divPagerView.addSubscription(divPager.A.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bind.2
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f64562a;
            }

            public final void invoke(boolean z11) {
                divPagerView.setOnInterceptTouchEventListener(z11 ? ParentScrollRestrictor.INSTANCE : null);
            }
        }));
        bindItemBuilder(divPagerView, bindingContext, divPager);
        if (zIsAccessibilityEnabled) {
            divPagerView.enableAccessibility();
        }
    }

    private final void bindItemBuilder(final DivPagerView divPagerView, final BindingContext bindingContext, DivPager divPager) {
        final DivCollectionItemBuilder divCollectionItemBuilder = divPager.f48258r;
        if (divCollectionItemBuilder == null) {
            return;
        }
        BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, bindingContext.getExpressionResolver(), new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bindItemBuilder.1
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
                DivPagerAdapter divPagerAdapter = (DivPagerAdapter) divPagerView.getViewPager().getAdapter();
                if (divPagerAdapter != null) {
                    DivCollectionItemBuilder divCollectionItemBuilder2 = divCollectionItemBuilder;
                    BindingContext bindingContext2 = bindingContext;
                    final DivPagerView divPagerView2 = divPagerView;
                    divPagerAdapter.setItems(DivCollectionExtensionsKt.build(divCollectionItemBuilder2, bindingContext2.getExpressionResolver()));
                    DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView2.getPagerOnItemsCountChange$div_release();
                    if (pagerOnItemsCountChange$div_release != null) {
                        pagerOnItemsCountChange$div_release.onItemsUpdated();
                    }
                    RecyclerView recyclerView = divPagerView2.getRecyclerView();
                    if (recyclerView != null) {
                        recyclerView.scrollToPosition(divPagerAdapter.realItemPosition(divPagerView2.getCurrentItem$div_release()));
                    }
                    divPagerView2.getViewPager().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1$invoke$lambda$1$$inlined$doOnNextLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                            view.removeOnLayoutChangeListener(this);
                            divPagerView2.getViewPager().requestTransform();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
    public final C40261 createInfiniteScrollListener(final DivPagerView divPagerView) {
        return new RecyclerView.OnScrollListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.createInfiniteScrollListener.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
                int itemCount;
                super.onScrolled(recyclerView, i10, i11);
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                p.h(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                RecyclerView.Adapter adapter = divPagerView.getViewPager().getAdapter();
                if (adapter != null) {
                    itemCount = adapter.getItemCount();
                } else {
                    itemCount = 0;
                }
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition >= itemCount - 2 && i10 > 0) {
                    recyclerView.scrollToPosition(2);
                } else if (iFindLastVisibleItemPosition <= 1 && i10 < 0) {
                    recyclerView.scrollToPosition((itemCount - 1) - 2);
                }
            }
        };
    }

    private final boolean isHorizontal(DivPager divPager, ExpressionResolver expressionResolver) {
        return divPager.f48264x.evaluate(expressionResolver) == DivPager.Orientation.HORIZONTAL;
    }

    private final Disposable observeSizeChange(ViewPager2 viewPager2, DivPager divPager, l<Object, r> lVar) {
        return new ViewOnLayoutChangeListenerC40271(viewPager2, lVar, divPager);
    }

    public void bindView(BindingContext bindingContext, DivPagerView divPagerView, Div.j jVar, DivStatePath divStatePath) {
        this.pagerIndicatorConnector.submitPager$div_release(divPagerView, jVar.c());
        Div.j div = divPagerView.getDiv();
        if (jVar != div) {
            if (div != null) {
                divPagerView.setChangePageCallbackForOffScreenPages$div_release(null);
                removeItemDecorations(divPagerView.getViewPager());
                divPagerView.setPageTransformer$div_release(null);
            }
            this.baseBinder.bindView(bindingContext, divPagerView, jVar, div);
            bind(divPagerView, bindingContext, jVar.c(), divStatePath);
            return;
        }
        final ViewPager2 viewPager = divPagerView.getViewPager();
        RecyclerView.Adapter adapter = viewPager.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        if (!divPagerAdapter.applyPatch(divPagerView.getRecyclerView(), this.divPatchCache, bindingContext)) {
            BaseDivViewExtensionsKt.bindStates(divPagerView, bindingContext, this.divBinder.get());
            viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindView$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    viewPager.requestTransform();
                }
            });
        } else {
            DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = divPagerView.getPagerOnItemsCountChange$div_release();
            if (pagerOnItemsCountChange$div_release != null) {
                pagerOnItemsCountChange$div_release.onItemsUpdated();
            }
        }
    }

    public DivPagerBinder(DivBaseBinder divBaseBinder, DivViewCreator divViewCreator, a<DivBinder> aVar, DivPatchCache divPatchCache, DivActionBinder divActionBinder, PagerIndicatorConnector pagerIndicatorConnector, AccessibilityStateProvider accessibilityStateProvider) {
        super(divBaseBinder);
        this.baseBinder = divBaseBinder;
        this.viewCreator = divViewCreator;
        this.divBinder = aVar;
        this.divPatchCache = divPatchCache;
        this.divActionBinder = divActionBinder;
        this.pagerIndicatorConnector = pagerIndicatorConnector;
        this.accessibilityStateProvider = accessibilityStateProvider;
    }

    private final void bindInfiniteScroll(final DivPagerView divPagerView, DivPager divPager, ExpressionResolver expressionResolver) {
        View childAt = divPagerView.getViewPager().getChildAt(0);
        p.h(childAt, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        final RecyclerView recyclerView = (RecyclerView) childAt;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        divPager.f48257q.observeAndGet(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder.bindInfiniteScroll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f64562a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [androidx.recyclerview.widget.RecyclerView] */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v7, types: [androidx.recyclerview.widget.RecyclerView$OnScrollListener] */
            /* JADX WARN: Type inference failed for: r3v9, types: [T, com.yandex.div.core.view2.divs.pager.DivPagerBinder$createInfiniteScrollListener$1] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final void invoke(boolean z10) {
                ?? r10;
                RecyclerView.Adapter adapter = divPagerView.getViewPager().getAdapter();
                DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
                if (divPagerAdapter != null) {
                    divPagerAdapter.setInfiniteScrollEnabled(z10);
                }
                if (!z10) {
                    RecyclerView.OnScrollListener onScrollListener = ref$ObjectRef.element;
                    if (onScrollListener != null) {
                        recyclerView.removeOnScrollListener(onScrollListener);
                        return;
                    }
                    return;
                }
                RecyclerView.OnScrollListener onScrollListener2 = ref$ObjectRef.element;
                if (onScrollListener2 == null) {
                    r10 = onScrollListener2;
                    ?? CreateInfiniteScrollListener = this.createInfiniteScrollListener(divPagerView);
                    ref$ObjectRef.element = CreateInfiniteScrollListener;
                    r10 = CreateInfiniteScrollListener;
                }
                r10 = onScrollListener2;
                recyclerView.addOnScrollListener(r10);
            }
        });
    }

    private final void removeItemDecorations(ViewPager2 viewPager2) {
        int itemDecorationCount = viewPager2.getItemDecorationCount();
        for (int i10 = 0; i10 < itemDecorationCount; i10++) {
            viewPager2.removeItemDecorationAt(i10);
        }
    }

    private final void setItemDecoration(ViewPager2 viewPager2, RecyclerView.ItemDecoration itemDecoration) {
        removeItemDecorations(viewPager2);
        viewPager2.addItemDecoration(itemDecoration);
    }
}
