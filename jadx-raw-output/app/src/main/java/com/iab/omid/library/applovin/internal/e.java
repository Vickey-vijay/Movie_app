package com.iab.omid.library.applovin.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f20978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f20980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20981d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f20978a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f20979b = view.getClass().getCanonicalName();
        this.f20980c = friendlyObstructionPurpose;
        this.f20981d = str;
    }

    public String a() {
        return this.f20981d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f20980c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f20978a;
    }

    public String d() {
        return this.f20979b;
    }
}
