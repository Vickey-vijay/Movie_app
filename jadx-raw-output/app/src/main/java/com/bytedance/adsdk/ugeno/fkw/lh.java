package com.bytedance.adsdk.ugeno.fkw;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public float f10866cf;
    public int fkw;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public int f10868ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f10869le;
    public int mwh;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f10871ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public int f10872rn;
    public int ryl;
    public float tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public boolean f10873vm;
    public boolean zih;
    public int ouw = Integer.MAX_VALUE;
    public int vt = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f10870lh = Integer.MIN_VALUE;
    public int yu = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public List<Integer> f10867jg = new ArrayList();

    public final int ouw() {
        return this.pno - this.bly;
    }

    public final void ouw(View view, int i10, int i11, int i12, int i13) {
        vt vtVar = (vt) view.getLayoutParams();
        this.ouw = Math.min(this.ouw, (view.getLeft() - vtVar.mwh()) - i10);
        this.vt = Math.min(this.vt, (view.getTop() - vtVar.jg()) - i11);
        this.f10870lh = Math.max(this.f10870lh, view.getRight() + vtVar.ko() + i12);
        this.yu = Math.max(this.yu, view.getBottom() + vtVar.rn() + i13);
    }
}
