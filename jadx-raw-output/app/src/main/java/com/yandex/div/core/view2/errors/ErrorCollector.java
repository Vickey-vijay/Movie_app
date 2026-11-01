package com.yandex.div.core.view2.errors;

import bk.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mj.r;
import nj.s;

/* JADX INFO: compiled from: ErrorCollector.kt */
/* JADX INFO: loaded from: classes11.dex */
public class ErrorCollector {
    private final Set<p<List<? extends Throwable>, List<? extends Throwable>, r>> observers = new LinkedHashSet();
    private final List<Throwable> runtimeErrors = new ArrayList();
    private List<? extends Throwable> parsingErrors = s.k();
    private List<Throwable> warnings = new ArrayList();
    private List<Throwable> errors = new ArrayList();
    private boolean errorsAreValid = true;

    private void notifyObservers() {
        this.errorsAreValid = false;
        if (this.observers.isEmpty()) {
            return;
        }
        rebuildErrors();
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((p) it.next()).mo1invoke(this.errors, this.warnings);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$1(ErrorCollector errorCollector, p pVar) {
        errorCollector.observers.remove(pVar);
    }

    private void rebuildErrors() {
        if (this.errorsAreValid) {
            return;
        }
        this.errors.clear();
        this.errors.addAll(this.parsingErrors);
        this.errors.addAll(this.runtimeErrors);
        this.errorsAreValid = true;
    }

    public void attachParsingErrors(DivData divData) {
        List<Exception> listK;
        if (divData == null || (listK = divData.f46942h) == null) {
            listK = s.k();
        }
        this.parsingErrors = listK;
        notifyObservers();
    }

    public void cleanRuntimeWarningsAndErrors() {
        this.warnings.clear();
        this.runtimeErrors.clear();
        notifyObservers();
    }

    public Iterator<Throwable> getWarnings() {
        return this.warnings.listIterator();
    }

    public void logError(Throwable th2) {
        this.runtimeErrors.add(th2);
        notifyObservers();
    }

    public void logWarning(Throwable th2) {
        this.warnings.add(th2);
        notifyObservers();
    }

    public Disposable observeAndGet(final p<? super List<? extends Throwable>, ? super List<? extends Throwable>, r> pVar) {
        this.observers.add(pVar);
        rebuildErrors();
        pVar.mo1invoke(this.errors, this.warnings);
        return new Disposable() { // from class: ae.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorCollector.observeAndGet$lambda$1(this.f3534b, pVar);
            }
        };
    }
}
