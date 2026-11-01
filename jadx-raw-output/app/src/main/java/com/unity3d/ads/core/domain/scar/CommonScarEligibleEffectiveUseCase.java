package com.unity3d.ads.core.domain.scar;

import ck.p;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import nj.r;
import nj.s;

/* JADX INFO: compiled from: CommonScarEligibleEffectiveUseCase.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonScarEligibleEffectiveUseCase implements ScarEligibleEffectiveUseCase {
    private final SessionRepository sessionRepository;

    public CommonScarEligibleEffectiveUseCase(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase
    public List<AdFormatOuterClass.AdFormat> invoke(TokenConfiguration tokenConfiguration) {
        List<AdFormatOuterClass.AdFormat> listE;
        if (tokenConfiguration == null) {
            return this.sessionRepository.getScarEligibleFormats();
        }
        AdFormatOuterClass.AdFormat protoAdFormat = AdFormatExtensions.toProtoAdFormat(tokenConfiguration.getAdFormat());
        if (!this.sessionRepository.getScarEligibleFormats().contains(protoAdFormat)) {
            protoAdFormat = null;
        }
        return (protoAdFormat == null || (listE = r.e(protoAdFormat)) == null) ? s.k() : listE;
    }
}
