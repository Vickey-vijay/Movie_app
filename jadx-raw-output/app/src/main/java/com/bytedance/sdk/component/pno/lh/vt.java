package com.bytedance.sdk.component.pno.lh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vt implements Comparable<vt>, Runnable {
    public long fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public long f11894le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f11895lh;
    private Runnable ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public long f11896ra;
    public String yu;

    public vt(String str) {
        this.f11895lh = 5;
        this.yu = str;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(vt vtVar) {
        int i10 = this.f11895lh;
        int i11 = vtVar.f11895lh;
        if (i10 < i11) {
            return 1;
        }
        return i10 >= i11 ? -1 : 0;
    }

    public final Runnable ouw() {
        return this.ouw;
    }

    public vt(int i10, String str) {
        this.f11895lh = i10;
        this.yu = str;
    }

    public vt(String str, Runnable runnable) {
        this.f11895lh = 5;
        this.yu = str;
        this.ouw = runnable;
    }
}
