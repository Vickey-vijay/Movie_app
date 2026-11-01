package sg.bigo.ads.ad.c;

import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67609c;

    public c(f fVar) {
        this.f67607a = 2;
        this.f67608b = 0;
        this.f67609c = 1;
        if (fVar == null) {
            return;
        }
        this.f67607a = fVar.f69376a.ao();
        this.f67608b = fVar.f69376a.ap();
        this.f67609c = fVar.f69376a.aq();
    }
}
