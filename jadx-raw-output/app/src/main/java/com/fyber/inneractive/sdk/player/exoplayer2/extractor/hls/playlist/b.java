package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f16626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f16627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f16628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f16629f;

    public b(String str, List list, List list2, List list3, o oVar, List list4) {
        List listUnmodifiableList;
        super(str);
        this.f16625b = Collections.unmodifiableList(list);
        this.f16626c = Collections.unmodifiableList(list2);
        this.f16627d = Collections.unmodifiableList(list3);
        this.f16628e = oVar;
        if (list4 != null) {
            listUnmodifiableList = Collections.unmodifiableList(list4);
        } else {
            listUnmodifiableList = null;
        }
        this.f16629f = listUnmodifiableList;
    }
}
