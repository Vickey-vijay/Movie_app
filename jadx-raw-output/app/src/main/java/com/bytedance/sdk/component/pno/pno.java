package com.bytedance.sdk.component.pno;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pno implements Comparable<pno>, Runnable {
    private int ouw;
    private String vt;

    public pno(String str, int i10) {
        this.ouw = 0;
        this.ouw = i10 == 0 ? 5 : i10;
        this.vt = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(pno pnoVar) {
        if (getPriority() < pnoVar.getPriority()) {
            return 1;
        }
        return getPriority() >= pnoVar.getPriority() ? -1 : 0;
    }

    public String getName() {
        return this.vt;
    }

    public int getPriority() {
        return this.ouw;
    }

    public void setPriority(int i10) {
        this.ouw = i10;
    }

    public pno(String str) {
        this.ouw = 5;
        this.vt = str;
    }
}
