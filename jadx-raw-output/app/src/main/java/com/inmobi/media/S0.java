package com.inmobi.media;

import android.webkit.URLUtil;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MRC50Params;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.Trackers;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.common.model.Viewability;
import com.inmobi.media.ads.network.common.model.ViewabilityParams;
import com.inmobi.media.ads.network.inmobiJson.model.Icon;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class S0 {
    /* JADX WARN: Code duplicated, block: B:101:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02de  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:124:0x0305  */
    /* JADX WARN: Code duplicated, block: B:130:0x031a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0322  */
    /* JADX WARN: Code duplicated, block: B:136:0x032d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0338  */
    /* JADX WARN: Code duplicated, block: B:141:0x0345  */
    /* JADX WARN: Code duplicated, block: B:142:0x0348  */
    /* JADX WARN: Code duplicated, block: B:145:0x0354  */
    /* JADX WARN: Code duplicated, block: B:147:0x035a  */
    /* JADX WARN: Code duplicated, block: B:148:0x035d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0367  */
    /* JADX WARN: Code duplicated, block: B:153:0x0378  */
    /* JADX WARN: Code duplicated, block: B:155:0x0382  */
    /* JADX WARN: Code duplicated, block: B:157:0x0388  */
    /* JADX WARN: Code duplicated, block: B:158:0x038b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0395  */
    /* JADX WARN: Code duplicated, block: B:163:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:165:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:167:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0271  */
    /* JADX WARN: Code duplicated, block: B:83:0x027d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0283  */
    /* JADX WARN: Code duplicated, block: B:87:0x028d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0299  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14, types: [short] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26 */
    public static final void a(C3070o1 c3070o1, AdResponse adResponse, bk.p pVar, bk.l lVar) {
        int i10;
        List listK;
        String creativeType;
        F f10;
        int i11;
        E e10;
        String creativeType2;
        MRC50Params mrc50;
        String creativeType3;
        ViewabilityParams inmobi;
        boolean z10;
        Object objB;
        InMobiJsonResponse inMobiJsonResponse;
        ?? r14;
        JsonAssetObject assetsObject;
        JsonAssetObject assetsObject2;
        JsonAssetObject assetsObject3;
        Icon icon;
        boolean required;
        NativeMedia media;
        NativeMedia media2;
        NativeVideo video;
        boolean required2;
        Icon icon2;
        NativeMedia media3;
        String str;
        NativeImage image;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        Gg pubContent;
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(adResponse, "adResponse");
        ck.p.j(pVar, "onSuccess");
        ck.p.j(lVar, "onFailure");
        C3095p1 c3095p1 = c3070o1.f24937a;
        ck.p.j(adResponse, "adResponse");
        ck.p.j(c3095p1, "adManagerContext");
        AdSet adSet = (AdSet) nj.b0.h0(adResponse.getAdSets());
        int i12 = 10;
        String str2 = "video";
        int i13 = 0;
        if (adSet == null) {
            listK = nj.s.k();
            i10 = 10;
        } else {
            String str3 = "native";
            AdConfig adConfig = c3095p1.f25028b;
            adSet.isPod();
            D d10 = new D(adSet.getAdSetId(), adResponse.getRequestId(), adSet.isRewarded());
            LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2 = adSet.getAds();
            ArrayList arrayList = new ArrayList(nj.t.v(ads2, 10));
            Iterator it = ads2.iterator();
            int i14 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i15 = i14 + 1;
                if (i14 < 0) {
                    nj.s.u();
                }
                com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) next;
                MetaInfo metaInfo = ad2.getMetaInfo();
                String str4 = "unknown";
                if (metaInfo == null || (creativeType = metaInfo.getCreativeType()) == null) {
                    creativeType = "unknown";
                }
                Viewability viewability = (Viewability) nj.b0.i0(ad2.getViewability(), i13);
                if (viewability == null || (inmobi = viewability.getInmobi()) == null) {
                    i11 = 0;
                    f10 = new F(adConfig.getNative().getViewabilityConfig().getImpressionConfig().getImpressionType(), ad2.getImpressionId(), H.b(creativeType, str3, adConfig), H.a(creativeType, str3, adConfig), new int[0]);
                } else {
                    int iA = H.a(inmobi.getTime());
                    int iA2 = H.a(inmobi.getView());
                    H.a(inmobi.getPixel());
                    if (iA == -1) {
                        iA = H.b(creativeType, str3, adConfig);
                    }
                    int i16 = iA;
                    if (iA2 == -1) {
                        iA2 = H.a(creativeType, str3, adConfig);
                    }
                    f10 = new F(inmobi.getType(), ad2.getImpressionId(), i16, iA2, inmobi.getFrame());
                    i11 = 0;
                }
                Viewability viewability2 = (Viewability) nj.b0.i0(ad2.getViewability(), i11);
                if (viewability2 == null || (mrc50 = viewability2.getMrc50()) == null) {
                    MetaInfo metaInfo2 = ad2.getMetaInfo();
                    if (metaInfo2 != null && (creativeType2 = metaInfo2.getCreativeType()) != null) {
                        str4 = creativeType2;
                    }
                    e10 = new E(ck.p.e(str4, str2) ? adConfig.getNative().getViewabilityConfig().getMrc50Config().getVideoMinTimeViewed() : adConfig.getNative().getViewabilityConfig().getMrc50Config().getMinTimeViewed(), 50);
                } else {
                    int iA3 = H.a(mrc50.getTime());
                    int iA4 = H.a(mrc50.getView());
                    if (iA3 == -1 || iA4 == -1) {
                        MetaInfo metaInfo3 = ad2.getMetaInfo();
                        if (metaInfo3 != null && (creativeType3 = metaInfo3.getCreativeType()) != null) {
                            str4 = creativeType3;
                        }
                        e10 = new E(ck.p.e(str4, str2) ? adConfig.getNative().getViewabilityConfig().getMrc50Config().getVideoMinTimeViewed() : adConfig.getNative().getViewabilityConfig().getMrc50Config().getMinTimeViewed(), 50);
                    } else {
                        e10 = new E(iA3, iA4);
                    }
                }
                E e11 = e10;
                String markupType = ad2.getMarkupType();
                MetaInfo metaInfo4 = ad2.getMetaInfo();
                String creativeId = ad2.getCreativeId();
                Iterator it2 = it;
                ArrayList arrayList2 = arrayList;
                String tracking = ad2.getTracking();
                D d11 = d10;
                List<Trackers> trackers$media_release = ad2.getTrackers$media_release();
                List<TrackingInfo> trackingInfo$media_release = ad2.getTrackingInfo$media_release();
                ad2.getAllowAutoRedirection();
                arrayList2.add(new G(d11, markupType, metaInfo4, creativeId, tracking, trackers$media_release, trackingInfo$media_release, ad2.getContextData(), ad2.getTelemetryMetadataBlob(), ad2.getInsertionTimestampInMillis(), ad2.getExpiryTimestampInMillis(), ad2.getTransaction(), f10, e11, c3095p1));
                i12 = 10;
                arrayList = arrayList2;
                i14 = i15;
                it = it2;
                d10 = d11;
                adConfig = adConfig;
                str3 = str3;
                str2 = str2;
                i13 = 0;
            }
            i10 = i12;
            listK = arrayList;
        }
        String str5 = str2;
        ArrayList arrayList3 = new ArrayList(nj.t.v(listK, i10));
        Iterator it3 = listK.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new C3292x(c3070o1, (G) it3.next()));
        }
        C3292x c3292x = (C3292x) nj.b0.h0(arrayList3);
        AdSet adSet2 = (AdSet) nj.b0.h0(adResponse.getAdSets());
        if (adSet2 != null && (ads = adSet2.getAds()) != null) {
            z10 = false;
            com.inmobi.media.ads.network.common.model.Ad ad3 = (com.inmobi.media.ads.network.common.model.Ad) nj.b0.i0(ads, 0);
            if (ad3 != null && (pubContent = ad3.getPubContent()) != null) {
                objB = pubContent.b();
            }
            if (c3292x == null) {
                lVar.invoke((short) 55);
                return;
            }
            if (!(objB instanceof InMobiJsonResponse)) {
                lVar.invoke((short) 56);
                return;
            }
            inMobiJsonResponse = (InMobiJsonResponse) objB;
            if (inMobiJsonResponse == null && (assetsObject = inMobiJsonResponse.getAssetsObject()) != null) {
                assetsObject2 = inMobiJsonResponse.getAssetsObject();
                if (assetsObject2.getIcon() == null || assetsObject2.getMedia() != null) {
                    assetsObject3 = inMobiJsonResponse.getAssetsObject();
                    icon = assetsObject3.getIcon();
                    if (icon != null) {
                        required = icon.getRequired();
                    } else {
                        required = z10;
                    }
                    media = assetsObject3.getMedia();
                    if (ck.p.e(media != null ? media.getType() : null, "static")) {
                        image = assetsObject3.getMedia().getImage();
                        if (image != null) {
                            required2 = image.getRequired();
                        } else {
                            required2 = z10;
                        }
                    } else {
                        media2 = assetsObject3.getMedia();
                        if (media2 != null || (video = media2.getVideo()) == null) {
                            required2 = z10;
                        } else {
                            required2 = video.getRequired();
                        }
                    }
                    if (!required || required2) {
                        icon2 = assetsObject.getIcon();
                        if (icon2 == null && icon2.getRequired() && !URLUtil.isNetworkUrl(icon2.getUrl())) {
                            r14 = 2303;
                        } else {
                            media3 = assetsObject.getMedia();
                            if (media3 == null) {
                                r14 = z10;
                            } else if (media3.getType().length() != 0) {
                                if (lk.x.E(media3.getType(), "static", true)) {
                                    str = str5;
                                } else {
                                    str = str5;
                                    if (!lk.x.E(media3.getType(), str, true)) {
                                        r14 = 2306;
                                    }
                                }
                                if (lk.x.E(media3.getType(), "static", true)) {
                                    if (media3.getImage() == null) {
                                        r14 = 2304;
                                    } else if (!media3.getImage().getRequired() && media3.getImage().getAssets().isEmpty()) {
                                        r14 = 2307;
                                    } else if (!lk.x.E(media3.getType(), str, true)) {
                                        r14 = z10;
                                    } else if (media3.getVideo() == null) {
                                        r14 = 2305;
                                    } else if (media3.getVideo().getRequired()) {
                                        r14 = z10;
                                    } else {
                                        r14 = z10;
                                    }
                                } else if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired() || media3.getVideo().getVastTag().length() != 0) {
                                    r14 = z10;
                                } else {
                                    r14 = 2308;
                                }
                            } else {
                                r14 = 2306;
                            }
                        }
                    } else {
                        r14 = 2302;
                    }
                } else {
                    r14 = 2301;
                }
            } else {
                r14 = 2300;
            }
            if (r14 != 0) {
                lVar.invoke(Short.valueOf((short) r14));
            } else {
                pVar.mo1invoke(c3292x, objB);
            }
        }
        z10 = false;
        objB = null;
        if (c3292x == null) {
            lVar.invoke((short) 55);
            return;
        }
        if (!(objB instanceof InMobiJsonResponse)) {
            lVar.invoke((short) 56);
            return;
        }
        inMobiJsonResponse = (InMobiJsonResponse) objB;
        if (inMobiJsonResponse == null) {
            r14 = 2300;
        } else {
            assetsObject2 = inMobiJsonResponse.getAssetsObject();
            if (assetsObject2.getIcon() == null) {
                assetsObject3 = inMobiJsonResponse.getAssetsObject();
                icon = assetsObject3.getIcon();
                if (icon != null) {
                    required = icon.getRequired();
                } else {
                    required = z10;
                }
                media = assetsObject3.getMedia();
                if (ck.p.e(media != null ? media.getType() : null, "static")) {
                    image = assetsObject3.getMedia().getImage();
                    if (image != null) {
                        required2 = image.getRequired();
                    } else {
                        required2 = z10;
                    }
                } else {
                    media2 = assetsObject3.getMedia();
                    if (media2 != null) {
                        required2 = z10;
                    } else {
                        required2 = z10;
                    }
                }
                if (required) {
                    icon2 = assetsObject.getIcon();
                    if (icon2 == null) {
                        media3 = assetsObject.getMedia();
                        if (media3 == null) {
                            r14 = z10;
                        } else if (media3.getType().length() != 0) {
                            if (lk.x.E(media3.getType(), "static", true)) {
                                str = str5;
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = 2306;
                                }
                            } else {
                                str = str5;
                            }
                            if (lk.x.E(media3.getType(), "static", true)) {
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    r14 = z10;
                                } else {
                                    r14 = z10;
                                }
                            } else if (media3.getImage() == null) {
                                r14 = 2304;
                            } else if (!media3.getImage().getRequired()) {
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    r14 = z10;
                                } else {
                                    r14 = z10;
                                }
                            } else if (!lk.x.E(media3.getType(), str, true)) {
                                r14 = z10;
                            } else if (media3.getVideo() == null) {
                                r14 = 2305;
                            } else if (media3.getVideo().getRequired()) {
                                r14 = z10;
                            } else {
                                r14 = z10;
                            }
                        } else {
                            r14 = 2306;
                        }
                    } else {
                        r14 = 2303;
                    }
                } else {
                    icon2 = assetsObject.getIcon();
                    if (icon2 == null) {
                        media3 = assetsObject.getMedia();
                        if (media3 == null) {
                            r14 = z10;
                        } else if (media3.getType().length() != 0) {
                            if (lk.x.E(media3.getType(), "static", true)) {
                                str = str5;
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = 2306;
                                }
                            } else {
                                str = str5;
                            }
                            if (lk.x.E(media3.getType(), "static", true)) {
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    r14 = z10;
                                } else {
                                    r14 = z10;
                                }
                            } else if (media3.getImage() == null) {
                                r14 = 2304;
                            } else if (!media3.getImage().getRequired()) {
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    r14 = z10;
                                } else {
                                    r14 = z10;
                                }
                            } else if (!lk.x.E(media3.getType(), str, true)) {
                                r14 = z10;
                            } else if (media3.getVideo() == null) {
                                r14 = 2305;
                            } else if (media3.getVideo().getRequired()) {
                                r14 = z10;
                            } else {
                                r14 = z10;
                            }
                        } else {
                            r14 = 2306;
                        }
                    } else {
                        r14 = 2303;
                    }
                }
            } else {
                assetsObject3 = inMobiJsonResponse.getAssetsObject();
                icon = assetsObject3.getIcon();
                if (icon != null) {
                    required = icon.getRequired();
                } else {
                    required = z10;
                }
                media = assetsObject3.getMedia();
                if (ck.p.e(media != null ? media.getType() : null, "static")) {
                    image = assetsObject3.getMedia().getImage();
                    if (image != null) {
                        required2 = image.getRequired();
                    } else {
                        required2 = z10;
                    }
                } else {
                    media2 = assetsObject3.getMedia();
                    if (media2 != null) {
                        required2 = z10;
                    } else {
                        required2 = z10;
                    }
                }
                if (required) {
                    icon2 = assetsObject.getIcon();
                    if (icon2 == null) {
                        media3 = assetsObject.getMedia();
                        if (media3 == null) {
                            r14 = z10;
                        } else if (media3.getType().length() != 0) {
                            if (lk.x.E(media3.getType(), "static", true)) {
                                str = str5;
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = 2306;
                                }
                            } else {
                                str = str5;
                            }
                            if (lk.x.E(media3.getType(), "static", true)) {
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    r14 = z10;
                                } else {
                                    r14 = z10;
                                }
                            } else if (media3.getImage() == null) {
                                r14 = 2304;
                            } else if (!media3.getImage().getRequired()) {
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    r14 = z10;
                                } else {
                                    r14 = z10;
                                }
                            } else if (!lk.x.E(media3.getType(), str, true)) {
                                r14 = z10;
                            } else if (media3.getVideo() == null) {
                                r14 = 2305;
                            } else if (media3.getVideo().getRequired()) {
                                r14 = z10;
                            } else {
                                r14 = z10;
                            }
                        } else {
                            r14 = 2306;
                        }
                    } else {
                        r14 = 2303;
                    }
                } else {
                    icon2 = assetsObject.getIcon();
                    if (icon2 == null) {
                        media3 = assetsObject.getMedia();
                        if (media3 == null) {
                            r14 = z10;
                        } else if (media3.getType().length() != 0) {
                            if (lk.x.E(media3.getType(), "static", true)) {
                                str = str5;
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = 2306;
                                }
                            } else {
                                str = str5;
                            }
                            if (lk.x.E(media3.getType(), "static", true)) {
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    r14 = z10;
                                } else {
                                    r14 = z10;
                                }
                            } else if (media3.getImage() == null) {
                                r14 = 2304;
                            } else if (!media3.getImage().getRequired()) {
                                if (!lk.x.E(media3.getType(), str, true)) {
                                    r14 = z10;
                                } else if (media3.getVideo() == null) {
                                    r14 = 2305;
                                } else if (media3.getVideo().getRequired()) {
                                    r14 = z10;
                                } else {
                                    r14 = z10;
                                }
                            } else if (!lk.x.E(media3.getType(), str, true)) {
                                r14 = z10;
                            } else if (media3.getVideo() == null) {
                                r14 = 2305;
                            } else if (media3.getVideo().getRequired()) {
                                r14 = z10;
                            } else {
                                r14 = z10;
                            }
                        } else {
                            r14 = 2306;
                        }
                    } else {
                        r14 = 2303;
                    }
                }
            }
        }
        if (r14 != 0) {
            lVar.invoke(Short.valueOf((short) r14));
        } else {
            pVar.mo1invoke(c3292x, objB);
        }
    }
}
