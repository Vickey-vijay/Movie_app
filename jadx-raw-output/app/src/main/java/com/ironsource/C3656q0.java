package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3656q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, S0> f30485a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.q0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final S0 a(String str, List<? extends NetworkSettings> list, int i10) {
        ck.p.j(str, "adUnitId");
        ck.p.j(list, Ne.f27190y0);
        S0 s10 = this.f30485a.get(str);
        if (s10 != null) {
            return s10;
        }
        S0 s11 = new S0(list, i10);
        this.f30485a.put(str, s11);
        return s11;
    }
}
