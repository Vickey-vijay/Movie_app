package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.r;
import com.fyber.inneractive.sdk.model.vast.t;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15725c;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        int i10 = 1;
        if (!TextUtils.equals("VPAID", rVar2.f15942f)) {
            if (TextUtils.equals("VPAID", rVar.f15942f)) {
                return 1;
            }
            Integer num2 = rVar.f15941e;
            int iIntValue = num2 == null ? 0 : num2.intValue();
            Integer num3 = rVar2.f15941e;
            int iIntValue2 = num3 == null ? 0 : num3.intValue();
            int i11 = this.f15723a;
            if (iIntValue2 <= i11 || iIntValue > i11) {
                if (iIntValue > i11 && iIntValue2 <= i11) {
                    return 1;
                }
                t tVarA = t.a(rVar2.f15940d);
                t tVar = t.MEDIA_TYPE_MP4;
                if (tVarA == tVar) {
                    num = 3;
                } else if (tVarA == t.MEDIA_TYPE_3GPP) {
                    num = 2;
                } else {
                    num = tVarA == t.MEDIA_TYPE_WEBM ? i10 : -1;
                }
                t tVarA2 = t.a(rVar.f15940d);
                if (tVarA2 == tVar) {
                    i10 = 3;
                } else if (tVarA2 == t.MEDIA_TYPE_3GPP) {
                    i10 = 2;
                } else if (tVarA2 != t.MEDIA_TYPE_WEBM) {
                    i10 = -1;
                }
                int iCompareTo = num.compareTo(i10);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                if (iIntValue < iIntValue2) {
                    return 1;
                }
                if (iIntValue <= iIntValue2) {
                    Integer num4 = rVar.f15938b;
                    int iIntValue3 = num4 == null ? 0 : num4.intValue();
                    Integer num5 = rVar.f15939c;
                    int iIntValue4 = num5 == null ? 0 : num5.intValue();
                    Integer num6 = rVar2.f15938b;
                    int iIntValue5 = num6 == null ? 0 : num6.intValue();
                    Integer num7 = rVar2.f15939c;
                    int i12 = iIntValue3 * iIntValue4;
                    int iIntValue6 = iIntValue5 * (num7 == null ? 0 : num7.intValue());
                    int i13 = this.f15724b * this.f15725c;
                    int iAbs = Math.abs(i12 - i13);
                    int iAbs2 = Math.abs(iIntValue6 - i13);
                    if (iAbs >= iAbs2) {
                        return iAbs > iAbs2 ? 1 : 0;
                    }
                }
            }
        }
        return -1;
    }

    public g(int i10, int i11, int i12) {
        this.f15723a = i10;
        this.f15724b = i11;
        this.f15725c = i12;
    }
}
