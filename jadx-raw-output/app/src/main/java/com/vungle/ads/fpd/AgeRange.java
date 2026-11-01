package com.vungle.ads.fpd;

import ik.i;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;

/* JADX INFO: compiled from: Demographic.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/vungle/ads/fpd/AgeRange;", "", "", "id", "I", "getId", "()I", "Lik/i;", "range", "Lik/i;", "getRange", "()Lik/i;", "<init>", "(Ljava/lang/String;IILik/i;)V", VastTagName.COMPANION, "AGE_18_20", "AGE_21_30", "AGE_31_40", "AGE_41_50", "AGE_51_60", "AGE_61_70", "AGE_71_75", "OTHERS", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public enum AgeRange {
    AGE_18_20(1, new i(18, 20)),
    AGE_21_30(2, new i(21, 30)),
    AGE_31_40(3, new i(31, 40)),
    AGE_41_50(4, new i(41, 50)),
    AGE_51_60(5, new i(51, 60)),
    AGE_61_70(6, new i(61, 70)),
    AGE_71_75(7, new i(71, 75)),
    OTHERS(0, new i(Integer.MIN_VALUE, Integer.MAX_VALUE));


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int id;
    private final i range;

    /* JADX INFO: compiled from: Demographic.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/fpd/AgeRange$Companion;", "", "()V", "fromAge", "Lcom/vungle/ads/fpd/AgeRange;", "age", "", "fromAge$vungle_ads_release", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0027  */
        /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
        public final AgeRange fromAge$vungle_ads_release(int age) {
            boolean z10;
            for (AgeRange ageRange : AgeRange.values()) {
                i range = ageRange.getRange();
                int iE = range.e();
                if (age <= range.f() && iE <= age) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (ageRange == null) {
                        return AgeRange.OTHERS;
                    }
                    return ageRange;
                }
            }
            ageRange = null;
            if (ageRange == null) {
                return AgeRange.OTHERS;
            }
            return ageRange;
        }
    }

    public final int getId() {
        return this.id;
    }

    public final i getRange() {
        return this.range;
    }

    AgeRange(int i10, i iVar) {
        this.id = i10;
        this.range = iVar;
    }
}
