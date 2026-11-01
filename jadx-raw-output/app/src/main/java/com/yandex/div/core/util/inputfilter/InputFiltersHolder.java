package com.yandex.div.core.util.inputfilter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: InputFiltersHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class InputFiltersHolder implements BaseInputFilter {
    private String currentValue = "";
    private int cursorPosition;
    private final List<BaseInputFilter> filters;

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(String str) {
        List<BaseInputFilter> list = this.filters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((BaseInputFilter) it.next()).checkValue(str)) {
                return false;
            }
        }
        return true;
    }

    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    public final void setCurrentValue(String str) {
        this.currentValue = str;
    }

    public final void setCursorPosition(int i10) {
        this.cursorPosition = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputFiltersHolder(List<? extends BaseInputFilter> list) {
        this.filters = list;
    }
}
