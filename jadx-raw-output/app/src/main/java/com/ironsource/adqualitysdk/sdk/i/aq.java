package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class aq extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f357 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f358 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f359 = 68;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final String f360;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m481() {
        int i10 = f358 + 43;
        f357 = i10 % 128;
        int i11 = i10 % 2;
        String strOptString = m517().optString(m479("\uffff\ufffe\u0003", TextUtils.getOffsetAfter("", 0) + 3, false, 3 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION).intern(), this.f360);
        int i12 = f358 + 17;
        f357 = i12 % 128;
        int i13 = i12 % 2;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m478() {
        int i10 = f357 + 23;
        f358 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            JSONObject jSONObjectOptJSONObject = m517().optJSONObject(m479("\u0002\u0002\u0003\ufff7\u0007\u0006\u0003\b\ufff7\ufff9", Process.getGidForName("") + 43, true, 2 >>> TextUtils.indexOf("", ""), 9537 - (ViewConfiguration.getKeyRepeatDelay() / 17)).intern());
            if (jSONObjectOptJSONObject != null) {
                return jSONObjectOptJSONObject;
            }
        } else {
            JSONObject jSONObjectOptJSONObject2 = m517().optJSONObject(m479("\u0002\u0002\u0003\ufff7\u0007\u0006\u0003\b\ufff7\ufff9", Process.getGidForName("") + 11, true, 4 - TextUtils.indexOf("", ""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 176).intern());
            if (jSONObjectOptJSONObject2 != null) {
                return jSONObjectOptJSONObject2;
            }
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        int i11 = f358 + 51;
        f357 = i11 % 128;
        int i12 = i11 % 2;
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m479(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            char[] cArr2 = new char[i10];
            b.f704 = 0;
            while (true) {
                int i13 = b.f704;
                if (i13 >= i10) {
                    break;
                }
                b.f705 = cArr[i13];
                cArr2[b.f704] = (char) (b.f705 + i12);
                int i14 = b.f704;
                cArr2[i14] = (char) (cArr2[i14] - f359);
                b.f704 = i14 + 1;
            }
            if (i11 > 0) {
                b.f707 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f707;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f707;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i17 = b.f704;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f704 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m480() {
        int i10 = f357 + 79;
        f358 = i10 % 128;
        int i11 = i10 % 2;
        boolean zHas = m517().has(m479("\u0002\u0002\u0003\ufff7\u0007\u0006\u0003\b\ufff7\ufff9", (ViewConfiguration.getLongPressTimeout() >> 16) + 10, true, View.MeasureSpec.getSize(0) + 4, 175 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
        int i12 = f357 + 51;
        f358 = i12 % 128;
        if ((i12 % 2 != 0 ? '1' : 'c') == 'c') {
            return zHas;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m482(String str) {
        int i10 = f357 + 45;
        f358 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectOptJSONObject = m478().optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            int i12 = f358 + 61;
            f357 = i12 % 128;
            int i13 = i12 % 2;
            return jSONObjectOptJSONObject.optString(m479("\u0003\u0003\ufffa\ufff8\t\u0004\u0007￫\ufffa\u0007\b\ufffe\u0004\u0003\ufff8\u0004", TextUtils.indexOf("", "", 0, 0) + 16, false, 14 - TextUtils.indexOf("", ""), KeyEvent.normalizeMetaState(0) + HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION).intern());
        }
        int i14 = f358 + 75;
        f357 = i14 % 128;
        if ((i14 % 2 == 0 ? (char) 18 : '%') == '%') {
            return null;
        }
        throw null;
    }

    public aq(ax axVar) {
        m479("\u0002\u0002\u0003\ufff7\u0007\u0006\u0003\b\ufff7\ufff9", 10 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, 176 - (ViewConfiguration.getScrollBarSize() >> 8)).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m479("\u0000", -TextUtils.indexOf((CharSequence) "", '0'), false, 1 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 184).intern());
        sb2.append(UUID.randomUUID().toString().replace(m479("\u0000", -ImageFormat.getBitsPerPixel(0), false, -ImageFormat.getBitsPerPixel(0), 161 - AndroidCharacter.getMirror('0')).intern(), ""));
        this.f360 = sb2.toString();
        m520(axVar);
    }
}
