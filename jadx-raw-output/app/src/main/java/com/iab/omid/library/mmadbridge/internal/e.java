package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes11.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.weakreference.a f21910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21913d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f21910a = new com.iab.omid.library.mmadbridge.weakreference.a(view);
        this.f21911b = view.getClass().getCanonicalName();
        this.f21912c = friendlyObstructionPurpose;
        this.f21913d = str;
    }

    public String a() {
        return this.f21913d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f21912c;
    }

    public com.iab.omid.library.mmadbridge.weakreference.a c() {
        return this.f21910a;
    }

    public String d() {
        return this.f21911b;
    }
}
