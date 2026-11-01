package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import oe.f6;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputMask.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivInputMask implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47908b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputMask> f47909c = new bk.p<ParsingEnvironment, JSONObject, DivInputMask>() { // from class: com.yandex.div2.DivInputMask$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputMask mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputMask.f47908b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f47910a;

    /* JADX INFO: compiled from: DivInputMask.kt */
    public static final class b extends DivInputMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivCurrencyInputMask f47911d;

        public b(DivCurrencyInputMask divCurrencyInputMask) {
            super(null);
            this.f47911d = divCurrencyInputMask;
        }

        public final DivCurrencyInputMask c() {
            return this.f47911d;
        }
    }

    /* JADX INFO: compiled from: DivInputMask.kt */
    public static final class c extends DivInputMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivFixedLengthInputMask f47912d;

        public c(DivFixedLengthInputMask divFixedLengthInputMask) {
            super(null);
            this.f47912d = divFixedLengthInputMask;
        }

        public final DivFixedLengthInputMask c() {
            return this.f47912d;
        }
    }

    /* JADX INFO: compiled from: DivInputMask.kt */
    public static final class d extends DivInputMask {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivPhoneInputMask f47913d;

        public d(DivPhoneInputMask divPhoneInputMask) {
            super(null);
            this.f47913d = divPhoneInputMask;
        }

        public final DivPhoneInputMask c() {
            return this.f47913d;
        }
    }

    public DivInputMask() {
    }

    public /* synthetic */ DivInputMask(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivInputMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivInputMask a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().v4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivInputMask divInputMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divInputMask == null) {
            return false;
        }
        if (this instanceof c) {
            DivFixedLengthInputMask divFixedLengthInputMaskC = ((c) this).c();
            f6 f6VarB = divInputMask.b();
            return divFixedLengthInputMaskC.b(f6VarB instanceof DivFixedLengthInputMask ? (DivFixedLengthInputMask) f6VarB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivCurrencyInputMask divCurrencyInputMaskC = ((b) this).c();
            f6 f6VarB2 = divInputMask.b();
            return divCurrencyInputMaskC.b(f6VarB2 instanceof DivCurrencyInputMask ? (DivCurrencyInputMask) f6VarB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        DivPhoneInputMask divPhoneInputMaskC = ((d) this).c();
        f6 f6VarB3 = divInputMask.b();
        return divPhoneInputMaskC.b(f6VarB3 instanceof DivPhoneInputMask ? (DivPhoneInputMask) f6VarB3 : null, expressionResolver, expressionResolver2);
    }

    public final f6 b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f47910a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f47910a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
