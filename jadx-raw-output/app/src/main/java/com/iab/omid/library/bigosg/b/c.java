package com.iab.omid.library.bigosg.b;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.e.a f21243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f21245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f21246d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f21243a = new com.iab.omid.library.bigosg.e.a(view);
        this.f21244b = view.getClass().getCanonicalName();
        this.f21245c = friendlyObstructionPurpose;
        this.f21246d = str;
    }

    public com.iab.omid.library.bigosg.e.a a() {
        return this.f21243a;
    }

    public String b() {
        return this.f21244b;
    }

    public FriendlyObstructionPurpose c() {
        return this.f21245c;
    }

    public String d() {
        return this.f21246d;
    }
}
