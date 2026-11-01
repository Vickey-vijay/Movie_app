package io.bidmachine.rendering.internal.adform.countdown;

import android.content.Context;
import android.view.View;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.internal.view.b;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.utils.Utils;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b f60018r;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.countdown.a$a, reason: collision with other inner class name */
    public final class C0513a implements b.d {
        public C0513a() {
        }

        @Override // io.bidmachine.rendering.internal.view.b.d
        public void a() {
            a.this.q().a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, io.bidmachine.rendering.internal.event.b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(context, aVar, adElementParams, cVar, bVar, aVar2);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(aVar, "repository");
        p.j(adElementParams, "adElementParams");
        p.j(cVar, "adFormListener");
        p.j(bVar, "eventCallback");
        b bVar2 = new b(context);
        bVar2.setListener(new C0513a());
        this.f60018r = bVar2;
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.x
    public void a(String str) {
        Integer intOrNull = Utils.toIntOrNull(str);
        if (intOrNull == null) {
            o.a("Can't obtain time to start", new Object[0]);
        } else {
            this.f60018r.setDuration(intOrNull.intValue());
            this.f60018r.f();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void c() {
        t().b(this);
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void d() {
        this.f60018r.e();
        super.d();
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.c
    public void f() {
        super.f();
        this.f60018r.g();
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View x() {
        return this.f60018r;
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void z() {
        this.f60018r.b();
    }
}
