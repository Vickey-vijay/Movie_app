package com.yandex.div.core.state;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import bk.a;
import bk.l;
import ck.p;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import mj.r;
import nj.b0;
import nj.s;
import nj.t;
import oe.e2;

/* JADX INFO: compiled from: DivPathUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivPathUtils {
    public static final DivPathUtils INSTANCE = new DivPathUtils();

    private DivPathUtils() {
    }

    private final <T> Div findRecursively(Iterable<? extends T> iterable, String str, ExpressionResolver expressionResolver, l<? super T, ? extends Div> lVar) {
        Div divFindByPath;
        Iterator<? extends T> it = iterable.iterator();
        do {
            divFindByPath = null;
            if (!it.hasNext()) {
                break;
            }
            Div divInvoke = lVar.invoke(it.next());
            if (divInvoke != null) {
                divFindByPath = INSTANCE.findByPath(divInvoke, str, expressionResolver);
            }
        } while (divFindByPath == null);
        return divFindByPath;
    }

    public final List<String> getIds(List<? extends Div> list) {
        return getIds$default(this, list, new l<Div, Div>() { // from class: com.yandex.div.core.state.DivPathUtils.getIds.1
            @Override // bk.l
            public final Div invoke(Div div) {
                return div;
            }
        }, null, 2, null);
    }

    private final Div findByPath(Div div, String str, ExpressionResolver expressionResolver) {
        if (div instanceof Div.n) {
            Div.n nVar = (Div.n) div;
            if (!p.e(getId$div_release$default(INSTANCE, nVar.c(), null, 1, null), str)) {
                div = null;
            }
            Div.n nVar2 = (Div.n) div;
            return nVar2 != null ? nVar2 : findRecursively(nVar.c().I, str, expressionResolver, new l<DivState.State, Div>() { // from class: com.yandex.div.core.state.DivPathUtils.findByPath.2
                @Override // bk.l
                public final Div invoke(DivState.State state) {
                    return state.f49049c;
                }
            });
        }
        if (div instanceof Div.p) {
            return findRecursively(((Div.p) div).c().f49264q, str, expressionResolver, new l<DivTabs.Item, Div>() { // from class: com.yandex.div.core.state.DivPathUtils.findByPath.3
                @Override // bk.l
                public final Div invoke(DivTabs.Item item) {
                    return item.f49276a;
                }
            });
        }
        if (div instanceof Div.b) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.b) div).c(), expressionResolver), str);
        }
        if (div instanceof Div.f) {
            return findRecursively$default(this, DivCollectionExtensionsKt.getNonNullItems(((Div.f) div).c()), str, expressionResolver, null, 4, null);
        }
        if (div instanceof Div.d) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.d) div).c(), expressionResolver), str);
        }
        if (div instanceof Div.j) {
            return findRecursively(DivCollectionExtensionsKt.buildItems(((Div.j) div).c(), expressionResolver), str);
        }
        if (div instanceof Div.c) {
            List<Div> list = ((Div.c) div).c().f46881q;
            if (list != null) {
                return findRecursively$default(this, list, str, expressionResolver, null, 4, null);
            }
            return null;
        }
        if ((div instanceof Div.q) || (div instanceof Div.g) || (div instanceof Div.m) || (div instanceof Div.i) || (div instanceof Div.e) || (div instanceof Div.h) || (div instanceof Div.l) || (div instanceof Div.k) || (div instanceof Div.r) || (div instanceof Div.o)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Div findRecursively(Iterable<DivItemBuilderResult> iterable, String str) {
        for (DivItemBuilderResult divItemBuilderResult : iterable) {
            Div divFindByPath = INSTANCE.findByPath(divItemBuilderResult.component1(), str, divItemBuilderResult.component2());
            if (divFindByPath != null) {
                return divFindByPath;
            }
        }
        return null;
    }

    public static /* synthetic */ Div findRecursively$default(DivPathUtils divPathUtils, Iterable iterable, String str, ExpressionResolver expressionResolver, l lVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = new l() { // from class: com.yandex.div.core.state.DivPathUtils.findRecursively.1
                @Override // bk.l
                public final Div invoke(Object obj2) {
                    return (Div) obj2;
                }
            };
        }
        return divPathUtils.findRecursively(iterable, str, expressionResolver, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getId$div_release$default(DivPathUtils divPathUtils, DivState divState, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        return divPathUtils.getId$div_release(divState, aVar);
    }

    public static /* synthetic */ List getIds$default(DivPathUtils divPathUtils, List list, l lVar, l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar2 = new l() { // from class: com.yandex.div.core.state.DivPathUtils.getIds.2
                @Override // bk.l
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        return divPathUtils.getIds(list, lVar, lVar2);
    }

    public final DivStateLayout findStateLayout$div_release(View view, DivStatePath divStatePath) throws StateConflictException {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof DivStateLayout) {
            DivStateLayout divStateLayout = (DivStateLayout) view;
            if (lastStateEquals(divStateLayout.getPath(), divStatePath)) {
                return divStateLayout;
            }
        }
        Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
        DivStateLayout divStateLayout2 = null;
        while (it.hasNext()) {
            DivStateLayout divStateLayoutFindStateLayout$div_release = findStateLayout$div_release(it.next(), divStatePath);
            if (divStateLayoutFindStateLayout$div_release != null) {
                if (p.e(String.valueOf(divStateLayout2 != null ? divStateLayout2.getPath() : null), String.valueOf(divStateLayoutFindStateLayout$div_release.getPath()))) {
                    throw new StateConflictException("Error resolving state for '" + divStatePath + "'. Found multiple elements that respond to path '" + divStateLayoutFindStateLayout$div_release.getPath() + "'!", null, 2, null);
                }
                divStateLayout2 = divStateLayoutFindStateLayout$div_release;
            }
        }
        return divStateLayout2;
    }

    public final String getId$div_release(DivState divState, a<r> aVar) {
        String str = divState.f49034p;
        if (str != null) {
            return str;
        }
        String id2 = divState.getId();
        if (id2 != null) {
            return id2;
        }
        if (aVar != null) {
            aVar.invoke();
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5 A[SYNTHETIC] */
    public final <T> List<String> getIds(List<? extends T> list, l<? super T, ? extends Div> lVar, l<? super T, ExpressionResolverImpl> lVar2) {
        ExpressionResolverImpl expressionResolverImplInvoke;
        String itemBuilderData;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String id2 = INSTANCE.getId(lVar.invoke(it.next()));
            if (id2 != null) {
                Integer num = (Integer) linkedHashMap.get(id2);
                linkedHashMap.put(id2, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        int i10 = 0;
        for (T t10 : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            String id3 = INSTANCE.getId(lVar.invoke(t10));
            if (id3 == null) {
                expressionResolverImplInvoke = lVar2.invoke(t10);
                if (expressionResolverImplInvoke != null) {
                    itemBuilderData = expressionResolverImplInvoke.getItemBuilderData();
                } else {
                    itemBuilderData = null;
                }
                id3 = itemBuilderData;
                if (id3 == null) {
                    id3 = ChildPathUnitCache.INSTANCE.getValue$div_release(i10);
                }
            } else {
                Integer num2 = (Integer) linkedHashMap.get(id3);
                if ((num2 != null ? num2.intValue() : 0) > 1) {
                    id3 = id3 + '#' + i10;
                }
                if (id3 == null) {
                    expressionResolverImplInvoke = lVar2.invoke(t10);
                    if (expressionResolverImplInvoke != null) {
                        itemBuilderData = expressionResolverImplInvoke.getItemBuilderData();
                    } else {
                        itemBuilderData = null;
                    }
                    id3 = itemBuilderData;
                    if (id3 == null) {
                        id3 = ChildPathUnitCache.INSTANCE.getValue$div_release(i10);
                    }
                }
            }
            arrayList.add(id3);
            i10 = i11;
        }
        return arrayList;
    }

    public final List<String> getItemIds(List<DivItemBuilderResult> list) {
        return getIds(list, new l<DivItemBuilderResult, Div>() { // from class: com.yandex.div.core.state.DivPathUtils.getItemIds.1
            @Override // bk.l
            public final Div invoke(DivItemBuilderResult divItemBuilderResult) {
                return divItemBuilderResult.getDiv();
            }
        }, new l<DivItemBuilderResult, ExpressionResolverImpl>() { // from class: com.yandex.div.core.state.DivPathUtils.getItemIds.2
            @Override // bk.l
            public final ExpressionResolverImpl invoke(DivItemBuilderResult divItemBuilderResult) {
                return UtilsKt.getAsImpl(divItemBuilderResult.getExpressionResolver());
            }
        });
    }

    private final boolean lastStateEquals(DivStatePath divStatePath, DivStatePath divStatePath2) {
        DivStatePath divStatePathParentState;
        String fullPath$div_release = null;
        if (divStatePath2.getContainsOnlyStates$div_release()) {
            if (divStatePath != null) {
                fullPath$div_release = divStatePath.getPathToLastState();
            }
            return p.e(fullPath$div_release, divStatePath2.getPathToLastState());
        }
        if (divStatePath != null && (divStatePathParentState = divStatePath.parentState()) != null) {
            fullPath$div_release = divStatePathParentState.getFullPath$div_release();
        }
        return p.e(fullPath$div_release, divStatePath2.parentState().getFullPath$div_release());
    }

    public final List<DivStatePath> compactPathList$div_release(List<DivStatePath> list) {
        List listE;
        if (list.isEmpty()) {
            return list;
        }
        List<DivStatePath> listH0 = b0.H0(list, DivStatePath.Companion.alphabeticalComparator$div_release());
        Object objF0 = b0.f0(listH0);
        int iV = t.v(listH0, 9);
        if (iV == 0) {
            listE = nj.r.e(objF0);
        } else {
            ArrayList arrayList = new ArrayList(iV + 1);
            arrayList.add(objF0);
            Object obj = objF0;
            for (DivStatePath divStatePath : listH0) {
                DivStatePath divStatePath2 = (DivStatePath) obj;
                if (!divStatePath2.isAncestorOf(divStatePath)) {
                    divStatePath2 = divStatePath;
                }
                arrayList.add(divStatePath2);
                obj = divStatePath2;
            }
            listE = arrayList;
        }
        return b0.W(listE);
    }

    public final Div findDivState$div_release(Div div, DivStatePath divStatePath, ExpressionResolver expressionResolver) {
        List<Pair<String, String>> states = divStatePath.getStates();
        if (states.isEmpty()) {
            return null;
        }
        Iterator<T> it = states.iterator();
        while (it.hasNext()) {
            String str = (String) ((Pair) it.next()).component1();
            if (div == null || (div = INSTANCE.findByPath(div, str, expressionResolver)) == null) {
                return null;
            }
        }
        return div;
    }

    public final String getId(Div div) {
        e2 e2VarB = div.b();
        if (e2VarB instanceof DivState) {
            return getId$div_release$default(INSTANCE, (DivState) e2VarB, null, 1, null);
        }
        return e2VarB.getId();
    }

    public final Pair<DivStateLayout, Div.n> tryFindStateDivAndLayout$div_release(View view, DivData.State state, DivStatePath divStatePath, ExpressionResolver expressionResolver) throws StateConflictException {
        Div.n div;
        boolean z10;
        DivStateLayout divStateLayoutFindStateLayout$div_release = findStateLayout$div_release(view, divStatePath);
        if (divStateLayoutFindStateLayout$div_release == null) {
            DivStatePath divStatePathParentState = divStatePath.parentState();
            if (divStatePathParentState.isRootPath() && state.f46947b == divStatePath.getTopLevelStateId()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || findStateLayout$div_release(view, divStatePathParentState) == null) {
                return null;
            }
        }
        if (divStateLayoutFindStateLayout$div_release == null || (div = divStateLayoutFindStateLayout$div_release.getDiv()) == null) {
            Div divFindDivState$div_release = findDivState$div_release(state.f46946a, divStatePath, expressionResolver);
            if (divFindDivState$div_release instanceof Div.n) {
                div = (Div.n) divFindDivState$div_release;
            } else {
                div = null;
            }
            if (div == null) {
                return null;
            }
        }
        return new Pair<>(divStateLayoutFindStateLayout$div_release, div);
    }
}
