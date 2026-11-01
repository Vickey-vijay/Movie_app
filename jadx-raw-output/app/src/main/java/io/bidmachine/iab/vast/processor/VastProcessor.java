package io.bidmachine.iab.vast.processor;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.TrackingEvent;
import io.bidmachine.iab.vast.VastLog;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VastSpecError;
import io.bidmachine.iab.vast.tags.AdContentTag;
import io.bidmachine.iab.vast.tags.AdTag;
import io.bidmachine.iab.vast.tags.AdVerificationsExtensionTag;
import io.bidmachine.iab.vast.tags.AppodealExtensionTag;
import io.bidmachine.iab.vast.tags.CompanionAdsCreativeTag;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.CreativeContentTag;
import io.bidmachine.iab.vast.tags.CreativeTag;
import io.bidmachine.iab.vast.tags.ExtensionTag;
import io.bidmachine.iab.vast.tags.InLineAdTag;
import io.bidmachine.iab.vast.tags.LinearCreativeTag;
import io.bidmachine.iab.vast.tags.MediaFileTag;
import io.bidmachine.iab.vast.tags.VastParser;
import io.bidmachine.iab.vast.tags.VastTag;
import io.bidmachine.iab.vast.tags.VideoClicksTag;
import io.bidmachine.iab.vast.tags.WrapperAdTag;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;
import vf.a;

