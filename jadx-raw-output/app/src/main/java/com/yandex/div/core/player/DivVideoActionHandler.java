package com.yandex.div.core.player;

import ck.i;
import ck.p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivData;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivVideo;
import java.util.Iterator;
import java.util.List;
import oe.e2;

/* JADX INFO: compiled from: DivVideoActionHandler.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivVideoActionHandler {
    public static final Companion Companion = new Companion(null);
    private final DivVideoViewMapper videoViewMapper;

    /* JADX INFO: compiled from: DivVideoActionHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final DivVideo findDivVideoWithId(e2 e2Var, String str, ExpressionResolver expressionResolver) {
        e2 e2VarB;
        DivVideo divVideoFindDivVideoWithId;
        if (e2Var instanceof DivVideo) {
            if (p.e(e2Var.getId(), str)) {
                return (DivVideo) e2Var;
            }
            return null;
        }
        if (e2Var instanceof DivGallery) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems((DivGallery) e2Var, expressionResolver)) {
                DivVideo divVideoFindDivVideoWithId2 = findDivVideoWithId(divItemBuilderResult.component1().b(), str, divItemBuilderResult.component2());
                if (divVideoFindDivVideoWithId2 != null) {
                    return divVideoFindDivVideoWithId2;
                }
            }
            return null;
        }
        if (e2Var instanceof DivContainer) {
            for (DivItemBuilderResult divItemBuilderResult2 : DivCollectionExtensionsKt.buildItems((DivContainer) e2Var, expressionResolver)) {
                DivVideo divVideoFindDivVideoWithId3 = findDivVideoWithId(divItemBuilderResult2.component1().b(), str, divItemBuilderResult2.component2());
                if (divVideoFindDivVideoWithId3 != null) {
                    return divVideoFindDivVideoWithId3;
                }
            }
            return null;
        }
        if (e2Var instanceof DivGrid) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems((DivGrid) e2Var).iterator();
            while (it.hasNext()) {
                DivVideo divVideoFindDivVideoWithId4 = findDivVideoWithId(((Div) it.next()).b(), str, expressionResolver);
                if (divVideoFindDivVideoWithId4 != null) {
                    return divVideoFindDivVideoWithId4;
                }
            }
            return null;
        }
        if (e2Var instanceof DivPager) {
            for (DivItemBuilderResult divItemBuilderResult3 : DivCollectionExtensionsKt.buildItems((DivPager) e2Var, expressionResolver)) {
                DivVideo divVideoFindDivVideoWithId5 = findDivVideoWithId(divItemBuilderResult3.component1().b(), str, divItemBuilderResult3.component2());
                if (divVideoFindDivVideoWithId5 != null) {
                    return divVideoFindDivVideoWithId5;
                }
            }
            return null;
        }
        if (e2Var instanceof DivTabs) {
            Iterator<T> it2 = ((DivTabs) e2Var).f49264q.iterator();
            while (it2.hasNext()) {
                DivVideo divVideoFindDivVideoWithId6 = findDivVideoWithId(((DivTabs.Item) it2.next()).f49276a.b(), str, expressionResolver);
                if (divVideoFindDivVideoWithId6 != null) {
                    return divVideoFindDivVideoWithId6;
                }
            }
            return null;
        }
        if (e2Var instanceof DivCustom) {
            List<Div> list = ((DivCustom) e2Var).f46881q;
            if (list != null) {
                Iterator<T> it3 = list.iterator();
                while (it3.hasNext()) {
                    DivVideo divVideoFindDivVideoWithId7 = findDivVideoWithId(((Div) it3.next()).b(), str, expressionResolver);
                    if (divVideoFindDivVideoWithId7 != null) {
                        return divVideoFindDivVideoWithId7;
                    }
                }
            }
            return null;
        }
        if (e2Var instanceof DivState) {
            Iterator<T> it4 = ((DivState) e2Var).I.iterator();
            while (it4.hasNext()) {
                Div div = ((DivState.State) it4.next()).f49049c;
                if (div != null && (e2VarB = div.b()) != null && (divVideoFindDivVideoWithId = findDivVideoWithId(e2VarB, str, expressionResolver)) != null) {
                    return divVideoFindDivVideoWithId;
                }
            }
        }
        return null;
    }

    private final DivVideo searchDivDataForVideo(DivData divData, String str, ExpressionResolver expressionResolver) {
        Iterator<T> it = divData.f46937c.iterator();
        while (it.hasNext()) {
            DivVideo divVideoFindDivVideoWithId = findDivVideoWithId(((DivData.State) it.next()).f46946a.b(), str, expressionResolver);
            if (divVideoFindDivVideoWithId != null) {
                return divVideoFindDivVideoWithId;
            }
        }
        return null;
    }

    public DivVideoActionHandler(DivVideoViewMapper divVideoViewMapper) {
        this.videoViewMapper = divVideoViewMapper;
    }

    public final boolean handleAction(Div2View div2View, String str, String str2, ExpressionResolver expressionResolver) {
        DivVideo divVideoSearchDivDataForVideo;
        DivPlayer player;
        DivData divData = div2View.getDivData();
        if (divData == null || (divVideoSearchDivDataForVideo = searchDivDataForVideo(divData, str, expressionResolver)) == null || (player = this.videoViewMapper.getPlayer(divVideoSearchDivDataForVideo)) == null) {
            return false;
        }
        if (p.e(str2, "start")) {
            player.play();
            return true;
        }
        if (p.e(str2, CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
            player.pause();
            return true;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("No such video action: " + str2);
        }
        return false;
    }
}
