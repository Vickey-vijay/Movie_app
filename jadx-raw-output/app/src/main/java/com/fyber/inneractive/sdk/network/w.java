package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f16126h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f16127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f16128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f16129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONArray f16130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f16131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f16132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16133g;

    public w(t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f16128b = tVar;
        this.f16127a = null;
        this.f16130d = null;
    }

    public final w a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i10 = 0; i10 < objArr.length - 1; i10 += 2) {
                String string = objArr[i10].toString();
                Object obj = objArr[i10 + 1];
                try {
                    jSONObject.put(string, obj);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", string, obj);
                }
            }
            this.f16132f.put(jSONObject);
        }
        return this;
    }

    public w(t tVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f16128b = tVar;
        this.f16127a = inneractiveAdRequest;
        this.f16130d = null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0150  */
    /* JADX WARN: Code duplicated, block: B:103:0x015b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0168  */
    /* JADX WARN: Code duplicated, block: B:107:0x016a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0175  */
    /* JADX WARN: Code duplicated, block: B:111:0x0178  */
    /* JADX WARN: Code duplicated, block: B:90:0x0126  */
    /* JADX WARN: Code duplicated, block: B:93:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x0136  */
    public final void a(String str) {
        String str2;
        String str3;
        Long l10;
        String str4;
        String str5;
        String campaignId;
        String str6;
        String spotId;
        StringBuilder sb2;
        com.fyber.inneractive.sdk.response.e eVar;
        UnitDisplayType unitDisplayTypeA;
        String lowerCase;
        com.fyber.inneractive.sdk.response.e eVar2;
        Integer numValueOf;
        com.fyber.inneractive.sdk.response.e eVar3;
        String str7;
        InneractiveAdRequest inneractiveAdRequest;
        com.fyber.inneractive.sdk.response.e eVar4;
        boolean zIsDeprecated;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        if (IAConfigManager.d() && !u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED.equals(this.f16129c)) {
            String strA = IAlog.a(this);
            Object obj = this.f16129c;
            if (obj == null) {
                obj = this.f16128b;
            }
            IAlog.a("%sSdk event dispatcher - aborting dispatch: %s", strA, obj);
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar5 = this.f16131e;
        if (eVar5 != null) {
            ImpressionData impressionData = eVar5.f18451t;
            String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
            ImpressionData impressionData2 = this.f16131e.f18451t;
            String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.f16131e.f18451t;
            Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
            ImpressionData impressionData4 = this.f16131e.f18451t;
            String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
            ImpressionData impressionData5 = this.f16131e.f18451t;
            String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
            ImpressionData impressionData6 = this.f16131e.f18451t;
            if (impressionData6 != null) {
                str2 = impressionId;
                str3 = demandSource;
                l10 = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
                campaignId = impressionData6.getCampaignId();
            } else {
                str2 = impressionId;
                campaignId = null;
                str3 = demandSource;
                l10 = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
            }
        } else {
            str2 = null;
            str3 = null;
            l10 = null;
            str4 = null;
            str5 = null;
            campaignId = null;
        }
        IAConfigManager iAConfigManager = IAConfigManager.O;
        y yVar = new y(iAConfigManager.f15008c, str2, str3, l10, str4, str5, campaignId, str);
        InneractiveAdRequest inneractiveAdRequest2 = this.f16127a;
        com.fyber.inneractive.sdk.config.s0 selectedUnitConfig = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig != null) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) selectedUnitConfig;
            com.fyber.inneractive.sdk.config.o0 o0Var = r0Var.f15147d;
            Track track = Track.ERRORS;
            Set set = o0Var.f15139a;
            if (!(set == null ? false : set.contains(track))) {
                return;
            }
            com.fyber.inneractive.sdk.config.l0 l0Var = r0Var.f15146c;
            if (l0Var != null && (unitDisplayType2 = l0Var.f15131b) != null) {
                zIsDeprecated = unitDisplayType2.isDeprecated();
            } else {
                com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f15149f;
                zIsDeprecated = (t0Var == null || (unitDisplayType = t0Var.f15209j) == null) ? false : unitDisplayType.isDeprecated();
            }
            if (zIsDeprecated) {
                return;
            }
        }
        if (selectedUnitConfig == null && (eVar4 = this.f16131e) != null) {
            com.fyber.inneractive.sdk.config.a.a(eVar4.f18446o);
        }
        com.fyber.inneractive.sdk.response.e eVar6 = this.f16131e;
        String str8 = eVar6 == null ? null : eVar6.f18435d;
        String str9 = TextUtils.isEmpty(iAConfigManager.f15025t) ? null : iAConfigManager.f15025t;
        if (this.f16128b == null && this.f16129c == null) {
            IAlog.a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
            return;
        }
        InneractiveAdRequest inneractiveAdRequest3 = this.f16127a;
        if (inneractiveAdRequest3 == null) {
            com.fyber.inneractive.sdk.response.e eVar7 = this.f16131e;
            if (eVar7 != null) {
                spotId = eVar7.C;
            } else {
                str6 = null;
            }
            sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(iAConfigManager.f15017l)) {
                sb2.append(iAConfigManager.f15017l);
                sb2.append("_");
            }
            eVar = this.f16131e;
            if (eVar == null) {
                unitDisplayTypeA = null;
            } else {
                unitDisplayTypeA = eVar.f18447p;
            }
            if (unitDisplayTypeA == null && (inneractiveAdRequest = this.f16127a) != null && inneractiveAdRequest.getSpotId() != null) {
                unitDisplayTypeA = com.fyber.inneractive.sdk.serverapi.b.a(this.f16127a.getSpotId());
            }
            if (unitDisplayTypeA != null) {
                lowerCase = unitDisplayTypeA.name().toLowerCase(Locale.US);
            } else {
                lowerCase = "unknown";
            }
            sb2.append(lowerCase);
            String string = sb2.toString();
            eVar2 = this.f16131e;
            if (eVar2 == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(eVar2.f18438g);
            }
            eVar3 = this.f16131e;
            if (eVar3 == null) {
                str7 = "";
            } else {
                str7 = eVar3.f18439h;
            }
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new v(this, yVar, str8, str9, string, str6, numValueOf, str7));
        }
        spotId = inneractiveAdRequest3.getSpotId();
        str6 = spotId;
        sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(iAConfigManager.f15017l)) {
            sb2.append(iAConfigManager.f15017l);
            sb2.append("_");
        }
        eVar = this.f16131e;
        if (eVar == null) {
            unitDisplayTypeA = null;
        } else {
            unitDisplayTypeA = eVar.f18447p;
        }
        if (unitDisplayTypeA == null) {
            unitDisplayTypeA = com.fyber.inneractive.sdk.serverapi.b.a(this.f16127a.getSpotId());
        }
        if (unitDisplayTypeA != null) {
            lowerCase = unitDisplayTypeA.name().toLowerCase(Locale.US);
        } else {
            lowerCase = "unknown";
        }
        sb2.append(lowerCase);
        String string2 = sb2.toString();
        eVar2 = this.f16131e;
        if (eVar2 == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(eVar2.f18438g);
        }
        eVar3 = this.f16131e;
        if (eVar3 == null) {
            str7 = "";
        } else {
            str7 = eVar3.f18439h;
        }
        com.fyber.inneractive.sdk.util.r.f18606a.execute(new v(this, yVar, str8, str9, string2, str6, numValueOf, str7));
    }

    public w(u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f16129c = uVar;
        this.f16127a = null;
        this.f16130d = null;
    }

    public w(u uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f16129c = uVar;
        this.f16127a = inneractiveAdRequest;
        this.f16130d = null;
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.f16133g = false;
        this.f16131e = eVar;
        this.f16132f = new JSONArray();
    }
}
