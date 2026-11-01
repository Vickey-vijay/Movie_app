package io.bidmachine.iab.vast.tags;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.metadata.a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.vast.VastLog;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes11.dex */
public class VastXmlTag implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f59689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f59690b;

    public VastXmlTag() {
    }

    public static Integer c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e10) {
            VastLog.e("VastXmlTag", e10.getMessage(), new Object[0]);
            return null;
        }
    }

    private boolean d(String str) {
        for (String str2 : getSupportedAttributes()) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static int e(String str) {
        if (str == null) {
            return -1;
        }
        int iIndexOf = str.indexOf(".");
        if (iIndexOf > 0) {
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length <= 2) {
            return -1;
        }
        try {
            return (Integer.parseInt(strArrSplit[0]) * 3600) + (Integer.parseInt(strArrSplit[1]) * 60) + Integer.parseInt(strArrSplit[2]);
        } catch (Exception e10) {
            VastLog.e("VastXmlTag", e10);
            return -1;
        }
    }

    public static int f(String str) {
        if (str == null) {
            return -1;
        }
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length <= 1) {
            return -1;
        }
        try {
            return (Integer.parseInt(strArrSplit[0]) * 60) + Integer.parseInt(strArrSplit[1]);
        } catch (Exception e10) {
            VastLog.e("VastXmlTag", e10);
            return -1;
        }
    }

    public static Integer g(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        if (lowerCase.equals(C3426d4.i.D)) {
            i10 = 1;
        } else {
            if (!lowerCase.equals(C3426d4.i.C)) {
                return null;
            }
            i10 = 2;
        }
        return Integer.valueOf(i10);
    }

    public static Integer h(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return 1;
            case "left":
                i10 = 3;
                break;
            case "right":
                i10 = 5;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    public static Integer i(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase) {
            case "bottom":
                i10 = 80;
                break;
            case "center":
                i10 = 16;
                break;
            case "top":
                i10 = 48;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i10);
    }

    public static boolean j(String str) {
        return str != null && (str.equalsIgnoreCase(a.f29886h) || str.equalsIgnoreCase("0"));
    }

    public static boolean k(String str) {
        return str != null && (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1"));
    }

    public final String a(String str) {
        HashMap map = this.f59690b;
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public void a(XmlPullParser xmlPullParser) {
    }

    public final int b(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            VastLog.d("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
        try {
            return Integer.parseInt(strA);
        } catch (Exception unused) {
            VastLog.e("VastXmlTag", "Error parse attribute value - %s, by name - %s", strA, str);
            return -1;
        }
    }

    public final boolean getBooleanAttributeValueByName(@NonNull String str, boolean z10) {
        String strA = a(str);
        if (k(strA)) {
            return true;
        }
        if (j(strA)) {
            return false;
        }
        return z10;
    }

    @NonNull
    public String[] getSupportedAttributes() {
        return new String[0];
    }

    @Nullable
    public final String getText() {
        return this.f59689a;
    }

    public boolean isTextSupported() {
        return false;
    }

    public boolean isValidTag() {
        return true;
    }

    public void parse(@NonNull XmlPullParser xmlPullParser) {
        a(a(this, xmlPullParser));
        if (isTextSupported()) {
            setText(c(xmlPullParser));
        }
        a(xmlPullParser);
    }

    public final void setText(@Nullable String str) {
        this.f59689a = str;
    }

    public static boolean a(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    public static boolean b(XmlPullParser xmlPullParser) {
        return k(c(xmlPullParser));
    }

    public static String c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return null;
        }
        String text = xmlPullParser.getText();
        if (!TextUtils.isEmpty(text)) {
            text = text.trim();
        }
        xmlPullParser.nextTag();
        return text;
    }

    public static void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public VastXmlTag(@NonNull XmlPullParser xmlPullParser) {
        parse(xmlPullParser);
    }

    private static HashMap a(VastXmlTag vastXmlTag, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeCount() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            if (vastXmlTag.d(xmlPullParser.getAttributeName(i10))) {
                map.put(xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
            }
        }
        return map;
    }

    public static void a(XmlPullParser xmlPullParser, IabElementStyle iabElementStyle) {
        for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if (VastAttributes.STROKE_COLOR.equals(attributeName)) {
                        iabElementStyle.setStrokeColor(c(attributeValue));
                    } else if (VastAttributes.FILL_COLOR.equals(attributeName)) {
                        iabElementStyle.setFillColor(c(attributeValue));
                    } else if (VastAttributes.OUTLINED.equals(attributeName)) {
                        iabElementStyle.setOutlined(Boolean.valueOf(k(attributeValue)));
                    } else if (VastAttributes.VISIBLE.equals(attributeName)) {
                        iabElementStyle.setVisible(Boolean.valueOf(k(attributeValue)));
                    } else if (VastAttributes.HORIZONTAL_POSITION.equals(attributeName)) {
                        iabElementStyle.setHorizontalPosition(h(attributeValue));
                    } else if (VastAttributes.VERTICAL_POSITION.equals(attributeName)) {
                        iabElementStyle.setVerticalPosition(i(attributeValue));
                    } else if ("style".equals(attributeName)) {
                        iabElementStyle.setStyle(attributeValue);
                    } else if (VastAttributes.OPACITY.equals(attributeName)) {
                        iabElementStyle.setOpacity(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if (VastAttributes.HIDE_AFTER.equals(attributeName)) {
                        iabElementStyle.setHideAfter(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if (VastAttributes.PADDING.equals(attributeName)) {
                        iabElementStyle.setPadding(attributeValue);
                    } else if (VastAttributes.MARGIN.equals(attributeName)) {
                        iabElementStyle.setMargin(attributeValue);
                    } else if (VastAttributes.STROKE_WIDTH.equals(attributeName)) {
                        iabElementStyle.setStrokeWidth(Utils.convertCssSizeToPx(attributeValue));
                    } else if ("width".equals(attributeName)) {
                        iabElementStyle.setWidth(Utils.convertCssSizeToPx(attributeValue));
                    } else if ("height".equals(attributeName)) {
                        iabElementStyle.setHeight(Utils.convertCssSizeToPx(attributeValue));
                    } else if (VastAttributes.FONT_STYLE.equals(attributeName)) {
                        iabElementStyle.setFontStyle(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if (VastAttributes.FONT_SIZE.equals(attributeName)) {
                        iabElementStyle.setFontSize(Utils.convertCssSizeToPx(attributeValue));
                    }
                } catch (Throwable th2) {
                    VastLog.e("VastXmlTag", th2);
                }
            }
        }
        try {
            iabElementStyle.setContent(c(xmlPullParser));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            xmlPullParser.require(3, null, xmlPullParser.getName());
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    private void a(HashMap map) {
        this.f59690b = map;
    }
}
