package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Id implements S7, S7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, LevelPlayReward> f26846a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, LevelPlayReward> f26847b = new LinkedHashMap();

    @Override // com.ironsource.S7.a
    public void a(String str, String str2, int i10) {
        ck.p.j(str, "placement");
        ck.p.j(str2, IronSourceConstants.EVENTS_REWARD_NAME);
        this.f26846a.put(str, new LevelPlayReward(str2, i10));
    }

    @Override // com.ironsource.S7.a
    public void b(String str, String str2, int i10) {
        ck.p.j(str, "adUnitId");
        ck.p.j(str2, IronSourceConstants.EVENTS_REWARD_NAME);
        this.f26847b.put(str, new LevelPlayReward(str2, i10));
    }

    private final LevelPlayReward b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f26846a.get(str);
    }

    @Override // com.ironsource.S7
    public LevelPlayReward a(String str, String str2) {
        ck.p.j(str2, "adUnitId");
        LevelPlayReward levelPlayRewardB = b(str);
        return levelPlayRewardB == null ? a(str2) : levelPlayRewardB;
    }

    private final LevelPlayReward a(String str) {
        return this.f26847b.get(str);
    }
}
