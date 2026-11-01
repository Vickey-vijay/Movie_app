package com.ironsource;

import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: loaded from: classes5.dex */
public final class W5 implements I7 {
    @Override // com.ironsource.I7
    public boolean a() {
        try {
            ProcessLifecycleOwner.Companion.get();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
