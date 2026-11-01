package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidator.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivInputValidator implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47973b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputValidator> f47974c = new bk.p<ParsingEnvironment, JSONObject, DivInputValidator>() { // from class: com.yandex.div2.DivInputValidator$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidator mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputValidator.f47973b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f47975a;

    /* JADX INFO: compiled from: DivInputValidator.kt */
    public static final class b extends DivInputValidator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivInputValidatorExpression f47976d;

        public b(DivInputValidatorExpression divInputValidatorExpression) {
            super(null);
            this.f47976d = divInputValidatorExpression;
        }

        public final DivInputValidatorExpression c() {
            return this.f47976d;
        }
    }

    /* JADX INFO: compiled from: DivInputValidator.kt */
    public static final class c extends DivInputValidator {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivInputValidatorRegex f47977d;

        public c(DivInputValidatorRegex divInputValidatorRegex) {
            super(null);
            this.f47977d = divInputValidatorRegex;
        }

        public final DivInputValidatorRegex c() {
            return this.f47977d;
        }
    }

    public DivInputValidator() {
    }

    public /* synthetic */ DivInputValidator(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivInputValidator.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInputValidator a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().G4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivInputValidator divInputValidator, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divInputValidator == null) {
            return false;
        }
        if (this instanceof c) {
            DivInputValidatorRegex divInputValidatorRegexC = ((c) this).c();
            Object objB = divInputValidator.b();
            return divInputValidatorRegexC.a(objB instanceof DivInputValidatorRegex ? (DivInputValidatorRegex) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivInputValidatorExpression divInputValidatorExpressionC = ((b) this).c();
        Object objB2 = divInputValidator.b();
        return divInputValidatorExpressionC.a(objB2 instanceof DivInputValidatorExpression ? (DivInputValidatorExpression) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f47975a;
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
        this.f47975a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
