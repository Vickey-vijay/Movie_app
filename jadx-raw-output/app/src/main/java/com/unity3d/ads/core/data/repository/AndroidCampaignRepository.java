package com.unity3d.ads.core.data.repository;

import ck.p;
import com.google.protobuf.ByteString;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import mj.h;
import mj.r;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: AndroidCampaignRepository.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidCampaignRepository implements CampaignRepository {
    private final l<Map<String, CampaignStateOuterClass.Campaign>> campaigns;
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(GetSharedDataTimestamps getSharedDataTimestamps) {
        p.j(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = v.a(kotlin.collections.a.j());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.Campaign getCampaign(ByteString byteString) {
        p.j(byteString, "opportunityId");
        return this.campaigns.getValue().get(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection<CampaignStateOuterClass.Campaign> collectionValues = this.campaigns.getValue().values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.Companion;
        CampaignStateOuterClass.CampaignState.Builder builderNewBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        CampaignStateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.addAllShownCampaigns(dsl_create.getShownCampaigns(), list);
        dsl_create.addAllLoadedCampaigns(dsl_create.getLoadedCampaigns(), list2);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(ByteString byteString) {
        Map<String, CampaignStateOuterClass.Campaign> value;
        String stringUtf8;
        p.j(byteString, "opportunityId");
        l<Map<String, CampaignStateOuterClass.Campaign>> lVar = this.campaigns;
        do {
            value = lVar.getValue();
            stringUtf8 = byteString.toStringUtf8();
            p.i(stringUtf8, "opportunityId.toStringUtf8()");
        } while (!lVar.a(value, kotlin.collections.a.n(value, stringUtf8)));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(ByteString byteString, CampaignStateOuterClass.Campaign campaign) {
        Map<String, CampaignStateOuterClass.Campaign> value;
        p.j(byteString, "opportunityId");
        p.j(campaign, MBInterstitialActivity.INTENT_CAMAPIGN);
        l<Map<String, CampaignStateOuterClass.Campaign>> lVar = this.campaigns;
        do {
            value = lVar.getValue();
        } while (!lVar.a(value, kotlin.collections.a.r(value, h.a(byteString.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(ByteString byteString) {
        p.j(byteString, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            p.i(builder, "this.toBuilder()");
            CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            r rVar = r.f64562a;
            setCampaign(byteString, dsl_create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(ByteString byteString) {
        p.j(byteString, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(byteString);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            p.i(builder, "this.toBuilder()");
            CampaignKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            r rVar = r.f64562a;
            setCampaign(byteString, dsl_create._build());
        }
    }
}
