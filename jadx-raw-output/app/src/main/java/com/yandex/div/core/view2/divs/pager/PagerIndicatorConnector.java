package com.yandex.div.core.view2.divs.pager;

import ck.p;
import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div2.DivPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PagerIndicatorConnector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PagerIndicatorConnector {
    private final Map<DivPager, DivPagerView> pagers = new LinkedHashMap();
    private final List<IndicatorData> indicators = new ArrayList();

    /* JADX INFO: compiled from: PagerIndicatorConnector.kt */
    public static final class IndicatorData {
        private final DivPagerIndicatorView indicator;
        private final DivPager pagerDiv;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndicatorData)) {
                return false;
            }
            IndicatorData indicatorData = (IndicatorData) obj;
            return p.e(this.indicator, indicatorData.indicator) && p.e(this.pagerDiv, indicatorData.pagerDiv);
        }

        public int hashCode() {
            return (this.indicator.hashCode() * 31) + this.pagerDiv.hashCode();
        }

        public String toString() {
            return "IndicatorData(indicator=" + this.indicator + ", pagerDiv=" + this.pagerDiv + ')';
        }

        public final DivPagerIndicatorView getIndicator() {
            return this.indicator;
        }

        public final DivPager getPagerDiv() {
            return this.pagerDiv;
        }

        public IndicatorData(DivPagerIndicatorView divPagerIndicatorView, DivPager divPager) {
            this.indicator = divPagerIndicatorView;
            this.pagerDiv = divPager;
        }
    }

    public final void attach$div_release() {
        Iterator<Map.Entry<DivPager, DivPagerView>> it = this.pagers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clearChangePageCallbackForIndicators();
        }
        for (IndicatorData indicatorData : this.indicators) {
            DivPagerView divPagerView = this.pagers.get(indicatorData.getPagerDiv());
            if (divPagerView != null) {
                indicatorData.getIndicator().attachPager(divPagerView);
            }
        }
        this.pagers.clear();
        this.indicators.clear();
    }

    public final void submitIndicator$div_release(DivPagerIndicatorView divPagerIndicatorView, DivPager divPager) {
        this.indicators.add(new IndicatorData(divPagerIndicatorView, divPager));
    }

    public final void submitPager$div_release(DivPagerView divPagerView, DivPager divPager) {
        this.pagers.put(divPager, divPagerView);
    }
}
