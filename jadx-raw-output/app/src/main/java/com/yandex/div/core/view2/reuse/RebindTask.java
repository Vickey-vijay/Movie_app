package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import ck.i;
import ck.p;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.util.RebindTokenUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nj.b0;

/* JADX INFO: compiled from: RebindTask.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class RebindTask {
    public static final Companion Companion = new Companion(null);
    private final Div2View div2View;
    private final DivBinder divBinder;
    private final ExpressionResolver newResolver;
    private final ExpressionResolver oldResolver;
    private boolean rebindInProgress;
    private final ComplexRebindReporter reporter;
    private final Set<ExistingToken> bindingPoints = new LinkedHashSet();
    private final List<ExistingToken> idsToBind = new ArrayList();
    private final List<ExistingToken> aloneExisting = new ArrayList();
    private final List<NewToken> aloneNew = new ArrayList();
    private final Map<String, ExistingToken> aloneIds = new LinkedHashMap();
    private final ReusableTokenList reusableList = new ReusableTokenList();

    /* JADX INFO: compiled from: RebindTask.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: RebindTask.kt */
    public static final class UnsupportedElementException extends IllegalArgumentException {
        private final String message;

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public UnsupportedElementException(Class<?> cls) {
            this.message = cls + " is unsupported by complex rebind";
        }
    }

    public final void clear() {
        this.rebindInProgress = false;
        this.reusableList.clear();
        this.bindingPoints.clear();
        this.aloneExisting.clear();
        this.aloneNew.clear();
    }

    private final boolean calculateDiff(DivData divData, DivData divData2, ViewGroup viewGroup) {
        Div div;
        Div div2;
        DivData.State stateStateToBind = this.div2View.stateToBind(divData);
        if (stateStateToBind == null || (div = stateStateToBind.f46946a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        ExistingToken existingToken = new ExistingToken(DivCollectionExtensionsKt.toItemBuilderResult(div, this.oldResolver), 0, viewGroup, null);
        DivData.State stateStateToBind2 = this.div2View.stateToBind(divData2);
        if (stateStateToBind2 == null || (div2 = stateStateToBind2.f46946a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        NewToken newToken = new NewToken(DivCollectionExtensionsKt.toItemBuilderResult(div2, this.newResolver), 0, null);
        if (existingToken.isCombinable(newToken)) {
            doNodeInSameMode(existingToken, newToken);
        } else {
            doNodeInExistingMode(existingToken);
            doNodeInNewMode(newToken);
        }
        Iterator<T> it = this.aloneNew.iterator();
        while (it.hasNext()) {
            ExistingToken lastExistingParent = ((NewToken) it.next()).getLastExistingParent();
            if (lastExistingParent == null) {
                this.reporter.onComplexRebindNoExistingParent();
                return false;
            }
            this.reusableList.remove(lastExistingParent);
            this.bindingPoints.add(lastExistingParent);
        }
        return true;
    }

    private final void doNodeInNewMode(NewToken newToken) {
        Object next;
        Iterator<T> it = this.aloneExisting.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ExistingToken) next).isCombinable(newToken));
        ExistingToken existingToken = (ExistingToken) next;
        if (existingToken != null) {
            this.aloneExisting.remove(existingToken);
            doNodeInSameMode(existingToken, newToken);
            return;
        }
        String id2 = newToken.getDiv().b().getId();
        ExistingToken existingToken2 = id2 != null ? this.aloneIds.get(id2) : null;
        if (id2 == null || existingToken2 == null || !p.e(existingToken2.getDiv().getClass(), newToken.getDiv().getClass()) || !DivComparator.areValuesReplaceable$default(DivComparator.INSTANCE, existingToken2.getDiv().b(), newToken.getDiv().b(), this.oldResolver, this.newResolver, null, 16, null)) {
            this.aloneNew.add(newToken);
        } else {
            this.aloneIds.remove(id2);
            this.idsToBind.add(RebindTokenUtilsKt.combineTokens(existingToken2, newToken));
        }
        Iterator<T> it2 = newToken.getChildrenTokens().iterator();
        while (it2.hasNext()) {
            doNodeInNewMode((NewToken) it2.next());
        }
    }

    @MainThread
    private final boolean rebind(DivStatePath divStatePath) {
        if (this.bindingPoints.isEmpty() && this.reusableList.isEmpty()) {
            this.reporter.onComplexRebindNothingToBind();
            return false;
        }
        for (ExistingToken existingToken : this.aloneExisting) {
            releaseIfNecessary(existingToken.getDiv(), existingToken.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken.getView());
        }
        for (ExistingToken existingToken2 : this.aloneIds.values()) {
            releaseIfNecessary(existingToken2.getDiv(), existingToken2.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken2.getView());
        }
        for (ExistingToken existingToken3 : this.bindingPoints) {
            if (!b0.U(this.bindingPoints, existingToken3.getParentToken())) {
                BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(existingToken3.getView());
                if (bindingContext == null) {
                    bindingContext = this.div2View.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext, existingToken3.getView(), existingToken3.getItem().getDiv(), divStatePath);
            }
        }
        for (ExistingToken existingToken4 : this.idsToBind) {
            if (!b0.U(this.bindingPoints, existingToken4.getParentToken())) {
                BindingContext bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(existingToken4.getView());
                if (bindingContext2 == null) {
                    bindingContext2 = this.div2View.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext2, existingToken4.getView(), existingToken4.getItem().getDiv(), divStatePath);
            }
        }
        clear();
        this.reporter.onComplexRebindSuccess();
        return true;
    }

    private final void releaseIfNecessary(Div div, View view) {
        if (div instanceof Div.c ? true : div instanceof Div.r) {
            this.div2View.getReleaseViewVisitor$div_release().visit(view);
        }
    }

    public final boolean getRebindInProgress() {
        return this.rebindInProgress;
    }

    public final ReusableTokenList getReusableList() {
        return this.reusableList;
    }

    public RebindTask(Div2View div2View, DivBinder divBinder, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2, ComplexRebindReporter complexRebindReporter) {
        this.div2View = div2View;
        this.divBinder = divBinder;
        this.oldResolver = expressionResolver;
        this.newResolver = expressionResolver2;
        this.reporter = complexRebindReporter;
    }

    private final void doNodeInExistingMode(ExistingToken existingToken) {
        String id2 = existingToken.getDiv().b().getId();
        if (id2 != null) {
            this.aloneIds.put(id2, existingToken);
        } else {
            this.aloneExisting.add(existingToken);
        }
        Iterator it = ExistingToken.getChildrenTokens$default(existingToken, null, 1, null).iterator();
        while (it.hasNext()) {
            doNodeInExistingMode((ExistingToken) it.next());
        }
    }

    private final void doNodeInSameMode(ExistingToken existingToken, NewToken newToken) {
        Object next;
        ExistingToken existingTokenCombineTokens = RebindTokenUtilsKt.combineTokens(existingToken, newToken);
        newToken.setLastExistingParent(existingTokenCombineTokens);
        List listR0 = b0.R0(newToken.getChildrenTokens());
        ArrayList arrayList = new ArrayList();
        for (ExistingToken existingToken2 : existingToken.getChildrenTokens(existingTokenCombineTokens)) {
            Iterator it = listR0.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                } else {
                    next = null;
                    break;
                }
            } while (!((NewToken) next).isCombinable(existingToken2));
            NewToken newToken2 = (NewToken) next;
            if (newToken2 != null) {
                doNodeInSameMode(existingToken2, newToken2);
                listR0.remove(newToken2);
            } else {
                arrayList.add(existingToken2);
            }
        }
        if (listR0.size() != arrayList.size()) {
            this.bindingPoints.add(existingTokenCombineTokens);
        } else {
            this.reusableList.add(existingTokenCombineTokens);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            doNodeInExistingMode((ExistingToken) it2.next());
        }
        Iterator it3 = listR0.iterator();
        while (it3.hasNext()) {
            doNodeInNewMode((NewToken) it3.next());
        }
    }

    public final boolean prepareAndRebind(DivData divData, DivData divData2, ViewGroup viewGroup, DivStatePath divStatePath) {
        boolean zCalculateDiff;
        clear();
        this.rebindInProgress = true;
        try {
            zCalculateDiff = calculateDiff(divData, divData2, viewGroup);
        } catch (UnsupportedElementException e10) {
            this.reporter.onComplexRebindUnsupportedElementException(e10);
            zCalculateDiff = false;
        }
        if (!zCalculateDiff) {
            return false;
        }
        return rebind(divStatePath);
    }
}
