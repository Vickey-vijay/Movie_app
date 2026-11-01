package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* JADX INFO: compiled from: CommonSetGameId.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CommonSetGameId implements SetGameId {
    private final SessionRepository sessionRepository;

    public CommonSetGameId(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.SetGameId
    public void invoke(String str) {
        this.sessionRepository.setGameId(str);
    }
}
