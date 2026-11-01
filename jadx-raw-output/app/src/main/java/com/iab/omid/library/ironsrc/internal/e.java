package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f21775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21778d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f21775a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f21776b = view.getClass().getCanonicalName();
        this.f21777c = friendlyObstructionPurpose;
        this.f21778d = str;
    }

    public String a() {
        return this.f21778d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21777c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f21775a;
    }

    public String d() {
        return this.f21776b;
    }
}
