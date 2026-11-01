package com.yandex.div.core.expression.local;

import bk.l;
import ck.p;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.state.DivPathUtils;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.TabsStateCache;
import com.yandex.div.core.state.TemporaryDivStateCache;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.state.DivStateCache;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import java.util.List;
import mj.r;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: DivRuntimeVisitor.kt */
/* JADX INFO: loaded from: classes8.dex */
public class DivRuntimeVisitor {
    private final DivStateCache divStateCache;
    private final TabsStateCache tabsCache;
    private final TemporaryDivStateCache temporaryStateCache;

    private void visit(Div div, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        if (div instanceof Div.b) {
            Div.b bVar = (Div.b) div;
            visitContainer(div, div2View, bVar.c().B, bVar.c().f46736z, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.f) {
            visitContainer(div, div2View, ((Div.f) div).c().f47480y, null, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.d) {
            Div.d dVar = (Div.d) div;
            visitContainer(div, div2View, dVar.c().f47281u, dVar.c().f47279s, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.j) {
            Div.j jVar = (Div.j) div;
            visitContainer(div, div2View, jVar.c().f48260t, jVar.c().f48258r, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.n) {
            visitState((Div.n) div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.p) {
            visitTabs((Div.p) div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.c) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.e) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.g) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.h) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.i) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.k) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.l) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.m) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
            return;
        }
        if (div instanceof Div.q) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
        } else if (div instanceof Div.r) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
        } else if (div instanceof Div.o) {
            defaultVisit(div, div2View, divStatePath, expressionsRuntime);
        }
    }

    private void visitTabs(Div.p pVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        visitTabs(pVar.c(), div2View, divStatePath, defaultVisit(pVar, div2View, divStatePath, expressionsRuntime));
    }

    private String getActiveStateId(DivState divState, Div2View div2View, DivStatePath divStatePath, ExpressionResolverImpl expressionResolverImpl) {
        String strValueOf;
        String str = divStatePath.getStatesString$div_release() + '/' + divStatePath.getLastDivId$div_release();
        String id2 = div2View.getDivTag().getId();
        String state = this.temporaryStateCache.getState(id2, str);
        if (state != null) {
            return state;
        }
        String state2 = this.divStateCache.getState(id2, str);
        if (state2 != null) {
            return state2;
        }
        String str2 = divState.H;
        if (str2 != null) {
            Variable mutableVariable = expressionResolverImpl.getVariableController().getMutableVariable(str2);
            strValueOf = String.valueOf(mutableVariable != null ? mutableVariable.getValue() : null);
        } else {
            strValueOf = null;
        }
        if (strValueOf != null) {
            return strValueOf;
        }
        Expression<String> expression = divState.f49032n;
        String strEvaluate = expression != null ? expression.evaluate(expressionResolverImpl) : null;
        if (strEvaluate != null) {
            return strEvaluate;
        }
        DivState.State state3 = (DivState.State) b0.h0(divState.I);
        if (state3 != null) {
            return state3.f49050d;
        }
        return null;
    }

    private void visitChild(Div div, final Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime, boolean z10) {
        if (z10) {
            visit(div, div2View, divStatePath, expressionsRuntime);
        } else {
            div2View.getRuntimeStore$div_release().traverseFrom(div2View.getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, div, expressionsRuntime.getExpressionResolver()), divStatePath, new l<ExpressionsRuntime, r>() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor.visitChild.1
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(ExpressionsRuntime expressionsRuntime2) {
                    invoke2(expressionsRuntime2);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ExpressionsRuntime expressionsRuntime2) {
                    expressionsRuntime2.clearBinding(div2View);
                }
            });
        }
    }

    public DivRuntimeVisitor(DivStateCache divStateCache, TemporaryDivStateCache temporaryDivStateCache, TabsStateCache tabsStateCache) {
        this.divStateCache = divStateCache;
        this.temporaryStateCache = temporaryDivStateCache;
        this.tabsCache = tabsStateCache;
    }

    private ExpressionsRuntime defaultVisit(Div div, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        ExpressionsRuntime orCreateRuntime = div2View.getRuntimeStore$div_release().getOrCreateRuntime(divStatePath, div, expressionsRuntime.getExpressionResolver());
        orCreateRuntime.onAttachedToWindow(div2View);
        return orCreateRuntime;
    }

    private void visitContainer(Div div, Div2View div2View, List<? extends Div> list, DivCollectionItemBuilder divCollectionItemBuilder, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        List<String> ids;
        ExpressionsRuntime expressionsRuntimeDefaultVisit = defaultVisit(div, div2View, divStatePath, expressionsRuntime);
        if (divCollectionItemBuilder != null) {
            visit(divCollectionItemBuilder, div2View, divStatePath, expressionsRuntimeDefaultVisit);
            return;
        }
        if (list != null && (ids = DivPathUtils.INSTANCE.getIds(list)) != null) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                visit((Div) obj, div2View, divStatePath.appendDiv(ids.get(i10)), expressionsRuntimeDefaultVisit);
                i10 = i11;
            }
        }
    }

    private void visitState(Div.n nVar, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        visitStates(nVar.c(), div2View, divStatePath, defaultVisit(nVar, div2View, divStatePath, expressionsRuntime));
    }

    private void visitStates(DivState divState, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        String activeStateId = getActiveStateId(divState, div2View, divStatePath, expressionsRuntime.getExpressionResolver());
        for (DivState.State state : divState.I) {
            Div div = state.f49049c;
            if (div != null) {
                visitChild(div, div2View, divStatePath.append$div_release(divStatePath.getLastDivId$div_release(), state, state.f49050d), expressionsRuntime, p.e(state.f49050d, activeStateId));
            }
        }
    }

    private void visitTabs(DivTabs divTabs, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        int iIntValue;
        Integer selectedTab = this.tabsCache.getSelectedTab(div2View.getDataTag().getId(), divStatePath.getFullPath$div_release());
        if (selectedTab != null) {
            iIntValue = selectedTab.intValue();
        } else {
            long jLongValue = divTabs.f49272y.evaluate(expressionsRuntime.getExpressionResolver()).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                iIntValue = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                iIntValue = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        int i10 = iIntValue;
        List ids$default = DivPathUtils.getIds$default(DivPathUtils.INSTANCE, divTabs.f49264q, new l<DivTabs.Item, Div>() { // from class: com.yandex.div.core.expression.local.DivRuntimeVisitor$visitTabs$ids$1
            @Override // bk.l
            public final Div invoke(DivTabs.Item item) {
                return item.f49276a;
            }
        }, null, 2, null);
        int i11 = 0;
        for (Object obj : divTabs.f49264q) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                s.u();
            }
            visitChild(((DivTabs.Item) obj).f49276a, div2View, divStatePath.appendDiv((String) ids$default.get(i11)), expressionsRuntime, i10 == i11);
            i11 = i12;
        }
    }

    public void createAndAttachRuntimes(Div div, DivStatePath divStatePath, Div2View div2View) {
        ExpressionsRuntime rootRuntime = div2View.getRuntimeStore$div_release().getRootRuntime();
        rootRuntime.onAttachedToWindow(div2View);
        visit(div, div2View, divStatePath, rootRuntime);
    }

    public void createAndAttachRuntimesToState(Div2View div2View, DivState divState, DivStatePath divStatePath, ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = div2View.getRuntimeStore$div_release().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitStates(divState, div2View, divStatePath, runtimeWithOrNull);
    }

    public void createAndAttachRuntimesToTabs(Div2View div2View, DivTabs divTabs, DivStatePath divStatePath, ExpressionResolver expressionResolver) {
        ExpressionsRuntime runtimeWithOrNull = div2View.getRuntimeStore$div_release().getRuntimeWithOrNull(expressionResolver);
        if (runtimeWithOrNull == null) {
            return;
        }
        visitTabs(divTabs, div2View, divStatePath, runtimeWithOrNull);
    }

    private void visit(DivCollectionItemBuilder divCollectionItemBuilder, Div2View div2View, DivStatePath divStatePath, ExpressionsRuntime expressionsRuntime) {
        List<DivItemBuilderResult> listBuild = DivCollectionExtensionsKt.build(divCollectionItemBuilder, expressionsRuntime.getExpressionResolver());
        List<String> itemIds = DivPathUtils.INSTANCE.getItemIds(listBuild);
        int i10 = 0;
        for (Object obj : listBuild) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            DivItemBuilderResult divItemBuilderResult = (DivItemBuilderResult) obj;
            DivStatePath divStatePathAppendDiv = divStatePath.appendDiv(itemIds.get(i10));
            ExpressionsRuntime expressionsRuntimeResolveRuntimeWith = div2View.getRuntimeStore$div_release().resolveRuntimeWith(div2View, divStatePathAppendDiv, divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver(), expressionsRuntime.getExpressionResolver());
            Div div = divItemBuilderResult.getDiv();
            if (expressionsRuntimeResolveRuntimeWith == null) {
                expressionsRuntimeResolveRuntimeWith = expressionsRuntime;
            }
            visit(div, div2View, divStatePathAppendDiv, expressionsRuntimeResolveRuntimeWith);
            i10 = i11;
        }
    }
}
