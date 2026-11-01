package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3362zj implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25866a;

    public C3362zj(int i10) {
        this.f25866a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return qj.b.d(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.f25866a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.f25866a)));
    }
}
