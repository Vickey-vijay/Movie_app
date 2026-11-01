package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class Bj implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return qj.b.d(Integer.valueOf(((Image) obj2).getWidth()), Integer.valueOf(((Image) obj).getWidth()));
    }
}
