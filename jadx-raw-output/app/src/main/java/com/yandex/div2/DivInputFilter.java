package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilter.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivInputFilter implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47856b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputFilter> f47857c = new bk.p<ParsingEnvironment, JSONObject, DivInputFilter>() { // from class: com.yandex.div2.DivInputFilter$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilter mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputFilter.f47856b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f47858a;

    /* JADX INFO: compiled from: DivInputFilter.kt */
    public static final class b extends DivInputFilter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivInputFilterExpression f47859d;

        public b(DivInputFilterExpression divInputFilterExpression) {
            super(null);
            this.f47859d = divInputFilterExpression;
        }

        public final DivInputFilterExpression c() {
            return this.f47859d;
        }
    }

    /* JADX INFO: compiled from: DivInputFilter.kt */
    public static final class c extends DivInputFilter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivInputFilterRegex f47860d;

        public c(DivInputFilterRegex divInputFilterRegex) {
            super(null);
            this.f47860d = divInputFilterRegex;
        }

        public final DivInputFilterRegex c() {
            return this.f47860d;
        }
    }

    public DivInputFilter() {
    }

    public /* synthetic */ DivInputFilter(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivInputFilter.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInputFilter a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().m4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivInputFilter divInputFilter, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divInputFilter == null) {
            return false;
        }
        if (this instanceof c) {
            DivInputFilterRegex divInputFilterRegexC = ((c) this).c();
            Object objB = divInputFilter.b();
            return divInputFilterRegexC.a(objB instanceof DivInputFilterRegex ? (DivInputFilterRegex) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivInputFilterExpression divInputFilterExpressionC = ((b) this).c();
        Object objB2 = divInputFilter.b();
        return divInputFilterExpressionC.a(objB2 instanceof DivInputFilterExpression ? (DivInputFilterExpression) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f47858a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((b) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f47858a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().m4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
