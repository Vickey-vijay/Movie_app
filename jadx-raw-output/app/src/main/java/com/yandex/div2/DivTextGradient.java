package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextGradient.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivTextGradient implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49567b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextGradient> f49568c = new bk.p<ParsingEnvironment, JSONObject, DivTextGradient>() { // from class: com.yandex.div2.DivTextGradient$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextGradient mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTextGradient.f49567b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49569a;

    /* JADX INFO: compiled from: DivTextGradient.kt */
    public static final class b extends DivTextGradient {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivLinearGradient f49570d;

        public b(DivLinearGradient divLinearGradient) {
            super(null);
            this.f49570d = divLinearGradient;
        }

        public final DivLinearGradient c() {
            return this.f49570d;
        }
    }

    /* JADX INFO: compiled from: DivTextGradient.kt */
    public static final class c extends DivTextGradient {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivRadialGradient f49571d;

        public c(DivRadialGradient divRadialGradient) {
            super(null);
            this.f49571d = divRadialGradient;
        }

        public final DivRadialGradient c() {
            return this.f49571d;
        }
    }

    public DivTextGradient() {
    }

    public /* synthetic */ DivTextGradient(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivTextGradient.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTextGradient a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().g8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivTextGradient divTextGradient, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divTextGradient == null) {
            return false;
        }
        if (this instanceof b) {
            DivLinearGradient divLinearGradientC = ((b) this).c();
            Object objB = divTextGradient.b();
            return divLinearGradientC.a(objB instanceof DivLinearGradient ? (DivLinearGradient) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradient divRadialGradientC = ((c) this).c();
        Object objB2 = divTextGradient.b();
        return divRadialGradientC.a(objB2 instanceof DivRadialGradient ? (DivRadialGradient) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f49569a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(getClass()).hashCode();
        if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f49569a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().g8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
