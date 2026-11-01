package com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw;

import android.content.Context;
import android.text.TextUtils;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.tlj;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public final class yu extends com.bytedance.sdk.openadsdk.core.ryl.ouw.vt {

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public static final String f13018ra = null;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt f13020lh;
        public String ouw;
        public com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw vt;
        public String yu;
        public final List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> fkw = new ArrayList();

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public final List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f13019le = new ArrayList();

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public float f13021ra = Float.MIN_VALUE;

        public ouw() {
        }

        public final void ouw(String str, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt vtVar) {
            this.ouw = str;
            this.vt = enumC0133ouw;
            this.f13020lh = vtVar;
        }

        public ouw(String str, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt vtVar) {
            ouw(str, enumC0133ouw, vtVar);
        }
    }

    public static int vt(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.ryl.ouw.vt
    public final com.bytedance.sdk.openadsdk.core.ryl.ouw ouw(String str, File file, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) throws Throwable {
        InputStream byteArrayInputStream;
        this.fkw = 0;
        InputStream inputStream = null;
        if (this.vt == null) {
            this.fkw = -1;
            return null;
        }
        if (TextUtils.isEmpty(str) && file == null) {
            this.fkw = -2;
            return null;
        }
        try {
            byteArrayInputStream = !TextUtils.isEmpty(str) ? new ByteArrayInputStream(str.getBytes("UTF-8")) : new FileInputStream(file);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(byteArrayInputStream, "UTF-8");
                    xmlPullParserNewPullParser.nextTag();
                    com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVarOuw = ouw(xmlPullParserNewPullParser, list);
                    ouw(ouwVarOuw);
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    return ouwVarOuw;
                } catch (Exception unused2) {
                    this.fkw = -3;
                    ouw((com.bytedance.sdk.openadsdk.core.ryl.ouw) null);
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = byteArrayInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public yu(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    public static void vt(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == 3) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    private com.bytedance.sdk.openadsdk.core.ryl.ouw vt(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) throws Throwable {
        byte b10;
        byte b11;
        File file = null;
        if (this.ouw >= 5) {
            ouw(xmlPullParser);
            return null;
        }
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar = new com.bytedance.sdk.openadsdk.core.ryl.yu();
        String str = null;
        com.bytedance.sdk.openadsdk.core.ryl.lh lhVarOuw = null;
        Set<tlj> setOuw = null;
        while (true) {
            if (xmlPullParser.getEventType() == 3 && VastTagName.WRAPPER.equals(xmlPullParser.getName())) {
                com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVarOuw = ouw(str, file, list);
                if (ouwVarOuw != null) {
                    if (ouwVarOuw.f13013lh == null) {
                        ouwVarOuw.ouw(lhVarOuw);
                    }
                    ouwVarOuw.ouw.ouw.ouw(yuVar);
                    if (setOuw != null) {
                        ouwVarOuw.ouw(setOuw);
                    }
                }
                return ouwVarOuw;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                switch (name.hashCode()) {
                    case -587420703:
                        if (!name.equals(VastTagName.VAST_AD_TAG_URI)) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case 67232232:
                        if (!name.equals(VastTagName.ERROR)) {
                            b10 = -1;
                        } else {
                            b11 = 1;
                            b10 = b11;
                        }
                        break;
                    case 184043572:
                        if (!name.equals(VastTagName.EXTENSIONS)) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case 611554000:
                        if (!name.equals(VastTagName.TRACKING_EVENTS)) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 1150879268:
                        if (!name.equals(VastTagName.COMPANION_ADS)) {
                            b10 = -1;
                        } else {
                            b11 = 4;
                            b10 = b11;
                        }
                        break;
                    case 2107600959:
                        if (!name.equals(VastTagName.CLICK_TRACKING)) {
                            b10 = -1;
                        } else {
                            b10 = 5;
                        }
                        break;
                    case 2114088489:
                        if (!name.equals(VastTagName.IMPRESSION)) {
                            b10 = -1;
                        } else {
                            b11 = 6;
                            b10 = b11;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        String strOuw = ouw(ouw(xmlPullParser, VastTagName.VAST_AD_TAG_URI), list);
                        if (TextUtils.isEmpty(strOuw)) {
                            vt(xmlPullParser, VastTagName.WRAPPER);
                            this.fkw = -2;
                            return null;
                        }
                        file = null;
                        str = strOuw;
                        break;
                    case 1:
                        list.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(ouw(xmlPullParser, VastTagName.ERROR)).ouw());
                        file = null;
                        break;
                    case 2:
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && VastTagName.EXTENSIONS.equals(xmlPullParser.getName())) {
                                file = null;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    setOuw = lh.ouw(xmlPullParser);
                                }
                            }
                        }
                        break;
                    case 3:
                        vt.ouw(xmlPullParser, yuVar);
                        file = null;
                        break;
                    case 4:
                        lhVarOuw = com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.ouw.ouw(this.vt, xmlPullParser);
                        file = null;
                        break;
                    case 5:
                        yuVar.ra(ouw(xmlPullParser, VastTagName.CLICK_TRACKING, false));
                        file = null;
                        break;
                    case 6:
                        yuVar.ouw(ouw(xmlPullParser, name, false));
                        file = null;
                        break;
                    default:
                        file = null;
                        break;
                }
            }
        }
    }

    private void ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar) {
        if (this.f13022le == null) {
            this.f13022le = new com.bytedance.sdk.openadsdk.core.ryl.ouw.vt.ouw();
        }
        com.bytedance.sdk.openadsdk.core.ryl.ouw.vt.ouw ouwVar2 = this.f13022le;
        ouwVar2.ouw = this.fkw;
        ouwVar2.vt = this.ouw;
        if (ouwVar != null) {
            ouwVar2.f13024lh = ouwVar.ouw.ouw.vt.size() <= 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:237:0x041b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0516  */
    /* JADX WARN: Code duplicated, block: B:329:0x06a4  */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0109. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private com.bytedance.sdk.openadsdk.core.ryl.ouw ouw(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list) throws Throwable {
        yu yuVar;
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar;
        int i10;
        ?? r10;
        Context context;
        boolean z10;
        String str;
        int i11;
        int i12;
        String str2;
        String str3;
        Context context2;
        double d10;
        boolean z11;
        String str4;
        String str5;
        String str6;
        Context context3;
        double d11;
        com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw;
        double d12;
        this = this;
        list = list;
        int i13 = 2;
        xmlPullParser.require(2, f13018ra, VastTagName.VAST);
        int i14 = 1;
        boolean z12 = false;
        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar2 = null;
        int i15 = 0;
        String strOuw = null;
        while (xmlPullParser.next() != i14) {
            if (xmlPullParser.getEventType() == i13) {
                String name = xmlPullParser.getName();
                String str7 = VastTagName.ERROR;
                if (VastTagName.ERROR.equals(name)) {
                    strOuw = ouw(xmlPullParser, name);
                } else {
                    if (VastTagName.AD.equals(name)) {
                        if (com.bytedance.sdk.openadsdk.core.ryl.ouw.vt.ouw(xmlPullParser.getAttributeValue(f13018ra, "sequence"))) {
                            while (true) {
                                int i16 = 3;
                                if (xmlPullParser.next() == 3 && VastTagName.AD.equals(xmlPullParser.getName())) {
                                    i15 = i14;
                                    i10 = i13;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == i13) {
                                    String name2 = xmlPullParser.getName();
                                    String str8 = VastTagName.IN_LINE;
                                    if (VastTagName.IN_LINE.equals(name2)) {
                                        Context context4 = this.vt;
                                        int i17 = this.f13023lh;
                                        double d13 = this.yu;
                                        xmlPullParser.require(i13, f13018ra, VastTagName.IN_LINE);
                                        com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.core.ryl.ouw();
                                        while (true) {
                                            if (xmlPullParser.next() == i16 && str8.equals(xmlPullParser.getName())) {
                                                ouwVar3.ouw.ouw.bly(list);
                                                if (!TextUtils.isEmpty(ouwVar3.f13014ra)) {
                                                    return ouwVar3;
                                                }
                                                this.fkw = -6;
                                                return ouwVar2;
                                            }
                                            if (xmlPullParser.getEventType() == i13) {
                                                String name3 = xmlPullParser.getName();
                                                name3.hashCode();
                                                switch (name3.hashCode()) {
                                                    case -2077435339:
                                                        r10 = !name3.equals("AdVerifications") ? -1 : z12;
                                                        break;
                                                    case -1692490108:
                                                        r10 = !name3.equals(VastTagName.CREATIVES) ? -1 : 1;
                                                        break;
                                                    case -56677412:
                                                        r10 = !name3.equals("Description") ? -1 : 2;
                                                        break;
                                                    case 67232232:
                                                        r10 = !name3.equals(str7) ? -1 : i16;
                                                        break;
                                                    case 184043572:
                                                        r10 = !name3.equals(VastTagName.EXTENSIONS) ? -1 : 4;
                                                        break;
                                                    case 501930965:
                                                        r10 = !name3.equals("AdTitle") ? -1 : 5;
                                                        break;
                                                    case 2114088489:
                                                        r10 = !name3.equals(VastTagName.IMPRESSION) ? -1 : 6;
                                                        break;
                                                    default:
                                                        r10 = -1;
                                                        break;
                                                }
                                                switch (r10) {
                                                    case 0:
                                                        ouwVar3.ouw(lh.ouw(xmlPullParser));
                                                        i13 = 2;
                                                        ouwVar2 = null;
                                                        break;
                                                    case 1:
                                                        if (!TextUtils.isEmpty(ouwVar3.f13014ra) && ouwVar3.f13013lh != null) {
                                                            ouw(xmlPullParser);
                                                        } else {
                                                            while (xmlPullParser.next() != i16) {
                                                                int i18 = 2;
                                                                if (xmlPullParser.getEventType() == 2) {
                                                                    if (VastTagName.CREATIVE.equals(xmlPullParser.getName())) {
                                                                        while (xmlPullParser.next() != i16) {
                                                                            if (xmlPullParser.getEventType() == i18) {
                                                                                String name4 = xmlPullParser.getName();
                                                                                String str9 = VastTagName.LINEAR;
                                                                                if (VastTagName.LINEAR.equals(name4) && TextUtils.isEmpty(ouwVar3.f13014ra)) {
                                                                                    boolean z13 = z12;
                                                                                    while (true) {
                                                                                        if (xmlPullParser.next() == i16 && xmlPullParser.getName().equals(str9)) {
                                                                                            i18 = 2;
                                                                                        } else {
                                                                                            if (xmlPullParser.getEventType() == 2) {
                                                                                                if (z13 && TextUtils.isEmpty(ouwVar3.f13014ra)) {
                                                                                                    ouw(xmlPullParser);
                                                                                                }
                                                                                                String name5 = xmlPullParser.getName();
                                                                                                name5.hashCode();
                                                                                                switch (name5) {
                                                                                                    case "VideoClicks":
                                                                                                        z10 = z13;
                                                                                                        str = str9;
                                                                                                        i11 = i17;
                                                                                                        str2 = str7;
                                                                                                        str3 = str8;
                                                                                                        context2 = context4;
                                                                                                        d10 = d13;
                                                                                                        while (true) {
                                                                                                            i12 = 3;
                                                                                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(VastTagName.VIDEO_CLICKS)) {
                                                                                                                z12 = false;
                                                                                                                break;
                                                                                                            } else if (xmlPullParser.getEventType() == 2) {
                                                                                                                String name6 = xmlPullParser.getName();
                                                                                                                name6.hashCode();
                                                                                                                if (name6.equals(VastTagName.CLICK_THROUGH)) {
                                                                                                                    ouwVar3.f13012le = ouw(xmlPullParser, VastTagName.CLICK_THROUGH);
                                                                                                                } else if (!name6.equals(VastTagName.CLICK_TRACKING)) {
                                                                                                                    ouw(xmlPullParser);
                                                                                                                } else {
                                                                                                                    ouwVar3.ouw.ouw.ra(ouw(xmlPullParser, VastTagName.CLICK_TRACKING, false));
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    case "Duration":
                                                                                                        z10 = z13;
                                                                                                        str = str9;
                                                                                                        i11 = i17;
                                                                                                        str2 = str7;
                                                                                                        str3 = str8;
                                                                                                        context2 = context4;
                                                                                                        d10 = d13;
                                                                                                        ouwVar3.pno = vt.ouw(xmlPullParser);
                                                                                                        i12 = 3;
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                    case "MediaFiles":
                                                                                                        String str10 = str9;
                                                                                                        int i19 = i17;
                                                                                                        String str11 = str7;
                                                                                                        String str12 = str8;
                                                                                                        Context context5 = context4;
                                                                                                        double d14 = d13;
                                                                                                        int i20 = Integer.MIN_VALUE;
                                                                                                        double d15 = Double.NEGATIVE_INFINITY;
                                                                                                        String str13 = null;
                                                                                                        int i21 = Integer.MIN_VALUE;
                                                                                                        while (true) {
                                                                                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(VastTagName.MEDIA_FILES)) {
                                                                                                                if (!TextUtils.isEmpty(str13)) {
                                                                                                                    ouwVar3.f13014ra = str13;
                                                                                                                    ouwVar3.bly = i20;
                                                                                                                    ouwVar3.tlj = i21;
                                                                                                                }
                                                                                                                d13 = d14;
                                                                                                                str9 = str10;
                                                                                                                str7 = str11;
                                                                                                                str8 = str12;
                                                                                                                context4 = context5;
                                                                                                                i17 = i19;
                                                                                                                z13 = true;
                                                                                                                z12 = false;
                                                                                                                i16 = 3;
                                                                                                            } else {
                                                                                                                if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(VastTagName.MEDIA_FILE)) {
                                                                                                                    String str14 = f13018ra;
                                                                                                                    String attributeValue = xmlPullParser.getAttributeValue(str14, "type");
                                                                                                                    int iVt = vt(xmlPullParser.getAttributeValue(str14, "width"));
                                                                                                                    int iVt2 = vt(xmlPullParser.getAttributeValue(str14, "height"));
                                                                                                                    int iVt3 = vt(xmlPullParser.getAttributeValue(str14, VastAttributes.BITRATE));
                                                                                                                    String strOuw2 = ouw(xmlPullParser, VastTagName.MEDIA_FILE);
                                                                                                                    if (iVt <= 0 || iVt2 <= 0 || !com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw.contains(attributeValue) || TextUtils.isEmpty(strOuw2)) {
                                                                                                                        d12 = d14;
                                                                                                                    } else {
                                                                                                                        d12 = d14;
                                                                                                                        double dOuw = com.bytedance.sdk.openadsdk.core.ryl.lh.yu.ouw(i19, d12, iVt, iVt2, iVt3, attributeValue);
                                                                                                                        if (dOuw > d15) {
                                                                                                                            str13 = strOuw2;
                                                                                                                            i20 = iVt;
                                                                                                                            i21 = iVt2;
                                                                                                                            d15 = dOuw;
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    d12 = d14;
                                                                                                                }
                                                                                                                d14 = d12;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    case "Icons":
                                                                                                        com.bytedance.sdk.openadsdk.core.ryl.vt vtVar = null;
                                                                                                        while (true) {
                                                                                                            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                                                                                                                if (vtVar != null && ouwVar3.vt == null) {
                                                                                                                    ouwVar3.ouw(vtVar);
                                                                                                                }
                                                                                                                z10 = z13;
                                                                                                                str = str9;
                                                                                                                i11 = i17;
                                                                                                                str2 = str7;
                                                                                                                str3 = str8;
                                                                                                                context2 = context4;
                                                                                                                d10 = d13;
                                                                                                                i12 = 3;
                                                                                                                z12 = false;
                                                                                                            } else {
                                                                                                                xmlPullParser.next();
                                                                                                                if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                                                                                                                    String str15 = f13018ra;
                                                                                                                    z11 = z13;
                                                                                                                    int iVt4 = vt(xmlPullParser.getAttributeValue(str15, "width"));
                                                                                                                    str4 = str9;
                                                                                                                    int iVt5 = vt(xmlPullParser.getAttributeValue(str15, "height"));
                                                                                                                    if (iVt4 > 0) {
                                                                                                                        str5 = str7;
                                                                                                                        if (iVt4 <= 300 && iVt5 > 0 && iVt5 <= 300) {
                                                                                                                            int iOuw = com.bytedance.sdk.openadsdk.core.ryl.vt.ouw.ouw(xmlPullParser.getAttributeValue(str15, TypedValues.CycleType.S_WAVE_OFFSET));
                                                                                                                            str6 = str8;
                                                                                                                            int iOuw2 = com.bytedance.sdk.openadsdk.core.ryl.vt.ouw.ouw(xmlPullParser.getAttributeValue(str15, "duration"));
                                                                                                                            ArrayList arrayList = new ArrayList();
                                                                                                                            d11 = d13;
                                                                                                                            ArrayList arrayList2 = new ArrayList();
                                                                                                                            ouw ouwVar4 = null;
                                                                                                                            String strOuw3 = null;
                                                                                                                            while (true) {
                                                                                                                                context3 = context4;
                                                                                                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("Icon")) {
                                                                                                                                    if (ouwVar4 == null || !(vtVar == null || TextUtils.isEmpty(vtVar.le()))) {
                                                                                                                                        i17 = i17;
                                                                                                                                    } else {
                                                                                                                                        i17 = i17;
                                                                                                                                        com.bytedance.sdk.openadsdk.core.ryl.vt vtVar2 = new com.bytedance.sdk.openadsdk.core.ryl.vt(iVt4, iVt5, iOuw, iOuw2, ouwVar4.vt, ouwVar4.f13020lh, ouwVar4.ouw, arrayList, arrayList2, strOuw3);
                                                                                                                                        vt(xmlPullParser, "Icons");
                                                                                                                                        vtVar = vtVar2;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    int i22 = i17;
                                                                                                                                    if (xmlPullParser.getEventType() == 2) {
                                                                                                                                        String name7 = xmlPullParser.getName();
                                                                                                                                        name7.hashCode();
                                                                                                                                        switch (name7) {
                                                                                                                                            case "IconViewTracking":
                                                                                                                                                arrayList2.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(ouw(xmlPullParser, "IconViewTracking")).ouw());
                                                                                                                                                break;
                                                                                                                                            case "IFrameResource":
                                                                                                                                                if (ouwVar4 == null) {
                                                                                                                                                    ouwVar4 = new ouw(ouw(xmlPullParser, VastTagName.I_FRAME_RESOURCE), com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.NONE, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.IFRAME_RESOURCE);
                                                                                                                                                    break;
                                                                                                                                                } else {
                                                                                                                                                    ouw(xmlPullParser);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case "StaticResource":
                                                                                                                                                com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw enumC0133ouw2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.NONE;
                                                                                                                                                String lowerCase = xmlPullParser.getAttributeValue(f13018ra, "creativeType").toLowerCase();
                                                                                                                                                Set<String> set = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw;
                                                                                                                                                String strOuw4 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.contains(lowerCase)) ? ouw(xmlPullParser, VastTagName.STATIC_RESOURCE) : null;
                                                                                                                                                if (set.contains(lowerCase)) {
                                                                                                                                                    enumC0133ouw = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.IMAGE;
                                                                                                                                                } else {
                                                                                                                                                    enumC0133ouw = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.JAVASCRIPT;
                                                                                                                                                }
                                                                                                                                                ouwVar4 = new ouw(strOuw4, enumC0133ouw, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.STATIC_RESOURCE);
                                                                                                                                                break;
                                                                                                                                            case "IconClicks":
                                                                                                                                                while (true) {
                                                                                                                                                    if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("IconClicks")) {
                                                                                                                                                        if (xmlPullParser.getEventType() == 2) {
                                                                                                                                                            if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                                                                                                                                strOuw3 = ouw(xmlPullParser, "IconClickThrough");
                                                                                                                                                            } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                                                                                                                                arrayList.add(new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(ouw(xmlPullParser, "IconClickTracking")).ouw());
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            case "HTMLResource":
                                                                                                                                                if (ouwVar4 == null || ouwVar4.f13020lh == com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.IFRAME_RESOURCE) {
                                                                                                                                                    ouwVar4 = new ouw(ouw(xmlPullParser, VastTagName.HTML_RESOURCE), com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0133ouw.NONE, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.HTML_RESOURCE);
                                                                                                                                                    break;
                                                                                                                                                } else {
                                                                                                                                                    ouw(xmlPullParser);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                ouw(xmlPullParser);
                                                                                                                                                break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    context4 = context3;
                                                                                                                                    i17 = i22;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        str5 = str7;
                                                                                                                    }
                                                                                                                    str6 = str8;
                                                                                                                    context3 = context4;
                                                                                                                    d11 = d13;
                                                                                                                    ouw(xmlPullParser);
                                                                                                                } else {
                                                                                                                    z11 = z13;
                                                                                                                    str4 = str9;
                                                                                                                    i17 = i17;
                                                                                                                    str5 = str7;
                                                                                                                    str6 = str8;
                                                                                                                    context3 = context4;
                                                                                                                    d11 = d13;
                                                                                                                }
                                                                                                                z13 = z11;
                                                                                                                d13 = d11;
                                                                                                                str9 = str4;
                                                                                                                str7 = str5;
                                                                                                                str8 = str6;
                                                                                                                context4 = context3;
                                                                                                                i17 = i17;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
                                                                                                        break;
                                                                                                    case "TrackingEvents":
                                                                                                        vt.ouw(xmlPullParser, ouwVar3.ouw.ouw);
                                                                                                        z10 = z13;
                                                                                                        str = str9;
                                                                                                        i11 = i17;
                                                                                                        str2 = str7;
                                                                                                        str3 = str8;
                                                                                                        context2 = context4;
                                                                                                        d10 = d13;
                                                                                                        i12 = 3;
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                    default:
                                                                                                        ouw(xmlPullParser);
                                                                                                        z10 = z13;
                                                                                                        str = str9;
                                                                                                        i11 = i17;
                                                                                                        str2 = str7;
                                                                                                        str3 = str8;
                                                                                                        context2 = context4;
                                                                                                        d10 = d13;
                                                                                                        i12 = 3;
                                                                                                        z12 = false;
                                                                                                        break;
                                                                                                }
                                                                                            } else {
                                                                                                z10 = z13;
                                                                                                str = str9;
                                                                                                i11 = i17;
                                                                                                i12 = i16;
                                                                                                str2 = str7;
                                                                                                str3 = str8;
                                                                                                context2 = context4;
                                                                                                d10 = d13;
                                                                                            }
                                                                                            i16 = i12;
                                                                                            z13 = z10;
                                                                                            d13 = d10;
                                                                                            str9 = str;
                                                                                            str7 = str2;
                                                                                            str8 = str3;
                                                                                            context4 = context2;
                                                                                            i17 = i11;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    int i23 = i17;
                                                                                    int i24 = i16;
                                                                                    String str16 = str7;
                                                                                    String str17 = str8;
                                                                                    Context context6 = context4;
                                                                                    double d16 = d13;
                                                                                    if (VastTagName.COMPANION_ADS.equals(xmlPullParser.getName()) && ouwVar3.f13013lh == null) {
                                                                                        context = context6;
                                                                                        ouwVar3.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.ouw.ouw(context, xmlPullParser));
                                                                                    } else {
                                                                                        context = context6;
                                                                                        ouw(xmlPullParser);
                                                                                    }
                                                                                    context4 = context;
                                                                                    i16 = i24;
                                                                                    i18 = 2;
                                                                                    d13 = d16;
                                                                                    str7 = str16;
                                                                                    str8 = str17;
                                                                                    i17 = i23;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        ouw(xmlPullParser);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        context4 = context4;
                                                        i16 = i16;
                                                        i13 = 2;
                                                        d13 = d13;
                                                        str7 = str7;
                                                        str8 = str8;
                                                        i17 = i17;
                                                        ouwVar2 = null;
                                                        break;
                                                    case 2:
                                                        ouwVar3.fkw = ouw(xmlPullParser, name3);
                                                        i13 = 2;
                                                        ouwVar2 = null;
                                                        break;
                                                    case 3:
                                                        list.addAll(ouw(xmlPullParser, name3, z12));
                                                        i13 = 2;
                                                        ouwVar2 = null;
                                                        break;
                                                    case 4:
                                                        while (true) {
                                                            if (xmlPullParser.getEventType() == i16 && VastTagName.EXTENSIONS.equals(xmlPullParser.getName())) {
                                                                context4 = context4;
                                                                i16 = i16;
                                                                i13 = 2;
                                                                d13 = d13;
                                                                str7 = str7;
                                                                str8 = str8;
                                                                i17 = i17;
                                                                ouwVar2 = null;
                                                                break;
                                                            } else {
                                                                xmlPullParser.next();
                                                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                                                    ouwVar3.ouw(lh.ouw(xmlPullParser));
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 5:
                                                        ouwVar3.yu = ouw(xmlPullParser, name3);
                                                        i13 = 2;
                                                        ouwVar2 = null;
                                                        break;
                                                    case 6:
                                                        ouwVar3.ouw.ouw.ouw(ouw(xmlPullParser, name3, z12));
                                                        i13 = 2;
                                                        ouwVar2 = null;
                                                        break;
                                                    default:
                                                        ouw(xmlPullParser);
                                                        context4 = context4;
                                                        i16 = i16;
                                                        i13 = 2;
                                                        d13 = d13;
                                                        str7 = str7;
                                                        str8 = str8;
                                                        i17 = i17;
                                                        ouwVar2 = null;
                                                        break;
                                                }
                                            }
                                            this = this;
                                            list = list;
                                        }
                                    } else {
                                        int i25 = i13;
                                        String str18 = str7;
                                        if (VastTagName.WRAPPER.equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.ryl.ouw ouwVarVt = vt(xmlPullParser, list);
                                            if (ouwVarVt != null) {
                                                return ouwVarVt;
                                            }
                                        } else {
                                            ouw(xmlPullParser);
                                        }
                                        i13 = i25;
                                        str7 = str18;
                                        i14 = 1;
                                        ouwVar2 = null;
                                    }
                                }
                            }
                        } else {
                            ouw(xmlPullParser);
                            i15 = 1;
                        }
                        ouwVar2 = null;
                        i14 = 1;
                    } else {
                        i10 = i13;
                        ouw(xmlPullParser);
                    }
                    i13 = i10;
                    ouwVar2 = null;
                    i14 = 1;
                }
            } else {
                i14 = 1;
                this = this;
                list = list;
            }
        }
        if (i15 == 0) {
            yuVar = this;
            yuVar.fkw = -4;
            if (!TextUtils.isEmpty(strOuw)) {
                ouwVar = null;
                com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw((vpp) null, (List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh>) Collections.singletonList(new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(strOuw).ouw()), yuVar.ouw > 0 ? com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.UNDEFINED_ERROR, -1L, (String) null, (String) null), (com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt) null);
            }
            if (yuVar.fkw == 0) {
                yuVar.fkw = -5;
            }
            return ouwVar;
        }
        yuVar = this;
        ouwVar = null;
        if (yuVar.fkw == 0) {
            yuVar.fkw = -5;
        }
        return ouwVar;
    }

    public static List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ouw(XmlPullParser xmlPullParser, String str, boolean z10) throws XmlPullParserException, IOException {
        return ouw(ouw(xmlPullParser, str), z10);
    }

    public static String ouw(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = f13018ra;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    public static void ouw(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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

    private static List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ouw(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(str);
        ouwVar.ouw = z10;
        return Collections.singletonList(ouwVar.ouw());
    }
}
