package com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x011c. Please report as an issue. */
    public static com.bytedance.sdk.openadsdk.core.ryl.lh ouw(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        char c10;
        byte b10;
        yu.ouw ouwVar;
        int i10;
        if (context == null) {
            yu.ouw(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        int i13 = (int) (i11 / f10);
        int i14 = (int) (i12 / f10);
        float f11 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.ryl.lh lhVar = null;
        while (true) {
            int i15 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(VastTagName.COMPANION_ADS)) {
                return lhVar;
            }
            xmlPullParser.next();
            int i16 = 2;
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                String str = VastTagName.COMPANION;
                if (name.equals(VastTagName.COMPANION)) {
                    String str2 = yu.f13018ra;
                    int iVt = yu.vt(xmlPullParser.getAttributeValue(str2, "width"));
                    int iVt2 = yu.vt(xmlPullParser.getAttributeValue(str2, "height"));
                    if (iVt < 300 || iVt2 < 250) {
                        yu.ouw(xmlPullParser);
                        lhVar = lhVar;
                        i14 = i14;
                    } else {
                        yu.ouw ouwVar2 = new yu.ouw();
                        while (true) {
                            if (xmlPullParser.getEventType() != i15 || !xmlPullParser.getName().equals(str)) {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i16) {
                                    String name2 = xmlPullParser.getName();
                                    name2.hashCode();
                                    lhVar = lhVar;
                                    str = str;
                                    switch (name2.hashCode()) {
                                        case -375340334:
                                            if (!name2.equals(VastTagName.I_FRAME_RESOURCE)) {
                                                b10 = -1;
                                            } else {
                                                c10 = 0;
                                                b10 = c10;
                                            }
                                            break;
                                        case -348198615:
                                            if (!name2.equals(VastTagName.COMPANION_CLICK_THROUGH)) {
                                                b10 = -1;
                                            } else {
                                                c10 = 1;
                                                b10 = c10;
                                            }
                                            break;
                                        case 611554000:
                                            if (!name2.equals(VastTagName.TRACKING_EVENTS)) {
                                                b10 = -1;
                                            } else {
                                                b10 = 2;
                                            }
                                            break;
                                        case 676623548:
                                            if (!name2.equals(VastTagName.STATIC_RESOURCE)) {
                                                b10 = -1;
                                            } else {
                                                b10 = 3;
                                            }
                                            break;
                                        case 1877773523:
                                            if (!name2.equals(VastTagName.COMPANION_CLICK_TRACKING)) {
                                                b10 = -1;
                                            } else {
                                                c10 = 4;
                                                b10 = c10;
                                            }
                                            break;
                                        case 1928285401:
                                            if (!name2.equals(VastTagName.HTML_RESOURCE)) {
                                                b10 = -1;
                                            } else {
                                                c10 = 5;
                                                b10 = c10;
                                            }
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    switch (b10) {
                                        case 0:
                                            i10 = i14;
                                            yu.ouw ouwVar3 = ouwVar2;
                                            int i17 = iVt2;
                                            int i18 = iVt;
                                            i15 = 3;
                                            Point pointOuw = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw(context, i18, i17, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.HTML_RESOURCE);
                                            int i19 = pointOuw.x;
                                            int i20 = pointOuw.y;
                                            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt vtVar = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.IFRAME_RESOURCE;
                                            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.NONE;
                                            float fOuw = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw(i13, i10, i19, i20, vtVar, enumC0133ouw);
                                            String strOuw = yu.ouw(xmlPullParser, VastTagName.I_FRAME_RESOURCE);
                                            if (TextUtils.isEmpty(strOuw) || fOuw <= ouwVar3.f13021ra || fOuw <= f11) {
                                                yu.vt(xmlPullParser, VastTagName.I_FRAME_RESOURCE);
                                            } else {
                                                ouwVar3.f13021ra = fOuw;
                                                ouwVar3.ouw(strOuw, enumC0133ouw, vtVar);
                                            }
                                            iVt2 = i17;
                                            ouwVar2 = ouwVar3;
                                            iVt = i18;
                                            i16 = 2;
                                            lhVar = lhVar;
                                            str = str;
                                            i14 = i10;
                                            break;
                                        case 1:
                                            i10 = i14;
                                            i15 = 3;
                                            ouwVar2.yu = yu.ouw(xmlPullParser, VastTagName.COMPANION_CLICK_THROUGH);
                                            i16 = 2;
                                            iVt = iVt;
                                            lhVar = lhVar;
                                            str = str;
                                            i14 = i10;
                                            break;
                                        case 2:
                                            ouwVar = ouwVar2;
                                            while (true) {
                                                i15 = 3;
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(VastTagName.TRACKING_EVENTS)) {
                                                    iVt2 = iVt2;
                                                    iVt = iVt;
                                                    ouwVar2 = ouwVar;
                                                    lhVar = lhVar;
                                                    str = str;
                                                    i14 = i14;
                                                    i16 = 2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(VastTagName.TRACKING)) {
                                                    ouwVar.f13019le.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(yu.ouw(xmlPullParser, VastTagName.TRACKING)).ouw());
                                                }
                                            }
                                            break;
                                        case 3:
                                            yu.ouw ouwVar4 = ouwVar2;
                                            int i21 = iVt2;
                                            int i22 = iVt;
                                            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(yu.f13018ra, "creativeType").toLowerCase();
                                            Set<String> set = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw;
                                            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw3 = set.contains(lowerCase) ? com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.IMAGE : com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.JAVASCRIPT;
                                            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt vtVar2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.STATIC_RESOURCE;
                                            Point pointOuw2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw(context, i22, i21, vtVar2);
                                            int i23 = i14;
                                            float fOuw2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw(i13, i14, pointOuw2.x, pointOuw2.y, vtVar2, enumC0133ouw3);
                                            String strOuw2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.contains(lowerCase)) ? yu.ouw(xmlPullParser, VastTagName.STATIC_RESOURCE) : null;
                                            if (fOuw2 < ouwVar4.f13021ra || fOuw2 <= f11 || TextUtils.isEmpty(strOuw2)) {
                                                yu.vt(xmlPullParser, VastTagName.STATIC_RESOURCE);
                                            } else {
                                                ouwVar4.f13021ra = fOuw2;
                                                ouwVar4.ouw(strOuw2, enumC0133ouw3, vtVar2);
                                            }
                                            iVt2 = i21;
                                            iVt = i22;
                                            ouwVar2 = ouwVar4;
                                            i14 = i23;
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                        case 4:
                                            ouwVar2.fkw.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(yu.ouw(xmlPullParser, VastTagName.COMPANION_CLICK_TRACKING)).ouw());
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                        case 5:
                                            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt vtVar3 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.HTML_RESOURCE;
                                            Point pointOuw3 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw(context, iVt, iVt2, vtVar3);
                                            int i24 = pointOuw3.x;
                                            int i25 = pointOuw3.y;
                                            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw4 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.NONE;
                                            yu.ouw ouwVar5 = ouwVar2;
                                            int i26 = iVt2;
                                            int i27 = iVt;
                                            float fOuw3 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw(i13, i14, i24, i25, vtVar3, enumC0133ouw4);
                                            String strOuw3 = yu.ouw(xmlPullParser, VastTagName.HTML_RESOURCE);
                                            if (TextUtils.isEmpty(strOuw3) || fOuw3 <= ouwVar5.f13021ra || fOuw3 <= f11) {
                                                yu.vt(xmlPullParser, VastTagName.HTML_RESOURCE);
                                            } else {
                                                ouwVar5.f13021ra = fOuw3;
                                                ouwVar5.ouw(strOuw3, enumC0133ouw4, vtVar3);
                                            }
                                            iVt = i27;
                                            ouwVar2 = ouwVar5;
                                            iVt2 = i26;
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                        default:
                                            yu.ouw(xmlPullParser);
                                            ouwVar = ouwVar2;
                                            i15 = 3;
                                            iVt2 = iVt2;
                                            iVt = iVt;
                                            ouwVar2 = ouwVar;
                                            lhVar = lhVar;
                                            str = str;
                                            i14 = i14;
                                            i16 = 2;
                                            break;
                                    }
                                }
                            } else if (!TextUtils.isEmpty(ouwVar2.ouw) && ouwVar2.f13021ra >= f11) {
                                lhVar = new com.bytedance.sdk.openadsdk.core.ryl.lh(iVt, iVt2, ouwVar2.vt, ouwVar2.f13020lh, ouwVar2.ouw, ouwVar2.fkw, ouwVar2.f13019le, ouwVar2.yu);
                                f11 = ouwVar2.f13021ra;
                            }
                        }
                    }
                }
            }
            lhVar = lhVar;
            i14 = i14;
        }
    }
}
