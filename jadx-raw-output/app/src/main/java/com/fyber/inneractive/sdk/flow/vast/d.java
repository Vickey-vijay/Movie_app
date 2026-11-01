package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15720b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        com.fyber.inneractive.sdk.model.vast.c cVar = (com.fyber.inneractive.sdk.model.vast.c) obj;
        com.fyber.inneractive.sdk.model.vast.c cVar2 = (com.fyber.inneractive.sdk.model.vast.c) obj2;
        int iA = v.a(cVar.f15895h, cVar2.f15895h);
        if (iA != 0) {
            return iA;
        }
        com.fyber.inneractive.sdk.model.vast.i iVar = cVar.f15888a;
        com.fyber.inneractive.sdk.model.vast.i iVar2 = com.fyber.inneractive.sdk.model.vast.i.Html;
        int i11 = 3;
        if (iVar == iVar2) {
            i10 = 1;
        } else if (iVar == com.fyber.inneractive.sdk.model.vast.i.Iframe) {
            i10 = 2;
        } else {
            i10 = iVar == com.fyber.inneractive.sdk.model.vast.i.Static ? 3 : Integer.MAX_VALUE;
        }
        com.fyber.inneractive.sdk.model.vast.i iVar3 = cVar2.f15888a;
        if (iVar3 == iVar2) {
            i11 = 1;
        } else if (iVar3 == com.fyber.inneractive.sdk.model.vast.i.Iframe) {
            i11 = 2;
        } else if (iVar3 != com.fyber.inneractive.sdk.model.vast.i.Static) {
            i11 = Integer.MAX_VALUE;
        }
        int iA2 = v.a(i10, i11);
        if (iA2 != 0) {
            return iA2;
        }
        int iCompare = Float.compare(Math.abs((cVar.f15890c / cVar.f15891d) - this.f15720b), Math.abs((cVar2.f15890c / cVar2.f15891d) - this.f15720b));
        if (iCompare != 0) {
            return iCompare;
        }
        return v.a(Math.abs((cVar.f15890c * cVar.f15891d) - this.f15719a), Math.abs((cVar2.f15890c * cVar2.f15891d) - this.f15719a));
    }

    public d(int i10, int i11) {
        int i12 = i10 * i11;
        this.f15719a = i12;
        float f10 = i10 / i11;
        this.f15720b = f10;
        IAlog.a("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Float.valueOf(f10));
        IAlog.d("IACompanionAdsPriorityComparator: screenWidth = %s, screenHeight = %s, mMaxArea = %s, mAspectRatio = %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Float.valueOf(f10));
    }
}
