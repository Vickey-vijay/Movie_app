package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class b62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f75744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lr2 f75745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f75746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lw f75747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yv f75748e;

    @Override // yads.m62
    public final void a(long j10, long j11) {
        if (this.f75748e.a()) {
            lw lwVar = this.f75747d;
            lwVar.f79949b = j11;
            long j12 = j11 + lwVar.f79948a;
            Long l10 = this.f75746c;
            if (l10 == null || j12 < l10.longValue()) {
                return;
            }
            this.f75745b.a();
            c();
        }
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.m62
    public final void b() {
        if (this.f75748e.a()) {
            this.f75745b.a();
            c();
        }
    }

    public final void c() {
        this.f75744a.f76588a.remove(this);
    }

    @Override // yads.ay0
    public final void start() {
        Long l10;
        this.f75744a.f76588a.add(this);
        if (!this.f75748e.a() || (l10 = this.f75746c) == null || this.f75747d.f79948a < l10.longValue()) {
            return;
        }
        this.f75745b.a();
        c();
    }

    public b62(d62 d62Var, lr2 lr2Var, Long l10, lw lwVar, yv yvVar) {
        this.f75744a = d62Var;
        this.f75745b = lr2Var;
        this.f75746c = l10;
        this.f75747d = lwVar;
        this.f75748e = yvVar;
    }

    @Override // yads.ay0
    public final void invalidate() {
        c();
    }

    @Override // yads.m62
    public final void a() {
        this.f75745b.a();
        c();
    }
}
