package yads;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ch0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom divCustom) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return ck.p.e("mute_button", str);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) throws JSONException {
        Object obj;
        String str;
        Object obj2;
        Context context = div2View.getContext();
        pa3 pa3Var = w82.f84125d.a(context).f84129c;
        JSONObject jSONObject = divCustom.f46873i;
        String str2 = null;
        if (jSONObject != null) {
            obj = jSONObject.get("on_image_url");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        JSONObject jSONObject2 = divCustom.f46873i;
        if (jSONObject2 != null) {
            obj2 = jSONObject2.get("off_image_url");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        z63 z63Var = new z63(context);
        if (str != null) {
            z63Var.setCheckedIcon(new BitmapDrawable(context.getResources(), pa3Var.a(str)));
        }
        if (str2 != null) {
            z63Var.setUncheckedIcon(new BitmapDrawable(context.getResources(), pa3Var.a(str2)));
        }
        return z63Var;
    }
}
