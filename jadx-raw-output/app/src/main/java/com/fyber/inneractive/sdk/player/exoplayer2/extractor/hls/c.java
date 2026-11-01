package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f16523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f16525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f16526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f16527m;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i10, Object obj, byte[] bArr, String str) {
        super(3, i10, -9223372036854775807L, -9223372036854775807L, oVar, hVar, kVar, obj);
        this.f16523i = bArr;
        this.f16526l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.f16525k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.f16525k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.f16524j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        try {
            this.f17549h.a(this.f17542a);
            int i10 = 0;
            this.f16524j = 0;
            while (i10 != -1 && !this.f16525k) {
                byte[] bArr = this.f16523i;
                if (bArr == null) {
                    this.f16523i = new byte[16384];
                } else if (bArr.length < this.f16524j + 16384) {
                    this.f16523i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f17549h.read(this.f16523i, this.f16524j, 16384);
                if (i10 != -1) {
                    this.f16524j += i10;
                }
            }
            if (!this.f16525k) {
                this.f16527m = Arrays.copyOf(this.f16523i, this.f16524j);
            }
        } finally {
            z.a(this.f17549h);
        }
    }
}
