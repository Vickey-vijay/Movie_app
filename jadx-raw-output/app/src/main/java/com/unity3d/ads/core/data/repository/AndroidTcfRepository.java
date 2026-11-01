package com.unity3d.ads.core.data.repository;

import ck.p;
import com.unity3d.ads.core.data.datasource.TcfDataSource;

/* JADX INFO: compiled from: AndroidTcfRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidTcfRepository implements TcfRepository {
    private final TcfDataSource tcfDataSource;

    public final TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.TcfRepository
    public String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }

    public AndroidTcfRepository(TcfDataSource tcfDataSource) {
        p.j(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }
}
