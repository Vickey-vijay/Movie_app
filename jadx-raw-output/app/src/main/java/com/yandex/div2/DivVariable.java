package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVariable.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivVariable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f49954b = new d(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivVariable> f49955c = new bk.p<ParsingEnvironment, JSONObject, DivVariable>() { // from class: com.yandex.div2.DivVariable$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivVariable mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivVariable.f49954b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49956a;

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class a extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayVariable f49957d;

        public a(ArrayVariable arrayVariable) {
            super(null);
            this.f49957d = arrayVariable;
        }

        public final ArrayVariable c() {
            return this.f49957d;
        }
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class b extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BoolVariable f49958d;

        public b(BoolVariable boolVariable) {
            super(null);
            this.f49958d = boolVariable;
        }

        public final BoolVariable c() {
            return this.f49958d;
        }
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class c extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ColorVariable f49959d;

        public c(ColorVariable colorVariable) {
            super(null);
            this.f49959d = colorVariable;
        }

        public final ColorVariable c() {
            return this.f49959d;
        }
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class e extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DictVariable f49960d;

        public e(DictVariable dictVariable) {
            super(null);
            this.f49960d = dictVariable;
        }

        public final DictVariable c() {
            return this.f49960d;
        }
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class f extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final IntegerVariable f49961d;

        public f(IntegerVariable integerVariable) {
            super(null);
            this.f49961d = integerVariable;
        }

        public final IntegerVariable c() {
            return this.f49961d;
        }
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class g extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final NumberVariable f49962d;

        public g(NumberVariable numberVariable) {
            super(null);
            this.f49962d = numberVariable;
        }

        public final NumberVariable c() {
            return this.f49962d;
        }
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class h extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final PropertyVariable f49963d;

        public h(PropertyVariable propertyVariable) {
            super(null);
            this.f49963d = propertyVariable;
        }

        public final PropertyVariable c() {
            return this.f49963d;
        }
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class i extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final StrVariable f49964d;

        public i(StrVariable strVariable) {
            super(null);
            this.f49964d = strVariable;
        }

        public final StrVariable c() {
            return this.f49964d;
        }
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class j extends DivVariable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UrlVariable f49965d;

        public j(UrlVariable urlVariable) {
            super(null);
            this.f49965d = urlVariable;
        }

        public final UrlVariable c() {
            return this.f49965d;
        }
    }

    public DivVariable() {
    }

    public /* synthetic */ DivVariable(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivVariable.kt */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(ck.i iVar) {
            this();
        }

        public final DivVariable a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().k9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivVariable divVariable, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divVariable == null) {
            return false;
        }
        if (this instanceof i) {
            StrVariable strVariableC = ((i) this).c();
            Object objB = divVariable.b();
            return strVariableC.a(objB instanceof StrVariable ? (StrVariable) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof g) {
            NumberVariable numberVariableC = ((g) this).c();
            Object objB2 = divVariable.b();
            return numberVariableC.a(objB2 instanceof NumberVariable ? (NumberVariable) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            IntegerVariable integerVariableC = ((f) this).c();
            Object objB3 = divVariable.b();
            return integerVariableC.a(objB3 instanceof IntegerVariable ? (IntegerVariable) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            BoolVariable boolVariableC = ((b) this).c();
            Object objB4 = divVariable.b();
            return boolVariableC.a(objB4 instanceof BoolVariable ? (BoolVariable) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            ColorVariable colorVariableC = ((c) this).c();
            Object objB5 = divVariable.b();
            return colorVariableC.a(objB5 instanceof ColorVariable ? (ColorVariable) objB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof j) {
            UrlVariable urlVariableC = ((j) this).c();
            Object objB6 = divVariable.b();
            return urlVariableC.a(objB6 instanceof UrlVariable ? (UrlVariable) objB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            DictVariable dictVariableC = ((e) this).c();
            Object objB7 = divVariable.b();
            return dictVariableC.a(objB7 instanceof DictVariable ? (DictVariable) objB7 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof a) {
            ArrayVariable arrayVariableC = ((a) this).c();
            Object objB8 = divVariable.b();
            return arrayVariableC.a(objB8 instanceof ArrayVariable ? (ArrayVariable) objB8 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof h)) {
            throw new NoWhenBranchMatchedException();
        }
        PropertyVariable propertyVariableC = ((h) this).c();
        Object objB9 = divVariable.b();
        return propertyVariableC.a(objB9 instanceof PropertyVariable ? (PropertyVariable) objB9 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f49956a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof i) {
            iHash = ((i) this).c().hash();
        } else if (this instanceof g) {
            iHash = ((g) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof j) {
            iHash = ((j) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else {
            if (!(this instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((h) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f49956a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
