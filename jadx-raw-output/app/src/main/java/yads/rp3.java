package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes5.dex */
public final class rp3 {
    public static String a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String text;
        int i10;
        boolean z10;
        if (xmlPullParser.next() == 4) {
            text = xmlPullParser.getText();
            xmlPullParser.nextTag();
        } else {
            text = "";
        }
        int length = text.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            if (!z11) {
                i10 = i11;
            } else {
                i10 = length;
            }
            if (ck.p.l(text.charAt(i10), 32) <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z11) {
                if (!z10) {
                    z11 = true;
                } else {
                    i11++;
                }
            } else {
                if (!z10) {
                    break;
                }
                length--;
            }
        }
        return text.subSequence(i11, length + 1).toString();
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i10 = 1;
            while (i10 != 0) {
                int next = xmlPullParser.next();
                if (next != 2) {
                    if (next == 3) {
                        i10--;
                    }
                } else {
                    i10++;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
