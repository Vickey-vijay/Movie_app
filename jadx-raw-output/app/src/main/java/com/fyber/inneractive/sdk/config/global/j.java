package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15100b;

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        boolean z10;
        boolean z11;
        if (TextUtils.isEmpty(this.f15099a)) {
            return false;
        }
        String version = InneractiveAdManager.getVersion();
        IAlog.a("%s: shouldApply - running version: %s", "j", version);
        IAlog.a("%s: shouldApply - filter version: %s", "j", this.f15099a);
        String[] strArrSplit = version.split("\\.", 4);
        String[] strArrSplit2 = this.f15099a.split("\\.", 4);
        String str = strArrSplit2[strArrSplit2.length - 1];
        if (str.equals("*")) {
            int i10 = 0;
            while (true) {
                if (i10 >= strArrSplit2.length - 1) {
                    IAlog.a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", "j");
                    z11 = false;
                    break;
                }
                if (strArrSplit.length < i10) {
                    IAlog.a("%s: shouldApplyByAsterix - running version is shorter than filter. applying", "j");
                } else if (strArrSplit[i10].equals(strArrSplit2[i10])) {
                    i10++;
                } else {
                    IAlog.a("%s: shouldApplyByAsterix - running version does not comply with filter. applying", "j");
                }
                z11 = true;
                break;
            }
            IAlog.a("%s: shouldApply - * version match: %b", "j", Boolean.valueOf(!z11));
            if (z11) {
                return this.f15100b;
            }
            return !this.f15100b;
        }
        if (!str.equals(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX)) {
            boolean zEqualsIgnoreCase = this.f15099a.equalsIgnoreCase(version);
            boolean z12 = !zEqualsIgnoreCase;
            IAlog.a("%s: shouldApply - exact version match: %b", "j", Boolean.valueOf(zEqualsIgnoreCase));
            if (z12) {
                return this.f15100b;
            }
            return !this.f15100b;
        }
        int i11 = 0;
        while (true) {
            if (i11 < strArrSplit2.length - 1) {
                if (strArrSplit.length < i11) {
                    IAlog.a("%s: shouldApplyByPlus - running version is shorter than filter. applying", "j");
                } else {
                    try {
                        int iIntValue = Integer.valueOf(strArrSplit2[i11]).intValue();
                        int iIntValue2 = Integer.valueOf(strArrSplit[i11]).intValue();
                        if (iIntValue2 > iIntValue) {
                            IAlog.a("%s: shouldApplyByPlus - running version is greater than the filter's version. no filter needed", "j");
                        } else if (iIntValue2 < iIntValue) {
                            IAlog.a("%s: shouldApplyByPlus - running version is lower than the filter's version. applying filter ", "j");
                        } else {
                            i11++;
                        }
                    } catch (NumberFormatException e10) {
                        IAlog.a("%s: shouldApplyByPlus - Error in version string! Not a number. %s", "j", e10.getMessage());
                    }
                }
                z10 = true;
                IAlog.a("%s: shouldApply - + version match: %b", "j", Boolean.valueOf(!z10));
                if (z10) {
                    return this.f15100b;
                }
                if (this.f15100b) {
                    return false;
                }
                return true;
            }
            IAlog.a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", "j");
            z10 = false;
            IAlog.a("%s: shouldApply - + version match: %b", "j", Boolean.valueOf(!z10));
            if (z10) {
                return this.f15100b;
            }
            if (this.f15100b) {
                return true;
            }
            return false;
        }
    }

    public final String toString() {
        return "sdk - " + this.f15099a + " include: " + this.f15100b;
    }

    public j(boolean z10, String str) {
        this.f15099a = str;
        this.f15100b = z10;
    }
}
