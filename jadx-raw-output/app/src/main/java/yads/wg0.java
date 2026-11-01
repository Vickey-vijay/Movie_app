package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wg0 {
    public static final ny2 a(Div2View div2View) {
        ny2 ny2Var;
        DivActionHandler actionHandler = div2View.getActionHandler();
        if (actionHandler instanceof ny2) {
            ny2Var = (ny2) actionHandler;
        } else {
            ny2Var = null;
        }
        if (ny2Var == null) {
            ny2 ny2Var2 = new ny2(new qu());
            div2View.setActionHandler(ny2Var2);
            return ny2Var2;
        }
        return ny2Var;
    }
}
