package io.bidmachine.rendering.measurer;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class CompositeHtmlMeasurer extends BaseCompositeMeasurer<HtmlMeasurer, WebView> implements HtmlMeasurer {
    public CompositeHtmlMeasurer(@NonNull List<HtmlMeasurer> list) {
        super(list);
    }

    @Override // io.bidmachine.rendering.measurer.HtmlMeasurer
    @NonNull
    public String prepareCreativeForMeasure(@NonNull String str) {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            str = ((HtmlMeasurer) it.next()).prepareCreativeForMeasure(str);
        }
        return str;
    }
}
