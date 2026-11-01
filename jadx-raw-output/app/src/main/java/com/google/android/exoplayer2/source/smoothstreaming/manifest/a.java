package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.offline.StreamKey;
import g5.i0;
import g5.k0;
import h4.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import w3.m;

/* JADX INFO: compiled from: SsManifest.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements d<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final C0185a f19781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b[] f19782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f19783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f19784h;

    /* JADX INFO: compiled from: SsManifest.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f19789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f19791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f19792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f19793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f19794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f19795h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f19796i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Format[] f19797j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f19798k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f19799l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f19800m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<Long> f19801n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final long[] f19802o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final long f19803p;

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, @Nullable String str5, Format[] formatArr, List<Long> list, long j11) {
            this(str, str2, i10, str3, j10, str4, i11, i12, i13, i14, str5, formatArr, list, k0.z0(list, 1000000L, j10), k0.y0(j11, 1000000L, j10));
        }

        public Uri a(int i10, int i11) {
            g5.a.f(this.f19797j != null);
            g5.a.f(this.f19801n != null);
            g5.a.f(i11 < this.f19801n.size());
            String string = Integer.toString(this.f19797j[i10].f18966f);
            String string2 = this.f19801n.get(i11).toString();
            return i0.d(this.f19799l, this.f19800m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        }

        public b b(Format[] formatArr) {
            return new b(this.f19799l, this.f19800m, this.f19788a, this.f19789b, this.f19790c, this.f19791d, this.f19792e, this.f19793f, this.f19794g, this.f19795h, this.f19796i, formatArr, this.f19801n, this.f19802o, this.f19803p);
        }

        public long c(int i10) {
            if (i10 == this.f19798k - 1) {
                return this.f19803p;
            }
            long[] jArr = this.f19802o;
            return jArr[i10 + 1] - jArr[i10];
        }

        public int d(long j10) {
            return k0.h(this.f19802o, j10, true, true);
        }

        public long e(int i10) {
            return this.f19802o[i10];
        }

        public b(String str, String str2, int i10, String str3, long j10, String str4, int i11, int i12, int i13, int i14, @Nullable String str5, Format[] formatArr, List<Long> list, long[] jArr, long j11) {
            this.f19799l = str;
            this.f19800m = str2;
            this.f19788a = i10;
            this.f19789b = str3;
            this.f19790c = j10;
            this.f19791d = str4;
            this.f19792e = i11;
            this.f19793f = i12;
            this.f19794g = i13;
            this.f19795h = i14;
            this.f19796i = str5;
            this.f19797j = formatArr;
            this.f19801n = list;
            this.f19802o = jArr;
            this.f19803p = j11;
            this.f19798k = list.size();
        }
    }

    public a(int i10, int i11, long j10, long j11, long j12, int i12, boolean z10, @Nullable C0185a c0185a, b[] bVarArr) {
        this(i10, i11, j11 == 0 ? -9223372036854775807L : k0.y0(j11, 1000000L, j10), j12 != 0 ? k0.y0(j12, 1000000L, j10) : -9223372036854775807L, i12, z10, c0185a, bVarArr);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SsManifest.java */
    public static class C0185a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f19785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f19786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m[] f19787c;

        public C0185a(UUID uuid, byte[] bArr, m[] mVarArr) {
            this.f19785a = uuid;
            this.f19786b = bArr;
            this.f19787c = mVarArr;
        }
    }

    @Override // h4.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a copy(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i10);
            b bVar2 = this.f19782f[streamKey.f19402c];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f19797j[streamKey.f19403d]);
            i10++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new a(this.f19777a, this.f19778b, this.f19783g, this.f19784h, this.f19779c, this.f19780d, this.f19781e, (b[]) arrayList2.toArray(new b[0]));
    }

    public a(int i10, int i11, long j10, long j11, int i12, boolean z10, @Nullable C0185a c0185a, b[] bVarArr) {
        this.f19777a = i10;
        this.f19778b = i11;
        this.f19783g = j10;
        this.f19784h = j11;
        this.f19779c = i12;
        this.f19780d = z10;
        this.f19781e = c0185a;
        this.f19782f = bVarArr;
    }
}
