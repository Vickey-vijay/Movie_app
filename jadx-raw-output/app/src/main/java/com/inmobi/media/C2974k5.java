package com.inmobi.media;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2974k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24652c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2974k5)) {
            return false;
        }
        C2974k5 c2974k5 = (C2974k5) obj;
        return ck.p.e(this.f24650a, c2974k5.f24650a) && ck.p.e("com.im_11.1.0.db", "com.im_11.1.0.db") && ck.p.e(this.f24651b, c2974k5.f24651b) && this.f24652c == c2974k5.f24652c && ck.p.e(null, null);
    }

    public C2974k5(Context context, ArrayList arrayList, int i10) {
        ck.p.j("com.im_11.1.0.db", "name");
        ck.p.j(arrayList, "tableInfos");
        this.f24650a = context;
        this.f24651b = arrayList;
        this.f24652c = i10;
    }

    public final int hashCode() {
        Context context = this.f24650a;
        return AbstractC2862fi.a(this.f24652c, (this.f24651b.hashCode() + AbstractC2862fi.a(1, (((context == null ? 0 : context.hashCode()) * 31) - 2016312295) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DatabaseConfig(context=" + this.f24650a + ", name=com.im_11.1.0.db, version=1, tableInfos=" + this.f24651b + ", journalMode=" + this.f24652c + ", transactionExecutor=" + ((Object) null) + ")";
    }
}
