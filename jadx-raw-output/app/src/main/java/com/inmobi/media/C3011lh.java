package com.inmobi.media;

import android.database.sqlite.SQLiteException;
import com.inmobi.adquality.models.AdQualityResult;

/* JADX INFO: renamed from: com.inmobi.media.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3011lh implements M0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdQualityResult f24778a;

    @Override // com.inmobi.media.M0
    public final Object a() throws InterruptedException {
        boolean z10 = true;
        try {
            nk.i.b(null, new C2986kh(this, null), 1, null);
        } catch (SQLiteException unused) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public C3011lh(AdQualityResult adQualityResult) {
        ck.p.j(adQualityResult, "result");
        this.f24778a = adQualityResult;
    }
}
