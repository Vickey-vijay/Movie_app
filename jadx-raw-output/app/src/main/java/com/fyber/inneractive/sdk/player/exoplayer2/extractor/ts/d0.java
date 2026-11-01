package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f17157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f17158c;

    public d0(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f17156a = str;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f17157b = listUnmodifiableList;
        this.f17158c = bArr;
    }
}
