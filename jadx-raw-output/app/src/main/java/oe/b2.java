package oe;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivCount;
import java.util.List;

/* JADX INFO: compiled from: DivAnimatorBase.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface b2 {
    List<DivAction> a();

    DivCount b();

    Expression<DivAnimationInterpolator> c();

    List<DivAction> d();

    Expression<Long> e();

    Expression<DivAnimationDirection> getDirection();

    Expression<Long> getDuration();

    String getId();
}
