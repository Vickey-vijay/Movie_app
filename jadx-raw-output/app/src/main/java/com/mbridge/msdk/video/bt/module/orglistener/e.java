package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.video.bt.module.MBTempContainer;

/* JADX INFO: compiled from: ReportBTContainerErrorListener.java */
/* JADX INFO: loaded from: classes8.dex */
public class e extends MBTempContainer.k.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f38567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f38568c;

    public e(com.mbridge.msdk.foundation.same.report.metrics.c cVar, h hVar) {
        this.f38567b = hVar;
        this.f38568c = cVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.MBTempContainer.k.a, com.mbridge.msdk.video.bt.module.MBTempContainer.k
    public void onError(String str) {
        super.onError(str);
        h hVar = this.f38567b;
        if (hVar != null) {
            hVar.a(this.f38568c, str);
        }
    }
}
