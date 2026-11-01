package com.yandex.div.internal.core;

import bk.l;
import ck.i;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: DivTreeVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivTreeVisitor<T> {
    private final l<T, Boolean> returnCondition;

    /* JADX WARN: Multi-variable type inference failed */
    public DivTreeVisitor(l<? super T, Boolean> lVar) {
        this.returnCondition = lVar;
    }

    public abstract T defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath);

    public final T visit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
        BindingContext childContext = DivTreeVisitorKt.getChildContext(bindingContext, div, divStatePath);
        if (div instanceof Div.q) {
            return visit((Div.q) div, childContext, divStatePath);
        }
        if (div instanceof Div.g) {
            return visit((Div.g) div, childContext, divStatePath);
        }
        if (div instanceof Div.e) {
            return visit((Div.e) div, childContext, divStatePath);
        }
        if (div instanceof Div.l) {
            return visit((Div.l) div, childContext, divStatePath);
        }
        if (div instanceof Div.b) {
            return visit((Div.b) div, childContext, divStatePath);
        }
        if (div instanceof Div.f) {
            return visit((Div.f) div, childContext, divStatePath);
        }
        if (div instanceof Div.d) {
            return visit((Div.d) div, childContext, divStatePath);
        }
        if (div instanceof Div.j) {
            return visit((Div.j) div, childContext, divStatePath);
        }
        if (div instanceof Div.p) {
            return visit((Div.p) div, childContext, divStatePath);
        }
        if (div instanceof Div.n) {
            return visit((Div.n) div, childContext, divStatePath);
        }
        if (div instanceof Div.c) {
            return visit((Div.c) div, childContext, divStatePath);
        }
        if (div instanceof Div.h) {
            return visit((Div.h) div, childContext, divStatePath);
        }
        if (div instanceof Div.m) {
            return visit((Div.m) div, childContext, divStatePath);
        }
        if (div instanceof Div.i) {
            return visit((Div.i) div, childContext, divStatePath);
        }
        if (div instanceof Div.k) {
            return visit((Div.k) div, childContext, divStatePath);
        }
        if (div instanceof Div.r) {
            return visit((Div.r) div, childContext, divStatePath);
        }
        if (div instanceof Div.o) {
            return visit((Div.o) div, childContext, divStatePath);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ DivTreeVisitor(l lVar, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object defaultVisitCollection$default(DivTreeVisitor divTreeVisitor, Div div, BindingContext bindingContext, DivStatePath divStatePath, List list, DivCollectionItemBuilder divCollectionItemBuilder, List list2, int i10, Object obj) {
        if (obj == null) {
            return divTreeVisitor.defaultVisitCollection(div, bindingContext, divStatePath, list, (i10 & 16) != 0 ? null : divCollectionItemBuilder, (i10 & 32) != 0 ? null : list2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultVisitCollection");
    }

    public T defaultVisitCollection(Div div, BindingContext bindingContext, DivStatePath divStatePath, List<? extends Div> list, DivCollectionItemBuilder divCollectionItemBuilder, List<DivStatePath> list2) {
        boolean z10;
        List<String> ids;
        DivStatePath divStatePathAppendDiv;
        boolean z11;
        T tDefaultVisit = defaultVisit(div, bindingContext, divStatePath);
        l<T, Boolean> lVar = this.returnCondition;
        if (lVar != null && lVar.invoke(tDefaultVisit).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return tDefaultVisit;
        }
        if (divCollectionItemBuilder != null) {
            return visit(divCollectionItemBuilder, bindingContext, divStatePath, tDefaultVisit);
        }
        if (list != null && (ids = DivPathUtils.INSTANCE.getIds(list)) != null) {
            int i10 = 0;
            for (T t10 : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                Div div2 = (Div) t10;
                if (list2 == null || (divStatePathAppendDiv = list2.get(i10)) == null) {
                    divStatePathAppendDiv = divStatePath.appendDiv(ids.get(i10));
                }
                T tVisitCollectionChild = visitCollectionChild(div2, bindingContext, divStatePathAppendDiv, tDefaultVisit);
                l<T, Boolean> lVar2 = this.returnCondition;
                if (lVar2 != null && lVar2.invoke(tVisitCollectionChild).booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    return tVisitCollectionChild;
                }
                i10 = i11;
            }
        }
        return tDefaultVisit;
    }

    public T visitCollectionChild(Div div, BindingContext bindingContext, DivStatePath divStatePath, T t10) {
        return visit(div, bindingContext, divStatePath);
    }

    private final T visit(DivCollectionItemBuilder divCollectionItemBuilder, BindingContext bindingContext, DivStatePath divStatePath, T t10) {
        ExpressionResolver expressionResolver;
        List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(divCollectionItemBuilder, bindingContext.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(listBuild);
        int i10 = 0;
        for (T t11 : listBuild) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) t11;
            DivStatePath divStatePathAppendDiv = divStatePath.appendDiv(itemIds.get(i10));
            ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = bindingContext.getDivView().getRuntimeStore$div_release().resolveRuntimeWith(bindingContext.getDivView(), divStatePathAppendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), bindingContext.getExpressionResolver());
            if (expressionsRuntimeResolveRuntimeWith == null || (expressionResolver = expressionsRuntimeResolveRuntimeWith.getExpressionResolver()) == null) {
                expressionResolver = divItemBuilderResult.getExpressionResolver();
            }
            T tVisitCollectionChild = visitCollectionChild(divItemBuilderResult.getDiv(), new BindingContext(bindingContext.getDivView(), expressionResolver), divStatePathAppendDiv, t10);
            l<T, Boolean> lVar = this.returnCondition;
            if (lVar != null && lVar.invoke(tVisitCollectionChild).booleanValue()) {
                return tVisitCollectionChild;
            }
            i10 = i11;
        }
        return t10;
    }

    public T visit(Div.b bVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, bVar, bindingContext, divStatePath, bVar.c().B, bVar.c().f46736z, null, 32, null);
    }

    public T visit(Div.f fVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, fVar, bindingContext, divStatePath, fVar.c().f47480y, null, null, 48, null);
    }

    public T visit(Div.d dVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, dVar, bindingContext, divStatePath, dVar.c().f47281u, dVar.c().f47279s, null, 32, null);
    }

    public T visit(Div.j jVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, jVar, bindingContext, divStatePath, jVar.c().f48260t, jVar.c().f48258r, null, 32, null);
    }

    public T visit(Div.p pVar, BindingContext bindingContext, DivStatePath divStatePath) {
        List<DivTabs.Item> list = pVar.c().f49264q;
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DivTabs.Item) it.next()).f49276a);
        }
        return (T) defaultVisitCollection$default(this, pVar, bindingContext, divStatePath, arrayList, null, null, 48, null);
    }

    public T visit(Div.n nVar, BindingContext bindingContext, DivStatePath divStatePath) {
        String id$div_release$default = DivPathUtils.getId$div_release$default(DivPathUtils.INSTANCE, nVar.c(), null, 1, null);
        List<DivState.State> list = nVar.c().I;
        ArrayList arrayList = new ArrayList();
        for (DivState.State state : list) {
            DivStatePath divStatePathAppend$div_release = state.f49049c == null ? null : divStatePath.append$div_release(id$div_release$default, state, state.f49050d);
            if (divStatePathAppend$div_release != null) {
                arrayList.add(divStatePathAppend$div_release);
            }
        }
        List<DivState.State> list2 = nVar.c().I;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Div div = ((DivState.State) it.next()).f49049c;
            if (div != null) {
                arrayList2.add(div);
            }
        }
        return defaultVisitCollection(nVar, bindingContext, divStatePath, arrayList2, null, arrayList);
    }

    public T visit(Div.c cVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return (T) defaultVisitCollection$default(this, cVar, bindingContext, divStatePath, cVar.c().f46881q, null, null, 48, null);
    }

    public T visit(Div.q qVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(qVar, bindingContext, divStatePath);
    }

    public T visit(Div.g gVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(gVar, bindingContext, divStatePath);
    }

    public T visit(Div.e eVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(eVar, bindingContext, divStatePath);
    }

    public T visit(Div.l lVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(lVar, bindingContext, divStatePath);
    }

    public T visit(Div.h hVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(hVar, bindingContext, divStatePath);
    }

    public T visit(Div.m mVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(mVar, bindingContext, divStatePath);
    }

    public T visit(Div.i iVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(iVar, bindingContext, divStatePath);
    }

    public T visit(Div.k kVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(kVar, bindingContext, divStatePath);
    }

    public T visit(Div.r rVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(rVar, bindingContext, divStatePath);
    }

    public T visit(Div.o oVar, BindingContext bindingContext, DivStatePath divStatePath) {
        return defaultVisit(oVar, bindingContext, divStatePath);
    }
}
