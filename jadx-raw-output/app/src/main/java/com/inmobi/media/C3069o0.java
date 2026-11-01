package com.inmobi.media;

import com.inmobi.ads.WatermarkData;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.inmobi.media.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3069o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC2995l1 f24925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f24926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f24927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f24928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WatermarkData f24929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AdQualityControl f24930n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte f24931o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f24932p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f24933q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f24934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2888gi f24935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C3053n9 f24936t;

    public C3069o0(String str, boolean z10, long j10, boolean z11, String str2, String str3, String str4, String str5, AbstractC2995l1 abstractC2995l1, String str6, LinkedHashMap linkedHashMap, Boolean bool, WatermarkData watermarkData, AdQualityControl adQualityControl, byte b10, LinkedHashSet linkedHashSet, String str7, String str8, C2888gi c2888gi, C3053n9 c3053n9) {
        ck.p.j(str8, "landingScheme");
        this.f24917a = str;
        this.f24918b = z10;
        this.f24919c = j10;
        this.f24920d = z11;
        this.f24921e = str2;
        this.f24922f = str3;
        this.f24923g = str4;
        this.f24924h = str5;
        this.f24925i = abstractC2995l1;
        this.f24926j = str6;
        this.f24927k = linkedHashMap;
        this.f24928l = bool;
        this.f24929m = watermarkData;
        this.f24930n = adQualityControl;
        this.f24931o = b10;
        this.f24932p = linkedHashSet;
        this.f24933q = str7;
        this.f24934r = str8;
        this.f24935s = c2888gi;
        this.f24936t = c3053n9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3069o0)) {
            return false;
        }
        C3069o0 c3069o0 = (C3069o0) obj;
        return ck.p.e(this.f24917a, c3069o0.f24917a) && this.f24918b == c3069o0.f24918b && this.f24919c == c3069o0.f24919c && this.f24920d == c3069o0.f24920d && ck.p.e(this.f24921e, c3069o0.f24921e) && ck.p.e(this.f24922f, c3069o0.f24922f) && ck.p.e(this.f24923g, c3069o0.f24923g) && ck.p.e(this.f24924h, c3069o0.f24924h) && ck.p.e(this.f24925i, c3069o0.f24925i) && ck.p.e(this.f24926j, c3069o0.f24926j) && ck.p.e(this.f24927k, c3069o0.f24927k) && ck.p.e(this.f24928l, c3069o0.f24928l) && ck.p.e(this.f24929m, c3069o0.f24929m) && ck.p.e(this.f24930n, c3069o0.f24930n) && this.f24931o == c3069o0.f24931o && ck.p.e(this.f24932p, c3069o0.f24932p) && ck.p.e(this.f24933q, c3069o0.f24933q) && ck.p.e(this.f24934r, c3069o0.f24934r) && ck.p.e(this.f24935s, c3069o0.f24935s) && ck.p.e(this.f24936t, c3069o0.f24936t);
    }

    public static C3069o0 a(C3069o0 c3069o0, C2888gi c2888gi, int i10) {
        String str = c3069o0.f24917a;
        boolean z10 = c3069o0.f24918b;
        long j10 = c3069o0.f24919c;
        boolean z11 = c3069o0.f24920d;
        String str2 = c3069o0.f24921e;
        String str3 = c3069o0.f24922f;
        String str4 = c3069o0.f24923g;
        String str5 = c3069o0.f24924h;
        String str6 = c3069o0.f24926j;
        LinkedHashMap linkedHashMap = c3069o0.f24927k;
        Boolean bool = c3069o0.f24928l;
        WatermarkData watermarkData = (i10 & 4096) != 0 ? c3069o0.f24929m : null;
        AdQualityControl adQualityControl = c3069o0.f24930n;
        byte b10 = c3069o0.f24931o;
        LinkedHashSet linkedHashSet = c3069o0.f24932p;
        String str7 = c3069o0.f24933q;
        String str8 = c3069o0.f24934r;
        C2888gi c2888gi2 = (i10 & 524288) != 0 ? c3069o0.f24935s : c2888gi;
        C3053n9 c3053n9 = c3069o0.f24936t;
        ck.p.j(str8, "landingScheme");
        return new C3069o0(str, z10, j10, z11, str2, str3, str4, str5, null, str6, linkedHashMap, bool, watermarkData, adQualityControl, b10, linkedHashSet, str7, str8, c2888gi2, c3053n9);
    }

    public final int hashCode() {
        String str = this.f24917a;
        int iHashCode = (Boolean.hashCode(this.f24920d) + ((Long.hashCode(this.f24919c) + ((Boolean.hashCode(this.f24918b) + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f24921e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24922f;
        int iHashCode3 = (this.f24923g.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.f24924h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC2995l1 abstractC2995l1 = this.f24925i;
        int iHashCode5 = (iHashCode4 + (abstractC2995l1 == null ? 0 : abstractC2995l1.hashCode())) * 31;
        String str5 = this.f24926j;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.f24927k;
        int iHashCode7 = (this.f24928l.hashCode() + ((iHashCode6 + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31)) * 31;
        WatermarkData watermarkData = this.f24929m;
        int iHashCode8 = (iHashCode7 + (watermarkData == null ? 0 : watermarkData.hashCode())) * 31;
        AdQualityControl adQualityControl = this.f24930n;
        int iHashCode9 = (this.f24932p.hashCode() + ((Byte.hashCode(this.f24931o) + ((iHashCode8 + (adQualityControl == null ? 0 : adQualityControl.hashCode())) * 31)) * 31)) * 31;
        String str6 = this.f24933q;
        int iHashCode10 = (this.f24934r.hashCode() + ((Boolean.hashCode(false) + ((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31)) * 31)) * 31;
        C2888gi c2888gi = this.f24935s;
        int iHashCode11 = (iHashCode10 + (c2888gi == null ? 0 : c2888gi.hashCode())) * 31;
        C3053n9 c3053n9 = this.f24936t;
        return Long.hashCode(-1L) + ((iHashCode11 + (c3053n9 != null ? c3053n9.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f24917a;
        boolean z10 = this.f24918b;
        long j10 = this.f24919c;
        boolean z11 = this.f24920d;
        String str2 = this.f24921e;
        String str3 = this.f24922f;
        String str4 = this.f24923g;
        String str5 = this.f24924h;
        AbstractC2995l1 abstractC2995l1 = this.f24925i;
        String str6 = this.f24926j;
        LinkedHashMap linkedHashMap = this.f24927k;
        Boolean bool = this.f24928l;
        WatermarkData watermarkData = this.f24929m;
        AdQualityControl adQualityControl = this.f24930n;
        byte b10 = this.f24931o;
        return "AdMetaData(adType=" + str + ", isImmersiveMode=" + z10 + ", placementId=" + j10 + ", allowAutoRedirection=" + z11 + ", creativeId=" + str2 + ", creativeType=" + str3 + ", markupTypeAdUnit=" + str4 + ", adSize=" + str5 + ", adPodHandler=" + abstractC2995l1 + ", contentURL=" + str6 + ", telemetryManagerMap=" + linkedHashMap + ", isHardwareAccelerationDisabled=" + bool + ", watermarkData=" + watermarkData + ", adQualityControl=" + adQualityControl + ", placementType=" + ((int) b10) + ", viewabilityTrackers=" + this.f24932p + ", impressionId=" + this.f24933q + ", isInAppBrowser=false, landingScheme=" + this.f24934r + ", renderViewMetaData=" + this.f24935s + ", logger=" + this.f24936t + ", viewTouchTimestamp=-1)";
    }
}
