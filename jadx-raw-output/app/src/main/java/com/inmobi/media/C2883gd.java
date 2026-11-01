package com.inmobi.media;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: renamed from: com.inmobi.media.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2883gd implements Nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jn f24422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Be f24423b;

    public C2883gd(Jn jn2, Be be2) {
        ck.p.j(jn2, "viewableConfig");
        ck.p.j(be2, "nativeViewabilityViewHolder");
        this.f24422a = jn2;
        this.f24423b = be2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    @Override // com.inmobi.media.Nn
    public final Mn a() {
        boolean z10;
        boolean z11;
        Jn jn2;
        ViewGroup viewGroup = this.f24423b.f22418a;
        Rect rect = new Rect();
        if (!viewGroup.getGlobalVisibleRect(rect)) {
            return Mn.HIDDEN;
        }
        Be be2 = this.f24423b;
        Fe fe2 = be2.f22422e;
        if (fe2.f22642b.f25672a || fe2.f22641a.f25672a) {
            C3291wn c3291wn = fe2.f22641a;
            ImageView imageView = be2.f22419b;
            if (c3291wn.f25672a) {
                if ((imageView == null || !c3291wn.f25673b) ? false : Un.a(imageView, c3291wn.f25674c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z10) {
                jn2 = this.f24422a;
                if (Un.a(viewGroup, rect, jn2.f22968a, jn2.f22969b)) {
                    return Mn.VISIBLE;
                }
            } else {
                C3291wn c3291wn2 = fe2.f22642b;
                MediaView mediaView = this.f24423b.f22420c;
                if (c3291wn2.f25672a) {
                    z11 = (mediaView == null || !c3291wn2.f25673b) ? false : Un.a(mediaView, c3291wn2.f25674c);
                }
                if (z11) {
                    jn2 = this.f24422a;
                    if (Un.a(viewGroup, rect, jn2.f22968a, jn2.f22969b) && Un.a(viewGroup, rect, this.f24422a.f22968a, this.f24423b.f22421d)) {
                        return Mn.VISIBLE;
                    }
                }
            }
        } else {
            jn2 = this.f24422a;
            if (Un.a(viewGroup, rect, jn2.f22968a, jn2.f22969b)) {
                return Mn.VISIBLE;
            }
        }
        return Mn.HIDDEN;
    }
}
