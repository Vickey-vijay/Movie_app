package com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ryl.tlj;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes9.dex */
public final class lh {
    public static Set<tlj> ouw(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        tlj tljVarOuw;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (VastTagName.VERIFICATION.equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(yu.f13018ra, "vendor");
                    String strOuw = null;
                    String strOuw2 = null;
                    String strOuw3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !VastTagName.VERIFICATION.equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.hashCode();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(yu.f13018ra, "event"))) {
                                            break;
                                        } else {
                                            strOuw3 = yu.ouw(xmlPullParser, VastTagName.TRACKING);
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(yu.f13018ra, VastAttributes.API_FRAMEWORK))) {
                                            break;
                                        } else {
                                            strOuw = yu.ouw(xmlPullParser, VastTagName.JAVA_SCRIPT_RESOURCE);
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strOuw2 = yu.ouw(xmlPullParser, VastTagName.VERIFICATION_PARAMETERS);
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strOuw) && (tljVarOuw = tlj.ouw(strOuw, attributeValue, strOuw2, strOuw3)) != null) {
                            hashSet.add(tljVarOuw);
                        }
                    }
                } else {
                    yu.ouw(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
