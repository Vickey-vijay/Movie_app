package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m5.a;
import m5.c;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    private static int checkContentTypeConsistency(int i10, int i11) {
        if (i10 == -1) {
            return i11;
        }
        if (i11 == -1) {
            return i10;
        }
        Assertions.checkState(i10 == i11);
        return i10;
    }

    private static void fillInClearKeyInformation(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i10);
            if (C.CLEARKEY_UUID.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i10);
                break;
            }
            i10++;
        }
        if (str == null) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            DrmInitData.SchemeData schemeData2 = arrayList.get(i11);
            if (C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i11, new DrmInitData.SchemeData(C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    private static long getFinalAvailabilityTimeOffset(long j10, long j11) {
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        if (j10 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j10;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Descriptor descriptor = list.get(i10);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Descriptor descriptor = list.get(i10);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j10) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Util.parseXsDateTime(attributeValue);
    }

    public static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strE = a.e(attributeValue);
        strE.hashCode();
        switch (strE) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f800":
                return 5;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    public static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Util.parseXsDuration(attributeValue);
    }

    public static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Descriptor descriptor = list.get(i10);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(descriptor.value)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float parseFloat(XmlPullParser xmlPullParser, String str, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f10 : Float.parseFloat(attributeValue);
    }

    public static float parseFrameRate(XmlPullParser xmlPullParser, float f10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f10;
        }
        Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
        if (!matcher.matches()) {
            return f10;
        }
        int i10 = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? i10 / Integer.parseInt(strGroup) : i10;
    }

    public static int parseInt(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Descriptor descriptor = list.get(i10);
            if (a.a("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    public static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public Format buildFormat(@Nullable String str, @Nullable String str2, int i10, int i11, float f10, int i12, int i13, int i14, @Nullable String str3, List<Descriptor> list, List<Descriptor> list2, @Nullable String str4, List<Descriptor> list3, List<Descriptor> list4) {
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if ("audio/eac3".equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if ("audio/eac3-joc".equals(sampleMimeType)) {
                str5 = "ec+3";
            }
        }
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int roleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> tileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str5).setPeakBitrate(i14).setSelectionFlags(selectionFlagsFromRoleDescriptors).setRoleFlags(roleFlagsFromRoleDescriptors).setLanguage(str3);
        int cea708AccessibilityChannel = -1;
        Format.Builder tileCountVertical = language.setTileCountHorizontal(tileCountFromProperties != null ? ((Integer) tileCountFromProperties.first).intValue() : -1).setTileCountVertical(tileCountFromProperties != null ? ((Integer) tileCountFromProperties.second).intValue() : -1);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i10).setHeight(i11).setFrameRate(f10);
        } else if (MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i12).setSampleRate(i13);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if ("application/cea-608".equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(list2);
            } else if ("application/cea-708".equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(cea708AccessibilityChannel);
        } else if (MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i10).setHeight(i11);
        }
        return tileCountVertical.build();
    }

    public Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String str, List<Label> list, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format.Builder builderBuildUpon = representationInfo.format.buildUpon();
        if (str == null || !list.isEmpty()) {
            builderBuildUpon.setLabels(list);
        } else {
            builderBuildUpon.setLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            builderBuildUpon.setDrmInitData(new DrmInitData(str3, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, builderBuildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0354 A[LOOP:0: B:3:0x0080->B:74:0x0354, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0312 A[EDGE_INSN: B:75:0x0312->B:68:0x0312 BREAK  A[LOOP:0: B:3:0x0080->B:74:0x0354], SYNTHETIC] */
    public AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable SegmentBase segmentBase, long j10, long j11, long j12, long j13, long j14, boolean z10) throws XmlPullParserException, IOException {
        List<Label> list2;
        Object obj;
        ArrayList<Descriptor> arrayList;
        String str;
        List<Label> list3;
        long j15;
        long j16;
        int i10;
        long availabilityTimeOffsetUs;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long j17 = parseLong(xmlPullParser2, "id", -1L);
        int contentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int i11 = parseInt(xmlPullParser2, "width", -1);
        int i12 = parseInt(xmlPullParser2, "height", -1);
        float frameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int i13 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str2 = Q6.f27460q;
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, Q6.f27460q);
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        List<Label> arrayList2 = new ArrayList<>();
        ArrayList<DrmInitData.SchemeData> arrayList3 = new ArrayList<>();
        ArrayList<Descriptor> arrayList4 = new ArrayList<>();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        SegmentBase segmentTemplate = segmentBase;
        String str3 = attributeValue3;
        int audioChannelConfiguration = -1;
        String str4 = null;
        boolean z11 = false;
        long availabilityTimeOffsetUs2 = j11;
        long j18 = j12;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs2);
                    z11 = true;
                }
                arrayList10.addAll(parseBaseUrl(xmlPullParser2, list, z10));
                availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                list2 = arrayList2;
            } else {
                availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                list2 = arrayList2;
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                    Object obj2 = contentProtection.first;
                    if (obj2 != null) {
                        str4 = (String) obj2;
                    }
                    Object obj3 = contentProtection.second;
                    if (obj3 != null) {
                        arrayList3.add((DrmInitData.SchemeData) obj3);
                    }
                    list2 = list2;
                    availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentComponent")) {
                        String strCheckLanguageConsistency = checkLanguageConsistency(str3, xmlPullParser2.getAttributeValue(null, str2));
                        contentType = checkContentTypeConsistency(contentType, parseContentType(xmlPullParser));
                        str = strCheckLanguageConsistency;
                        obj = null;
                    } else {
                        String str5 = str3;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Role")) {
                            arrayList6.add(parseDescriptor(xmlPullParser2, "Role"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AudioChannelConfiguration")) {
                            audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                            obj = null;
                            str = str5;
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Accessibility")) {
                            arrayList5.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                            arrayList7.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                            arrayList8.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Representation")) {
                                int i14 = contentType;
                                arrayList10 = arrayList10;
                                arrayList8 = arrayList8;
                                arrayList7 = arrayList7;
                                arrayList6 = arrayList6;
                                arrayList5 = arrayList5;
                                arrayList = arrayList4;
                                arrayList3 = arrayList3;
                                list3 = list2;
                                str2 = str2;
                                obj = null;
                                str = str5;
                                RepresentationInfo representation = parseRepresentation(xmlPullParser, !arrayList10.isEmpty() ? arrayList10 : list, attributeValue, attributeValue2, i11, i12, frameRate, audioChannelConfiguration, i13, str5, arrayList6, arrayList5, arrayList7, arrayList8, segmentTemplate, j13, j10, availabilityTimeOffsetUs2, j18, j14, z10);
                                int iCheckContentTypeConsistency = checkContentTypeConsistency(i14, MimeTypes.getTrackType(representation.format.sampleMimeType));
                                arrayList9 = arrayList9;
                                arrayList9.add(representation);
                                xmlPullParser2 = xmlPullParser;
                                availabilityTimeOffsetUs = j18;
                                contentType = iCheckContentTypeConsistency;
                                availabilityTimeOffsetUs2 = availabilityTimeOffsetUs2;
                            } else {
                                int i15 = contentType;
                                obj = null;
                                arrayList10 = arrayList10;
                                arrayList8 = arrayList8;
                                arrayList7 = arrayList7;
                                arrayList6 = arrayList6;
                                arrayList5 = arrayList5;
                                arrayList = arrayList4;
                                arrayList3 = arrayList3;
                                str2 = str2;
                                str = str5;
                                list3 = list2;
                                j15 = availabilityTimeOffsetUs2;
                                arrayList9 = arrayList9;
                                xmlPullParser2 = xmlPullParser;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                                    availabilityTimeOffsetUs = j18;
                                    segmentTemplate = parseSegmentBase(xmlPullParser2, (SegmentBase.SingleSegmentBase) segmentTemplate);
                                    contentType = i15;
                                    availabilityTimeOffsetUs2 = j15;
                                    arrayList4 = arrayList;
                                    list2 = list3;
                                    xmlPullParser2 = xmlPullParser2;
                                } else {
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                                        availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, j18);
                                        i10 = i15;
                                        segmentTemplate = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentTemplate, j13, j10, j15, availabilityTimeOffsetUs, j14);
                                    } else {
                                        j16 = j18;
                                        i10 = i15;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                            availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, j16);
                                            segmentTemplate = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentTemplate, arrayList8, j13, j10, j15, availabilityTimeOffsetUs, j14);
                                        } else {
                                            xmlPullParser2 = xmlPullParser2;
                                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                                arrayList4 = arrayList;
                                                arrayList4.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                                list2 = list3;
                                            } else {
                                                arrayList4 = arrayList;
                                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Label")) {
                                                    list2 = list3;
                                                    list2.add(parseLabel(xmlPullParser));
                                                } else {
                                                    list2 = list3;
                                                    if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                                                        parseAdaptationSetChild(xmlPullParser);
                                                    }
                                                }
                                            }
                                            availabilityTimeOffsetUs = j16;
                                            availabilityTimeOffsetUs2 = j15;
                                            contentType = i10;
                                        }
                                    }
                                    availabilityTimeOffsetUs2 = j15;
                                    contentType = i10;
                                }
                            }
                            arrayList4 = arrayList;
                            list2 = list3;
                        }
                        i10 = contentType;
                        obj = null;
                        arrayList10 = arrayList10;
                        arrayList8 = arrayList8;
                        arrayList7 = arrayList7;
                        arrayList6 = arrayList6;
                        arrayList5 = arrayList5;
                        arrayList4 = arrayList4;
                        arrayList3 = arrayList3;
                        str2 = str2;
                        str = str5;
                        j15 = availabilityTimeOffsetUs2;
                        j16 = j18;
                        arrayList9 = arrayList9;
                        list2 = list2;
                        availabilityTimeOffsetUs = j16;
                        availabilityTimeOffsetUs2 = j15;
                        contentType = i10;
                    }
                    availabilityTimeOffsetUs = j18;
                }
                if (XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                    break;
                }
                arrayList4 = arrayList4;
                arrayList2 = list2;
                arrayList9 = arrayList9;
                j18 = availabilityTimeOffsetUs;
                arrayList10 = arrayList10;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList3 = arrayList3;
                str2 = str2;
                str3 = str;
            }
            str = str3;
            obj = null;
            availabilityTimeOffsetUs = j18;
            arrayList10 = arrayList10;
            arrayList4 = arrayList4;
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                break;
                break;
            }
            arrayList4 = arrayList4;
            arrayList2 = list2;
            arrayList9 = arrayList9;
            j18 = availabilityTimeOffsetUs;
            arrayList10 = arrayList10;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList3 = arrayList3;
            str2 = str2;
            str3 = str;
        }
        List<Representation> arrayList11 = new ArrayList<>(arrayList9.size());
        for (int i16 = 0; i16 < arrayList9.size(); i16++) {
            arrayList11.add(buildRepresentation((RepresentationInfo) arrayList9.get(i16), attributeValue4, list2, str4, arrayList3, arrayList4));
        }
        return buildAdaptationSet(j17, contentType, arrayList11, arrayList5, arrayList7, arrayList8);
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List<BaseUrl> parseBaseUrl(XmlPullParser xmlPullParser, List<BaseUrl> list, boolean z10) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i10 = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = parseText(xmlPullParser, "BaseURL");
        if (UriUtil.isAbsolute(text)) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return Lists.l(new BaseUrl(text, attributeValue3, i10, i11));
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            BaseUrl baseUrl = list.get(i12);
            String strResolve = UriUtil.resolve(baseUrl.url, text);
            String str = attributeValue3 == null ? strResolve : attributeValue3;
            if (z10) {
                i10 = baseUrl.priority;
                i11 = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(strResolve, str, i10, i11));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009c  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? BuildPsshAtom;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue2 != null) {
            String strE = a.e(attributeValue2);
            strE.hashCode();
            switch (strE) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = C.CLEARKEY_UUID;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    BuildPsshAtom = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = C.PLAYREADY_UUID;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    BuildPsshAtom = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = C.WIDEVINE_UUID;
                    attributeValue = null;
                    uuid2 = null;
                    text = uuid2;
                    BuildPsshAtom = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        String[] strArrSplit = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                            uuidArr[i10] = UUID.fromString(strArrSplit[i10]);
                        }
                        uuid = C.COMMON_PSSH_UUID;
                        text = 0;
                        BuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid, uuidArr, null);
                        break;
                    } else {
                        Log.w(TAG, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                        uuid2 = uuid;
                        text = uuid2;
                        BuildPsshAtom = uuid2;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    BuildPsshAtom = uuid2;
                    break;
            }
        } else {
            attributeValue = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            BuildPsshAtom = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl") || XmlPullParserUtil.isStartTag(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                BuildPsshAtom = BuildPsshAtom;
                text = xmlPullParser.getText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                BuildPsshAtom = BuildPsshAtom;
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (BuildPsshAtom == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuid3 = PsshAtomUtil.parseUuid(bArrDecode);
                if (uuid3 == null) {
                    Log.w(TAG, "Skipping malformed cenc:pssh data");
                    uuid = uuid3;
                    BuildPsshAtom = 0;
                    text = text;
                } else {
                    BuildPsshAtom = bArrDecode;
                    uuid = uuid3;
                    text = text;
                }
            } else if (BuildPsshAtom == 0) {
                UUID uuid4 = C.PLAYREADY_UUID;
                if (uuid4.equals(uuid) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    BuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid4, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    maybeSkipTag(xmlPullParser);
                    BuildPsshAtom = BuildPsshAtom;
                    text = text;
                }
            } else {
                maybeSkipTag(xmlPullParser);
                BuildPsshAtom = BuildPsshAtom;
                text = text;
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, text, "video/mp4", BuildPsshAtom) : null);
    }

    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Label parseLabel(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return new Label(xmlPullParser.getAttributeValue(null, Q6.f27460q), parseText(xmlPullParser, "Label"));
    }

    public String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(StringUtils.COMMA);
    }

    public RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j10 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j11 = (Long.parseLong(strArrSplit[1]) - j10) + 1;
            }
            return buildRangedUri(attributeValue, j10, j11);
        }
        j10 = 0;
        j11 = -1;
        return buildRangedUri(attributeValue, j10, j11);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01ef A[LOOP:0: B:3:0x006b->B:57:0x01ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0199 A[EDGE_INSN: B:58:0x0199->B:47:0x0199 BREAK  A[LOOP:0: B:3:0x006b->B:57:0x01ef], SYNTHETIC] */
    public RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List<BaseUrl> list, @Nullable String str, @Nullable String str2, int i10, int i11, float f10, int i12, int i13, @Nullable String str3, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, List<Descriptor> list5, @Nullable SegmentBase segmentBase, long j10, long j11, long j12, long j13, long j14, boolean z10) throws XmlPullParserException, IOException {
        long j15;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long availabilityTimeOffsetUs;
        ArrayList arrayList6;
        SegmentBase singleSegmentBase;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int i14 = parseInt(xmlPullParser, "bandwidth", -1);
        String string = parseString(xmlPullParser, "mimeType", str);
        String string2 = parseString(xmlPullParser, "codecs", str2);
        int i15 = parseInt(xmlPullParser, "width", i10);
        int i16 = parseInt(xmlPullParser, "height", i11);
        float frameRate = parseFrameRate(xmlPullParser, f10);
        int i17 = parseInt(xmlPullParser, "audioSamplingRate", i13);
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList(list4);
        ArrayList arrayList13 = new ArrayList(list5);
        int audioChannelConfiguration = i12;
        long availabilityTimeOffsetUs2 = j12;
        String str4 = null;
        boolean z11 = false;
        SegmentBase segmentTemplate = segmentBase;
        long j16 = j13;
        ArrayList arrayList14 = new ArrayList();
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z11) {
                    availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs2);
                    z11 = true;
                }
                arrayList14.addAll(parseBaseUrl(xmlPullParser, list, z10));
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "AudioChannelConfiguration")) {
                    singleSegmentBase = segmentTemplate;
                    audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                    arrayList4 = arrayList11;
                    arrayList5 = arrayList13;
                    arrayList9 = arrayList14;
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                    segmentTemplate = parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentTemplate);
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                        availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j16);
                        j15 = availabilityTimeOffsetUs2;
                        arrayList8 = arrayList14;
                        arrayList = arrayList13;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList12;
                        segmentTemplate = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentTemplate, j10, j11, j15, availabilityTimeOffsetUs, j14);
                    } else {
                        j15 = availabilityTimeOffsetUs2;
                        ArrayList arrayList15 = arrayList14;
                        arrayList = arrayList13;
                        arrayList2 = arrayList11;
                        arrayList3 = arrayList12;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                            availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser, j16);
                            segmentTemplate = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentTemplate, list5, j10, j11, j15, availabilityTimeOffsetUs, j14);
                            arrayList8 = arrayList15;
                        } else {
                            arrayList10 = arrayList10;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                                Object obj = contentProtection.first;
                                if (obj != null) {
                                    str4 = (String) obj;
                                }
                                Object obj2 = contentProtection.second;
                                if (obj2 != null) {
                                    arrayList10.add((DrmInitData.SchemeData) obj2);
                                }
                                arrayList7 = arrayList15;
                                availabilityTimeOffsetUs2 = j15;
                                arrayList5 = arrayList;
                                arrayList4 = arrayList2;
                                arrayList12 = arrayList3;
                                arrayList6 = arrayList7;
                            } else {
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "InbandEventStream")) {
                                    arrayList4 = arrayList2;
                                    arrayList4.add(parseDescriptor(xmlPullParser, "InbandEventStream"));
                                    arrayList5 = arrayList;
                                    arrayList12 = arrayList3;
                                } else {
                                    arrayList4 = arrayList2;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "EssentialProperty")) {
                                        arrayList12 = arrayList3;
                                        arrayList12.add(parseDescriptor(xmlPullParser, "EssentialProperty"));
                                        arrayList5 = arrayList;
                                    } else {
                                        arrayList12 = arrayList3;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "SupplementalProperty")) {
                                            arrayList5 = arrayList;
                                            arrayList5.add(parseDescriptor(xmlPullParser, "SupplementalProperty"));
                                        } else {
                                            arrayList5 = arrayList;
                                            maybeSkipTag(xmlPullParser);
                                        }
                                    }
                                }
                                audioChannelConfiguration = audioChannelConfiguration;
                                availabilityTimeOffsetUs2 = j15;
                                arrayList6 = arrayList15;
                            }
                        }
                        singleSegmentBase = segmentTemplate;
                        arrayList9 = arrayList6;
                    }
                    j16 = availabilityTimeOffsetUs;
                    arrayList7 = arrayList8;
                    availabilityTimeOffsetUs2 = j15;
                    arrayList5 = arrayList;
                    arrayList4 = arrayList2;
                    arrayList12 = arrayList3;
                    arrayList6 = arrayList7;
                    singleSegmentBase = segmentTemplate;
                    arrayList9 = arrayList6;
                }
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                    break;
                }
                arrayList13 = arrayList5;
                arrayList11 = arrayList4;
                arrayList10 = arrayList10;
                segmentTemplate = singleSegmentBase;
                audioChannelConfiguration = audioChannelConfiguration;
                arrayList14 = arrayList9;
            }
            audioChannelConfiguration = audioChannelConfiguration;
            singleSegmentBase = segmentTemplate;
            arrayList4 = arrayList11;
            arrayList5 = arrayList13;
            arrayList9 = arrayList14;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                break;
                break;
            }
            arrayList13 = arrayList5;
            arrayList11 = arrayList4;
            arrayList10 = arrayList10;
            segmentTemplate = singleSegmentBase;
            audioChannelConfiguration = audioChannelConfiguration;
            arrayList14 = arrayList9;
        }
        List<Descriptor> list6 = arrayList5;
        List<Descriptor> list7 = arrayList12;
        ArrayList arrayList16 = arrayList4;
        Format formatBuildFormat = buildFormat(attributeValue, string, i15, i16, frameRate, audioChannelConfiguration, i17, i14, str3, list2, list3, string2, list7, list6);
        if (singleSegmentBase == null) {
            singleSegmentBase = new SegmentBase.SingleSegmentBase();
        }
        boolean zIsEmpty = arrayList9.isEmpty();
        List list8 = arrayList9;
        if (zIsEmpty) {
            list8 = list;
        }
        return new RepresentationInfo(formatBuildFormat, list8, singleSegmentBase, str4, arrayList10, arrayList16, list7, list6, -1L);
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int tvaAudioPurposeCsValue;
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Descriptor descriptor = list.get(i11);
            if (a.a("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else {
                if (a.a("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                    tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
                }
            }
            i10 |= tvaAudioPurposeCsValue;
        }
        return i10;
    }

    public int parseRoleFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
            case "forced_subtitle":
            case "forced-subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (a.a("http://dashif.org/guidelines/trickmode", list.get(i11).schemeIdUri)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Descriptor descriptor = list.get(i10);
            if (a.a("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    public int parseSelectionFlagsFromDashRoleScheme(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Descriptor descriptor = list.get(i10);
            if (a.a("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return selectionFlagsFromDashRoleScheme;
    }

    @Nullable
    public Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        String str;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Descriptor descriptor = list.get(i10);
            if ((a.a("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || a.a("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                String[] strArrSplit = Util.split(str, VastAttributes.HORIZONTAL_POSITION);
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int parseTvaAudioPurposeCsValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        byte b10 = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b10 = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b10 = 1;
                }
                break;
            case 51:
                if (str.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                    b10 = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b10 = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b10 = 4;
                }
                break;
        }
        switch (b10) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @Nullable
    public UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, @Nullable UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    public UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    public static final class RepresentationInfo {
        public final ImmutableList<BaseUrl> baseUrls;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;

        @Nullable
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j10) {
            this.format = format;
            this.baseUrls = ImmutableList.copyOf((Collection) list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j10;
        }
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j10, long j11, int i10, long j12) {
        int iCeilDivide = i10 >= 0 ? i10 + 1 : (int) Util.ceilDivide(j12 - j10, j11);
        for (int i11 = 0; i11 < iCeilDivide; i11++) {
            list.add(buildSegmentTimelineElement(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    @Nullable
    private static String checkLanguageConsistency(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    public static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", null);
        String string3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(string, string2, string3);
    }

    public static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return text;
    }

    public AdaptationSet buildAdaptationSet(long j10, int i10, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(j10, i10, list, list2, list3, list4);
    }

    public EventMessage buildEvent(String str, String str2, long j10, long j11, byte[] bArr) {
        return new EventMessage(str, str2, j11, j10, bArr);
    }

    public EventStream buildEventStream(String str, String str2, long j10, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j10, jArr, eventMessageArr);
    }

    public DashManifest buildMediaPresentationDescription(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable ServiceDescriptionElement serviceDescriptionElement, @Nullable Uri uri, List<Period> list) {
        return new DashManifest(j10, j11, j12, z10, j13, j14, j15, j16, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    public Period buildPeriod(@Nullable String str, long j10, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        return new Period(str, j10, list, list2, descriptor);
    }

    public RangedUri buildRangedUri(String str, long j10, long j11) {
        return new RangedUri(str, j10, j11);
    }

    public SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j10, long j11, long j12, long j13, @Nullable List<SegmentBase.SegmentTimelineElement> list, long j14, @Nullable List<RangedUri> list2, long j15, long j16) {
        return new SegmentBase.SegmentList(rangedUri, j10, j11, j12, j13, list, j14, list2, Util.msToUs(j15), Util.msToUs(j16));
    }

    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j10, long j11, long j12, long j13, long j14, List<SegmentBase.SegmentTimelineElement> list, long j15, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j16, long j17) {
        return new SegmentBase.SegmentTemplate(rangedUri, j10, j11, j12, j13, j14, list, j15, urlTemplate, urlTemplate2, Util.msToUs(j16), Util.msToUs(j17));
    }

    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j10, long j11) {
        return new SegmentBase.SegmentTimelineElement(j10, j11);
    }

    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j10, long j11, long j12, long j13) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j10, j11, j12, j13);
    }

    public UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return parseMediaPresentationDescription(xmlPullParserNewPullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw ParserException.createForMalformedManifest(null, e10);
        }
    }

    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", null);
        string.hashCode();
        int dtsChannelConfiguration = -1;
        switch (string) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                dtsChannelConfiguration = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseInt(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                dtsChannelConfiguration = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                dtsChannelConfiguration = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return dtsChannelConfiguration;
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j10, long j11, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long j12 = parseLong(xmlPullParser, "id", 0L);
        long j13 = parseLong(xmlPullParser, "duration", -9223372036854775807L);
        long j14 = parseLong(xmlPullParser, "presentationTime", 0L);
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j13, 1000L, j10);
        long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j14 - j11, 1000000L, j10);
        String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jScaleLargeTimestamp2);
        if (string != null) {
            eventObject = Util.getUtf8Bytes(string);
        }
        return Pair.create(lValueOf, buildEvent(str, str2, j12, jScaleLargeTimestamp, eventObject));
    }

    public EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList;
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", "");
        long j10 = parseLong(xmlPullParser, "timescale", 1L);
        long j11 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j12 = j11;
                arrayList = arrayList2;
                arrayList.add(parseEvent(xmlPullParser, string, string2, j10, j12, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                arrayList = arrayList2;
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            j11 = j11;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            jArr[i10] = ((Long) pair.first).longValue();
            eventMessageArr[i10] = (EventMessage) pair.second;
        }
        return buildEventStream(string, string2, j10, jArr, eventMessageArr);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ea A[LOOP:0: B:25:0x00a7->B:82:0x01ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a6 A[SYNTHETIC] */
    public DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException {
        long j10;
        boolean z10;
        long j11;
        Throwable th2;
        ArrayList arrayList;
        boolean z11;
        long j12;
        DashManifestParser dashManifestParser = this;
        boolean zIsDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long j13 = -9223372036854775807L;
        long dateTime = parseDateTime(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long duration = parseDuration(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long duration2 = parseDuration(xmlPullParser, "minBufferTime", -9223372036854775807L);
        Throwable th3 = null;
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long duration3 = zEquals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long duration4 = zEquals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long duration5 = zEquals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long dateTime2 = parseDateTime(xmlPullParser, "publishTime", -9223372036854775807L);
        long availabilityTimeOffsetUs = zEquals ? 0L : -9223372036854775807L;
        boolean z12 = true;
        ArrayList arrayListL = Lists.l(new BaseUrl(uri.toString(), uri.toString(), zIsDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z13 = false;
        boolean z14 = false;
        long j14 = zEquals ? -9223372036854775807L : 0L;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTiming = null;
        Uri uriResolveToUri = null;
        ServiceDescriptionElement serviceDescription = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z13) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs);
                    z13 = z12;
                }
                arrayList3.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, arrayListL, zIsDvbProfileDeclared));
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                programInformation = parseProgramInformation(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                utcTiming = parseUtcTiming(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Location")) {
                uriResolveToUri = UriUtil.resolveToUri(uri.toString(), xmlPullParser.nextText());
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "ServiceDescription")) {
                    serviceDescription = parseServiceDescription(xmlPullParser);
                } else {
                    if (!XmlPullParserUtil.isStartTag(xmlPullParser, "Period") || z14) {
                        j10 = availabilityTimeOffsetUs;
                        z10 = z12;
                        j11 = j13;
                        th2 = th3;
                        arrayList = arrayList2;
                        maybeSkipTag(xmlPullParser);
                    } else {
                        j10 = availabilityTimeOffsetUs;
                        arrayList = arrayList2;
                        z10 = z12;
                        j11 = j13;
                        th2 = th3;
                        Pair<Period, Long> period = parsePeriod(xmlPullParser, !arrayList3.isEmpty() ? arrayList3 : arrayListL, j14, j10, dateTime, duration4, zIsDvbProfileDeclared);
                        Period period2 = (Period) period.first;
                        if (period2.startMs != j11) {
                            long jLongValue = ((Long) period.second).longValue();
                            long j15 = jLongValue == j11 ? j11 : period2.startMs + jLongValue;
                            arrayList.add(period2);
                            j14 = j15;
                            z11 = z14;
                        } else {
                            if (!zEquals) {
                                throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList.size(), th2);
                            }
                            arrayList = arrayList;
                            z11 = z10;
                        }
                        z14 = z11;
                    }
                    availabilityTimeOffsetUs = j10;
                }
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                    if (duration != j11) {
                        j12 = duration;
                    } else if (j14 != j11) {
                        j12 = j14;
                    } else {
                        if (!zEquals) {
                            throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th2);
                        }
                        j12 = duration;
                    }
                    if (arrayList.isEmpty()) {
                        throw ParserException.createForMalformedManifest("No periods found.", th2);
                    }
                    return buildMediaPresentationDescription(dateTime, j12, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriResolveToUri, arrayList);
                }
                arrayList2 = arrayList;
                th3 = th2;
                arrayList3 = arrayList3;
                z12 = z10;
                arrayListL = arrayListL;
                j13 = j11;
                dashManifestParser = this;
            }
            arrayList3 = arrayList3;
            arrayListL = arrayListL;
            z10 = z12;
            j11 = j13;
            th2 = th3;
            arrayList = arrayList2;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                if (duration != j11) {
                    j12 = duration;
                } else if (j14 != j11) {
                    j12 = j14;
                } else {
                    if (!zEquals) {
                        throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", th2);
                    }
                    j12 = duration;
                }
                if (arrayList.isEmpty()) {
                    return buildMediaPresentationDescription(dateTime, j12, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriResolveToUri, arrayList);
                }
                throw ParserException.createForMalformedManifest("No periods found.", th2);
            }
            arrayList2 = arrayList;
            th3 = th2;
            arrayList3 = arrayList3;
            z12 = z10;
            arrayListL = arrayListL;
            j13 = j11;
            dashManifestParser = this;
        }
    }

    public Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, List<BaseUrl> list, long j10, long j11, long j12, long j13, boolean z10) throws XmlPullParserException, IOException {
        ArrayList arrayList;
        List<AdaptationSet> list2;
        List<EventStream> list3;
        Object obj;
        long j14;
        SegmentBase segmentTemplate;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long duration = parseDuration(xmlPullParser2, "start", j10);
        long j15 = -9223372036854775807L;
        long j16 = j12 != -9223372036854775807L ? j12 + duration : -9223372036854775807L;
        long duration2 = parseDuration(xmlPullParser2, "duration", -9223372036854775807L);
        List<AdaptationSet> arrayList2 = new ArrayList<>();
        List<EventStream> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        long availabilityTimeOffsetUs = j11;
        boolean z11 = false;
        long j17 = -9223372036854775807L;
        SegmentBase segmentBase = null;
        Descriptor descriptor = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z11) {
                    availabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs);
                    z11 = true;
                }
                arrayList4.addAll(parseBaseUrl(xmlPullParser2, list, z10));
                list3 = arrayList3;
                arrayList = arrayList4;
                j14 = j15;
                obj = obj2;
                list2 = arrayList2;
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AdaptationSet")) {
                    availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                    arrayList = arrayList4;
                    list2 = arrayList2;
                    list2.add(parseAdaptationSet(xmlPullParser, !arrayList4.isEmpty() ? arrayList4 : list, segmentBase, duration2, availabilityTimeOffsetUs, j17, j16, j13, z10));
                    xmlPullParser2 = xmlPullParser;
                    list3 = arrayList3;
                } else {
                    availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                    List<EventStream> list4 = arrayList3;
                    arrayList = arrayList4;
                    list2 = arrayList2;
                    xmlPullParser2 = xmlPullParser;
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EventStream")) {
                        list4.add(parseEventStream(xmlPullParser));
                        list3 = list4;
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                        list3 = list4;
                        segmentBase = parseSegmentBase(xmlPullParser2, null);
                        obj = null;
                        availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                        j14 = -9223372036854775807L;
                    } else {
                        list3 = list4;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                            long availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            segmentTemplate = parseSegmentList(xmlPullParser, null, j16, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs2, j13);
                            j17 = availabilityTimeOffsetUs2;
                            j14 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                long availabilityTimeOffsetUs3 = parseAvailabilityTimeOffsetUs(xmlPullParser2, -9223372036854775807L);
                                j14 = -9223372036854775807L;
                                segmentTemplate = parseSegmentTemplate(xmlPullParser, null, ImmutableList.of(), j16, duration2, availabilityTimeOffsetUs, availabilityTimeOffsetUs3, j13);
                                j17 = availabilityTimeOffsetUs3;
                            } else {
                                j14 = -9223372036854775807L;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser);
                                }
                                availabilityTimeOffsetUs = availabilityTimeOffsetUs;
                            }
                        }
                        segmentBase = segmentTemplate;
                    }
                }
                obj = null;
                j14 = -9223372036854775807L;
                availabilityTimeOffsetUs = availabilityTimeOffsetUs;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, duration, list2, list3, descriptor), Long.valueOf(duration2));
            }
            arrayList2 = list2;
            arrayList4 = arrayList;
            obj2 = obj;
            arrayList3 = list3;
            j15 = j14;
        }
    }

    public ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xmlPullParser, "moreInformationURL", null);
        String string2 = parseString(xmlPullParser, Q6.f27460q, null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.TAG_COPYRIGHT)) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(strNextText, strNextText2, str, string, string2);
            }
            strNextText3 = str;
        }
    }

    public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, @Nullable SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long j10;
        long j11;
        long j12 = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long j13 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j14 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j15 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j16 = Long.parseLong(strArrSplit[0]);
            j10 = (Long.parseLong(strArrSplit[1]) - j16) + 1;
            j11 = j16;
        } else {
            j10 = j15;
            j11 = j14;
        }
        RangedUri initialization = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase"));
        return buildSingleSegmentBase(initialization, j12, j13, j11, j10);
    }

    public SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentList segmentList, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15 = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long j16 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long j17 = parseLong(xmlPullParser, "duration", segmentList != null ? segmentList.duration : -9223372036854775807L);
        long j18 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j12, j13);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        List<RangedUri> arrayList = null;
        RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j15, j11);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(parseSegmentUrl(xmlPullParser));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList"));
        if (segmentList != null) {
            if (initialization == null) {
                initialization = segmentList.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentList.segmentTimeline;
            }
            if (arrayList == null) {
                arrayList = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(initialization, j15, j16, j18, j17, segmentTimeline, finalAvailabilityTimeOffset, arrayList, j14, j10);
    }

    public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j10, long j11, long j12, long j13, long j14) throws XmlPullParserException, IOException {
        long j15 = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long j16 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long j17 = parseLong(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.duration : -9223372036854775807L);
        long j18 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j12, j13);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        UrlTemplate urlTemplate = parseUrlTemplate(xmlPullParser, C3426d4.i.I0, segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate urlTemplate2 = parseUrlTemplate(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j15, j11);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (segmentTemplate != null) {
            if (initialization == null) {
                initialization = segmentTemplate.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(initialization, j15, j16, j18, lastSegmentNumberSupplementalProperty, j17, segmentTimeline, finalAvailabilityTimeOffset, urlTemplate2, urlTemplate, j14, j10);
    }

    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j10, long j11) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        boolean z10 = false;
        int i10 = 0;
        long j12 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, ExifInterface.LATITUDE_SOUTH)) {
                long j13 = parseLong(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j12, i10, j13);
                }
                if (j13 == -9223372036854775807L) {
                    j13 = jAddSegmentTimelineElementsToList;
                }
                j12 = parseLong(xmlPullParser, "d", -9223372036854775807L);
                i10 = parseInt(xmlPullParser, "r", 0);
                z10 = true;
                jAddSegmentTimelineElementsToList = j13;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j12, i10, Util.scaleLargeTimestamp(j11, j10, 1000L));
        }
        return arrayList;
    }

    public RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, C3426d4.i.I0, "mediaRange");
    }

    public ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        float f10 = -3.4028235E38f;
        float f11 = -3.4028235E38f;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j10 = parseLong(xmlPullParser, TypedValues.AttributesType.S_TARGET, -9223372036854775807L);
                j11 = parseLong(xmlPullParser, "min", -9223372036854775807L);
                j12 = parseLong(xmlPullParser, "max", -9223372036854775807L);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f10 = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f11 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j13 = j10;
            long j14 = j11;
            long j15 = j12;
            float f12 = f10;
            float f13 = f11;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j13, j14, j15, f12, f13);
            }
            j10 = j13;
            j11 = j14;
            j12 = j15;
            f10 = f12;
            f11 = f13;
        }
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (arrayList.get(i10).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    @Nullable
    private static String getSampleMimeType(@Nullable String str, @Nullable String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (MimeTypes.isText(str) || MimeTypes.isImage(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            String mediaMimeType = MimeTypes.getMediaMimeType(str2);
            if ("text/vtt".equals(mediaMimeType)) {
                return "application/x-mp4-vtt";
            }
            return mediaMimeType;
        }
        return null;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (!XmlPullParserUtil.isStartTag(xmlPullParser)) {
            return;
        }
        int i10 = 1;
        while (i10 != 0) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                i10++;
            } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                i10--;
            }
        }
    }

    public static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int i10 = parseInt(xmlPullParser, "value", -1);
        if (i10 <= 0 || i10 >= 33) {
            return -1;
        }
        return i10;
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int i10 = parseInt(xmlPullParser, "value", -1);
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
        if (i10 >= iArr.length) {
            return -1;
        }
        return iArr[i10];
    }

    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, c.f64119c.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i10 = 0; i10 < xmlPullParser.getAttributeCount(); i10++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i10), xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }
}
