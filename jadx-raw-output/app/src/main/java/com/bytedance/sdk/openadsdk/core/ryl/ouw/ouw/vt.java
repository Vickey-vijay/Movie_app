package com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public final class vt {
    public static double ouw(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String[] strArrSplit = yu.ouw(xmlPullParser, VastTagName.DURATION).split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(strArrSplit[0].trim()) * 60 * 60) + (Integer.parseInt(strArrSplit[1].trim()) * 60) + Float.parseFloat(strArrSplit[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static void ouw(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.ryl.yu yuVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(VastTagName.TRACKING_EVENTS)) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (VastTagName.TRACKING.equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(yu.f13018ra, "event");
                    if (TextUtils.isEmpty(attributeValue)) {
                        yu.vt(xmlPullParser, VastTagName.TRACKING);
                    } else {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "midpoint":
                                yuVar.ouw(yu.ouw(xmlPullParser, VastTagName.TRACKING), 0.5f);
                                break;
                            case "thirdQuartile":
                                yuVar.ouw(yu.ouw(xmlPullParser, VastTagName.TRACKING), 0.75f);
                                break;
                            case "resume":
                                yuVar.lh(yu.ouw(xmlPullParser, VastTagName.TRACKING, true));
                                break;
                            case "unmute":
                                yuVar.cf(yu.ouw(xmlPullParser, VastTagName.TRACKING, true));
                                break;
                            case "complete":
                                yuVar.yu(yu.ouw(xmlPullParser, VastTagName.TRACKING, false));
                                break;
                            case "mute":
                                yuVar.tlj(yu.ouw(xmlPullParser, VastTagName.TRACKING, true));
                                break;
                            case "skip":
                                yuVar.le(yu.ouw(xmlPullParser, VastTagName.TRACKING, false));
                                break;
                            case "close":
                                yuVar.fkw(yu.ouw(xmlPullParser, VastTagName.TRACKING, false));
                                break;
                            case "pause":
                                yuVar.vt(yu.ouw(xmlPullParser, VastTagName.TRACKING, true));
                                break;
                            case "start":
                            case "creativeView":
                                String strOuw = yu.ouw(xmlPullParser, VastTagName.TRACKING);
                                if (!TextUtils.isEmpty(strOuw)) {
                                    yuVar.pno(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.ryl.vt.ouw.C0135ouw(strOuw, 0L).ouw()));
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "firstQuartile":
                                yuVar.ouw(yu.ouw(xmlPullParser, VastTagName.TRACKING), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    yu.ouw(xmlPullParser);
                }
            }
        }
    }
}
