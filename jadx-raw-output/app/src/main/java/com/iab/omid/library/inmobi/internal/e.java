package com.iab.omid.library.inmobi.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f21640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21643d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f21640a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f21641b = view.getClass().getCanonicalName();
        this.f21642c = friendlyObstructionPurpose;
        this.f21643d = str;
    }

    public String a() {
        return this.f21643d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21642c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f21640a;
    }

    public String d() {
        return this.f21641b;
    }
}
