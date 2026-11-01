package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public final class J0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f22878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ej f22880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f22881d;

    public J0(L0 l10, boolean z10, Ej ej2, String str) {
        this.f22878a = l10;
        this.f22879b = z10;
        this.f22880c = ej2;
        this.f22881d = str;
    }

    @Override // com.inmobi.media.Eg
    public final void a(String str) {
        ck.p.j(str, "result");
        this.f22878a.a("file saved - " + str + " , isReporting - " + this.f22879b);
        this.f22878a.a(str, this.f22880c, this.f22881d, this.f22879b);
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f22878a.a(exc, this.f22880c);
    }
}
