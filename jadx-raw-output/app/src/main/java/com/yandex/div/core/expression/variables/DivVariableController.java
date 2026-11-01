package com.yandex.div.core.expression.variables;

import android.os.Handler;
import android.os.Looper;
import bk.l;
import ck.i;
import com.yandex.div.data.Variable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import mj.r;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: DivVariableController.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivVariableController {
    private final ConcurrentLinkedQueue<DeclarationObserver> declarationObservers;
    private final Set<String> declaredVariableNames;
    private final ConcurrentLinkedQueue<l<String, r>> externalVariableRequestObservers;
    private final DivVariableController internalVariableController;
    private final Handler mainHandler;
    private final Set<String> pendingDeclaration;
    private final l<String, r> requestsObserver;
    private final Map<String, String> undeclaredVariables;
    private final MultiVariableSource variableSource;
    private final ConcurrentHashMap<String, Variable> variables;

    /* JADX WARN: Multi-variable type inference failed */
    public DivVariableController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DivVariableController(DivVariableController divVariableController) {
        this.internalVariableController = divVariableController;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.variables = new ConcurrentHashMap<>();
        this.declarationObservers = new ConcurrentLinkedQueue<>();
        this.undeclaredVariables = new LinkedHashMap();
        this.declaredVariableNames = new LinkedHashSet();
        this.pendingDeclaration = new LinkedHashSet();
        this.externalVariableRequestObservers = new ConcurrentLinkedQueue<>();
        l<String, r> lVar = new l<String, r>() { // from class: com.yandex.div.core.expression.variables.DivVariableController$requestsObserver$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(String str) {
                invoke2(str);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                Iterator it = this.this$0.externalVariableRequestObservers.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).invoke(str);
                }
            }
        };
        this.requestsObserver = lVar;
        this.variableSource = new MultiVariableSource(this, lVar);
    }

    private final boolean isDeclaredLocal(String str) {
        boolean zContains;
        synchronized (this.declaredVariableNames) {
            zContains = this.declaredVariableNames.contains(str);
        }
        return zContains;
    }

    public final void addDeclarationObserver$div_release(DeclarationObserver declarationObserver) {
        this.declarationObservers.add(declarationObserver);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addDeclarationObserver$div_release(declarationObserver);
        }
    }

    public final void addVariableObserver$div_release(l<? super Variable, r> lVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).addObserver(lVar);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addVariableObserver$div_release(lVar);
        }
    }

    public final List<Variable> captureAllVariables() {
        List<Variable> listK;
        Collection<Variable> collectionValues = this.variables.values();
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController == null || (listK = divVariableController.captureAllVariables()) == null) {
            listK = s.k();
        }
        return b0.y0(collectionValues, listK);
    }

    public final MultiVariableSource getVariableSource$div_release() {
        return this.variableSource;
    }

    public final void receiveVariablesUpdates$div_release(l<? super Variable, r> lVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            lVar.invoke((Variable) it.next());
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.receiveVariablesUpdates$div_release(lVar);
        }
    }

    public final void removeDeclarationObserver$div_release(DeclarationObserver declarationObserver) {
        this.declarationObservers.remove(declarationObserver);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeDeclarationObserver$div_release(declarationObserver);
        }
    }

    public final void removeVariablesObserver$div_release(l<? super Variable, r> lVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).removeObserver(lVar);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeVariablesObserver$div_release(lVar);
        }
    }

    public final Variable get(String str) {
        if (isDeclaredLocal(str)) {
            return this.variables.get(str);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            return divVariableController.get(str);
        }
        return null;
    }

    public /* synthetic */ DivVariableController(DivVariableController divVariableController, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : divVariableController);
    }
}
