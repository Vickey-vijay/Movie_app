package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Kc {
    public abstract void a(int i10);

    public final synchronized void a(Context context) {
        int iB = b();
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        if (iB != libraryApiLevel) {
            if (iB < libraryApiLevel) {
                SparseArray sparseArrayC = c();
                while (true) {
                    iB++;
                    if (iB > libraryApiLevel) {
                        break;
                    }
                    Jc jc2 = (Jc) sparseArrayC.get(iB);
                    if (jc2 != null) {
                        jc2.a(context);
                    }
                }
            }
            a(libraryApiLevel);
        }
    }

    public abstract int b();

    public abstract SparseArray c();

    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }
}
