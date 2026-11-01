package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] f17578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f17579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i f17580c;

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws a0 {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar = this.f17580c;
        if (iVar != null) {
            return iVar;
        }
        for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar2 : this.f17578a) {
            try {
                if (iVar2.a(bVar)) {
                    this.f17580c = iVar2;
                    bVar.f16454e = 0;
                    break;
                }
                continue;
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                bVar.f16454e = 0;
                throw th2;
            }
            bVar.f16454e = 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar3 = this.f17580c;
        if (iVar3 != null) {
            iVar3.a(this.f17579b);
            return this.f17580c;
        }
        StringBuilder sb2 = new StringBuilder("None of the available extractors (");
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr = this.f17578a;
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f17873a;
        StringBuilder sb3 = new StringBuilder();
        for (int i11 = 0; i11 < iVarArr.length; i11++) {
            sb3.append(iVarArr[i11].getClass().getSimpleName());
            if (i11 < iVarArr.length - 1) {
                sb3.append(", ");
            }
        }
        sb2.append(sb3.toString());
        sb2.append(") could read the stream.");
        throw new a0(sb2.toString());
    }

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f17578a = iVarArr;
        this.f17579b = jVar;
    }
}
