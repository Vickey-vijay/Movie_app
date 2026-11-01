package com.iab.omid.library.appodeal.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.weakreference.a f21113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21116d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f21113a = new com.iab.omid.library.appodeal.weakreference.a(view);
        this.f21114b = view.getClass().getCanonicalName();
        this.f21115c = friendlyObstructionPurpose;
        this.f21116d = str;
    }

    public String a() {
        return this.f21116d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21115c;
    }

    public com.iab.omid.library.appodeal.weakreference.a c() {
        return this.f21113a;
    }

    public String d() {
        return this.f21114b;
    }
}
