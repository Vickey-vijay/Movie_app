package io.bidmachine.iab.vast.tags;

import android.text.TextUtils;
import android.util.Xml;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.VastLog;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes7.dex */
public class VastParser {
    @Nullable
    public static VastTag parseVast(@Nullable InputStream inputStream) throws Exception {
        if (inputStream == null) {
            throw new Exception();
        }
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(inputStream, null);
        int next = xmlPullParserNewPullParser.next();
        if (next == 1) {
            throw new Exception();
        }
        while (next != 3 && next != 1) {
            if (xmlPullParserNewPullParser.getEventType() == 2 && VastXmlTag.a(xmlPullParserNewPullParser.getName(), VastTagName.VAST)) {
                return new VastTag(xmlPullParserNewPullParser);
            }
            next = xmlPullParserNewPullParser.next();
        }
        return null;
    }

    @Nullable
    public static VastTag parseVast(@Nullable String str) throws Exception {
        ByteArrayInputStream byteArrayInputStream;
        if (TextUtils.isEmpty(str)) {
            throw new Exception();
        }
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(str.getBytes(Charset.defaultCharset().name()));
                try {
                    VastTag vast = parseVast(byteArrayInputStream);
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception e10) {
                        VastLog.e("VastXmlParser", e10);
                    }
                    return vast;
                } catch (Exception e11) {
                    e = e11;
                    byteArrayInputStream2 = byteArrayInputStream;
                    VastLog.e("VastXmlParser", e);
                    throw new Exception();
                } catch (Throwable th2) {
                    th = th2;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Exception e12) {
                            VastLog.e("VastXmlParser", e12);
                        }
                    }
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayInputStream = byteArrayInputStream2;
        }
    }
}
