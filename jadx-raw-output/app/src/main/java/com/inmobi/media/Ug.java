package com.inmobi.media;

import android.view.View;
import android.widget.ImageView;
import com.inmobi.media.Ug;

/* JADX INFO: loaded from: classes7.dex */
public final class Ug {
    public static void a(Sg sg2, final bk.l lVar) {
        ck.p.j(sg2, "publisherNativeViewData");
        ck.p.j(lVar, "onClick");
        sg2.f23523a.getParentView$media_release().setOnClickListener(new View.OnClickListener() { // from class: b7.n4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ug.a(lVar, view);
            }
        });
        View titleView$media_release = sg2.f23523a.getTitleView$media_release();
        if (titleView$media_release != null) {
            titleView$media_release.setOnClickListener(new View.OnClickListener() { // from class: b7.o4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.b(lVar, view);
                }
            });
        }
        View descriptionView$media_release = sg2.f23523a.getDescriptionView$media_release();
        if (descriptionView$media_release != null) {
            descriptionView$media_release.setOnClickListener(new View.OnClickListener() { // from class: b7.p4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.c(lVar, view);
                }
            });
        }
        ImageView iconView$media_release = sg2.f23523a.getIconView$media_release();
        if (iconView$media_release != null) {
            iconView$media_release.setOnClickListener(new View.OnClickListener() { // from class: b7.q4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.d(lVar, view);
                }
            });
        }
        View ctaView$media_release = sg2.f23523a.getCtaView$media_release();
        if (ctaView$media_release != null) {
            ctaView$media_release.setOnClickListener(new View.OnClickListener() { // from class: b7.r4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.e(lVar, view);
                }
            });
        }
        View advertiserView$media_release = sg2.f23523a.getAdvertiserView$media_release();
        if (advertiserView$media_release != null) {
            advertiserView$media_release.setOnClickListener(new View.OnClickListener() { // from class: b7.s4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.f(lVar, view);
                }
            });
        }
        View ratingView$media_release = sg2.f23523a.getRatingView$media_release();
        if (ratingView$media_release != null) {
            ratingView$media_release.setOnClickListener(new View.OnClickListener() { // from class: b7.t4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.g(lVar, view);
                }
            });
        }
        View view = sg2.f23525c;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: b7.u4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ug.h(lVar, view2);
                }
            });
        }
    }

    public static final void b(bk.l lVar, View view) {
        lVar.invoke((short) 3);
    }

    public static final void c(bk.l lVar, View view) {
        lVar.invoke((short) 4);
    }

    public static final void d(bk.l lVar, View view) {
        lVar.invoke((short) 5);
    }

    public static final void e(bk.l lVar, View view) {
        lVar.invoke((short) 6);
    }

    public static final void h(bk.l lVar, View view) {
        lVar.invoke((short) 7);
    }

    public static final void f(bk.l lVar, View view) {
        lVar.invoke((short) 9);
    }

    public static final void g(bk.l lVar, View view) {
        lVar.invoke((short) 8);
    }

    public static final void a(bk.l lVar, View view) {
        lVar.invoke((short) 2);
    }
}
