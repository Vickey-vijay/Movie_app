package com.yandex.div.core.view2.divs;

import android.net.Uri;
import com.yandex.div.core.player.DivVideoResolution;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVideo;
import java.util.ArrayList;
import java.util.List;
import nj.t;

/* JADX INFO: compiled from: DivVideoBinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivVideoBinderKt {
    public static final List<DivVideoSource> createSource(DivVideo divVideo, ExpressionResolver expressionResolver) {
        List<com.yandex.div2.DivVideoSource> list = divVideo.Q;
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        for (com.yandex.div2.DivVideoSource divVideoSource : list) {
            Uri uriEvaluate = divVideoSource.f50038d.evaluate(expressionResolver);
            String strEvaluate = divVideoSource.f50036b.evaluate(expressionResolver);
            com.yandex.div2.DivVideoSource.Resolution resolution = divVideoSource.f50037c;
            Long lEvaluate = null;
            DivVideoResolution divVideoResolution = resolution != null ? new DivVideoResolution((int) resolution.f50043b.evaluate(expressionResolver).longValue(), (int) resolution.f50042a.evaluate(expressionResolver).longValue()) : null;
            Expression<Long> expression = divVideoSource.f50035a;
            if (expression != null) {
                lEvaluate = expression.evaluate(expressionResolver);
            }
            arrayList.add(new DivVideoSource(uriEvaluate, strEvaluate, divVideoResolution, lEvaluate));
        }
        return arrayList;
    }
}
