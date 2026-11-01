package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3489gd extends AbstractC3726u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29018f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3489gd(int i10, String str, boolean z10, String str2, int i11, C3507hd c3507hd) {
        super(i10, str, z10, c3507hd);
        ck.p.j(str, "placementName");
        ck.p.j(str2, IronSourceConstants.EVENTS_REWARD_NAME);
        this.f29018f = i11;
        this.f29017e = str2;
    }

    public final int e() {
        return this.f29018f;
    }

    public final String f() {
        return this.f29017e;
    }

    @Override // com.ironsource.AbstractC3726u3
    public String toString() {
        return super.toString() + ", reward name: " + this.f29017e + " , amount: " + this.f29018f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3489gd(AbstractC3726u3 abstractC3726u3) {
        super(abstractC3726u3.b(), abstractC3726u3.c(), abstractC3726u3.d(), abstractC3726u3.a());
        ck.p.j(abstractC3726u3, "placement");
        this.f29017e = "";
    }
}
