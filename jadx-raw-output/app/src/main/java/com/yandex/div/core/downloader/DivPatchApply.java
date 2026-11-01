package com.yandex.div.core.downloader;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.recyclerview.widget.RecyclerView;
import bk.a;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.DivRecyclerView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import nj.b0;
import nj.r;
import nj.s;
import nj.t;
import nj.x;
import oe.e2;

/* JADX INFO: compiled from: DivPatchApply.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPatchApply {
    public static final Companion Companion = new Companion(null);
    private final Set<String> appliedPatches = new LinkedHashSet();
    private final DivPatchMap patch;

    /* JADX INFO: compiled from: DivPatchApply.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final List<Div> applyPatch(Div div, ExpressionResolver expressionResolver) {
        String id2 = div.b().getId();
        if (id2 != null && this.patch.getPatches().containsKey(id2)) {
            return applyPatchForSingleDiv(div);
        }
        if (div instanceof Div.b) {
            div = applyPatch(((Div.b) div).c(), expressionResolver);
        } else if (div instanceof Div.f) {
            div = applyPatch(((Div.f) div).c(), expressionResolver);
        } else if (div instanceof Div.d) {
            div = applyPatch(((Div.d) div).c(), expressionResolver);
        } else if (div instanceof Div.j) {
            div = applyPatch(((Div.j) div).c(), expressionResolver);
        } else if (div instanceof Div.n) {
            div = applyPatch(((Div.n) div).c(), expressionResolver);
        } else if (div instanceof Div.p) {
            div = applyPatch(((Div.p) div).c(), expressionResolver);
        } else if (div instanceof Div.c) {
            div = applyPatch(((Div.c) div).c(), expressionResolver);
        }
        return r.e(div);
    }

    private final List<Div> pathToChildWithId(Div div, String str, ExpressionResolver expressionResolver, List<Div> list) {
        e2 e2VarB;
        list.add(div);
        e2 e2VarB2 = div.b();
        if (e2VarB2 instanceof DivContainer) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivContainer) e2VarB2), str, expressionResolver, list);
        }
        if (e2VarB2 instanceof DivGrid) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivGrid) e2VarB2), str, expressionResolver, list);
        }
        if (e2VarB2 instanceof DivGallery) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivGallery) e2VarB2), str, expressionResolver, list);
        }
        if (e2VarB2 instanceof DivPager) {
            return pathToChildWithId(DivCollectionExtensionsKt.getNonNullItems((DivPager) e2VarB2), str, expressionResolver, list);
        }
        boolean z10 = false;
        if (e2VarB2 instanceof DivTabs) {
            DivTabs divTabs = (DivTabs) e2VarB2;
            List<DivTabs.Item> list2 = divTabs.f49264q;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (p.e(((DivTabs.Item) it.next()).f49276a.b().getId(), str)) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return list;
            }
            Iterator<T> it2 = divTabs.f49264q.iterator();
            while (it2.hasNext()) {
                List<Div> listPathToChildWithId = pathToChildWithId(((DivTabs.Item) it2.next()).f49276a, str, expressionResolver, list);
                if (!listPathToChildWithId.isEmpty()) {
                    return listPathToChildWithId;
                }
                list.remove(s.m(list));
            }
            return s.k();
        }
        if (!(e2VarB2 instanceof DivState)) {
            return s.k();
        }
        DivState divState = (DivState) e2VarB2;
        List<DivState.State> list3 = divState.I;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                Div div2 = ((DivState.State) it3.next()).f49049c;
                if (p.e((div2 == null || (e2VarB = div2.b()) == null) ? null : e2VarB.getId(), str)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            return list;
        }
        List<DivState.State> list4 = divState.I;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            Div div3 = ((DivState.State) it4.next()).f49049c;
            if (div3 != null) {
                arrayList.add(div3);
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            List<Div> listPathToChildWithId2 = pathToChildWithId((Div) it5.next(), str, expressionResolver, list);
            if (!listPathToChildWithId2.isEmpty()) {
                return listPathToChildWithId2;
            }
            list.remove(s.m(list));
        }
        return s.k();
    }

    public final Div patchDivChild(View view, Div div, String str, ExpressionResolver expressionResolver) {
        List listPathToChildWithId$default = pathToChildWithId$default(this, div, str, expressionResolver, null, 8, null);
        Iterator<? extends Div> it = listPathToChildWithId$default.iterator();
        Object obj = null;
        if (listPathToChildWithId$default.isEmpty()) {
            return null;
        }
        it.next();
        ListIterator listIterator = listPathToChildWithId$default.listIterator(listPathToChildWithId$default.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            Div div2 = (Div) objPrevious;
            if ((div2 instanceof Div.d) || (div2 instanceof Div.j)) {
                obj = objPrevious;
                break;
            }
        }
        Div div3 = (Div) obj;
        if (div3 != null) {
            findPatchedRecyclerViewAndNotifyChange(view, div3, str);
        }
        return getPatchedTreeByPath(div, it, expressionResolver);
    }

    private final List<Div> applyPatchForListOfDivs(List<? extends Div> list, ExpressionResolver expressionResolver) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            x.C(arrayList, applyPatch((Div) it.next(), expressionResolver));
        }
        return arrayList;
    }

    private final List<DivState.State> applyPatchForListStates(List<DivState.State> list, ExpressionResolver expressionResolver) {
        e2 e2VarB;
        ArrayList arrayList = new ArrayList();
        for (DivState.State state : list) {
            Div div = state.f49049c;
            String id2 = (div == null || (e2VarB = div.b()) == null) ? null : e2VarB.getId();
            if (id2 != null) {
                List<Div> list2 = this.patch.getPatches().get(id2);
                if (list2 != null && list2.size() == 1) {
                    arrayList.add(new DivState.State(state.f49047a, state.f49048b, list2.get(0), state.f49050d, state.f49051e));
                    this.appliedPatches.add(id2);
                } else if (list2 == null || !list2.isEmpty()) {
                    arrayList.add(tryApplyPatchToDiv(state, expressionResolver));
                } else {
                    this.appliedPatches.add(id2);
                }
            } else {
                arrayList.add(tryApplyPatchToDiv(state, expressionResolver));
            }
        }
        return arrayList;
    }

    private final View findPatchedRecyclerViewAndNotifyChange(View view, Div div, String str) {
        RecyclerView.Adapter adapter;
        Div.j div2;
        DivPager divPagerC;
        List<Div> list;
        Div.d div3;
        DivGallery divGalleryC;
        List<Div> list2;
        int i10 = 0;
        if (view instanceof DivRecyclerView) {
            DivRecyclerView divRecyclerView = (DivRecyclerView) view;
            if (divRecyclerView.getDiv() == div) {
                RecyclerView.Adapter adapter2 = divRecyclerView.getAdapter();
                DivGalleryAdapter divGalleryAdapter = adapter2 instanceof DivGalleryAdapter ? (DivGalleryAdapter) adapter2 : null;
                if (divGalleryAdapter != null && (div3 = divRecyclerView.getDiv()) != null && (divGalleryC = div3.c()) != null && (list2 = divGalleryC.f47281u) != null) {
                    for (Object obj : list2) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            s.u();
                        }
                        if (p.e(((Div) obj).b().getId(), str)) {
                            divGalleryAdapter.notifyItemChanged(i10);
                            return view;
                        }
                        i10 = i11;
                    }
                }
                return view;
            }
        } else if (view instanceof DivPagerView) {
            DivPagerView divPagerView = (DivPagerView) view;
            if (divPagerView.getDiv() == div) {
                View childAt = divPagerView.getViewPager().getChildAt(0);
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null && (div2 = divPagerView.getDiv()) != null && (divPagerC = div2.c()) != null && (list = divPagerC.f48260t) != null) {
                    for (Object obj2 : list) {
                        int i12 = i10 + 1;
                        if (i10 < 0) {
                            s.u();
                        }
                        if (p.e(((Div) obj2).b().getId(), str)) {
                            adapter.notifyItemChanged(i10);
                            return view;
                        }
                        i10 = i12;
                    }
                }
                return view;
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                View viewFindPatchedRecyclerViewAndNotifyChange = findPatchedRecyclerViewAndNotifyChange(it.next(), div, str);
                if (viewFindPatchedRecyclerViewAndNotifyChange != null) {
                    return viewFindPatchedRecyclerViewAndNotifyChange;
                }
            }
        }
        return null;
    }

    private final Div getPatchedTreeByPath(Div div, Iterator<? extends Div> it, final ExpressionResolver expressionResolver) {
        Div nVar;
        final e2 e2VarB = div.b();
        if (e2VarB instanceof DivContainer) {
            return getPatchedDivCollection(div, DivCollectionExtensionsKt.getNonNullItems((DivContainer) e2VarB), it, expressionResolver, new l<List<? extends Div>, Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.1
                {
                    super(1);
                }

                @Override // bk.l
                public final Div invoke(List<? extends Div> list) {
                    return new Div.b(DivContainer.B((DivContainer) e2VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 4194303, null));
                }
            }, new a<Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final Div invoke() {
                    return new DivPatchApply(DivPatchApply.this.patch).applyPatch((DivContainer) e2VarB, expressionResolver);
                }
            });
        }
        if (e2VarB instanceof DivGrid) {
            return getPatchedDivCollection(div, DivCollectionExtensionsKt.getNonNullItems((DivGrid) e2VarB), it, expressionResolver, new l<List<? extends Div>, Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.3
                {
                    super(1);
                }

                @Override // bk.l
                public final Div invoke(List<? extends Div> list) {
                    return new Div.f(DivGrid.B((DivGrid) e2VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null));
                }
            }, new a<Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final Div invoke() {
                    return new DivPatchApply(DivPatchApply.this.patch).applyPatch((DivGrid) e2VarB, expressionResolver);
                }
            });
        }
        if (e2VarB instanceof DivGallery) {
            return getPatchedDivCollection(div, DivCollectionExtensionsKt.getNonNullItems((DivGallery) e2VarB), it, expressionResolver, new l<List<? extends Div>, Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.5
                {
                    super(1);
                }

                @Override // bk.l
                public final Div invoke(List<? extends Div> list) {
                    return new Div.d(DivGallery.B((DivGallery) e2VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 2047, null));
                }
            }, new a<Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final Div invoke() {
                    return new DivPatchApply(DivPatchApply.this.patch).applyPatch((DivGallery) e2VarB, expressionResolver);
                }
            });
        }
        if (e2VarB instanceof DivPager) {
            return getPatchedDivCollection(div, DivCollectionExtensionsKt.getNonNullItems((DivPager) e2VarB), it, expressionResolver, new l<List<? extends Div>, Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.7
                {
                    super(1);
                }

                @Override // bk.l
                public final Div invoke(List<? extends Div> list) {
                    return new Div.j(DivPager.B((DivPager) e2VarB, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2047, null));
                }
            }, new a<Div>() { // from class: com.yandex.div.core.downloader.DivPatchApply.getPatchedTreeByPath.8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // bk.a
                public final Div invoke() {
                    return new DivPatchApply(DivPatchApply.this.patch).applyPatch((DivPager) e2VarB, expressionResolver);
                }
            });
        }
        if (e2VarB instanceof DivTabs) {
            if (!it.hasNext()) {
                return new DivPatchApply(this.patch).applyPatch((DivTabs) e2VarB, expressionResolver);
            }
            DivTabs divTabs = (DivTabs) e2VarB;
            List listR0 = b0.R0(divTabs.f49264q);
            ArrayList arrayList = new ArrayList(t.v(listR0, 10));
            Iterator it2 = listR0.iterator();
            while (it2.hasNext()) {
                arrayList.add(((DivTabs.Item) it2.next()).f49276a);
            }
            int iIndexOf = arrayList.indexOf(it.next());
            if (iIndexOf == -1) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to find the next child to patch by following a precalculated path");
                }
                return div;
            }
            DivTabs.Item item = (DivTabs.Item) listR0.get(iIndexOf);
            listR0.set(iIndexOf, new DivTabs.Item(getPatchedTreeByPath(item.f49276a, it, expressionResolver), item.f49277b, item.f49278c));
            nVar = new Div.p(DivTabs.B(divTabs, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, listR0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 2047, null));
        } else {
            if (!(e2VarB instanceof DivState)) {
                return div;
            }
            if (!it.hasNext()) {
                return new DivPatchApply(this.patch).applyPatch((DivState) e2VarB, expressionResolver);
            }
            DivState divState = (DivState) e2VarB;
            List listR1 = b0.R0(divState.I);
            ArrayList arrayList2 = new ArrayList(t.v(listR1, 10));
            Iterator it3 = listR1.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((DivState.State) it3.next()).f49049c);
            }
            int iIndexOf2 = arrayList2.indexOf(it.next());
            if (iIndexOf2 == -1) {
                KAssert kAssert2 = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to find the next child to patch by following a precalculated path");
                }
                return div;
            }
            DivState.State state = (DivState.State) listR1.get(iIndexOf2);
            Div div2 = state.f49049c;
            if (div2 == null) {
                return div;
            }
            listR1.set(iIndexOf2, new DivState.State(state.f49047a, state.f49048b, getPatchedTreeByPath(div2, it, expressionResolver), state.f49050d, state.f49051e));
            nVar = new Div.n(DivState.B(divState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, listR1, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 65531, null));
        }
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List pathToChildWithId$default(DivPatchApply divPatchApply, Div div, String str, ExpressionResolver expressionResolver, List list, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            list = new ArrayList();
        }
        return divPatchApply.pathToChildWithId(div, str, expressionResolver, (List<Div>) list);
    }

    private final DivState.State tryApplyPatchToDiv(DivState.State state, ExpressionResolver expressionResolver) {
        Div div = state.f49049c;
        List<Div> listApplyPatch = div != null ? applyPatch(div, expressionResolver) : null;
        return listApplyPatch != null && listApplyPatch.size() == 1 ? new DivState.State(state.f49047a, state.f49048b, listApplyPatch.get(0), state.f49050d, state.f49051e) : state;
    }

    public DivPatchApply(DivPatchMap divPatchMap) {
        this.patch = divPatchMap;
    }

    private final List<Div> applyPatchForSingleDiv(Div div) {
        String id2 = div.b().getId();
        if (id2 == null) {
            return r.e(div);
        }
        List<Div> list = this.patch.getPatches().get(id2);
        if (list != null) {
            this.appliedPatches.add(id2);
            return list;
        }
        return r.e(div);
    }

    private final Div getPatchedDivCollection(Div div, List<? extends Div> list, Iterator<? extends Div> it, ExpressionResolver expressionResolver, l<? super List<? extends Div>, ? extends Div> lVar, a<? extends Div> aVar) {
        if (!it.hasNext()) {
            return aVar.invoke();
        }
        int iIndexOf = list.indexOf(it.next());
        if (iIndexOf == -1) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable to find the next child to patch by following a precalculated path");
            }
            return div;
        }
        List listR0 = b0.R0(list);
        listR0.set(iIndexOf, getPatchedTreeByPath((Div) listR0.get(iIndexOf), it, expressionResolver));
        return lVar.invoke(listR0);
    }

    public final List<Div> applyPatchForDiv(Div div, ExpressionResolver expressionResolver) {
        return applyPatch(div, expressionResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.b applyPatch(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return new Div.b(DivContainer.B(divContainer, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(divContainer.B, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 4194303, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.f applyPatch(DivGrid divGrid, ExpressionResolver expressionResolver) {
        return new Div.f(DivGrid.B(divGrid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(divGrid.f47480y, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 16383, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.d applyPatch(DivGallery divGallery, ExpressionResolver expressionResolver) {
        return new Div.d(DivGallery.B(divGallery, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(divGallery.f47281u, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 2047, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Div.j applyPatch(DivPager divPager, ExpressionResolver expressionResolver) {
        return new Div.j(DivPager.B(divPager, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListOfDivs(divPager.f48260t, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 2047, null));
    }

    private final Div.n applyPatch(DivState divState, ExpressionResolver expressionResolver) {
        return new Div.n(DivState.B(divState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, applyPatchForListStates(divState.I, expressionResolver), null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 65531, null));
    }

    private final Div.c applyPatch(DivCustom divCustom, ExpressionResolver expressionResolver) {
        return new Div.c(divCustom.A(((-32769) & 1) != 0 ? divCustom.q() : null, ((-32769) & 2) != 0 ? divCustom.g() : null, ((-32769) & 4) != 0 ? divCustom.n() : null, ((-32769) & 8) != 0 ? divCustom.o() : null, ((-32769) & 16) != 0 ? divCustom.y() : null, ((-32769) & 32) != 0 ? divCustom.getBackground() : null, ((-32769) & 64) != 0 ? divCustom.z() : null, ((-32769) & 128) != 0 ? divCustom.b() : null, ((-32769) & 256) != 0 ? divCustom.f46873i : null, ((-32769) & 512) != 0 ? divCustom.f46874j : null, ((-32769) & 1024) != 0 ? divCustom.k() : null, ((-32769) & 2048) != 0 ? divCustom.getExtensions() : null, ((-32769) & 4096) != 0 ? divCustom.p() : null, ((-32769) & 8192) != 0 ? divCustom.w() : null, ((-32769) & 16384) != 0 ? divCustom.getHeight() : null, ((-32769) & 32768) != 0 ? divCustom.getId() : null, ((-32769) & 65536) != 0 ? divCustom.f46881q : applyPatchForListOfDivs(divCustom.f46881q, expressionResolver), ((-32769) & 131072) != 0 ? divCustom.t() : null, ((-32769) & 262144) != 0 ? divCustom.d() : null, ((-32769) & 524288) != 0 ? divCustom.r() : null, ((-32769) & 1048576) != 0 ? divCustom.f() : null, ((-32769) & 2097152) != 0 ? divCustom.e() : null, ((-32769) & 4194304) != 0 ? divCustom.s() : null, ((-32769) & 8388608) != 0 ? divCustom.h() : null, ((-32769) & 16777216) != 0 ? divCustom.l() : null, ((-32769) & 33554432) != 0 ? divCustom.j() : null, ((-32769) & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? divCustom.x() : null, ((-32769) & 134217728) != 0 ? divCustom.i() : null, ((-32769) & 268435456) != 0 ? divCustom.m() : null, ((-32769) & 536870912) != 0 ? divCustom.u() : null, ((-32769) & 1073741824) != 0 ? divCustom.c() : null, ((-32769) & Integer.MIN_VALUE) != 0 ? divCustom.getVisibility() : null, (7 & 1) != 0 ? divCustom.v() : null, (7 & 2) != 0 ? divCustom.a() : null, (7 & 4) != 0 ? divCustom.getWidth() : null));
    }

    private final Div.p applyPatch(DivTabs divTabs, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivTabs.Item item : divTabs.f49264q) {
            List<Div> listApplyPatch = applyPatch(item.f49276a, expressionResolver);
            if (listApplyPatch.size() == 1) {
                arrayList.add(new DivTabs.Item(listApplyPatch.get(0), item.f49277b, item.f49278c));
            } else {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivPatchApply", "Unable to patch tab because there is more than 1 div in the patch");
                }
                arrayList.add(item);
            }
        }
        return new Div.p(DivTabs.B(divTabs, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -65537, 2047, null));
    }

    private final List<Div> pathToChildWithId(List<? extends Div> list, String str, ExpressionResolver expressionResolver, List<Div> list2) {
        boolean z10 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (p.e(((Div) it.next()).b().getId(), str)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            return list2;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            List<Div> listPathToChildWithId = pathToChildWithId((Div) it2.next(), str, expressionResolver, list2);
            if (!listPathToChildWithId.isEmpty()) {
                return listPathToChildWithId;
            }
            list2.remove(s.m(list2));
        }
        return s.k();
    }
}
