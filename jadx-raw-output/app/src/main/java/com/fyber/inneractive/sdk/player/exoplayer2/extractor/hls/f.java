package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f16532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f16533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f16534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] f16535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f16536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f16537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f16538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f16540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.g f16541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f16542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f16543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f16544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f16545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f16546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b f16547p;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr, b bVar, o oVar, List list) {
        this.f16536e = kVar;
        this.f16535d = aVarArr;
        this.f16534c = oVar;
        this.f16538g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            oVarArr[i10] = aVarArr[i10].f16624b;
            iArr[i10] = i10;
        }
        this.f16532a = bVar.f16522a.a();
        this.f16533b = bVar.f16522a.a();
        y yVar = new y(oVarArr);
        this.f16537f = yVar;
        this.f16547p = new e(yVar, iArr);
    }

    public final void a(Uri uri, String str, byte[] bArr) {
        String strSubstring;
        int length;
        if (str.toLowerCase(Locale.getDefault()).startsWith("0x")) {
            strSubstring = str.substring(2);
        } else {
            strSubstring = str;
        }
        byte[] byteArray = new BigInteger(strSubstring, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        if (byteArray.length > 16) {
            length = byteArray.length - 16;
        } else {
            length = 0;
        }
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f16543l = uri;
        this.f16544m = bArr;
        this.f16545n = str;
        this.f16546o = bArr2;
    }
}
