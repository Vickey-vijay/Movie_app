package io.bidmachine.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Z7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class IabElementStyle implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f59359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f59360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f59361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f59362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f59363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f59364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f59365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f59366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Float f59367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f59368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f59369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f59370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f59371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f59372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f59373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f59374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f59375q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f59376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Float f59377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Float f59378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Float f59379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f59380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Float f59381w;

    public IabElementStyle() {
    }

    public void applyAlignment(@NonNull FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = positionAsGravity();
    }

    public void applyMargin(@NonNull Context context, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = getMarginLeft(context).intValue();
        marginLayoutParams.topMargin = getMarginTop(context).intValue();
        marginLayoutParams.rightMargin = getMarginRight(context).intValue();
        marginLayoutParams.bottomMargin = getMarginBottom(context).intValue();
    }

    public void applyPadding(@NonNull Context context, @NonNull View view) {
        view.setPadding(getPaddingLeft(context).intValue(), getPaddingTop(context).intValue(), getPaddingRight(context).intValue(), getPaddingBottom(context).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 != 17) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyRelativeAlignment(@androidx.annotation.NonNull android.widget.RelativeLayout.LayoutParams r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.getHorizontalPosition()
            int r0 = r0.intValue()
            r1 = 17
            r2 = 1
            if (r0 == r2) goto L1c
            r2 = 3
            if (r0 == r2) goto L19
            r2 = 5
            if (r0 == r2) goto L16
            if (r0 == r1) goto L1c
            goto L21
        L16:
            r0 = 11
            goto L1e
        L19:
            r0 = 9
            goto L1e
        L1c:
            r0 = 14
        L1e:
            r4.addRule(r0)
        L21:
            java.lang.Integer r0 = r3.getVerticalPosition()
            int r0 = r0.intValue()
            r2 = 16
            if (r0 == r2) goto L3e
            if (r0 == r1) goto L3e
            r1 = 48
            if (r0 == r1) goto L3b
            r1 = 80
            if (r0 == r1) goto L38
            goto L43
        L38:
            r0 = 12
            goto L40
        L3b:
            r0 = 10
            goto L40
        L3e:
            r0 = 15
        L40:
            r4.addRule(r0)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.iab.utils.IabElementStyle.applyRelativeAlignment(android.widget.RelativeLayout$LayoutParams):void");
    }

    @NonNull
    public IabElementStyle copyWith(@Nullable IabElementStyle iabElementStyle) {
        IabElementStyle iabElementStyle2 = new IabElementStyle();
        iabElementStyle2.merge(this);
        iabElementStyle2.merge(iabElementStyle);
        return iabElementStyle2;
    }

    @Nullable
    public String getContent() {
        return this.f59376r;
    }

    @NonNull
    public Integer getFillColor() {
        Integer num = this.f59360b;
        return num != null ? num : Integer.valueOf(Assets.BACKGROUND_COLOR);
    }

    @NonNull
    public Float getFontSize(@NonNull Context context) {
        Float f10 = this.f59381w;
        return Float.valueOf(Utils.dpToPx(context, f10 != null ? f10.floatValue() : 16.0f));
    }

    @NonNull
    public Integer getFontStyle() {
        Integer num = this.f59380v;
        if (num != null) {
            return num;
        }
        return 0;
    }

    @NonNull
    public Integer getHeight(@NonNull Context context) {
        int iIntValue;
        Float f10 = this.f59379u;
        if (f10 != null) {
            iIntValue = (f10.floatValue() == -1.0f || this.f59379u.floatValue() == -2.0f) ? this.f59379u.intValue() : Utils.dpToPx(context, this.f59379u.floatValue());
        } else {
            iIntValue = -2;
        }
        return Integer.valueOf(iIntValue);
    }

    @Nullable
    public Float getHideAfter() {
        return this.f59367i;
    }

    @NonNull
    public Integer getHorizontalPosition() {
        Integer num = this.f59363e;
        if (num != null) {
            return num;
        }
        return 3;
    }

    @NonNull
    public Integer getMarginBottom(@NonNull Context context) {
        Integer num = this.f59375q;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    @NonNull
    public Integer getMarginLeft(@NonNull Context context) {
        Integer num = this.f59372n;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    @NonNull
    public Integer getMarginRight(@NonNull Context context) {
        Integer num = this.f59374p;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    @NonNull
    public Integer getMarginTop(@NonNull Context context) {
        Integer num = this.f59373o;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    @NonNull
    public Float getOpacity() {
        Float f10 = this.f59366h;
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @NonNull
    public Integer getPaddingBottom(@NonNull Context context) {
        Integer num = this.f59371m;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    @NonNull
    public Integer getPaddingLeft(@NonNull Context context) {
        Integer num = this.f59368j;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    @NonNull
    public Integer getPaddingRight(@NonNull Context context) {
        Integer num = this.f59369k;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    @NonNull
    public Integer getPaddingTop(@NonNull Context context) {
        Integer num = this.f59370l;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, num.intValue()) : 0);
    }

    @NonNull
    public Integer getStrokeColor() {
        Integer num = this.f59359a;
        return num != null ? num : Integer.valueOf(Assets.MAIN_ASSETS_COLOR);
    }

    @NonNull
    public Float getStrokeWidth(@NonNull Context context) {
        Float f10 = this.f59377s;
        return Float.valueOf(f10 != null ? Utils.dpToPx(context, f10.floatValue()) : 0.0f);
    }

    @Nullable
    public String getStyle() {
        return this.f59365g;
    }

    @NonNull
    public Integer getVerticalPosition() {
        Integer num = this.f59364f;
        if (num != null) {
            return num;
        }
        return 48;
    }

    @NonNull
    public Integer getWidth(@NonNull Context context) {
        int iIntValue;
        Float f10 = this.f59378t;
        if (f10 != null) {
            iIntValue = (f10.floatValue() == -1.0f || this.f59378t.floatValue() == -2.0f) ? this.f59378t.intValue() : Utils.dpToPx(context, this.f59378t.floatValue());
        } else {
            iIntValue = -2;
        }
        return Integer.valueOf(iIntValue);
    }

    public boolean hasFillColor() {
        return this.f59360b != null;
    }

    public boolean hasStrokeColor() {
        return this.f59359a != null;
    }

    @NonNull
    public Boolean isOutlined() {
        Boolean bool = this.f59361c;
        return bool != null ? bool : Boolean.FALSE;
    }

    @NonNull
    public Boolean isVisible() {
        Boolean bool = this.f59362d;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void merge(@Nullable IabElementStyle iabElementStyle) {
        if (iabElementStyle == null) {
            return;
        }
        Integer num = iabElementStyle.f59359a;
        if (num != null) {
            this.f59359a = num;
        }
        Integer num2 = iabElementStyle.f59360b;
        if (num2 != null) {
            this.f59360b = num2;
        }
        Boolean bool = iabElementStyle.f59361c;
        if (bool != null) {
            this.f59361c = bool;
        }
        Boolean bool2 = iabElementStyle.f59362d;
        if (bool2 != null) {
            this.f59362d = bool2;
        }
        Integer num3 = iabElementStyle.f59363e;
        if (num3 != null) {
            this.f59363e = num3;
        }
        Integer num4 = iabElementStyle.f59364f;
        if (num4 != null) {
            this.f59364f = num4;
        }
        String str = iabElementStyle.f59365g;
        if (str != null) {
            this.f59365g = str;
        }
        Float f10 = iabElementStyle.f59366h;
        if (f10 != null) {
            this.f59366h = f10;
        }
        Float f11 = iabElementStyle.f59367i;
        if (f11 != null) {
            this.f59367i = f11;
        }
        Integer num5 = iabElementStyle.f59368j;
        if (num5 != null) {
            this.f59368j = num5;
        }
        Integer num6 = iabElementStyle.f59369k;
        if (num6 != null) {
            this.f59369k = num6;
        }
        Integer num7 = iabElementStyle.f59370l;
        if (num7 != null) {
            this.f59370l = num7;
        }
        Integer num8 = iabElementStyle.f59371m;
        if (num8 != null) {
            this.f59371m = num8;
        }
        Integer num9 = iabElementStyle.f59372n;
        if (num9 != null) {
            this.f59372n = num9;
        }
        Integer num10 = iabElementStyle.f59374p;
        if (num10 != null) {
            this.f59374p = num10;
        }
        Integer num11 = iabElementStyle.f59373o;
        if (num11 != null) {
            this.f59373o = num11;
        }
        Integer num12 = iabElementStyle.f59375q;
        if (num12 != null) {
            this.f59375q = num12;
        }
        String str2 = iabElementStyle.f59376r;
        if (str2 != null) {
            this.f59376r = str2;
        }
        Float f12 = iabElementStyle.f59377s;
        if (f12 != null) {
            this.f59377s = f12;
        }
        Float f13 = iabElementStyle.f59378t;
        if (f13 != null) {
            this.f59378t = f13;
        }
        Float f14 = iabElementStyle.f59379u;
        if (f14 != null) {
            this.f59379u = f14;
        }
        Integer num13 = iabElementStyle.f59380v;
        if (num13 != null) {
            this.f59380v = num13;
        }
        Float f15 = iabElementStyle.f59381w;
        if (f15 != null) {
            this.f59381w = f15;
        }
    }

    public int positionAsGravity() {
        return getVerticalPosition().intValue() | getHorizontalPosition().intValue();
    }

    public void setContent(@Nullable String str) {
        this.f59376r = str;
    }

    public void setFillColor(@Nullable Integer num) {
        this.f59360b = num;
    }

    public void setFontSize(@Nullable Float f10) {
        this.f59381w = f10;
    }

    public void setFontStyle(@Nullable Integer num) {
        this.f59380v = num;
    }

    public void setHeight(@Nullable Number number) {
        this.f59379u = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public void setHideAfter(@Nullable Float f10) {
        this.f59367i = f10;
    }

    public void setHorizontalPosition(@Nullable Integer num) {
        this.f59363e = num;
    }

    public void setMargin(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.f59372n = num;
        this.f59373o = num2;
        this.f59374p = num3;
        this.f59375q = num4;
    }

    public void setMarginBottom(@Nullable Integer num) {
        this.f59375q = num;
    }

    public void setMarginLeft(@Nullable Integer num) {
        this.f59372n = num;
    }

    public void setMarginRight(@Nullable Integer num) {
        this.f59374p = num;
    }

    public void setMarginTop(@Nullable Integer num) {
        this.f59373o = num;
    }

    public void setOpacity(@Nullable Float f10) {
        this.f59366h = f10;
    }

    public void setOutlined(@Nullable Boolean bool) {
        this.f59361c = bool;
    }

    public void setPadding(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.f59368j = num;
        this.f59370l = num2;
        this.f59369k = num3;
        this.f59371m = num4;
    }

    public void setPaddingBottom(@Nullable Integer num) {
        this.f59371m = num;
    }

    public void setPaddingLeft(@Nullable Integer num) {
        this.f59368j = num;
    }

    public void setPaddingRight(@Nullable Integer num) {
        this.f59369k = num;
    }

    public void setPaddingTop(@Nullable Integer num) {
        this.f59370l = num;
    }

    public void setStrokeColor(@Nullable Integer num) {
        this.f59359a = num;
    }

    public void setStrokeWidth(@Nullable Float f10) {
        this.f59377s = f10;
    }

    public void setStyle(@Nullable String str) {
        this.f59365g = str;
    }

    public void setVerticalPosition(@Nullable Integer num) {
        this.f59364f = num;
    }

    public void setVisible(@Nullable Boolean bool) {
        this.f59362d = bool;
    }

    public void setWidth(@Nullable Number number) {
        this.f59378t = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public void setMargin(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            setMargin(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(Z7.f27998r);
        if (strArrSplit.length == 1) {
            int iIntValue = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            setMargin(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            int iIntValue3 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
            setMargin(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
                int iIntValue5 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
                setMargin(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                setMargin(Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
            }
        }
    }

    public void setPadding(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            setPadding(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(Z7.f27998r);
        if (strArrSplit.length == 1) {
            int iIntValue = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            setPadding(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            int iIntValue3 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
            setPadding(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
                int iIntValue5 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
                setPadding(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                setPadding(Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
            }
        }
    }

    public IabElementStyle(@Nullable IabElementStyle iabElementStyle) {
        merge(iabElementStyle);
    }
}
