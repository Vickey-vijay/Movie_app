package com.bytedance.adsdk.vt.ouw.ouw;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(19)
public final class ryl implements mwh, tlj {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final com.bytedance.adsdk.vt.lh.vt.bly f11278le;
    private final String yu;
    private final Path ouw = new Path();
    private final Path vt = new Path();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Path f11279lh = new Path();
    private final List<mwh> fkw = new ArrayList();

    @Override // com.bytedance.adsdk.vt.ouw.ouw.tlj
    public final void ouw(ListIterator<lh> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            lh lhVarPrevious = listIterator.previous();
            if (lhVarPrevious instanceof mwh) {
                this.fkw.add((mwh) lhVarPrevious);
                listIterator.remove();
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.ouw.ouw.ryl$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[com.bytedance.adsdk.vt.lh.vt.bly.ouw.values().length];
            ouw = iArr;
            try {
                iArr[com.bytedance.adsdk.vt.lh.vt.bly.ouw.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[com.bytedance.adsdk.vt.lh.vt.bly.ouw.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[com.bytedance.adsdk.vt.lh.vt.bly.ouw.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ouw[com.bytedance.adsdk.vt.lh.vt.bly.ouw.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[com.bytedance.adsdk.vt.lh.vt.bly.ouw.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.mwh
    public final Path yu() {
        this.f11279lh.reset();
        com.bytedance.adsdk.vt.lh.vt.bly blyVar = this.f11278le;
        if (blyVar.f11197lh) {
            return this.f11279lh;
        }
        int i10 = AnonymousClass1.ouw[blyVar.vt.ordinal()];
        if (i10 == 1) {
            for (int i11 = 0; i11 < this.fkw.size(); i11++) {
                this.f11279lh.addPath(this.fkw.get(i11).yu());
            }
        } else if (i10 == 2) {
            ouw(Path.Op.UNION);
        } else if (i10 == 3) {
            ouw(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            ouw(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            ouw(Path.Op.XOR);
        }
        return this.f11279lh;
    }

    public ryl(com.bytedance.adsdk.vt.lh.vt.bly blyVar) {
        this.yu = blyVar.ouw;
        this.f11278le = blyVar;
    }

    @Override // com.bytedance.adsdk.vt.ouw.ouw.lh
    public final void ouw(List<lh> list, List<lh> list2) {
        for (int i10 = 0; i10 < this.fkw.size(); i10++) {
            this.fkw.get(i10).ouw(list, list2);
        }
    }

    @TargetApi(19)
    private void ouw(Path.Op op) {
        this.vt.reset();
        this.ouw.reset();
        for (int size = this.fkw.size() - 1; size > 0; size--) {
            mwh mwhVar = this.fkw.get(size);
            if (mwhVar instanceof yu) {
                yu yuVar = (yu) mwhVar;
                List<mwh> listVt = yuVar.vt();
                for (int size2 = listVt.size() - 1; size2 >= 0; size2--) {
                    Path pathYu = listVt.get(size2).yu();
                    pathYu.transform(yuVar.lh());
                    this.vt.addPath(pathYu);
                }
            } else {
                this.vt.addPath(mwhVar.yu());
            }
        }
        mwh mwhVar2 = this.fkw.get(0);
        if (mwhVar2 instanceof yu) {
            yu yuVar2 = (yu) mwhVar2;
            List<mwh> listVt2 = yuVar2.vt();
            for (int i10 = 0; i10 < listVt2.size(); i10++) {
                Path pathYu2 = listVt2.get(i10).yu();
                pathYu2.transform(yuVar2.lh());
                this.ouw.addPath(pathYu2);
            }
        } else {
            this.ouw.set(mwhVar2.yu());
        }
        this.f11279lh.op(this.ouw, this.vt, op);
    }
}
