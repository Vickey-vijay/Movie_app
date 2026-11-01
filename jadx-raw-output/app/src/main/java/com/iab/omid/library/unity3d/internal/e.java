package com.iab.omid.library.unity3d.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.unity3d.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.weakreference.a f22046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f22048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22049d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f22046a = new com.iab.omid.library.unity3d.weakreference.a(view);
        this.f22047b = view.getClass().getCanonicalName();
        this.f22048c = friendlyObstructionPurpose;
        this.f22049d = str;
    }

    public String a() {
        return this.f22049d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f22048c;
    }

    public com.iab.omid.library.unity3d.weakreference.a c() {
        return this.f22046a;
    }

    public String d() {
        return this.f22047b;
    }
}
