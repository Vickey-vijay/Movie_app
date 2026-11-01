package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.widgets.DivCustomWrapper;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nj.d;
import nj.r;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: ExistingToken.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ExistingToken extends Token {
    private final ExistingToken parentToken;
    private final View view;

    private final List<ExistingToken> itemsToExistingTokenList(DivContainer divContainer, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        return simpleItemsToExistingTokenList(DivCollectionExtensionsKt.buildItems(divContainer, expressionResolver), existingToken);
    }

    public static /* synthetic */ List getChildrenTokens$default(ExistingToken existingToken, ExistingToken existingToken2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            existingToken2 = null;
        }
        return existingToken.getChildrenTokens(existingToken2);
    }

    private final List<ExistingToken> itemsToExistingTokenList(DivCustom divCustom, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivCustomWrapper divCustomWrapper = view instanceof DivCustomWrapper ? (DivCustomWrapper) view : null;
        View customView = divCustomWrapper != null ? divCustomWrapper.getCustomView() : null;
        ViewGroup viewGroup = customView instanceof ViewGroup ? (ViewGroup) customView : null;
        if (viewGroup == null) {
            return s.k();
        }
        int i10 = 0;
        for (Object obj : DivCollectionExtensionsKt.getNonNullItems(divCustom)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivItemBuilderResult itemBuilderResult = DivCollectionExtensionsKt.toItemBuilderResult((Div) obj, expressionResolver);
            View childAt = viewGroup.getChildAt(i10);
            if (childAt == null) {
                return s.k();
            }
            arrayList.add(new ExistingToken(itemBuilderResult, i10, childAt, existingToken == null ? this : existingToken));
            i10 = i11;
        }
        return arrayList;
    }

    private final List<ExistingToken> simpleItemsToExistingTokenList(List<DivItemBuilderResult> list, ExistingToken existingToken) {
        View childAt;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            View view = this.view;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (childAt = viewGroup.getChildAt(i10)) == null) {
                return s.k();
            }
            arrayList.add(new ExistingToken(divItemBuilderResult, i10, childAt, existingToken == null ? this : existingToken));
            i10 = i11;
        }
        return arrayList;
    }

    private final List<ExistingToken> stateToExistingTokenList(ExpressionResolver expressionResolver, ExistingToken existingToken) {
        Div activeStateDiv$div_release;
        View view = this.view;
        DivStateLayout divStateLayout = view instanceof DivStateLayout ? (DivStateLayout) view : null;
        return (divStateLayout == null || (activeStateDiv$div_release = divStateLayout.getActiveStateDiv$div_release()) == null) ? s.k() : simpleItemsToExistingTokenList(DivCollectionExtensionsKt.toDivItemBuilderResult(r.e(activeStateDiv$div_release), expressionResolver), existingToken);
    }

    public final ExistingToken getParentToken() {
        return this.parentToken;
    }

    public final View getView() {
        return this.view;
    }

    public ExistingToken(DivItemBuilderResult divItemBuilderResult, int i10, View view, ExistingToken existingToken) {
        super(divItemBuilderResult, i10);
        this.view = view;
        this.parentToken = existingToken;
    }

    public final List<ExistingToken> getChildrenTokens(ExistingToken existingToken) {
        Div div = getDiv();
        if (div instanceof Div.q) {
            return s.k();
        }
        if (div instanceof Div.g) {
            return s.k();
        }
        if (div instanceof Div.e) {
            return s.k();
        }
        if (div instanceof Div.l) {
            return s.k();
        }
        if (div instanceof Div.h) {
            return s.k();
        }
        if (div instanceof Div.m) {
            return s.k();
        }
        if (div instanceof Div.i) {
            return s.k();
        }
        if (div instanceof Div.k) {
            return s.k();
        }
        if (div instanceof Div.r) {
            return s.k();
        }
        if (div instanceof Div.o) {
            return s.k();
        }
        if (div instanceof Div.b) {
            return itemsToExistingTokenList(((Div.b) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Div.c) {
            return itemsToExistingTokenList(((Div.c) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Div.f) {
            return itemsToExistingTokenList(((Div.f) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Div.d) {
            return itemsToExistingTokenList(((Div.d) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (div instanceof Div.j) {
            return itemsToExistingTokenList(((Div.j) getDiv()).c(), getItem().getExpressionResolver(), existingToken);
        }
        if (!(div instanceof Div.p)) {
            if (div instanceof Div.n) {
                return stateToExistingTokenList(getItem().getExpressionResolver(), existingToken);
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new RebindTask.UnsupportedElementException(getDiv().getClass());
    }

    private final List<ExistingToken> itemsToExistingTokenList(DivGrid divGrid, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        return simpleItemsToExistingTokenList(DivCollectionExtensionsKt.itemsToDivItemBuilderResult(divGrid, expressionResolver), existingToken);
    }

    private final List<ExistingToken> itemsToExistingTokenList(DivPager divPager, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        ViewPager2 viewPager;
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivPagerView divPagerView = view instanceof DivPagerView ? (DivPagerView) view : null;
        if (divPagerView != null && (viewPager = divPagerView.getViewPager()) != null) {
            RecyclerView.Adapter adapter = viewPager.getAdapter();
            DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
            if (divPagerAdapter == null) {
                return s.k();
            }
            d<DivItemBuilderResult> itemsToShow = divPagerAdapter.getItemsToShow();
            ArrayList arrayList2 = new ArrayList(t.v(itemsToShow, 10));
            Iterator<DivItemBuilderResult> it = itemsToShow.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(it.next().getDiv().hash()));
            }
            List<DivItemBuilderResult> listBuildItems = DivCollectionExtensionsKt.buildItems(divPager, expressionResolver);
            int i10 = 0;
            for (Object obj : listBuildItems) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
                if (arrayList2.contains(Integer.valueOf(divItemBuilderResult.getDiv().hash()))) {
                    View pageView = ((DivPagerView) this.view).getPageView(arrayList2.indexOf(Integer.valueOf(divItemBuilderResult.getDiv().hash())));
                    if (pageView != null) {
                        arrayList.add(new ExistingToken(divItemBuilderResult, i10, pageView, existingToken == null ? this : existingToken));
                    }
                }
                i10 = i11;
            }
            return arrayList;
        }
        return s.k();
    }

    private final List<ExistingToken> itemsToExistingTokenList(DivGallery divGallery, ExpressionResolver expressionResolver, ExistingToken existingToken) {
        View itemView;
        ArrayList arrayList = new ArrayList();
        View view = this.view;
        DivRecyclerView divRecyclerView = view instanceof DivRecyclerView ? (DivRecyclerView) view : null;
        RecyclerView.Adapter adapter = divRecyclerView != null ? divRecyclerView.getAdapter() : null;
        DivGalleryAdapter divGalleryAdapter = adapter instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter : null;
        if (divGalleryAdapter == null) {
            return s.k();
        }
        List<DivItemBuilderResult> visibleItems = divGalleryAdapter.getVisibleItems();
        ArrayList arrayList2 = new ArrayList(t.v(visibleItems, 10));
        Iterator<T> it = visibleItems.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((DivItemBuilderResult) it.next()).getDiv().hash()));
        }
        List<DivItemBuilderResult> listBuildItems = DivCollectionExtensionsKt.buildItems(divGallery, expressionResolver);
        int i10 = 0;
        for (Object obj : listBuildItems) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            if (arrayList2.contains(Integer.valueOf(divItemBuilderResult.getDiv().hash())) && (itemView = ((DivRecyclerView) this.view).getItemView(i10)) != null) {
                arrayList.add(new ExistingToken(divItemBuilderResult, i10, itemView, existingToken == null ? this : existingToken));
            }
            i10 = i11;
        }
        return arrayList;
    }
}
