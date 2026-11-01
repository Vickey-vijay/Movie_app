package com.bytedance.sdk.component.le.ouw.fkw;

import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fkw implements Comparable<fkw>, Runnable {
    private String vt;
    public int pno = 5;
    private String ouw = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(fkw fkwVar) {
        int i10 = this.pno;
        int i11 = fkwVar.pno;
        if (i10 < i11) {
            return 1;
        }
        return i10 >= i11 ? -1 : 0;
    }

    public fkw(String str) {
        this.vt = str;
    }
}
