package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;

/* JADX INFO: loaded from: classes6.dex */
public class r4 extends r2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final p0.a f8970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f8971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f8972p;

    @Override // com.applovin.impl.r2
    public boolean o() {
        return false;
    }

    public r4(p0.a aVar, boolean z10, Context context) {
        super(r2.c.RIGHT_DETAIL);
        this.f8970n = aVar;
        this.f8971o = context;
        this.f8898c = new SpannedString(aVar.a());
        this.f8972p = z10;
    }

    @Override // com.applovin.impl.r2
    public SpannedString f() {
        return new SpannedString(this.f8970n.a(this.f8971o));
    }

    @Override // com.applovin.impl.r2
    public boolean p() {
        Boolean boolB = this.f8970n.b(this.f8971o);
        if (boolB != null) {
            return boolB.equals(Boolean.valueOf(this.f8972p));
        }
        return false;
    }
}
