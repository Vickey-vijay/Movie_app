package com.inmobi.media;

import android.os.Message;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2770c3 implements InterfaceC2997l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandlerC2873g3 f24111a;

    @Override // com.inmobi.media.InterfaceC2997l3
    public final void a(S2 s10) {
        ck.p.j(s10, "click");
        HandlerC2873g3 handlerC2873g3 = this.f24111a;
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = s10;
        handlerC2873g3.sendMessage(messageObtain);
    }

    public C2770c3(HandlerC2873g3 handlerC2873g3) {
        this.f24111a = handlerC2873g3;
    }

    @Override // com.inmobi.media.InterfaceC2997l3
    public final void a(S2 s10, EnumC2721a6 enumC2721a6) throws InterruptedException {
        EnumC2721a6 enumC2721a7 = EnumC2721a6.f23948d;
        ck.p.j(s10, "click");
        ck.p.j(enumC2721a7, IronSourceConstants.EVENTS_ERROR_CODE);
        C3271w3 c3271w3 = C3271w3.f25610a;
        ck.p.i("w3", "access$getTAG$p(...)");
        String str = s10.f23479b;
        C3271w3.b(s10);
        this.f24111a.b(s10);
    }
}
