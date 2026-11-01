package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRadius.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivRadialGradientRadius implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48467b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRadius> f48468c = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRadius>() { // from class: com.yandex.div2.DivRadialGradientRadius$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRadius mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivRadialGradientRadius.f48467b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f48469a;

    /* JADX INFO: compiled from: DivRadialGradientRadius.kt */
    public static final class b extends DivRadialGradientRadius {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivFixedSize f48470d;

        public b(DivFixedSize divFixedSize) {
            super(null);
            this.f48470d = divFixedSize;
        }

        public final DivFixedSize c() {
            return this.f48470d;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRadius.kt */
    public static final class c extends DivRadialGradientRadius {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DivRadialGradientRelativeRadius f48471d;

        public c(DivRadialGradientRelativeRadius divRadialGradientRelativeRadius) {
            super(null);
            this.f48471d = divRadialGradientRelativeRadius;
        }

        public final DivRadialGradientRelativeRadius c() {
            return this.f48471d;
        }
    }

    public DivRadialGradientRadius() {
    }

    public /* synthetic */ DivRadialGradientRadius(ck.i iVar) {
        this();
    }

    /* JADX INFO: compiled from: DivRadialGradientRadius.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivRadialGradientRadius a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().o6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public final boolean a(DivRadialGradientRadius divRadialGradientRadius, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divRadialGradientRadius == null) {
            return false;
        }
        if (this instanceof b) {
            DivFixedSize divFixedSizeC = ((b) this).c();
            Object objB = divRadialGradientRadius.b();
            return divFixedSizeC.a(objB instanceof DivFixedSize ? (DivFixedSize) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        DivRadialGradientRelativeRadius divRadialGradientRelativeRadiusC = ((c) this).c();
        Object objB2 = divRadialGradientRadius.b();
        return divRadialGradientRelativeRadiusC.a(objB2 instanceof DivRadialGradientRelativeRadius ? (DivRadialGradientRelativeRadius) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f48469a;
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
        this.f48469a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
