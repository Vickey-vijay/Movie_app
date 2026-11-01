package com.unity3d.mediation.rewarded;

import ck.p;

/* JADX INFO: loaded from: classes11.dex */
public final class LevelPlayReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45347b;

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = levelPlayReward.f45346a;
        }
        if ((i11 & 2) != 0) {
            i10 = levelPlayReward.f45347b;
        }
        return levelPlayReward.copy(str, i10);
    }

    public final String component1() {
        return this.f45346a;
    }

    public final int component2() {
        return this.f45347b;
    }

    public final LevelPlayReward copy(String str, int i10) {
        p.j(str, "name");
        return new LevelPlayReward(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return p.e(this.f45346a, levelPlayReward.f45346a) && this.f45347b == levelPlayReward.f45347b;
    }

    public int hashCode() {
        return (this.f45346a.hashCode() * 31) + Integer.hashCode(this.f45347b);
    }

    public String toString() {
        return "LevelPlayReward(name=" + this.f45346a + ", amount=" + this.f45347b + ")";
    }

    public LevelPlayReward(String str, int i10) {
        p.j(str, "name");
        this.f45346a = str;
        this.f45347b = i10;
    }

    public final int getAmount() {
        return this.f45347b;
    }

    public final String getName() {
        return this.f45346a;
    }
}
