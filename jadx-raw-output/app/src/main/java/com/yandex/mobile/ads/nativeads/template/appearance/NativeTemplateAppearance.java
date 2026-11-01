package com.yandex.mobile.ads.nativeads.template.appearance;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import ck.i;
import ck.p;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import yads.kl3;
import yads.p10;
import yads.z42;

/* JADX INFO: loaded from: classes11.dex */
public final class NativeTemplateAppearance implements Parcelable, p10 {
    public static final Parcelable.Creator<NativeTemplateAppearance> CREATOR = new z42();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f51107n = Color.parseColor("#7f7f7f");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f51108o = Color.parseColor("#ffd200");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f51109p = Color.parseColor("#ffd200");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f51110q = Color.parseColor("#f4c900");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BannerAppearance f51111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextAppearance f51112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextAppearance f51113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextAppearance f51114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextAppearance f51115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextAppearance f51116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextAppearance f51117h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextAppearance f51118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageAppearance f51119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ImageAppearance f51120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ButtonAppearance f51121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RatingAppearance f51122m;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BannerAppearance f51123a = b();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private ButtonAppearance f51133k = d();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ImageAppearance f51131i = g();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private ImageAppearance f51132j = f();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private RatingAppearance f51134l = h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TextAppearance f51124b = a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextAppearance f51125c = c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextAppearance f51126d = e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private TextAppearance f51127e = i();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private TextAppearance f51128f = j();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private TextAppearance f51129g = k();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private TextAppearance f51130h = l();

