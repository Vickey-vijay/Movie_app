package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: loaded from: classes5.dex */
public final class Gd implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jn f22733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Be f22734b;

    public Gd(Jn jn2, Be be2) {
        ck.p.j(jn2, "viewableConfig");
        ck.p.j(be2, "nativeViewabilityViewHolder");
        this.f22733a = jn2;
        this.f22734b = be2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    @Override // com.inmobi.media.Nn
    public final Mn a() {
        boolean zA;
        ViewGroup viewGroup = this.f22734b.f22418a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return Mn.HIDDEN;
        }
        Be be2 = this.f22734b;
        Fe fe2 = be2.f22422e;
        C3291wn c3291wn = fe2.f22642b;
        boolean z10 = false;
        if (c3291wn.f25672a) {
            MediaView mediaView = be2.f22420c;
            if (mediaView == null || !c3291wn.f25673b) {
                zA = false;
            } else {
                zA = Un.a(mediaView, c3291wn.f25674c);
            }
        } else {
            C3291wn c3291wn2 = fe2.f22641a;
            if (c3291wn2.f25672a) {
                ImageView imageView = be2.f22419b;
                if (imageView == null || !c3291wn2.f25673b) {
                    zA = false;
                } else {
                    zA = Un.a(imageView, c3291wn2.f25674c);
                }
            } else {
                zA = true;
            }
        }
        if (zA) {
            Jn jn2 = this.f22733a;
            if (Un.a(viewGroup, rect, jn2.f22968a, jn2.f22969b) && Un.a(viewGroup, rect, this.f22733a.f22968a, this.f22734b.f22421d)) {
                z10 = true;
            }
        }
        return z10 ? Mn.VISIBLE : Mn.HIDDEN;
    }
}
