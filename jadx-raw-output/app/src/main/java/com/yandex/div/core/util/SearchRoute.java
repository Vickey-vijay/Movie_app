package com.yandex.div.core.util;

/* JADX INFO: compiled from: SearchUtil.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SearchRoute<T> {
    private int enterLeaveBalance;
    private final T item;
    private int movedDistance;

    public final int distance() {
        return this.movedDistance;
    }

    public final T getItem() {
        return this.item;
    }

    public final void onEnter() {
        this.enterLeaveBalance++;
        this.movedDistance++;
    }

    public final void onLeave() {
        int i10 = this.enterLeaveBalance;
        if (i10 <= 0) {
            this.movedDistance++;
        } else {
            this.enterLeaveBalance = i10 - 1;
            this.movedDistance--;
        }
    }

    public SearchRoute(T t10) {
        this.item = t10;
    }
}
