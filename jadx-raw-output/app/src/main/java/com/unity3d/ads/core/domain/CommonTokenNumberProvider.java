package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: CommonTokenNumberProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonTokenNumberProvider implements TokenNumberProvider {
    private final g number$delegate;

    public CommonTokenNumberProvider(final SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        this.number$delegate = b.a(new bk.a<Integer>() { // from class: com.unity3d.ads.core.domain.CommonTokenNumberProvider$number$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Integer invoke() {
                return Integer.valueOf(sessionRepository.getHeaderBiddingTokenCounter());
            }
        });
    }

    private final int getNumber() {
        return ((Number) this.number$delegate.getValue()).intValue();
    }

    @Override // com.unity3d.ads.core.domain.TokenNumberProvider
    public int invoke() {
        return getNumber();
    }
}
