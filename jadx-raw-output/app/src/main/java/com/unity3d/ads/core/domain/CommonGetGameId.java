package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.SessionRepository;

/* JADX INFO: compiled from: CommonGetGameId.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommonGetGameId implements GetGameId {
    private final SessionRepository sessionRepository;

    public CommonGetGameId(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetGameId
    public String invoke() {
        return this.sessionRepository.getGameId();
    }
}
