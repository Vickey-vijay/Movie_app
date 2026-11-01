package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAction.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivAction implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f46027m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Expression<Boolean> f46028n = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivAction> f46029o = new bk.p<ParsingEnvironment, JSONObject, DivAction>() { // from class: com.yandex.div2.DivAction$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAction mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivAction.f46027m.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DivDownloadCallbacks f46030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Boolean> f46031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression<String> f46032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression<Uri> f46033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<MenuItem> f46034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONObject f46035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression<Uri> f46036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression<Target> f46038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DivActionTyped f46039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression<Uri> f46040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f46041l;

    /* JADX INFO: compiled from: DivAction.kt */
    public static final class MenuItem implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f46042e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, MenuItem> f46043f = new bk.p<ParsingEnvironment, JSONObject, MenuItem>() { // from class: com.yandex.div2.DivAction$MenuItem$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivAction.MenuItem mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivAction.MenuItem.f46042e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DivAction f46044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<DivAction> f46045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression<String> f46046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f46047d;

        public final boolean a(MenuItem menuItem, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean zA;
            boolean z10;
            if (menuItem == null) {
                return false;
            }
            DivAction divAction = this.f46044a;
            if (divAction != null) {
                zA = divAction.a(menuItem.f46044a, expressionResolver, expressionResolver2);
            } else {
                zA = menuItem.f46044a == null;
            }
            if (!zA) {
                return false;
            }
            List<DivAction> list = this.f46045b;
            if (list != null) {
                List<DivAction> list2 = menuItem.f46045b;
                if (list2 == null) {
                    return false;
                }
                if (list.size() == list2.size()) {
                    Iterator<T> it = list.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                nj.s.u();
                            }
                            if (((DivAction) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                                i10 = i11;
                            }
                        }
                    }
                }
            } else {
                z10 = menuItem.f46045b == null;
            }
            return z10 && ck.p.e(this.f46046c.evaluate(expressionResolver), menuItem.f46046c.evaluate(expressionResolver2));
        }

        /* JADX INFO: compiled from: DivAction.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final MenuItem a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().x0().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f46047d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(MenuItem.class).hashCode();
            DivAction divAction = this.f46044a;
            int iHash = 0;
            int iHash2 = iHashCode + (divAction != null ? divAction.hash() : 0);
            List<DivAction> list = this.f46045b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((DivAction) it.next()).hash();
                }
            }
            int iHashCode2 = iHash2 + iHash + this.f46046c.hashCode();
            this.f46047d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        public MenuItem(DivAction divAction, List<DivAction> list, Expression<String> expression) {
            this.f46044a = divAction;
            this.f46045b = list;
            this.f46046c = expression;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().x0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivAction.kt */
    public enum Target {
        SELF("_self"),
        BLANK("_blank");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Target, String> TO_STRING = new bk.l<Target, String>() { // from class: com.yandex.div2.DivAction$Target$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivAction.Target target) {
                return DivAction.Target.Converter.b(target);
            }
        };
        public static final bk.l<String, Target> FROM_STRING = new bk.l<String, Target>() { // from class: com.yandex.div2.DivAction$Target$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivAction.Target invoke(String str) {
                return DivAction.Target.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivAction.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Target a(String str) {
                Target target = Target.SELF;
                if (ck.p.e(str, target.value)) {
                    return target;
                }
                Target target2 = Target.BLANK;
                if (ck.p.e(str, target2.value)) {
                    return target2;
                }
                return null;
            }

            public final String b(Target target) {
                return target.value;
            }
        }

        Target(String str) {
            this.value = str;
        }
    }

    public final boolean a(DivAction divAction, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean zA;
        boolean z10;
        boolean zA2;
        if (divAction == null) {
            return false;
        }
        DivDownloadCallbacks divDownloadCallbacks = this.f46030a;
        if (divDownloadCallbacks != null) {
            zA = divDownloadCallbacks.a(divAction.f46030a, expressionResolver, expressionResolver2);
        } else {
            zA = divAction.f46030a == null;
        }
        if (!zA || this.f46031b.evaluate(expressionResolver).booleanValue() != divAction.f46031b.evaluate(expressionResolver2).booleanValue() || !ck.p.e(this.f46032c.evaluate(expressionResolver), divAction.f46032c.evaluate(expressionResolver2))) {
            return false;
        }
        Expression<Uri> expression = this.f46033d;
        Uri uriEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Uri> expression2 = divAction.f46033d;
        if (!ck.p.e(uriEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        List<MenuItem> list = this.f46034e;
        if (list != null) {
            List<MenuItem> list2 = divAction.f46034e;
            if (list2 == null) {
                return false;
            }
            if (list.size() == list2.size()) {
                Iterator<T> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            nj.s.u();
                        }
                        if (((MenuItem) next).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            z10 = divAction.f46034e == null;
        }
        if (!z10 || !ck.p.e(this.f46035f, divAction.f46035f)) {
            return false;
        }
        Expression<Uri> expression3 = this.f46036g;
        Uri uriEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
        Expression<Uri> expression4 = divAction.f46036g;
        if (!ck.p.e(uriEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver2) : null) || !ck.p.e(this.f46037h, divAction.f46037h)) {
            return false;
        }
        Expression<Target> expression5 = this.f46038i;
        Target targetEvaluate = expression5 != null ? expression5.evaluate(expressionResolver) : null;
        Expression<Target> expression6 = divAction.f46038i;
        if (targetEvaluate != (expression6 != null ? expression6.evaluate(expressionResolver2) : null)) {
            return false;
        }
        DivActionTyped divActionTyped = this.f46039j;
        if (divActionTyped != null) {
            zA2 = divActionTyped.a(divAction.f46039j, expressionResolver, expressionResolver2);
        } else {
            zA2 = divAction.f46039j == null;
        }
        if (!zA2) {
            return false;
        }
        Expression<Uri> expression7 = this.f46040k;
        Uri uriEvaluate3 = expression7 != null ? expression7.evaluate(expressionResolver) : null;
        Expression<Uri> expression8 = divAction.f46040k;
        return ck.p.e(uriEvaluate3, expression8 != null ? expression8.evaluate(expressionResolver2) : null);
    }

    /* JADX INFO: compiled from: DivAction.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAction a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().u0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f46041l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivAction.class).hashCode();
        DivDownloadCallbacks divDownloadCallbacks = this.f46030a;
        int iHash2 = iHashCode + (divDownloadCallbacks != null ? divDownloadCallbacks.hash() : 0) + this.f46031b.hashCode() + this.f46032c.hashCode();
        Expression<Uri> expression = this.f46033d;
        int iHashCode2 = iHash2 + (expression != null ? expression.hashCode() : 0);
        List<MenuItem> list = this.f46034e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((MenuItem) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode2 + iHash;
        JSONObject jSONObject = this.f46035f;
        int iHashCode3 = i10 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression<Uri> expression2 = this.f46036g;
        int iHashCode4 = iHashCode3 + (expression2 != null ? expression2.hashCode() : 0);
        String str = this.f46037h;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        Expression<Target> expression3 = this.f46038i;
        int iHashCode6 = iHashCode5 + (expression3 != null ? expression3.hashCode() : 0);
        DivActionTyped divActionTyped = this.f46039j;
        int iHash3 = iHashCode6 + (divActionTyped != null ? divActionTyped.hash() : 0);
        Expression<Uri> expression4 = this.f46040k;
        int iHashCode7 = iHash3 + (expression4 != null ? expression4.hashCode() : 0);
        this.f46041l = Integer.valueOf(iHashCode7);
        return iHashCode7;
    }

    public DivAction(DivDownloadCallbacks divDownloadCallbacks, Expression<Boolean> expression, Expression<String> expression2, Expression<Uri> expression3, List<MenuItem> list, JSONObject jSONObject, Expression<Uri> expression4, String str, Expression<Target> expression5, DivActionTyped divActionTyped, Expression<Uri> expression6) {
        this.f46030a = divDownloadCallbacks;
        this.f46031b = expression;
        this.f46032c = expression2;
        this.f46033d = expression3;
        this.f46034e = list;
        this.f46035f = jSONObject;
        this.f46036g = expression4;
        this.f46037h = str;
        this.f46038i = expression5;
        this.f46039j = divActionTyped;
        this.f46040k = expression6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().u0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
