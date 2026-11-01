package p;

import android.content.Context;
import com.google.android.exoplayer2.upstream.c;
import g5.k0;

/* JADX INFO: compiled from: JDefaultDataSourceFactory.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements com.google.android.exoplayer2.upstream.a.InterfaceC0188a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0188a f65852b;

    @Override // com.google.android.exoplayer2.upstream.a.InterfaceC0188a
    public com.google.android.exoplayer2.upstream.a createDataSource() {
        return new com.google.android.exoplayer2.upstream.b(this.f65851a, this.f65852b.createDataSource());
    }

    public a(Context context) {
        String strB0 = k0.b0(context, context.getPackageName());
        this.f65851a = context.getApplicationContext();
        this.f65852b = new c(context, strB0);
    }
}
