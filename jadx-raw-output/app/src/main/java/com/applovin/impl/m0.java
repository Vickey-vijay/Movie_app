package com.applovin.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 {
    public static int a(int i10, Context context) {
        if (o0.e()) {
            return context.getColor(i10);
        }
        return context.getResources().getColor(i10);
    }
}
