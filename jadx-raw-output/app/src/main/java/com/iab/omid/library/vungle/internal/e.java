package com.iab.omid.library.vungle.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f22179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f22181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f22182d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f22179a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.f22180b = view.getClass().getCanonicalName();
        this.f22181c = friendlyObstructionPurpose;
        this.f22182d = str;
    }

    public String a() {
        return this.f22182d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f22181c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f22179a;
    }

    public String d() {
        return this.f22180b;
    }
}
