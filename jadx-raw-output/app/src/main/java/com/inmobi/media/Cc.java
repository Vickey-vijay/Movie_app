package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Cc extends AbstractC2819e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f22463h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22464g;

    @Override // com.inmobi.media.AbstractC2819e1
    public final void a(String str, List list, Map map, String str2, String str3, boolean z10) {
        ck.p.j(str, "omsdkScript");
        ck.p.j(list, "omidTrackers");
        ck.p.j(map, "macros");
        ck.p.j(str3, "customReferenceData");
        InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeAdSessionManager", "initializeAdSession");
        }
        P4.a(this.f24277a, new Bc(this, AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.VIEWABLE, Owner.NATIVE, Owner.NONE, z10), W0.a(str, list, map, str2, str3), null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cc(nk.l0 l0Var, C3053n9 c3053n9) {
        super(l0Var, c3053n9);
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(l0Var, "coroutineScope");
        this.f22464g = Cc.class.getSimpleName();
    }

    @Override // com.inmobi.media.AbstractC2819e1
    public final void a() {
        if (this.f24281e == null) {
            ck.p.i(this.f22464g, "tag");
        } else {
            P4.a(this.f24277a, new C2897h2(this, null));
        }
    }
}
