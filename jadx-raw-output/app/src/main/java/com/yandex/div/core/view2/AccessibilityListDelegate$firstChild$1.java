package com.yandex.div.core.view2;

import android.view.View;
import bk.l;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AccessibilityListDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class AccessibilityListDelegate$firstChild$1 extends FunctionReferenceImpl implements l<View, Integer> {
    public static final AccessibilityListDelegate$firstChild$1 INSTANCE = new AccessibilityListDelegate$firstChild$1();

    public AccessibilityListDelegate$firstChild$1() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // bk.l
    public final Integer invoke(View view) {
        return Integer.valueOf(view.getTop());
    }
}
