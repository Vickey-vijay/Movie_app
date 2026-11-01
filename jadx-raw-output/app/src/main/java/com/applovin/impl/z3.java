package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes2.dex */
public class z3 extends r2 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e3 f10236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f10237o;

    public z3(e3 e3Var, Context context) {
        super(r2.c.DETAIL);
        this.f10236n = e3Var;
        this.f10237o = context;
        this.f8898c = t();
        this.f8899d = s();
    }

    private SpannedString q() {
        if (!this.f10236n.z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
        }
        if (TextUtils.isEmpty(this.f10236n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f10236n.c(), ViewCompat.MEASURED_STATE_MASK));
        if (this.f10236n.A()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", m0.a(R.color.applovin_sdk_orangeColor, this.f10237o)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f10236n.k(), ViewCompat.MEASURED_STATE_MASK));
        }
        if (!this.f10236n.B()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString u() {
        if (!this.f10236n.F()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
        }
        if (!StringUtils.isValidString(this.f10236n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.f10236n.z() ? "Retrieving SDK Version..." : "SDK Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f10236n.p(), ViewCompat.MEASURED_STATE_MASK));
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.r2
    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f10237o);
    }

    @Override // com.applovin.impl.r2
    public int h() {
        int iH = this.f10236n.h();
        return iH > 0 ? iH : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.r2
    public boolean o() {
        return this.f10236n.q() != e3.a.MISSING;
    }

    public e3 r() {
        return this.f10236n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f8898c) + ", detailText=" + ((Object) this.f8899d) + ", network=" + this.f10236n + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) q());
        if (this.f10236n.q() == e3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        } else if (this.f10236n.q() == e3.a.INCOMPLETE_INTEGRATION && this.f10236n.E()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        int i10;
        if (o()) {
            i10 = ViewCompat.MEASURED_STATE_MASK;
        } else {
            i10 = -7829368;
        }
        return StringUtils.createSpannedString(this.f10236n.g(), i10, 18, 1);
    }

    @Override // com.applovin.impl.r2
    public int d() {
        if (o()) {
            return R.drawable.applovin_ic_disclosure_arrow;
        }
        return super.h();
    }
}