/* JADX INFO: loaded from: classes2.dex */
public class VastProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VastRequest f59614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final VastMediaPicker f59615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Stack f59617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f59618e;

    public VastProcessor(@NonNull VastRequest vastRequest, @NonNull VastMediaPicker<MediaFileTag> vastMediaPicker) {
        this(vastRequest, vastMediaPicker, 5);
    }

    private Pair a(InLineAdTag inLineAdTag) {
        LinearCreativeTag linearCreativeTag;
        List<MediaFileTag> mediaFileTagList;
        List<CreativeTag> creativeTagList = inLineAdTag.getCreativeTagList();
        if (creativeTagList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (CreativeTag creativeTag : creativeTagList) {
            if (creativeTag != null) {
                CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                if ((creativeContentTag instanceof LinearCreativeTag) && (mediaFileTagList = (linearCreativeTag = (LinearCreativeTag) creativeContentTag).getMediaFileTagList()) != null && !mediaFileTagList.isEmpty()) {
                    Iterator<MediaFileTag> it = mediaFileTagList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair(linearCreativeTag, it.next()));
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Pair pairPickVideo = this.f59615b.pickVideo(arrayList);
        return pairPickVideo != null ? pairPickVideo : new Pair(null, null);
    }

    private boolean b() {
        return this.f59618e >= this.f59616c;
    }

    @NonNull
    public VastProcessorResult process(@Nullable String str) {
        VastSpecError vastSpecError;
        VastLog.d("VastProcessor", "process", new Object[0]);
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        try {
            VastTag vast = VastParser.parseVast(str);
            if (vast != null && vast.hasAd()) {
                return a(null, vast, new a());
            }
            vastSpecError = VastSpecError.XML_VALIDATE;
            vastProcessorResult.a(vastSpecError);
            return vastProcessorResult;
        } catch (Exception unused) {
            vastSpecError = VastSpecError.XML_PARSING;
        }
    }

    public VastProcessor(VastRequest vastRequest, VastMediaPicker vastMediaPicker, int i10) {
        this.f59618e = 0;
        this.f59614a = vastRequest;
        this.f59615b = vastMediaPicker;
        this.f59616c = i10;
        this.f59617d = new Stack();
    }

    private ArrayList a(AdContentTag adContentTag) {
        ArrayList arrayList = new ArrayList();
        List<CreativeTag> creativeTagList = adContentTag.getCreativeTagList();
        if (creativeTagList == null) {
            return arrayList;
        }
        for (CreativeTag creativeTag : creativeTagList) {
            if (creativeTag != null) {
                CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                if (creativeContentTag instanceof CompanionAdsCreativeTag) {
                    arrayList.addAll(((CompanionAdsCreativeTag) creativeContentTag).getCompanionTagList());
                }
            }
        }
        return arrayList;
    }

    public void b(AdContentTag adContentTag) {
        if (this.f59617d.empty()) {
            return;
        }
        int iSearch = this.f59617d.search(adContentTag);
        for (int i10 = 0; i10 < iSearch; i10++) {
            this.f59617d.pop();
        }
    }

    private ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f59617d.empty()) {
            return arrayList;
        }
        for (AdContentTag adContentTag : this.f59617d) {
            if (adContentTag != null && adContentTag.getErrorUrlList() != null) {
                arrayList.addAll(adContentTag.getErrorUrlList());
            }
        }
        return arrayList;
    }

    private VastProcessorResult b(InLineAdTag inLineAdTag) {
        VastSpecError vastSpecError;
        this.f59617d.push(inLineAdTag);
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        Pair pairA = a(inLineAdTag);
        if (pairA != null) {
            if (pairA.first == null && pairA.second == null) {
                vastSpecError = VastSpecError.BAD_FILE;
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<String> arrayList3 = new ArrayList<>();
                EnumMap enumMap = new EnumMap(TrackingEvent.class);
                ArrayList arrayList4 = new ArrayList();
                AppodealExtensionTag appodealExtensionTag = null;
                if (!this.f59617d.empty()) {
                    for (AdContentTag adContentTag : this.f59617d) {
                        if (adContentTag != null) {
                            if (adContentTag.getImpressionUrlList() != null) {
                                arrayList.addAll(adContentTag.getImpressionUrlList());
                            }
                            List<CreativeTag> creativeTagList = adContentTag.getCreativeTagList();
                            if (creativeTagList != null) {
                                for (CreativeTag creativeTag : creativeTagList) {
                                    if (creativeTag != null) {
                                        CreativeContentTag creativeContentTag = creativeTag.getCreativeContentTag();
                                        if (creativeContentTag instanceof LinearCreativeTag) {
                                            LinearCreativeTag linearCreativeTag = (LinearCreativeTag) creativeContentTag;
                                            VideoClicksTag videoClicksTag = linearCreativeTag.getVideoClicksTag();
                                            if (videoClicksTag != null && videoClicksTag.getClickTrackingUrlList() != null) {
                                                arrayList2.addAll(videoClicksTag.getClickTrackingUrlList());
                                            }
                                            a(enumMap, linearCreativeTag.getTrackingEventListMap());
                                        } else if (creativeContentTag instanceof CompanionAdsCreativeTag) {
                                            a(arrayList3, (CompanionAdsCreativeTag) creativeContentTag);
                                        }
                                    }
                                }
                            }
                            List<ExtensionTag> extensionTagList = adContentTag.getExtensionTagList();
                            if (extensionTagList != null) {
                                for (ExtensionTag extensionTag : extensionTagList) {
                                    if (extensionTag instanceof AppodealExtensionTag) {
                                        if (appodealExtensionTag == null) {
                                            appodealExtensionTag = (AppodealExtensionTag) extensionTag;
                                        }
                                    } else if (extensionTag instanceof AdVerificationsExtensionTag) {
                                        arrayList4.add((AdVerificationsExtensionTag) extensionTag);
                                    }
                                }
                            }
                        }
                    }
                }
                VastAd vastAd = new VastAd((LinearCreativeTag) pairA.first, (MediaFileTag) pairA.second);
                vastAd.d(arrayList);
                vastAd.c(a());
                vastAd.a(arrayList2);
                vastAd.setWrapperCompanionClickTrackingUrlList(arrayList3);
                vastAd.a(enumMap);
                vastAd.b(a((AdContentTag) inLineAdTag));
                vastAd.a(appodealExtensionTag);
                vastAd.setAdVerificationsExtensionList(arrayList4);
                vastProcessorResult.a(vastAd);
            }
            return vastProcessorResult;
        }
        vastSpecError = VastSpecError.XML_VALIDATE;
        vastProcessorResult.a(inLineAdTag, vastSpecError);
        return vastProcessorResult;
    }

    private VastProcessorResult a(AdContentTag adContentTag, VastTag vastTag, a aVar) {
        VastSpecError vastSpecError;
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        for (int i10 = 0; i10 < vastTag.getAdTagList().size(); i10++) {
            AdTag adTag = vastTag.getAdTagList().get(i10);
            if (adTag != null && adTag.getAdContentTag() != null) {
                AdContentTag adContentTag2 = adTag.getAdContentTag();
                if (adContentTag2 instanceof InLineAdTag) {
                    VastProcessorResult vastProcessorResultB = b((InLineAdTag) adContentTag2);
                    if (vastProcessorResultB.hasVastAd()) {
                        return vastProcessorResultB;
                    }
                    a(vastProcessorResultB.a());
                    if (adContentTag == null) {
                        vastProcessorResult.a(vastProcessorResultB.getVastSpecError());
                    } else if (vastProcessorResultB.b()) {
                        VastSpecError vastSpecError2 = vastProcessorResultB.getVastSpecError();
                        if (vastSpecError2 == null) {
                            vastSpecError2 = VastSpecError.UNKNOWN;
                        }
                        vastProcessorResult.a(adContentTag, vastSpecError2);
                    }
                } else if ((adContentTag2 instanceof WrapperAdTag) && aVar.c()) {
                    VastProcessorResult vastProcessorResultA = a((WrapperAdTag) adContentTag2);
                    if (vastProcessorResultA.hasVastAd()) {
                        return vastProcessorResultA;
                    }
                    a(vastProcessorResultA.a());
                    if (adContentTag != null) {
                        if (vastProcessorResultA.b()) {
                            vastSpecError = vastProcessorResultA.getVastSpecError();
                            if (vastSpecError == null) {
                                vastSpecError = VastSpecError.UNKNOWN;
                            }
                        } else {
                            vastSpecError = VastSpecError.WRAPPER_RESPONSE_NO_AD;
                        }
                        vastProcessorResult.a(adContentTag, vastSpecError);
                    } else {
                        vastProcessorResult.a(VastSpecError.WRAPPER_RESPONSE_NO_AD);
                    }
                    if (i10 == 0 && !aVar.b()) {
                        return vastProcessorResult;
                    }
                }
                b(adContentTag2);
            }
        }
        if (vastProcessorResult.getVastSpecError() == null && adContentTag != null) {
            vastProcessorResult.a(adContentTag, VastSpecError.WRAPPER_RESPONSE_NO_AD);
        }
        return vastProcessorResult;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public VastProcessorResult a(WrapperAdTag wrapperAdTag) {
        VastSpecError vastSpecError;
        VastProcessorResult vastProcessorResult = new VastProcessorResult();
        if (b()) {
            VastLog.e("VastProcessor", "VAST wrapping exceeded max limit of %d", Integer.valueOf(this.f59616c));
            vastSpecError = VastSpecError.EXCEEDED_WRAPPER_LIMIT;
        } else {
            this.f59618e++;
            this.f59617d.push(wrapperAdTag);
            if (!TextUtils.isEmpty(wrapperAdTag.getVastAdTagUri())) {
                a aVar = new a(wrapperAdTag);
                InputStream inputStream = null;
                try {
                    try {
                        try {
                            URLConnection uRLConnectionOpenConnection = new URL(wrapperAdTag.getVastAdTagUri()).openConnection();
                            int responseCode = ((HttpURLConnection) uRLConnectionOpenConnection).getResponseCode();
                            if (responseCode != 200) {
                                if (responseCode != 204) {
                                    vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                                    return vastProcessorResult;
                                }
                                VastLog.e("VastProcessor", "Wrapper response code: 204", new Object[0]);
                                vastProcessorResult.a(wrapperAdTag, VastSpecError.WRAPPER_RESPONSE_NO_AD);
                                return vastProcessorResult;
                            }
                            InputStream inputStream2 = uRLConnectionOpenConnection.getInputStream();
                            VastTag vast = VastParser.parseVast(inputStream2);
                            if (vast == null) {
                                VastLog.e("VastProcessor", "Invalid Vast", new Object[0]);
                                vastProcessorResult.a(wrapperAdTag, VastSpecError.XML_VALIDATE);
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception e10) {
                                        VastLog.e("VastProcessor", e10);
                                    }
                                }
                                return vastProcessorResult;
                            }
                            if (!vast.hasAd()) {
                                VastLog.e("VastProcessor", "Vast has no ad", new Object[0]);
                                vastProcessorResult.a(wrapperAdTag, VastSpecError.WRAPPER_RESPONSE_NO_AD);
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception e11) {
                                        VastLog.e("VastProcessor", e11);
                                    }
                                }
                                return vastProcessorResult;
                            }
                            if (vast.getAdTagList().size() > 1 && !aVar.a()) {
                                vastProcessorResult.a(wrapperAdTag, VastSpecError.GENERAL_WRAPPER);
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Exception e12) {
                                        VastLog.e("VastProcessor", e12);
                                    }
                                }
                                return vastProcessorResult;
                            }
                            VastProcessorResult vastProcessorResultA = a(wrapperAdTag, vast, aVar);
                            vastProcessorResultA.a(false);
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Exception e13) {
                                    VastLog.e("VastProcessor", e13);
                                }
                            }
                            return vastProcessorResultA;
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                try {
                                    inputStream.close();
                                } catch (Exception e14) {
                                    VastLog.e("VastProcessor", e14);
                                }
                            }
                            throw th2;
                        }
                    } catch (UnknownHostException e15) {
                        e = e15;
                        VastLog.e("VastProcessor", e);
                        vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (Exception e16) {
                                VastLog.e("VastProcessor", e16);
                            }
                        }
                        return vastProcessorResult;
                    } catch (ConnectTimeoutException e17) {
                        e = e17;
                        VastLog.e("VastProcessor", e);
                        vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                        if (0 != 0) {
                            inputStream.close();
                        }
                        return vastProcessorResult;
                    } catch (IOException e18) {
                        VastLog.e("VastProcessor", e18);
                        vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                        if (0 != 0) {
                            try {
                                inputStream.close();
                            } catch (Exception e19) {
                                VastLog.e("VastProcessor", e19);
                            }
                        }
                        return vastProcessorResult;
                    }
                } catch (MalformedURLException e20) {
                    VastLog.e("VastProcessor", e20);
                    vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e21) {
                            VastLog.e("VastProcessor", e21);
                        }
                    }
                    return vastProcessorResult;
                } catch (SocketTimeoutException e22) {
                    e = e22;
                    VastLog.e("VastProcessor", e);
                    vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                    if (0 != 0) {
                        inputStream.close();
                    }
                    return vastProcessorResult;
                } catch (SSLException e23) {
                    e = e23;
                    VastLog.e("VastProcessor", e);
                    vastProcessorResult.a(wrapperAdTag, VastSpecError.BAD_URI);
                    if (0 != 0) {
                        inputStream.close();
                    }
                    return vastProcessorResult;
                } catch (Exception e24) {
                    VastLog.e("VastProcessor", e24);
                    vastProcessorResult.a(wrapperAdTag, VastSpecError.XML_PARSING);
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (Exception e25) {
                            VastLog.e("VastProcessor", e25);
                        }
                    }
                    return vastProcessorResult;
                }
            }
            VastLog.e("VastProcessor", "VASTAdTagURI is null or empty", new Object[0]);
            vastSpecError = VastSpecError.BAD_URI;
        }
        vastProcessorResult.a(wrapperAdTag, vastSpecError);
        return vastProcessorResult;
    }

    private void a(Map map, Map map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            TrackingEvent trackingEvent = (TrackingEvent) entry.getKey();
            List arrayList = (List) map.get(trackingEvent);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(trackingEvent, arrayList);
            }
            arrayList.addAll((Collection) entry.getValue());
        }
    }

    private void a(List list, CompanionAdsCreativeTag companionAdsCreativeTag) {
        List<String> companionClickTrackingList;
        for (CompanionTag companionTag : companionAdsCreativeTag.getCompanionTagList()) {
            if (!companionTag.hasCreative() && (companionClickTrackingList = companionTag.getCompanionClickTrackingList()) != null) {
                list.addAll(companionClickTrackingList);
            }
        }
    }

    public void a(List list) {
        this.f59614a.fireErrorUrls(list, null);
    }
}
