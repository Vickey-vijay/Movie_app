package com.yandex.div.core.expression;

import com.yandex.div.DivDataTag;
import com.yandex.div.core.expression.local.ExpressionsRuntimeProvider;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.expression.triggers.TriggersController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.expression.variables.VariableControllerKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import com.yandex.div2.DivData;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import lk.q;
import nj.s;

/* JADX INFO: compiled from: RuntimeStoreProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
public class RuntimeStoreProvider {
    private final ErrorCollectors errorCollectors;
    private final ExpressionsRuntimeProvider runtimeProvider;
    private final Map<String, RuntimeStore> runtimeStores = Collections.synchronizedMap(new LinkedHashMap());
    private final WeakHashMap<Div2View, Set<String>> divDataTags = new WeakHashMap<>();

    public void cleanupRuntime$div_release(Div2View div2View) {
        Set<String> set = this.divDataTags.get(div2View);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                RuntimeStore runtimeStore = this.runtimeStores.get((String) it.next());
                if (runtimeStore != null) {
                    runtimeStore.cleanupRuntimes(div2View);
                }
            }
        }
        this.divDataTags.remove(div2View);
    }

    public RuntimeStore getOrCreate$div_release(DivDataTag divDataTag, DivData divData, Div2View div2View) {
        WeakHashMap<Div2View, Set<String>> weakHashMap = this.divDataTags;
        Set<String> linkedHashSet = weakHashMap.get(div2View);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            weakHashMap.put(div2View, linkedHashSet);
        }
        linkedHashSet.add(divDataTag.getId());
        RuntimeStore runtimeStore = this.runtimeStores.get(divDataTag.getId());
        if (runtimeStore == null) {
            RuntimeStoreImpl runtimeStoreImpl = new RuntimeStoreImpl(divData, this.runtimeProvider, this.errorCollectors.getOrCreate(divDataTag, divData));
            this.runtimeStores.put(divDataTag.getId(), runtimeStoreImpl);
            return runtimeStoreImpl;
        }
        ensureVariablesSynced(runtimeStore.getRootRuntime().getExpressionResolver(), divData, this.errorCollectors.getOrCreate(divDataTag, divData));
        TriggersController triggersController = runtimeStore.getRootRuntime().getTriggersController();
        if (triggersController != null) {
            List<DivTrigger> listK = divData.f46940f;
            if (listK == null) {
                listK = s.k();
            }
            triggersController.ensureTriggersSynced(listK);
        }
        return runtimeStore;
    }

    public RuntimeStoreProvider(ExpressionsRuntimeProvider expressionsRuntimeProvider, ErrorCollectors errorCollectors) {
        this.runtimeProvider = expressionsRuntimeProvider;
        this.errorCollectors = errorCollectors;
    }

    private void ensureVariablesSynced(ExpressionResolverImpl expressionResolverImpl, DivData divData, ErrorCollector errorCollector) {
        boolean z10;
        VariableController variableController = expressionResolverImpl.getVariableController();
        List<DivVariable> list = divData.f46941g;
        if (list != null) {
            for (DivVariable divVariable : list) {
                Variable mutableVariable = variableController.getMutableVariable(RuntimeStoreProviderKt.getName(divVariable));
                if (mutableVariable == null) {
                    VariableControllerKt.declare(variableController, divVariable, expressionResolverImpl, errorCollector);
                } else {
                    if (divVariable instanceof DivVariable.b) {
                        z10 = mutableVariable instanceof Variable.BooleanVariable;
                    } else if (divVariable instanceof DivVariable.f) {
                        z10 = mutableVariable instanceof Variable.IntegerVariable;
                    } else if (divVariable instanceof DivVariable.g) {
                        z10 = mutableVariable instanceof Variable.DoubleVariable;
                    } else if (divVariable instanceof DivVariable.i) {
                        z10 = mutableVariable instanceof Variable.StringVariable;
                    } else if (divVariable instanceof DivVariable.c) {
                        z10 = mutableVariable instanceof Variable.ColorVariable;
                    } else if (divVariable instanceof DivVariable.j) {
                        z10 = mutableVariable instanceof Variable.UrlVariable;
                    } else if (divVariable instanceof DivVariable.e) {
                        z10 = mutableVariable instanceof Variable.DictVariable;
                    } else if (divVariable instanceof DivVariable.a) {
                        z10 = mutableVariable instanceof Variable.ArrayVariable;
                    } else if (divVariable instanceof DivVariable.h) {
                        z10 = false;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!z10) {
                        errorCollector.logError(new IllegalArgumentException(q.j("\n                           Variable inconsistency detected!\n                           at DivData: " + RuntimeStoreProviderKt.getName(divVariable) + " (" + divVariable + ")\n                           at VariableController: " + variableController.getMutableVariable(RuntimeStoreProviderKt.getName(divVariable)) + "\n                        ")));
                    }
                }
            }
        }
    }
}
