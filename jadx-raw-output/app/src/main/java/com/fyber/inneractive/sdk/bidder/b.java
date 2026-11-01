package com.fyber.inneractive.sdk.bidder;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.Topic;
import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.v0;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.y0;
import com.fyber.inneractive.sdk.protobuf.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s1;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e, v0, com.fyber.inneractive.sdk.config.cellular.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f14883h = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f14884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f14885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f14886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f14887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f14888e = new AtomicReference(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f14889f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f14890g = new Object();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final byte[] a() {
        JSONArray jSONArrayA;
        l0 l0Var;
        byte b10;
        byte b11;
        r0 r0Var;
        l0 l0Var2;
        String str;
        k kVar = this.f14884a;
        kVar.f18286b = (z0) kVar.f18286b.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        k kVar2 = this.f14884a;
        this.f14886c.getClass();
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA = h.a("1.2");
        kVar2.c();
        ((TokenParametersOuterClass$TokenParameters) kVar2.f18286b).setVersion(nullableStringA);
        if (this.f14888e.get() != null) {
            this.f14886c.a();
        }
        k kVar3 = this.f14884a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA2 = h.a(this.f14886c.f14893b);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setUserAgent(nullableStringA2);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA3 = h.a(this.f14886c.f14894c);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setSdkVersion(nullableStringA3);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA4 = h.a(this.f14886c.f14895d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setBundleID(nullableStringA4);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA5 = h.a(this.f14886c.f14896e);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setDeviceModel(nullableStringA5);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA6 = h.a(this.f14886c.f14897f);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setAppVersion(nullableStringA6);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA7 = h.a(C3426d4.f28386d);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setDeviceOS(nullableStringA7);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A = h.a(Build.VERSION.SDK_INT);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setDeviceApi(nullableUInt32A);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA8 = h.a(Build.VERSION.RELEASE);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setOsVersion(nullableStringA8);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA9 = h.a(this.f14886c.f14898g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setDeviceLanguage(nullableStringA9);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA10 = h.a(this.f14886c.f14899h);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setCountryCode(nullableStringA10);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA11 = h.a(this.f14886c.f14900i);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setCarrierName(nullableStringA11);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA12 = h.a(this.f14886c.f14901j);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setMobileCountryCode(nullableStringA12);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA13 = h.a(this.f14886c.f14902k);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setMobileNetworkCode(nullableStringA13);
        Long l10 = this.f14886c.f14903l;
        x xVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
        if (l10 != null) {
            int iIntValue = l10.intValue();
            xVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableSInt32) xVarNewBuilder.f18286b).setData(iIntValue);
        }
        TokenParametersOuterClass$TokenParameters.NullableSInt32 nullableSInt32 = (TokenParametersOuterClass$TokenParameters.NullableSInt32) xVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setOffsetFromGMT(nullableSInt32);
        IAConfigManager iAConfigManager = IAConfigManager.O;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA14 = h.a(iAConfigManager.D.f15069g);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setUserID(nullableStringA14);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A2 = h.a(this.f14886c.f14904m);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setDeviceWidth(nullableUInt32A2);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A3 = h.a(this.f14886c.f14905n);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setDeviceHeight(nullableUInt32A3);
        q qVar = this.f14886c.f14906o;
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setFrameworkName(qVar);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA15 = h.a(this.f14886c.f14907p);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setInputLanguages(nullableStringA15);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA16 = h.a(this.f14886c.H);
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setMediationType(nullableStringA16);
        this.f14886c.getClass();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f15795p;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA17 = h.a(lVar != null ? lVar.getOdt() : "");
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setOdt(nullableStringA17);
        Integer numA = com.fyber.inneractive.sdk.serverapi.b.a();
        z zVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (numA != null) {
            int iIntValue2 = numA.intValue();
            zVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.f18286b).setData(iIntValue2);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.a();
        kVar3.c();
        ((TokenParametersOuterClass$TokenParameters) kVar3.f18286b).setAdServicesVersion(nullableUInt32);
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.D;
        if (gVar != null) {
            k kVar4 = this.f14884a;
            if (gVar.f15066d == null) {
                gVar.f15067e = gVar.h();
            }
            if (com.fyber.inneractive.sdk.util.o.f18599a == null) {
                str = null;
            } else {
                str = gVar.f15066d;
                if (str == null) {
                    str = gVar.f15067e;
                }
            }
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA18 = h.a(str);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f18286b).setGdprString(nullableStringA18);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA = h.a(gVar.d());
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f18286b).setGdprConsent(nullableBoolA);
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA19 = h.a(com.fyber.inneractive.sdk.util.o.f18599a == null ? null : gVar.f15070h);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f18286b).setCcpaString(nullableStringA19);
            TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA2 = h.a(com.fyber.inneractive.sdk.util.o.f18599a == null ? null : gVar.f15071i);
            kVar4.c();
            ((TokenParametersOuterClass$TokenParameters) kVar4.f18286b).setLgpdConsent(nullableBoolA2);
            Boolean bool = gVar.f15072j;
            if (bool != null && bool.booleanValue()) {
                k kVar5 = this.f14884a;
                TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA3 = h.a(bool);
                kVar5.c();
                ((TokenParametersOuterClass$TokenParameters) kVar5.f18286b).setCoppaApplies(nullableBoolA3);
            }
        }
        char c10 = 0;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            k kVar6 = this.f14884a;
            com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f15211a.f15219b;
            boolean z10 = vVar != null ? vVar.f15216b : false;
            kVar6.c();
            ((TokenParametersOuterClass$TokenParameters) kVar6.f18286b).setDnt(z10);
        }
        k kVar7 = this.f14884a;
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA20 = h.a(this.f14886c.f14908q);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setNetwork(nullableStringA20);
        d0 d0Var = this.f14886c.f14909r;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setSecureContent(d0Var);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA4 = h.a(this.f14886c.B);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setBatteryCharging(nullableBoolA4);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA5 = h.a(this.f14886c.f14910s);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setHeadsetPlugged(nullableBoolA5);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA6 = h.a(this.f14886c.f14911t);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setBluetoothPlugged(nullableBoolA6);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA7 = h.a(this.f14886c.f14912u);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setLowPowerMode(nullableBoolA7);
        boolean z11 = this.f14886c.f14913v;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setDarkMode(z11);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA8 = h.a(this.f14886c.f14914w);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setAirplaneMode(nullableBoolA8);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA9 = h.a(this.f14886c.f14915x);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setDndMode(nullableBoolA9);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA10 = h.a(this.f14886c.f14916y);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setIsRingMuted(nullableBoolA10);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A4 = h.a(this.f14886c.f14917z);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setSessionDuration(nullableUInt32A4);
        String str2 = this.f14886c.C;
        z zVarNewBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (!TextUtils.isEmpty(str2)) {
            int i10 = Integer.parseInt(str2);
            zVarNewBuilder2.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder2.f18286b).setData(i10);
        }
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt33 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder2.a();
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setBatteryLevel(nullableUInt33);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA11 = h.a(Boolean.valueOf(TextUtils.equals(iAConfigManager.f15029x.a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setPriorSkip(nullableBoolA11);
        TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt32A5 = h.a(this.f14886c.D);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setUserAge(nullableUInt32A5);
        InneractiveUserConfig.Gender gender = this.f14886c.E;
        n0 n0Var = gender == InneractiveUserConfig.Gender.FEMALE ? n0.FEMALE : gender == InneractiveUserConfig.Gender.MALE ? n0.MALE : n0.UNKNOWN;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setUserGender(n0Var);
        TokenParametersOuterClass$TokenParameters.NullableString nullableStringA21 = h.a(this.f14886c.G);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setZipCode(nullableStringA21);
        boolean z12 = this.f14886c.F;
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setMuteAudio(z12);
        TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA12 = h.a(this.f14886c.L);
        kVar7.c();
        ((TokenParametersOuterClass$TokenParameters) kVar7.f18286b).setMediaMuted(nullableBoolA12);
        com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.f15211a.f15219b;
        if (vVar2 != null ? vVar2.f15217c : false) {
            k kVar8 = this.f14884a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA22 = h.a(this.f14886c.A);
            kVar8.c();
            ((TokenParametersOuterClass$TokenParameters) kVar8.f18286b).setAmazonId(nullableStringA22);
        } else {
            k kVar9 = this.f14884a;
            TokenParametersOuterClass$TokenParameters.NullableString nullableStringA23 = h.a(this.f14886c.A);
            kVar9.c();
            ((TokenParametersOuterClass$TokenParameters) kVar9.f18286b).setAaid(nullableStringA23);
        }
        UnitDisplayType[] unitDisplayTypeArrValues = UnitDisplayType.values();
        int length = unitDisplayTypeArrValues.length;
        int i11 = 0;
        while (true) {
            byte b12 = 2;
            if (i11 >= length) {
                com.fyber.inneractive.sdk.serverapi.c cVar = this.f14885b;
                cVar.getClass();
                com.fyber.inneractive.sdk.config.global.r rVarA = com.fyber.inneractive.sdk.config.global.r.a();
                cVar.f18488a = rVarA;
                rVarA.a(false, "");
                com.fyber.inneractive.sdk.config.global.r rVar = this.f14885b.f18488a;
                if (rVar != null) {
                    jSONArrayA = com.fyber.inneractive.sdk.config.global.g.a(rVar.f15109b, true);
                    IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArrayA);
                } else {
                    jSONArrayA = null;
                }
                if (jSONArrayA != null) {
                    for (int i12 = 0; i12 < jSONArrayA.length(); i12++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayA.optJSONObject(i12);
                        if (jSONObjectOptJSONObject != null) {
                            n nVarNewBuilder = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                            String strOptString = jSONObjectOptJSONObject.optString("id");
                            nVarNewBuilder.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.f18286b).setIdentifier(strOptString);
                            String strOptString2 = jSONObjectOptJSONObject.optString("v");
                            nVarNewBuilder.c();
                            ((TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.f18286b).setVariant(strOptString2);
                            k kVar10 = this.f14884a;
                            TokenParametersOuterClass$TokenParameters.Experiment experiment = (TokenParametersOuterClass$TokenParameters.Experiment) nVarNewBuilder.a();
                            kVar10.c();
                            ((TokenParametersOuterClass$TokenParameters) kVar10.f18286b).addAbExperiments(experiment);
                        }
                    }
                }
                k kVar11 = this.f14884a;
                int i13 = com.fyber.inneractive.sdk.config.k.f15121a;
                String property = System.getProperty("ia.testEnvironmentConfiguration.number");
                z zVarNewBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
                if (!TextUtils.isEmpty(property)) {
                    int i14 = Integer.parseInt(property);
                    zVarNewBuilder3.c();
                    ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder3.f18286b).setData(i14);
                }
                TokenParametersOuterClass$TokenParameters.NullableUInt32 nullableUInt34 = (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder3.a();
                kVar11.c();
                ((TokenParametersOuterClass$TokenParameters) kVar11.f18286b).setPortal(nullableUInt34);
                k kVar12 = this.f14884a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA24 = h.a(System.getProperty("ia.testEnvironmentConfiguration.response"));
                kVar12.c();
                ((TokenParametersOuterClass$TokenParameters) kVar12.f18286b).setMockResponseId(nullableStringA24);
                k kVar13 = this.f14884a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA25 = h.a(this.f14886c.I);
                kVar13.c();
                ((TokenParametersOuterClass$TokenParameters) kVar13.f18286b).setIgniteVersion(nullableStringA25);
                k kVar14 = this.f14884a;
                TokenParametersOuterClass$TokenParameters.NullableString nullableStringA26 = h.a(this.f14886c.J);
                kVar14.c();
                ((TokenParametersOuterClass$TokenParameters) kVar14.f18286b).setIgnitePackageName(nullableStringA26);
                if (this.f14886c.K) {
                    k kVar15 = this.f14884a;
                    TokenParametersOuterClass$TokenParameters.NullableBool nullableBoolA13 = h.a(Boolean.TRUE);
                    kVar15.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar15.f18286b).setChildMode(nullableBoolA13);
                }
                ArrayList<EncryptedTopic> arrayList = this.f14886c.M;
                if (IAConfigManager.c() && arrayList != null && !arrayList.isEmpty()) {
                    for (EncryptedTopic encryptedTopic : arrayList) {
                        l lVarNewBuilder = TokenParametersOuterClass$TokenParameters.EncryptedTopic.newBuilder();
                        byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
                        com.fyber.inneractive.sdk.protobuf.q qVar2 = com.fyber.inneractive.sdk.protobuf.s.f18274b;
                        int length2 = encryptedTopic2.length;
                        com.fyber.inneractive.sdk.protobuf.s.a(0, length2, encryptedTopic2.length);
                        com.fyber.inneractive.sdk.protobuf.o oVar = com.fyber.inneractive.sdk.protobuf.s.f18275c;
                        com.fyber.inneractive.sdk.protobuf.q qVar3 = new com.fyber.inneractive.sdk.protobuf.q(oVar.a(encryptedTopic2, 0, length2));
                        lVarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f18286b).setEncryptedTopic(qVar3);
                        String keyIdentifier = encryptedTopic.getKeyIdentifier();
                        lVarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f18286b).setKeyIdentifier(keyIdentifier);
                        byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
                        int length3 = encapsulatedKey.length;
                        com.fyber.inneractive.sdk.protobuf.s.a(0, length3, encapsulatedKey.length);
                        com.fyber.inneractive.sdk.protobuf.q qVar4 = new com.fyber.inneractive.sdk.protobuf.q(oVar.a(encapsulatedKey, 0, length3));
                        lVarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.f18286b).setEncapsulatedKey(qVar4);
                        TokenParametersOuterClass$TokenParameters.EncryptedTopic encryptedTopic3 = (TokenParametersOuterClass$TokenParameters.EncryptedTopic) lVarNewBuilder.a();
                        k kVar16 = this.f14884a;
                        kVar16.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar16.f18286b).addEncryptedTopics(encryptedTopic3);
                    }
                }
                ArrayList<Topic> arrayList2 = this.f14886c.N;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    for (Topic topic : arrayList2) {
                        g0 g0VarNewBuilder = TokenParametersOuterClass$TokenParameters.Topic.newBuilder();
                        int topicId = topic.getTopicId();
                        g0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.Topic) g0VarNewBuilder.f18286b).setTopicId(topicId);
                        long modelVersion = topic.getModelVersion();
                        g0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.Topic) g0VarNewBuilder.f18286b).setModelVersion(modelVersion);
                        long taxonomyVersion = topic.getTaxonomyVersion();
                        g0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.Topic) g0VarNewBuilder.f18286b).setTaxonomyVersion(taxonomyVersion);
                        TokenParametersOuterClass$TokenParameters.Topic topic2 = (TokenParametersOuterClass$TokenParameters.Topic) g0VarNewBuilder.a();
                        k kVar17 = this.f14884a;
                        kVar17.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar17.f18286b).addTopics(topic2);
                    }
                }
                return ((TokenParametersOuterClass$TokenParameters) this.f14884a.a()).toByteArray();
            }
            UnitDisplayType unitDisplayType = unitDisplayTypeArrValues[i11];
            if (!unitDisplayType.isDeprecated()) {
                int[] iArr = g.f14919a;
                int i15 = iArr[unitDisplayType.ordinal()];
                if (i15 == 1) {
                    l0Var = l0.BANNER;
                } else if (i15 == 2) {
                    l0Var = l0.INTERSTITIAL;
                } else if (i15 == 3) {
                    l0Var = l0.REWARDED;
                } else if (i15 != 4) {
                    l0Var = i15 != 5 ? l0.UNITDISPLAYTYPEUNKNOWN : l0.TYPENATIVE;
                } else {
                    l0Var = l0.MRECT;
                }
                com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f18484a;
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                String strA = iAConfigManager2.f15029x.a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                if (!TextUtils.isEmpty(strA) && strA.contains(StringUtils.COMMA)) {
                    strA = strA.split(StringUtils.COMMA)[c10];
                }
                if (!TextUtils.isEmpty(strA)) {
                    k kVar18 = this.f14884a;
                    r rVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.f18286b).setAdomain(strA);
                    rVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.f18286b).setType(l0Var);
                    TokenParametersOuterClass$TokenParameters.LastAdomain lastAdomain = (TokenParametersOuterClass$TokenParameters.LastAdomain) rVarNewBuilder.a();
                    kVar18.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar18.f18286b).addLastAdomains(lastAdomain);
                }
                String strA2 = iAConfigManager2.f15029x.a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                if (!TextUtils.isEmpty(strA2)) {
                    k kVar19 = this.f14884a;
                    t tVarNewBuilder = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                    tVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.f18286b).setLastBundle(strA2);
                    tVarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.f18286b).setType(l0Var);
                    TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle lastAdvertisedBundle = (TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) tVarNewBuilder.a();
                    kVar19.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar19.f18286b).addLastAdvertisedBundles(lastAdvertisedBundle);
                }
                if (TextUtils.equals(iAConfigManager2.f15029x.a(unitDisplayType, "LAST_CLICKED"), "1")) {
                    k kVar20 = this.f14884a;
                    int i16 = iArr[unitDisplayType.ordinal()];
                    if (i16 == 1) {
                        b10 = 3;
                        b11 = 4;
                        l0Var2 = l0.BANNER;
                    } else if (i16 != 2) {
                        b10 = 3;
                        if (i16 != 3) {
                            b11 = 4;
                            l0Var2 = i16 != 4 ? i16 != 5 ? l0.UNITDISPLAYTYPEUNKNOWN : l0.TYPENATIVE : l0.MRECT;
                        } else {
                            b11 = 4;
                            l0Var2 = l0.REWARDED;
                        }
                    } else {
                        b10 = 3;
                        b11 = 4;
                        l0Var2 = l0.INTERSTITIAL;
                    }
                    kVar20.c();
                    ((TokenParametersOuterClass$TokenParameters) kVar20.f18286b).addPriorClicks(l0Var2);
                } else {
                    b10 = 3;
                    b11 = 4;
                }
                a("display", unitDisplayType, l0Var);
                if (unitDisplayType.isFullscreenUnit()) {
                    a("video", unitDisplayType, l0Var);
                    String strA3 = iAConfigManager2.f15029x.a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                    if (!TextUtils.isEmpty(strA3)) {
                        k kVar21 = this.f14884a;
                        a0 a0VarNewBuilder = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                        strA3.getClass();
                        switch (strA3.hashCode()) {
                            case 49:
                                b12 = strA3.equals("1") ? (byte) 0 : (byte) -1;
                                break;
                            case 50:
                                b12 = strA3.equals("2") ? (byte) 1 : (byte) -1;
                                break;
                            case 51:
                                if (!strA3.equals(ExifInterface.GPS_MEASUREMENT_3D)) {
                                    b12 = -1;
                                }
                                break;
                            case 52:
                                b12 = strA3.equals("4") ? b10 : (byte) -1;
                                break;
                            case 53:
                                b12 = strA3.equals(CampaignEx.CLICKMODE_ON) ? b11 : (byte) -1;
                                break;
                            default:
                                b12 = -1;
                                break;
                        }
                        switch (b12) {
                            case 0:
                                r0Var = r0.CTABUTTON;
                                break;
                            case 1:
                                r0Var = r0.COMPANION;
                                break;
                            case 2:
                                r0Var = r0.VIDEOVIEW;
                                break;
                            case 3:
                                r0Var = r0.APPINFO;
                                break;
                            case 4:
                                r0Var = r0.STOREPROMO;
                                break;
                            default:
                                r0Var = r0.NOCLICK;
                                break;
                        }
                        a0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.f18286b).setClickType(r0Var);
                        a0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.f18286b).setType(l0Var);
                        TokenParametersOuterClass$TokenParameters.PriorVideoClickType priorVideoClickType = (TokenParametersOuterClass$TokenParameters.PriorVideoClickType) a0VarNewBuilder.a();
                        kVar21.c();
                        ((TokenParametersOuterClass$TokenParameters) kVar21.f18286b).addPriorClickTypes(priorVideoClickType);
                    }
                }
            }
            i11++;
            c10 = 0;
        }
    }

    public final void b() {
        if (this.f14889f.compareAndSet(false, true)) {
            try {
                this.f14888e.set(Base64.encodeToString(a(), 2));
            } catch (Throwable th2) {
                IAlog.b("Failed to generate token with error: %s", th2.getMessage());
            }
            this.f14889f.set(false);
        }
    }

    public final void c() {
        int currentInterruptionFilter = ((NotificationManager) com.fyber.inneractive.sdk.util.o.f18599a.getSystemService("notification")).getCurrentInterruptionFilter();
        boolean z10 = currentInterruptionFilter >= 2 && currentInterruptionFilter <= 4;
        Boolean bool = this.f14886c.f14915x;
        if (bool == null || bool.booleanValue() != z10) {
            this.f14886c.f14915x = Boolean.valueOf(z10);
            d();
        }
    }

    public final void d() {
        com.fyber.inneractive.sdk.util.r.f18606a.execute(new a(this));
    }

    public b() {
        com.fyber.inneractive.sdk.config.cellular.a aVar;
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(com.fyber.inneractive.sdk.config.global.r.a());
        this.f14885b = cVar;
        d dVar = new d(cVar);
        this.f14886c = dVar;
        this.f14884a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        iAConfigManager.f15029x.f15224d = this;
        if (iAConfigManager.f15026u.f15195b.a(true, "bidding_token_wait_for_ua")) {
            s1 s1Var = iAConfigManager.f15030y;
            s1Var.b();
            if (!s1Var.f18617d.get()) {
                s1Var.c();
            }
            dVar.f14893b = iAConfigManager.f15030y.a();
        }
        if (!InneractiveAdManager.isCurrentUserAChild() && (aVar = iAConfigManager.N) != null) {
            try {
                aVar.f15040c.add(this);
            } catch (Throwable th2) {
                IAlog.a("failed to add network observer", th2, new Object[0]);
            }
        }
        f fVar = new f(this);
        this.f14887d = fVar;
        fVar.a();
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(com.fyber.inneractive.sdk.util.z0 z0Var) {
        if (TextUtils.equals(this.f14886c.f14908q, z0Var.b())) {
            return;
        }
        this.f14886c.f14908q = z0Var.b();
        d();
    }

    public final void a(String str, UnitDisplayType unitDisplayType, l0 l0Var) {
        ArrayList<com.fyber.inneractive.sdk.cache.session.g> arrayList;
        int i10;
        j0 j0Var;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        com.fyber.inneractive.sdk.cache.session.e eVar = iAConfigManager.f15029x.f15221a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.cache.session.k kVar = (com.fyber.inneractive.sdk.cache.session.k) eVar.f14949b.get(com.fyber.inneractive.sdk.cache.session.enums.c.a(unitDisplayType.value(), str));
            TokenParametersOuterClass$TokenParameters.UserSession userSession = null;
            if (kVar != null) {
                ArrayList arrayList2 = new ArrayList(kVar);
                Collections.sort(arrayList2, new com.fyber.inneractive.sdk.cache.session.j());
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = null;
            }
            try {
                i10 = Integer.parseInt(iAConfigManager.f15026u.f15195b.a("number_of_sessions", Integer.toString(5)));
            } catch (Throwable unused) {
                i10 = 5;
            }
            int i11 = i10 >= 0 ? i10 : 5;
            if (i11 > 0 && arrayList != null && arrayList.size() >= i11) {
                if (str.equals("video")) {
                    j0Var = j0.VIDEO;
                } else if (!str.equals("display")) {
                    j0Var = j0.UNITCONTENTTYPEUNKNOWN;
                } else {
                    j0Var = j0.DISPLAY;
                }
                o0 o0VarNewBuilder = TokenParametersOuterClass$TokenParameters.UserSession.newBuilder();
                o0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f18286b).setSubType(j0Var);
                int i12 = 0;
                for (com.fyber.inneractive.sdk.cache.session.g gVar : arrayList) {
                    e0 e0VarNewBuilder = TokenParametersOuterClass$TokenParameters.SessionData.newBuilder();
                    int i13 = gVar.f14955b;
                    e0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f18286b).setClicks(i13);
                    int i14 = gVar.f14954a;
                    e0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f18286b).setImpressions(i14);
                    if (str.equals("video") || l0Var.equals(l0.REWARDED)) {
                        int i15 = gVar.f14956c;
                        e0VarNewBuilder.c();
                        ((TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.f18286b).setCompletions(i15);
                    }
                    TokenParametersOuterClass$TokenParameters.SessionData sessionData = (TokenParametersOuterClass$TokenParameters.SessionData) e0VarNewBuilder.a();
                    o0VarNewBuilder.c();
                    ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f18286b).addSessionDataItems(sessionData);
                    i12++;
                    if (i12 >= i11) {
                        break;
                    }
                }
                o0VarNewBuilder.c();
                ((TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.f18286b).setType(l0Var);
                userSession = (TokenParametersOuterClass$TokenParameters.UserSession) o0VarNewBuilder.a();
            }
            if (userSession == null || userSession.getSessionDataItemsList().size() <= 0) {
                return;
            }
            k kVar2 = this.f14884a;
            kVar2.c();
            ((TokenParametersOuterClass$TokenParameters) kVar2.f18286b).addUserSessions(userSession);
        }
    }
}
