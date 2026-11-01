package oe;

import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFunction;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivVariable;
import com.yandex.div2.DivVisibility;
import com.yandex.div2.DivVisibilityAction;
import java.util.List;

/* JADX INFO: compiled from: DivBase.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface e2 {
    List<DivVisibilityAction> a();

    Expression<Long> b();

    List<DivVariable> c();

    DivEdgeInsets d();

    Expression<Long> e();

    Expression<String> f();

    Expression<DivAlignmentHorizontal> g();

    List<DivBackground> getBackground();

    List<DivExtension> getExtensions();

    DivSize getHeight();

    String getId();

    Expression<DivVisibility> getVisibility();

    DivSize getWidth();

    List<DivTooltip> h();

    DivAppearanceTransition i();

    DivChangeTransition j();

    List<DivDisappearAction> k();

    DivTransform l();

    List<DivTransitionTrigger> m();

    Expression<DivAlignmentVertical> n();

    Expression<Double> o();

    DivFocus p();

    DivAccessibility q();

    DivEdgeInsets r();

    List<DivAction> s();

    DivLayoutProvider t();

    List<DivTrigger> u();

    DivVisibilityAction v();

    List<DivFunction> w();

    DivAppearanceTransition x();

    List<DivAnimator> y();

    DivBorder z();
}
