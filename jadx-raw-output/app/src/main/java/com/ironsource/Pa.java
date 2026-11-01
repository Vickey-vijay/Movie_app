package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class Pa {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC3650pb<LevelPlayAdInfo> interfaceC3650pb) {
        if (interfaceC3650pb instanceof InterfaceC3650pb.b) {
            return "success";
        }
        if (interfaceC3650pb instanceof InterfaceC3650pb.a) {
            return "failure";
        }
        throw new NoWhenBranchMatchedException();
    }
}
