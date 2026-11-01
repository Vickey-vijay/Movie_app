package com.iab.omid.library.fyber.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.fyber.weakreference.a f21499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21502d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f21499a = new com.iab.omid.library.fyber.weakreference.a(view);
        this.f21500b = view.getClass().getCanonicalName();
        this.f21501c = friendlyObstructionPurpose;
        this.f21502d = str;
    }

    public String a() {
        return this.f21502d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21501c;
    }

    public com.iab.omid.library.fyber.weakreference.a c() {
        return this.f21499a;
    }

    public String d() {
        return this.f21500b;
    }
}
