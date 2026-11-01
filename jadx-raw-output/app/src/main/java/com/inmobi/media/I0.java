package com.inmobi.media;

/* JADX INFO: loaded from: classes5.dex */
public final class I0 implements Eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L0 f22832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22833b;

    public I0(L0 l10, boolean z10) {
        this.f22832a = l10;
        this.f22833b = z10;
    }

    @Override // com.inmobi.media.Eg
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.f22832a.a("result pushed to queue");
        if (this.f22833b) {
            L0 l10 = this.f22832a;
            l10.a("session end - cleanup");
            l10.f23041g = null;
            l10.f23040f.clear();
            l10.f23037c.set(false);
            l10.f23038d.set(false);
        }
    }

    @Override // com.inmobi.media.Eg
    public final void onError(Exception exc) {
        this.f22832a.a("error in pushing to queue", exc);
    }
}
