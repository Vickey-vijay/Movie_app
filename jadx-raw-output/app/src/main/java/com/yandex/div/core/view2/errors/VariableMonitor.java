package com.yandex.div.core.view2.errors;

import bk.l;
import ck.p;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import mj.h;
import mj.r;
import nj.b0;
import nj.t;

/* JADX INFO: compiled from: VariableMonitor.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class VariableMonitor {
    private final l<Throwable, r> errorHandler;
    private l<? super List<? extends Pair<String, ? extends Variable>>, r> variablesUpdatedCallback;
    private final Map<Pair<String, String>, Variable> variables = new LinkedHashMap();
    private Map<String, ? extends VariableController> controllerMap = kotlin.collections.a.j();

    private final l<Variable, r> createCallback(final String str) {
        return new l<Variable, r>() { // from class: com.yandex.div.core.view2.errors.VariableMonitor.createCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Variable variable) {
                invoke2(variable);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Variable variable) {
                VariableMonitor.this.saveVariable(variable, str);
                VariableMonitor.this.notifyOnChange();
            }
        };
    }

    private final void onControllersChange(Set<? extends VariableController> set) {
        Map<String, ? extends VariableController> map = this.controllerMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends VariableController> entry : map.entrySet()) {
            if (!set.contains(entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            VariableController variableController = (VariableController) entry2.getValue();
            VariableController.subscribeToVariablesChange$default(variableController, getAllNames(variableController), false, createCallback(str), 2, null);
        }
        this.variables.clear();
        for (Map.Entry<String, ? extends VariableController> entry3 : this.controllerMap.entrySet()) {
            String key = entry3.getKey();
            Iterator<T> it = entry3.getValue().captureAll().iterator();
            while (it.hasNext()) {
                saveVariable((Variable) it.next(), key);
            }
        }
        notifyOnChange();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVariable(Variable variable, String str) {
        this.variables.put(h.a(str, variable.getName()), variable);
    }

    private final List<Pair<String, Variable>> variablesList() {
        Map<Pair<String, String>, Variable> map = this.variables;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Pair<String, String>, Variable>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(entriesToVariables(it.next()));
        }
        return b0.H0(arrayList, new Comparator() { // from class: com.yandex.div.core.view2.errors.VariableMonitor$variablesList$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                Pair pair = (Pair) t10;
                Pair pair2 = (Pair) t11;
                return qj.b.d(((String) pair.component1()) + ((Variable) pair.component2()).getName(), ((String) pair2.component1()) + ((Variable) pair2.component2()).getName());
            }
        });
    }

    public final void mutateVariable(String str, String str2, String str3) {
        Variable variable = this.variables.get(h.a(str2, str));
        if (p.e(String.valueOf(variable != null ? variable.getValue() : null), str3) || variable == null) {
            return;
        }
        try {
            variable.set(str3);
        } catch (Exception unused) {
            this.errorHandler.invoke(new VariableMutationException("Unable to set '" + str3 + "' value to variable '" + str + "'.", null, 2, null));
        }
    }

    public final void setControllerMap(Map<String, ? extends VariableController> map) {
        if (hasAllPairs(this.controllerMap, map)) {
            return;
        }
        Set<? extends VariableController> setT0 = b0.T0(this.controllerMap.values());
        this.controllerMap = map;
        onControllersChange(setT0);
    }

    public final void setVariablesUpdatedCallback(l<? super List<? extends Pair<String, ? extends Variable>>, r> lVar) {
        this.variablesUpdatedCallback = lVar;
        notifyOnChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VariableMonitor(l<? super Throwable, r> lVar) {
        this.errorHandler = lVar;
    }

    private final Pair<String, Variable> entriesToVariables(Map.Entry<Pair<String, String>, ? extends Variable> entry) {
        Pair<String, String> key = entry.getKey();
        return h.a(key.getFirst(), entry.getValue());
    }

    private final List<String> getAllNames(VariableController variableController) {
        List<Variable> listCaptureAll = variableController.captureAll();
        ArrayList arrayList = new ArrayList(t.v(listCaptureAll, 10));
        Iterator<T> it = listCaptureAll.iterator();
        while (it.hasNext()) {
            arrayList.add(((Variable) it.next()).getName());
        }
        return arrayList;
    }

    private final <K, V> boolean hasAllPairs(Map<K, ? extends V> map, Map<K, ? extends V> map2) {
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<K, ? extends V> entry : map2.entrySet()) {
            K key = entry.getKey();
            if (!p.e(map.get(key), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyOnChange() {
        List<Pair<String, Variable>> listVariablesList = variablesList();
        l<? super List<? extends Pair<String, ? extends Variable>>, r> lVar = this.variablesUpdatedCallback;
        if (lVar != null) {
            lVar.invoke(listVariablesList);
        }
    }
}
