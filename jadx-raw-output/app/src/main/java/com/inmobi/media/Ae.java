package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Ae extends AbstractC3295x2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f22365i = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(nk.l0 l0Var, InterfaceC3028m9 interfaceC3028m9) {
        super(l0Var, interfaceC3028m9);
        ck.p.j(l0Var, "coroutineScope");
    }

    @Override // com.inmobi.media.AbstractC2819e1
    public final void a(String str, List list, Map map, String str2, String str3, boolean z10) {
        ck.p.j(str, "omsdkScript");
        ck.p.j(list, "omidTrackers");
        ck.p.j(map, "macros");
        ck.p.j(str3, "customReferenceData");
        InterfaceC3028m9 interfaceC3028m9 = this.f24278b;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).a("NativeVideoAdSessionManager", "initializeAdSession");
        }
        CreativeType creativeType = CreativeType.VIDEO;
        ImpressionType impressionType = ImpressionType.VIEWABLE;
        Owner owner = Owner.NATIVE;
        P4.a(this.f24277a, new C3357ze(this, AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, z10), W0.a(str, list, map, str2, str3), null));
    }
}
