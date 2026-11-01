package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HlsMasterPlaylist.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends q4.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f19616n = new b("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Uri> f19617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<C0183b> f19618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<a> f19619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<a> f19620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<a> f19621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a> f19622i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Format f19623j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<Format> f19624k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, String> f19625l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<DrmInitData> f19626m;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HlsMasterPlaylist.java */
    public static final class C0183b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f19631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Format f19632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f19633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f19634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f19635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f19636f;

        public static C0183b b(Uri uri) {
            return new C0183b(uri, Format.q("0", null, "application/x-mpegURL", null, null, -1, 0, 0, null), null, null, null, null);
        }

        public C0183b a(Format format) {
            return new C0183b(this.f19631a, format, this.f19633c, this.f19634d, this.f19635e, this.f19636f);
        }

        public C0183b(Uri uri, Format format, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f19631a = uri;
            this.f19632b = format;
            this.f19633c = str;
            this.f19634d = str2;
            this.f19635e = str3;
            this.f19636f = str4;
        }
    }

    public static void a(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f19627a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    /* JADX INFO: compiled from: HlsMasterPlaylist.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Uri f19627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Format f19628b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f19629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f19630d;

        public a(@Nullable Uri uri, Format format, String str, String str2) {
            this.f19627a = uri;
            this.f19628b = format;
            this.f19629c = str;
            this.f19630d = str2;
        }
    }

    public static <T> List<T> c(List<T> list, int i10, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            for (int i12 = 0; i12 < list2.size(); i12++) {
                StreamKey streamKey = list2.get(i12);
                if (streamKey.f19402c == i10 && streamKey.f19403d == i11) {
                    arrayList.add(t10);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static List<Uri> e(List<C0183b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f19631a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list2, arrayList);
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        return arrayList;
    }

    @Override // h4.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b copy(List<StreamKey> list) {
        return new b(this.f66517a, this.f66518b, c(this.f19618e, 0, list), Collections.emptyList(), c(this.f19620g, 1, list), c(this.f19621h, 2, list), Collections.emptyList(), this.f19623j, this.f19624k, this.f66519c, this.f19625l, this.f19626m);
    }

    public b(String str, List<String> list, List<C0183b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, @Nullable Format format, @Nullable List<Format> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        List<Format> listUnmodifiableList;
        super(str, list, z10);
        this.f19617d = Collections.unmodifiableList(e(list2, list3, list4, list5, list6));
        this.f19618e = Collections.unmodifiableList(list2);
        this.f19619f = Collections.unmodifiableList(list3);
        this.f19620g = Collections.unmodifiableList(list4);
        this.f19621h = Collections.unmodifiableList(list5);
        this.f19622i = Collections.unmodifiableList(list6);
        this.f19623j = format;
        if (list7 != null) {
            listUnmodifiableList = Collections.unmodifiableList(list7);
        } else {
            listUnmodifiableList = null;
        }
        this.f19624k = listUnmodifiableList;
        this.f19625l = Collections.unmodifiableMap(map);
        this.f19626m = Collections.unmodifiableList(list8);
    }

    public static b d(String str) {
        return new b("", Collections.emptyList(), Collections.singletonList(C0183b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
    }
}
