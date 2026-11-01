package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3497h3 extends AbstractC3726u3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3497h3(int i10, String str, boolean z10, C3507hd c3507hd) {
        super(i10, str, z10, c3507hd);
        ck.p.j(str, "placementName");
    }

    @Override // com.ironsource.AbstractC3726u3
    public String toString() {
        return super.toString() + ", placementId: " + b();
    }
}
