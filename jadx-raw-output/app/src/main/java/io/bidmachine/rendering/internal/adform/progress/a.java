package io.bidmachine.rendering.internal.adform.progress;

import android.content.Context;
import android.view.View;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.event.b;
import io.bidmachine.rendering.internal.view.c;
import io.bidmachine.rendering.model.AdElementParams;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f60032r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, io.bidmachine.rendering.internal.adform.c cVar, b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(aVar, "repository");
        p.j(adElementParams, "adElementParams");
        p.j(cVar, "adFormListener");
        p.j(bVar, "eventCallback");
        this.f60032r = new c(context);
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.s
    public void a(long j10, long j11, float f10) {
        this.f60032r.a(j10, j11, f10);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        t().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        return this.f60032r;
    }
}
