package com.inmobi.media;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2908hd implements Ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2957jd f24503a;

    @Override // com.inmobi.media.Ma
    public final void a(String str, Map map) {
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
    }

    @Override // com.inmobi.media.Ma
    public final void b(String str, String str2, String str3) {
    }

    public C2908hd(C2957jd c2957jd) {
        this.f24503a = c2957jd;
    }

    @Override // com.inmobi.media.Ma
    public final void a() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24503a.f24602a.f24675g;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("PublisherViewClickHandler", "User left application");
        }
        AbstractC2894h abstractC2894h = (AbstractC2894h) this.f24503a.f24602a.f24674f;
        abstractC2894h.getClass();
        InterfaceC2786cj interfaceC2786cj = ((Ac) abstractC2894h).f22360c;
        AbstractC3161ri abstractC3161ri = interfaceC2786cj instanceof AbstractC3161ri ? (AbstractC3161ri) interfaceC2786cj : null;
        if (abstractC3161ri != null) {
            InterfaceC3028m9 interfaceC3028m9L = abstractC3161ri.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("AUM-RenderedState", "onUserLeftApplication");
            }
            P4.a(abstractC3161ri.k(), new C3137qi(abstractC3161ri, null));
        }
    }

    @Override // com.inmobi.media.Ma
    public final void a(String str, String str2, String str3) {
        ck.p.j(str2, "message");
        InterfaceC3028m9 interfaceC3028m9 = this.f24503a.f24602a.f24675g;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("PublisherViewClickHandler", "Landing page error: " + str2 + com.ironsource.Z7.f27998r + str3);
        }
    }

    @Override // com.inmobi.media.Ma
    public final void a(Intent intent) {
        ck.p.j(intent, "intent");
        InterfaceC3028m9 interfaceC3028m9 = this.f24503a.f24602a.f24675g;
        if (interfaceC3028m9 != null) {
            ComponentName component = intent.getComponent();
            ((C3053n9) interfaceC3028m9).a("PublisherViewClickHandler", "Starting activity: " + (component != null ? component.getClassName() : null));
        }
        this.f24503a.a(intent);
    }
}