        private static TextAppearance a() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f51107n).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static BannerAppearance b() {
            return new BannerAppearance.Builder().setBackgroundColor(-1).setBorderColor(kl3.a(ViewCompat.MEASURED_STATE_MASK, 90.0f)).setBorderWidth(1.0f).setContentPadding(new HorizontalOffset(10.0f, 10.0f)).setImageMargins(new HorizontalOffset(0.0f, 10.0f)).build();
        }

        private static TextAppearance c() {
            return new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ButtonAppearance d() {
            return new ButtonAppearance.Builder().setBorderColor(NativeTemplateAppearance.f51108o).setBorderWidth(1.0f).setNormalColor(-1).setPressedColor(NativeTemplateAppearance.f51109p).setTextAppearance(new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build()).build();
        }

        private static TextAppearance e() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f51107n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static ImageAppearance f() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.FIXED, 16.0f)).build();
        }

        private static ImageAppearance g() {
            return new ImageAppearance.Builder().setWidthConstraint(new SizeConstraint(SizeConstraint.SizeConstraintType.PREFERRED_RATIO, 0.3f)).build();
        }

        private static RatingAppearance h() {
            return new RatingAppearance.Builder().setBackgroundStarColor(-3355444).setProgressStarColor(NativeTemplateAppearance.f51110q).build();
        }

        private static TextAppearance i() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f51107n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance j() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f51107n).setTextSize(11.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        private static TextAppearance k() {
            return new TextAppearance.Builder().setTextColor(ViewCompat.MEASURED_STATE_MASK).setTextSize(15.0f).setFontFamilyName(null).setFontStyle(1).build();
        }

        private static TextAppearance l() {
            return new TextAppearance.Builder().setTextColor(NativeTemplateAppearance.f51107n).setTextSize(13.0f).setFontFamilyName(null).setFontStyle(0).build();
        }

        public final NativeTemplateAppearance build() {
            return new NativeTemplateAppearance(this.f51123a, this.f51124b, this.f51125c, this.f51126d, this.f51127e, this.f51128f, this.f51129g, this.f51130h, this.f51132j, this.f51131i, this.f51133k, this.f51134l, null);
        }
    }

    public /* synthetic */ NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance, i iVar) {
        this(bannerAppearance, textAppearance, textAppearance2, textAppearance3, textAppearance4, textAppearance5, textAppearance6, textAppearance7, imageAppearance, imageAppearance2, buttonAppearance, ratingAppearance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        this.f51111b.writeToParcel(parcel, i10);
        this.f51112c.writeToParcel(parcel, i10);
        this.f51113d.writeToParcel(parcel, i10);
        this.f51114e.writeToParcel(parcel, i10);
        this.f51115f.writeToParcel(parcel, i10);
        this.f51116g.writeToParcel(parcel, i10);
        this.f51117h.writeToParcel(parcel, i10);
        this.f51118i.writeToParcel(parcel, i10);
        this.f51119j.writeToParcel(parcel, i10);
        this.f51120k.writeToParcel(parcel, i10);
        this.f51121l.writeToParcel(parcel, i10);
        this.f51122m.writeToParcel(parcel, i10);
    }

    private NativeTemplateAppearance(BannerAppearance bannerAppearance, TextAppearance textAppearance, TextAppearance textAppearance2, TextAppearance textAppearance3, TextAppearance textAppearance4, TextAppearance textAppearance5, TextAppearance textAppearance6, TextAppearance textAppearance7, ImageAppearance imageAppearance, ImageAppearance imageAppearance2, ButtonAppearance buttonAppearance, RatingAppearance ratingAppearance) {
        this.f51111b = bannerAppearance;
        this.f51112c = textAppearance;
        this.f51113d = textAppearance2;
        this.f51114e = textAppearance3;
        this.f51115f = textAppearance4;
        this.f51116g = textAppearance5;
        this.f51117h = textAppearance6;
        this.f51118i = textAppearance7;
        this.f51119j = imageAppearance;
        this.f51120k = imageAppearance2;
        this.f51121l = buttonAppearance;
        this.f51122m = ratingAppearance;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.e(NativeTemplateAppearance.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance");
        NativeTemplateAppearance nativeTemplateAppearance = (NativeTemplateAppearance) obj;
        if (p.e(getBannerAppearance(), nativeTemplateAppearance.getBannerAppearance()) && p.e(getAgeAppearance(), nativeTemplateAppearance.getAgeAppearance()) && p.e(getBodyAppearance(), nativeTemplateAppearance.getBodyAppearance()) && p.e(getDomainAppearance(), nativeTemplateAppearance.getDomainAppearance()) && p.e(getReviewCountAppearance(), nativeTemplateAppearance.getReviewCountAppearance()) && p.e(getSponsoredAppearance(), nativeTemplateAppearance.getSponsoredAppearance()) && p.e(getTitleAppearance(), nativeTemplateAppearance.getTitleAppearance()) && p.e(getWarningAppearance(), nativeTemplateAppearance.getWarningAppearance()) && p.e(getFaviconAppearance(), nativeTemplateAppearance.getFaviconAppearance()) && p.e(getImageAppearance(), nativeTemplateAppearance.getImageAppearance()) && p.e(getCallToActionAppearance(), nativeTemplateAppearance.getCallToActionAppearance())) {
            return p.e(getRatingAppearance(), nativeTemplateAppearance.getRatingAppearance());
        }
        return false;
    }

    @Override // yads.p10
    public TextAppearance getAgeAppearance() {
        return this.f51112c;
    }

    @Override // yads.p10
    public BannerAppearance getBannerAppearance() {
        return this.f51111b;
    }

    @Override // yads.p10
    public TextAppearance getBodyAppearance() {
        return this.f51113d;
    }

    @Override // yads.p10
    public ButtonAppearance getCallToActionAppearance() {
        return this.f51121l;
    }

    @Override // yads.p10
    public TextAppearance getDomainAppearance() {
        return this.f51114e;
    }

    @Override // yads.p10
    public ImageAppearance getFaviconAppearance() {
        return this.f51119j;
    }

    @Override // yads.p10
    public ImageAppearance getImageAppearance() {
        return this.f51120k;
    }

    @Override // yads.p10
    public RatingAppearance getRatingAppearance() {
        return this.f51122m;
    }

    @Override // yads.p10
    public TextAppearance getReviewCountAppearance() {
        return this.f51115f;
    }

    @Override // yads.p10
    public TextAppearance getSponsoredAppearance() {
        return this.f51116g;
    }

    @Override // yads.p10
    public TextAppearance getTitleAppearance() {
        return this.f51117h;
    }

    @Override // yads.p10
    public TextAppearance getWarningAppearance() {
        return this.f51118i;
    }

    public int hashCode() {
        return getRatingAppearance().hashCode() + ((getCallToActionAppearance().hashCode() + ((getImageAppearance().hashCode() + ((getFaviconAppearance().hashCode() + ((getWarningAppearance().hashCode() + ((getTitleAppearance().hashCode() + ((getSponsoredAppearance().hashCode() + ((getReviewCountAppearance().hashCode() + ((getDomainAppearance().hashCode() + ((getBodyAppearance().hashCode() + ((getAgeAppearance().hashCode() + (getBannerAppearance().hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
