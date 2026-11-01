package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class F8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f55228a;

    static {
        int[] iArr = new int[ModuleEvent.Category.values().length];
        iArr[ModuleEvent.Category.GENERAL.ordinal()] = 1;
        iArr[ModuleEvent.Category.SYSTEM.ordinal()] = 2;
        f55228a = iArr;
    }
}
