package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f17022a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    public a(b bVar) {
        this.f17022a = bVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        if (j10 == 0) {
            return this.f17022a.f17024b;
        }
        b bVar = this.f17022a;
        long j11 = (((long) bVar.f17026d.f17069i) * j10) / 1000000;
        long j12 = bVar.f17024b;
        long j13 = bVar.f17025c;
        long j14 = ((((j13 - j12) * j11) / bVar.f17028f) - 30000) + j12;
        if (j14 >= j12) {
            j12 = j14;
        }
        return j12 >= j13 ? j13 - 1 : j12;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        b bVar = this.f17022a;
        return (bVar.f17028f * 1000000) / ((long) bVar.f17026d.f17069i);
    }
}
