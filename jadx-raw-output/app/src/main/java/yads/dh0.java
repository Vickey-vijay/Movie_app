package yads;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dh0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom divCustom) {
    }

    public static Integer a(DivCustom divCustom, String str) {
        Object objM3458constructorimpl;
        JSONObject jSONObject = divCustom.f46873i;
        String strOptString = jSONObject != null ? jSONObject.optString(str) : null;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Integer.valueOf(Color.parseColor(strOptString)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (Integer) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer numA = a(divCustom, "progress_color");
        if (numA != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(numA.intValue()));
        }
        Integer numA2 = a(divCustom, "background_color");
        if (numA2 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(numA2.intValue()));
        }
        return progressBar;
    }
}
