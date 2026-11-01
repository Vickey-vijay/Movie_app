package com.fyber.inneractive.sdk.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.global.r;

/* JADX INFO: loaded from: classes9.dex */
public abstract class IFyberAdIdentifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClickListener f18526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f18535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Corner f18536k = Corner.BOTTOM_LEFT;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.a f18537l;

    public interface ClickListener {
        void a();
    }

    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public abstract void a(ViewGroup viewGroup);

    public IFyberAdIdentifier(r rVar) {
        int iIntValue;
        int iIntValue2;
        this.f18527b = 0;
        this.f18528c = 0;
        this.f18529d = 0;
        this.f18530e = 0;
        this.f18531f = 0;
        this.f18532g = null;
        this.f18533h = "";
        this.f18534i = "";
        this.f18535j = false;
        this.f18537l = com.fyber.inneractive.sdk.config.global.features.b.f15088e;
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.b bVar = (com.fyber.inneractive.sdk.config.global.features.b) rVar.a(com.fyber.inneractive.sdk.config.global.features.b.class);
            Integer numA = bVar.a("ad_identifier_text_size_w");
            this.f18527b = numA != null ? numA.intValue() : 110;
            Integer numA2 = bVar.a("ad_identifier_text_size_h");
            if (numA2 != null) {
                iIntValue = numA2.intValue();
            } else {
                iIntValue = 18;
            }
            this.f18528c = iIntValue;
            Integer numA3 = bVar.a("ad_identifier_image_size_w");
            if (numA3 != null) {
                iIntValue2 = numA3.intValue();
            } else {
                iIntValue2 = 18;
            }
            this.f18529d = iIntValue2;
            Integer numA4 = bVar.a("ad_identifier_image_size_h");
            this.f18530e = numA4 != null ? numA4.intValue() : 18;
            Integer numA5 = bVar.a("ad_identifier_text_size");
            this.f18531f = numA5 != null ? numA5.intValue() : 8;
            this.f18532g = bVar.a("ad_identifier_tint_color", "#75DCDCDC");
            this.f18537l = bVar.c();
            this.f18533h = bVar.a("ad_identifier_text", "Tap for more information");
            this.f18534i = bVar.a("ad_identifier_icon_url", null);
            this.f18535j = true;
        }
    }
}
