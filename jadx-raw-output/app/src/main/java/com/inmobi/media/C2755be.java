package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeImage;
import com.inmobi.media.ads.nativeAd.MediaView;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2755be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InMobiNativeImage f24063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f24065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Float f24067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f24068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MediaView f24069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f24070j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2755be)) {
            return false;
        }
        C2755be c2755be = (C2755be) obj;
        return ck.p.e(this.f24061a, c2755be.f24061a) && ck.p.e(this.f24062b, c2755be.f24062b) && ck.p.e(this.f24063c, c2755be.f24063c) && ck.p.e(this.f24064d, c2755be.f24064d) && ck.p.e(this.f24065e, c2755be.f24065e) && ck.p.e(this.f24066f, c2755be.f24066f) && ck.p.e(this.f24067g, c2755be.f24067g) && this.f24068h == c2755be.f24068h && ck.p.e(this.f24069i, c2755be.f24069i) && ck.p.e(this.f24070j, c2755be.f24070j);
    }

    public C2755be(String str, String str2, InMobiNativeImage inMobiNativeImage, String str3, JSONObject jSONObject, String str4, Float f10, boolean z10, MediaView mediaView, View view) {
        ck.p.j(inMobiNativeImage, "iconImage");
        ck.p.j(jSONObject, "extras");
        this.f24061a = str;
        this.f24062b = str2;
        this.f24063c = inMobiNativeImage;
        this.f24064d = str3;
        this.f24065e = jSONObject;
        this.f24066f = str4;
        this.f24067g = f10;
        this.f24068h = z10;
        this.f24069i = mediaView;
        this.f24070j = view;
    }

    public final int hashCode() {
        String str = this.f24061a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f24062b;
        int iHashCode2 = (this.f24063c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f24064d;
        int iHashCode3 = (this.f24065e.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f24066f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f10 = this.f24067g;
        int iHashCode5 = (Boolean.hashCode(this.f24068h) + ((iHashCode4 + (f10 == null ? 0 : f10.hashCode())) * 31)) * 31;
        MediaView mediaView = this.f24069i;
        int iHashCode6 = (iHashCode5 + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f24070j;
        return iHashCode6 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "NativePubData(title=" + this.f24061a + ", description=" + this.f24062b + ", iconImage=" + this.f24063c + ", ctaText=" + this.f24064d + ", extras=" + this.f24065e + ", sponsored=" + this.f24066f + ", adRating=" + this.f24067g + ", isVideo=" + this.f24068h + ", mediaView=" + this.f24069i + ", adChoiceIcon=" + this.f24070j + ")";
    }
}
