package com.unity3d.ads.core.domain;

import ck.p;

/* JADX INFO: compiled from: CommonValidateGameId.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CommonValidateGameId implements ValidateGameId {
    private final GetGameId getGameId;
    private final SetGameId setGameId;

    public CommonValidateGameId(GetGameId getGameId, SetGameId setGameId) {
        p.j(getGameId, "getGameId");
        p.j(setGameId, "setGameId");
        this.getGameId = getGameId;
        this.setGameId = setGameId;
    }

    @Override // com.unity3d.ads.core.domain.ValidateGameId
    public boolean invoke(String str) {
        if (this.getGameId.invoke() != null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        this.setGameId.invoke(str);
        return true;
    }
}
